// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StaticRouteResponse {
    /**
     * @return List of all address prefixes.
     * 
     */
    private final @Nullable List<String> addressPrefixes;
    /**
     * @return The name of the StaticRoute that is unique within a VnetRoute.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The ip address of the next hop.
     * 
     */
    private final @Nullable String nextHopIpAddress;

    @CustomType.Constructor
    private StaticRouteResponse(
        @CustomType.Parameter("addressPrefixes") @Nullable List<String> addressPrefixes,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("nextHopIpAddress") @Nullable String nextHopIpAddress) {
        this.addressPrefixes = addressPrefixes;
        this.name = name;
        this.nextHopIpAddress = nextHopIpAddress;
    }

    /**
     * @return List of all address prefixes.
     * 
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes == null ? List.of() : this.addressPrefixes;
    }
    /**
     * @return The name of the StaticRoute that is unique within a VnetRoute.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The ip address of the next hop.
     * 
     */
    public Optional<String> nextHopIpAddress() {
        return Optional.ofNullable(this.nextHopIpAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressPrefixes;
        private @Nullable String name;
        private @Nullable String nextHopIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
    	      this.name = defaults.name;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
        }

        public Builder addressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder nextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }        public StaticRouteResponse build() {
            return new StaticRouteResponse(addressPrefixes, name, nextHopIpAddress);
        }
    }
}
