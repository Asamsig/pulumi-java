// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * **Beta Feature** The default logging verbosity for activity from devices in this registry. The verbosity level can be overridden by Device.log_level.
     * 
     */
    @EnumType
    public enum RegistryLogLevel {
        /**
         * No logging specified. If not specified, logging will be disabled.
         * 
         */
        LogLevelUnspecified("LOG_LEVEL_UNSPECIFIED"),
        /**
         * Disables logging.
         * 
         */
        None("NONE"),
        /**
         * Error events will be logged.
         * 
         */
        Error("ERROR"),
        /**
         * Informational events will be logged, such as connections and disconnections.
         * 
         */
        Info("INFO"),
        /**
         * All events will be logged.
         * 
         */
        Debug("DEBUG");

        private final String value;

        RegistryLogLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegistryLogLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
