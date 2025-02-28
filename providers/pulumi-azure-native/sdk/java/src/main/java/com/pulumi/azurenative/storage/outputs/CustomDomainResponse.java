// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomDomainResponse {
    /**
     * @return Gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     * 
     */
    private final String name;
    /**
     * @return Indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates.
     * 
     */
    private final @Nullable Boolean useSubDomainName;

    @CustomType.Constructor
    private CustomDomainResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("useSubDomainName") @Nullable Boolean useSubDomainName) {
        this.name = name;
        this.useSubDomainName = useSubDomainName;
    }

    /**
     * @return Gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates.
     * 
     */
    public Optional<Boolean> useSubDomainName() {
        return Optional.ofNullable(this.useSubDomainName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable Boolean useSubDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDomainResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.useSubDomainName = defaults.useSubDomainName;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder useSubDomainName(@Nullable Boolean useSubDomainName) {
            this.useSubDomainName = useSubDomainName;
            return this;
        }        public CustomDomainResponse build() {
            return new CustomDomainResponse(name, useSubDomainName);
        }
    }
}
