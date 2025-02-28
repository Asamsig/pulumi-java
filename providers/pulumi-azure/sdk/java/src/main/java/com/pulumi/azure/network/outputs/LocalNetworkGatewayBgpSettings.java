// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LocalNetworkGatewayBgpSettings {
    /**
     * @return The BGP speaker&#39;s ASN.
     * 
     */
    private final Integer asn;
    /**
     * @return The BGP peering address and BGP identifier
     * of this BGP speaker.
     * 
     */
    private final String bgpPeeringAddress;
    /**
     * @return The weight added to routes learned from this
     * BGP speaker.
     * 
     */
    private final @Nullable Integer peerWeight;

    @CustomType.Constructor
    private LocalNetworkGatewayBgpSettings(
        @CustomType.Parameter("asn") Integer asn,
        @CustomType.Parameter("bgpPeeringAddress") String bgpPeeringAddress,
        @CustomType.Parameter("peerWeight") @Nullable Integer peerWeight) {
        this.asn = asn;
        this.bgpPeeringAddress = bgpPeeringAddress;
        this.peerWeight = peerWeight;
    }

    /**
     * @return The BGP speaker&#39;s ASN.
     * 
     */
    public Integer asn() {
        return this.asn;
    }
    /**
     * @return The BGP peering address and BGP identifier
     * of this BGP speaker.
     * 
     */
    public String bgpPeeringAddress() {
        return this.bgpPeeringAddress;
    }
    /**
     * @return The weight added to routes learned from this
     * BGP speaker.
     * 
     */
    public Optional<Integer> peerWeight() {
        return Optional.ofNullable(this.peerWeight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalNetworkGatewayBgpSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer asn;
        private String bgpPeeringAddress;
        private @Nullable Integer peerWeight;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalNetworkGatewayBgpSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.bgpPeeringAddress = defaults.bgpPeeringAddress;
    	      this.peerWeight = defaults.peerWeight;
        }

        public Builder asn(Integer asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }
        public Builder bgpPeeringAddress(String bgpPeeringAddress) {
            this.bgpPeeringAddress = Objects.requireNonNull(bgpPeeringAddress);
            return this;
        }
        public Builder peerWeight(@Nullable Integer peerWeight) {
            this.peerWeight = peerWeight;
            return this;
        }        public LocalNetworkGatewayBgpSettings build() {
            return new LocalNetworkGatewayBgpSettings(asn, bgpPeeringAddress, peerWeight);
        }
    }
}
