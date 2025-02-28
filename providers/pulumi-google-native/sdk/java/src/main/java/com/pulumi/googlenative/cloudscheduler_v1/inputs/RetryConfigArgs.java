// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings that determine the retry behavior. By default, if a job does not complete successfully (meaning that an acknowledgement is not received from the handler, then it will be retried with exponential backoff according to the settings in RetryConfig.
 * 
 */
public final class RetryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RetryConfigArgs Empty = new RetryConfigArgs();

    /**
     * The maximum amount of time to wait before retrying a job after it fails. The default value of this field is 1 hour.
     * 
     */
    @Import(name="maxBackoffDuration")
    private @Nullable Output<String> maxBackoffDuration;

    /**
     * @return The maximum amount of time to wait before retrying a job after it fails. The default value of this field is 1 hour.
     * 
     */
    public Optional<Output<String>> maxBackoffDuration() {
        return Optional.ofNullable(this.maxBackoffDuration);
    }

    /**
     * The time between retries will double `max_doublings` times. A job&#39;s retry interval starts at min_backoff_duration, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff_duration up to retry_count times. For example, if min_backoff_duration is 10s, max_backoff_duration is 300s, and `max_doublings` is 3, then the a job will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the job will retry at intervals of max_backoff_duration until the job has been attempted retry_count times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... The default value of this field is 5.
     * 
     */
    @Import(name="maxDoublings")
    private @Nullable Output<Integer> maxDoublings;

    /**
     * @return The time between retries will double `max_doublings` times. A job&#39;s retry interval starts at min_backoff_duration, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff_duration up to retry_count times. For example, if min_backoff_duration is 10s, max_backoff_duration is 300s, and `max_doublings` is 3, then the a job will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the job will retry at intervals of max_backoff_duration until the job has been attempted retry_count times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... The default value of this field is 5.
     * 
     */
    public Optional<Output<Integer>> maxDoublings() {
        return Optional.ofNullable(this.maxDoublings);
    }

    /**
     * The time limit for retrying a failed job, measured from time when an execution was first attempted. If specified with retry_count, the job will be retried until both limits are reached. The default value for max_retry_duration is zero, which means retry duration is unlimited.
     * 
     */
    @Import(name="maxRetryDuration")
    private @Nullable Output<String> maxRetryDuration;

    /**
     * @return The time limit for retrying a failed job, measured from time when an execution was first attempted. If specified with retry_count, the job will be retried until both limits are reached. The default value for max_retry_duration is zero, which means retry duration is unlimited.
     * 
     */
    public Optional<Output<String>> maxRetryDuration() {
        return Optional.ofNullable(this.maxRetryDuration);
    }

    /**
     * The minimum amount of time to wait before retrying a job after it fails. The default value of this field is 5 seconds.
     * 
     */
    @Import(name="minBackoffDuration")
    private @Nullable Output<String> minBackoffDuration;

    /**
     * @return The minimum amount of time to wait before retrying a job after it fails. The default value of this field is 5 seconds.
     * 
     */
    public Optional<Output<String>> minBackoffDuration() {
        return Optional.ofNullable(this.minBackoffDuration);
    }

    /**
     * The number of attempts that the system will make to run a job using the exponential backoff procedure described by max_doublings. The default value of retry_count is zero. If retry_count is zero, a job attempt will *not* be retried if it fails. Instead the Cloud Scheduler system will wait for the next scheduled execution time. If retry_count is set to a non-zero number then Cloud Scheduler will retry failed attempts, using exponential backoff, retry_count times, or until the next scheduled execution time, whichever comes first. Values greater than 5 and negative values are not allowed.
     * 
     */
    @Import(name="retryCount")
    private @Nullable Output<Integer> retryCount;

    /**
     * @return The number of attempts that the system will make to run a job using the exponential backoff procedure described by max_doublings. The default value of retry_count is zero. If retry_count is zero, a job attempt will *not* be retried if it fails. Instead the Cloud Scheduler system will wait for the next scheduled execution time. If retry_count is set to a non-zero number then Cloud Scheduler will retry failed attempts, using exponential backoff, retry_count times, or until the next scheduled execution time, whichever comes first. Values greater than 5 and negative values are not allowed.
     * 
     */
    public Optional<Output<Integer>> retryCount() {
        return Optional.ofNullable(this.retryCount);
    }

    private RetryConfigArgs() {}

    private RetryConfigArgs(RetryConfigArgs $) {
        this.maxBackoffDuration = $.maxBackoffDuration;
        this.maxDoublings = $.maxDoublings;
        this.maxRetryDuration = $.maxRetryDuration;
        this.minBackoffDuration = $.minBackoffDuration;
        this.retryCount = $.retryCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RetryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetryConfigArgs $;

        public Builder() {
            $ = new RetryConfigArgs();
        }

        public Builder(RetryConfigArgs defaults) {
            $ = new RetryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxBackoffDuration The maximum amount of time to wait before retrying a job after it fails. The default value of this field is 1 hour.
         * 
         * @return builder
         * 
         */
        public Builder maxBackoffDuration(@Nullable Output<String> maxBackoffDuration) {
            $.maxBackoffDuration = maxBackoffDuration;
            return this;
        }

        /**
         * @param maxBackoffDuration The maximum amount of time to wait before retrying a job after it fails. The default value of this field is 1 hour.
         * 
         * @return builder
         * 
         */
        public Builder maxBackoffDuration(String maxBackoffDuration) {
            return maxBackoffDuration(Output.of(maxBackoffDuration));
        }

        /**
         * @param maxDoublings The time between retries will double `max_doublings` times. A job&#39;s retry interval starts at min_backoff_duration, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff_duration up to retry_count times. For example, if min_backoff_duration is 10s, max_backoff_duration is 300s, and `max_doublings` is 3, then the a job will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the job will retry at intervals of max_backoff_duration until the job has been attempted retry_count times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... The default value of this field is 5.
         * 
         * @return builder
         * 
         */
        public Builder maxDoublings(@Nullable Output<Integer> maxDoublings) {
            $.maxDoublings = maxDoublings;
            return this;
        }

        /**
         * @param maxDoublings The time between retries will double `max_doublings` times. A job&#39;s retry interval starts at min_backoff_duration, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff_duration up to retry_count times. For example, if min_backoff_duration is 10s, max_backoff_duration is 300s, and `max_doublings` is 3, then the a job will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the job will retry at intervals of max_backoff_duration until the job has been attempted retry_count times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... The default value of this field is 5.
         * 
         * @return builder
         * 
         */
        public Builder maxDoublings(Integer maxDoublings) {
            return maxDoublings(Output.of(maxDoublings));
        }

        /**
         * @param maxRetryDuration The time limit for retrying a failed job, measured from time when an execution was first attempted. If specified with retry_count, the job will be retried until both limits are reached. The default value for max_retry_duration is zero, which means retry duration is unlimited.
         * 
         * @return builder
         * 
         */
        public Builder maxRetryDuration(@Nullable Output<String> maxRetryDuration) {
            $.maxRetryDuration = maxRetryDuration;
            return this;
        }

        /**
         * @param maxRetryDuration The time limit for retrying a failed job, measured from time when an execution was first attempted. If specified with retry_count, the job will be retried until both limits are reached. The default value for max_retry_duration is zero, which means retry duration is unlimited.
         * 
         * @return builder
         * 
         */
        public Builder maxRetryDuration(String maxRetryDuration) {
            return maxRetryDuration(Output.of(maxRetryDuration));
        }

        /**
         * @param minBackoffDuration The minimum amount of time to wait before retrying a job after it fails. The default value of this field is 5 seconds.
         * 
         * @return builder
         * 
         */
        public Builder minBackoffDuration(@Nullable Output<String> minBackoffDuration) {
            $.minBackoffDuration = minBackoffDuration;
            return this;
        }

        /**
         * @param minBackoffDuration The minimum amount of time to wait before retrying a job after it fails. The default value of this field is 5 seconds.
         * 
         * @return builder
         * 
         */
        public Builder minBackoffDuration(String minBackoffDuration) {
            return minBackoffDuration(Output.of(minBackoffDuration));
        }

        /**
         * @param retryCount The number of attempts that the system will make to run a job using the exponential backoff procedure described by max_doublings. The default value of retry_count is zero. If retry_count is zero, a job attempt will *not* be retried if it fails. Instead the Cloud Scheduler system will wait for the next scheduled execution time. If retry_count is set to a non-zero number then Cloud Scheduler will retry failed attempts, using exponential backoff, retry_count times, or until the next scheduled execution time, whichever comes first. Values greater than 5 and negative values are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder retryCount(@Nullable Output<Integer> retryCount) {
            $.retryCount = retryCount;
            return this;
        }

        /**
         * @param retryCount The number of attempts that the system will make to run a job using the exponential backoff procedure described by max_doublings. The default value of retry_count is zero. If retry_count is zero, a job attempt will *not* be retried if it fails. Instead the Cloud Scheduler system will wait for the next scheduled execution time. If retry_count is set to a non-zero number then Cloud Scheduler will retry failed attempts, using exponential backoff, retry_count times, or until the next scheduled execution time, whichever comes first. Values greater than 5 and negative values are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder retryCount(Integer retryCount) {
            return retryCount(Output.of(retryCount));
        }

        public RetryConfigArgs build() {
            return $;
        }
    }

}
