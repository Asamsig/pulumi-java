// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLakeZoneIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLakeZoneIamPolicyArgs Empty = new GetLakeZoneIamPolicyArgs();

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

    @Import(name="zone", required=true)
    private Output<String> zone;

    public Output<String> zone() {
        return this.zone;
    }

    private GetLakeZoneIamPolicyArgs() {}

    private GetLakeZoneIamPolicyArgs(GetLakeZoneIamPolicyArgs $) {
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLakeZoneIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLakeZoneIamPolicyArgs $;

        public Builder() {
            $ = new GetLakeZoneIamPolicyArgs();
        }

        public Builder(GetLakeZoneIamPolicyArgs defaults) {
            $ = new GetLakeZoneIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetLakeZoneIamPolicyArgs build() {
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
