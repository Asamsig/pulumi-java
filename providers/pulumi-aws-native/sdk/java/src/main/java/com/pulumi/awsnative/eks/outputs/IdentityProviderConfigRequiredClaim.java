// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IdentityProviderConfigRequiredClaim {
    /**
     * @return The key of the requiredClaims.
     * 
     */
    private final String key;
    /**
     * @return The value for the requiredClaims.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private IdentityProviderConfigRequiredClaim(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return The key of the requiredClaims.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value for the requiredClaims.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProviderConfigRequiredClaim defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProviderConfigRequiredClaim defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public IdentityProviderConfigRequiredClaim build() {
            return new IdentityProviderConfigRequiredClaim(key, value);
        }
    }
}
