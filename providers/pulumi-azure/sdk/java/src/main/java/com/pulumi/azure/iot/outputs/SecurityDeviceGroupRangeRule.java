// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityDeviceGroupRangeRule {
    /**
     * @return Specifies the time range. represented in ISO 8601 duration format.
     * 
     */
    private final String duration;
    /**
     * @return The maximum threshold in the given time window.
     * 
     */
    private final Integer max;
    /**
     * @return The minimum threshold in the given time window.
     * 
     */
    private final Integer min;
    /**
     * @return The type of supported rule type. Possible Values are `ActiveConnectionsNotInAllowedRange`, `AmqpC2DMessagesNotInAllowedRange`, `MqttC2DMessagesNotInAllowedRange`, `HttpC2DMessagesNotInAllowedRange`, `AmqpC2DRejectedMessagesNotInAllowedRange`, `MqttC2DRejectedMessagesNotInAllowedRange`, `HttpC2DRejectedMessagesNotInAllowedRange`, `AmqpD2CMessagesNotInAllowedRange`, `MqttD2CMessagesNotInAllowedRange`, `HttpD2CMessagesNotInAllowedRange`, `DirectMethodInvokesNotInAllowedRange`, `FailedLocalLoginsNotInAllowedRange`, `FileUploadsNotInAllowedRange`, `QueuePurgesNotInAllowedRange`, `TwinUpdatesNotInAllowedRange` and `UnauthorizedOperationsNotInAllowedRange`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SecurityDeviceGroupRangeRule(
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("max") Integer max,
        @CustomType.Parameter("min") Integer min,
        @CustomType.Parameter("type") String type) {
        this.duration = duration;
        this.max = max;
        this.min = min;
        this.type = type;
    }

    /**
     * @return Specifies the time range. represented in ISO 8601 duration format.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return The maximum threshold in the given time window.
     * 
     */
    public Integer max() {
        return this.max;
    }
    /**
     * @return The minimum threshold in the given time window.
     * 
     */
    public Integer min() {
        return this.min;
    }
    /**
     * @return The type of supported rule type. Possible Values are `ActiveConnectionsNotInAllowedRange`, `AmqpC2DMessagesNotInAllowedRange`, `MqttC2DMessagesNotInAllowedRange`, `HttpC2DMessagesNotInAllowedRange`, `AmqpC2DRejectedMessagesNotInAllowedRange`, `MqttC2DRejectedMessagesNotInAllowedRange`, `HttpC2DRejectedMessagesNotInAllowedRange`, `AmqpD2CMessagesNotInAllowedRange`, `MqttD2CMessagesNotInAllowedRange`, `HttpD2CMessagesNotInAllowedRange`, `DirectMethodInvokesNotInAllowedRange`, `FailedLocalLoginsNotInAllowedRange`, `FileUploadsNotInAllowedRange`, `QueuePurgesNotInAllowedRange`, `TwinUpdatesNotInAllowedRange` and `UnauthorizedOperationsNotInAllowedRange`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityDeviceGroupRangeRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private Integer max;
        private Integer min;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityDeviceGroupRangeRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.max = defaults.max;
    	      this.min = defaults.min;
    	      this.type = defaults.type;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder max(Integer max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }
        public Builder min(Integer min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SecurityDeviceGroupRangeRule build() {
            return new SecurityDeviceGroupRangeRule(duration, max, min, type);
        }
    }
}
