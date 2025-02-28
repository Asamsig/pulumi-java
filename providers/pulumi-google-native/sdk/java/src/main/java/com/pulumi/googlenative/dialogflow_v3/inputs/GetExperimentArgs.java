// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExperimentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExperimentArgs Empty = new GetExperimentArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    @Import(name="experimentId", required=true)
    private Output<String> experimentId;

    public Output<String> experimentId() {
        return this.experimentId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetExperimentArgs() {}

    private GetExperimentArgs(GetExperimentArgs $) {
        this.agentId = $.agentId;
        this.environmentId = $.environmentId;
        this.experimentId = $.experimentId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExperimentArgs $;

        public Builder() {
            $ = new GetExperimentArgs();
        }

        public Builder(GetExperimentArgs defaults) {
            $ = new GetExperimentArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public Builder experimentId(Output<String> experimentId) {
            $.experimentId = experimentId;
            return this;
        }

        public Builder experimentId(String experimentId) {
            return experimentId(Output.of(experimentId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetExperimentArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.experimentId = Objects.requireNonNull($.experimentId, "expected parameter 'experimentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
