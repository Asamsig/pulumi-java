// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkFunctionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkFunctionArgs Empty = new GetNetworkFunctionArgs();

    /**
     * The name of the network function resource.
     * 
     */
    @Import(name="networkFunctionName", required=true)
    private Output<String> networkFunctionName;

    /**
     * @return The name of the network function resource.
     * 
     */
    public Output<String> networkFunctionName() {
        return this.networkFunctionName;
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

    private GetNetworkFunctionArgs() {}

    private GetNetworkFunctionArgs(GetNetworkFunctionArgs $) {
        this.networkFunctionName = $.networkFunctionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkFunctionArgs $;

        public Builder() {
            $ = new GetNetworkFunctionArgs();
        }

        public Builder(GetNetworkFunctionArgs defaults) {
            $ = new GetNetworkFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkFunctionName The name of the network function resource.
         * 
         * @return builder
         * 
         */
        public Builder networkFunctionName(Output<String> networkFunctionName) {
            $.networkFunctionName = networkFunctionName;
            return this;
        }

        /**
         * @param networkFunctionName The name of the network function resource.
         * 
         * @return builder
         * 
         */
        public Builder networkFunctionName(String networkFunctionName) {
            return networkFunctionName(Output.of(networkFunctionName));
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

        public GetNetworkFunctionArgs build() {
            $.networkFunctionName = Objects.requireNonNull($.networkFunctionName, "expected parameter 'networkFunctionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
