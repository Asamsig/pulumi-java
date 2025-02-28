// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.CopyProgressDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SqlDbMigrationStatusDetailsResponse {
    /**
     * @return Details on progress of ADF copy activities.
     * 
     */
    private final List<CopyProgressDetailsResponse> listOfCopyProgressDetails;
    /**
     * @return Current State of Migration.
     * 
     */
    private final String migrationState;
    /**
     * @return Sql Data Copy errors, if any.
     * 
     */
    private final List<String> sqlDataCopyErrors;

    @CustomType.Constructor
    private SqlDbMigrationStatusDetailsResponse(
        @CustomType.Parameter("listOfCopyProgressDetails") List<CopyProgressDetailsResponse> listOfCopyProgressDetails,
        @CustomType.Parameter("migrationState") String migrationState,
        @CustomType.Parameter("sqlDataCopyErrors") List<String> sqlDataCopyErrors) {
        this.listOfCopyProgressDetails = listOfCopyProgressDetails;
        this.migrationState = migrationState;
        this.sqlDataCopyErrors = sqlDataCopyErrors;
    }

    /**
     * @return Details on progress of ADF copy activities.
     * 
     */
    public List<CopyProgressDetailsResponse> listOfCopyProgressDetails() {
        return this.listOfCopyProgressDetails;
    }
    /**
     * @return Current State of Migration.
     * 
     */
    public String migrationState() {
        return this.migrationState;
    }
    /**
     * @return Sql Data Copy errors, if any.
     * 
     */
    public List<String> sqlDataCopyErrors() {
        return this.sqlDataCopyErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDbMigrationStatusDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CopyProgressDetailsResponse> listOfCopyProgressDetails;
        private String migrationState;
        private List<String> sqlDataCopyErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDbMigrationStatusDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listOfCopyProgressDetails = defaults.listOfCopyProgressDetails;
    	      this.migrationState = defaults.migrationState;
    	      this.sqlDataCopyErrors = defaults.sqlDataCopyErrors;
        }

        public Builder listOfCopyProgressDetails(List<CopyProgressDetailsResponse> listOfCopyProgressDetails) {
            this.listOfCopyProgressDetails = Objects.requireNonNull(listOfCopyProgressDetails);
            return this;
        }
        public Builder listOfCopyProgressDetails(CopyProgressDetailsResponse... listOfCopyProgressDetails) {
            return listOfCopyProgressDetails(List.of(listOfCopyProgressDetails));
        }
        public Builder migrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }
        public Builder sqlDataCopyErrors(List<String> sqlDataCopyErrors) {
            this.sqlDataCopyErrors = Objects.requireNonNull(sqlDataCopyErrors);
            return this;
        }
        public Builder sqlDataCopyErrors(String... sqlDataCopyErrors) {
            return sqlDataCopyErrors(List.of(sqlDataCopyErrors));
        }        public SqlDbMigrationStatusDetailsResponse build() {
            return new SqlDbMigrationStatusDetailsResponse(listOfCopyProgressDetails, migrationState, sqlDataCopyErrors);
        }
    }
}
