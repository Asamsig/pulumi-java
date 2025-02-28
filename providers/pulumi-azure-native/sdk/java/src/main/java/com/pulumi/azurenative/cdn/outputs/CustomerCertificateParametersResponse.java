// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomerCertificateParametersResponse {
    /**
     * @return Certificate issuing authority.
     * 
     */
    private final @Nullable String certificateAuthority;
    /**
     * @return Resource reference to the KV secret
     * 
     */
    private final ResourceReferenceResponse secretSource;
    /**
     * @return Version of the secret to be used
     * 
     */
    private final @Nullable String secretVersion;
    /**
     * @return The list of SANs.
     * 
     */
    private final @Nullable List<String> subjectAlternativeNames;
    /**
     * @return The type of the Secret to create.
     * Expected value is &#39;CustomerCertificate&#39;.
     * 
     */
    private final String type;
    /**
     * @return Whether to use the latest version for the certificate
     * 
     */
    private final @Nullable Boolean useLatestVersion;

    @CustomType.Constructor
    private CustomerCertificateParametersResponse(
        @CustomType.Parameter("certificateAuthority") @Nullable String certificateAuthority,
        @CustomType.Parameter("secretSource") ResourceReferenceResponse secretSource,
        @CustomType.Parameter("secretVersion") @Nullable String secretVersion,
        @CustomType.Parameter("subjectAlternativeNames") @Nullable List<String> subjectAlternativeNames,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useLatestVersion") @Nullable Boolean useLatestVersion) {
        this.certificateAuthority = certificateAuthority;
        this.secretSource = secretSource;
        this.secretVersion = secretVersion;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.type = type;
        this.useLatestVersion = useLatestVersion;
    }

    /**
     * @return Certificate issuing authority.
     * 
     */
    public Optional<String> certificateAuthority() {
        return Optional.ofNullable(this.certificateAuthority);
    }
    /**
     * @return Resource reference to the KV secret
     * 
     */
    public ResourceReferenceResponse secretSource() {
        return this.secretSource;
    }
    /**
     * @return Version of the secret to be used
     * 
     */
    public Optional<String> secretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }
    /**
     * @return The list of SANs.
     * 
     */
    public List<String> subjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? List.of() : this.subjectAlternativeNames;
    }
    /**
     * @return The type of the Secret to create.
     * Expected value is &#39;CustomerCertificate&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Whether to use the latest version for the certificate
     * 
     */
    public Optional<Boolean> useLatestVersion() {
        return Optional.ofNullable(this.useLatestVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerCertificateParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateAuthority;
        private ResourceReferenceResponse secretSource;
        private @Nullable String secretVersion;
        private @Nullable List<String> subjectAlternativeNames;
        private String type;
        private @Nullable Boolean useLatestVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerCertificateParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.secretSource = defaults.secretSource;
    	      this.secretVersion = defaults.secretVersion;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.type = defaults.type;
    	      this.useLatestVersion = defaults.useLatestVersion;
        }

        public Builder certificateAuthority(@Nullable String certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }
        public Builder secretSource(ResourceReferenceResponse secretSource) {
            this.secretSource = Objects.requireNonNull(secretSource);
            return this;
        }
        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useLatestVersion(@Nullable Boolean useLatestVersion) {
            this.useLatestVersion = useLatestVersion;
            return this;
        }        public CustomerCertificateParametersResponse build() {
            return new CustomerCertificateParametersResponse(certificateAuthority, secretSource, secretVersion, subjectAlternativeNames, type, useLatestVersion);
        }
    }
}
