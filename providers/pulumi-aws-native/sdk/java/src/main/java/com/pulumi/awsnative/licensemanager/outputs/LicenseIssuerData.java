// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.licensemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LicenseIssuerData {
    private final String name;
    private final @Nullable String signKey;

    @CustomType.Constructor
    private LicenseIssuerData(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("signKey") @Nullable String signKey) {
        this.name = name;
        this.signKey = signKey;
    }

    public String name() {
        return this.name;
    }
    public Optional<String> signKey() {
        return Optional.ofNullable(this.signKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseIssuerData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String signKey;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseIssuerData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.signKey = defaults.signKey;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder signKey(@Nullable String signKey) {
            this.signKey = signKey;
            return this;
        }        public LicenseIssuerData build() {
            return new LicenseIssuerData(name, signKey);
        }
    }
}
