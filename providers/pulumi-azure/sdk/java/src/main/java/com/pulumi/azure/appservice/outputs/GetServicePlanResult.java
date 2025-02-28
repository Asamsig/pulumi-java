// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServicePlanResult {
    /**
     * @return The ID of the App Service Environment this Service Plan is part of.
     * 
     */
    private final String appServiceEnvironmentId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A string representing the Kind of Service Plan.
     * 
     */
    private final String kind;
    /**
     * @return The Azure Region where the Service Plan exists.
     * 
     */
    private final String location;
    /**
     * @return The maximum number of workers in use in an Elastic SKU Plan.
     * 
     */
    private final Integer maximumElasticWorkerCount;
    private final String name;
    /**
     * @return The O/S type for the App Services hosted in this plan.
     * 
     */
    private final String osType;
    /**
     * @return Is Per Site Scaling be enabled?
     * 
     */
    private final Boolean perSiteScalingEnabled;
    /**
     * @return Whether this is a reserved Service Plan Type. `true` if `os_type` is `Linux`, otherwise `false`.
     * 
     */
    private final Boolean reserved;
    private final String resourceGroupName;
    /**
     * @return The SKU for the Service Plan.
     * 
     */
    private final String skuName;
    /**
     * @return A mapping of tags assigned to the Service Plan.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The number of Workers (instances) allocated.
     * 
     */
    private final Integer workerCount;
    /**
     * @return Is the Service Plan balance across Availability Zones in the region?
     * 
     */
    private final Boolean zoneBalancingEnabled;

    @CustomType.Constructor
    private GetServicePlanResult(
        @CustomType.Parameter("appServiceEnvironmentId") String appServiceEnvironmentId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("maximumElasticWorkerCount") Integer maximumElasticWorkerCount,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("osType") String osType,
        @CustomType.Parameter("perSiteScalingEnabled") Boolean perSiteScalingEnabled,
        @CustomType.Parameter("reserved") Boolean reserved,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("skuName") String skuName,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("workerCount") Integer workerCount,
        @CustomType.Parameter("zoneBalancingEnabled") Boolean zoneBalancingEnabled) {
        this.appServiceEnvironmentId = appServiceEnvironmentId;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.maximumElasticWorkerCount = maximumElasticWorkerCount;
        this.name = name;
        this.osType = osType;
        this.perSiteScalingEnabled = perSiteScalingEnabled;
        this.reserved = reserved;
        this.resourceGroupName = resourceGroupName;
        this.skuName = skuName;
        this.tags = tags;
        this.workerCount = workerCount;
        this.zoneBalancingEnabled = zoneBalancingEnabled;
    }

    /**
     * @return The ID of the App Service Environment this Service Plan is part of.
     * 
     */
    public String appServiceEnvironmentId() {
        return this.appServiceEnvironmentId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A string representing the Kind of Service Plan.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The Azure Region where the Service Plan exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The maximum number of workers in use in an Elastic SKU Plan.
     * 
     */
    public Integer maximumElasticWorkerCount() {
        return this.maximumElasticWorkerCount;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The O/S type for the App Services hosted in this plan.
     * 
     */
    public String osType() {
        return this.osType;
    }
    /**
     * @return Is Per Site Scaling be enabled?
     * 
     */
    public Boolean perSiteScalingEnabled() {
        return this.perSiteScalingEnabled;
    }
    /**
     * @return Whether this is a reserved Service Plan Type. `true` if `os_type` is `Linux`, otherwise `false`.
     * 
     */
    public Boolean reserved() {
        return this.reserved;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The SKU for the Service Plan.
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return A mapping of tags assigned to the Service Plan.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The number of Workers (instances) allocated.
     * 
     */
    public Integer workerCount() {
        return this.workerCount;
    }
    /**
     * @return Is the Service Plan balance across Availability Zones in the region?
     * 
     */
    public Boolean zoneBalancingEnabled() {
        return this.zoneBalancingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicePlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appServiceEnvironmentId;
        private String id;
        private String kind;
        private String location;
        private Integer maximumElasticWorkerCount;
        private String name;
        private String osType;
        private Boolean perSiteScalingEnabled;
        private Boolean reserved;
        private String resourceGroupName;
        private String skuName;
        private Map<String,String> tags;
        private Integer workerCount;
        private Boolean zoneBalancingEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServicePlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appServiceEnvironmentId = defaults.appServiceEnvironmentId;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.maximumElasticWorkerCount = defaults.maximumElasticWorkerCount;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.perSiteScalingEnabled = defaults.perSiteScalingEnabled;
    	      this.reserved = defaults.reserved;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skuName = defaults.skuName;
    	      this.tags = defaults.tags;
    	      this.workerCount = defaults.workerCount;
    	      this.zoneBalancingEnabled = defaults.zoneBalancingEnabled;
        }

        public Builder appServiceEnvironmentId(String appServiceEnvironmentId) {
            this.appServiceEnvironmentId = Objects.requireNonNull(appServiceEnvironmentId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder maximumElasticWorkerCount(Integer maximumElasticWorkerCount) {
            this.maximumElasticWorkerCount = Objects.requireNonNull(maximumElasticWorkerCount);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder perSiteScalingEnabled(Boolean perSiteScalingEnabled) {
            this.perSiteScalingEnabled = Objects.requireNonNull(perSiteScalingEnabled);
            return this;
        }
        public Builder reserved(Boolean reserved) {
            this.reserved = Objects.requireNonNull(reserved);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder workerCount(Integer workerCount) {
            this.workerCount = Objects.requireNonNull(workerCount);
            return this;
        }
        public Builder zoneBalancingEnabled(Boolean zoneBalancingEnabled) {
            this.zoneBalancingEnabled = Objects.requireNonNull(zoneBalancingEnabled);
            return this;
        }        public GetServicePlanResult build() {
            return new GetServicePlanResult(appServiceEnvironmentId, id, kind, location, maximumElasticWorkerCount, name, osType, perSiteScalingEnabled, reserved, resourceGroupName, skuName, tags, workerCount, zoneBalancingEnabled);
        }
    }
}
