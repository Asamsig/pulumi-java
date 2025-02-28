// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceTemplateNetworkPerformanceConfig {
    /**
     * @return The egress bandwidth tier to enable. Possible values: TIER_1, DEFAULT
     * 
     */
    private final String totalEgressBandwidthTier;

    @CustomType.Constructor
    private InstanceTemplateNetworkPerformanceConfig(@CustomType.Parameter("totalEgressBandwidthTier") String totalEgressBandwidthTier) {
        this.totalEgressBandwidthTier = totalEgressBandwidthTier;
    }

    /**
     * @return The egress bandwidth tier to enable. Possible values: TIER_1, DEFAULT
     * 
     */
    public String totalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateNetworkPerformanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateNetworkPerformanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
            return this;
        }        public InstanceTemplateNetworkPerformanceConfig build() {
            return new InstanceTemplateNetworkPerformanceConfig(totalEgressBandwidthTier);
        }
    }
}
