// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of encryption being used. Currently the only supported type is &#39;SystemAssigned&#39;.
     * 
     */
    @EnumType
    public enum EncryptionIdentityType {
        SystemAssigned("SystemAssigned");

        private final String value;

        EncryptionIdentityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EncryptionIdentityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
