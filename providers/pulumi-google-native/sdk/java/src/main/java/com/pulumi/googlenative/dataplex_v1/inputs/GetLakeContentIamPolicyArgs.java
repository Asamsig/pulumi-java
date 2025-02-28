// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLakeContentIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLakeContentIamPolicyArgs Empty = new GetLakeContentIamPolicyArgs();

    @Import(name="contentId", required=true)
    private Output<String> contentId;

    public Output<String> contentId() {
        return this.contentId;
    }

    @Import(name="lakeId", required=true)
    private Output<String> lakeId;

    public Output<String> lakeId() {
        return this.lakeId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetLakeContentIamPolicyArgs() {}

    private GetLakeContentIamPolicyArgs(GetLakeContentIamPolicyArgs $) {
        this.contentId = $.contentId;
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLakeContentIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLakeContentIamPolicyArgs $;

        public Builder() {
            $ = new GetLakeContentIamPolicyArgs();
        }

        public Builder(GetLakeContentIamPolicyArgs defaults) {
            $ = new GetLakeContentIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentId(Output<String> contentId) {
            $.contentId = contentId;
            return this;
        }

        public Builder contentId(String contentId) {
            return contentId(Output.of(contentId));
        }

        public Builder lakeId(Output<String> lakeId) {
            $.lakeId = lakeId;
            return this;
        }

        public Builder lakeId(String lakeId) {
            return lakeId(Output.of(lakeId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetLakeContentIamPolicyArgs build() {
            $.contentId = Objects.requireNonNull($.contentId, "expected parameter 'contentId' to be non-null");
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
