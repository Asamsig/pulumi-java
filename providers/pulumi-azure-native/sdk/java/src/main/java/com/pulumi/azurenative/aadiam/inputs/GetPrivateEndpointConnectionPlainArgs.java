// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionPlainArgs Empty = new GetPrivateEndpointConnectionPlainArgs();

    /**
     * The name of the private link policy in Azure AD.
     * 
     */
    @Import(name="policyName", required=true)
    private String policyName;

    /**
     * @return The name of the private link policy in Azure AD.
     * 
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * The PrivateEndpointConnection name.
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private String privateEndpointConnectionName;

    /**
     * @return The PrivateEndpointConnection name.
     * 
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * Name of an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of an Azure resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPrivateEndpointConnectionPlainArgs() {}

    private GetPrivateEndpointConnectionPlainArgs(GetPrivateEndpointConnectionPlainArgs $) {
        this.policyName = $.policyName;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointConnectionPlainArgs $;

        public Builder() {
            $ = new GetPrivateEndpointConnectionPlainArgs();
        }

        public Builder(GetPrivateEndpointConnectionPlainArgs defaults) {
            $ = new GetPrivateEndpointConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyName The name of the private link policy in Azure AD.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName The PrivateEndpointConnection name.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPrivateEndpointConnectionPlainArgs build() {
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
