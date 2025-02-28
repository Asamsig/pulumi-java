// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionBackendServiceIap {
    /**
     * @return OAuth2 Client ID for IAP
     * 
     */
    private final String oauth2ClientId;
    /**
     * @return OAuth2 Client Secret for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private final String oauth2ClientSecret;
    /**
     * @return -
     * OAuth2 Client Secret SHA-256 for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private final @Nullable String oauth2ClientSecretSha256;

    @CustomType.Constructor
    private RegionBackendServiceIap(
        @CustomType.Parameter("oauth2ClientId") String oauth2ClientId,
        @CustomType.Parameter("oauth2ClientSecret") String oauth2ClientSecret,
        @CustomType.Parameter("oauth2ClientSecretSha256") @Nullable String oauth2ClientSecretSha256) {
        this.oauth2ClientId = oauth2ClientId;
        this.oauth2ClientSecret = oauth2ClientSecret;
        this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
    }

    /**
     * @return OAuth2 Client ID for IAP
     * 
     */
    public String oauth2ClientId() {
        return this.oauth2ClientId;
    }
    /**
     * @return OAuth2 Client Secret for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public String oauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }
    /**
     * @return -
     * OAuth2 Client Secret SHA-256 for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<String> oauth2ClientSecretSha256() {
        return Optional.ofNullable(this.oauth2ClientSecretSha256);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceIap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String oauth2ClientId;
        private String oauth2ClientSecret;
        private @Nullable String oauth2ClientSecretSha256;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceIap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
    	      this.oauth2ClientSecretSha256 = defaults.oauth2ClientSecretSha256;
        }

        public Builder oauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }
        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
            return this;
        }
        public Builder oauth2ClientSecretSha256(@Nullable String oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
            return this;
        }        public RegionBackendServiceIap build() {
            return new RegionBackendServiceIap(oauth2ClientId, oauth2ClientSecret, oauth2ClientSecretSha256);
        }
    }
}
