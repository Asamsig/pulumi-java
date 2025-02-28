// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GatewayRouteResponse {
    /**
     * @return The route&#39;s AS path sequence.
     * 
     */
    private final String asPath;
    /**
     * @return The gateway&#39;s local address.
     * 
     */
    private final String localAddress;
    /**
     * @return The route&#39;s network prefix.
     * 
     */
    private final String network;
    /**
     * @return The route&#39;s next hop.
     * 
     */
    private final String nextHop;
    /**
     * @return The source this route was learned from.
     * 
     */
    private final String origin;
    /**
     * @return The peer this route was learned from.
     * 
     */
    private final String sourcePeer;
    /**
     * @return The route&#39;s weight.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private GatewayRouteResponse(
        @CustomType.Parameter("asPath") String asPath,
        @CustomType.Parameter("localAddress") String localAddress,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("nextHop") String nextHop,
        @CustomType.Parameter("origin") String origin,
        @CustomType.Parameter("sourcePeer") String sourcePeer,
        @CustomType.Parameter("weight") Integer weight) {
        this.asPath = asPath;
        this.localAddress = localAddress;
        this.network = network;
        this.nextHop = nextHop;
        this.origin = origin;
        this.sourcePeer = sourcePeer;
        this.weight = weight;
    }

    /**
     * @return The route&#39;s AS path sequence.
     * 
     */
    public String asPath() {
        return this.asPath;
    }
    /**
     * @return The gateway&#39;s local address.
     * 
     */
    public String localAddress() {
        return this.localAddress;
    }
    /**
     * @return The route&#39;s network prefix.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return The route&#39;s next hop.
     * 
     */
    public String nextHop() {
        return this.nextHop;
    }
    /**
     * @return The source this route was learned from.
     * 
     */
    public String origin() {
        return this.origin;
    }
    /**
     * @return The peer this route was learned from.
     * 
     */
    public String sourcePeer() {
        return this.sourcePeer;
    }
    /**
     * @return The route&#39;s weight.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String asPath;
        private String localAddress;
        private String network;
        private String nextHop;
        private String origin;
        private String sourcePeer;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asPath = defaults.asPath;
    	      this.localAddress = defaults.localAddress;
    	      this.network = defaults.network;
    	      this.nextHop = defaults.nextHop;
    	      this.origin = defaults.origin;
    	      this.sourcePeer = defaults.sourcePeer;
    	      this.weight = defaults.weight;
        }

        public Builder asPath(String asPath) {
            this.asPath = Objects.requireNonNull(asPath);
            return this;
        }
        public Builder localAddress(String localAddress) {
            this.localAddress = Objects.requireNonNull(localAddress);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder nextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }
        public Builder origin(String origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }
        public Builder sourcePeer(String sourcePeer) {
            this.sourcePeer = Objects.requireNonNull(sourcePeer);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public GatewayRouteResponse build() {
            return new GatewayRouteResponse(asPath, localAddress, network, nextHop, origin, sourcePeer, weight);
        }
    }
}
