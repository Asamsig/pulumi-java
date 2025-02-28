// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CVSSPrivilegesRequired {
        PrivilegesRequiredUnspecified("PRIVILEGES_REQUIRED_UNSPECIFIED"),
        PrivilegesRequiredNone("PRIVILEGES_REQUIRED_NONE"),
        PrivilegesRequiredLow("PRIVILEGES_REQUIRED_LOW"),
        PrivilegesRequiredHigh("PRIVILEGES_REQUIRED_HIGH");

        private final String value;

        CVSSPrivilegesRequired(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CVSSPrivilegesRequired[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
