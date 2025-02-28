// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpnGatewayConnectionRoutingPropagatedRouteTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnGatewayConnectionRoutingPropagatedRouteTableArgs Empty = new VpnGatewayConnectionRoutingPropagatedRouteTableArgs();

    /**
     * A list of labels to assign to this route table.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return A list of labels to assign to this route table.
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * A list of Route Table ID&#39;s to associated with this VPN Gateway Connection.
     * 
     */
    @Import(name="routeTableIds", required=true)
    private Output<List<String>> routeTableIds;

    /**
     * @return A list of Route Table ID&#39;s to associated with this VPN Gateway Connection.
     * 
     */
    public Output<List<String>> routeTableIds() {
        return this.routeTableIds;
    }

    private VpnGatewayConnectionRoutingPropagatedRouteTableArgs() {}

    private VpnGatewayConnectionRoutingPropagatedRouteTableArgs(VpnGatewayConnectionRoutingPropagatedRouteTableArgs $) {
        this.labels = $.labels;
        this.routeTableIds = $.routeTableIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnGatewayConnectionRoutingPropagatedRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnGatewayConnectionRoutingPropagatedRouteTableArgs $;

        public Builder() {
            $ = new VpnGatewayConnectionRoutingPropagatedRouteTableArgs();
        }

        public Builder(VpnGatewayConnectionRoutingPropagatedRouteTableArgs defaults) {
            $ = new VpnGatewayConnectionRoutingPropagatedRouteTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels A list of labels to assign to this route table.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A list of labels to assign to this route table.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels A list of labels to assign to this route table.
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param routeTableIds A list of Route Table ID&#39;s to associated with this VPN Gateway Connection.
         * 
         * @return builder
         * 
         */
        public Builder routeTableIds(Output<List<String>> routeTableIds) {
            $.routeTableIds = routeTableIds;
            return this;
        }

        /**
         * @param routeTableIds A list of Route Table ID&#39;s to associated with this VPN Gateway Connection.
         * 
         * @return builder
         * 
         */
        public Builder routeTableIds(List<String> routeTableIds) {
            return routeTableIds(Output.of(routeTableIds));
        }

        /**
         * @param routeTableIds A list of Route Table ID&#39;s to associated with this VPN Gateway Connection.
         * 
         * @return builder
         * 
         */
        public Builder routeTableIds(String... routeTableIds) {
            return routeTableIds(List.of(routeTableIds));
        }

        public VpnGatewayConnectionRoutingPropagatedRouteTableArgs build() {
            $.routeTableIds = Objects.requireNonNull($.routeTableIds, "expected parameter 'routeTableIds' to be non-null");
            return $;
        }
    }

}
