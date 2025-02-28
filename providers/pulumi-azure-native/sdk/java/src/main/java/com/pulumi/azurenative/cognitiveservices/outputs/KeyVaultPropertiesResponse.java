// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultPropertiesResponse {
    /**
     * @return Name of the Key from KeyVault
     * 
     */
    private final @Nullable String keyName;
    /**
     * @return Uri of KeyVault
     * 
     */
    private final @Nullable String keyVaultUri;
    /**
     * @return Version of the Key from KeyVault
     * 
     */
    private final @Nullable String keyVersion;

    @CustomType.Constructor
    private KeyVaultPropertiesResponse(
        @CustomType.Parameter("keyName") @Nullable String keyName,
        @CustomType.Parameter("keyVaultUri") @Nullable String keyVaultUri,
        @CustomType.Parameter("keyVersion") @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    /**
     * @return Name of the Key from KeyVault
     * 
     */
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * @return Uri of KeyVault
     * 
     */
    public Optional<String> keyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }
    /**
     * @return Version of the Key from KeyVault
     * 
     */
    public Optional<String> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyName, keyVaultUri, keyVersion);
        }
    }
}
