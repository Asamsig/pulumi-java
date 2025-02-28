// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hardwaresecuritymodules.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * SKU of the dedicated HSM
     * 
     */
    @EnumType
    public enum SkuName {
        /**
         * The dedicated HSM is a Safenet Luna Network HSM A790 device.
         * 
         */
        SafeNet_Luna_Network_HSM_A790("SafeNet Luna Network HSM A790"),
        /**
         * The dedicated HSM is a payShield 10K, model PS10-D, 10Gb Ethernet Hardware Platform device with 1 local master key which supports up to 60 calls per second.
         * 
         */
        PayShield10K_LMK1_CPS60("payShield10K_LMK1_CPS60"),
        /**
         * The dedicated HSM is a payShield 10K, model PS10-D, 10Gb Ethernet Hardware Platform device with 1 local master key which supports up to 250 calls per second.
         * 
         */
        PayShield10K_LMK1_CPS250("payShield10K_LMK1_CPS250"),
        /**
         * The dedicated HSM is a payShield 10K, model PS10-D, 10Gb Ethernet Hardware Platform device with 1 local master key which supports up to 2500 calls per second.
         * 
         */
        PayShield10K_LMK1_CPS2500("payShield10K_LMK1_CPS2500"),
        /**
         * The dedicated HSM is a payShield 10K, model PS10-D, 10Gb Ethernet Hardware Platform device with 2 local master keys which supports up to 60 calls per second.
         * 
         */
        PayShield10K_LMK2_CPS60("payShield10K_LMK2_CPS60"),
        /**
         * The dedicated HSM is a payShield 10K, model PS10-D, 10Gb Ethernet Hardware Platform device with 2 local master keys which supports up to 250 calls per second.
         * 
         */
        PayShield10K_LMK2_CPS250("payShield10K_LMK2_CPS250"),
        /**
         * The dedicated HSM is a payShield 10K, model PS10-D, 10Gb Ethernet Hardware Platform device with 2 local master keys which supports up to 2500 calls per second.
         * 
         */
        PayShield10K_LMK2_CPS2500("payShield10K_LMK2_CPS2500");

        private final String value;

        SkuName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SkuName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
