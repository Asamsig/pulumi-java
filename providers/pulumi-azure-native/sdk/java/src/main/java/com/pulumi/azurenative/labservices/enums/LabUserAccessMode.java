// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
     */
    @EnumType
    public enum LabUserAccessMode {
        /**
         * Only users registered with the lab can access VMs.
         * 
         */
        Restricted("Restricted"),
        /**
         * Any user can register with the lab and access its VMs.
         * 
         */
        Open("Open");

        private final String value;

        LabUserAccessMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LabUserAccessMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
