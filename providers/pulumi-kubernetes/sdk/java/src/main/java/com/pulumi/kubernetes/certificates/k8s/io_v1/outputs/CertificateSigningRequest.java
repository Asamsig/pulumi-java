// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.certificates.k8s.io_v1.outputs.CertificateSigningRequestSpec;
import com.pulumi.kubernetes.certificates.k8s.io_v1.outputs.CertificateSigningRequestStatus;
import com.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateSigningRequest {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    private final @Nullable ObjectMeta metadata;
    /**
     * @return spec contains the certificate request, and is immutable after creation. Only the request, signerName, expirationSeconds, and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users.
     * 
     */
    private final CertificateSigningRequestSpec spec;
    /**
     * @return status contains information about whether the request is approved or denied, and the certificate issued by the signer, or the failure condition indicating signer failure.
     * 
     */
    private final @Nullable CertificateSigningRequestStatus status;

    @CustomType.Constructor
    private CertificateSigningRequest(
        @CustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @CustomType.Parameter("spec") CertificateSigningRequestSpec spec,
        @CustomType.Parameter("status") @Nullable CertificateSigningRequestStatus status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return spec contains the certificate request, and is immutable after creation. Only the request, signerName, expirationSeconds, and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users.
     * 
     */
    public CertificateSigningRequestSpec spec() {
        return this.spec;
    }
    /**
     * @return status contains information about whether the request is approved or denied, and the certificate issued by the signer, or the failure condition indicating signer failure.
     * 
     */
    public Optional<CertificateSigningRequestStatus> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private CertificateSigningRequestSpec spec;
        private @Nullable CertificateSigningRequestStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder spec(CertificateSigningRequestSpec spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public Builder status(@Nullable CertificateSigningRequestStatus status) {
            this.status = status;
            return this;
        }        public CertificateSigningRequest build() {
            return new CertificateSigningRequest(apiVersion, kind, metadata, spec, status);
        }
    }
}
