// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkScopeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkScopeArgs Empty = new GetPrivateLinkScopeArgs();

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

    /**
     * The name of the Azure Arc PrivateLinkScope resource.
     * 
     */
    @Import(name="scopeName", required=true)
    private Output<String> scopeName;

    /**
     * @return The name of the Azure Arc PrivateLinkScope resource.
     * 
     */
    public Output<String> scopeName() {
        return this.scopeName;
    }

    private GetPrivateLinkScopeArgs() {}

    private GetPrivateLinkScopeArgs(GetPrivateLinkScopeArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.scopeName = $.scopeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkScopeArgs $;

        public Builder() {
            $ = new GetPrivateLinkScopeArgs();
        }

        public Builder(GetPrivateLinkScopeArgs defaults) {
            $ = new GetPrivateLinkScopeArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(Output<String> scopeName) {
            $.scopeName = scopeName;
            return this;
        }

        /**
         * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(String scopeName) {
            return scopeName(Output.of(scopeName));
        }

        public GetPrivateLinkScopeArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scopeName = Objects.requireNonNull($.scopeName, "expected parameter 'scopeName' to be non-null");
            return $;
        }
    }

}
