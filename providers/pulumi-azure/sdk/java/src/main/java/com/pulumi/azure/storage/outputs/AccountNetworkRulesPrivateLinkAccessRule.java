// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountNetworkRulesPrivateLinkAccessRule {
    /**
     * @return The resource id of the resource access rule to be granted access.
     * 
     */
    private final String endpointResourceId;
    /**
     * @return The tenant id of the resource of the resource access rule to be granted access. Defaults to the current tenant id.
     * 
     */
    private final @Nullable String endpointTenantId;

    @CustomType.Constructor
    private AccountNetworkRulesPrivateLinkAccessRule(
        @CustomType.Parameter("endpointResourceId") String endpointResourceId,
        @CustomType.Parameter("endpointTenantId") @Nullable String endpointTenantId) {
        this.endpointResourceId = endpointResourceId;
        this.endpointTenantId = endpointTenantId;
    }

    /**
     * @return The resource id of the resource access rule to be granted access.
     * 
     */
    public String endpointResourceId() {
        return this.endpointResourceId;
    }
    /**
     * @return The tenant id of the resource of the resource access rule to be granted access. Defaults to the current tenant id.
     * 
     */
    public Optional<String> endpointTenantId() {
        return Optional.ofNullable(this.endpointTenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountNetworkRulesPrivateLinkAccessRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointResourceId;
        private @Nullable String endpointTenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountNetworkRulesPrivateLinkAccessRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointResourceId = defaults.endpointResourceId;
    	      this.endpointTenantId = defaults.endpointTenantId;
        }

        public Builder endpointResourceId(String endpointResourceId) {
            this.endpointResourceId = Objects.requireNonNull(endpointResourceId);
            return this;
        }
        public Builder endpointTenantId(@Nullable String endpointTenantId) {
            this.endpointTenantId = endpointTenantId;
            return this;
        }        public AccountNetworkRulesPrivateLinkAccessRule build() {
            return new AccountNetworkRulesPrivateLinkAccessRule(endpointResourceId, endpointTenantId);
        }
    }
}
