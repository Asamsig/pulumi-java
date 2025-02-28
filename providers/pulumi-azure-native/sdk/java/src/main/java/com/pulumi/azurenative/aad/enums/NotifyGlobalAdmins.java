// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aad.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Should global admins be notified
     * 
     */
    @EnumType
    public enum NotifyGlobalAdmins {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        NotifyGlobalAdmins(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NotifyGlobalAdmins[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
