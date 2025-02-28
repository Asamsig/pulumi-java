// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Which Flexible Resource Scheduling mode to run in.
     * 
     */
    @EnumType
    public enum EnvironmentFlexResourceSchedulingGoal {
        /**
         * Run in the default mode.
         * 
         */
        FlexrsUnspecified("FLEXRS_UNSPECIFIED"),
        /**
         * Optimize for lower execution time.
         * 
         */
        FlexrsSpeedOptimized("FLEXRS_SPEED_OPTIMIZED"),
        /**
         * Optimize for lower cost.
         * 
         */
        FlexrsCostOptimized("FLEXRS_COST_OPTIMIZED");

        private final String value;

        EnvironmentFlexResourceSchedulingGoal(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EnvironmentFlexResourceSchedulingGoal[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
