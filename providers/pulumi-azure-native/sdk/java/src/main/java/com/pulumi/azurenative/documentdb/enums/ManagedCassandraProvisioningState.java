// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of the resource at the time the operation was called.
     * 
     */
    @EnumType
    public enum ManagedCassandraProvisioningState {
        Creating("Creating"),
        Updating("Updating"),
        Deleting("Deleting"),
        Succeeded("Succeeded"),
        Failed("Failed"),
        Canceled("Canceled");

        private final String value;

        ManagedCassandraProvisioningState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedCassandraProvisioningState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
