// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream.outputs;

import com.pulumi.awsnative.timestream.outputs.MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties {
    /**
     * @return S3 configuration for location to store rejections from magnetic store writes
     * 
     */
    private final @Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties s3Configuration;

    @CustomType.Constructor
    private MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties(@CustomType.Parameter("s3Configuration") @Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * @return S3 configuration for location to store rejections from magnetic store writes
     * 
     */
    public Optional<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties> s3Configuration() {
        return Optional.ofNullable(this.s3Configuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties s3Configuration;

        public Builder() {
    	      // Empty
        }

        public Builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Configuration = defaults.s3Configuration;
        }

        public Builder s3Configuration(@Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationProperties s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }        public MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties build() {
            return new MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties(s3Configuration);
        }
    }
}
