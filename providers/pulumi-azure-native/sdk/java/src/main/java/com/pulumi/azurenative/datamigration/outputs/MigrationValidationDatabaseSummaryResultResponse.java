// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MigrationValidationDatabaseSummaryResultResponse {
    /**
     * @return Validation end time
     * 
     */
    private final String endedOn;
    /**
     * @return Result identifier
     * 
     */
    private final String id;
    /**
     * @return Migration Identifier
     * 
     */
    private final String migrationId;
    /**
     * @return Name of the source database
     * 
     */
    private final String sourceDatabaseName;
    /**
     * @return Validation start time
     * 
     */
    private final String startedOn;
    /**
     * @return Current status of validation at the database level
     * 
     */
    private final String status;
    /**
     * @return Name of the target database
     * 
     */
    private final String targetDatabaseName;

    @CustomType.Constructor
    private MigrationValidationDatabaseSummaryResultResponse(
        @CustomType.Parameter("endedOn") String endedOn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("migrationId") String migrationId,
        @CustomType.Parameter("sourceDatabaseName") String sourceDatabaseName,
        @CustomType.Parameter("startedOn") String startedOn,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("targetDatabaseName") String targetDatabaseName) {
        this.endedOn = endedOn;
        this.id = id;
        this.migrationId = migrationId;
        this.sourceDatabaseName = sourceDatabaseName;
        this.startedOn = startedOn;
        this.status = status;
        this.targetDatabaseName = targetDatabaseName;
    }

    /**
     * @return Validation end time
     * 
     */
    public String endedOn() {
        return this.endedOn;
    }
    /**
     * @return Result identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Migration Identifier
     * 
     */
    public String migrationId() {
        return this.migrationId;
    }
    /**
     * @return Name of the source database
     * 
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }
    /**
     * @return Validation start time
     * 
     */
    public String startedOn() {
        return this.startedOn;
    }
    /**
     * @return Current status of validation at the database level
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Name of the target database
     * 
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationValidationDatabaseSummaryResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String id;
        private String migrationId;
        private String sourceDatabaseName;
        private String startedOn;
        private String status;
        private String targetDatabaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationValidationDatabaseSummaryResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.migrationId = defaults.migrationId;
    	      this.sourceDatabaseName = defaults.sourceDatabaseName;
    	      this.startedOn = defaults.startedOn;
    	      this.status = defaults.status;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
        }

        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder migrationId(String migrationId) {
            this.migrationId = Objects.requireNonNull(migrationId);
            return this;
        }
        public Builder sourceDatabaseName(String sourceDatabaseName) {
            this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder targetDatabaseName(String targetDatabaseName) {
            this.targetDatabaseName = Objects.requireNonNull(targetDatabaseName);
            return this;
        }        public MigrationValidationDatabaseSummaryResultResponse build() {
            return new MigrationValidationDatabaseSummaryResultResponse(endedOn, id, migrationId, sourceDatabaseName, startedOn, status, targetDatabaseName);
        }
    }
}
