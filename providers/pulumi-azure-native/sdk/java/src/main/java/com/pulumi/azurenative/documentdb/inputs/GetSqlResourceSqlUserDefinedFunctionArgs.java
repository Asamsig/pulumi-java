// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlResourceSqlUserDefinedFunctionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlResourceSqlUserDefinedFunctionArgs Empty = new GetSqlResourceSqlUserDefinedFunctionArgs();

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
     * Cosmos DB userDefinedFunction name.
     * 
     */
    @Import(name="userDefinedFunctionName", required=true)
    private Output<String> userDefinedFunctionName;

    /**
     * @return Cosmos DB userDefinedFunction name.
     * 
     */
    public Output<String> userDefinedFunctionName() {
        return this.userDefinedFunctionName;
    }

    private GetSqlResourceSqlUserDefinedFunctionArgs() {}

    private GetSqlResourceSqlUserDefinedFunctionArgs(GetSqlResourceSqlUserDefinedFunctionArgs $) {
        this.accountName = $.accountName;
        this.containerName = $.containerName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.userDefinedFunctionName = $.userDefinedFunctionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlResourceSqlUserDefinedFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlResourceSqlUserDefinedFunctionArgs $;

        public Builder() {
            $ = new GetSqlResourceSqlUserDefinedFunctionArgs();
        }

        public Builder(GetSqlResourceSqlUserDefinedFunctionArgs defaults) {
            $ = new GetSqlResourceSqlUserDefinedFunctionArgs(Objects.requireNonNull(defaults));
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
         * @param userDefinedFunctionName Cosmos DB userDefinedFunction name.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFunctionName(Output<String> userDefinedFunctionName) {
            $.userDefinedFunctionName = userDefinedFunctionName;
            return this;
        }

        /**
         * @param userDefinedFunctionName Cosmos DB userDefinedFunction name.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFunctionName(String userDefinedFunctionName) {
            return userDefinedFunctionName(Output.of(userDefinedFunctionName));
        }

        public GetSqlResourceSqlUserDefinedFunctionArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.userDefinedFunctionName = Objects.requireNonNull($.userDefinedFunctionName, "expected parameter 'userDefinedFunctionName' to be non-null");
            return $;
        }
    }

}
