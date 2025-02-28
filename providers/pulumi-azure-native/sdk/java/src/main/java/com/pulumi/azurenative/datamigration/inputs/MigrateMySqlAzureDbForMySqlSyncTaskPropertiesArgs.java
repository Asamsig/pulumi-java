// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.MigrateMySqlAzureDbForMySqlSyncTaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that migrates MySQL databases to Azure Database for MySQL for online migrations
 * 
 */
public final class MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs Empty = new MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
    private @Nullable Output<MigrateMySqlAzureDbForMySqlSyncTaskInputArgs> input;

    /**
     * @return Task input
     * 
     */
    public Optional<Output<MigrateMySqlAzureDbForMySqlSyncTaskInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Task type.
     * Expected value is &#39;Migrate.MySql.AzureDbForMySql.Sync&#39;.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return Task type.
     * Expected value is &#39;Migrate.MySql.AzureDbForMySql.Sync&#39;.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    private MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs() {}

    private MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs(MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs $) {
        this.input = $.input;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs $;

        public Builder() {
            $ = new MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs();
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs defaults) {
            $ = new MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param input Task input
         * 
         * @return builder
         * 
         */
        public Builder input(@Nullable Output<MigrateMySqlAzureDbForMySqlSyncTaskInputArgs> input) {
            $.input = input;
            return this;
        }

        /**
         * @param input Task input
         * 
         * @return builder
         * 
         */
        public Builder input(MigrateMySqlAzureDbForMySqlSyncTaskInputArgs input) {
            return input(Output.of(input));
        }

        /**
         * @param taskType Task type.
         * Expected value is &#39;Migrate.MySql.AzureDbForMySql.Sync&#39;.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType Task type.
         * Expected value is &#39;Migrate.MySql.AzureDbForMySql.Sync&#39;.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public MigrateMySqlAzureDbForMySqlSyncTaskPropertiesArgs build() {
            $.taskType = Codegen.stringProp("taskType").output().arg($.taskType).require();
            return $;
        }
    }

}
