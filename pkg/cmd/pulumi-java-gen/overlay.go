// Copyright 2016-2022, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package main

import (
	"bytes"
	"fmt"
	"io/fs"
	"io/ioutil"
	"path/filepath"
	"strings"
	"text/template"
)

type OverlayTemplateConfig struct {
	ArtifactID     string
	VersionEnvVar  string
	DefaultVersion string
}

type OverlayTemplateData struct {
	ArtifactID      string
	DefaultVersion  string
	TemplateComment string
	VersionEnvVar   string
}

const templateComment = `*** WARNING: this file was generated from an overlay template %s, do not edit. ***`

func readOverlays(rootDir string, overlays []string, cfg OverlayTemplateConfig) (map[string][]byte, error) {
	result := map[string][]byte{}
	for _, overlay := range overlays {
		overlayDir := filepath.Join(rootDir, overlay)
		err := filepath.WalkDir(overlayDir, func(path string, entry fs.DirEntry, err error) error {
			if err != nil {
				return err
			}
			if !entry.IsDir() {
				sourcePath := filepath.Join(overlayDir, entry.Name())
				bytes, err := ioutil.ReadFile(sourcePath)
				if err != nil {
					return err
				}
				if isOverlayTemplate(bytes) {
					data := OverlayTemplateData{
						ArtifactID:      cfg.ArtifactID,
						DefaultVersion:  cfg.DefaultVersion,
						TemplateComment: fmt.Sprintf(templateComment, entry.Name()),
						VersionEnvVar:   cfg.VersionEnvVar,
					}
					bytes, err = expandOverlayTemplate(data, bytes)
					if err != nil {
						return err
					}
				}
				result[entry.Name()] = bytes
			}
			return err
		})
		if err != nil {
			return nil, err
		}
	}
	return result, nil
}

func isOverlayTemplate(bytes []byte) bool {
	return strings.Contains(string(bytes), ".ArtifactID")
}

func expandOverlayTemplate(
	data OverlayTemplateData,
	templateBytes []byte,
) ([]byte, error) {
	tmpl, err := template.New("OverlayTemplate").Parse(string(templateBytes))
	if err != nil {
		return nil, err
	}
	var out bytes.Buffer
	if err := tmpl.Execute(&out, data); err != nil {
		return nil, err
	}
	return out.Bytes(), nil
}
