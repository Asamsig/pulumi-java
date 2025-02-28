// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListEventHubKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListEventHubKeysArgs Empty = new ListEventHubKeysArgs();

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName", required=true)
    private Output<String> authorizationRuleName;

    /**
     * @return The authorization rule name.
     * 
     */
    public Output<String> authorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * The Event Hub name
     * 
     */
    @Import(name="eventHubName", required=true)
    private Output<String> eventHubName;

    /**
     * @return The Event Hub name
     * 
     */
    public Output<String> eventHubName() {
        return this.eventHubName;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The Namespace name
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group within the azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListEventHubKeysArgs() {}

    private ListEventHubKeysArgs(ListEventHubKeysArgs $) {
        this.authorizationRuleName = $.authorizationRuleName;
        this.eventHubName = $.eventHubName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListEventHubKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListEventHubKeysArgs $;

        public Builder() {
            $ = new ListEventHubKeysArgs();
        }

        public Builder(ListEventHubKeysArgs defaults) {
            $ = new ListEventHubKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationRuleName The authorization rule name.
         * 
         * @return builder
         * 
         */
        public Builder authorizationRuleName(Output<String> authorizationRuleName) {
            $.authorizationRuleName = authorizationRuleName;
            return this;
        }

        /**
         * @param authorizationRuleName The authorization rule name.
         * 
         * @return builder
         * 
         */
        public Builder authorizationRuleName(String authorizationRuleName) {
            return authorizationRuleName(Output.of(authorizationRuleName));
        }

        /**
         * @param eventHubName The Event Hub name
         * 
         * @return builder
         * 
         */
        public Builder eventHubName(Output<String> eventHubName) {
            $.eventHubName = eventHubName;
            return this;
        }

        /**
         * @param eventHubName The Event Hub name
         * 
         * @return builder
         * 
         */
        public Builder eventHubName(String eventHubName) {
            return eventHubName(Output.of(eventHubName));
        }

        /**
         * @param namespaceName The Namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The Namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param resourceGroupName Name of the resource group within the azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group within the azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ListEventHubKeysArgs build() {
            $.authorizationRuleName = Objects.requireNonNull($.authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
            $.eventHubName = Objects.requireNonNull($.eventHubName, "expected parameter 'eventHubName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
