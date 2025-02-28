// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceState {
    private final @Nullable String binaryData;
    private final @Nullable String updateTime;

    @CustomType.Constructor
    private DeviceState(
        @CustomType.Parameter("binaryData") @Nullable String binaryData,
        @CustomType.Parameter("updateTime") @Nullable String updateTime) {
        this.binaryData = binaryData;
        this.updateTime = updateTime;
    }

    public Optional<String> binaryData() {
        return Optional.ofNullable(this.binaryData);
    }
    public Optional<String> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String binaryData;
        private @Nullable String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryData = defaults.binaryData;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder binaryData(@Nullable String binaryData) {
            this.binaryData = binaryData;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }        public DeviceState build() {
            return new DeviceState(binaryData, updateTime);
        }
    }
}
