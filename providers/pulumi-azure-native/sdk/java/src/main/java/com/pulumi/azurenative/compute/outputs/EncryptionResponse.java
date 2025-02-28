// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionResponse {
    /**
     * @return ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    private final @Nullable String diskEncryptionSetId;
    /**
     * @return The type of key used to encrypt the data of the disk.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private EncryptionResponse(
        @CustomType.Parameter("diskEncryptionSetId") @Nullable String diskEncryptionSetId,
        @CustomType.Parameter("type") @Nullable String type) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.type = type;
    }

    /**
     * @return ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    public Optional<String> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }
    /**
     * @return The type of key used to encrypt the data of the disk.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskEncryptionSetId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.type = defaults.type;
        }

        public Builder diskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public EncryptionResponse build() {
            return new EncryptionResponse(diskEncryptionSetId, type);
        }
    }
}
