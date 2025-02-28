// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The redirect status code.
     * 
     */
    @EnumType
    public enum DomainRedirectType {
        /**
         * The default redirect type; should not be intentionlly used.
         * 
         */
        RedirectTypeUnspecified("REDIRECT_TYPE_UNSPECIFIED"),
        /**
         * The redirect will respond with an HTTP status code of `301 Moved Permanently`.
         * 
         */
        MovedPermanently("MOVED_PERMANENTLY");

        private final String value;

        DomainRedirectType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DomainRedirectType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
