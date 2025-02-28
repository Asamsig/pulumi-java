// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.azurenative.databoxedge.outputs.DeviceSecretsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDeviceExtendedInformationResult {
    /**
     * @return The name of Channel Integrity Key stored in the Client Key Vault
     * 
     */
    private final @Nullable String channelIntegrityKeyName;
    /**
     * @return The version of Channel Integrity Key stored in the Client Key Vault
     * 
     */
    private final @Nullable String channelIntegrityKeyVersion;
    /**
     * @return The Key Vault ARM Id for client secrets
     * 
     */
    private final @Nullable String clientSecretStoreId;
    /**
     * @return The url to access the Client Key Vault
     * 
     */
    private final @Nullable String clientSecretStoreUrl;
    /**
     * @return Device secrets, will be returned only with ODataFilter $expand=deviceSecrets
     * 
     */
    private final DeviceSecretsResponse deviceSecrets;
    /**
     * @return The public part of the encryption certificate. Client uses this to encrypt any secret.
     * 
     */
    private final @Nullable String encryptionKey;
    /**
     * @return The digital signature of encrypted certificate.
     * 
     */
    private final @Nullable String encryptionKeyThumbprint;
    /**
     * @return The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * @return Key vault sync status
     * 
     */
    private final @Nullable String keyVaultSyncStatus;
    /**
     * @return The object name.
     * 
     */
    private final String name;
    /**
     * @return The Resource ID of the Resource.
     * 
     */
    private final String resourceKey;
    /**
     * @return The hierarchical type of the object.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDeviceExtendedInformationResult(
        @CustomType.Parameter("channelIntegrityKeyName") @Nullable String channelIntegrityKeyName,
        @CustomType.Parameter("channelIntegrityKeyVersion") @Nullable String channelIntegrityKeyVersion,
        @CustomType.Parameter("clientSecretStoreId") @Nullable String clientSecretStoreId,
        @CustomType.Parameter("clientSecretStoreUrl") @Nullable String clientSecretStoreUrl,
        @CustomType.Parameter("deviceSecrets") DeviceSecretsResponse deviceSecrets,
        @CustomType.Parameter("encryptionKey") @Nullable String encryptionKey,
        @CustomType.Parameter("encryptionKeyThumbprint") @Nullable String encryptionKeyThumbprint,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyVaultSyncStatus") @Nullable String keyVaultSyncStatus,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceKey") String resourceKey,
        @CustomType.Parameter("type") String type) {
        this.channelIntegrityKeyName = channelIntegrityKeyName;
        this.channelIntegrityKeyVersion = channelIntegrityKeyVersion;
        this.clientSecretStoreId = clientSecretStoreId;
        this.clientSecretStoreUrl = clientSecretStoreUrl;
        this.deviceSecrets = deviceSecrets;
        this.encryptionKey = encryptionKey;
        this.encryptionKeyThumbprint = encryptionKeyThumbprint;
        this.id = id;
        this.keyVaultSyncStatus = keyVaultSyncStatus;
        this.name = name;
        this.resourceKey = resourceKey;
        this.type = type;
    }

    /**
     * @return The name of Channel Integrity Key stored in the Client Key Vault
     * 
     */
    public Optional<String> channelIntegrityKeyName() {
        return Optional.ofNullable(this.channelIntegrityKeyName);
    }
    /**
     * @return The version of Channel Integrity Key stored in the Client Key Vault
     * 
     */
    public Optional<String> channelIntegrityKeyVersion() {
        return Optional.ofNullable(this.channelIntegrityKeyVersion);
    }
    /**
     * @return The Key Vault ARM Id for client secrets
     * 
     */
    public Optional<String> clientSecretStoreId() {
        return Optional.ofNullable(this.clientSecretStoreId);
    }
    /**
     * @return The url to access the Client Key Vault
     * 
     */
    public Optional<String> clientSecretStoreUrl() {
        return Optional.ofNullable(this.clientSecretStoreUrl);
    }
    /**
     * @return Device secrets, will be returned only with ODataFilter $expand=deviceSecrets
     * 
     */
    public DeviceSecretsResponse deviceSecrets() {
        return this.deviceSecrets;
    }
    /**
     * @return The public part of the encryption certificate. Client uses this to encrypt any secret.
     * 
     */
    public Optional<String> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * @return The digital signature of encrypted certificate.
     * 
     */
    public Optional<String> encryptionKeyThumbprint() {
        return Optional.ofNullable(this.encryptionKeyThumbprint);
    }
    /**
     * @return The path ID that uniquely identifies the object.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Key vault sync status
     * 
     */
    public Optional<String> keyVaultSyncStatus() {
        return Optional.ofNullable(this.keyVaultSyncStatus);
    }
    /**
     * @return The object name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Resource ID of the Resource.
     * 
     */
    public String resourceKey() {
        return this.resourceKey;
    }
    /**
     * @return The hierarchical type of the object.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceExtendedInformationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelIntegrityKeyName;
        private @Nullable String channelIntegrityKeyVersion;
        private @Nullable String clientSecretStoreId;
        private @Nullable String clientSecretStoreUrl;
        private DeviceSecretsResponse deviceSecrets;
        private @Nullable String encryptionKey;
        private @Nullable String encryptionKeyThumbprint;
        private String id;
        private @Nullable String keyVaultSyncStatus;
        private String name;
        private String resourceKey;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceExtendedInformationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelIntegrityKeyName = defaults.channelIntegrityKeyName;
    	      this.channelIntegrityKeyVersion = defaults.channelIntegrityKeyVersion;
    	      this.clientSecretStoreId = defaults.clientSecretStoreId;
    	      this.clientSecretStoreUrl = defaults.clientSecretStoreUrl;
    	      this.deviceSecrets = defaults.deviceSecrets;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.encryptionKeyThumbprint = defaults.encryptionKeyThumbprint;
    	      this.id = defaults.id;
    	      this.keyVaultSyncStatus = defaults.keyVaultSyncStatus;
    	      this.name = defaults.name;
    	      this.resourceKey = defaults.resourceKey;
    	      this.type = defaults.type;
        }

        public Builder channelIntegrityKeyName(@Nullable String channelIntegrityKeyName) {
            this.channelIntegrityKeyName = channelIntegrityKeyName;
            return this;
        }
        public Builder channelIntegrityKeyVersion(@Nullable String channelIntegrityKeyVersion) {
            this.channelIntegrityKeyVersion = channelIntegrityKeyVersion;
            return this;
        }
        public Builder clientSecretStoreId(@Nullable String clientSecretStoreId) {
            this.clientSecretStoreId = clientSecretStoreId;
            return this;
        }
        public Builder clientSecretStoreUrl(@Nullable String clientSecretStoreUrl) {
            this.clientSecretStoreUrl = clientSecretStoreUrl;
            return this;
        }
        public Builder deviceSecrets(DeviceSecretsResponse deviceSecrets) {
            this.deviceSecrets = Objects.requireNonNull(deviceSecrets);
            return this;
        }
        public Builder encryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder encryptionKeyThumbprint(@Nullable String encryptionKeyThumbprint) {
            this.encryptionKeyThumbprint = encryptionKeyThumbprint;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyVaultSyncStatus(@Nullable String keyVaultSyncStatus) {
            this.keyVaultSyncStatus = keyVaultSyncStatus;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceKey(String resourceKey) {
            this.resourceKey = Objects.requireNonNull(resourceKey);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDeviceExtendedInformationResult build() {
            return new GetDeviceExtendedInformationResult(channelIntegrityKeyName, channelIntegrityKeyVersion, clientSecretStoreId, clientSecretStoreUrl, deviceSecrets, encryptionKey, encryptionKeyThumbprint, id, keyVaultSyncStatus, name, resourceKey, type);
        }
    }
}
