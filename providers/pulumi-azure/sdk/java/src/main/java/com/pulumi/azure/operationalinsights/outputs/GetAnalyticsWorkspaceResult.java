// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.operationalinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAnalyticsWorkspaceResult {
    /**
     * @return The workspace daily quota for ingestion in GB.
     * 
     */
    private final Double dailyQuotaGb;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String location;
    private final String name;
    /**
     * @return The Primary shared key for the Log Analytics Workspace.
     * 
     */
    private final String primarySharedKey;
    private final String resourceGroupName;
    /**
     * @return The workspace data retention in days.
     * 
     */
    private final Integer retentionInDays;
    /**
     * @return The Secondary shared key for the Log Analytics Workspace.
     * 
     */
    private final String secondarySharedKey;
    /**
     * @return The SKU of the Log Analytics Workspace.
     * 
     */
    private final String sku;
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The Workspace (or Customer) ID for the Log Analytics Workspace.
     * 
     */
    private final String workspaceId;

    @CustomType.Constructor
    private GetAnalyticsWorkspaceResult(
        @CustomType.Parameter("dailyQuotaGb") Double dailyQuotaGb,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("primarySharedKey") String primarySharedKey,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("retentionInDays") Integer retentionInDays,
        @CustomType.Parameter("secondarySharedKey") String secondarySharedKey,
        @CustomType.Parameter("sku") String sku,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("workspaceId") String workspaceId) {
        this.dailyQuotaGb = dailyQuotaGb;
        this.id = id;
        this.location = location;
        this.name = name;
        this.primarySharedKey = primarySharedKey;
        this.resourceGroupName = resourceGroupName;
        this.retentionInDays = retentionInDays;
        this.secondarySharedKey = secondarySharedKey;
        this.sku = sku;
        this.tags = tags;
        this.workspaceId = workspaceId;
    }

    /**
     * @return The workspace daily quota for ingestion in GB.
     * 
     */
    public Double dailyQuotaGb() {
        return this.dailyQuotaGb;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The Primary shared key for the Log Analytics Workspace.
     * 
     */
    public String primarySharedKey() {
        return this.primarySharedKey;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The workspace data retention in days.
     * 
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }
    /**
     * @return The Secondary shared key for the Log Analytics Workspace.
     * 
     */
    public String secondarySharedKey() {
        return this.secondarySharedKey;
    }
    /**
     * @return The SKU of the Log Analytics Workspace.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The Workspace (or Customer) ID for the Log Analytics Workspace.
     * 
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnalyticsWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double dailyQuotaGb;
        private String id;
        private String location;
        private String name;
        private String primarySharedKey;
        private String resourceGroupName;
        private Integer retentionInDays;
        private String secondarySharedKey;
        private String sku;
        private Map<String,String> tags;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnalyticsWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyQuotaGb = defaults.dailyQuotaGb;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.primarySharedKey = defaults.primarySharedKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.secondarySharedKey = defaults.secondarySharedKey;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder dailyQuotaGb(Double dailyQuotaGb) {
            this.dailyQuotaGb = Objects.requireNonNull(dailyQuotaGb);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder primarySharedKey(String primarySharedKey) {
            this.primarySharedKey = Objects.requireNonNull(primarySharedKey);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder retentionInDays(Integer retentionInDays) {
            this.retentionInDays = Objects.requireNonNull(retentionInDays);
            return this;
        }
        public Builder secondarySharedKey(String secondarySharedKey) {
            this.secondarySharedKey = Objects.requireNonNull(secondarySharedKey);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }        public GetAnalyticsWorkspaceResult build() {
            return new GetAnalyticsWorkspaceResult(dailyQuotaGb, id, location, name, primarySharedKey, resourceGroupName, retentionInDays, secondarySharedKey, sku, tags, workspaceId);
        }
    }
}
