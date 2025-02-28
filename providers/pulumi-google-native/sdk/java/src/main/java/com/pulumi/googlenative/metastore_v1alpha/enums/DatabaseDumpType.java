// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The type of the database dump. If unspecified, defaults to MYSQL.
     * 
     */
    @EnumType
    public enum DatabaseDumpType {
        /**
         * The type of the database dump is unknown.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Database dump is a MySQL dump file.
         * 
         */
        Mysql("MYSQL"),
        /**
         * Database dump contains Avro files.
         * 
         */
        Avro("AVRO");

        private final String value;

        DatabaseDumpType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatabaseDumpType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
