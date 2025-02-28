// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.forecast.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The dataset type
     * 
     */
    @EnumType
    public enum DatasetType {
        TargetTimeSeries("TARGET_TIME_SERIES"),
        RelatedTimeSeries("RELATED_TIME_SERIES"),
        ItemMetadata("ITEM_METADATA");

        private final String value;

        DatasetType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatasetType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
