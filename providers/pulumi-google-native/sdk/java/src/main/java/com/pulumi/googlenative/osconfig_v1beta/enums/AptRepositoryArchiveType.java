// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of archive files in this repository. The default behavior is DEB.
     * 
     */
    @EnumType
    public enum AptRepositoryArchiveType {
        /**
         * Unspecified.
         * 
         */
        ArchiveTypeUnspecified("ARCHIVE_TYPE_UNSPECIFIED"),
        /**
         * DEB indicates that the archive contains binary files.
         * 
         */
        Deb("DEB"),
        /**
         * DEB_SRC indicates that the archive contains source files.
         * 
         */
        DebSrc("DEB_SRC");

        private final String value;

        AptRepositoryArchiveType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AptRepositoryArchiveType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
