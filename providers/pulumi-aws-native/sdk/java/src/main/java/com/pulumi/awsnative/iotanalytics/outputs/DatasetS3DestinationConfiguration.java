// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.outputs;

import com.pulumi.awsnative.iotanalytics.outputs.DatasetGlueConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetS3DestinationConfiguration {
    private final String bucket;
    private final @Nullable DatasetGlueConfiguration glueConfiguration;
    private final String key;
    private final String roleArn;

    @CustomType.Constructor
    private DatasetS3DestinationConfiguration(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("glueConfiguration") @Nullable DatasetGlueConfiguration glueConfiguration,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.bucket = bucket;
        this.glueConfiguration = glueConfiguration;
        this.key = key;
        this.roleArn = roleArn;
    }

    public String bucket() {
        return this.bucket;
    }
    public Optional<DatasetGlueConfiguration> glueConfiguration() {
        return Optional.ofNullable(this.glueConfiguration);
    }
    public String key() {
        return this.key;
    }
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetS3DestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable DatasetGlueConfiguration glueConfiguration;
        private String key;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetS3DestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.glueConfiguration = defaults.glueConfiguration;
    	      this.key = defaults.key;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder glueConfiguration(@Nullable DatasetGlueConfiguration glueConfiguration) {
            this.glueConfiguration = glueConfiguration;
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public DatasetS3DestinationConfiguration build() {
            return new DatasetS3DestinationConfiguration(bucket, glueConfiguration, key, roleArn);
        }
    }
}
