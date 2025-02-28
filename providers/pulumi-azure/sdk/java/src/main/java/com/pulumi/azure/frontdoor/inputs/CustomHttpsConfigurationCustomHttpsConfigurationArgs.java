// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomHttpsConfigurationCustomHttpsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomHttpsConfigurationCustomHttpsConfigurationArgs Empty = new CustomHttpsConfigurationCustomHttpsConfigurationArgs();

    /**
     * The name of the Key Vault secret representing the full certificate PFX.
     * 
     */
    @Import(name="azureKeyVaultCertificateSecretName")
    private @Nullable Output<String> azureKeyVaultCertificateSecretName;

    /**
     * @return The name of the Key Vault secret representing the full certificate PFX.
     * 
     */
    public Optional<Output<String>> azureKeyVaultCertificateSecretName() {
        return Optional.ofNullable(this.azureKeyVaultCertificateSecretName);
    }

    /**
     * The version of the Key Vault secret representing the full certificate PFX. Defaults to `Latest`.
     * 
     */
    @Import(name="azureKeyVaultCertificateSecretVersion")
    private @Nullable Output<String> azureKeyVaultCertificateSecretVersion;

    /**
     * @return The version of the Key Vault secret representing the full certificate PFX. Defaults to `Latest`.
     * 
     */
    public Optional<Output<String>> azureKeyVaultCertificateSecretVersion() {
        return Optional.ofNullable(this.azureKeyVaultCertificateSecretVersion);
    }

    /**
     * The ID of the Key Vault containing the SSL certificate.
     * 
     */
    @Import(name="azureKeyVaultCertificateVaultId")
    private @Nullable Output<String> azureKeyVaultCertificateVaultId;

    /**
     * @return The ID of the Key Vault containing the SSL certificate.
     * 
     */
    public Optional<Output<String>> azureKeyVaultCertificateVaultId() {
        return Optional.ofNullable(this.azureKeyVaultCertificateVaultId);
    }

    /**
     * Certificate source to encrypted `HTTPS` traffic with. Allowed values are `FrontDoor` or `AzureKeyVault`. Defaults to `FrontDoor`.
     * 
     */
    @Import(name="certificateSource")
    private @Nullable Output<String> certificateSource;

    /**
     * @return Certificate source to encrypted `HTTPS` traffic with. Allowed values are `FrontDoor` or `AzureKeyVault`. Defaults to `FrontDoor`.
     * 
     */
    public Optional<Output<String>> certificateSource() {
        return Optional.ofNullable(this.certificateSource);
    }

    /**
     * Minimum client TLS version supported.
     * 
     */
    @Import(name="minimumTlsVersion")
    private @Nullable Output<String> minimumTlsVersion;

    /**
     * @return Minimum client TLS version supported.
     * 
     */
    public Optional<Output<String>> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }

    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    @Import(name="provisioningSubstate")
    private @Nullable Output<String> provisioningSubstate;

    public Optional<Output<String>> provisioningSubstate() {
        return Optional.ofNullable(this.provisioningSubstate);
    }

    private CustomHttpsConfigurationCustomHttpsConfigurationArgs() {}

    private CustomHttpsConfigurationCustomHttpsConfigurationArgs(CustomHttpsConfigurationCustomHttpsConfigurationArgs $) {
        this.azureKeyVaultCertificateSecretName = $.azureKeyVaultCertificateSecretName;
        this.azureKeyVaultCertificateSecretVersion = $.azureKeyVaultCertificateSecretVersion;
        this.azureKeyVaultCertificateVaultId = $.azureKeyVaultCertificateVaultId;
        this.certificateSource = $.certificateSource;
        this.minimumTlsVersion = $.minimumTlsVersion;
        this.provisioningState = $.provisioningState;
        this.provisioningSubstate = $.provisioningSubstate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomHttpsConfigurationCustomHttpsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHttpsConfigurationCustomHttpsConfigurationArgs $;

        public Builder() {
            $ = new CustomHttpsConfigurationCustomHttpsConfigurationArgs();
        }

        public Builder(CustomHttpsConfigurationCustomHttpsConfigurationArgs defaults) {
            $ = new CustomHttpsConfigurationCustomHttpsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureKeyVaultCertificateSecretName The name of the Key Vault secret representing the full certificate PFX.
         * 
         * @return builder
         * 
         */
        public Builder azureKeyVaultCertificateSecretName(@Nullable Output<String> azureKeyVaultCertificateSecretName) {
            $.azureKeyVaultCertificateSecretName = azureKeyVaultCertificateSecretName;
            return this;
        }

        /**
         * @param azureKeyVaultCertificateSecretName The name of the Key Vault secret representing the full certificate PFX.
         * 
         * @return builder
         * 
         */
        public Builder azureKeyVaultCertificateSecretName(String azureKeyVaultCertificateSecretName) {
            return azureKeyVaultCertificateSecretName(Output.of(azureKeyVaultCertificateSecretName));
        }

        /**
         * @param azureKeyVaultCertificateSecretVersion The version of the Key Vault secret representing the full certificate PFX. Defaults to `Latest`.
         * 
         * @return builder
         * 
         */
        public Builder azureKeyVaultCertificateSecretVersion(@Nullable Output<String> azureKeyVaultCertificateSecretVersion) {
            $.azureKeyVaultCertificateSecretVersion = azureKeyVaultCertificateSecretVersion;
            return this;
        }

        /**
         * @param azureKeyVaultCertificateSecretVersion The version of the Key Vault secret representing the full certificate PFX. Defaults to `Latest`.
         * 
         * @return builder
         * 
         */
        public Builder azureKeyVaultCertificateSecretVersion(String azureKeyVaultCertificateSecretVersion) {
            return azureKeyVaultCertificateSecretVersion(Output.of(azureKeyVaultCertificateSecretVersion));
        }

        /**
         * @param azureKeyVaultCertificateVaultId The ID of the Key Vault containing the SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder azureKeyVaultCertificateVaultId(@Nullable Output<String> azureKeyVaultCertificateVaultId) {
            $.azureKeyVaultCertificateVaultId = azureKeyVaultCertificateVaultId;
            return this;
        }

        /**
         * @param azureKeyVaultCertificateVaultId The ID of the Key Vault containing the SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder azureKeyVaultCertificateVaultId(String azureKeyVaultCertificateVaultId) {
            return azureKeyVaultCertificateVaultId(Output.of(azureKeyVaultCertificateVaultId));
        }

        /**
         * @param certificateSource Certificate source to encrypted `HTTPS` traffic with. Allowed values are `FrontDoor` or `AzureKeyVault`. Defaults to `FrontDoor`.
         * 
         * @return builder
         * 
         */
        public Builder certificateSource(@Nullable Output<String> certificateSource) {
            $.certificateSource = certificateSource;
            return this;
        }

        /**
         * @param certificateSource Certificate source to encrypted `HTTPS` traffic with. Allowed values are `FrontDoor` or `AzureKeyVault`. Defaults to `FrontDoor`.
         * 
         * @return builder
         * 
         */
        public Builder certificateSource(String certificateSource) {
            return certificateSource(Output.of(certificateSource));
        }

        /**
         * @param minimumTlsVersion Minimum client TLS version supported.
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(@Nullable Output<String> minimumTlsVersion) {
            $.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        /**
         * @param minimumTlsVersion Minimum client TLS version supported.
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(String minimumTlsVersion) {
            return minimumTlsVersion(Output.of(minimumTlsVersion));
        }

        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        public Builder provisioningSubstate(@Nullable Output<String> provisioningSubstate) {
            $.provisioningSubstate = provisioningSubstate;
            return this;
        }

        public Builder provisioningSubstate(String provisioningSubstate) {
            return provisioningSubstate(Output.of(provisioningSubstate));
        }

        public CustomHttpsConfigurationCustomHttpsConfigurationArgs build() {
            return $;
        }
    }

}
