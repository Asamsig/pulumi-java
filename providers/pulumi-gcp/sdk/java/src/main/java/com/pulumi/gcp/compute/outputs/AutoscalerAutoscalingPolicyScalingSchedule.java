// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscalerAutoscalingPolicyScalingSchedule {
    /**
     * @return An optional description of this resource.
     * 
     */
    private final @Nullable String description;
    /**
     * @return A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
     * 
     */
    private final @Nullable Boolean disabled;
    /**
     * @return The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
     * 
     */
    private final Integer durationSec;
    /**
     * @return Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
     * 
     */
    private final Integer minRequiredReplicas;
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    private final String name;
    /**
     * @return The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
     * 
     */
    private final String schedule;
    /**
     * @return The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    private final @Nullable String timeZone;

    @CustomType.Constructor
    private AutoscalerAutoscalingPolicyScalingSchedule(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("disabled") @Nullable Boolean disabled,
        @CustomType.Parameter("durationSec") Integer durationSec,
        @CustomType.Parameter("minRequiredReplicas") Integer minRequiredReplicas,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedule") String schedule,
        @CustomType.Parameter("timeZone") @Nullable String timeZone) {
        this.description = description;
        this.disabled = disabled;
        this.durationSec = durationSec;
        this.minRequiredReplicas = minRequiredReplicas;
        this.name = name;
        this.schedule = schedule;
        this.timeZone = timeZone;
    }

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
     * 
     */
    public Integer durationSec() {
        return this.durationSec;
    }
    /**
     * @return Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
     * 
     */
    public Integer minRequiredReplicas() {
        return this.minRequiredReplicas;
    }
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
     * 
     */
    public String schedule() {
        return this.schedule;
    }
    /**
     * @return The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyScalingSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean disabled;
        private Integer durationSec;
        private Integer minRequiredReplicas;
        private String name;
        private String schedule;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyScalingSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.durationSec = defaults.durationSec;
    	      this.minRequiredReplicas = defaults.minRequiredReplicas;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder durationSec(Integer durationSec) {
            this.durationSec = Objects.requireNonNull(durationSec);
            return this;
        }
        public Builder minRequiredReplicas(Integer minRequiredReplicas) {
            this.minRequiredReplicas = Objects.requireNonNull(minRequiredReplicas);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }        public AutoscalerAutoscalingPolicyScalingSchedule build() {
            return new AutoscalerAutoscalingPolicyScalingSchedule(description, disabled, durationSec, minRequiredReplicas, name, schedule, timeZone);
        }
    }
}
