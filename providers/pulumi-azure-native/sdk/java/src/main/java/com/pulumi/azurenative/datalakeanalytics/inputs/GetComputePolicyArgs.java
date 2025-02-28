// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetComputePolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComputePolicyArgs Empty = new GetComputePolicyArgs();

    /**
     * The name of the Data Lake Analytics account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the Data Lake Analytics account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the compute policy to retrieve.
     * 
     */
    @Import(name="computePolicyName", required=true)
    private Output<String> computePolicyName;

    /**
     * @return The name of the compute policy to retrieve.
     * 
     */
    public Output<String> computePolicyName() {
        return this.computePolicyName;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Azure resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetComputePolicyArgs() {}

    private GetComputePolicyArgs(GetComputePolicyArgs $) {
        this.accountName = $.accountName;
        this.computePolicyName = $.computePolicyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComputePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComputePolicyArgs $;

        public Builder() {
            $ = new GetComputePolicyArgs();
        }

        public Builder(GetComputePolicyArgs defaults) {
            $ = new GetComputePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Data Lake Analytics account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the Data Lake Analytics account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param computePolicyName The name of the compute policy to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder computePolicyName(Output<String> computePolicyName) {
            $.computePolicyName = computePolicyName;
            return this;
        }

        /**
         * @param computePolicyName The name of the compute policy to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder computePolicyName(String computePolicyName) {
            return computePolicyName(Output.of(computePolicyName));
        }

        /**
         * @param resourceGroupName The name of the Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetComputePolicyArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.computePolicyName = Objects.requireNonNull($.computePolicyName, "expected parameter 'computePolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
