// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Compute Engine machine type on which to run the build.
     * 
     */
    @EnumType
    public enum BuildOptionsMachineType {
        /**
         * Standard machine type.
         * 
         */
        Unspecified("UNSPECIFIED"),
        /**
         * Highcpu machine with 8 CPUs.
         * 
         */
        N1Highcpu8("N1_HIGHCPU_8"),
        /**
         * Highcpu machine with 32 CPUs.
         * 
         */
        N1Highcpu32("N1_HIGHCPU_32"),
        /**
         * Highcpu e2 machine with 8 CPUs.
         * 
         */
        E2Highcpu8("E2_HIGHCPU_8"),
        /**
         * Highcpu e2 machine with 32 CPUs.
         * 
         */
        E2Highcpu32("E2_HIGHCPU_32");

        private final String value;

        BuildOptionsMachineType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BuildOptionsMachineType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
