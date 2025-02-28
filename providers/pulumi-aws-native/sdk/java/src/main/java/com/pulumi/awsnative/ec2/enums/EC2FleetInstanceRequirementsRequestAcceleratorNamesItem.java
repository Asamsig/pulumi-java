// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum EC2FleetInstanceRequirementsRequestAcceleratorNamesItem {
        A100("a100"),
        V100("v100"),
        K80("k80"),
        T4("t4"),
        M60("m60"),
        RadeonProV520("radeon-pro-v520"),
        Vu9p("vu9p"),
        Inferentia("inferentia"),
        K520("k520");

        private final String value;

        EC2FleetInstanceRequirementsRequestAcceleratorNamesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EC2FleetInstanceRequirementsRequestAcceleratorNamesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
