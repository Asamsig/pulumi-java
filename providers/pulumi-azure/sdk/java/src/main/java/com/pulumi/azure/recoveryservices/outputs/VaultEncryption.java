// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VaultEncryption {
    /**
     * @return Enabling/Disabling the Double Encryption state.
     * 
     */
    private final Boolean infrastructureEncryptionEnabled;
    /**
     * @return The Key Vault key id used to encrypt this vault. Key managed by Vault Managed Hardware Security Module is also supported.
     * 
     */
    private final String keyId;
    /**
     * @return Indicate that system assigned identity should be used or not. At this time the only possible value is `true`. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean useSystemAssignedIdentity;

    @CustomType.Constructor
    private VaultEncryption(
        @CustomType.Parameter("infrastructureEncryptionEnabled") Boolean infrastructureEncryptionEnabled,
        @CustomType.Parameter("keyId") String keyId,
        @CustomType.Parameter("useSystemAssignedIdentity") @Nullable Boolean useSystemAssignedIdentity) {
        this.infrastructureEncryptionEnabled = infrastructureEncryptionEnabled;
        this.keyId = keyId;
        this.useSystemAssignedIdentity = useSystemAssignedIdentity;
    }

    /**
     * @return Enabling/Disabling the Double Encryption state.
     * 
     */
    public Boolean infrastructureEncryptionEnabled() {
        return this.infrastructureEncryptionEnabled;
    }
    /**
     * @return The Key Vault key id used to encrypt this vault. Key managed by Vault Managed Hardware Security Module is also supported.
     * 
     */
    public String keyId() {
        return this.keyId;
    }
    /**
     * @return Indicate that system assigned identity should be used or not. At this time the only possible value is `true`. Defaults to `true`.
     * 
     */
    public Optional<Boolean> useSystemAssignedIdentity() {
        return Optional.ofNullable(this.useSystemAssignedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean infrastructureEncryptionEnabled;
        private String keyId;
        private @Nullable Boolean useSystemAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infrastructureEncryptionEnabled = defaults.infrastructureEncryptionEnabled;
    	      this.keyId = defaults.keyId;
    	      this.useSystemAssignedIdentity = defaults.useSystemAssignedIdentity;
        }

        public Builder infrastructureEncryptionEnabled(Boolean infrastructureEncryptionEnabled) {
            this.infrastructureEncryptionEnabled = Objects.requireNonNull(infrastructureEncryptionEnabled);
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder useSystemAssignedIdentity(@Nullable Boolean useSystemAssignedIdentity) {
            this.useSystemAssignedIdentity = useSystemAssignedIdentity;
            return this;
        }        public VaultEncryption build() {
            return new VaultEncryption(infrastructureEncryptionEnabled, keyId, useSystemAssignedIdentity);
        }
    }
}
