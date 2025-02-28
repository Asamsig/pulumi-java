// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.outputs;

import com.pulumi.azurenative.app.outputs.AppleResponse;
import com.pulumi.azurenative.app.outputs.AzureActiveDirectoryResponse;
import com.pulumi.azurenative.app.outputs.AzureStaticWebAppsResponse;
import com.pulumi.azurenative.app.outputs.CustomOpenIdConnectProviderResponse;
import com.pulumi.azurenative.app.outputs.FacebookResponse;
import com.pulumi.azurenative.app.outputs.GitHubResponse;
import com.pulumi.azurenative.app.outputs.GoogleResponse;
import com.pulumi.azurenative.app.outputs.TwitterResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IdentityProvidersResponse {
    /**
     * @return The configuration settings of the Apple provider.
     * 
     */
    private final @Nullable AppleResponse apple;
    /**
     * @return The configuration settings of the Azure Active directory provider.
     * 
     */
    private final @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
    /**
     * @return The configuration settings of the Azure Static Web Apps provider.
     * 
     */
    private final @Nullable AzureStaticWebAppsResponse azureStaticWebApps;
    /**
     * @return The map of the name of the alias of each custom Open ID Connect provider to the
     * configuration settings of the custom Open ID Connect provider.
     * 
     */
    private final @Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders;
    /**
     * @return The configuration settings of the Facebook provider.
     * 
     */
    private final @Nullable FacebookResponse facebook;
    /**
     * @return The configuration settings of the GitHub provider.
     * 
     */
    private final @Nullable GitHubResponse gitHub;
    /**
     * @return The configuration settings of the Google provider.
     * 
     */
    private final @Nullable GoogleResponse google;
    /**
     * @return The configuration settings of the Twitter provider.
     * 
     */
    private final @Nullable TwitterResponse twitter;

    @CustomType.Constructor
    private IdentityProvidersResponse(
        @CustomType.Parameter("apple") @Nullable AppleResponse apple,
        @CustomType.Parameter("azureActiveDirectory") @Nullable AzureActiveDirectoryResponse azureActiveDirectory,
        @CustomType.Parameter("azureStaticWebApps") @Nullable AzureStaticWebAppsResponse azureStaticWebApps,
        @CustomType.Parameter("customOpenIdConnectProviders") @Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders,
        @CustomType.Parameter("facebook") @Nullable FacebookResponse facebook,
        @CustomType.Parameter("gitHub") @Nullable GitHubResponse gitHub,
        @CustomType.Parameter("google") @Nullable GoogleResponse google,
        @CustomType.Parameter("twitter") @Nullable TwitterResponse twitter) {
        this.apple = apple;
        this.azureActiveDirectory = azureActiveDirectory;
        this.azureStaticWebApps = azureStaticWebApps;
        this.customOpenIdConnectProviders = customOpenIdConnectProviders;
        this.facebook = facebook;
        this.gitHub = gitHub;
        this.google = google;
        this.twitter = twitter;
    }

    /**
     * @return The configuration settings of the Apple provider.
     * 
     */
    public Optional<AppleResponse> apple() {
        return Optional.ofNullable(this.apple);
    }
    /**
     * @return The configuration settings of the Azure Active directory provider.
     * 
     */
    public Optional<AzureActiveDirectoryResponse> azureActiveDirectory() {
        return Optional.ofNullable(this.azureActiveDirectory);
    }
    /**
     * @return The configuration settings of the Azure Static Web Apps provider.
     * 
     */
    public Optional<AzureStaticWebAppsResponse> azureStaticWebApps() {
        return Optional.ofNullable(this.azureStaticWebApps);
    }
    /**
     * @return The map of the name of the alias of each custom Open ID Connect provider to the
     * configuration settings of the custom Open ID Connect provider.
     * 
     */
    public Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders() {
        return this.customOpenIdConnectProviders == null ? Map.of() : this.customOpenIdConnectProviders;
    }
    /**
     * @return The configuration settings of the Facebook provider.
     * 
     */
    public Optional<FacebookResponse> facebook() {
        return Optional.ofNullable(this.facebook);
    }
    /**
     * @return The configuration settings of the GitHub provider.
     * 
     */
    public Optional<GitHubResponse> gitHub() {
        return Optional.ofNullable(this.gitHub);
    }
    /**
     * @return The configuration settings of the Google provider.
     * 
     */
    public Optional<GoogleResponse> google() {
        return Optional.ofNullable(this.google);
    }
    /**
     * @return The configuration settings of the Twitter provider.
     * 
     */
    public Optional<TwitterResponse> twitter() {
        return Optional.ofNullable(this.twitter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProvidersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppleResponse apple;
        private @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
        private @Nullable AzureStaticWebAppsResponse azureStaticWebApps;
        private @Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders;
        private @Nullable FacebookResponse facebook;
        private @Nullable GitHubResponse gitHub;
        private @Nullable GoogleResponse google;
        private @Nullable TwitterResponse twitter;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProvidersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apple = defaults.apple;
    	      this.azureActiveDirectory = defaults.azureActiveDirectory;
    	      this.azureStaticWebApps = defaults.azureStaticWebApps;
    	      this.customOpenIdConnectProviders = defaults.customOpenIdConnectProviders;
    	      this.facebook = defaults.facebook;
    	      this.gitHub = defaults.gitHub;
    	      this.google = defaults.google;
    	      this.twitter = defaults.twitter;
        }

        public Builder apple(@Nullable AppleResponse apple) {
            this.apple = apple;
            return this;
        }
        public Builder azureActiveDirectory(@Nullable AzureActiveDirectoryResponse azureActiveDirectory) {
            this.azureActiveDirectory = azureActiveDirectory;
            return this;
        }
        public Builder azureStaticWebApps(@Nullable AzureStaticWebAppsResponse azureStaticWebApps) {
            this.azureStaticWebApps = azureStaticWebApps;
            return this;
        }
        public Builder customOpenIdConnectProviders(@Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders) {
            this.customOpenIdConnectProviders = customOpenIdConnectProviders;
            return this;
        }
        public Builder facebook(@Nullable FacebookResponse facebook) {
            this.facebook = facebook;
            return this;
        }
        public Builder gitHub(@Nullable GitHubResponse gitHub) {
            this.gitHub = gitHub;
            return this;
        }
        public Builder google(@Nullable GoogleResponse google) {
            this.google = google;
            return this;
        }
        public Builder twitter(@Nullable TwitterResponse twitter) {
            this.twitter = twitter;
            return this;
        }        public IdentityProvidersResponse build() {
            return new IdentityProvidersResponse(apple, azureActiveDirectory, azureStaticWebApps, customOpenIdConnectProviders, facebook, gitHub, google, twitter);
        }
    }
}
