// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IotHubDpsLinkedHub {
    /**
     * @return The weight applied to the IoT Hub. Defaults to 0.
     * 
     */
    private final @Nullable Integer allocationWeight;
    /**
     * @return Determines whether to apply allocation policies to the IoT Hub. Defaults to true.
     * 
     */
    private final @Nullable Boolean applyAllocationPolicy;
    /**
     * @return The connection string to connect to the IoT Hub.
     * 
     */
    private final String connectionString;
    /**
     * @return The IoT Hub hostname.
     * 
     */
    private final @Nullable String hostname;
    /**
     * @return The location of the IoT hub.
     * 
     */
    private final String location;

    @CustomType.Constructor
    private IotHubDpsLinkedHub(
        @CustomType.Parameter("allocationWeight") @Nullable Integer allocationWeight,
        @CustomType.Parameter("applyAllocationPolicy") @Nullable Boolean applyAllocationPolicy,
        @CustomType.Parameter("connectionString") String connectionString,
        @CustomType.Parameter("hostname") @Nullable String hostname,
        @CustomType.Parameter("location") String location) {
        this.allocationWeight = allocationWeight;
        this.applyAllocationPolicy = applyAllocationPolicy;
        this.connectionString = connectionString;
        this.hostname = hostname;
        this.location = location;
    }

    /**
     * @return The weight applied to the IoT Hub. Defaults to 0.
     * 
     */
    public Optional<Integer> allocationWeight() {
        return Optional.ofNullable(this.allocationWeight);
    }
    /**
     * @return Determines whether to apply allocation policies to the IoT Hub. Defaults to true.
     * 
     */
    public Optional<Boolean> applyAllocationPolicy() {
        return Optional.ofNullable(this.applyAllocationPolicy);
    }
    /**
     * @return The connection string to connect to the IoT Hub.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return The IoT Hub hostname.
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return The location of the IoT hub.
     * 
     */
    public String location() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubDpsLinkedHub defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allocationWeight;
        private @Nullable Boolean applyAllocationPolicy;
        private String connectionString;
        private @Nullable String hostname;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubDpsLinkedHub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationWeight = defaults.allocationWeight;
    	      this.applyAllocationPolicy = defaults.applyAllocationPolicy;
    	      this.connectionString = defaults.connectionString;
    	      this.hostname = defaults.hostname;
    	      this.location = defaults.location;
        }

        public Builder allocationWeight(@Nullable Integer allocationWeight) {
            this.allocationWeight = allocationWeight;
            return this;
        }
        public Builder applyAllocationPolicy(@Nullable Boolean applyAllocationPolicy) {
            this.applyAllocationPolicy = applyAllocationPolicy;
            return this;
        }
        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }        public IotHubDpsLinkedHub build() {
            return new IotHubDpsLinkedHub(allocationWeight, applyAllocationPolicy, connectionString, hostname, location);
        }
    }
}
