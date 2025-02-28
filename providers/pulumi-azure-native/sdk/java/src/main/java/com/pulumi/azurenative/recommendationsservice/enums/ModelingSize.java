// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recommendationsservice.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Modeling size controls the maximum supported input data size.
     * 
     */
    @EnumType
    public enum ModelingSize {
        Small("Small"),
        Medium("Medium"),
        Large("Large");

        private final String value;

        ModelingSize(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ModelingSize[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
