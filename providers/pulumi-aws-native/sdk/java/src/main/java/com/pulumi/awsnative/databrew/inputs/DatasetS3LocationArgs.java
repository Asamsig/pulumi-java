// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input location
 * 
 */
public final class DatasetS3LocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetS3LocationArgs Empty = new DatasetS3LocationArgs();

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    private DatasetS3LocationArgs() {}

    private DatasetS3LocationArgs(DatasetS3LocationArgs $) {
        this.bucket = $.bucket;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetS3LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetS3LocationArgs $;

        public Builder() {
            $ = new DatasetS3LocationArgs();
        }

        public Builder(DatasetS3LocationArgs defaults) {
            $ = new DatasetS3LocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public DatasetS3LocationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
