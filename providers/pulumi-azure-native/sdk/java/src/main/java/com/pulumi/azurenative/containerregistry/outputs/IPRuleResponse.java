// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IPRuleResponse {
    /**
     * @return The action of IP ACL rule.
     * 
     */
    private final @Nullable String action;
    /**
     * @return Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     * 
     */
    private final String iPAddressOrRange;

    @CustomType.Constructor
    private IPRuleResponse(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("iPAddressOrRange") String iPAddressOrRange) {
        this.action = action;
        this.iPAddressOrRange = iPAddressOrRange;
    }

    /**
     * @return The action of IP ACL rule.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     * 
     */
    public String iPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private String iPAddressOrRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IPRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.iPAddressOrRange = defaults.iPAddressOrRange;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder iPAddressOrRange(String iPAddressOrRange) {
            this.iPAddressOrRange = Objects.requireNonNull(iPAddressOrRange);
            return this;
        }        public IPRuleResponse build() {
            return new IPRuleResponse(action, iPAddressOrRange);
        }
    }
}
