// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProductsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductsArgs Empty = new GetProductsArgs();

    /**
     * Name of the product.
     * 
     */
    @Import(name="productName", required=true)
    private Output<String> productName;

    /**
     * @return Name of the product.
     * 
     */
    public Output<String> productName() {
        return this.productName;
    }

    /**
     * Name of the Azure Stack registration.
     * 
     */
    @Import(name="registrationName", required=true)
    private Output<String> registrationName;

    /**
     * @return Name of the Azure Stack registration.
     * 
     */
    public Output<String> registrationName() {
        return this.registrationName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private Output<String> resourceGroup;

    /**
     * @return Name of the resource group.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }

    private GetProductsArgs() {}

    private GetProductsArgs(GetProductsArgs $) {
        this.productName = $.productName;
        this.registrationName = $.registrationName;
        this.resourceGroup = $.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductsArgs $;

        public Builder() {
            $ = new GetProductsArgs();
        }

        public Builder(GetProductsArgs defaults) {
            $ = new GetProductsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param productName Name of the product.
         * 
         * @return builder
         * 
         */
        public Builder productName(Output<String> productName) {
            $.productName = productName;
            return this;
        }

        /**
         * @param productName Name of the product.
         * 
         * @return builder
         * 
         */
        public Builder productName(String productName) {
            return productName(Output.of(productName));
        }

        /**
         * @param registrationName Name of the Azure Stack registration.
         * 
         * @return builder
         * 
         */
        public Builder registrationName(Output<String> registrationName) {
            $.registrationName = registrationName;
            return this;
        }

        /**
         * @param registrationName Name of the Azure Stack registration.
         * 
         * @return builder
         * 
         */
        public Builder registrationName(String registrationName) {
            return registrationName(Output.of(registrationName));
        }

        /**
         * @param resourceGroup Name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup Name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        public GetProductsArgs build() {
            $.productName = Objects.requireNonNull($.productName, "expected parameter 'productName' to be non-null");
            $.registrationName = Objects.requireNonNull($.registrationName, "expected parameter 'registrationName' to be non-null");
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            return $;
        }
    }

}
