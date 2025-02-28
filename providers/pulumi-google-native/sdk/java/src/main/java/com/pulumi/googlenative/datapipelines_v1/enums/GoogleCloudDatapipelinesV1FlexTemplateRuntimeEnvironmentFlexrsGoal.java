// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datapipelines_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
     * 
     */
    @EnumType
    public enum GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal {
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

        GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentFlexrsGoal[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
