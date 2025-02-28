// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkGatewayPlainArgs Empty = new GetVirtualNetworkGatewayPlainArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual network gateway.
     * 
     */
    @Import(name="virtualNetworkGatewayName", required=true)
    private String virtualNetworkGatewayName;

    /**
     * @return The name of the virtual network gateway.
     * 
     */
    public String virtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName;
    }

    private GetVirtualNetworkGatewayPlainArgs() {}

    private GetVirtualNetworkGatewayPlainArgs(GetVirtualNetworkGatewayPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkGatewayName = $.virtualNetworkGatewayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkGatewayPlainArgs $;

        public Builder() {
            $ = new GetVirtualNetworkGatewayPlainArgs();
        }

        public Builder(GetVirtualNetworkGatewayPlainArgs defaults) {
            $ = new GetVirtualNetworkGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param virtualNetworkGatewayName The name of the virtual network gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkGatewayName(String virtualNetworkGatewayName) {
            $.virtualNetworkGatewayName = virtualNetworkGatewayName;
            return this;
        }

        public GetVirtualNetworkGatewayPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkGatewayName = Objects.requireNonNull($.virtualNetworkGatewayName, "expected parameter 'virtualNetworkGatewayName' to be non-null");
            return $;
        }
    }

}
