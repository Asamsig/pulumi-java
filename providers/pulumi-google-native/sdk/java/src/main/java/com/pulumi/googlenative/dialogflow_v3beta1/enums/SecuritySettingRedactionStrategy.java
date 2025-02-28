// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Strategy that defines how we do redaction.
     * 
     */
    @EnumType
    public enum SecuritySettingRedactionStrategy {
        /**
         * Do not redact.
         * 
         */
        RedactionStrategyUnspecified("REDACTION_STRATEGY_UNSPECIFIED"),
        /**
         * Call redaction service to clean up the data to be persisted.
         * 
         */
        RedactWithService("REDACT_WITH_SERVICE");

        private final String value;

        SecuritySettingRedactionStrategy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecuritySettingRedactionStrategy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
