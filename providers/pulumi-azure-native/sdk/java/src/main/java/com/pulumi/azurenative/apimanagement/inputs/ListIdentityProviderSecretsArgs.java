// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListIdentityProviderSecretsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListIdentityProviderSecretsArgs Empty = new ListIdentityProviderSecretsArgs();

    /**
     * Identity Provider Type identifier.
     * 
     */
    @Import(name="identityProviderName", required=true)
    private Output<String> identityProviderName;

    /**
     * @return Identity Provider Type identifier.
     * 
     */
    public Output<String> identityProviderName() {
        return this.identityProviderName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ListIdentityProviderSecretsArgs() {}

    private ListIdentityProviderSecretsArgs(ListIdentityProviderSecretsArgs $) {
        this.identityProviderName = $.identityProviderName;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListIdentityProviderSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListIdentityProviderSecretsArgs $;

        public Builder() {
            $ = new ListIdentityProviderSecretsArgs();
        }

        public Builder(ListIdentityProviderSecretsArgs defaults) {
            $ = new ListIdentityProviderSecretsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityProviderName Identity Provider Type identifier.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderName(Output<String> identityProviderName) {
            $.identityProviderName = identityProviderName;
            return this;
        }

        /**
         * @param identityProviderName Identity Provider Type identifier.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderName(String identityProviderName) {
            return identityProviderName(Output.of(identityProviderName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ListIdentityProviderSecretsArgs build() {
            $.identityProviderName = Objects.requireNonNull($.identityProviderName, "expected parameter 'identityProviderName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
