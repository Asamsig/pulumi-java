// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation {
    /**
     * @return The SANs for a virtual gateway&#39;s listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    private final @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
    /**
     * @return The TLS validation context trust.
     * 
     */
    private final VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust trust;

    @CustomType.Constructor
    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation(
        @CustomType.Parameter("subjectAlternativeNames") @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames,
        @CustomType.Parameter("trust") VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = trust;
    }

    /**
     * @return The SANs for a virtual gateway&#39;s listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * @return The TLS validation context trust.
     * 
     */
    public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust trust() {
        return this.trust;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
        private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder subjectAlternativeNames(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder trust(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation(subjectAlternativeNames, trust);
        }
    }
}
