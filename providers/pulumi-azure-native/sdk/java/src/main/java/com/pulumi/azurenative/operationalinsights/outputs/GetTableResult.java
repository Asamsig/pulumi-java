// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.azurenative.operationalinsights.outputs.RestoredLogsResponse;
import com.pulumi.azurenative.operationalinsights.outputs.ResultStatisticsResponse;
import com.pulumi.azurenative.operationalinsights.outputs.SchemaResponse;
import com.pulumi.azurenative.operationalinsights.outputs.SearchResultsResponse;
import com.pulumi.azurenative.operationalinsights.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTableResult {
    /**
     * @return The table data archive retention in days. Calculated as (totalRetentionInDays-retentionInDays)
     * 
     */
    private final Integer archiveRetentionInDays;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The timestamp that table plan was last modified (UTC).
     * 
     */
    private final String lastPlanModifiedDate;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Instruct the system how to handle and charge the logs ingested to this table.
     * 
     */
    private final @Nullable String plan;
    /**
     * @return Table&#39;s current provisioning state. If set to &#39;updating&#39;, indicates a resource lock due to ongoing operation, forbidding any update to the table until the ongoing operation is concluded.
     * 
     */
    private final String provisioningState;
    /**
     * @return Parameters of the restore operation that initiated this table.
     * 
     */
    private final @Nullable RestoredLogsResponse restoredLogs;
    /**
     * @return Search job execution statistics.
     * 
     */
    private final @Nullable ResultStatisticsResponse resultStatistics;
    /**
     * @return The table retention in days, between 4 and 730. Setting this property to -1 will default to the workspace retention.
     * 
     */
    private final @Nullable Integer retentionInDays;
    /**
     * @return Table schema.
     * 
     */
    private final @Nullable SchemaResponse schema;
    /**
     * @return Parameters of the search job that initiated this table.
     * 
     */
    private final @Nullable SearchResultsResponse searchResults;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The table total retention in days, between 4 and 2555. Setting this property to -1 will default to table retention.
     * 
     */
    private final @Nullable Integer totalRetentionInDays;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetTableResult(
        @CustomType.Parameter("archiveRetentionInDays") Integer archiveRetentionInDays,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastPlanModifiedDate") String lastPlanModifiedDate,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("plan") @Nullable String plan,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("restoredLogs") @Nullable RestoredLogsResponse restoredLogs,
        @CustomType.Parameter("resultStatistics") @Nullable ResultStatisticsResponse resultStatistics,
        @CustomType.Parameter("retentionInDays") @Nullable Integer retentionInDays,
        @CustomType.Parameter("schema") @Nullable SchemaResponse schema,
        @CustomType.Parameter("searchResults") @Nullable SearchResultsResponse searchResults,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("totalRetentionInDays") @Nullable Integer totalRetentionInDays,
        @CustomType.Parameter("type") String type) {
        this.archiveRetentionInDays = archiveRetentionInDays;
        this.id = id;
        this.lastPlanModifiedDate = lastPlanModifiedDate;
        this.name = name;
        this.plan = plan;
        this.provisioningState = provisioningState;
        this.restoredLogs = restoredLogs;
        this.resultStatistics = resultStatistics;
        this.retentionInDays = retentionInDays;
        this.schema = schema;
        this.searchResults = searchResults;
        this.systemData = systemData;
        this.totalRetentionInDays = totalRetentionInDays;
        this.type = type;
    }

    /**
     * @return The table data archive retention in days. Calculated as (totalRetentionInDays-retentionInDays)
     * 
     */
    public Integer archiveRetentionInDays() {
        return this.archiveRetentionInDays;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The timestamp that table plan was last modified (UTC).
     * 
     */
    public String lastPlanModifiedDate() {
        return this.lastPlanModifiedDate;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Instruct the system how to handle and charge the logs ingested to this table.
     * 
     */
    public Optional<String> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * @return Table&#39;s current provisioning state. If set to &#39;updating&#39;, indicates a resource lock due to ongoing operation, forbidding any update to the table until the ongoing operation is concluded.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Parameters of the restore operation that initiated this table.
     * 
     */
    public Optional<RestoredLogsResponse> restoredLogs() {
        return Optional.ofNullable(this.restoredLogs);
    }
    /**
     * @return Search job execution statistics.
     * 
     */
    public Optional<ResultStatisticsResponse> resultStatistics() {
        return Optional.ofNullable(this.resultStatistics);
    }
    /**
     * @return The table retention in days, between 4 and 730. Setting this property to -1 will default to the workspace retention.
     * 
     */
    public Optional<Integer> retentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }
    /**
     * @return Table schema.
     * 
     */
    public Optional<SchemaResponse> schema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * @return Parameters of the search job that initiated this table.
     * 
     */
    public Optional<SearchResultsResponse> searchResults() {
        return Optional.ofNullable(this.searchResults);
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The table total retention in days, between 4 and 2555. Setting this property to -1 will default to table retention.
     * 
     */
    public Optional<Integer> totalRetentionInDays() {
        return Optional.ofNullable(this.totalRetentionInDays);
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer archiveRetentionInDays;
        private String id;
        private String lastPlanModifiedDate;
        private String name;
        private @Nullable String plan;
        private String provisioningState;
        private @Nullable RestoredLogsResponse restoredLogs;
        private @Nullable ResultStatisticsResponse resultStatistics;
        private @Nullable Integer retentionInDays;
        private @Nullable SchemaResponse schema;
        private @Nullable SearchResultsResponse searchResults;
        private SystemDataResponse systemData;
        private @Nullable Integer totalRetentionInDays;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveRetentionInDays = defaults.archiveRetentionInDays;
    	      this.id = defaults.id;
    	      this.lastPlanModifiedDate = defaults.lastPlanModifiedDate;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.provisioningState = defaults.provisioningState;
    	      this.restoredLogs = defaults.restoredLogs;
    	      this.resultStatistics = defaults.resultStatistics;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.schema = defaults.schema;
    	      this.searchResults = defaults.searchResults;
    	      this.systemData = defaults.systemData;
    	      this.totalRetentionInDays = defaults.totalRetentionInDays;
    	      this.type = defaults.type;
        }

        public Builder archiveRetentionInDays(Integer archiveRetentionInDays) {
            this.archiveRetentionInDays = Objects.requireNonNull(archiveRetentionInDays);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastPlanModifiedDate(String lastPlanModifiedDate) {
            this.lastPlanModifiedDate = Objects.requireNonNull(lastPlanModifiedDate);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder plan(@Nullable String plan) {
            this.plan = plan;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder restoredLogs(@Nullable RestoredLogsResponse restoredLogs) {
            this.restoredLogs = restoredLogs;
            return this;
        }
        public Builder resultStatistics(@Nullable ResultStatisticsResponse resultStatistics) {
            this.resultStatistics = resultStatistics;
            return this;
        }
        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }
        public Builder schema(@Nullable SchemaResponse schema) {
            this.schema = schema;
            return this;
        }
        public Builder searchResults(@Nullable SearchResultsResponse searchResults) {
            this.searchResults = searchResults;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder totalRetentionInDays(@Nullable Integer totalRetentionInDays) {
            this.totalRetentionInDays = totalRetentionInDays;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetTableResult build() {
            return new GetTableResult(archiveRetentionInDays, id, lastPlanModifiedDate, name, plan, provisioningState, restoredLogs, resultStatistics, retentionInDays, schema, searchResults, systemData, totalRetentionInDays, type);
        }
    }
}
