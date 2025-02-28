// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceHostnameConfigurationProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceHostnameConfigurationProxyArgs Empty = new ServiceHostnameConfigurationProxyArgs();

    /**
     * The Base64 Encoded Certificate.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return The Base64 Encoded Certificate.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The password associated with the certificate provided above.
     * 
     */
    @Import(name="certificatePassword")
    private @Nullable Output<String> certificatePassword;

    /**
     * @return The password associated with the certificate provided above.
     * 
     */
    public Optional<Output<String>> certificatePassword() {
        return Optional.ofNullable(this.certificatePassword);
    }

    /**
     * Is the certificate associated with this Hostname the Default SSL Certificate? This is used when an SNI header isn&#39;t specified by a client. Defaults to `false`.
     * 
     */
    @Import(name="defaultSslBinding")
    private @Nullable Output<Boolean> defaultSslBinding;

    /**
     * @return Is the certificate associated with this Hostname the Default SSL Certificate? This is used when an SNI header isn&#39;t specified by a client. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> defaultSslBinding() {
        return Optional.ofNullable(this.defaultSslBinding);
    }

    /**
     * The expiration date of the certificate in RFC3339 format: `2000-01-02T03:04:05Z`.
     * 
     */
    @Import(name="expiry")
    private @Nullable Output<String> expiry;

    /**
     * @return The expiration date of the certificate in RFC3339 format: `2000-01-02T03:04:05Z`.
     * 
     */
    public Optional<Output<String>> expiry() {
        return Optional.ofNullable(this.expiry);
    }

    /**
     * The Hostname to use for the Management API.
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    /**
     * @return The Hostname to use for the Management API.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * The ID of the Key Vault Secret containing the SSL Certificate, which must be should be of the type `application/x-pkcs12`.
     * 
     */
    @Import(name="keyVaultId")
    private @Nullable Output<String> keyVaultId;

    /**
     * @return The ID of the Key Vault Secret containing the SSL Certificate, which must be should be of the type `application/x-pkcs12`.
     * 
     */
    public Optional<Output<String>> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }

    /**
     * Should Client Certificate Negotiation be enabled for this Hostname? Defaults to `false`.
     * 
     */
    @Import(name="negotiateClientCertificate")
    private @Nullable Output<Boolean> negotiateClientCertificate;

    /**
     * @return Should Client Certificate Negotiation be enabled for this Hostname? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> negotiateClientCertificate() {
        return Optional.ofNullable(this.negotiateClientCertificate);
    }

    /**
     * The Managed Identity Client ID to use to access the Key Vault. This Identity must be specified in the `identity` block to be used.
     * 
     */
    @Import(name="sslKeyvaultIdentityClientId")
    private @Nullable Output<String> sslKeyvaultIdentityClientId;

    /**
     * @return The Managed Identity Client ID to use to access the Key Vault. This Identity must be specified in the `identity` block to be used.
     * 
     */
    public Optional<Output<String>> sslKeyvaultIdentityClientId() {
        return Optional.ofNullable(this.sslKeyvaultIdentityClientId);
    }

    /**
     * The subject of the certificate.
     * 
     */
    @Import(name="subject")
    private @Nullable Output<String> subject;

    /**
     * @return The subject of the certificate.
     * 
     */
    public Optional<Output<String>> subject() {
        return Optional.ofNullable(this.subject);
    }

    /**
     * The thumbprint of the certificate.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The thumbprint of the certificate.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private ServiceHostnameConfigurationProxyArgs() {}

    private ServiceHostnameConfigurationProxyArgs(ServiceHostnameConfigurationProxyArgs $) {
        this.certificate = $.certificate;
        this.certificatePassword = $.certificatePassword;
        this.defaultSslBinding = $.defaultSslBinding;
        this.expiry = $.expiry;
        this.hostName = $.hostName;
        this.keyVaultId = $.keyVaultId;
        this.negotiateClientCertificate = $.negotiateClientCertificate;
        this.sslKeyvaultIdentityClientId = $.sslKeyvaultIdentityClientId;
        this.subject = $.subject;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceHostnameConfigurationProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceHostnameConfigurationProxyArgs $;

        public Builder() {
            $ = new ServiceHostnameConfigurationProxyArgs();
        }

        public Builder(ServiceHostnameConfigurationProxyArgs defaults) {
            $ = new ServiceHostnameConfigurationProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The Base64 Encoded Certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The Base64 Encoded Certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificatePassword The password associated with the certificate provided above.
         * 
         * @return builder
         * 
         */
        public Builder certificatePassword(@Nullable Output<String> certificatePassword) {
            $.certificatePassword = certificatePassword;
            return this;
        }

        /**
         * @param certificatePassword The password associated with the certificate provided above.
         * 
         * @return builder
         * 
         */
        public Builder certificatePassword(String certificatePassword) {
            return certificatePassword(Output.of(certificatePassword));
        }

        /**
         * @param defaultSslBinding Is the certificate associated with this Hostname the Default SSL Certificate? This is used when an SNI header isn&#39;t specified by a client. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder defaultSslBinding(@Nullable Output<Boolean> defaultSslBinding) {
            $.defaultSslBinding = defaultSslBinding;
            return this;
        }

        /**
         * @param defaultSslBinding Is the certificate associated with this Hostname the Default SSL Certificate? This is used when an SNI header isn&#39;t specified by a client. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder defaultSslBinding(Boolean defaultSslBinding) {
            return defaultSslBinding(Output.of(defaultSslBinding));
        }

        /**
         * @param expiry The expiration date of the certificate in RFC3339 format: `2000-01-02T03:04:05Z`.
         * 
         * @return builder
         * 
         */
        public Builder expiry(@Nullable Output<String> expiry) {
            $.expiry = expiry;
            return this;
        }

        /**
         * @param expiry The expiration date of the certificate in RFC3339 format: `2000-01-02T03:04:05Z`.
         * 
         * @return builder
         * 
         */
        public Builder expiry(String expiry) {
            return expiry(Output.of(expiry));
        }

        /**
         * @param hostName The Hostname to use for the Management API.
         * 
         * @return builder
         * 
         */
        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName The Hostname to use for the Management API.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param keyVaultId The ID of the Key Vault Secret containing the SSL Certificate, which must be should be of the type `application/x-pkcs12`.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of the Key Vault Secret containing the SSL Certificate, which must be should be of the type `application/x-pkcs12`.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param negotiateClientCertificate Should Client Certificate Negotiation be enabled for this Hostname? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder negotiateClientCertificate(@Nullable Output<Boolean> negotiateClientCertificate) {
            $.negotiateClientCertificate = negotiateClientCertificate;
            return this;
        }

        /**
         * @param negotiateClientCertificate Should Client Certificate Negotiation be enabled for this Hostname? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder negotiateClientCertificate(Boolean negotiateClientCertificate) {
            return negotiateClientCertificate(Output.of(negotiateClientCertificate));
        }

        /**
         * @param sslKeyvaultIdentityClientId The Managed Identity Client ID to use to access the Key Vault. This Identity must be specified in the `identity` block to be used.
         * 
         * @return builder
         * 
         */
        public Builder sslKeyvaultIdentityClientId(@Nullable Output<String> sslKeyvaultIdentityClientId) {
            $.sslKeyvaultIdentityClientId = sslKeyvaultIdentityClientId;
            return this;
        }

        /**
         * @param sslKeyvaultIdentityClientId The Managed Identity Client ID to use to access the Key Vault. This Identity must be specified in the `identity` block to be used.
         * 
         * @return builder
         * 
         */
        public Builder sslKeyvaultIdentityClientId(String sslKeyvaultIdentityClientId) {
            return sslKeyvaultIdentityClientId(Output.of(sslKeyvaultIdentityClientId));
        }

        /**
         * @param subject The subject of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder subject(@Nullable Output<String> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject The subject of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param thumbprint The thumbprint of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The thumbprint of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public ServiceHostnameConfigurationProxyArgs build() {
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            return $;
        }
    }

}
