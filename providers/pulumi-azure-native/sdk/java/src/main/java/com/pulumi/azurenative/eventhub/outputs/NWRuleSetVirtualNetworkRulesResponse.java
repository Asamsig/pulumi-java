// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.outputs;

import com.pulumi.azurenative.eventhub.outputs.SubnetResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NWRuleSetVirtualNetworkRulesResponse {
    /**
     * @return Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    private final @Nullable Boolean ignoreMissingVnetServiceEndpoint;
    /**
     * @return Subnet properties
     * 
     */
    private final @Nullable SubnetResponse subnet;

    @CustomType.Constructor
    private NWRuleSetVirtualNetworkRulesResponse(
        @CustomType.Parameter("ignoreMissingVnetServiceEndpoint") @Nullable Boolean ignoreMissingVnetServiceEndpoint,
        @CustomType.Parameter("subnet") @Nullable SubnetResponse subnet) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.subnet = subnet;
    }

    /**
     * @return Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    public Optional<Boolean> ignoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }
    /**
     * @return Subnet properties
     * 
     */
    public Optional<SubnetResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NWRuleSetVirtualNetworkRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ignoreMissingVnetServiceEndpoint;
        private @Nullable SubnetResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NWRuleSetVirtualNetworkRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
    	      this.subnet = defaults.subnet;
        }

        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }
        public Builder subnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }        public NWRuleSetVirtualNetworkRulesResponse build() {
            return new NWRuleSetVirtualNetworkRulesResponse(ignoreMissingVnetServiceEndpoint, subnet);
        }
    }
}
