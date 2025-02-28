// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs Empty = new LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs();

    /**
     * How many snapshots to keep. Must be an integer between `1` and `1000`.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return How many snapshots to keep. Must be an integer between `1` and `1000`.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    @Import(name="intervalUnit")
    private @Nullable Output<String> intervalUnit;

    /**
     * @return The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    public Optional<Output<String>> intervalUnit() {
        return Optional.ofNullable(this.intervalUnit);
    }

    private LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs() {}

    private LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs(LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs $) {
        this.count = $.count;
        this.interval = $.interval;
        this.intervalUnit = $.intervalUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs $;

        public Builder() {
            $ = new LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs();
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs defaults) {
            $ = new LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count How many snapshots to keep. Must be an integer between `1` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count How many snapshots to keep. Must be an integer between `1` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param interval The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param intervalUnit The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
         * 
         * @return builder
         * 
         */
        public Builder intervalUnit(@Nullable Output<String> intervalUnit) {
            $.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * @param intervalUnit The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
         * 
         * @return builder
         * 
         */
        public Builder intervalUnit(String intervalUnit) {
            return intervalUnit(Output.of(intervalUnit));
        }

        public LifecyclePolicyPolicyDetailsScheduleDeprecateRuleArgs build() {
            return $;
        }
    }

}
