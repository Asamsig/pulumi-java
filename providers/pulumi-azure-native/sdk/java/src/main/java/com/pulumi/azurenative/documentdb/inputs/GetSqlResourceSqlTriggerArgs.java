// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlResourceSqlTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlResourceSqlTriggerArgs Empty = new GetSqlResourceSqlTriggerArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Cosmos DB database account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB container name.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return Cosmos DB container name.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return Cosmos DB database name.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

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
     * Cosmos DB trigger name.
     * 
     */
    @Import(name="triggerName", required=true)
    private Output<String> triggerName;

    /**
     * @return Cosmos DB trigger name.
     * 
     */
    public Output<String> triggerName() {
        return this.triggerName;
    }

    private GetSqlResourceSqlTriggerArgs() {}

    private GetSqlResourceSqlTriggerArgs(GetSqlResourceSqlTriggerArgs $) {
        this.accountName = $.accountName;
        this.containerName = $.containerName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.triggerName = $.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlResourceSqlTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlResourceSqlTriggerArgs $;

        public Builder() {
            $ = new GetSqlResourceSqlTriggerArgs();
        }

        public Builder(GetSqlResourceSqlTriggerArgs defaults) {
            $ = new GetSqlResourceSqlTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param containerName Cosmos DB container name.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName Cosmos DB container name.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param databaseName Cosmos DB database name.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Cosmos DB database name.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
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
         * @param triggerName Cosmos DB trigger name.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(Output<String> triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        /**
         * @param triggerName Cosmos DB trigger name.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(String triggerName) {
            return triggerName(Output.of(triggerName));
        }

        public GetSqlResourceSqlTriggerArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            return $;
        }
    }

}
