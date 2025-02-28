// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of Payload body for Base image update triggers.
     * 
     */
    @EnumType
    public enum UpdateTriggerPayloadType {
        Default("Default"),
        Token("Token");

        private final String value;

        UpdateTriggerPayloadType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UpdateTriggerPayloadType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
