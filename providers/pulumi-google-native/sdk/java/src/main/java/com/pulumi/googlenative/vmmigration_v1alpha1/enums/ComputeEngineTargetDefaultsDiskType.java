// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The disk type to use in the VM.
     * 
     */
    @EnumType
    public enum ComputeEngineTargetDefaultsDiskType {
        /**
         * An unspecified disk type. Will be used as STANDARD.
         * 
         */
        ComputeEngineDiskTypeUnspecified("COMPUTE_ENGINE_DISK_TYPE_UNSPECIFIED"),
        /**
         * A Standard disk type.
         * 
         */
        ComputeEngineDiskTypeStandard("COMPUTE_ENGINE_DISK_TYPE_STANDARD"),
        /**
         * SSD hard disk type.
         * 
         */
        ComputeEngineDiskTypeSsd("COMPUTE_ENGINE_DISK_TYPE_SSD"),
        /**
         * An alternative to SSD persistent disks that balance performance and cost.
         * 
         */
        ComputeEngineDiskTypeBalanced("COMPUTE_ENGINE_DISK_TYPE_BALANCED");

        private final String value;

        ComputeEngineTargetDefaultsDiskType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ComputeEngineTargetDefaultsDiskType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
