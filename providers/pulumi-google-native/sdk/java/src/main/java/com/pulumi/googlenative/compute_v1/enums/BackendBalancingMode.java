// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
     * 
     */
    @EnumType
    public enum BackendBalancingMode {
        /**
         * Balance based on the number of simultaneous connections.
         * 
         */
        Connection("CONNECTION"),
        /**
         * Balance based on requests per second (RPS).
         * 
         */
        Rate("RATE"),
        /**
         * Balance based on the backend utilization.
         * 
         */
        Utilization("UTILIZATION");

        private final String value;

        BackendBalancingMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackendBalancingMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
