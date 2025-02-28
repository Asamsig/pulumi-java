// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DataSourceConditionOperator {
        GreaterThan("GreaterThan"),
        GreaterThanOrEquals("GreaterThanOrEquals"),
        LessThan("LessThan"),
        LessThanOrEquals("LessThanOrEquals"),
        Equals("Equals"),
        NotEquals("NotEquals"),
        Contains("Contains"),
        NotContains("NotContains"),
        Exists("Exists"),
        NotExists("NotExists"),
        BeginsWith("BeginsWith");

        private final String value;

        DataSourceConditionOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataSourceConditionOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
