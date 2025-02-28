// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * Specifies the name of the Batch account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Specifies the name of the Batch account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The base64-encoded contents of the certificate.
     * 
     */
    @Import(name="certificate", required=true)
    private Output<String> certificate;

    /**
     * @return The base64-encoded contents of the certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }

    /**
     * The format of the certificate. Possible values are `Cer` or `Pfx`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return The format of the certificate. Possible values are `Cer` or `Pfx`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * The password to access the certificate&#39;s private key. This can only be specified when `format` is `Pfx`.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password to access the certificate&#39;s private key. This can only be specified when `format` is `Pfx`.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The thumbprint of the certificate. At this time the only supported value is &#39;SHA1&#39;.
     * 
     */
    @Import(name="thumbprint", required=true)
    private Output<String> thumbprint;

    /**
     * @return The thumbprint of the certificate. At this time the only supported value is &#39;SHA1&#39;.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
    }

    @Import(name="thumbprintAlgorithm", required=true)
    private Output<String> thumbprintAlgorithm;

    public Output<String> thumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.accountName = $.accountName;
        this.certificate = $.certificate;
        this.format = $.format;
        this.password = $.password;
        this.resourceGroupName = $.resourceGroupName;
        this.thumbprint = $.thumbprint;
        this.thumbprintAlgorithm = $.thumbprintAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Specifies the name of the Batch account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Specifies the name of the Batch account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param certificate The base64-encoded contents of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The base64-encoded contents of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param format The format of the certificate. Possible values are `Cer` or `Pfx`.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of the certificate. Possible values are `Cer` or `Pfx`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param password The password to access the certificate&#39;s private key. This can only be specified when `format` is `Pfx`.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password to access the certificate&#39;s private key. This can only be specified when `format` is `Pfx`.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param thumbprint The thumbprint of the certificate. At this time the only supported value is &#39;SHA1&#39;.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The thumbprint of the certificate. At this time the only supported value is &#39;SHA1&#39;.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public Builder thumbprintAlgorithm(Output<String> thumbprintAlgorithm) {
            $.thumbprintAlgorithm = thumbprintAlgorithm;
            return this;
        }

        public Builder thumbprintAlgorithm(String thumbprintAlgorithm) {
            return thumbprintAlgorithm(Output.of(thumbprintAlgorithm));
        }

        public CertificateArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.certificate = Objects.requireNonNull($.certificate, "expected parameter 'certificate' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.thumbprint = Objects.requireNonNull($.thumbprint, "expected parameter 'thumbprint' to be non-null");
            $.thumbprintAlgorithm = Objects.requireNonNull($.thumbprintAlgorithm, "expected parameter 'thumbprintAlgorithm' to be non-null");
            return $;
        }
    }

}
