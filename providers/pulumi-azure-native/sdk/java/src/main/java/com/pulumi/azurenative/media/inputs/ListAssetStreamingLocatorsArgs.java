// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListAssetStreamingLocatorsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListAssetStreamingLocatorsArgs Empty = new ListAssetStreamingLocatorsArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The Media Services account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The Asset name.
     * 
     */
    @Import(name="assetName", required=true)
    private Output<String> assetName;

    /**
     * @return The Asset name.
     * 
     */
    public Output<String> assetName() {
        return this.assetName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListAssetStreamingLocatorsArgs() {}

    private ListAssetStreamingLocatorsArgs(ListAssetStreamingLocatorsArgs $) {
        this.accountName = $.accountName;
        this.assetName = $.assetName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListAssetStreamingLocatorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListAssetStreamingLocatorsArgs $;

        public Builder() {
            $ = new ListAssetStreamingLocatorsArgs();
        }

        public Builder(ListAssetStreamingLocatorsArgs defaults) {
            $ = new ListAssetStreamingLocatorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param assetName The Asset name.
         * 
         * @return builder
         * 
         */
        public Builder assetName(Output<String> assetName) {
            $.assetName = assetName;
            return this;
        }

        /**
         * @param assetName The Asset name.
         * 
         * @return builder
         * 
         */
        public Builder assetName(String assetName) {
            return assetName(Output.of(assetName));
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ListAssetStreamingLocatorsArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.assetName = Objects.requireNonNull($.assetName, "expected parameter 'assetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
