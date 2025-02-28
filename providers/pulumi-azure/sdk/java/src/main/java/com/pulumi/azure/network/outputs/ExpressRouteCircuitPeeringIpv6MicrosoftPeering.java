// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressRouteCircuitPeeringIpv6MicrosoftPeering {
    /**
     * @return A list of Advertised Public Prefixes.
     * 
     */
    private final @Nullable List<String> advertisedPublicPrefixes;
    /**
     * @return The CustomerASN of the peering.
     * 
     */
    private final @Nullable Integer customerAsn;
    /**
     * @return The Routing Registry against which the AS number and prefixes are registered. For example:  `ARIN`, `RIPE`, `AFRINIC` etc.
     * 
     */
    private final @Nullable String routingRegistryName;

    @CustomType.Constructor
    private ExpressRouteCircuitPeeringIpv6MicrosoftPeering(
        @CustomType.Parameter("advertisedPublicPrefixes") @Nullable List<String> advertisedPublicPrefixes,
        @CustomType.Parameter("customerAsn") @Nullable Integer customerAsn,
        @CustomType.Parameter("routingRegistryName") @Nullable String routingRegistryName) {
        this.advertisedPublicPrefixes = advertisedPublicPrefixes;
        this.customerAsn = customerAsn;
        this.routingRegistryName = routingRegistryName;
    }

    /**
     * @return A list of Advertised Public Prefixes.
     * 
     */
    public List<String> advertisedPublicPrefixes() {
        return this.advertisedPublicPrefixes == null ? List.of() : this.advertisedPublicPrefixes;
    }
    /**
     * @return The CustomerASN of the peering.
     * 
     */
    public Optional<Integer> customerAsn() {
        return Optional.ofNullable(this.customerAsn);
    }
    /**
     * @return The Routing Registry against which the AS number and prefixes are registered. For example:  `ARIN`, `RIPE`, `AFRINIC` etc.
     * 
     */
    public Optional<String> routingRegistryName() {
        return Optional.ofNullable(this.routingRegistryName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringIpv6MicrosoftPeering defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> advertisedPublicPrefixes;
        private @Nullable Integer customerAsn;
        private @Nullable String routingRegistryName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitPeeringIpv6MicrosoftPeering defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertisedPublicPrefixes = defaults.advertisedPublicPrefixes;
    	      this.customerAsn = defaults.customerAsn;
    	      this.routingRegistryName = defaults.routingRegistryName;
        }

        public Builder advertisedPublicPrefixes(@Nullable List<String> advertisedPublicPrefixes) {
            this.advertisedPublicPrefixes = advertisedPublicPrefixes;
            return this;
        }
        public Builder advertisedPublicPrefixes(String... advertisedPublicPrefixes) {
            return advertisedPublicPrefixes(List.of(advertisedPublicPrefixes));
        }
        public Builder customerAsn(@Nullable Integer customerAsn) {
            this.customerAsn = customerAsn;
            return this;
        }
        public Builder routingRegistryName(@Nullable String routingRegistryName) {
            this.routingRegistryName = routingRegistryName;
            return this;
        }        public ExpressRouteCircuitPeeringIpv6MicrosoftPeering build() {
            return new ExpressRouteCircuitPeeringIpv6MicrosoftPeering(advertisedPublicPrefixes, customerAsn, routingRegistryName);
        }
    }
}
