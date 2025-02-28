// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerSubnetMapping {
    private final String allocationId;
    private final String ipv6Address;
    private final String outpostId;
    private final String privateIpv4Address;
    private final String subnetId;

    @CustomType.Constructor
    private GetLoadBalancerSubnetMapping(
        @CustomType.Parameter("allocationId") String allocationId,
        @CustomType.Parameter("ipv6Address") String ipv6Address,
        @CustomType.Parameter("outpostId") String outpostId,
        @CustomType.Parameter("privateIpv4Address") String privateIpv4Address,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.allocationId = allocationId;
        this.ipv6Address = ipv6Address;
        this.outpostId = outpostId;
        this.privateIpv4Address = privateIpv4Address;
        this.subnetId = subnetId;
    }

    public String allocationId() {
        return this.allocationId;
    }
    public String ipv6Address() {
        return this.ipv6Address;
    }
    public String outpostId() {
        return this.outpostId;
    }
    public String privateIpv4Address() {
        return this.privateIpv4Address;
    }
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerSubnetMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationId;
        private String ipv6Address;
        private String outpostId;
        private String privateIpv4Address;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerSubnetMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.outpostId = defaults.outpostId;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = Objects.requireNonNull(allocationId);
            return this;
        }
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        public Builder outpostId(String outpostId) {
            this.outpostId = Objects.requireNonNull(outpostId);
            return this;
        }
        public Builder privateIpv4Address(String privateIpv4Address) {
            this.privateIpv4Address = Objects.requireNonNull(privateIpv4Address);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public GetLoadBalancerSubnetMapping build() {
            return new GetLoadBalancerSubnetMapping(allocationId, ipv6Address, outpostId, privateIpv4Address, subnetId);
        }
    }
}
