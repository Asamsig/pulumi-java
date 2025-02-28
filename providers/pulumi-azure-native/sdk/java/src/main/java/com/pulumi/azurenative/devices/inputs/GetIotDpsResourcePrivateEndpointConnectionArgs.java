// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIotDpsResourcePrivateEndpointConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIotDpsResourcePrivateEndpointConnectionArgs Empty = new GetIotDpsResourcePrivateEndpointConnectionArgs();

    /**
     * The name of the private endpoint connection
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private Output<String> privateEndpointConnectionName;

    /**
     * @return The name of the private endpoint connection
     * 
     */
    public Output<String> privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group that contains the provisioning service.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the provisioning service.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the provisioning service.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the provisioning service.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    private GetIotDpsResourcePrivateEndpointConnectionArgs() {}

    private GetIotDpsResourcePrivateEndpointConnectionArgs(GetIotDpsResourcePrivateEndpointConnectionArgs $) {
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIotDpsResourcePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIotDpsResourcePrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new GetIotDpsResourcePrivateEndpointConnectionArgs();
        }

        public Builder(GetIotDpsResourcePrivateEndpointConnectionArgs defaults) {
            $ = new GetIotDpsResourcePrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpointConnectionName The name of the private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName The name of the private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public GetIotDpsResourcePrivateEndpointConnectionArgs build() {
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
