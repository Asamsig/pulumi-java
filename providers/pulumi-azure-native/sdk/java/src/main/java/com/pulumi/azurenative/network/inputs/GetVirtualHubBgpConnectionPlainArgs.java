// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualHubBgpConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualHubBgpConnectionPlainArgs Empty = new GetVirtualHubBgpConnectionPlainArgs();

    /**
     * The name of the connection.
     * 
     */
    @Import(name="connectionName", required=true)
    private String connectionName;

    /**
     * @return The name of the connection.
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * The resource group name of the VirtualHub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name of the VirtualHub.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @Import(name="virtualHubName", required=true)
    private String virtualHubName;

    /**
     * @return The name of the VirtualHub.
     * 
     */
    public String virtualHubName() {
        return this.virtualHubName;
    }

    private GetVirtualHubBgpConnectionPlainArgs() {}

    private GetVirtualHubBgpConnectionPlainArgs(GetVirtualHubBgpConnectionPlainArgs $) {
        this.connectionName = $.connectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualHubName = $.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualHubBgpConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualHubBgpConnectionPlainArgs $;

        public Builder() {
            $ = new GetVirtualHubBgpConnectionPlainArgs();
        }

        public Builder(GetVirtualHubBgpConnectionPlainArgs defaults) {
            $ = new GetVirtualHubBgpConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionName The name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param virtualHubName The name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(String virtualHubName) {
            $.virtualHubName = virtualHubName;
            return this;
        }

        public GetVirtualHubBgpConnectionPlainArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualHubName = Objects.requireNonNull($.virtualHubName, "expected parameter 'virtualHubName' to be non-null");
            return $;
        }
    }

}
