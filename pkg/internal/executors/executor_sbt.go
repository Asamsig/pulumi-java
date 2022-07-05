// Copyright 2022, Pulumi Corporation.  All rights reserved.

package executors

import (
	"strings"

	"github.com/pulumi/pulumi/sdk/v3/go/common/util/logging"

	"github.com/pulumi/pulumi-java/pkg/internal/fsys"
)

type sbt struct{}

var _ javaExecutorFactory = &sbt{}

func (s sbt) NewJavaExecutor(opts JavaExecutorOptions) (*JavaExecutor, error) {
	ok, err := s.isSbtProject(opts)
	if err != nil {
		return nil, err
	}
	if !ok {
		return nil, nil
	}
	probePaths := []string{opts.UseExecutor}
	if opts.UseExecutor == "" {
		probePaths = []string{"sbt"}
	}
	cmd, err := fsys.LookPath(opts.WD, probePaths...)
	if err != nil {
		return nil, err
	}
	executor, err := s.newSbtExecutor(cmd)
	if err != nil {
		return nil, err
	}

	logging.V(3).Infof(`Detected SBT Java executor:
            Cmd:        %s
            Dir:        %s
            RunArgs:    %s
            PluginArgs: %s
            BuildArgs:  %s`,
		executor.Cmd,
		executor.Dir,
		strings.Join(executor.RunArgs, " "),
		strings.Join(executor.PluginArgs, " "),
		strings.Join(executor.BuildArgs, " "))
	return executor, err
}

func (sbt) isSbtProject(opts JavaExecutorOptions) (bool, error) {
	if strings.Contains(opts.UseExecutor, "sbt") {
		return true, nil
	}
	return fsys.FileExists(opts.WD, "build.sbt")
}

func (sbt) newSbtExecutor(cmd string) (*JavaExecutor, error) {
	return &JavaExecutor{
		Cmd:       cmd,
		BuildArgs: []string{"--no-transfer-progress", "compile"},
		RunArgs:   []string{"--no-transfer-progress", "compile", "exec:java"},
		PluginArgs: []string{
			/* move normal output to STDERR, because we need STDOUT for JSON with plugin results */
			"-Dorg.slf4j.simpleLogger.logFile=System.err",
			"--no-transfer-progress", "assembly", "exec:java",
			"-DmainClass=com.pulumi.bootstrap.internal.Main",
			"-DmainArgs=packages",
		},
	}, nil
}
