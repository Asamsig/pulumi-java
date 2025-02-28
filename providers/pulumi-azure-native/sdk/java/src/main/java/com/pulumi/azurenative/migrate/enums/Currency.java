// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Currency to report prices in.
     * 
     */
    @EnumType
    public enum Currency {
        Unknown("Unknown"),
        USD("USD"),
        DKK("DKK"),
        CAD("CAD"),
        IDR("IDR"),
        JPY("JPY"),
        KRW("KRW"),
        NZD("NZD"),
        NOK("NOK"),
        RUB("RUB"),
        SAR("SAR"),
        ZAR("ZAR"),
        SEK("SEK"),
        TRY("TRY"),
        GBP("GBP"),
        MXN("MXN"),
        MYR("MYR"),
        INR("INR"),
        HKD("HKD"),
        BRL("BRL"),
        TWD("TWD"),
        EUR("EUR"),
        CHF("CHF"),
        ARS("ARS"),
        AUD("AUD"),
        CNY("CNY");

        private final String value;

        Currency(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Currency[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
