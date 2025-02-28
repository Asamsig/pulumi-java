// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maintenance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationWindowArgs Empty = new ConfigurationWindowArgs();

    /**
     * The duration of the maintenance window in HH:mm format.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return The duration of the maintenance window in HH:mm format.
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm format.
     * 
     */
    @Import(name="expirationDateTime")
    private @Nullable Output<String> expirationDateTime;

    /**
     * @return Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm format.
     * 
     */
    public Optional<Output<String>> expirationDateTime() {
        return Optional.ofNullable(this.expirationDateTime);
    }

    /**
     * The rate at which a maintenance window is expected to recur. The rate can be expressed as daily, weekly, or monthly schedules.
     * 
     */
    @Import(name="recurEvery")
    private @Nullable Output<String> recurEvery;

    /**
     * @return The rate at which a maintenance window is expected to recur. The rate can be expressed as daily, weekly, or monthly schedules.
     * 
     */
    public Optional<Output<String>> recurEvery() {
        return Optional.ofNullable(this.recurEvery);
    }

    /**
     * Effective start date of the maintenance window in YYYY-MM-DD hh:mm format.
     * 
     */
    @Import(name="startDateTime", required=true)
    private Output<String> startDateTime;

    /**
     * @return Effective start date of the maintenance window in YYYY-MM-DD hh:mm format.
     * 
     */
    public Output<String> startDateTime() {
        return this.startDateTime;
    }

    /**
     * The time zone for the maintenance window. A list of timezones can be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
     * 
     */
    @Import(name="timeZone", required=true)
    private Output<String> timeZone;

    /**
     * @return The time zone for the maintenance window. A list of timezones can be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    private ConfigurationWindowArgs() {}

    private ConfigurationWindowArgs(ConfigurationWindowArgs $) {
        this.duration = $.duration;
        this.expirationDateTime = $.expirationDateTime;
        this.recurEvery = $.recurEvery;
        this.startDateTime = $.startDateTime;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationWindowArgs $;

        public Builder() {
            $ = new ConfigurationWindowArgs();
        }

        public Builder(ConfigurationWindowArgs defaults) {
            $ = new ConfigurationWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration The duration of the maintenance window in HH:mm format.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The duration of the maintenance window in HH:mm format.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param expirationDateTime Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm format.
         * 
         * @return builder
         * 
         */
        public Builder expirationDateTime(@Nullable Output<String> expirationDateTime) {
            $.expirationDateTime = expirationDateTime;
            return this;
        }

        /**
         * @param expirationDateTime Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm format.
         * 
         * @return builder
         * 
         */
        public Builder expirationDateTime(String expirationDateTime) {
            return expirationDateTime(Output.of(expirationDateTime));
        }

        /**
         * @param recurEvery The rate at which a maintenance window is expected to recur. The rate can be expressed as daily, weekly, or monthly schedules.
         * 
         * @return builder
         * 
         */
        public Builder recurEvery(@Nullable Output<String> recurEvery) {
            $.recurEvery = recurEvery;
            return this;
        }

        /**
         * @param recurEvery The rate at which a maintenance window is expected to recur. The rate can be expressed as daily, weekly, or monthly schedules.
         * 
         * @return builder
         * 
         */
        public Builder recurEvery(String recurEvery) {
            return recurEvery(Output.of(recurEvery));
        }

        /**
         * @param startDateTime Effective start date of the maintenance window in YYYY-MM-DD hh:mm format.
         * 
         * @return builder
         * 
         */
        public Builder startDateTime(Output<String> startDateTime) {
            $.startDateTime = startDateTime;
            return this;
        }

        /**
         * @param startDateTime Effective start date of the maintenance window in YYYY-MM-DD hh:mm format.
         * 
         * @return builder
         * 
         */
        public Builder startDateTime(String startDateTime) {
            return startDateTime(Output.of(startDateTime));
        }

        /**
         * @param timeZone The time zone for the maintenance window. A list of timezones can be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The time zone for the maintenance window. A list of timezones can be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public ConfigurationWindowArgs build() {
            $.startDateTime = Objects.requireNonNull($.startDateTime, "expected parameter 'startDateTime' to be non-null");
            $.timeZone = Objects.requireNonNull($.timeZone, "expected parameter 'timeZone' to be non-null");
            return $;
        }
    }

}
