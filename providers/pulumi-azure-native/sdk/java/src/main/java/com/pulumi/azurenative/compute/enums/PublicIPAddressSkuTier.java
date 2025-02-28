// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specify public IP sku tier
     * 
     */
    @EnumType
    public enum PublicIPAddressSkuTier {
        Regional("Regional"),
        Global("Global");

        private final String value;

        PublicIPAddressSkuTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PublicIPAddressSkuTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
