// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream.outputs;

import com.pulumi.awsnative.timestream.enums.ScheduledQueryEncryptionOption;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduledQueryS3Configuration {
    private final String bucketName;
    private final @Nullable ScheduledQueryEncryptionOption encryptionOption;
    private final @Nullable String objectKeyPrefix;

    @CustomType.Constructor
    private ScheduledQueryS3Configuration(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("encryptionOption") @Nullable ScheduledQueryEncryptionOption encryptionOption,
        @CustomType.Parameter("objectKeyPrefix") @Nullable String objectKeyPrefix) {
        this.bucketName = bucketName;
        this.encryptionOption = encryptionOption;
        this.objectKeyPrefix = objectKeyPrefix;
    }

    public String bucketName() {
        return this.bucketName;
    }
    public Optional<ScheduledQueryEncryptionOption> encryptionOption() {
        return Optional.ofNullable(this.encryptionOption);
    }
    public Optional<String> objectKeyPrefix() {
        return Optional.ofNullable(this.objectKeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryS3Configuration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable ScheduledQueryEncryptionOption encryptionOption;
        private @Nullable String objectKeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryS3Configuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.encryptionOption = defaults.encryptionOption;
    	      this.objectKeyPrefix = defaults.objectKeyPrefix;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder encryptionOption(@Nullable ScheduledQueryEncryptionOption encryptionOption) {
            this.encryptionOption = encryptionOption;
            return this;
        }
        public Builder objectKeyPrefix(@Nullable String objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }        public ScheduledQueryS3Configuration build() {
            return new ScheduledQueryS3Configuration(bucketName, encryptionOption, objectKeyPrefix);
        }
    }
}
