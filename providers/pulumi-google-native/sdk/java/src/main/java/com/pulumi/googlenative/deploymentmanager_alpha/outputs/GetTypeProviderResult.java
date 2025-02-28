// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.deploymentmanager_alpha.outputs.CollectionOverrideResponse;
import com.pulumi.googlenative.deploymentmanager_alpha.outputs.CredentialResponse;
import com.pulumi.googlenative.deploymentmanager_alpha.outputs.OperationResponse;
import com.pulumi.googlenative.deploymentmanager_alpha.outputs.OptionsResponse;
import com.pulumi.googlenative.deploymentmanager_alpha.outputs.TypeProviderLabelEntryResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTypeProviderResult {
    /**
     * @return Allows resource handling overrides for specific collections
     * 
     */
    private final List<CollectionOverrideResponse> collectionOverrides;
    /**
     * @return Credential used when interacting with this type.
     * 
     */
    private final CredentialResponse credential;
    /**
     * @return List of up to 2 custom certificate authority roots to use for TLS authentication when making calls on behalf of this type provider. If set, TLS authentication will exclusively use these roots instead of relying on publicly trusted certificate authorities when validating TLS certificate authenticity. The certificates must be in base64-encoded PEM format. The maximum size of each certificate must not exceed 10KB.
     * 
     */
    private final List<String> customCertificateAuthorityRoots;
    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    private final String description;
    /**
     * @return Descriptor Url for the this type provider.
     * 
     */
    private final String descriptorUrl;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String insertTime;
    /**
     * @return Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`
     * 
     */
    private final List<TypeProviderLabelEntryResponse> labels;
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return The Operation that most recently ran, or is currently running, on this type provider.
     * 
     */
    private final OperationResponse operation;
    /**
     * @return Options to apply when handling any resources in this service.
     * 
     */
    private final OptionsResponse options;
    /**
     * @return Self link for the type provider.
     * 
     */
    private final String selfLink;

    @CustomType.Constructor
    private GetTypeProviderResult(
        @CustomType.Parameter("collectionOverrides") List<CollectionOverrideResponse> collectionOverrides,
        @CustomType.Parameter("credential") CredentialResponse credential,
        @CustomType.Parameter("customCertificateAuthorityRoots") List<String> customCertificateAuthorityRoots,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("descriptorUrl") String descriptorUrl,
        @CustomType.Parameter("insertTime") String insertTime,
        @CustomType.Parameter("labels") List<TypeProviderLabelEntryResponse> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("operation") OperationResponse operation,
        @CustomType.Parameter("options") OptionsResponse options,
        @CustomType.Parameter("selfLink") String selfLink) {
        this.collectionOverrides = collectionOverrides;
        this.credential = credential;
        this.customCertificateAuthorityRoots = customCertificateAuthorityRoots;
        this.description = description;
        this.descriptorUrl = descriptorUrl;
        this.insertTime = insertTime;
        this.labels = labels;
        this.name = name;
        this.operation = operation;
        this.options = options;
        this.selfLink = selfLink;
    }

    /**
     * @return Allows resource handling overrides for specific collections
     * 
     */
    public List<CollectionOverrideResponse> collectionOverrides() {
        return this.collectionOverrides;
    }
    /**
     * @return Credential used when interacting with this type.
     * 
     */
    public CredentialResponse credential() {
        return this.credential;
    }
    /**
     * @return List of up to 2 custom certificate authority roots to use for TLS authentication when making calls on behalf of this type provider. If set, TLS authentication will exclusively use these roots instead of relying on publicly trusted certificate authorities when validating TLS certificate authenticity. The certificates must be in base64-encoded PEM format. The maximum size of each certificate must not exceed 10KB.
     * 
     */
    public List<String> customCertificateAuthorityRoots() {
        return this.customCertificateAuthorityRoots;
    }
    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Descriptor Url for the this type provider.
     * 
     */
    public String descriptorUrl() {
        return this.descriptorUrl;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String insertTime() {
        return this.insertTime;
    }
    /**
     * @return Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`
     * 
     */
    public List<TypeProviderLabelEntryResponse> labels() {
        return this.labels;
    }
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Operation that most recently ran, or is currently running, on this type provider.
     * 
     */
    public OperationResponse operation() {
        return this.operation;
    }
    /**
     * @return Options to apply when handling any resources in this service.
     * 
     */
    public OptionsResponse options() {
        return this.options;
    }
    /**
     * @return Self link for the type provider.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTypeProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CollectionOverrideResponse> collectionOverrides;
        private CredentialResponse credential;
        private List<String> customCertificateAuthorityRoots;
        private String description;
        private String descriptorUrl;
        private String insertTime;
        private List<TypeProviderLabelEntryResponse> labels;
        private String name;
        private OperationResponse operation;
        private OptionsResponse options;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTypeProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionOverrides = defaults.collectionOverrides;
    	      this.credential = defaults.credential;
    	      this.customCertificateAuthorityRoots = defaults.customCertificateAuthorityRoots;
    	      this.description = defaults.description;
    	      this.descriptorUrl = defaults.descriptorUrl;
    	      this.insertTime = defaults.insertTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.options = defaults.options;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder collectionOverrides(List<CollectionOverrideResponse> collectionOverrides) {
            this.collectionOverrides = Objects.requireNonNull(collectionOverrides);
            return this;
        }
        public Builder collectionOverrides(CollectionOverrideResponse... collectionOverrides) {
            return collectionOverrides(List.of(collectionOverrides));
        }
        public Builder credential(CredentialResponse credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }
        public Builder customCertificateAuthorityRoots(List<String> customCertificateAuthorityRoots) {
            this.customCertificateAuthorityRoots = Objects.requireNonNull(customCertificateAuthorityRoots);
            return this;
        }
        public Builder customCertificateAuthorityRoots(String... customCertificateAuthorityRoots) {
            return customCertificateAuthorityRoots(List.of(customCertificateAuthorityRoots));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder descriptorUrl(String descriptorUrl) {
            this.descriptorUrl = Objects.requireNonNull(descriptorUrl);
            return this;
        }
        public Builder insertTime(String insertTime) {
            this.insertTime = Objects.requireNonNull(insertTime);
            return this;
        }
        public Builder labels(List<TypeProviderLabelEntryResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(TypeProviderLabelEntryResponse... labels) {
            return labels(List.of(labels));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operation(OperationResponse operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        public Builder options(OptionsResponse options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }        public GetTypeProviderResult build() {
            return new GetTypeProviderResult(collectionOverrides, credential, customCertificateAuthorityRoots, description, descriptorUrl, insertTime, labels, name, operation, options, selfLink);
        }
    }
}
