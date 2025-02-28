// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayMulticastGroupSourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayMulticastGroupSourceArgs Empty = new GetTransitGatewayMulticastGroupSourceArgs();

    /**
     * The IP address assigned to the transit gateway multicast group.
     * 
     */
    @Import(name="groupIpAddress", required=true)
    private Output<String> groupIpAddress;

    /**
     * @return The IP address assigned to the transit gateway multicast group.
     * 
     */
    public Output<String> groupIpAddress() {
        return this.groupIpAddress;
    }

    /**
     * The ID of the transit gateway attachment.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
    private Output<String> networkInterfaceId;

    /**
     * @return The ID of the transit gateway attachment.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @Import(name="transitGatewayMulticastDomainId", required=true)
    private Output<String> transitGatewayMulticastDomainId;

    /**
     * @return The ID of the transit gateway multicast domain.
     * 
     */
    public Output<String> transitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    private GetTransitGatewayMulticastGroupSourceArgs() {}

    private GetTransitGatewayMulticastGroupSourceArgs(GetTransitGatewayMulticastGroupSourceArgs $) {
        this.groupIpAddress = $.groupIpAddress;
        this.networkInterfaceId = $.networkInterfaceId;
        this.transitGatewayMulticastDomainId = $.transitGatewayMulticastDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitGatewayMulticastGroupSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitGatewayMulticastGroupSourceArgs $;

        public Builder() {
            $ = new GetTransitGatewayMulticastGroupSourceArgs();
        }

        public Builder(GetTransitGatewayMulticastGroupSourceArgs defaults) {
            $ = new GetTransitGatewayMulticastGroupSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupIpAddress The IP address assigned to the transit gateway multicast group.
         * 
         * @return builder
         * 
         */
        public Builder groupIpAddress(Output<String> groupIpAddress) {
            $.groupIpAddress = groupIpAddress;
            return this;
        }

        /**
         * @param groupIpAddress The IP address assigned to the transit gateway multicast group.
         * 
         * @return builder
         * 
         */
        public Builder groupIpAddress(String groupIpAddress) {
            return groupIpAddress(Output.of(groupIpAddress));
        }

        /**
         * @param networkInterfaceId The ID of the transit gateway attachment.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * @param networkInterfaceId The ID of the transit gateway attachment.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
        }

        /**
         * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayMulticastDomainId(Output<String> transitGatewayMulticastDomainId) {
            $.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
            return this;
        }

        /**
         * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
            return transitGatewayMulticastDomainId(Output.of(transitGatewayMulticastDomainId));
        }

        public GetTransitGatewayMulticastGroupSourceArgs build() {
            $.groupIpAddress = Objects.requireNonNull($.groupIpAddress, "expected parameter 'groupIpAddress' to be non-null");
            $.networkInterfaceId = Objects.requireNonNull($.networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
            $.transitGatewayMulticastDomainId = Objects.requireNonNull($.transitGatewayMulticastDomainId, "expected parameter 'transitGatewayMulticastDomainId' to be non-null");
            return $;
        }
    }

}
