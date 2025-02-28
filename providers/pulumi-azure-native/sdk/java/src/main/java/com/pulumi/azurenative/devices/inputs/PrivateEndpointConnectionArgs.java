// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.azurenative.devices.inputs.PrivateEndpointConnectionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The private endpoint connection of an IotHub
 * 
 */
public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The properties of a private endpoint connection
     * 
     */
    @Import(name="properties", required=true)
    private Output<PrivateEndpointConnectionPropertiesArgs> properties;

    /**
     * @return The properties of a private endpoint connection
     * 
     */
    public Output<PrivateEndpointConnectionPropertiesArgs> properties() {
        return this.properties;
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionArgs();
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
            $ = new PrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param properties The properties of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<PrivateEndpointConnectionPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The properties of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder properties(PrivateEndpointConnectionPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public PrivateEndpointConnectionArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            return $;
        }
    }

}
