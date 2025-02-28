// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.CMKIdentityDefinitionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionConfigurationResponse {
    /**
     * @return User assigned identity to use to authenticate to customer&#39;s key vault. If not provided Managed Service Identity will be used.
     * 
     */
    private final @Nullable CMKIdentityDefinitionResponse identity;
    /**
     * @return The name of the key in Azure Key Vault to use as Customer Managed Key.
     * 
     */
    private final String keyName;
    /**
     * @return The version of the key used for CMK. If not provided, latest version will be used.
     * 
     */
    private final @Nullable String keyVersion;
    /**
     * @return The url of the Azure Key Vault used for CMK.
     * 
     */
    private final String vaultBaseUrl;

    @CustomType.Constructor
    private EncryptionConfigurationResponse(
        @CustomType.Parameter("identity") @Nullable CMKIdentityDefinitionResponse identity,
        @CustomType.Parameter("keyName") String keyName,
        @CustomType.Parameter("keyVersion") @Nullable String keyVersion,
        @CustomType.Parameter("vaultBaseUrl") String vaultBaseUrl) {
        this.identity = identity;
        this.keyName = keyName;
        this.keyVersion = keyVersion;
        this.vaultBaseUrl = vaultBaseUrl;
    }

    /**
     * @return User assigned identity to use to authenticate to customer&#39;s key vault. If not provided Managed Service Identity will be used.
     * 
     */
    public Optional<CMKIdentityDefinitionResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The name of the key in Azure Key Vault to use as Customer Managed Key.
     * 
     */
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return The version of the key used for CMK. If not provided, latest version will be used.
     * 
     */
    public Optional<String> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }
    /**
     * @return The url of the Azure Key Vault used for CMK.
     * 
     */
    public String vaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CMKIdentityDefinitionResponse identity;
        private String keyName;
        private @Nullable String keyVersion;
        private String vaultBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.vaultBaseUrl = defaults.vaultBaseUrl;
        }

        public Builder identity(@Nullable CMKIdentityDefinitionResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public Builder vaultBaseUrl(String vaultBaseUrl) {
            this.vaultBaseUrl = Objects.requireNonNull(vaultBaseUrl);
            return this;
        }        public EncryptionConfigurationResponse build() {
            return new EncryptionConfigurationResponse(identity, keyName, keyVersion, vaultBaseUrl);
        }
    }
}
