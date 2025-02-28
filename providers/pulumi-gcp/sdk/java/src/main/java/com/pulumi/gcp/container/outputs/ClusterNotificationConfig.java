// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.ClusterNotificationConfigPubsub;
import java.util.Objects;

@CustomType
public final class ClusterNotificationConfig {
    /**
     * @return The pubsub config for the cluster&#39;s upgrade notifications.
     * 
     */
    private final ClusterNotificationConfigPubsub pubsub;

    @CustomType.Constructor
    private ClusterNotificationConfig(@CustomType.Parameter("pubsub") ClusterNotificationConfigPubsub pubsub) {
        this.pubsub = pubsub;
    }

    /**
     * @return The pubsub config for the cluster&#39;s upgrade notifications.
     * 
     */
    public ClusterNotificationConfigPubsub pubsub() {
        return this.pubsub;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNotificationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNotificationConfigPubsub pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNotificationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder pubsub(ClusterNotificationConfigPubsub pubsub) {
            this.pubsub = Objects.requireNonNull(pubsub);
            return this;
        }        public ClusterNotificationConfig build() {
            return new ClusterNotificationConfig(pubsub);
        }
    }
}
