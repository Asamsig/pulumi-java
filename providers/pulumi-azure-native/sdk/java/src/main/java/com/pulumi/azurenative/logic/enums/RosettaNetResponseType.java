// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The value indicating whether the RosettaNet PIP communication is synchronous.
     * 
     */
    @EnumType
    public enum RosettaNetResponseType {
        NotSpecified("NotSpecified"),
        Sync("Sync"),
        Async("Async");

        private final String value;

        RosettaNetResponseType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RosettaNetResponseType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
