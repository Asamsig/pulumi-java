// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CVSSAttackComplexity {
        AttackComplexityUnspecified("ATTACK_COMPLEXITY_UNSPECIFIED"),
        AttackComplexityLow("ATTACK_COMPLEXITY_LOW"),
        AttackComplexityHigh("ATTACK_COMPLEXITY_HIGH");

        private final String value;

        CVSSAttackComplexity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CVSSAttackComplexity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
