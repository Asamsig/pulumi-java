// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListDisasterRecoveryConfigKeysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListDisasterRecoveryConfigKeysPlainArgs Empty = new ListDisasterRecoveryConfigKeysPlainArgs();

    /**
     * The Disaster Recovery configuration name
     * 
     */
    @Import(name="alias", required=true)
    private String alias;

    /**
     * @return The Disaster Recovery configuration name
     * 
     */
    public String alias() {
        return this.alias;
    }

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName", required=true)
    private String authorizationRuleName;

    /**
     * @return The authorization rule name.
     * 
     */
    public String authorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return The Namespace name
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group within the azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListDisasterRecoveryConfigKeysPlainArgs() {}

    private ListDisasterRecoveryConfigKeysPlainArgs(ListDisasterRecoveryConfigKeysPlainArgs $) {
        this.alias = $.alias;
        this.authorizationRuleName = $.authorizationRuleName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListDisasterRecoveryConfigKeysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListDisasterRecoveryConfigKeysPlainArgs $;

        public Builder() {
            $ = new ListDisasterRecoveryConfigKeysPlainArgs();
        }

        public Builder(ListDisasterRecoveryConfigKeysPlainArgs defaults) {
            $ = new ListDisasterRecoveryConfigKeysPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias The Disaster Recovery configuration name
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param authorizationRuleName The authorization rule name.
         * 
         * @return builder
         * 
         */
        public Builder authorizationRuleName(String authorizationRuleName) {
            $.authorizationRuleName = authorizationRuleName;
            return this;
        }

        /**
         * @param namespaceName The Namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group within the azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListDisasterRecoveryConfigKeysPlainArgs build() {
            $.alias = Objects.requireNonNull($.alias, "expected parameter 'alias' to be non-null");
            $.authorizationRuleName = Objects.requireNonNull($.authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
