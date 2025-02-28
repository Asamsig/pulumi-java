// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegistryNetworkRuleSetIpRule {
    /**
     * @return The behaviour for requests matching this rule. At this time the only supported value is `Allow`
     * 
     */
    private final String action;
    /**
     * @return The CIDR block from which requests will match the rule.
     * 
     */
    private final String ipRange;

    @CustomType.Constructor
    private RegistryNetworkRuleSetIpRule(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("ipRange") String ipRange) {
        this.action = action;
        this.ipRange = ipRange;
    }

    /**
     * @return The behaviour for requests matching this rule. At this time the only supported value is `Allow`
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The CIDR block from which requests will match the rule.
     * 
     */
    public String ipRange() {
        return this.ipRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryNetworkRuleSetIpRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String ipRange;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryNetworkRuleSetIpRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipRange = defaults.ipRange;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder ipRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }        public RegistryNetworkRuleSetIpRule build() {
            return new RegistryNetworkRuleSetIpRule(action, ipRange);
        }
    }
}
