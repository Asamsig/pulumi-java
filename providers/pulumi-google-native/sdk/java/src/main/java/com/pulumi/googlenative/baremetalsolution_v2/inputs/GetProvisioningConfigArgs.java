// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProvisioningConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProvisioningConfigArgs Empty = new GetProvisioningConfigArgs();

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

    @Import(name="provisioningConfigId", required=true)
    private Output<String> provisioningConfigId;

    public Output<String> provisioningConfigId() {
        return this.provisioningConfigId;
    }

    private GetProvisioningConfigArgs() {}

    private GetProvisioningConfigArgs(GetProvisioningConfigArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.provisioningConfigId = $.provisioningConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProvisioningConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProvisioningConfigArgs $;

        public Builder() {
            $ = new GetProvisioningConfigArgs();
        }

        public Builder(GetProvisioningConfigArgs defaults) {
            $ = new GetProvisioningConfigArgs(Objects.requireNonNull(defaults));
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

        public Builder provisioningConfigId(Output<String> provisioningConfigId) {
            $.provisioningConfigId = provisioningConfigId;
            return this;
        }

        public Builder provisioningConfigId(String provisioningConfigId) {
            return provisioningConfigId(Output.of(provisioningConfigId));
        }

        public GetProvisioningConfigArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.provisioningConfigId = Objects.requireNonNull($.provisioningConfigId, "expected parameter 'provisioningConfigId' to be non-null");
            return $;
        }
    }

}
