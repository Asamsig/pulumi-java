// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.desktopvirtualization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScalingPlanScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScheduleArgs Empty = new ScalingPlanScheduleArgs();

    /**
     * A list of Days of the Week on which this schedule will be used..Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`
     * 
     */
    @Import(name="daysOfWeeks", required=true)
    private Output<List<String>> daysOfWeeks;

    /**
     * @return A list of Days of the Week on which this schedule will be used..Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`
     * 
     */
    public Output<List<String>> daysOfWeeks() {
        return this.daysOfWeeks;
    }

    /**
     * The name of the schedule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the schedule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The load Balancing Algorithm to use during Off-Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    @Import(name="offPeakLoadBalancingAlgorithm", required=true)
    private Output<String> offPeakLoadBalancingAlgorithm;

    /**
     * @return The load Balancing Algorithm to use during Off-Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    public Output<String> offPeakLoadBalancingAlgorithm() {
        return this.offPeakLoadBalancingAlgorithm;
    }

    /**
     * The time at which Off-Peak scaling will begin. This is also the end-time for the Ramp-Down period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    @Import(name="offPeakStartTime", required=true)
    private Output<String> offPeakStartTime;

    /**
     * @return The time at which Off-Peak scaling will begin. This is also the end-time for the Ramp-Down period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    public Output<String> offPeakStartTime() {
        return this.offPeakStartTime;
    }

    /**
     * The load Balancing Algorithm to use during Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    @Import(name="peakLoadBalancingAlgorithm", required=true)
    private Output<String> peakLoadBalancingAlgorithm;

    /**
     * @return The load Balancing Algorithm to use during Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    public Output<String> peakLoadBalancingAlgorithm() {
        return this.peakLoadBalancingAlgorithm;
    }

    /**
     * The time at which Peak scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    @Import(name="peakStartTime", required=true)
    private Output<String> peakStartTime;

    /**
     * @return The time at which Peak scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    public Output<String> peakStartTime() {
        return this.peakStartTime;
    }

    /**
     * This is the value in percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-down and off-peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
     * 
     */
    @Import(name="rampDownCapacityThresholdPercent", required=true)
    private Output<Integer> rampDownCapacityThresholdPercent;

    /**
     * @return This is the value in percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-down and off-peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
     * 
     */
    public Output<Integer> rampDownCapacityThresholdPercent() {
        return this.rampDownCapacityThresholdPercent;
    }

    /**
     * Whether users will be forced to log-off session hosts once the `ramp_down_wait_time_minutes` value has been exceeded during the Ramp-Down period. Possible
     * 
     */
    @Import(name="rampDownForceLogoffUsers", required=true)
    private Output<Boolean> rampDownForceLogoffUsers;

    /**
     * @return Whether users will be forced to log-off session hosts once the `ramp_down_wait_time_minutes` value has been exceeded during the Ramp-Down period. Possible
     * 
     */
    public Output<Boolean> rampDownForceLogoffUsers() {
        return this.rampDownForceLogoffUsers;
    }

    /**
     * The load Balancing Algorithm to use during the Ramp-Down period. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    @Import(name="rampDownLoadBalancingAlgorithm", required=true)
    private Output<String> rampDownLoadBalancingAlgorithm;

    /**
     * @return The load Balancing Algorithm to use during the Ramp-Down period. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    public Output<String> rampDownLoadBalancingAlgorithm() {
        return this.rampDownLoadBalancingAlgorithm;
    }

    /**
     * The minimum percentage of session host virtual machines that you would like to get to for ramp-down and off-peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
     * 
     */
    @Import(name="rampDownMinimumHostsPercent", required=true)
    private Output<Integer> rampDownMinimumHostsPercent;

    /**
     * @return The minimum percentage of session host virtual machines that you would like to get to for ramp-down and off-peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
     * 
     */
    public Output<Integer> rampDownMinimumHostsPercent() {
        return this.rampDownMinimumHostsPercent;
    }

    /**
     * The notification message to send to users during Ramp-Down period when they are required to log-off.
     * 
     */
    @Import(name="rampDownNotificationMessage", required=true)
    private Output<String> rampDownNotificationMessage;

    /**
     * @return The notification message to send to users during Ramp-Down period when they are required to log-off.
     * 
     */
    public Output<String> rampDownNotificationMessage() {
        return this.rampDownNotificationMessage;
    }

    /**
     * The time at which Ramp-Down scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    @Import(name="rampDownStartTime", required=true)
    private Output<String> rampDownStartTime;

    /**
     * @return The time at which Ramp-Down scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    public Output<String> rampDownStartTime() {
        return this.rampDownStartTime;
    }

    /**
     * Controls Session Host shutdown behaviour during Ramp-Down period. Session Hosts can either be shutdown when all sessions on the Session Host have ended, or when there are no Active sessions left on the Session Host. Possible values are `ZeroSessions` and `ZeroActiveSessions`.
     * 
     */
    @Import(name="rampDownStopHostsWhen", required=true)
    private Output<String> rampDownStopHostsWhen;

    /**
     * @return Controls Session Host shutdown behaviour during Ramp-Down period. Session Hosts can either be shutdown when all sessions on the Session Host have ended, or when there are no Active sessions left on the Session Host. Possible values are `ZeroSessions` and `ZeroActiveSessions`.
     * 
     */
    public Output<String> rampDownStopHostsWhen() {
        return this.rampDownStopHostsWhen;
    }

    /**
     * The number of minutes during Ramp-Down period that autoscale will wait after setting the session host VMs to drain mode, notifying any currently signed in users to save their work before forcing the users to logoff. Once all user sessions on the session host VM have been logged off, Autoscale will shut down the VM.
     * 
     */
    @Import(name="rampDownWaitTimeMinutes", required=true)
    private Output<Integer> rampDownWaitTimeMinutes;

    /**
     * @return The number of minutes during Ramp-Down period that autoscale will wait after setting the session host VMs to drain mode, notifying any currently signed in users to save their work before forcing the users to logoff. Once all user sessions on the session host VM have been logged off, Autoscale will shut down the VM.
     * 
     */
    public Output<Integer> rampDownWaitTimeMinutes() {
        return this.rampDownWaitTimeMinutes;
    }

    /**
     * Specify minimum percentage of session host virtual machines to start for ramp-up and peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
     * 
     */
    @Import(name="rampUpCapacityThresholdPercent")
    private @Nullable Output<Integer> rampUpCapacityThresholdPercent;

    /**
     * @return Specify minimum percentage of session host virtual machines to start for ramp-up and peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
     * 
     */
    public Optional<Output<Integer>> rampUpCapacityThresholdPercent() {
        return Optional.ofNullable(this.rampUpCapacityThresholdPercent);
    }

    /**
     * The load Balancing Algorithm to use during the Ramp-Up period. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    @Import(name="rampUpLoadBalancingAlgorithm", required=true)
    private Output<String> rampUpLoadBalancingAlgorithm;

    /**
     * @return The load Balancing Algorithm to use during the Ramp-Up period. Possible values are `DepthFirst` and `BreadthFirst`.
     * 
     */
    public Output<String> rampUpLoadBalancingAlgorithm() {
        return this.rampUpLoadBalancingAlgorithm;
    }

    /**
     * This is the value of percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-up and peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
     * 
     */
    @Import(name="rampUpMinimumHostsPercent")
    private @Nullable Output<Integer> rampUpMinimumHostsPercent;

    /**
     * @return This is the value of percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-up and peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
     * 
     */
    public Optional<Output<Integer>> rampUpMinimumHostsPercent() {
        return Optional.ofNullable(this.rampUpMinimumHostsPercent);
    }

    /**
     * The time at which Ramp-Up scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    @Import(name="rampUpStartTime", required=true)
    private Output<String> rampUpStartTime;

    /**
     * @return The time at which Ramp-Up scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
     * 
     */
    public Output<String> rampUpStartTime() {
        return this.rampUpStartTime;
    }

    private ScalingPlanScheduleArgs() {}

    private ScalingPlanScheduleArgs(ScalingPlanScheduleArgs $) {
        this.daysOfWeeks = $.daysOfWeeks;
        this.name = $.name;
        this.offPeakLoadBalancingAlgorithm = $.offPeakLoadBalancingAlgorithm;
        this.offPeakStartTime = $.offPeakStartTime;
        this.peakLoadBalancingAlgorithm = $.peakLoadBalancingAlgorithm;
        this.peakStartTime = $.peakStartTime;
        this.rampDownCapacityThresholdPercent = $.rampDownCapacityThresholdPercent;
        this.rampDownForceLogoffUsers = $.rampDownForceLogoffUsers;
        this.rampDownLoadBalancingAlgorithm = $.rampDownLoadBalancingAlgorithm;
        this.rampDownMinimumHostsPercent = $.rampDownMinimumHostsPercent;
        this.rampDownNotificationMessage = $.rampDownNotificationMessage;
        this.rampDownStartTime = $.rampDownStartTime;
        this.rampDownStopHostsWhen = $.rampDownStopHostsWhen;
        this.rampDownWaitTimeMinutes = $.rampDownWaitTimeMinutes;
        this.rampUpCapacityThresholdPercent = $.rampUpCapacityThresholdPercent;
        this.rampUpLoadBalancingAlgorithm = $.rampUpLoadBalancingAlgorithm;
        this.rampUpMinimumHostsPercent = $.rampUpMinimumHostsPercent;
        this.rampUpStartTime = $.rampUpStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingPlanScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingPlanScheduleArgs $;

        public Builder() {
            $ = new ScalingPlanScheduleArgs();
        }

        public Builder(ScalingPlanScheduleArgs defaults) {
            $ = new ScalingPlanScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysOfWeeks A list of Days of the Week on which this schedule will be used..Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(Output<List<String>> daysOfWeeks) {
            $.daysOfWeeks = daysOfWeeks;
            return this;
        }

        /**
         * @param daysOfWeeks A list of Days of the Week on which this schedule will be used..Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(List<String> daysOfWeeks) {
            return daysOfWeeks(Output.of(daysOfWeeks));
        }

        /**
         * @param daysOfWeeks A list of Days of the Week on which this schedule will be used..Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(String... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }

        /**
         * @param name The name of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param offPeakLoadBalancingAlgorithm The load Balancing Algorithm to use during Off-Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
         * 
         * @return builder
         * 
         */
        public Builder offPeakLoadBalancingAlgorithm(Output<String> offPeakLoadBalancingAlgorithm) {
            $.offPeakLoadBalancingAlgorithm = offPeakLoadBalancingAlgorithm;
            return this;
        }

        /**
         * @param offPeakLoadBalancingAlgorithm The load Balancing Algorithm to use during Off-Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
         * 
         * @return builder
         * 
         */
        public Builder offPeakLoadBalancingAlgorithm(String offPeakLoadBalancingAlgorithm) {
            return offPeakLoadBalancingAlgorithm(Output.of(offPeakLoadBalancingAlgorithm));
        }

        /**
         * @param offPeakStartTime The time at which Off-Peak scaling will begin. This is also the end-time for the Ramp-Down period. The time must be specified in &#34;HH:MM&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder offPeakStartTime(Output<String> offPeakStartTime) {
            $.offPeakStartTime = offPeakStartTime;
            return this;
        }

        /**
         * @param offPeakStartTime The time at which Off-Peak scaling will begin. This is also the end-time for the Ramp-Down period. The time must be specified in &#34;HH:MM&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder offPeakStartTime(String offPeakStartTime) {
            return offPeakStartTime(Output.of(offPeakStartTime));
        }

        /**
         * @param peakLoadBalancingAlgorithm The load Balancing Algorithm to use during Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
         * 
         * @return builder
         * 
         */
        public Builder peakLoadBalancingAlgorithm(Output<String> peakLoadBalancingAlgorithm) {
            $.peakLoadBalancingAlgorithm = peakLoadBalancingAlgorithm;
            return this;
        }

        /**
         * @param peakLoadBalancingAlgorithm The load Balancing Algorithm to use during Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
         * 
         * @return builder
         * 
         */
        public Builder peakLoadBalancingAlgorithm(String peakLoadBalancingAlgorithm) {
            return peakLoadBalancingAlgorithm(Output.of(peakLoadBalancingAlgorithm));
        }

        /**
         * @param peakStartTime The time at which Peak scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder peakStartTime(Output<String> peakStartTime) {
            $.peakStartTime = peakStartTime;
            return this;
        }

        /**
         * @param peakStartTime The time at which Peak scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder peakStartTime(String peakStartTime) {
            return peakStartTime(Output.of(peakStartTime));
        }

        /**
         * @param rampDownCapacityThresholdPercent This is the value in percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-down and off-peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
         * 
         * @return builder
         * 
         */
        public Builder rampDownCapacityThresholdPercent(Output<Integer> rampDownCapacityThresholdPercent) {
            $.rampDownCapacityThresholdPercent = rampDownCapacityThresholdPercent;
            return this;
        }

        /**
         * @param rampDownCapacityThresholdPercent This is the value in percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-down and off-peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
         * 
         * @return builder
         * 
         */
        public Builder rampDownCapacityThresholdPercent(Integer rampDownCapacityThresholdPercent) {
            return rampDownCapacityThresholdPercent(Output.of(rampDownCapacityThresholdPercent));
        }

        /**
         * @param rampDownForceLogoffUsers Whether users will be forced to log-off session hosts once the `ramp_down_wait_time_minutes` value has been exceeded during the Ramp-Down period. Possible
         * 
         * @return builder
         * 
         */
        public Builder rampDownForceLogoffUsers(Output<Boolean> rampDownForceLogoffUsers) {
            $.rampDownForceLogoffUsers = rampDownForceLogoffUsers;
            return this;
        }

        /**
         * @param rampDownForceLogoffUsers Whether users will be forced to log-off session hosts once the `ramp_down_wait_time_minutes` value has been exceeded during the Ramp-Down period. Possible
         * 
         * @return builder
         * 
         */
        public Builder rampDownForceLogoffUsers(Boolean rampDownForceLogoffUsers) {
            return rampDownForceLogoffUsers(Output.of(rampDownForceLogoffUsers));
        }

        /**
         * @param rampDownLoadBalancingAlgorithm The load Balancing Algorithm to use during the Ramp-Down period. Possible values are `DepthFirst` and `BreadthFirst`.
         * 
         * @return builder
         * 
         */
        public Builder rampDownLoadBalancingAlgorithm(Output<String> rampDownLoadBalancingAlgorithm) {
            $.rampDownLoadBalancingAlgorithm = rampDownLoadBalancingAlgorithm;
            return this;
        }

        /**
         * @param rampDownLoadBalancingAlgorithm The load Balancing Algorithm to use during the Ramp-Down period. Possible values are `DepthFirst` and `BreadthFirst`.
         * 
         * @return builder
         * 
         */
        public Builder rampDownLoadBalancingAlgorithm(String rampDownLoadBalancingAlgorithm) {
            return rampDownLoadBalancingAlgorithm(Output.of(rampDownLoadBalancingAlgorithm));
        }

        /**
         * @param rampDownMinimumHostsPercent The minimum percentage of session host virtual machines that you would like to get to for ramp-down and off-peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
         * 
         * @return builder
         * 
         */
        public Builder rampDownMinimumHostsPercent(Output<Integer> rampDownMinimumHostsPercent) {
            $.rampDownMinimumHostsPercent = rampDownMinimumHostsPercent;
            return this;
        }

        /**
         * @param rampDownMinimumHostsPercent The minimum percentage of session host virtual machines that you would like to get to for ramp-down and off-peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
         * 
         * @return builder
         * 
         */
        public Builder rampDownMinimumHostsPercent(Integer rampDownMinimumHostsPercent) {
            return rampDownMinimumHostsPercent(Output.of(rampDownMinimumHostsPercent));
        }

        /**
         * @param rampDownNotificationMessage The notification message to send to users during Ramp-Down period when they are required to log-off.
         * 
         * @return builder
         * 
         */
        public Builder rampDownNotificationMessage(Output<String> rampDownNotificationMessage) {
            $.rampDownNotificationMessage = rampDownNotificationMessage;
            return this;
        }

        /**
         * @param rampDownNotificationMessage The notification message to send to users during Ramp-Down period when they are required to log-off.
         * 
         * @return builder
         * 
         */
        public Builder rampDownNotificationMessage(String rampDownNotificationMessage) {
            return rampDownNotificationMessage(Output.of(rampDownNotificationMessage));
        }

        /**
         * @param rampDownStartTime The time at which Ramp-Down scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder rampDownStartTime(Output<String> rampDownStartTime) {
            $.rampDownStartTime = rampDownStartTime;
            return this;
        }

        /**
         * @param rampDownStartTime The time at which Ramp-Down scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder rampDownStartTime(String rampDownStartTime) {
            return rampDownStartTime(Output.of(rampDownStartTime));
        }

        /**
         * @param rampDownStopHostsWhen Controls Session Host shutdown behaviour during Ramp-Down period. Session Hosts can either be shutdown when all sessions on the Session Host have ended, or when there are no Active sessions left on the Session Host. Possible values are `ZeroSessions` and `ZeroActiveSessions`.
         * 
         * @return builder
         * 
         */
        public Builder rampDownStopHostsWhen(Output<String> rampDownStopHostsWhen) {
            $.rampDownStopHostsWhen = rampDownStopHostsWhen;
            return this;
        }

        /**
         * @param rampDownStopHostsWhen Controls Session Host shutdown behaviour during Ramp-Down period. Session Hosts can either be shutdown when all sessions on the Session Host have ended, or when there are no Active sessions left on the Session Host. Possible values are `ZeroSessions` and `ZeroActiveSessions`.
         * 
         * @return builder
         * 
         */
        public Builder rampDownStopHostsWhen(String rampDownStopHostsWhen) {
            return rampDownStopHostsWhen(Output.of(rampDownStopHostsWhen));
        }

        /**
         * @param rampDownWaitTimeMinutes The number of minutes during Ramp-Down period that autoscale will wait after setting the session host VMs to drain mode, notifying any currently signed in users to save their work before forcing the users to logoff. Once all user sessions on the session host VM have been logged off, Autoscale will shut down the VM.
         * 
         * @return builder
         * 
         */
        public Builder rampDownWaitTimeMinutes(Output<Integer> rampDownWaitTimeMinutes) {
            $.rampDownWaitTimeMinutes = rampDownWaitTimeMinutes;
            return this;
        }

        /**
         * @param rampDownWaitTimeMinutes The number of minutes during Ramp-Down period that autoscale will wait after setting the session host VMs to drain mode, notifying any currently signed in users to save their work before forcing the users to logoff. Once all user sessions on the session host VM have been logged off, Autoscale will shut down the VM.
         * 
         * @return builder
         * 
         */
        public Builder rampDownWaitTimeMinutes(Integer rampDownWaitTimeMinutes) {
            return rampDownWaitTimeMinutes(Output.of(rampDownWaitTimeMinutes));
        }

        /**
         * @param rampUpCapacityThresholdPercent Specify minimum percentage of session host virtual machines to start for ramp-up and peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
         * 
         * @return builder
         * 
         */
        public Builder rampUpCapacityThresholdPercent(@Nullable Output<Integer> rampUpCapacityThresholdPercent) {
            $.rampUpCapacityThresholdPercent = rampUpCapacityThresholdPercent;
            return this;
        }

        /**
         * @param rampUpCapacityThresholdPercent Specify minimum percentage of session host virtual machines to start for ramp-up and peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
         * 
         * @return builder
         * 
         */
        public Builder rampUpCapacityThresholdPercent(Integer rampUpCapacityThresholdPercent) {
            return rampUpCapacityThresholdPercent(Output.of(rampUpCapacityThresholdPercent));
        }

        /**
         * @param rampUpLoadBalancingAlgorithm The load Balancing Algorithm to use during the Ramp-Up period. Possible values are `DepthFirst` and `BreadthFirst`.
         * 
         * @return builder
         * 
         */
        public Builder rampUpLoadBalancingAlgorithm(Output<String> rampUpLoadBalancingAlgorithm) {
            $.rampUpLoadBalancingAlgorithm = rampUpLoadBalancingAlgorithm;
            return this;
        }

        /**
         * @param rampUpLoadBalancingAlgorithm The load Balancing Algorithm to use during the Ramp-Up period. Possible values are `DepthFirst` and `BreadthFirst`.
         * 
         * @return builder
         * 
         */
        public Builder rampUpLoadBalancingAlgorithm(String rampUpLoadBalancingAlgorithm) {
            return rampUpLoadBalancingAlgorithm(Output.of(rampUpLoadBalancingAlgorithm));
        }

        /**
         * @param rampUpMinimumHostsPercent This is the value of percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-up and peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
         * 
         * @return builder
         * 
         */
        public Builder rampUpMinimumHostsPercent(@Nullable Output<Integer> rampUpMinimumHostsPercent) {
            $.rampUpMinimumHostsPercent = rampUpMinimumHostsPercent;
            return this;
        }

        /**
         * @param rampUpMinimumHostsPercent This is the value of percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-up and peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
         * 
         * @return builder
         * 
         */
        public Builder rampUpMinimumHostsPercent(Integer rampUpMinimumHostsPercent) {
            return rampUpMinimumHostsPercent(Output.of(rampUpMinimumHostsPercent));
        }

        /**
         * @param rampUpStartTime The time at which Ramp-Up scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder rampUpStartTime(Output<String> rampUpStartTime) {
            $.rampUpStartTime = rampUpStartTime;
            return this;
        }

        /**
         * @param rampUpStartTime The time at which Ramp-Up scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in &#34;HH:MM&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder rampUpStartTime(String rampUpStartTime) {
            return rampUpStartTime(Output.of(rampUpStartTime));
        }

        public ScalingPlanScheduleArgs build() {
            $.daysOfWeeks = Objects.requireNonNull($.daysOfWeeks, "expected parameter 'daysOfWeeks' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.offPeakLoadBalancingAlgorithm = Objects.requireNonNull($.offPeakLoadBalancingAlgorithm, "expected parameter 'offPeakLoadBalancingAlgorithm' to be non-null");
            $.offPeakStartTime = Objects.requireNonNull($.offPeakStartTime, "expected parameter 'offPeakStartTime' to be non-null");
            $.peakLoadBalancingAlgorithm = Objects.requireNonNull($.peakLoadBalancingAlgorithm, "expected parameter 'peakLoadBalancingAlgorithm' to be non-null");
            $.peakStartTime = Objects.requireNonNull($.peakStartTime, "expected parameter 'peakStartTime' to be non-null");
            $.rampDownCapacityThresholdPercent = Objects.requireNonNull($.rampDownCapacityThresholdPercent, "expected parameter 'rampDownCapacityThresholdPercent' to be non-null");
            $.rampDownForceLogoffUsers = Objects.requireNonNull($.rampDownForceLogoffUsers, "expected parameter 'rampDownForceLogoffUsers' to be non-null");
            $.rampDownLoadBalancingAlgorithm = Objects.requireNonNull($.rampDownLoadBalancingAlgorithm, "expected parameter 'rampDownLoadBalancingAlgorithm' to be non-null");
            $.rampDownMinimumHostsPercent = Objects.requireNonNull($.rampDownMinimumHostsPercent, "expected parameter 'rampDownMinimumHostsPercent' to be non-null");
            $.rampDownNotificationMessage = Objects.requireNonNull($.rampDownNotificationMessage, "expected parameter 'rampDownNotificationMessage' to be non-null");
            $.rampDownStartTime = Objects.requireNonNull($.rampDownStartTime, "expected parameter 'rampDownStartTime' to be non-null");
            $.rampDownStopHostsWhen = Objects.requireNonNull($.rampDownStopHostsWhen, "expected parameter 'rampDownStopHostsWhen' to be non-null");
            $.rampDownWaitTimeMinutes = Objects.requireNonNull($.rampDownWaitTimeMinutes, "expected parameter 'rampDownWaitTimeMinutes' to be non-null");
            $.rampUpLoadBalancingAlgorithm = Objects.requireNonNull($.rampUpLoadBalancingAlgorithm, "expected parameter 'rampUpLoadBalancingAlgorithm' to be non-null");
            $.rampUpStartTime = Objects.requireNonNull($.rampUpStartTime, "expected parameter 'rampUpStartTime' to be non-null");
            return $;
        }
    }

}
