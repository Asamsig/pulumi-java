// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The artifact source&#39;s type.
     * 
     */
    @EnumType
    public enum SourceControlType {
        VsoGit("VsoGit"),
        GitHub("GitHub"),
        StorageAccount("StorageAccount");

        private final String value;

        SourceControlType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SourceControlType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
