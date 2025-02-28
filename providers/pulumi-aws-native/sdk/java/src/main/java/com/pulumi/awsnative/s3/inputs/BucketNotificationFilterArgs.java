// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketS3KeyFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Specifies object key name filtering rules.
 * 
 */
public final class BucketNotificationFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketNotificationFilterArgs Empty = new BucketNotificationFilterArgs();

    @Import(name="s3Key", required=true)
    private Output<BucketS3KeyFilterArgs> s3Key;

    public Output<BucketS3KeyFilterArgs> s3Key() {
        return this.s3Key;
    }

    private BucketNotificationFilterArgs() {}

    private BucketNotificationFilterArgs(BucketNotificationFilterArgs $) {
        this.s3Key = $.s3Key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketNotificationFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketNotificationFilterArgs $;

        public Builder() {
            $ = new BucketNotificationFilterArgs();
        }

        public Builder(BucketNotificationFilterArgs defaults) {
            $ = new BucketNotificationFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder s3Key(Output<BucketS3KeyFilterArgs> s3Key) {
            $.s3Key = s3Key;
            return this;
        }

        public Builder s3Key(BucketS3KeyFilterArgs s3Key) {
            return s3Key(Output.of(s3Key));
        }

        public BucketNotificationFilterArgs build() {
            $.s3Key = Objects.requireNonNull($.s3Key, "expected parameter 's3Key' to be non-null");
            return $;
        }
    }

}
