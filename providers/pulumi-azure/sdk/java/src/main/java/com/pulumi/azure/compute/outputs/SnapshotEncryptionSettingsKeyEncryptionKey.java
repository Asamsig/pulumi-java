// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SnapshotEncryptionSettingsKeyEncryptionKey {
    private final String keyUrl;
    private final String sourceVaultId;

    @CustomType.Constructor
    private SnapshotEncryptionSettingsKeyEncryptionKey(
        @CustomType.Parameter("keyUrl") String keyUrl,
        @CustomType.Parameter("sourceVaultId") String sourceVaultId) {
        this.keyUrl = keyUrl;
        this.sourceVaultId = sourceVaultId;
    }

    public String keyUrl() {
        return this.keyUrl;
    }
    public String sourceVaultId() {
        return this.sourceVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotEncryptionSettingsKeyEncryptionKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyUrl;
        private String sourceVaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotEncryptionSettingsKeyEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVaultId = defaults.sourceVaultId;
        }

        public Builder keyUrl(String keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }
        public Builder sourceVaultId(String sourceVaultId) {
            this.sourceVaultId = Objects.requireNonNull(sourceVaultId);
            return this;
        }        public SnapshotEncryptionSettingsKeyEncryptionKey build() {
            return new SnapshotEncryptionSettingsKeyEncryptionKey(keyUrl, sourceVaultId);
        }
    }
}
