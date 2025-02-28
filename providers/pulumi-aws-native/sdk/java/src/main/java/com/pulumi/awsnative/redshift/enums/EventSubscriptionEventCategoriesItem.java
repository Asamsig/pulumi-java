// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum EventSubscriptionEventCategoriesItem {
        Configuration("configuration"),
        Management("management"),
        Monitoring("monitoring"),
        Security("security"),
        Pending("pending");

        private final String value;

        EventSubscriptionEventCategoriesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EventSubscriptionEventCategoriesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
