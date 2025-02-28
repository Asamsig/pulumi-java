// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the AWS account that you are acting from. By default, SELF is specified. For self-managed permissions, specify SELF; for service-managed permissions, if you are signed in to the organization&#39;s management account, specify SELF. If you are signed in to a delegated administrator account, specify DELEGATED_ADMIN.
     * 
     */
    @EnumType
    public enum StackSetCallAs {
        Self("SELF"),
        DelegatedAdmin("DELEGATED_ADMIN");

        private final String value;

        StackSetCallAs(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StackSetCallAs[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
