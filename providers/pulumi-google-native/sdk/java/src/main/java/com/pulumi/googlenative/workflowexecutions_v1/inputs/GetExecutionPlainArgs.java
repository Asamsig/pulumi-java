// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflowexecutions_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExecutionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExecutionPlainArgs Empty = new GetExecutionPlainArgs();

    @Import(name="executionId", required=true)
    private String executionId;

    public String executionId() {
        return this.executionId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    @Import(name="workflowId", required=true)
    private String workflowId;

    public String workflowId() {
        return this.workflowId;
    }

    private GetExecutionPlainArgs() {}

    private GetExecutionPlainArgs(GetExecutionPlainArgs $) {
        this.executionId = $.executionId;
        this.location = $.location;
        this.project = $.project;
        this.view = $.view;
        this.workflowId = $.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExecutionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExecutionPlainArgs $;

        public Builder() {
            $ = new GetExecutionPlainArgs();
        }

        public Builder(GetExecutionPlainArgs defaults) {
            $ = new GetExecutionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder executionId(String executionId) {
            $.executionId = executionId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public Builder workflowId(String workflowId) {
            $.workflowId = workflowId;
            return this;
        }

        public GetExecutionPlainArgs build() {
            $.executionId = Objects.requireNonNull($.executionId, "expected parameter 'executionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.workflowId = Objects.requireNonNull($.workflowId, "expected parameter 'workflowId' to be non-null");
            return $;
        }
    }

}
