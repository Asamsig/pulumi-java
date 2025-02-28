// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.outputs;

import com.pulumi.azurenative.servicefabric.outputs.ApplicationDeltaHealthPolicyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClusterUpgradeDeltaHealthPolicyResponse {
    /**
     * @return Defines the application delta health policy map used to evaluate the health of an application or one of its child entities when upgrading the cluster.
     * 
     */
    private final @Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies;
    /**
     * @return The maximum allowed percentage of applications health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the applications at the beginning of upgrade and the state of the applications at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits. System services are not included in this.
     * 
     */
    private final Integer maxPercentDeltaUnhealthyApplications;
    /**
     * @return The maximum allowed percentage of nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the nodes at the beginning of upgrade and the state of the nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     * 
     */
    private final Integer maxPercentDeltaUnhealthyNodes;
    /**
     * @return The maximum allowed percentage of upgrade domain nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the upgrade domain nodes at the beginning of upgrade and the state of the upgrade domain nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion for all completed upgrade domains to make sure the state of the upgrade domains is within tolerated limits.
     * 
     */
    private final Integer maxPercentUpgradeDomainDeltaUnhealthyNodes;

    @CustomType.Constructor
    private ClusterUpgradeDeltaHealthPolicyResponse(
        @CustomType.Parameter("applicationDeltaHealthPolicies") @Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies,
        @CustomType.Parameter("maxPercentDeltaUnhealthyApplications") Integer maxPercentDeltaUnhealthyApplications,
        @CustomType.Parameter("maxPercentDeltaUnhealthyNodes") Integer maxPercentDeltaUnhealthyNodes,
        @CustomType.Parameter("maxPercentUpgradeDomainDeltaUnhealthyNodes") Integer maxPercentUpgradeDomainDeltaUnhealthyNodes) {
        this.applicationDeltaHealthPolicies = applicationDeltaHealthPolicies;
        this.maxPercentDeltaUnhealthyApplications = maxPercentDeltaUnhealthyApplications;
        this.maxPercentDeltaUnhealthyNodes = maxPercentDeltaUnhealthyNodes;
        this.maxPercentUpgradeDomainDeltaUnhealthyNodes = maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    /**
     * @return Defines the application delta health policy map used to evaluate the health of an application or one of its child entities when upgrading the cluster.
     * 
     */
    public Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies() {
        return this.applicationDeltaHealthPolicies == null ? Map.of() : this.applicationDeltaHealthPolicies;
    }
    /**
     * @return The maximum allowed percentage of applications health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the applications at the beginning of upgrade and the state of the applications at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits. System services are not included in this.
     * 
     */
    public Integer maxPercentDeltaUnhealthyApplications() {
        return this.maxPercentDeltaUnhealthyApplications;
    }
    /**
     * @return The maximum allowed percentage of nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the nodes at the beginning of upgrade and the state of the nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     * 
     */
    public Integer maxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }
    /**
     * @return The maximum allowed percentage of upgrade domain nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the upgrade domain nodes at the beginning of upgrade and the state of the upgrade domain nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion for all completed upgrade domains to make sure the state of the upgrade domains is within tolerated limits.
     * 
     */
    public Integer maxPercentUpgradeDomainDeltaUnhealthyNodes() {
        return this.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterUpgradeDeltaHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies;
        private Integer maxPercentDeltaUnhealthyApplications;
        private Integer maxPercentDeltaUnhealthyNodes;
        private Integer maxPercentUpgradeDomainDeltaUnhealthyNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterUpgradeDeltaHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationDeltaHealthPolicies = defaults.applicationDeltaHealthPolicies;
    	      this.maxPercentDeltaUnhealthyApplications = defaults.maxPercentDeltaUnhealthyApplications;
    	      this.maxPercentDeltaUnhealthyNodes = defaults.maxPercentDeltaUnhealthyNodes;
    	      this.maxPercentUpgradeDomainDeltaUnhealthyNodes = defaults.maxPercentUpgradeDomainDeltaUnhealthyNodes;
        }

        public Builder applicationDeltaHealthPolicies(@Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies) {
            this.applicationDeltaHealthPolicies = applicationDeltaHealthPolicies;
            return this;
        }
        public Builder maxPercentDeltaUnhealthyApplications(Integer maxPercentDeltaUnhealthyApplications) {
            this.maxPercentDeltaUnhealthyApplications = Objects.requireNonNull(maxPercentDeltaUnhealthyApplications);
            return this;
        }
        public Builder maxPercentDeltaUnhealthyNodes(Integer maxPercentDeltaUnhealthyNodes) {
            this.maxPercentDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentDeltaUnhealthyNodes);
            return this;
        }
        public Builder maxPercentUpgradeDomainDeltaUnhealthyNodes(Integer maxPercentUpgradeDomainDeltaUnhealthyNodes) {
            this.maxPercentUpgradeDomainDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentUpgradeDomainDeltaUnhealthyNodes);
            return this;
        }        public ClusterUpgradeDeltaHealthPolicyResponse build() {
            return new ClusterUpgradeDeltaHealthPolicyResponse(applicationDeltaHealthPolicies, maxPercentDeltaUnhealthyApplications, maxPercentDeltaUnhealthyNodes, maxPercentUpgradeDomainDeltaUnhealthyNodes);
        }
    }
}
