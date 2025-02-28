// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductPolicyPlainArgs Empty = new GetProductPolicyPlainArgs();

    /**
     * Policy Export Format.
     * 
     */
    @Import(name="format")
    private @Nullable String format;

    /**
     * @return Policy Export Format.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The identifier of the Policy.
     * 
     */
    @Import(name="policyId", required=true)
    private String policyId;

    /**
     * @return The identifier of the Policy.
     * 
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="productId", required=true)
    private String productId;

    /**
     * @return Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    public String productId() {
        return this.productId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetProductPolicyPlainArgs() {}

    private GetProductPolicyPlainArgs(GetProductPolicyPlainArgs $) {
        this.format = $.format;
        this.policyId = $.policyId;
        this.productId = $.productId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductPolicyPlainArgs $;

        public Builder() {
            $ = new GetProductPolicyPlainArgs();
        }

        public Builder(GetProductPolicyPlainArgs defaults) {
            $ = new GetProductPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format Policy Export Format.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable String format) {
            $.format = format;
            return this;
        }

        /**
         * @param policyId The identifier of the Policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param productId Product identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetProductPolicyPlainArgs build() {
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
