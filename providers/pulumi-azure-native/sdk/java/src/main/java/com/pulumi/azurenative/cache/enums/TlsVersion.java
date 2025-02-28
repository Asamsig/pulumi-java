// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The minimum TLS version for the cluster to support, e.g. &#39;1.2&#39;
     * 
     */
    @EnumType
    public enum TlsVersion {
        _1_0("1.0"),
        _1_1("1.1"),
        _1_2("1.2");

        private final String value;

        TlsVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TlsVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
