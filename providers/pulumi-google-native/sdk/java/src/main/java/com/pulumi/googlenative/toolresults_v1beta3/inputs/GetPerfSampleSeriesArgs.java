// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPerfSampleSeriesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPerfSampleSeriesArgs Empty = new GetPerfSampleSeriesArgs();

    @Import(name="executionId", required=true)
    private Output<String> executionId;

    public Output<String> executionId() {
        return this.executionId;
    }

    @Import(name="historyId", required=true)
    private Output<String> historyId;

    public Output<String> historyId() {
        return this.historyId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sampleSeriesId", required=true)
    private Output<String> sampleSeriesId;

    public Output<String> sampleSeriesId() {
        return this.sampleSeriesId;
    }

    @Import(name="stepId", required=true)
    private Output<String> stepId;

    public Output<String> stepId() {
        return this.stepId;
    }

    private GetPerfSampleSeriesArgs() {}

    private GetPerfSampleSeriesArgs(GetPerfSampleSeriesArgs $) {
        this.executionId = $.executionId;
        this.historyId = $.historyId;
        this.project = $.project;
        this.sampleSeriesId = $.sampleSeriesId;
        this.stepId = $.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPerfSampleSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPerfSampleSeriesArgs $;

        public Builder() {
            $ = new GetPerfSampleSeriesArgs();
        }

        public Builder(GetPerfSampleSeriesArgs defaults) {
            $ = new GetPerfSampleSeriesArgs(Objects.requireNonNull(defaults));
        }

        public Builder executionId(Output<String> executionId) {
            $.executionId = executionId;
            return this;
        }

        public Builder executionId(String executionId) {
            return executionId(Output.of(executionId));
        }

        public Builder historyId(Output<String> historyId) {
            $.historyId = historyId;
            return this;
        }

        public Builder historyId(String historyId) {
            return historyId(Output.of(historyId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder sampleSeriesId(Output<String> sampleSeriesId) {
            $.sampleSeriesId = sampleSeriesId;
            return this;
        }

        public Builder sampleSeriesId(String sampleSeriesId) {
            return sampleSeriesId(Output.of(sampleSeriesId));
        }

        public Builder stepId(Output<String> stepId) {
            $.stepId = stepId;
            return this;
        }

        public Builder stepId(String stepId) {
            return stepId(Output.of(stepId));
        }

        public GetPerfSampleSeriesArgs build() {
            $.executionId = Objects.requireNonNull($.executionId, "expected parameter 'executionId' to be non-null");
            $.historyId = Objects.requireNonNull($.historyId, "expected parameter 'historyId' to be non-null");
            $.sampleSeriesId = Objects.requireNonNull($.sampleSeriesId, "expected parameter 'sampleSeriesId' to be non-null");
            $.stepId = Objects.requireNonNull($.stepId, "expected parameter 'stepId' to be non-null");
            return $;
        }
    }

}
