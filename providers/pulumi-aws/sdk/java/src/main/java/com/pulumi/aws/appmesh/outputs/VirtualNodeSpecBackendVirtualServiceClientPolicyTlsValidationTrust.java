// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust {
    /**
     * @return The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm acm;
    /**
     * @return The TLS validation context trust for a local file certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile file;
    /**
     * @return The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds sds;

    @CustomType.Constructor
    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust(
        @CustomType.Parameter("acm") @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm acm,
        @CustomType.Parameter("file") @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile file,
        @CustomType.Parameter("sds") @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    /**
     * @return The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
     */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm> acm() {
        return Optional.ofNullable(this.acm);
    }
    /**
     * @return The TLS validation context trust for a local file certificate.
     * 
     */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * @return The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds> sds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm acm;
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile file;
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm acm) {
            this.acm = acm;
            return this;
        }
        public Builder file(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile file) {
            this.file = file;
            return this;
        }
        public Builder sds(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds sds) {
            this.sds = sds;
            return this;
        }        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust(acm, file, sds);
        }
    }
}
