// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.storagetransfer_v1.outputs.BandwidthLimitResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAgentPoolResult {
    /**
     * @return Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     * 
     */
    private final BandwidthLimitResponse bandwidthLimit;
    /**
     * @return Specifies the client-specified AgentPool description.
     * 
     */
    private final String displayName;
    /**
     * @return Specifies a unique string that identifies the agent pool. Format: `projects/{project_id}/agentPools/{agent_pool_id}`
     * 
     */
    private final String name;
    /**
     * @return Specifies the state of the AgentPool.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetAgentPoolResult(
        @CustomType.Parameter("bandwidthLimit") BandwidthLimitResponse bandwidthLimit,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state) {
        this.bandwidthLimit = bandwidthLimit;
        this.displayName = displayName;
        this.name = name;
        this.state = state;
    }

    /**
     * @return Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     * 
     */
    public BandwidthLimitResponse bandwidthLimit() {
        return this.bandwidthLimit;
    }
    /**
     * @return Specifies the client-specified AgentPool description.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Specifies a unique string that identifies the agent pool. Format: `projects/{project_id}/agentPools/{agent_pool_id}`
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the state of the AgentPool.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BandwidthLimitResponse bandwidthLimit;
        private String displayName;
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAgentPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthLimit = defaults.bandwidthLimit;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder bandwidthLimit(BandwidthLimitResponse bandwidthLimit) {
            this.bandwidthLimit = Objects.requireNonNull(bandwidthLimit);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetAgentPoolResult build() {
            return new GetAgentPoolResult(bandwidthLimit, displayName, name, state);
        }
    }
}
