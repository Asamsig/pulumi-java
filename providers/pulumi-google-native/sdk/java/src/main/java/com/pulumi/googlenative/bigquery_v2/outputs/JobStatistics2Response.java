// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery_v2.outputs.BiEngineStatisticsResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.BigQueryModelTrainingResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.DatasetReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.DmlStatisticsResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.ExplainQueryStageResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.JobStatistics2ReservationUsageItemResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.MlStatisticsResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.QueryParameterResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.QueryTimelineSampleResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.RoutineReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.RowAccessPolicyReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.TableSchemaResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class JobStatistics2Response {
    /**
     * @return BI Engine specific Statistics. [Output-only] BI Engine specific Statistics.
     * 
     */
    private final BiEngineStatisticsResponse biEngineStatistics;
    /**
     * @return Billing tier for the job.
     * 
     */
    private final Integer billingTier;
    /**
     * @return Whether the query result was fetched from the query cache.
     * 
     */
    private final Boolean cacheHit;
    /**
     * @return [Preview] The number of row access policies affected by a DDL statement. Present only for DROP ALL ROW ACCESS POLICIES queries.
     * 
     */
    private final String ddlAffectedRowAccessPolicyCount;
    /**
     * @return The DDL destination table. Present only for ALTER TABLE RENAME TO queries. Note that ddl_target_table is used just for its type information.
     * 
     */
    private final TableReferenceResponse ddlDestinationTable;
    /**
     * @return The DDL operation performed, possibly dependent on the pre-existence of the DDL target. Possible values (new values might be added in the future): &#34;CREATE&#34;: The query created the DDL target. &#34;SKIP&#34;: No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. &#34;REPLACE&#34;: The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the table already exists. &#34;DROP&#34;: The query deleted the DDL target.
     * 
     */
    private final String ddlOperationPerformed;
    /**
     * @return The DDL target dataset. Present only for CREATE/ALTER/DROP SCHEMA queries.
     * 
     */
    private final DatasetReferenceResponse ddlTargetDataset;
    /**
     * @return The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE queries.
     * 
     */
    private final RoutineReferenceResponse ddlTargetRoutine;
    /**
     * @return [Preview] The DDL target row access policy. Present only for CREATE/DROP ROW ACCESS POLICY queries.
     * 
     */
    private final RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy;
    /**
     * @return The DDL target table. Present only for CREATE/DROP TABLE/VIEW and DROP ALL ROW ACCESS POLICIES queries.
     * 
     */
    private final TableReferenceResponse ddlTargetTable;
    /**
     * @return Detailed statistics for DML statements Present only for DML statements INSERT, UPDATE, DELETE or TRUNCATE.
     * 
     */
    private final DmlStatisticsResponse dmlStats;
    /**
     * @return The original estimate of bytes processed for the job.
     * 
     */
    private final String estimatedBytesProcessed;
    /**
     * @return Statistics of a BigQuery ML training job.
     * 
     */
    private final MlStatisticsResponse mlStatistics;
    /**
     * @return [Output-only, Beta] Information about create model query job progress.
     * 
     */
    private final BigQueryModelTrainingResponse modelTraining;
    /**
     * @return [Output-only, Beta] Deprecated; do not use.
     * 
     * @deprecated
     * [Output-only, Beta] Deprecated; do not use.
     * 
     */
    @Deprecated /* [Output-only, Beta] Deprecated; do not use. */
    private final Integer modelTrainingCurrentIteration;
    /**
     * @return [Output-only, Beta] Deprecated; do not use.
     * 
     * @deprecated
     * [Output-only, Beta] Deprecated; do not use.
     * 
     */
    @Deprecated /* [Output-only, Beta] Deprecated; do not use. */
    private final String modelTrainingExpectedTotalIteration;
    /**
     * @return The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.
     * 
     */
    private final String numDmlAffectedRows;
    /**
     * @return Describes execution plan for the query.
     * 
     */
    private final List<ExplainQueryStageResponse> queryPlan;
    /**
     * @return Referenced routines (persistent user-defined functions and stored procedures) for the job.
     * 
     */
    private final List<RoutineReferenceResponse> referencedRoutines;
    /**
     * @return Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list.
     * 
     */
    private final List<TableReferenceResponse> referencedTables;
    /**
     * @return Job resource usage breakdown by reservation.
     * 
     */
    private final List<JobStatistics2ReservationUsageItemResponse> reservationUsage;
    /**
     * @return The schema of the results. Present only for successful dry run of non-legacy SQL queries.
     * 
     */
    private final TableSchemaResponse schema;
    /**
     * @return The type of query statement, if valid. Possible values (new values might be added in the future): &#34;SELECT&#34;: SELECT query. &#34;INSERT&#34;: INSERT query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. &#34;UPDATE&#34;: UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. &#34;DELETE&#34;: DELETE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. &#34;MERGE&#34;: MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. &#34;ALTER_TABLE&#34;: ALTER TABLE query. &#34;ALTER_VIEW&#34;: ALTER VIEW query. &#34;ASSERT&#34;: ASSERT condition AS &#39;description&#39;. &#34;CREATE_FUNCTION&#34;: CREATE FUNCTION query. &#34;CREATE_MODEL&#34;: CREATE [OR REPLACE] MODEL ... AS SELECT ... . &#34;CREATE_PROCEDURE&#34;: CREATE PROCEDURE query. &#34;CREATE_TABLE&#34;: CREATE [OR REPLACE] TABLE without AS SELECT. &#34;CREATE_TABLE_AS_SELECT&#34;: CREATE [OR REPLACE] TABLE ... AS SELECT ... . &#34;CREATE_VIEW&#34;: CREATE [OR REPLACE] VIEW ... AS SELECT ... . &#34;DROP_FUNCTION&#34; : DROP FUNCTION query. &#34;DROP_PROCEDURE&#34;: DROP PROCEDURE query. &#34;DROP_TABLE&#34;: DROP TABLE query. &#34;DROP_VIEW&#34;: DROP VIEW query.
     * 
     */
    private final String statementType;
    /**
     * @return [Beta] Describes a timeline of job execution.
     * 
     */
    private final List<QueryTimelineSampleResponse> timeline;
    /**
     * @return Total bytes billed for the job.
     * 
     */
    private final String totalBytesBilled;
    /**
     * @return Total bytes processed for the job.
     * 
     */
    private final String totalBytesProcessed;
    /**
     * @return For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
     * 
     */
    private final String totalBytesProcessedAccuracy;
    /**
     * @return Total number of partitions processed from all partitioned tables referenced in the job.
     * 
     */
    private final String totalPartitionsProcessed;
    /**
     * @return Slot-milliseconds for the job.
     * 
     */
    private final String totalSlotMs;
    /**
     * @return Standard SQL only: list of undeclared query parameters detected during a dry run validation.
     * 
     */
    private final List<QueryParameterResponse> undeclaredQueryParameters;

    @CustomType.Constructor
    private JobStatistics2Response(
        @CustomType.Parameter("biEngineStatistics") BiEngineStatisticsResponse biEngineStatistics,
        @CustomType.Parameter("billingTier") Integer billingTier,
        @CustomType.Parameter("cacheHit") Boolean cacheHit,
        @CustomType.Parameter("ddlAffectedRowAccessPolicyCount") String ddlAffectedRowAccessPolicyCount,
        @CustomType.Parameter("ddlDestinationTable") TableReferenceResponse ddlDestinationTable,
        @CustomType.Parameter("ddlOperationPerformed") String ddlOperationPerformed,
        @CustomType.Parameter("ddlTargetDataset") DatasetReferenceResponse ddlTargetDataset,
        @CustomType.Parameter("ddlTargetRoutine") RoutineReferenceResponse ddlTargetRoutine,
        @CustomType.Parameter("ddlTargetRowAccessPolicy") RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy,
        @CustomType.Parameter("ddlTargetTable") TableReferenceResponse ddlTargetTable,
        @CustomType.Parameter("dmlStats") DmlStatisticsResponse dmlStats,
        @CustomType.Parameter("estimatedBytesProcessed") String estimatedBytesProcessed,
        @CustomType.Parameter("mlStatistics") MlStatisticsResponse mlStatistics,
        @CustomType.Parameter("modelTraining") BigQueryModelTrainingResponse modelTraining,
        @CustomType.Parameter("modelTrainingCurrentIteration") Integer modelTrainingCurrentIteration,
        @CustomType.Parameter("modelTrainingExpectedTotalIteration") String modelTrainingExpectedTotalIteration,
        @CustomType.Parameter("numDmlAffectedRows") String numDmlAffectedRows,
        @CustomType.Parameter("queryPlan") List<ExplainQueryStageResponse> queryPlan,
        @CustomType.Parameter("referencedRoutines") List<RoutineReferenceResponse> referencedRoutines,
        @CustomType.Parameter("referencedTables") List<TableReferenceResponse> referencedTables,
        @CustomType.Parameter("reservationUsage") List<JobStatistics2ReservationUsageItemResponse> reservationUsage,
        @CustomType.Parameter("schema") TableSchemaResponse schema,
        @CustomType.Parameter("statementType") String statementType,
        @CustomType.Parameter("timeline") List<QueryTimelineSampleResponse> timeline,
        @CustomType.Parameter("totalBytesBilled") String totalBytesBilled,
        @CustomType.Parameter("totalBytesProcessed") String totalBytesProcessed,
        @CustomType.Parameter("totalBytesProcessedAccuracy") String totalBytesProcessedAccuracy,
        @CustomType.Parameter("totalPartitionsProcessed") String totalPartitionsProcessed,
        @CustomType.Parameter("totalSlotMs") String totalSlotMs,
        @CustomType.Parameter("undeclaredQueryParameters") List<QueryParameterResponse> undeclaredQueryParameters) {
        this.biEngineStatistics = biEngineStatistics;
        this.billingTier = billingTier;
        this.cacheHit = cacheHit;
        this.ddlAffectedRowAccessPolicyCount = ddlAffectedRowAccessPolicyCount;
        this.ddlDestinationTable = ddlDestinationTable;
        this.ddlOperationPerformed = ddlOperationPerformed;
        this.ddlTargetDataset = ddlTargetDataset;
        this.ddlTargetRoutine = ddlTargetRoutine;
        this.ddlTargetRowAccessPolicy = ddlTargetRowAccessPolicy;
        this.ddlTargetTable = ddlTargetTable;
        this.dmlStats = dmlStats;
        this.estimatedBytesProcessed = estimatedBytesProcessed;
        this.mlStatistics = mlStatistics;
        this.modelTraining = modelTraining;
        this.modelTrainingCurrentIteration = modelTrainingCurrentIteration;
        this.modelTrainingExpectedTotalIteration = modelTrainingExpectedTotalIteration;
        this.numDmlAffectedRows = numDmlAffectedRows;
        this.queryPlan = queryPlan;
        this.referencedRoutines = referencedRoutines;
        this.referencedTables = referencedTables;
        this.reservationUsage = reservationUsage;
        this.schema = schema;
        this.statementType = statementType;
        this.timeline = timeline;
        this.totalBytesBilled = totalBytesBilled;
        this.totalBytesProcessed = totalBytesProcessed;
        this.totalBytesProcessedAccuracy = totalBytesProcessedAccuracy;
        this.totalPartitionsProcessed = totalPartitionsProcessed;
        this.totalSlotMs = totalSlotMs;
        this.undeclaredQueryParameters = undeclaredQueryParameters;
    }

    /**
     * @return BI Engine specific Statistics. [Output-only] BI Engine specific Statistics.
     * 
     */
    public BiEngineStatisticsResponse biEngineStatistics() {
        return this.biEngineStatistics;
    }
    /**
     * @return Billing tier for the job.
     * 
     */
    public Integer billingTier() {
        return this.billingTier;
    }
    /**
     * @return Whether the query result was fetched from the query cache.
     * 
     */
    public Boolean cacheHit() {
        return this.cacheHit;
    }
    /**
     * @return [Preview] The number of row access policies affected by a DDL statement. Present only for DROP ALL ROW ACCESS POLICIES queries.
     * 
     */
    public String ddlAffectedRowAccessPolicyCount() {
        return this.ddlAffectedRowAccessPolicyCount;
    }
    /**
     * @return The DDL destination table. Present only for ALTER TABLE RENAME TO queries. Note that ddl_target_table is used just for its type information.
     * 
     */
    public TableReferenceResponse ddlDestinationTable() {
        return this.ddlDestinationTable;
    }
    /**
     * @return The DDL operation performed, possibly dependent on the pre-existence of the DDL target. Possible values (new values might be added in the future): &#34;CREATE&#34;: The query created the DDL target. &#34;SKIP&#34;: No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. &#34;REPLACE&#34;: The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the table already exists. &#34;DROP&#34;: The query deleted the DDL target.
     * 
     */
    public String ddlOperationPerformed() {
        return this.ddlOperationPerformed;
    }
    /**
     * @return The DDL target dataset. Present only for CREATE/ALTER/DROP SCHEMA queries.
     * 
     */
    public DatasetReferenceResponse ddlTargetDataset() {
        return this.ddlTargetDataset;
    }
    /**
     * @return The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE queries.
     * 
     */
    public RoutineReferenceResponse ddlTargetRoutine() {
        return this.ddlTargetRoutine;
    }
    /**
     * @return [Preview] The DDL target row access policy. Present only for CREATE/DROP ROW ACCESS POLICY queries.
     * 
     */
    public RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy() {
        return this.ddlTargetRowAccessPolicy;
    }
    /**
     * @return The DDL target table. Present only for CREATE/DROP TABLE/VIEW and DROP ALL ROW ACCESS POLICIES queries.
     * 
     */
    public TableReferenceResponse ddlTargetTable() {
        return this.ddlTargetTable;
    }
    /**
     * @return Detailed statistics for DML statements Present only for DML statements INSERT, UPDATE, DELETE or TRUNCATE.
     * 
     */
    public DmlStatisticsResponse dmlStats() {
        return this.dmlStats;
    }
    /**
     * @return The original estimate of bytes processed for the job.
     * 
     */
    public String estimatedBytesProcessed() {
        return this.estimatedBytesProcessed;
    }
    /**
     * @return Statistics of a BigQuery ML training job.
     * 
     */
    public MlStatisticsResponse mlStatistics() {
        return this.mlStatistics;
    }
    /**
     * @return [Output-only, Beta] Information about create model query job progress.
     * 
     */
    public BigQueryModelTrainingResponse modelTraining() {
        return this.modelTraining;
    }
    /**
     * @return [Output-only, Beta] Deprecated; do not use.
     * 
     * @deprecated
     * [Output-only, Beta] Deprecated; do not use.
     * 
     */
    @Deprecated /* [Output-only, Beta] Deprecated; do not use. */
    public Integer modelTrainingCurrentIteration() {
        return this.modelTrainingCurrentIteration;
    }
    /**
     * @return [Output-only, Beta] Deprecated; do not use.
     * 
     * @deprecated
     * [Output-only, Beta] Deprecated; do not use.
     * 
     */
    @Deprecated /* [Output-only, Beta] Deprecated; do not use. */
    public String modelTrainingExpectedTotalIteration() {
        return this.modelTrainingExpectedTotalIteration;
    }
    /**
     * @return The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.
     * 
     */
    public String numDmlAffectedRows() {
        return this.numDmlAffectedRows;
    }
    /**
     * @return Describes execution plan for the query.
     * 
     */
    public List<ExplainQueryStageResponse> queryPlan() {
        return this.queryPlan;
    }
    /**
     * @return Referenced routines (persistent user-defined functions and stored procedures) for the job.
     * 
     */
    public List<RoutineReferenceResponse> referencedRoutines() {
        return this.referencedRoutines;
    }
    /**
     * @return Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list.
     * 
     */
    public List<TableReferenceResponse> referencedTables() {
        return this.referencedTables;
    }
    /**
     * @return Job resource usage breakdown by reservation.
     * 
     */
    public List<JobStatistics2ReservationUsageItemResponse> reservationUsage() {
        return this.reservationUsage;
    }
    /**
     * @return The schema of the results. Present only for successful dry run of non-legacy SQL queries.
     * 
     */
    public TableSchemaResponse schema() {
        return this.schema;
    }
    /**
     * @return The type of query statement, if valid. Possible values (new values might be added in the future): &#34;SELECT&#34;: SELECT query. &#34;INSERT&#34;: INSERT query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. &#34;UPDATE&#34;: UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. &#34;DELETE&#34;: DELETE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. &#34;MERGE&#34;: MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. &#34;ALTER_TABLE&#34;: ALTER TABLE query. &#34;ALTER_VIEW&#34;: ALTER VIEW query. &#34;ASSERT&#34;: ASSERT condition AS &#39;description&#39;. &#34;CREATE_FUNCTION&#34;: CREATE FUNCTION query. &#34;CREATE_MODEL&#34;: CREATE [OR REPLACE] MODEL ... AS SELECT ... . &#34;CREATE_PROCEDURE&#34;: CREATE PROCEDURE query. &#34;CREATE_TABLE&#34;: CREATE [OR REPLACE] TABLE without AS SELECT. &#34;CREATE_TABLE_AS_SELECT&#34;: CREATE [OR REPLACE] TABLE ... AS SELECT ... . &#34;CREATE_VIEW&#34;: CREATE [OR REPLACE] VIEW ... AS SELECT ... . &#34;DROP_FUNCTION&#34; : DROP FUNCTION query. &#34;DROP_PROCEDURE&#34;: DROP PROCEDURE query. &#34;DROP_TABLE&#34;: DROP TABLE query. &#34;DROP_VIEW&#34;: DROP VIEW query.
     * 
     */
    public String statementType() {
        return this.statementType;
    }
    /**
     * @return [Beta] Describes a timeline of job execution.
     * 
     */
    public List<QueryTimelineSampleResponse> timeline() {
        return this.timeline;
    }
    /**
     * @return Total bytes billed for the job.
     * 
     */
    public String totalBytesBilled() {
        return this.totalBytesBilled;
    }
    /**
     * @return Total bytes processed for the job.
     * 
     */
    public String totalBytesProcessed() {
        return this.totalBytesProcessed;
    }
    /**
     * @return For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
     * 
     */
    public String totalBytesProcessedAccuracy() {
        return this.totalBytesProcessedAccuracy;
    }
    /**
     * @return Total number of partitions processed from all partitioned tables referenced in the job.
     * 
     */
    public String totalPartitionsProcessed() {
        return this.totalPartitionsProcessed;
    }
    /**
     * @return Slot-milliseconds for the job.
     * 
     */
    public String totalSlotMs() {
        return this.totalSlotMs;
    }
    /**
     * @return Standard SQL only: list of undeclared query parameters detected during a dry run validation.
     * 
     */
    public List<QueryParameterResponse> undeclaredQueryParameters() {
        return this.undeclaredQueryParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatistics2Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BiEngineStatisticsResponse biEngineStatistics;
        private Integer billingTier;
        private Boolean cacheHit;
        private String ddlAffectedRowAccessPolicyCount;
        private TableReferenceResponse ddlDestinationTable;
        private String ddlOperationPerformed;
        private DatasetReferenceResponse ddlTargetDataset;
        private RoutineReferenceResponse ddlTargetRoutine;
        private RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy;
        private TableReferenceResponse ddlTargetTable;
        private DmlStatisticsResponse dmlStats;
        private String estimatedBytesProcessed;
        private MlStatisticsResponse mlStatistics;
        private BigQueryModelTrainingResponse modelTraining;
        private Integer modelTrainingCurrentIteration;
        private String modelTrainingExpectedTotalIteration;
        private String numDmlAffectedRows;
        private List<ExplainQueryStageResponse> queryPlan;
        private List<RoutineReferenceResponse> referencedRoutines;
        private List<TableReferenceResponse> referencedTables;
        private List<JobStatistics2ReservationUsageItemResponse> reservationUsage;
        private TableSchemaResponse schema;
        private String statementType;
        private List<QueryTimelineSampleResponse> timeline;
        private String totalBytesBilled;
        private String totalBytesProcessed;
        private String totalBytesProcessedAccuracy;
        private String totalPartitionsProcessed;
        private String totalSlotMs;
        private List<QueryParameterResponse> undeclaredQueryParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatistics2Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.biEngineStatistics = defaults.biEngineStatistics;
    	      this.billingTier = defaults.billingTier;
    	      this.cacheHit = defaults.cacheHit;
    	      this.ddlAffectedRowAccessPolicyCount = defaults.ddlAffectedRowAccessPolicyCount;
    	      this.ddlDestinationTable = defaults.ddlDestinationTable;
    	      this.ddlOperationPerformed = defaults.ddlOperationPerformed;
    	      this.ddlTargetDataset = defaults.ddlTargetDataset;
    	      this.ddlTargetRoutine = defaults.ddlTargetRoutine;
    	      this.ddlTargetRowAccessPolicy = defaults.ddlTargetRowAccessPolicy;
    	      this.ddlTargetTable = defaults.ddlTargetTable;
    	      this.dmlStats = defaults.dmlStats;
    	      this.estimatedBytesProcessed = defaults.estimatedBytesProcessed;
    	      this.mlStatistics = defaults.mlStatistics;
    	      this.modelTraining = defaults.modelTraining;
    	      this.modelTrainingCurrentIteration = defaults.modelTrainingCurrentIteration;
    	      this.modelTrainingExpectedTotalIteration = defaults.modelTrainingExpectedTotalIteration;
    	      this.numDmlAffectedRows = defaults.numDmlAffectedRows;
    	      this.queryPlan = defaults.queryPlan;
    	      this.referencedRoutines = defaults.referencedRoutines;
    	      this.referencedTables = defaults.referencedTables;
    	      this.reservationUsage = defaults.reservationUsage;
    	      this.schema = defaults.schema;
    	      this.statementType = defaults.statementType;
    	      this.timeline = defaults.timeline;
    	      this.totalBytesBilled = defaults.totalBytesBilled;
    	      this.totalBytesProcessed = defaults.totalBytesProcessed;
    	      this.totalBytesProcessedAccuracy = defaults.totalBytesProcessedAccuracy;
    	      this.totalPartitionsProcessed = defaults.totalPartitionsProcessed;
    	      this.totalSlotMs = defaults.totalSlotMs;
    	      this.undeclaredQueryParameters = defaults.undeclaredQueryParameters;
        }

        public Builder biEngineStatistics(BiEngineStatisticsResponse biEngineStatistics) {
            this.biEngineStatistics = Objects.requireNonNull(biEngineStatistics);
            return this;
        }
        public Builder billingTier(Integer billingTier) {
            this.billingTier = Objects.requireNonNull(billingTier);
            return this;
        }
        public Builder cacheHit(Boolean cacheHit) {
            this.cacheHit = Objects.requireNonNull(cacheHit);
            return this;
        }
        public Builder ddlAffectedRowAccessPolicyCount(String ddlAffectedRowAccessPolicyCount) {
            this.ddlAffectedRowAccessPolicyCount = Objects.requireNonNull(ddlAffectedRowAccessPolicyCount);
            return this;
        }
        public Builder ddlDestinationTable(TableReferenceResponse ddlDestinationTable) {
            this.ddlDestinationTable = Objects.requireNonNull(ddlDestinationTable);
            return this;
        }
        public Builder ddlOperationPerformed(String ddlOperationPerformed) {
            this.ddlOperationPerformed = Objects.requireNonNull(ddlOperationPerformed);
            return this;
        }
        public Builder ddlTargetDataset(DatasetReferenceResponse ddlTargetDataset) {
            this.ddlTargetDataset = Objects.requireNonNull(ddlTargetDataset);
            return this;
        }
        public Builder ddlTargetRoutine(RoutineReferenceResponse ddlTargetRoutine) {
            this.ddlTargetRoutine = Objects.requireNonNull(ddlTargetRoutine);
            return this;
        }
        public Builder ddlTargetRowAccessPolicy(RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy) {
            this.ddlTargetRowAccessPolicy = Objects.requireNonNull(ddlTargetRowAccessPolicy);
            return this;
        }
        public Builder ddlTargetTable(TableReferenceResponse ddlTargetTable) {
            this.ddlTargetTable = Objects.requireNonNull(ddlTargetTable);
            return this;
        }
        public Builder dmlStats(DmlStatisticsResponse dmlStats) {
            this.dmlStats = Objects.requireNonNull(dmlStats);
            return this;
        }
        public Builder estimatedBytesProcessed(String estimatedBytesProcessed) {
            this.estimatedBytesProcessed = Objects.requireNonNull(estimatedBytesProcessed);
            return this;
        }
        public Builder mlStatistics(MlStatisticsResponse mlStatistics) {
            this.mlStatistics = Objects.requireNonNull(mlStatistics);
            return this;
        }
        public Builder modelTraining(BigQueryModelTrainingResponse modelTraining) {
            this.modelTraining = Objects.requireNonNull(modelTraining);
            return this;
        }
        public Builder modelTrainingCurrentIteration(Integer modelTrainingCurrentIteration) {
            this.modelTrainingCurrentIteration = Objects.requireNonNull(modelTrainingCurrentIteration);
            return this;
        }
        public Builder modelTrainingExpectedTotalIteration(String modelTrainingExpectedTotalIteration) {
            this.modelTrainingExpectedTotalIteration = Objects.requireNonNull(modelTrainingExpectedTotalIteration);
            return this;
        }
        public Builder numDmlAffectedRows(String numDmlAffectedRows) {
            this.numDmlAffectedRows = Objects.requireNonNull(numDmlAffectedRows);
            return this;
        }
        public Builder queryPlan(List<ExplainQueryStageResponse> queryPlan) {
            this.queryPlan = Objects.requireNonNull(queryPlan);
            return this;
        }
        public Builder queryPlan(ExplainQueryStageResponse... queryPlan) {
            return queryPlan(List.of(queryPlan));
        }
        public Builder referencedRoutines(List<RoutineReferenceResponse> referencedRoutines) {
            this.referencedRoutines = Objects.requireNonNull(referencedRoutines);
            return this;
        }
        public Builder referencedRoutines(RoutineReferenceResponse... referencedRoutines) {
            return referencedRoutines(List.of(referencedRoutines));
        }
        public Builder referencedTables(List<TableReferenceResponse> referencedTables) {
            this.referencedTables = Objects.requireNonNull(referencedTables);
            return this;
        }
        public Builder referencedTables(TableReferenceResponse... referencedTables) {
            return referencedTables(List.of(referencedTables));
        }
        public Builder reservationUsage(List<JobStatistics2ReservationUsageItemResponse> reservationUsage) {
            this.reservationUsage = Objects.requireNonNull(reservationUsage);
            return this;
        }
        public Builder reservationUsage(JobStatistics2ReservationUsageItemResponse... reservationUsage) {
            return reservationUsage(List.of(reservationUsage));
        }
        public Builder schema(TableSchemaResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public Builder statementType(String statementType) {
            this.statementType = Objects.requireNonNull(statementType);
            return this;
        }
        public Builder timeline(List<QueryTimelineSampleResponse> timeline) {
            this.timeline = Objects.requireNonNull(timeline);
            return this;
        }
        public Builder timeline(QueryTimelineSampleResponse... timeline) {
            return timeline(List.of(timeline));
        }
        public Builder totalBytesBilled(String totalBytesBilled) {
            this.totalBytesBilled = Objects.requireNonNull(totalBytesBilled);
            return this;
        }
        public Builder totalBytesProcessed(String totalBytesProcessed) {
            this.totalBytesProcessed = Objects.requireNonNull(totalBytesProcessed);
            return this;
        }
        public Builder totalBytesProcessedAccuracy(String totalBytesProcessedAccuracy) {
            this.totalBytesProcessedAccuracy = Objects.requireNonNull(totalBytesProcessedAccuracy);
            return this;
        }
        public Builder totalPartitionsProcessed(String totalPartitionsProcessed) {
            this.totalPartitionsProcessed = Objects.requireNonNull(totalPartitionsProcessed);
            return this;
        }
        public Builder totalSlotMs(String totalSlotMs) {
            this.totalSlotMs = Objects.requireNonNull(totalSlotMs);
            return this;
        }
        public Builder undeclaredQueryParameters(List<QueryParameterResponse> undeclaredQueryParameters) {
            this.undeclaredQueryParameters = Objects.requireNonNull(undeclaredQueryParameters);
            return this;
        }
        public Builder undeclaredQueryParameters(QueryParameterResponse... undeclaredQueryParameters) {
            return undeclaredQueryParameters(List.of(undeclaredQueryParameters));
        }        public JobStatistics2Response build() {
            return new JobStatistics2Response(biEngineStatistics, billingTier, cacheHit, ddlAffectedRowAccessPolicyCount, ddlDestinationTable, ddlOperationPerformed, ddlTargetDataset, ddlTargetRoutine, ddlTargetRowAccessPolicy, ddlTargetTable, dmlStats, estimatedBytesProcessed, mlStatistics, modelTraining, modelTrainingCurrentIteration, modelTrainingExpectedTotalIteration, numDmlAffectedRows, queryPlan, referencedRoutines, referencedTables, reservationUsage, schema, statementType, timeline, totalBytesBilled, totalBytesProcessed, totalBytesProcessedAccuracy, totalPartitionsProcessed, totalSlotMs, undeclaredQueryParameters);
        }
    }
}
