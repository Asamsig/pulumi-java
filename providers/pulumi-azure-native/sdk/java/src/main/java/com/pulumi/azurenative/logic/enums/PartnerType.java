// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The partner type.
     * 
     */
    @EnumType
    public enum PartnerType {
        NotSpecified("NotSpecified"),
        B2B("B2B");

        private final String value;

        PartnerType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PartnerType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
