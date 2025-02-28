// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum BucketDefaultRetentionMode {
        Compliance("COMPLIANCE"),
        Governance("GOVERNANCE");

        private final String value;

        BucketDefaultRetentionMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BucketDefaultRetentionMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
