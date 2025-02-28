// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrderItemByNameArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrderItemByNameArgs Empty = new GetOrderItemByNameArgs();

    /**
     * $expand is supported on device details, forward shipping details and reverse shipping details parameters. Each of these can be provided as a comma separated list. Device Details for order item provides details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse shipping details respectively.
     * 
     */
    @Import(name="expand")
    private @Nullable Output<String> expand;

    /**
     * @return $expand is supported on device details, forward shipping details and reverse shipping details parameters. Each of these can be provided as a comma separated list. Device Details for order item provides details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse shipping details respectively.
     * 
     */
    public Optional<Output<String>> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the order item
     * 
     */
    @Import(name="orderItemName", required=true)
    private Output<String> orderItemName;

    /**
     * @return The name of the order item
     * 
     */
    public Output<String> orderItemName() {
        return this.orderItemName;
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

    private GetOrderItemByNameArgs() {}

    private GetOrderItemByNameArgs(GetOrderItemByNameArgs $) {
        this.expand = $.expand;
        this.orderItemName = $.orderItemName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrderItemByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrderItemByNameArgs $;

        public Builder() {
            $ = new GetOrderItemByNameArgs();
        }

        public Builder(GetOrderItemByNameArgs defaults) {
            $ = new GetOrderItemByNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand $expand is supported on device details, forward shipping details and reverse shipping details parameters. Each of these can be provided as a comma separated list. Device Details for order item provides details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse shipping details respectively.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable Output<String> expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param expand $expand is supported on device details, forward shipping details and reverse shipping details parameters. Each of these can be provided as a comma separated list. Device Details for order item provides details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse shipping details respectively.
         * 
         * @return builder
         * 
         */
        public Builder expand(String expand) {
            return expand(Output.of(expand));
        }

        /**
         * @param orderItemName The name of the order item
         * 
         * @return builder
         * 
         */
        public Builder orderItemName(Output<String> orderItemName) {
            $.orderItemName = orderItemName;
            return this;
        }

        /**
         * @param orderItemName The name of the order item
         * 
         * @return builder
         * 
         */
        public Builder orderItemName(String orderItemName) {
            return orderItemName(Output.of(orderItemName));
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

        public GetOrderItemByNameArgs build() {
            $.orderItemName = Objects.requireNonNull($.orderItemName, "expected parameter 'orderItemName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
