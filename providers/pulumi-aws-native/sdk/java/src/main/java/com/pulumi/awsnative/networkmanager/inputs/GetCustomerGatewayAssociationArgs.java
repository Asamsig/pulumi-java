// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomerGatewayAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomerGatewayAssociationArgs Empty = new GetCustomerGatewayAssociationArgs();

    /**
     * The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    @Import(name="customerGatewayArn", required=true)
    private Output<String> customerGatewayArn;

    /**
     * @return The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    public Output<String> customerGatewayArn() {
        return this.customerGatewayArn;
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }

    private GetCustomerGatewayAssociationArgs() {}

    private GetCustomerGatewayAssociationArgs(GetCustomerGatewayAssociationArgs $) {
        this.customerGatewayArn = $.customerGatewayArn;
        this.globalNetworkId = $.globalNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomerGatewayAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomerGatewayAssociationArgs $;

        public Builder() {
            $ = new GetCustomerGatewayAssociationArgs();
        }

        public Builder(GetCustomerGatewayAssociationArgs defaults) {
            $ = new GetCustomerGatewayAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder customerGatewayArn(Output<String> customerGatewayArn) {
            $.customerGatewayArn = customerGatewayArn;
            return this;
        }

        /**
         * @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder customerGatewayArn(String customerGatewayArn) {
            return customerGatewayArn(Output.of(customerGatewayArn));
        }

        /**
         * @param globalNetworkId The ID of the global network.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the global network.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        public GetCustomerGatewayAssociationArgs build() {
            $.customerGatewayArn = Objects.requireNonNull($.customerGatewayArn, "expected parameter 'customerGatewayArn' to be non-null");
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            return $;
        }
    }

}
