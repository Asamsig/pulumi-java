// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlDbSyncDatabaseInputResponse;
import com.pulumi.azurenative.datamigration.outputs.MigrationValidationOptionsResponse;
import com.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrateSqlServerSqlDbSyncTaskInputResponse {
    /**
     * @return Databases to migrate
     * 
     */
    private final List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases;
    /**
     * @return Information for connecting to source
     * 
     */
    private final SqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * @return Information for connecting to target
     * 
     */
    private final SqlConnectionInfoResponse targetConnectionInfo;
    /**
     * @return Validation options
     * 
     */
    private final @Nullable MigrationValidationOptionsResponse validationOptions;

    @CustomType.Constructor
    private MigrateSqlServerSqlDbSyncTaskInputResponse(
        @CustomType.Parameter("selectedDatabases") List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases,
        @CustomType.Parameter("sourceConnectionInfo") SqlConnectionInfoResponse sourceConnectionInfo,
        @CustomType.Parameter("targetConnectionInfo") SqlConnectionInfoResponse targetConnectionInfo,
        @CustomType.Parameter("validationOptions") @Nullable MigrationValidationOptionsResponse validationOptions) {
        this.selectedDatabases = selectedDatabases;
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.targetConnectionInfo = targetConnectionInfo;
        this.validationOptions = validationOptions;
    }

    /**
     * @return Databases to migrate
     * 
     */
    public List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases() {
        return this.selectedDatabases;
    }
    /**
     * @return Information for connecting to source
     * 
     */
    public SqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * @return Information for connecting to target
     * 
     */
    public SqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }
    /**
     * @return Validation options
     * 
     */
    public Optional<MigrationValidationOptionsResponse> validationOptions() {
        return Optional.ofNullable(this.validationOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;
        private @Nullable MigrationValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder selectedDatabases(List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }
        public Builder selectedDatabases(MigrateSqlServerSqlDbSyncDatabaseInputResponse... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }
        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public Builder targetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public Builder validationOptions(@Nullable MigrationValidationOptionsResponse validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }        public MigrateSqlServerSqlDbSyncTaskInputResponse build() {
            return new MigrateSqlServerSqlDbSyncTaskInputResponse(selectedDatabases, sourceConnectionInfo, targetConnectionInfo, validationOptions);
        }
    }
}
