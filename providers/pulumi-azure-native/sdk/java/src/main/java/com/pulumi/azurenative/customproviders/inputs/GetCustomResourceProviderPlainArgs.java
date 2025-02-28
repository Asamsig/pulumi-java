// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customproviders.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomResourceProviderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomResourceProviderPlainArgs Empty = new GetCustomResourceProviderPlainArgs();

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
     * The name of the resource provider.
     * 
     */
    @Import(name="resourceProviderName", required=true)
    private String resourceProviderName;

    /**
     * @return The name of the resource provider.
     * 
     */
    public String resourceProviderName() {
        return this.resourceProviderName;
    }

    private GetCustomResourceProviderPlainArgs() {}

    private GetCustomResourceProviderPlainArgs(GetCustomResourceProviderPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceProviderName = $.resourceProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomResourceProviderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomResourceProviderPlainArgs $;

        public Builder() {
            $ = new GetCustomResourceProviderPlainArgs();
        }

        public Builder(GetCustomResourceProviderPlainArgs defaults) {
            $ = new GetCustomResourceProviderPlainArgs(Objects.requireNonNull(defaults));
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
         * @param resourceProviderName The name of the resource provider.
         * 
         * @return builder
         * 
         */
        public Builder resourceProviderName(String resourceProviderName) {
            $.resourceProviderName = resourceProviderName;
            return this;
        }

        public GetCustomResourceProviderPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceProviderName = Objects.requireNonNull($.resourceProviderName, "expected parameter 'resourceProviderName' to be non-null");
            return $;
        }
    }

}
