// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Role of the linked server.
     * 
     */
    @EnumType
    public enum ReplicationRole {
        Primary("Primary"),
        Secondary("Secondary");

        private final String value;

        ReplicationRole(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ReplicationRole[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
