// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.outputs;

import com.pulumi.azurenative.cognitiveservices.outputs.IpRuleResponse;
import com.pulumi.azurenative.cognitiveservices.outputs.VirtualNetworkRuleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkRuleSetResponse {
    /**
     * @return The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    private final @Nullable String defaultAction;
    /**
     * @return The list of IP address rules.
     * 
     */
    private final @Nullable List<IpRuleResponse> ipRules;
    /**
     * @return The list of virtual network rules.
     * 
     */
    private final @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

    @CustomType.Constructor
    private NetworkRuleSetResponse(
        @CustomType.Parameter("defaultAction") @Nullable String defaultAction,
        @CustomType.Parameter("ipRules") @Nullable List<IpRuleResponse> ipRules,
        @CustomType.Parameter("virtualNetworkRules") @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * @return The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    public Optional<String> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }
    /**
     * @return The list of IP address rules.
     * 
     */
    public List<IpRuleResponse> ipRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }
    /**
     * @return The list of virtual network rules.
     * 
     */
    public List<VirtualNetworkRuleResponse> virtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultAction;
        private @Nullable List<IpRuleResponse> ipRules;
        private @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder defaultAction(@Nullable String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }
        public Builder ipRules(@Nullable List<IpRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(IpRuleResponse... ipRules) {
            return ipRules(List.of(ipRules));
        }
        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public Builder virtualNetworkRules(VirtualNetworkRuleResponse... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
