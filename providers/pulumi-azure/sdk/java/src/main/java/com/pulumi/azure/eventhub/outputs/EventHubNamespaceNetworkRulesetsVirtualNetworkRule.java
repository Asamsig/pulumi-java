// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventHubNamespaceNetworkRulesetsVirtualNetworkRule {
    /**
     * @return Are missing virtual network service endpoints ignored? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean ignoreMissingVirtualNetworkServiceEndpoint;
    /**
     * @return The id of the subnet to match on.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private EventHubNamespaceNetworkRulesetsVirtualNetworkRule(
        @CustomType.Parameter("ignoreMissingVirtualNetworkServiceEndpoint") @Nullable Boolean ignoreMissingVirtualNetworkServiceEndpoint,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.ignoreMissingVirtualNetworkServiceEndpoint = ignoreMissingVirtualNetworkServiceEndpoint;
        this.subnetId = subnetId;
    }

    /**
     * @return Are missing virtual network service endpoints ignored? Defaults to `false`.
     * 
     */
    public Optional<Boolean> ignoreMissingVirtualNetworkServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVirtualNetworkServiceEndpoint);
    }
    /**
     * @return The id of the subnet to match on.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubNamespaceNetworkRulesetsVirtualNetworkRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ignoreMissingVirtualNetworkServiceEndpoint;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubNamespaceNetworkRulesetsVirtualNetworkRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMissingVirtualNetworkServiceEndpoint = defaults.ignoreMissingVirtualNetworkServiceEndpoint;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder ignoreMissingVirtualNetworkServiceEndpoint(@Nullable Boolean ignoreMissingVirtualNetworkServiceEndpoint) {
            this.ignoreMissingVirtualNetworkServiceEndpoint = ignoreMissingVirtualNetworkServiceEndpoint;
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public EventHubNamespaceNetworkRulesetsVirtualNetworkRule build() {
            return new EventHubNamespaceNetworkRulesetsVirtualNetworkRule(ignoreMissingVirtualNetworkServiceEndpoint, subnetId);
        }
    }
}
