// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Ratio-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowCxV3ExperimentResultMetricType {
        /**
         * Metric unspecified.
         * 
         */
        MetricUnspecified("METRIC_UNSPECIFIED"),
        /**
         * Percentage of contained sessions without user calling back in 24 hours.
         * 
         */
        ContainedSessionNoCallbackRate("CONTAINED_SESSION_NO_CALLBACK_RATE"),
        /**
         * Percentage of sessions that were handed to a human agent.
         * 
         */
        LiveAgentHandoffRate("LIVE_AGENT_HANDOFF_RATE"),
        /**
         * Percentage of sessions with the same user calling back.
         * 
         */
        CallbackSessionRate("CALLBACK_SESSION_RATE"),
        /**
         * Percentage of sessions where user hung up.
         * 
         */
        AbandonedSessionRate("ABANDONED_SESSION_RATE"),
        /**
         * Percentage of sessions reached Dialogflow &#39;END_PAGE&#39; or &#39;END_SESSION&#39;.
         * 
         */
        SessionEndRate("SESSION_END_RATE");

        private final String value;

        GoogleCloudDialogflowCxV3ExperimentResultMetricType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowCxV3ExperimentResultMetricType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
