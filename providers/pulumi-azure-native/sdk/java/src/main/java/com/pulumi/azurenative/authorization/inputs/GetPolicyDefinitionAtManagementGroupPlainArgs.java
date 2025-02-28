// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPolicyDefinitionAtManagementGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyDefinitionAtManagementGroupPlainArgs Empty = new GetPolicyDefinitionAtManagementGroupPlainArgs();

    /**
     * The ID of the management group.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private String managementGroupId;

    /**
     * @return The ID of the management group.
     * 
     */
    public String managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The name of the policy definition to get.
     * 
     */
    @Import(name="policyDefinitionName", required=true)
    private String policyDefinitionName;

    /**
     * @return The name of the policy definition to get.
     * 
     */
    public String policyDefinitionName() {
        return this.policyDefinitionName;
    }

    private GetPolicyDefinitionAtManagementGroupPlainArgs() {}

    private GetPolicyDefinitionAtManagementGroupPlainArgs(GetPolicyDefinitionAtManagementGroupPlainArgs $) {
        this.managementGroupId = $.managementGroupId;
        this.policyDefinitionName = $.policyDefinitionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDefinitionAtManagementGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDefinitionAtManagementGroupPlainArgs $;

        public Builder() {
            $ = new GetPolicyDefinitionAtManagementGroupPlainArgs();
        }

        public Builder(GetPolicyDefinitionAtManagementGroupPlainArgs defaults) {
            $ = new GetPolicyDefinitionAtManagementGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementGroupId The ID of the management group.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(String managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        /**
         * @param policyDefinitionName The name of the policy definition to get.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionName(String policyDefinitionName) {
            $.policyDefinitionName = policyDefinitionName;
            return this;
        }

        public GetPolicyDefinitionAtManagementGroupPlainArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            $.policyDefinitionName = Objects.requireNonNull($.policyDefinitionName, "expected parameter 'policyDefinitionName' to be non-null");
            return $;
        }
    }

}
