// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Describes if it is in detection mode or prevention mode at policy level.
     * 
     */
    @EnumType
    public enum PolicyMode {
        Prevention("Prevention"),
        Detection("Detection");

        private final String value;

        PolicyMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PolicyMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
