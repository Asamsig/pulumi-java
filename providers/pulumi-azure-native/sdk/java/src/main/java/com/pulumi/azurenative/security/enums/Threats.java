// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Threats impact of the assessment
     * 
     */
    @EnumType
    public enum Threats {
        AccountBreach("accountBreach"),
        DataExfiltration("dataExfiltration"),
        DataSpillage("dataSpillage"),
        MaliciousInsider("maliciousInsider"),
        ElevationOfPrivilege("elevationOfPrivilege"),
        ThreatResistance("threatResistance"),
        MissingCoverage("missingCoverage"),
        DenialOfService("denialOfService");

        private final String value;

        Threats(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Threats[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
