// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.enums.CisBenchmarkSeverity;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A compliance check that is a CIS benchmark.
 * 
 */
public final class CisBenchmarkArgs extends com.pulumi.resources.ResourceArgs {

    public static final CisBenchmarkArgs Empty = new CisBenchmarkArgs();

    @Import(name="profileLevel")
    private @Nullable Output<Integer> profileLevel;

    public Optional<Output<Integer>> profileLevel() {
        return Optional.ofNullable(this.profileLevel);
    }

    @Import(name="severity")
    private @Nullable Output<CisBenchmarkSeverity> severity;

    public Optional<Output<CisBenchmarkSeverity>> severity() {
        return Optional.ofNullable(this.severity);
    }

    private CisBenchmarkArgs() {}

    private CisBenchmarkArgs(CisBenchmarkArgs $) {
        this.profileLevel = $.profileLevel;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CisBenchmarkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CisBenchmarkArgs $;

        public Builder() {
            $ = new CisBenchmarkArgs();
        }

        public Builder(CisBenchmarkArgs defaults) {
            $ = new CisBenchmarkArgs(Objects.requireNonNull(defaults));
        }

        public Builder profileLevel(@Nullable Output<Integer> profileLevel) {
            $.profileLevel = profileLevel;
            return this;
        }

        public Builder profileLevel(Integer profileLevel) {
            return profileLevel(Output.of(profileLevel));
        }

        public Builder severity(@Nullable Output<CisBenchmarkSeverity> severity) {
            $.severity = severity;
            return this;
        }

        public Builder severity(CisBenchmarkSeverity severity) {
            return severity(Output.of(severity));
        }

        public CisBenchmarkArgs build() {
            return $;
        }
    }

}
