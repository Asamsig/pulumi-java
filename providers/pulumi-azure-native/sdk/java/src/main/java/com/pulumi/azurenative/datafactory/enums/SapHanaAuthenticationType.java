// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The authentication type to be used to connect to the SAP HANA server.
     * 
     */
    @EnumType
    public enum SapHanaAuthenticationType {
        Basic("Basic"),
        Windows("Windows");

        private final String value;

        SapHanaAuthenticationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SapHanaAuthenticationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
