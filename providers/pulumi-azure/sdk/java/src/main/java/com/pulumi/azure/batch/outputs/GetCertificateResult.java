// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateResult {
    private final String accountName;
    /**
     * @return The format of the certificate, such as `Cer` or `Pfx`.
     * 
     */
    private final String format;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return The public key of the certificate.
     * 
     */
    private final String publicData;
    private final String resourceGroupName;
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    private final String thumbprint;
    /**
     * @return The algorithm of the certificate thumbprint.
     * 
     */
    private final String thumbprintAlgorithm;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publicData") String publicData,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("thumbprint") String thumbprint,
        @CustomType.Parameter("thumbprintAlgorithm") String thumbprintAlgorithm) {
        this.accountName = accountName;
        this.format = format;
        this.id = id;
        this.name = name;
        this.publicData = publicData;
        this.resourceGroupName = resourceGroupName;
        this.thumbprint = thumbprint;
        this.thumbprintAlgorithm = thumbprintAlgorithm;
    }

    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The format of the certificate, such as `Cer` or `Pfx`.
     * 
     */
    public String format() {
        return this.format;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The public key of the certificate.
     * 
     */
    public String publicData() {
        return this.publicData;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * @return The algorithm of the certificate thumbprint.
     * 
     */
    public String thumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String format;
        private String id;
        private String name;
        private String publicData;
        private String resourceGroupName;
        private String thumbprint;
        private String thumbprintAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.publicData = defaults.publicData;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.thumbprint = defaults.thumbprint;
    	      this.thumbprintAlgorithm = defaults.thumbprintAlgorithm;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publicData(String publicData) {
            this.publicData = Objects.requireNonNull(publicData);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public Builder thumbprintAlgorithm(String thumbprintAlgorithm) {
            this.thumbprintAlgorithm = Objects.requireNonNull(thumbprintAlgorithm);
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(accountName, format, id, name, publicData, resourceGroupName, thumbprint, thumbprintAlgorithm);
        }
    }
}
