// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCapabilityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCapabilityPlainArgs Empty = new GetCapabilityPlainArgs();

    /**
     * String that represents a Capability resource name.
     * 
     */
    @Import(name="capabilityName", required=true)
    private String capabilityName;

    /**
     * @return String that represents a Capability resource name.
     * 
     */
    public String capabilityName() {
        return this.capabilityName;
    }

    /**
     * String that represents a resource provider namespace.
     * 
     */
    @Import(name="parentProviderNamespace", required=true)
    private String parentProviderNamespace;

    /**
     * @return String that represents a resource provider namespace.
     * 
     */
    public String parentProviderNamespace() {
        return this.parentProviderNamespace;
    }

    /**
     * String that represents a resource name.
     * 
     */
    @Import(name="parentResourceName", required=true)
    private String parentResourceName;

    /**
     * @return String that represents a resource name.
     * 
     */
    public String parentResourceName() {
        return this.parentResourceName;
    }

    /**
     * String that represents a resource type.
     * 
     */
    @Import(name="parentResourceType", required=true)
    private String parentResourceType;

    /**
     * @return String that represents a resource type.
     * 
     */
    public String parentResourceType() {
        return this.parentResourceType;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return String that represents an Azure resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * String that represents a Target resource name.
     * 
     */
    @Import(name="targetName", required=true)
    private String targetName;

    /**
     * @return String that represents a Target resource name.
     * 
     */
    public String targetName() {
        return this.targetName;
    }

    private GetCapabilityPlainArgs() {}

    private GetCapabilityPlainArgs(GetCapabilityPlainArgs $) {
        this.capabilityName = $.capabilityName;
        this.parentProviderNamespace = $.parentProviderNamespace;
        this.parentResourceName = $.parentResourceName;
        this.parentResourceType = $.parentResourceType;
        this.resourceGroupName = $.resourceGroupName;
        this.targetName = $.targetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCapabilityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCapabilityPlainArgs $;

        public Builder() {
            $ = new GetCapabilityPlainArgs();
        }

        public Builder(GetCapabilityPlainArgs defaults) {
            $ = new GetCapabilityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capabilityName String that represents a Capability resource name.
         * 
         * @return builder
         * 
         */
        public Builder capabilityName(String capabilityName) {
            $.capabilityName = capabilityName;
            return this;
        }

        /**
         * @param parentProviderNamespace String that represents a resource provider namespace.
         * 
         * @return builder
         * 
         */
        public Builder parentProviderNamespace(String parentProviderNamespace) {
            $.parentProviderNamespace = parentProviderNamespace;
            return this;
        }

        /**
         * @param parentResourceName String that represents a resource name.
         * 
         * @return builder
         * 
         */
        public Builder parentResourceName(String parentResourceName) {
            $.parentResourceName = parentResourceName;
            return this;
        }

        /**
         * @param parentResourceType String that represents a resource type.
         * 
         * @return builder
         * 
         */
        public Builder parentResourceType(String parentResourceType) {
            $.parentResourceType = parentResourceType;
            return this;
        }

        /**
         * @param resourceGroupName String that represents an Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param targetName String that represents a Target resource name.
         * 
         * @return builder
         * 
         */
        public Builder targetName(String targetName) {
            $.targetName = targetName;
            return this;
        }

        public GetCapabilityPlainArgs build() {
            $.capabilityName = Objects.requireNonNull($.capabilityName, "expected parameter 'capabilityName' to be non-null");
            $.parentProviderNamespace = Objects.requireNonNull($.parentProviderNamespace, "expected parameter 'parentProviderNamespace' to be non-null");
            $.parentResourceName = Objects.requireNonNull($.parentResourceName, "expected parameter 'parentResourceName' to be non-null");
            $.parentResourceType = Objects.requireNonNull($.parentResourceType, "expected parameter 'parentResourceType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.targetName = Objects.requireNonNull($.targetName, "expected parameter 'targetName' to be non-null");
            return $;
        }
    }

}
