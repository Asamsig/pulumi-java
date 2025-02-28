// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointAccessNetworkInterface {
    /**
     * @return The Availability Zone.
     * 
     */
    private final @Nullable String availabilityZone;
    /**
     * @return The network interface identifier.
     * 
     */
    private final @Nullable String networkInterfaceId;
    /**
     * @return The IPv4 address of the network interface within the subnet.
     * 
     */
    private final @Nullable String privateIpAddress;
    /**
     * @return The subnet identifier.
     * 
     */
    private final @Nullable String subnetId;

    @CustomType.Constructor
    private EndpointAccessNetworkInterface(
        @CustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @CustomType.Parameter("networkInterfaceId") @Nullable String networkInterfaceId,
        @CustomType.Parameter("privateIpAddress") @Nullable String privateIpAddress,
        @CustomType.Parameter("subnetId") @Nullable String subnetId) {
        this.availabilityZone = availabilityZone;
        this.networkInterfaceId = networkInterfaceId;
        this.privateIpAddress = privateIpAddress;
        this.subnetId = subnetId;
    }

    /**
     * @return The Availability Zone.
     * 
     */
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * @return The network interface identifier.
     * 
     */
    public Optional<String> networkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }
    /**
     * @return The IPv4 address of the network interface within the subnet.
     * 
     */
    public Optional<String> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * @return The subnet identifier.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAccessNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable String networkInterfaceId;
        private @Nullable String privateIpAddress;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAccessNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }        public EndpointAccessNetworkInterface build() {
            return new EndpointAccessNetworkInterface(availabilityZone, networkInterfaceId, privateIpAddress, subnetId);
        }
    }
}
