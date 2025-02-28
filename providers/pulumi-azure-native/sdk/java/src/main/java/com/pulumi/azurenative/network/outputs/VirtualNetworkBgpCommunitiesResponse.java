// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNetworkBgpCommunitiesResponse {
    /**
     * @return The BGP community associated with the region of the virtual network.
     * 
     */
    private final String regionalCommunity;
    /**
     * @return The BGP community associated with the virtual network.
     * 
     */
    private final String virtualNetworkCommunity;

    @CustomType.Constructor
    private VirtualNetworkBgpCommunitiesResponse(
        @CustomType.Parameter("regionalCommunity") String regionalCommunity,
        @CustomType.Parameter("virtualNetworkCommunity") String virtualNetworkCommunity) {
        this.regionalCommunity = regionalCommunity;
        this.virtualNetworkCommunity = virtualNetworkCommunity;
    }

    /**
     * @return The BGP community associated with the region of the virtual network.
     * 
     */
    public String regionalCommunity() {
        return this.regionalCommunity;
    }
    /**
     * @return The BGP community associated with the virtual network.
     * 
     */
    public String virtualNetworkCommunity() {
        return this.virtualNetworkCommunity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkBgpCommunitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String regionalCommunity;
        private String virtualNetworkCommunity;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkBgpCommunitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionalCommunity = defaults.regionalCommunity;
    	      this.virtualNetworkCommunity = defaults.virtualNetworkCommunity;
        }

        public Builder regionalCommunity(String regionalCommunity) {
            this.regionalCommunity = Objects.requireNonNull(regionalCommunity);
            return this;
        }
        public Builder virtualNetworkCommunity(String virtualNetworkCommunity) {
            this.virtualNetworkCommunity = Objects.requireNonNull(virtualNetworkCommunity);
            return this;
        }        public VirtualNetworkBgpCommunitiesResponse build() {
            return new VirtualNetworkBgpCommunitiesResponse(regionalCommunity, virtualNetworkCommunity);
        }
    }
}
