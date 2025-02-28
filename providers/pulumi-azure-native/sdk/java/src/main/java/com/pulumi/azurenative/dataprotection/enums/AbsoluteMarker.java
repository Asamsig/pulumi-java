// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum AbsoluteMarker {
        AllBackup("AllBackup"),
        FirstOfDay("FirstOfDay"),
        FirstOfMonth("FirstOfMonth"),
        FirstOfWeek("FirstOfWeek"),
        FirstOfYear("FirstOfYear");

        private final String value;

        AbsoluteMarker(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AbsoluteMarker[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
