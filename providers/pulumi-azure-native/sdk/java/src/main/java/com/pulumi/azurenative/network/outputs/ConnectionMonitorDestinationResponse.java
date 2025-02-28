// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionMonitorDestinationResponse {
    /**
     * @return Address of the connection monitor destination (IP or domain name).
     * 
     */
    private final @Nullable String address;
    /**
     * @return The destination port used by connection monitor.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return The ID of the resource used as the destination by connection monitor.
     * 
     */
    private final @Nullable String resourceId;

    @CustomType.Constructor
    private ConnectionMonitorDestinationResponse(
        @CustomType.Parameter("address") @Nullable String address,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.address = address;
        this.port = port;
        this.resourceId = resourceId;
    }

    /**
     * @return Address of the connection monitor destination (IP or domain name).
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The destination port used by connection monitor.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The ID of the resource used as the destination by connection monitor.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable Integer port;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public ConnectionMonitorDestinationResponse build() {
            return new ConnectionMonitorDestinationResponse(address, port, resourceId);
        }
    }
}
