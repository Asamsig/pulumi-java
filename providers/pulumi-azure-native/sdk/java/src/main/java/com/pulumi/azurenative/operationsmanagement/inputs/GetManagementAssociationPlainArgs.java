// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagementAssociationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagementAssociationPlainArgs Empty = new GetManagementAssociationPlainArgs();

    /**
     * User ManagementAssociation Name.
     * 
     */
    @Import(name="managementAssociationName", required=true)
    private String managementAssociationName;

    /**
     * @return User ManagementAssociation Name.
     * 
     */
    public String managementAssociationName() {
        return this.managementAssociationName;
    }

    /**
     * Provider name for the parent resource.
     * 
     */
    @Import(name="providerName", required=true)
    private String providerName;

    /**
     * @return Provider name for the parent resource.
     * 
     */
    public String providerName() {
        return this.providerName;
    }

    /**
     * The name of the resource group to get. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group to get. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Parent resource name.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return Parent resource name.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Resource type for the parent resource
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return Resource type for the parent resource
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    private GetManagementAssociationPlainArgs() {}

    private GetManagementAssociationPlainArgs(GetManagementAssociationPlainArgs $) {
        this.managementAssociationName = $.managementAssociationName;
        this.providerName = $.providerName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagementAssociationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagementAssociationPlainArgs $;

        public Builder() {
            $ = new GetManagementAssociationPlainArgs();
        }

        public Builder(GetManagementAssociationPlainArgs defaults) {
            $ = new GetManagementAssociationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementAssociationName User ManagementAssociation Name.
         * 
         * @return builder
         * 
         */
        public Builder managementAssociationName(String managementAssociationName) {
            $.managementAssociationName = managementAssociationName;
            return this;
        }

        /**
         * @param providerName Provider name for the parent resource.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName Parent resource name.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceType Resource type for the parent resource
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public GetManagementAssociationPlainArgs build() {
            $.managementAssociationName = Objects.requireNonNull($.managementAssociationName, "expected parameter 'managementAssociationName' to be non-null");
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
