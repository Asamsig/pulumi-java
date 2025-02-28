// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Describes operator to be matched
     * 
     */
    @EnumType
    public enum RemoteAddressOperator {
        Any("Any"),
        IPMatch("IPMatch"),
        GeoMatch("GeoMatch");

        private final String value;

        RemoteAddressOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RemoteAddressOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
