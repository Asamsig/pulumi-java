// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSpokeIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpokeIamPolicyArgs Empty = new GetSpokeIamPolicyArgs();

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

    @Import(name="spokeId", required=true)
    private Output<String> spokeId;

    public Output<String> spokeId() {
        return this.spokeId;
    }

    private GetSpokeIamPolicyArgs() {}

    private GetSpokeIamPolicyArgs(GetSpokeIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.spokeId = $.spokeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpokeIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpokeIamPolicyArgs $;

        public Builder() {
            $ = new GetSpokeIamPolicyArgs();
        }

        public Builder(GetSpokeIamPolicyArgs defaults) {
            $ = new GetSpokeIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder spokeId(Output<String> spokeId) {
            $.spokeId = spokeId;
            return this;
        }

        public Builder spokeId(String spokeId) {
            return spokeId(Output.of(spokeId));
        }

        public GetSpokeIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.spokeId = Objects.requireNonNull($.spokeId, "expected parameter 'spokeId' to be non-null");
            return $;
        }
    }

}
