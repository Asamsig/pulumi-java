// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Weeks of month.
     * 
     */
    @EnumType
    public enum WeeksOfMonth {
        First("First"),
        Second("Second"),
        Third("Third"),
        Fourth("Fourth"),
        Last("Last");

        private final String value;

        WeeksOfMonth(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WeeksOfMonth[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
