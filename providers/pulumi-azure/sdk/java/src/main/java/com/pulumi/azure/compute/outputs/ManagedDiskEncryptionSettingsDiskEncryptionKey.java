// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedDiskEncryptionSettingsDiskEncryptionKey {
    /**
     * @return The URL to the Key Vault Secret used as the Disk Encryption Key. This can be found as `id` on the `azure.keyvault.Secret` resource.
     * 
     */
    private final String secretUrl;
    /**
     * @return The ID of the source Key Vault.
     * 
     */
    private final String sourceVaultId;

    @CustomType.Constructor
    private ManagedDiskEncryptionSettingsDiskEncryptionKey(
        @CustomType.Parameter("secretUrl") String secretUrl,
        @CustomType.Parameter("sourceVaultId") String sourceVaultId) {
        this.secretUrl = secretUrl;
        this.sourceVaultId = sourceVaultId;
    }

    /**
     * @return The URL to the Key Vault Secret used as the Disk Encryption Key. This can be found as `id` on the `azure.keyvault.Secret` resource.
     * 
     */
    public String secretUrl() {
        return this.secretUrl;
    }
    /**
     * @return The ID of the source Key Vault.
     * 
     */
    public String sourceVaultId() {
        return this.sourceVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDiskEncryptionSettingsDiskEncryptionKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretUrl;
        private String sourceVaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDiskEncryptionSettingsDiskEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretUrl = defaults.secretUrl;
    	      this.sourceVaultId = defaults.sourceVaultId;
        }

        public Builder secretUrl(String secretUrl) {
            this.secretUrl = Objects.requireNonNull(secretUrl);
            return this;
        }
        public Builder sourceVaultId(String sourceVaultId) {
            this.sourceVaultId = Objects.requireNonNull(sourceVaultId);
            return this;
        }        public ManagedDiskEncryptionSettingsDiskEncryptionKey build() {
            return new ManagedDiskEncryptionSettingsDiskEncryptionKey(secretUrl, sourceVaultId);
        }
    }
}
