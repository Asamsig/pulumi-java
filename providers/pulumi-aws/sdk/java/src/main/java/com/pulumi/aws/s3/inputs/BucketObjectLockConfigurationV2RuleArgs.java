// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleDefaultRetentionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class BucketObjectLockConfigurationV2RuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketObjectLockConfigurationV2RuleArgs Empty = new BucketObjectLockConfigurationV2RuleArgs();

    /**
     * A configuration block for specifying the default Object Lock retention settings for new objects placed in the specified bucket detailed below.
     * 
     */
    @Import(name="defaultRetention", required=true)
    private Output<BucketObjectLockConfigurationV2RuleDefaultRetentionArgs> defaultRetention;

    /**
     * @return A configuration block for specifying the default Object Lock retention settings for new objects placed in the specified bucket detailed below.
     * 
     */
    public Output<BucketObjectLockConfigurationV2RuleDefaultRetentionArgs> defaultRetention() {
        return this.defaultRetention;
    }

    private BucketObjectLockConfigurationV2RuleArgs() {}

    private BucketObjectLockConfigurationV2RuleArgs(BucketObjectLockConfigurationV2RuleArgs $) {
        this.defaultRetention = $.defaultRetention;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketObjectLockConfigurationV2RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketObjectLockConfigurationV2RuleArgs $;

        public Builder() {
            $ = new BucketObjectLockConfigurationV2RuleArgs();
        }

        public Builder(BucketObjectLockConfigurationV2RuleArgs defaults) {
            $ = new BucketObjectLockConfigurationV2RuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRetention A configuration block for specifying the default Object Lock retention settings for new objects placed in the specified bucket detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultRetention(Output<BucketObjectLockConfigurationV2RuleDefaultRetentionArgs> defaultRetention) {
            $.defaultRetention = defaultRetention;
            return this;
        }

        /**
         * @param defaultRetention A configuration block for specifying the default Object Lock retention settings for new objects placed in the specified bucket detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultRetention(BucketObjectLockConfigurationV2RuleDefaultRetentionArgs defaultRetention) {
            return defaultRetention(Output.of(defaultRetention));
        }

        public BucketObjectLockConfigurationV2RuleArgs build() {
            $.defaultRetention = Objects.requireNonNull($.defaultRetention, "expected parameter 'defaultRetention' to be non-null");
            return $;
        }
    }

}
