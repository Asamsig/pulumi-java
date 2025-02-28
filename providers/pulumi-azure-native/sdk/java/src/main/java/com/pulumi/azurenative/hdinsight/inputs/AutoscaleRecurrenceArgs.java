// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.inputs.AutoscaleScheduleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Schedule-based autoscale request parameters
 * 
 */
public final class AutoscaleRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscaleRecurrenceArgs Empty = new AutoscaleRecurrenceArgs();

    /**
     * Array of schedule-based autoscale rules
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<List<AutoscaleScheduleArgs>> schedule;

    /**
     * @return Array of schedule-based autoscale rules
     * 
     */
    public Optional<Output<List<AutoscaleScheduleArgs>>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The time zone for the autoscale schedule times
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The time zone for the autoscale schedule times
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private AutoscaleRecurrenceArgs() {}

    private AutoscaleRecurrenceArgs(AutoscaleRecurrenceArgs $) {
        this.schedule = $.schedule;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscaleRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscaleRecurrenceArgs $;

        public Builder() {
            $ = new AutoscaleRecurrenceArgs();
        }

        public Builder(AutoscaleRecurrenceArgs defaults) {
            $ = new AutoscaleRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param schedule Array of schedule-based autoscale rules
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<List<AutoscaleScheduleArgs>> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Array of schedule-based autoscale rules
         * 
         * @return builder
         * 
         */
        public Builder schedule(List<AutoscaleScheduleArgs> schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param schedule Array of schedule-based autoscale rules
         * 
         * @return builder
         * 
         */
        public Builder schedule(AutoscaleScheduleArgs... schedule) {
            return schedule(List.of(schedule));
        }

        /**
         * @param timeZone The time zone for the autoscale schedule times
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The time zone for the autoscale schedule times
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public AutoscaleRecurrenceArgs build() {
            return $;
        }
    }

}
