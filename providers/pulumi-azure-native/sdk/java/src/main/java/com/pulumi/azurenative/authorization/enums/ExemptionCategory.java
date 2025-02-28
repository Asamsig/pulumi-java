// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     */
    @EnumType
    public enum ExemptionCategory {
        /**
         * This category of exemptions usually means the scope is not applicable for the policy.
         * 
         */
        Waiver("Waiver"),
        /**
         * This category of exemptions usually means the mitigation actions have been applied to the scope.
         * 
         */
        Mitigated("Mitigated");

        private final String value;

        ExemptionCategory(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExemptionCategory[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
