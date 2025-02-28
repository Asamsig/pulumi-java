// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMongoDBResourceMongoRoleDefinitionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMongoDBResourceMongoRoleDefinitionPlainArgs Empty = new GetMongoDBResourceMongoRoleDefinitionPlainArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return Cosmos DB database account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The ID for the Role Definition {dbName.roleName}.
     * 
     */
    @Import(name="mongoRoleDefinitionId", required=true)
    private String mongoRoleDefinitionId;

    /**
     * @return The ID for the Role Definition {dbName.roleName}.
     * 
     */
    public String mongoRoleDefinitionId() {
        return this.mongoRoleDefinitionId;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMongoDBResourceMongoRoleDefinitionPlainArgs() {}

    private GetMongoDBResourceMongoRoleDefinitionPlainArgs(GetMongoDBResourceMongoRoleDefinitionPlainArgs $) {
        this.accountName = $.accountName;
        this.mongoRoleDefinitionId = $.mongoRoleDefinitionId;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMongoDBResourceMongoRoleDefinitionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMongoDBResourceMongoRoleDefinitionPlainArgs $;

        public Builder() {
            $ = new GetMongoDBResourceMongoRoleDefinitionPlainArgs();
        }

        public Builder(GetMongoDBResourceMongoRoleDefinitionPlainArgs defaults) {
            $ = new GetMongoDBResourceMongoRoleDefinitionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param mongoRoleDefinitionId The ID for the Role Definition {dbName.roleName}.
         * 
         * @return builder
         * 
         */
        public Builder mongoRoleDefinitionId(String mongoRoleDefinitionId) {
            $.mongoRoleDefinitionId = mongoRoleDefinitionId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetMongoDBResourceMongoRoleDefinitionPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.mongoRoleDefinitionId = Objects.requireNonNull($.mongoRoleDefinitionId, "expected parameter 'mongoRoleDefinitionId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
