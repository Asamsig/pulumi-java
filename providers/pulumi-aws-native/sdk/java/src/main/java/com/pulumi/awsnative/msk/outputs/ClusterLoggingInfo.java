// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.msk.outputs;

import com.pulumi.awsnative.msk.outputs.ClusterBrokerLogs;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ClusterLoggingInfo {
    private final ClusterBrokerLogs brokerLogs;

    @CustomType.Constructor
    private ClusterLoggingInfo(@CustomType.Parameter("brokerLogs") ClusterBrokerLogs brokerLogs) {
        this.brokerLogs = brokerLogs;
    }

    public ClusterBrokerLogs brokerLogs() {
        return this.brokerLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterBrokerLogs brokerLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brokerLogs = defaults.brokerLogs;
        }

        public Builder brokerLogs(ClusterBrokerLogs brokerLogs) {
            this.brokerLogs = Objects.requireNonNull(brokerLogs);
            return this;
        }        public ClusterLoggingInfo build() {
            return new ClusterLoggingInfo(brokerLogs);
        }
    }
}
