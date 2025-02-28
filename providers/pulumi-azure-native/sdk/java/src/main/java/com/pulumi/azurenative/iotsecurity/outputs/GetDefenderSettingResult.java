// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.iotsecurity.outputs;

import com.pulumi.azurenative.iotsecurity.outputs.DefenderSettingsPropertiesResponseMdeIntegration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDefenderSettingResult {
    /**
     * @return Size of the device quota. Value is required to be in multiples of 100.
     * 
     */
    private final Integer deviceQuota;
    /**
     * @return End time of the evaluation period, if such exist
     * 
     */
    private final String evaluationEndTime;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return MDE integration configuration
     * 
     */
    private final DefenderSettingsPropertiesResponseMdeIntegration mdeIntegration;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return The kind of onboarding for the subscription
     * 
     */
    private final String onboardingKind;
    /**
     * @return Sentinel Workspace Resource Ids
     * 
     */
    private final List<String> sentinelWorkspaceResourceIds;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDefenderSettingResult(
        @CustomType.Parameter("deviceQuota") Integer deviceQuota,
        @CustomType.Parameter("evaluationEndTime") String evaluationEndTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("mdeIntegration") DefenderSettingsPropertiesResponseMdeIntegration mdeIntegration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("onboardingKind") String onboardingKind,
        @CustomType.Parameter("sentinelWorkspaceResourceIds") List<String> sentinelWorkspaceResourceIds,
        @CustomType.Parameter("type") String type) {
        this.deviceQuota = deviceQuota;
        this.evaluationEndTime = evaluationEndTime;
        this.id = id;
        this.mdeIntegration = mdeIntegration;
        this.name = name;
        this.onboardingKind = onboardingKind;
        this.sentinelWorkspaceResourceIds = sentinelWorkspaceResourceIds;
        this.type = type;
    }

    /**
     * @return Size of the device quota. Value is required to be in multiples of 100.
     * 
     */
    public Integer deviceQuota() {
        return this.deviceQuota;
    }
    /**
     * @return End time of the evaluation period, if such exist
     * 
     */
    public String evaluationEndTime() {
        return this.evaluationEndTime;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return MDE integration configuration
     * 
     */
    public DefenderSettingsPropertiesResponseMdeIntegration mdeIntegration() {
        return this.mdeIntegration;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The kind of onboarding for the subscription
     * 
     */
    public String onboardingKind() {
        return this.onboardingKind;
    }
    /**
     * @return Sentinel Workspace Resource Ids
     * 
     */
    public List<String> sentinelWorkspaceResourceIds() {
        return this.sentinelWorkspaceResourceIds;
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

    public static Builder builder(GetDefenderSettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer deviceQuota;
        private String evaluationEndTime;
        private String id;
        private DefenderSettingsPropertiesResponseMdeIntegration mdeIntegration;
        private String name;
        private String onboardingKind;
        private List<String> sentinelWorkspaceResourceIds;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefenderSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceQuota = defaults.deviceQuota;
    	      this.evaluationEndTime = defaults.evaluationEndTime;
    	      this.id = defaults.id;
    	      this.mdeIntegration = defaults.mdeIntegration;
    	      this.name = defaults.name;
    	      this.onboardingKind = defaults.onboardingKind;
    	      this.sentinelWorkspaceResourceIds = defaults.sentinelWorkspaceResourceIds;
    	      this.type = defaults.type;
        }

        public Builder deviceQuota(Integer deviceQuota) {
            this.deviceQuota = Objects.requireNonNull(deviceQuota);
            return this;
        }
        public Builder evaluationEndTime(String evaluationEndTime) {
            this.evaluationEndTime = Objects.requireNonNull(evaluationEndTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder mdeIntegration(DefenderSettingsPropertiesResponseMdeIntegration mdeIntegration) {
            this.mdeIntegration = Objects.requireNonNull(mdeIntegration);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder onboardingKind(String onboardingKind) {
            this.onboardingKind = Objects.requireNonNull(onboardingKind);
            return this;
        }
        public Builder sentinelWorkspaceResourceIds(List<String> sentinelWorkspaceResourceIds) {
            this.sentinelWorkspaceResourceIds = Objects.requireNonNull(sentinelWorkspaceResourceIds);
            return this;
        }
        public Builder sentinelWorkspaceResourceIds(String... sentinelWorkspaceResourceIds) {
            return sentinelWorkspaceResourceIds(List.of(sentinelWorkspaceResourceIds));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDefenderSettingResult build() {
            return new GetDefenderSettingResult(deviceQuota, evaluationEndTime, id, mdeIntegration, name, onboardingKind, sentinelWorkspaceResourceIds, type);
        }
    }
}
