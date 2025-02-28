// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Answer this query with a behavior rather than DNS data.
     * 
     */
    @EnumType
    public enum ResponsePolicyRuleBehavior {
        BehaviorUnspecified("BEHAVIOR_UNSPECIFIED"),
        /**
         * Skip a less-specific ResponsePolicyRule and continue normal query logic. This can be used in conjunction with a wildcard to exempt a subset of the wildcard ResponsePolicyRule from the ResponsePolicy behavior and e.g., query the public internet instead. For instance, if these rules exist: *.example.com -&gt; 1.2.3.4 foo.example.com -&gt; PASSTHRU Then a query for &#39;foo.example.com&#39; skips the wildcard.
         * 
         */
        BypassResponsePolicy("BYPASS_RESPONSE_POLICY");

        private final String value;

        ResponsePolicyRuleBehavior(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResponsePolicyRuleBehavior[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
