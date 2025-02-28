// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetVpnGatewayBgpSettingInstance0BgpPeeringAddress;
import com.pulumi.azure.network.outputs.GetVpnGatewayBgpSettingInstance1BgpPeeringAddress;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVpnGatewayBgpSetting {
    /**
     * @return The ASN of the BGP Speaker.
     * 
     */
    private final Integer asn;
    /**
     * @return The Address which should be used for the BGP Peering.
     * 
     */
    private final String bgpPeeringAddress;
    /**
     * @return an `instance_bgp_peering_address` block as defined below.
     * 
     */
    private final List<GetVpnGatewayBgpSettingInstance0BgpPeeringAddress> instance0BgpPeeringAddresses;
    /**
     * @return an `instance_bgp_peering_address` block as defined below.
     * 
     */
    private final List<GetVpnGatewayBgpSettingInstance1BgpPeeringAddress> instance1BgpPeeringAddresses;
    /**
     * @return The weight added to Routes learned from this BGP Speaker.
     * 
     */
    private final Integer peerWeight;

    @CustomType.Constructor
    private GetVpnGatewayBgpSetting(
        @CustomType.Parameter("asn") Integer asn,
        @CustomType.Parameter("bgpPeeringAddress") String bgpPeeringAddress,
        @CustomType.Parameter("instance0BgpPeeringAddresses") List<GetVpnGatewayBgpSettingInstance0BgpPeeringAddress> instance0BgpPeeringAddresses,
        @CustomType.Parameter("instance1BgpPeeringAddresses") List<GetVpnGatewayBgpSettingInstance1BgpPeeringAddress> instance1BgpPeeringAddresses,
        @CustomType.Parameter("peerWeight") Integer peerWeight) {
        this.asn = asn;
        this.bgpPeeringAddress = bgpPeeringAddress;
        this.instance0BgpPeeringAddresses = instance0BgpPeeringAddresses;
        this.instance1BgpPeeringAddresses = instance1BgpPeeringAddresses;
        this.peerWeight = peerWeight;
    }

    /**
     * @return The ASN of the BGP Speaker.
     * 
     */
    public Integer asn() {
        return this.asn;
    }
    /**
     * @return The Address which should be used for the BGP Peering.
     * 
     */
    public String bgpPeeringAddress() {
        return this.bgpPeeringAddress;
    }
    /**
     * @return an `instance_bgp_peering_address` block as defined below.
     * 
     */
    public List<GetVpnGatewayBgpSettingInstance0BgpPeeringAddress> instance0BgpPeeringAddresses() {
        return this.instance0BgpPeeringAddresses;
    }
    /**
     * @return an `instance_bgp_peering_address` block as defined below.
     * 
     */
    public List<GetVpnGatewayBgpSettingInstance1BgpPeeringAddress> instance1BgpPeeringAddresses() {
        return this.instance1BgpPeeringAddresses;
    }
    /**
     * @return The weight added to Routes learned from this BGP Speaker.
     * 
     */
    public Integer peerWeight() {
        return this.peerWeight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnGatewayBgpSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer asn;
        private String bgpPeeringAddress;
        private List<GetVpnGatewayBgpSettingInstance0BgpPeeringAddress> instance0BgpPeeringAddresses;
        private List<GetVpnGatewayBgpSettingInstance1BgpPeeringAddress> instance1BgpPeeringAddresses;
        private Integer peerWeight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnGatewayBgpSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.bgpPeeringAddress = defaults.bgpPeeringAddress;
    	      this.instance0BgpPeeringAddresses = defaults.instance0BgpPeeringAddresses;
    	      this.instance1BgpPeeringAddresses = defaults.instance1BgpPeeringAddresses;
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
        public Builder instance0BgpPeeringAddresses(List<GetVpnGatewayBgpSettingInstance0BgpPeeringAddress> instance0BgpPeeringAddresses) {
            this.instance0BgpPeeringAddresses = Objects.requireNonNull(instance0BgpPeeringAddresses);
            return this;
        }
        public Builder instance0BgpPeeringAddresses(GetVpnGatewayBgpSettingInstance0BgpPeeringAddress... instance0BgpPeeringAddresses) {
            return instance0BgpPeeringAddresses(List.of(instance0BgpPeeringAddresses));
        }
        public Builder instance1BgpPeeringAddresses(List<GetVpnGatewayBgpSettingInstance1BgpPeeringAddress> instance1BgpPeeringAddresses) {
            this.instance1BgpPeeringAddresses = Objects.requireNonNull(instance1BgpPeeringAddresses);
            return this;
        }
        public Builder instance1BgpPeeringAddresses(GetVpnGatewayBgpSettingInstance1BgpPeeringAddress... instance1BgpPeeringAddresses) {
            return instance1BgpPeeringAddresses(List.of(instance1BgpPeeringAddresses));
        }
        public Builder peerWeight(Integer peerWeight) {
            this.peerWeight = Objects.requireNonNull(peerWeight);
            return this;
        }        public GetVpnGatewayBgpSetting build() {
            return new GetVpnGatewayBgpSetting(asn, bgpPeeringAddress, instance0BgpPeeringAddresses, instance1BgpPeeringAddresses, peerWeight);
        }
    }
}
