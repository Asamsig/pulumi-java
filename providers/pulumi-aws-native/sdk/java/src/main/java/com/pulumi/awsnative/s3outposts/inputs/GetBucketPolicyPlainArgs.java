// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3outposts.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBucketPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketPolicyPlainArgs Empty = new GetBucketPolicyPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    @Import(name="bucket", required=true)
    private String bucket;

    /**
     * @return The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    public String bucket() {
        return this.bucket;
    }

    private GetBucketPolicyPlainArgs() {}

    private GetBucketPolicyPlainArgs(GetBucketPolicyPlainArgs $) {
        this.bucket = $.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBucketPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBucketPolicyPlainArgs $;

        public Builder() {
            $ = new GetBucketPolicyPlainArgs();
        }

        public Builder(GetBucketPolicyPlainArgs defaults) {
            $ = new GetBucketPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The Amazon Resource Name (ARN) of the specified bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        public GetBucketPolicyPlainArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
