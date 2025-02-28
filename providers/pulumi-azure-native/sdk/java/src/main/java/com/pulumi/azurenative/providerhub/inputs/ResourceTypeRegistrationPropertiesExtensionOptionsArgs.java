// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.ResourceTypeExtensionOptionsResourceCreationBeginArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesExtensionOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesExtensionOptionsArgs Empty = new ResourceTypeRegistrationPropertiesExtensionOptionsArgs();

    @Import(name="resourceCreationBegin")
    private @Nullable Output<ResourceTypeExtensionOptionsResourceCreationBeginArgs> resourceCreationBegin;

    public Optional<Output<ResourceTypeExtensionOptionsResourceCreationBeginArgs>> resourceCreationBegin() {
        return Optional.ofNullable(this.resourceCreationBegin);
    }

    private ResourceTypeRegistrationPropertiesExtensionOptionsArgs() {}

    private ResourceTypeRegistrationPropertiesExtensionOptionsArgs(ResourceTypeRegistrationPropertiesExtensionOptionsArgs $) {
        this.resourceCreationBegin = $.resourceCreationBegin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceTypeRegistrationPropertiesExtensionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceTypeRegistrationPropertiesExtensionOptionsArgs $;

        public Builder() {
            $ = new ResourceTypeRegistrationPropertiesExtensionOptionsArgs();
        }

        public Builder(ResourceTypeRegistrationPropertiesExtensionOptionsArgs defaults) {
            $ = new ResourceTypeRegistrationPropertiesExtensionOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceCreationBegin(@Nullable Output<ResourceTypeExtensionOptionsResourceCreationBeginArgs> resourceCreationBegin) {
            $.resourceCreationBegin = resourceCreationBegin;
            return this;
        }

        public Builder resourceCreationBegin(ResourceTypeExtensionOptionsResourceCreationBeginArgs resourceCreationBegin) {
            return resourceCreationBegin(Output.of(resourceCreationBegin));
        }

        public ResourceTypeRegistrationPropertiesExtensionOptionsArgs build() {
            return $;
        }
    }

}
