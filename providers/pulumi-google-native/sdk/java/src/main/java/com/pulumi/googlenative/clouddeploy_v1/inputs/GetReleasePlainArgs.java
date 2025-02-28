// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReleasePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReleasePlainArgs Empty = new GetReleasePlainArgs();

    @Import(name="deliveryPipelineId", required=true)
    private String deliveryPipelineId;

    public String deliveryPipelineId() {
        return this.deliveryPipelineId;
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

    @Import(name="releaseId", required=true)
    private String releaseId;

    public String releaseId() {
        return this.releaseId;
    }

    private GetReleasePlainArgs() {}

    private GetReleasePlainArgs(GetReleasePlainArgs $) {
        this.deliveryPipelineId = $.deliveryPipelineId;
        this.location = $.location;
        this.project = $.project;
        this.releaseId = $.releaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReleasePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReleasePlainArgs $;

        public Builder() {
            $ = new GetReleasePlainArgs();
        }

        public Builder(GetReleasePlainArgs defaults) {
            $ = new GetReleasePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder deliveryPipelineId(String deliveryPipelineId) {
            $.deliveryPipelineId = deliveryPipelineId;
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

        public Builder releaseId(String releaseId) {
            $.releaseId = releaseId;
            return this;
        }

        public GetReleasePlainArgs build() {
            $.deliveryPipelineId = Objects.requireNonNull($.deliveryPipelineId, "expected parameter 'deliveryPipelineId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.releaseId = Objects.requireNonNull($.releaseId, "expected parameter 'releaseId' to be non-null");
            return $;
        }
    }

}
