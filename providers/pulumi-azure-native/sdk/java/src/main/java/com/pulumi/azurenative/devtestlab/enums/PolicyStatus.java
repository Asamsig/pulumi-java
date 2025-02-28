// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of the policy.
     * 
     */
    @EnumType
    public enum PolicyStatus {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        PolicyStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PolicyStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
