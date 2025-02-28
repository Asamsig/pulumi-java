// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies the retention policy for the log.
 * 
 */
public final class RetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RetentionPolicyArgs Empty = new RetentionPolicyArgs();

    /**
     * The number of days for the retention in days. A value of 0 will retain the events indefinitely.
     * 
     */
    @Import(name="days", required=true)
    private Output<Integer> days;

    /**
     * @return The number of days for the retention in days. A value of 0 will retain the events indefinitely.
     * 
     */
    public Output<Integer> days() {
        return this.days;
    }

    /**
     * A value indicating whether the retention policy is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return A value indicating whether the retention policy is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private RetentionPolicyArgs() {}

    private RetentionPolicyArgs(RetentionPolicyArgs $) {
        this.days = $.days;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetentionPolicyArgs $;

        public Builder() {
            $ = new RetentionPolicyArgs();
        }

        public Builder(RetentionPolicyArgs defaults) {
            $ = new RetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days The number of days for the retention in days. A value of 0 will retain the events indefinitely.
         * 
         * @return builder
         * 
         */
        public Builder days(Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days The number of days for the retention in days. A value of 0 will retain the events indefinitely.
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        /**
         * @param enabled A value indicating whether the retention policy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled A value indicating whether the retention policy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public RetentionPolicyArgs build() {
            $.days = Objects.requireNonNull($.days, "expected parameter 'days' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
