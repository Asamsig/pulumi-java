// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of the database transparent data encryption.
     * 
     */
    @EnumType
    public enum TransparentDataEncryptionStatus {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        TransparentDataEncryptionStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TransparentDataEncryptionStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
