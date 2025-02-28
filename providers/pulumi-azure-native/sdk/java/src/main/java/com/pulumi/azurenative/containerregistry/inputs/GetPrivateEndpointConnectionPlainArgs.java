// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionPlainArgs Empty = new GetPrivateEndpointConnectionPlainArgs();

    /**
     * The name of the private endpoint connection.
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private String privateEndpointConnectionName;

    /**
     * @return The name of the private endpoint connection.
     * 
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
    private String registryName;

    /**
     * @return The name of the container registry.
     * 
     */
    public String registryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group to which the container registry belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPrivateEndpointConnectionPlainArgs() {}

    private GetPrivateEndpointConnectionPlainArgs(GetPrivateEndpointConnectionPlainArgs $) {
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointConnectionPlainArgs $;

        public Builder() {
            $ = new GetPrivateEndpointConnectionPlainArgs();
        }

        public Builder(GetPrivateEndpointConnectionPlainArgs defaults) {
            $ = new GetPrivateEndpointConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpointConnectionName The name of the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(String registryName) {
            $.registryName = registryName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPrivateEndpointConnectionPlainArgs build() {
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
