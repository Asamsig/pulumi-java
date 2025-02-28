// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure;

import com.pulumi.azure.inputs.ProviderFeaturesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="auxiliaryTenantIds", json=true)
    private @Nullable Output<List<String>> auxiliaryTenantIds;

    public Optional<Output<List<String>>> auxiliaryTenantIds() {
        return Optional.ofNullable(this.auxiliaryTenantIds);
    }

    /**
     * The password associated with the Client Certificate. For use when authenticating as a Service Principal using a Client
     * Certificate
     * 
     */
    @Import(name="clientCertificatePassword")
    private @Nullable Output<String> clientCertificatePassword;

    /**
     * @return The password associated with the Client Certificate. For use when authenticating as a Service Principal using a Client
     * Certificate
     * 
     */
    public Optional<Output<String>> clientCertificatePassword() {
        return Optional.ofNullable(this.clientCertificatePassword);
    }

    /**
     * The path to the Client Certificate associated with the Service Principal for use when authenticating as a Service
     * Principal using a Client Certificate.
     * 
     */
    @Import(name="clientCertificatePath")
    private @Nullable Output<String> clientCertificatePath;

    /**
     * @return The path to the Client Certificate associated with the Service Principal for use when authenticating as a Service
     * Principal using a Client Certificate.
     * 
     */
    public Optional<Output<String>> clientCertificatePath() {
        return Optional.ofNullable(this.clientCertificatePath);
    }

    /**
     * The Client ID which should be used.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The Client ID which should be used.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The Client Secret which should be used. For use When authenticating as a Service Principal using a Client Secret.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The Client Secret which should be used. For use When authenticating as a Service Principal using a Client Secret.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * This will disable the x-ms-correlation-request-id header.
     * 
     */
    @Import(name="disableCorrelationRequestId", json=true)
    private @Nullable Output<Boolean> disableCorrelationRequestId;

    /**
     * @return This will disable the x-ms-correlation-request-id header.
     * 
     */
    public Optional<Output<Boolean>> disableCorrelationRequestId() {
        return Optional.ofNullable(this.disableCorrelationRequestId);
    }

    /**
     * This will disable the Terraform Partner ID which is used if a custom `partner_id` isn&#39;t specified.
     * 
     */
    @Import(name="disableTerraformPartnerId", json=true)
    private @Nullable Output<Boolean> disableTerraformPartnerId;

    /**
     * @return This will disable the Terraform Partner ID which is used if a custom `partner_id` isn&#39;t specified.
     * 
     */
    public Optional<Output<Boolean>> disableTerraformPartnerId() {
        return Optional.ofNullable(this.disableTerraformPartnerId);
    }

    /**
     * The Cloud Environment which should be used. Possible values are public, usgovernment, and china. Defaults to public.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return The Cloud Environment which should be used. Possible values are public, usgovernment, and china. Defaults to public.
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    @Import(name="features", json=true)
    private @Nullable Output<ProviderFeaturesArgs> features;

    public Optional<Output<ProviderFeaturesArgs>> features() {
        return Optional.ofNullable(this.features);
    }

    /**
     * The Hostname which should be used for the Azure Metadata Service.
     * 
     */
    @Import(name="metadataHost")
    private @Nullable Output<String> metadataHost;

    /**
     * @return The Hostname which should be used for the Azure Metadata Service.
     * 
     */
    public Optional<Output<String>> metadataHost() {
        return Optional.ofNullable(this.metadataHost);
    }

    /**
     * The path to a custom endpoint for Managed Service Identity - in most circumstances this should be detected
     * automatically.
     * 
     */
    @Import(name="msiEndpoint")
    private @Nullable Output<String> msiEndpoint;

    /**
     * @return The path to a custom endpoint for Managed Service Identity - in most circumstances this should be detected
     * automatically.
     * 
     */
    public Optional<Output<String>> msiEndpoint() {
        return Optional.ofNullable(this.msiEndpoint);
    }

    /**
     * A GUID/UUID that is registered with Microsoft to facilitate partner resource usage attribution.
     * 
     */
    @Import(name="partnerId")
    private @Nullable Output<String> partnerId;

    /**
     * @return A GUID/UUID that is registered with Microsoft to facilitate partner resource usage attribution.
     * 
     */
    public Optional<Output<String>> partnerId() {
        return Optional.ofNullable(this.partnerId);
    }

    /**
     * Should the AzureRM Provider skip registering all of the Resource Providers that it supports, if they&#39;re not already
     * registered?
     * 
     */
    @Import(name="skipProviderRegistration", json=true)
    private @Nullable Output<Boolean> skipProviderRegistration;

    /**
     * @return Should the AzureRM Provider skip registering all of the Resource Providers that it supports, if they&#39;re not already
     * registered?
     * 
     */
    public Optional<Output<Boolean>> skipProviderRegistration() {
        return Optional.ofNullable(this.skipProviderRegistration);
    }

    /**
     * Should the AzureRM Provider use AzureAD to access the Storage Data Plane API&#39;s?
     * 
     */
    @Import(name="storageUseAzuread", json=true)
    private @Nullable Output<Boolean> storageUseAzuread;

    /**
     * @return Should the AzureRM Provider use AzureAD to access the Storage Data Plane API&#39;s?
     * 
     */
    public Optional<Output<Boolean>> storageUseAzuread() {
        return Optional.ofNullable(this.storageUseAzuread);
    }

    /**
     * The Subscription ID which should be used.
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return The Subscription ID which should be used.
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The Tenant ID which should be used.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID which should be used.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Allowed Managed Service Identity be used for Authentication.
     * 
     */
    @Import(name="useMsi", json=true)
    private @Nullable Output<Boolean> useMsi;

    /**
     * @return Allowed Managed Service Identity be used for Authentication.
     * 
     */
    public Optional<Output<Boolean>> useMsi() {
        return Optional.ofNullable(this.useMsi);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.auxiliaryTenantIds = $.auxiliaryTenantIds;
        this.clientCertificatePassword = $.clientCertificatePassword;
        this.clientCertificatePath = $.clientCertificatePath;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.disableCorrelationRequestId = $.disableCorrelationRequestId;
        this.disableTerraformPartnerId = $.disableTerraformPartnerId;
        this.environment = $.environment;
        this.features = $.features;
        this.metadataHost = $.metadataHost;
        this.msiEndpoint = $.msiEndpoint;
        this.partnerId = $.partnerId;
        this.skipProviderRegistration = $.skipProviderRegistration;
        this.storageUseAzuread = $.storageUseAzuread;
        this.subscriptionId = $.subscriptionId;
        this.tenantId = $.tenantId;
        this.useMsi = $.useMsi;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder auxiliaryTenantIds(@Nullable Output<List<String>> auxiliaryTenantIds) {
            $.auxiliaryTenantIds = auxiliaryTenantIds;
            return this;
        }

        public Builder auxiliaryTenantIds(List<String> auxiliaryTenantIds) {
            return auxiliaryTenantIds(Output.of(auxiliaryTenantIds));
        }

        public Builder auxiliaryTenantIds(String... auxiliaryTenantIds) {
            return auxiliaryTenantIds(List.of(auxiliaryTenantIds));
        }

        /**
         * @param clientCertificatePassword The password associated with the Client Certificate. For use when authenticating as a Service Principal using a Client
         * Certificate
         * 
         * @return builder
         * 
         */
        public Builder clientCertificatePassword(@Nullable Output<String> clientCertificatePassword) {
            $.clientCertificatePassword = clientCertificatePassword;
            return this;
        }

        /**
         * @param clientCertificatePassword The password associated with the Client Certificate. For use when authenticating as a Service Principal using a Client
         * Certificate
         * 
         * @return builder
         * 
         */
        public Builder clientCertificatePassword(String clientCertificatePassword) {
            return clientCertificatePassword(Output.of(clientCertificatePassword));
        }

        /**
         * @param clientCertificatePath The path to the Client Certificate associated with the Service Principal for use when authenticating as a Service
         * Principal using a Client Certificate.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificatePath(@Nullable Output<String> clientCertificatePath) {
            $.clientCertificatePath = clientCertificatePath;
            return this;
        }

        /**
         * @param clientCertificatePath The path to the Client Certificate associated with the Service Principal for use when authenticating as a Service
         * Principal using a Client Certificate.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificatePath(String clientCertificatePath) {
            return clientCertificatePath(Output.of(clientCertificatePath));
        }

        /**
         * @param clientId The Client ID which should be used.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The Client ID which should be used.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The Client Secret which should be used. For use When authenticating as a Service Principal using a Client Secret.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The Client Secret which should be used. For use When authenticating as a Service Principal using a Client Secret.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param disableCorrelationRequestId This will disable the x-ms-correlation-request-id header.
         * 
         * @return builder
         * 
         */
        public Builder disableCorrelationRequestId(@Nullable Output<Boolean> disableCorrelationRequestId) {
            $.disableCorrelationRequestId = disableCorrelationRequestId;
            return this;
        }

        /**
         * @param disableCorrelationRequestId This will disable the x-ms-correlation-request-id header.
         * 
         * @return builder
         * 
         */
        public Builder disableCorrelationRequestId(Boolean disableCorrelationRequestId) {
            return disableCorrelationRequestId(Output.of(disableCorrelationRequestId));
        }

        /**
         * @param disableTerraformPartnerId This will disable the Terraform Partner ID which is used if a custom `partner_id` isn&#39;t specified.
         * 
         * @return builder
         * 
         */
        public Builder disableTerraformPartnerId(@Nullable Output<Boolean> disableTerraformPartnerId) {
            $.disableTerraformPartnerId = disableTerraformPartnerId;
            return this;
        }

        /**
         * @param disableTerraformPartnerId This will disable the Terraform Partner ID which is used if a custom `partner_id` isn&#39;t specified.
         * 
         * @return builder
         * 
         */
        public Builder disableTerraformPartnerId(Boolean disableTerraformPartnerId) {
            return disableTerraformPartnerId(Output.of(disableTerraformPartnerId));
        }

        /**
         * @param environment The Cloud Environment which should be used. Possible values are public, usgovernment, and china. Defaults to public.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The Cloud Environment which should be used. Possible values are public, usgovernment, and china. Defaults to public.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        public Builder features(@Nullable Output<ProviderFeaturesArgs> features) {
            $.features = features;
            return this;
        }

        public Builder features(ProviderFeaturesArgs features) {
            return features(Output.of(features));
        }

        /**
         * @param metadataHost The Hostname which should be used for the Azure Metadata Service.
         * 
         * @return builder
         * 
         */
        public Builder metadataHost(@Nullable Output<String> metadataHost) {
            $.metadataHost = metadataHost;
            return this;
        }

        /**
         * @param metadataHost The Hostname which should be used for the Azure Metadata Service.
         * 
         * @return builder
         * 
         */
        public Builder metadataHost(String metadataHost) {
            return metadataHost(Output.of(metadataHost));
        }

        /**
         * @param msiEndpoint The path to a custom endpoint for Managed Service Identity - in most circumstances this should be detected
         * automatically.
         * 
         * @return builder
         * 
         */
        public Builder msiEndpoint(@Nullable Output<String> msiEndpoint) {
            $.msiEndpoint = msiEndpoint;
            return this;
        }

        /**
         * @param msiEndpoint The path to a custom endpoint for Managed Service Identity - in most circumstances this should be detected
         * automatically.
         * 
         * @return builder
         * 
         */
        public Builder msiEndpoint(String msiEndpoint) {
            return msiEndpoint(Output.of(msiEndpoint));
        }

        /**
         * @param partnerId A GUID/UUID that is registered with Microsoft to facilitate partner resource usage attribution.
         * 
         * @return builder
         * 
         */
        public Builder partnerId(@Nullable Output<String> partnerId) {
            $.partnerId = partnerId;
            return this;
        }

        /**
         * @param partnerId A GUID/UUID that is registered with Microsoft to facilitate partner resource usage attribution.
         * 
         * @return builder
         * 
         */
        public Builder partnerId(String partnerId) {
            return partnerId(Output.of(partnerId));
        }

        /**
         * @param skipProviderRegistration Should the AzureRM Provider skip registering all of the Resource Providers that it supports, if they&#39;re not already
         * registered?
         * 
         * @return builder
         * 
         */
        public Builder skipProviderRegistration(@Nullable Output<Boolean> skipProviderRegistration) {
            $.skipProviderRegistration = skipProviderRegistration;
            return this;
        }

        /**
         * @param skipProviderRegistration Should the AzureRM Provider skip registering all of the Resource Providers that it supports, if they&#39;re not already
         * registered?
         * 
         * @return builder
         * 
         */
        public Builder skipProviderRegistration(Boolean skipProviderRegistration) {
            return skipProviderRegistration(Output.of(skipProviderRegistration));
        }

        /**
         * @param storageUseAzuread Should the AzureRM Provider use AzureAD to access the Storage Data Plane API&#39;s?
         * 
         * @return builder
         * 
         */
        public Builder storageUseAzuread(@Nullable Output<Boolean> storageUseAzuread) {
            $.storageUseAzuread = storageUseAzuread;
            return this;
        }

        /**
         * @param storageUseAzuread Should the AzureRM Provider use AzureAD to access the Storage Data Plane API&#39;s?
         * 
         * @return builder
         * 
         */
        public Builder storageUseAzuread(Boolean storageUseAzuread) {
            return storageUseAzuread(Output.of(storageUseAzuread));
        }

        /**
         * @param subscriptionId The Subscription ID which should be used.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The Subscription ID which should be used.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tenantId The Tenant ID which should be used.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID which should be used.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param useMsi Allowed Managed Service Identity be used for Authentication.
         * 
         * @return builder
         * 
         */
        public Builder useMsi(@Nullable Output<Boolean> useMsi) {
            $.useMsi = useMsi;
            return this;
        }

        /**
         * @param useMsi Allowed Managed Service Identity be used for Authentication.
         * 
         * @return builder
         * 
         */
        public Builder useMsi(Boolean useMsi) {
            return useMsi(Output.of(useMsi));
        }

        public ProviderArgs build() {
            $.environment = Codegen.stringProp("environment").output().arg($.environment).env("AZURE_ENVIRONMENT", "ARM_ENVIRONMENT").def("public").getNullable();
            $.metadataHost = Codegen.stringProp("metadataHost").output().arg($.metadataHost).env("ARM_METADATA_HOSTNAME").getNullable();
            $.skipProviderRegistration = Codegen.booleanProp("skipProviderRegistration").output().arg($.skipProviderRegistration).env("ARM_SKIP_PROVIDER_REGISTRATION").def(false).getNullable();
            $.storageUseAzuread = Codegen.booleanProp("storageUseAzuread").output().arg($.storageUseAzuread).env("ARM_STORAGE_USE_AZUREAD").def(false).getNullable();
            $.subscriptionId = Codegen.stringProp("subscriptionId").output().arg($.subscriptionId).env("ARM_SUBSCRIPTION_ID").def("").getNullable();
            return $;
        }
    }

}
