// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Name of the resource.
     * 
     */
    @EnumType
    public enum AutoScalingResourceMetricName {
        /**
         * Indicates that the resource is CPU cores.
         * 
         */
        Cpu("cpu"),
        /**
         * Indicates that the resource is memory in GB.
         * 
         */
        MemoryInGB("memoryInGB");

        private final String value;

        AutoScalingResourceMetricName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AutoScalingResourceMetricName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
