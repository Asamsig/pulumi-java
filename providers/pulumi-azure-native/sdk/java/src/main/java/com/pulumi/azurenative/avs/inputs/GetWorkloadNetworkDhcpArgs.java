// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadNetworkDhcpArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadNetworkDhcpArgs Empty = new GetWorkloadNetworkDhcpArgs();

    /**
     * NSX DHCP identifier. Generally the same as the DHCP display name
     * 
     */
    @Import(name="dhcpId", required=true)
    private Output<String> dhcpId;

    /**
     * @return NSX DHCP identifier. Generally the same as the DHCP display name
     * 
     */
    public Output<String> dhcpId() {
        return this.dhcpId;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    /**
     * @return Name of the private cloud
     * 
     */
    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetWorkloadNetworkDhcpArgs() {}

    private GetWorkloadNetworkDhcpArgs(GetWorkloadNetworkDhcpArgs $) {
        this.dhcpId = $.dhcpId;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadNetworkDhcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadNetworkDhcpArgs $;

        public Builder() {
            $ = new GetWorkloadNetworkDhcpArgs();
        }

        public Builder(GetWorkloadNetworkDhcpArgs defaults) {
            $ = new GetWorkloadNetworkDhcpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dhcpId NSX DHCP identifier. Generally the same as the DHCP display name
         * 
         * @return builder
         * 
         */
        public Builder dhcpId(Output<String> dhcpId) {
            $.dhcpId = dhcpId;
            return this;
        }

        /**
         * @param dhcpId NSX DHCP identifier. Generally the same as the DHCP display name
         * 
         * @return builder
         * 
         */
        public Builder dhcpId(String dhcpId) {
            return dhcpId(Output.of(dhcpId));
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetWorkloadNetworkDhcpArgs build() {
            $.dhcpId = Objects.requireNonNull($.dhcpId, "expected parameter 'dhcpId' to be non-null");
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
