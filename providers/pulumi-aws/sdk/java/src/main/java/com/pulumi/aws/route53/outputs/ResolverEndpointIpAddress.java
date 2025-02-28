// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResolverEndpointIpAddress {
    /**
     * @return The IP address in the subnet that you want to use for DNS queries.
     * 
     */
    private final @Nullable String ip;
    private final @Nullable String ipId;
    /**
     * @return The ID of the subnet that contains the IP address.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private ResolverEndpointIpAddress(
        @CustomType.Parameter("ip") @Nullable String ip,
        @CustomType.Parameter("ipId") @Nullable String ipId,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.ip = ip;
        this.ipId = ipId;
        this.subnetId = subnetId;
    }

    /**
     * @return The IP address in the subnet that you want to use for DNS queries.
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<String> ipId() {
        return Optional.ofNullable(this.ipId);
    }
    /**
     * @return The ID of the subnet that contains the IP address.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverEndpointIpAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String ipId;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverEndpointIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.ipId = defaults.ipId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        public Builder ipId(@Nullable String ipId) {
            this.ipId = ipId;
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public ResolverEndpointIpAddress build() {
            return new ResolverEndpointIpAddress(ip, ipId, subnetId);
        }
    }
}
