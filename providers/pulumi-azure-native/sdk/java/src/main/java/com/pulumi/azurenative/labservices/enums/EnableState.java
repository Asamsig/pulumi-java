// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Whether a VM will get shutdown when it hasn&#39;t been connected to after a period of time.
     * 
     */
    @EnumType
    public enum EnableState {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        EnableState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EnableState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
