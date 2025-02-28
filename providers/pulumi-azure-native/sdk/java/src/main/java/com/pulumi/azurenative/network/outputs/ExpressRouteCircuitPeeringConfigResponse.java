// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressRouteCircuitPeeringConfigResponse {
    /**
     * @return The communities of bgp peering. Specified for microsoft peering.
     * 
     */
    private final @Nullable List<String> advertisedCommunities;
    /**
     * @return The reference to AdvertisedPublicPrefixes.
     * 
     */
    private final @Nullable List<String> advertisedPublicPrefixes;
    /**
     * @return The advertised public prefix state of the Peering resource.
     * 
     */
    private final String advertisedPublicPrefixesState;
    /**
     * @return The CustomerASN of the peering.
     * 
     */
    private final @Nullable Integer customerASN;
    /**
     * @return The legacy mode of the peering.
     * 
     */
    private final @Nullable Integer legacyMode;
    /**
     * @return The RoutingRegistryName of the configuration.
     * 
     */
    private final @Nullable String routingRegistryName;

    @CustomType.Constructor
    private ExpressRouteCircuitPeeringConfigResponse(
        @CustomType.Parameter("advertisedCommunities") @Nullable List<String> advertisedCommunities,
        @CustomType.Parameter("advertisedPublicPrefixes") @Nullable List<String> advertisedPublicPrefixes,
        @CustomType.Parameter("advertisedPublicPrefixesState") String advertisedPublicPrefixesState,
        @CustomType.Parameter("customerASN") @Nullable Integer customerASN,
        @CustomType.Parameter("legacyMode") @Nullable Integer legacyMode,
        @CustomType.Parameter("routingRegistryName") @Nullable String routingRegistryName) {
        this.advertisedCommunities = advertisedCommunities;
        this.advertisedPublicPrefixes = advertisedPublicPrefixes;
        this.advertisedPublicPrefixesState = advertisedPublicPrefixesState;
        this.customerASN = customerASN;
        this.legacyMode = legacyMode;
        this.routingRegistryName = routingRegistryName;
    }

    /**
     * @return The communities of bgp peering. Specified for microsoft peering.
     * 
     */
    public List<String> advertisedCommunities() {
        return this.advertisedCommunities == null ? List.of() : this.advertisedCommunities;
    }
    /**
     * @return The reference to AdvertisedPublicPrefixes.
     * 
     */
    public List<String> advertisedPublicPrefixes() {
        return this.advertisedPublicPrefixes == null ? List.of() : this.advertisedPublicPrefixes;
    }
    /**
     * @return The advertised public prefix state of the Peering resource.
     * 
     */
    public String advertisedPublicPrefixesState() {
        return this.advertisedPublicPrefixesState;
    }
    /**
     * @return The CustomerASN of the peering.
     * 
     */
    public Optional<Integer> customerASN() {
        return Optional.ofNullable(this.customerASN);
    }
    /**
     * @return The legacy mode of the peering.
     * 
     */
    public Optional<Integer> legacyMode() {
        return Optional.ofNullable(this.legacyMode);
    }
    /**
     * @return The RoutingRegistryName of the configuration.
     * 
     */
    public Optional<String> routingRegistryName() {
        return Optional.ofNullable(this.routingRegistryName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> advertisedCommunities;
        private @Nullable List<String> advertisedPublicPrefixes;
        private String advertisedPublicPrefixesState;
        private @Nullable Integer customerASN;
        private @Nullable Integer legacyMode;
        private @Nullable String routingRegistryName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitPeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertisedCommunities = defaults.advertisedCommunities;
    	      this.advertisedPublicPrefixes = defaults.advertisedPublicPrefixes;
    	      this.advertisedPublicPrefixesState = defaults.advertisedPublicPrefixesState;
    	      this.customerASN = defaults.customerASN;
    	      this.legacyMode = defaults.legacyMode;
    	      this.routingRegistryName = defaults.routingRegistryName;
        }

        public Builder advertisedCommunities(@Nullable List<String> advertisedCommunities) {
            this.advertisedCommunities = advertisedCommunities;
            return this;
        }
        public Builder advertisedCommunities(String... advertisedCommunities) {
            return advertisedCommunities(List.of(advertisedCommunities));
        }
        public Builder advertisedPublicPrefixes(@Nullable List<String> advertisedPublicPrefixes) {
            this.advertisedPublicPrefixes = advertisedPublicPrefixes;
            return this;
        }
        public Builder advertisedPublicPrefixes(String... advertisedPublicPrefixes) {
            return advertisedPublicPrefixes(List.of(advertisedPublicPrefixes));
        }
        public Builder advertisedPublicPrefixesState(String advertisedPublicPrefixesState) {
            this.advertisedPublicPrefixesState = Objects.requireNonNull(advertisedPublicPrefixesState);
            return this;
        }
        public Builder customerASN(@Nullable Integer customerASN) {
            this.customerASN = customerASN;
            return this;
        }
        public Builder legacyMode(@Nullable Integer legacyMode) {
            this.legacyMode = legacyMode;
            return this;
        }
        public Builder routingRegistryName(@Nullable String routingRegistryName) {
            this.routingRegistryName = routingRegistryName;
            return this;
        }        public ExpressRouteCircuitPeeringConfigResponse build() {
            return new ExpressRouteCircuitPeeringConfigResponse(advertisedCommunities, advertisedPublicPrefixes, advertisedPublicPrefixesState, customerASN, legacyMode, routingRegistryName);
        }
    }
}
