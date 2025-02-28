// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The network access type for accessing Log Analytics query.
     * 
     */
    @EnumType
    public enum PublicNetworkAccessType {
        /**
         * Enables connectivity to Log Analytics through public DNS.
         * 
         */
        Enabled("Enabled"),
        /**
         * Disables public connectivity to Log Analytics through public DNS.
         * 
         */
        Disabled("Disabled");

        private final String value;

        PublicNetworkAccessType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PublicNetworkAccessType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
