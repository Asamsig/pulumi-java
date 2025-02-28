// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMigrateProjectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMigrateProjectPlainArgs Empty = new GetMigrateProjectPlainArgs();

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="migrateProjectName", required=true)
    private String migrateProjectName;

    /**
     * @return Name of the Azure Migrate project.
     * 
     */
    public String migrateProjectName() {
        return this.migrateProjectName;
    }

    /**
     * Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMigrateProjectPlainArgs() {}

    private GetMigrateProjectPlainArgs(GetMigrateProjectPlainArgs $) {
        this.migrateProjectName = $.migrateProjectName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMigrateProjectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMigrateProjectPlainArgs $;

        public Builder() {
            $ = new GetMigrateProjectPlainArgs();
        }

        public Builder(GetMigrateProjectPlainArgs defaults) {
            $ = new GetMigrateProjectPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param migrateProjectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder migrateProjectName(String migrateProjectName) {
            $.migrateProjectName = migrateProjectName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that migrate project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetMigrateProjectPlainArgs build() {
            $.migrateProjectName = Objects.requireNonNull($.migrateProjectName, "expected parameter 'migrateProjectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
