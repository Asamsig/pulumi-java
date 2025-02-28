// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
     * 
     */
    @EnumType
    public enum GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment {
        CreditTypesTreatmentUnspecified("CREDIT_TYPES_TREATMENT_UNSPECIFIED"),
        /**
         * All types of credit are subtracted from the gross cost to determine the spend for threshold calculations.
         * 
         */
        IncludeAllCredits("INCLUDE_ALL_CREDITS"),
        /**
         * All types of credit are added to the net cost to determine the spend for threshold calculations.
         * 
         */
        ExcludeAllCredits("EXCLUDE_ALL_CREDITS"),
        /**
         * [Credit types](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type) specified in the credit_types field are subtracted from the gross cost to determine the spend for threshold calculations.
         * 
         */
        IncludeSpecifiedCredits("INCLUDE_SPECIFIED_CREDITS");

        private final String value;

        GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudBillingBudgetsV1beta1FilterCreditTypesTreatment[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
