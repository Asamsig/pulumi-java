// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeviceStateResponse {
    /**
     * @return The device state data.
     * 
     */
    private final String binaryData;
    /**
     * @return [Output only] The time at which this state version was updated in Cloud IoT Core.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private DeviceStateResponse(
        @CustomType.Parameter("binaryData") String binaryData,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.binaryData = binaryData;
        this.updateTime = updateTime;
    }

    /**
     * @return The device state data.
     * 
     */
    public String binaryData() {
        return this.binaryData;
    }
    /**
     * @return [Output only] The time at which this state version was updated in Cloud IoT Core.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String binaryData;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryData = defaults.binaryData;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder binaryData(String binaryData) {
            this.binaryData = Objects.requireNonNull(binaryData);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public DeviceStateResponse build() {
            return new DeviceStateResponse(binaryData, updateTime);
        }
    }
}
