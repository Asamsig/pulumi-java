// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IoTHubCloudToDeviceFeedback {
    /**
     * @return The lock duration for the feedback queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT60S`.
     * 
     */
    private final @Nullable String lockDuration;
    /**
     * @return The maximum delivery count for the feedback queue. This value must be between `1` and `100`. Defaults to `10`.
     * 
     */
    private final @Nullable Integer maxDeliveryCount;
    /**
     * @return The retention time for service-bound feedback messages, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     * 
     */
    private final @Nullable String timeToLive;

    @CustomType.Constructor
    private IoTHubCloudToDeviceFeedback(
        @CustomType.Parameter("lockDuration") @Nullable String lockDuration,
        @CustomType.Parameter("maxDeliveryCount") @Nullable Integer maxDeliveryCount,
        @CustomType.Parameter("timeToLive") @Nullable String timeToLive) {
        this.lockDuration = lockDuration;
        this.maxDeliveryCount = maxDeliveryCount;
        this.timeToLive = timeToLive;
    }

    /**
     * @return The lock duration for the feedback queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT60S`.
     * 
     */
    public Optional<String> lockDuration() {
        return Optional.ofNullable(this.lockDuration);
    }
    /**
     * @return The maximum delivery count for the feedback queue. This value must be between `1` and `100`. Defaults to `10`.
     * 
     */
    public Optional<Integer> maxDeliveryCount() {
        return Optional.ofNullable(this.maxDeliveryCount);
    }
    /**
     * @return The retention time for service-bound feedback messages, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     * 
     */
    public Optional<String> timeToLive() {
        return Optional.ofNullable(this.timeToLive);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTHubCloudToDeviceFeedback defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lockDuration;
        private @Nullable Integer maxDeliveryCount;
        private @Nullable String timeToLive;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTHubCloudToDeviceFeedback defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lockDuration = defaults.lockDuration;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
    	      this.timeToLive = defaults.timeToLive;
        }

        public Builder lockDuration(@Nullable String lockDuration) {
            this.lockDuration = lockDuration;
            return this;
        }
        public Builder maxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }
        public Builder timeToLive(@Nullable String timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }        public IoTHubCloudToDeviceFeedback build() {
            return new IoTHubCloudToDeviceFeedback(lockDuration, maxDeliveryCount, timeToLive);
        }
    }
}
