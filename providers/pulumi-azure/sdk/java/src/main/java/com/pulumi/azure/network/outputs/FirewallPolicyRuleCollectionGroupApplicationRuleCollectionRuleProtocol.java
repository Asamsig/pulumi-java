// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol {
    /**
     * @return Port number of the protocol. Range is 0-64000.
     * 
     */
    private final Integer port;
    /**
     * @return Protocol type. Possible values are `Http` and `Https`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol(
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("type") String type) {
        this.port = port;
        this.type = type;
    }

    /**
     * @return Port number of the protocol. Range is 0-64000.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Protocol type. Possible values are `Http` and `Https`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.type = defaults.type;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol build() {
            return new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol(port, type);
        }
    }
}
