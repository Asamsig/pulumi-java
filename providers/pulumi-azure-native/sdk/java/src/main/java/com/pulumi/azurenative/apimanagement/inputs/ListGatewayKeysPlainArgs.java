// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListGatewayKeysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListGatewayKeysPlainArgs Empty = new ListGatewayKeysPlainArgs();

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
     * 
     */
    @Import(name="gatewayId", required=true)
    private String gatewayId;

    /**
     * @return Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
     * 
     */
    public String gatewayId() {
        return this.gatewayId;
    }

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
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private ListGatewayKeysPlainArgs() {}

    private ListGatewayKeysPlainArgs(ListGatewayKeysPlainArgs $) {
        this.gatewayId = $.gatewayId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListGatewayKeysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListGatewayKeysPlainArgs $;

        public Builder() {
            $ = new ListGatewayKeysPlainArgs();
        }

        public Builder(ListGatewayKeysPlainArgs defaults) {
            $ = new ListGatewayKeysPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            $.gatewayId = gatewayId;
            return this;
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
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public ListGatewayKeysPlainArgs build() {
            $.gatewayId = Objects.requireNonNull($.gatewayId, "expected parameter 'gatewayId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
