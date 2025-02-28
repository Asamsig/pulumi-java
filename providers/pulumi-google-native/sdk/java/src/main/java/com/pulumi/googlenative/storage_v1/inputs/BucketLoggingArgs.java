// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The bucket&#39;s logging configuration, which defines the destination bucket and optional name prefix for the current bucket&#39;s logs.
 * 
 */
public final class BucketLoggingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLoggingArgs Empty = new BucketLoggingArgs();

    /**
     * The destination bucket where the current bucket&#39;s logs should be placed.
     * 
     */
    @Import(name="logBucket")
    private @Nullable Output<String> logBucket;

    /**
     * @return The destination bucket where the current bucket&#39;s logs should be placed.
     * 
     */
    public Optional<Output<String>> logBucket() {
        return Optional.ofNullable(this.logBucket);
    }

    /**
     * A prefix for log object names.
     * 
     */
    @Import(name="logObjectPrefix")
    private @Nullable Output<String> logObjectPrefix;

    /**
     * @return A prefix for log object names.
     * 
     */
    public Optional<Output<String>> logObjectPrefix() {
        return Optional.ofNullable(this.logObjectPrefix);
    }

    private BucketLoggingArgs() {}

    private BucketLoggingArgs(BucketLoggingArgs $) {
        this.logBucket = $.logBucket;
        this.logObjectPrefix = $.logObjectPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLoggingArgs $;

        public Builder() {
            $ = new BucketLoggingArgs();
        }

        public Builder(BucketLoggingArgs defaults) {
            $ = new BucketLoggingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logBucket The destination bucket where the current bucket&#39;s logs should be placed.
         * 
         * @return builder
         * 
         */
        public Builder logBucket(@Nullable Output<String> logBucket) {
            $.logBucket = logBucket;
            return this;
        }

        /**
         * @param logBucket The destination bucket where the current bucket&#39;s logs should be placed.
         * 
         * @return builder
         * 
         */
        public Builder logBucket(String logBucket) {
            return logBucket(Output.of(logBucket));
        }

        /**
         * @param logObjectPrefix A prefix for log object names.
         * 
         * @return builder
         * 
         */
        public Builder logObjectPrefix(@Nullable Output<String> logObjectPrefix) {
            $.logObjectPrefix = logObjectPrefix;
            return this;
        }

        /**
         * @param logObjectPrefix A prefix for log object names.
         * 
         * @return builder
         * 
         */
        public Builder logObjectPrefix(String logObjectPrefix) {
            return logObjectPrefix(Output.of(logObjectPrefix));
        }

        public BucketLoggingArgs build() {
            return $;
        }
    }

}
