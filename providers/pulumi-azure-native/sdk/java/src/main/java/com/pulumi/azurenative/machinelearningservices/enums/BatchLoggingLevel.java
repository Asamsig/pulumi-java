// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Logging level for batch inference operation.
     * 
     */
    @EnumType
    public enum BatchLoggingLevel {
        Info("Info"),
        Warning("Warning"),
        Debug("Debug");

        private final String value;

        BatchLoggingLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BatchLoggingLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
