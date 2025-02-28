// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
     * 
     */
    @EnumType
    public enum TransferJobStatus {
        /**
         * Zero is an illegal value.
         * 
         */
        StatusUnspecified("STATUS_UNSPECIFIED"),
        /**
         * New transfers are performed based on the schedule.
         * 
         */
        Enabled("ENABLED"),
        /**
         * New transfers are not scheduled.
         * 
         */
        Disabled("DISABLED"),
        /**
         * This is a soft delete state. After a transfer job is set to this state, the job and all the transfer executions are subject to garbage collection. Transfer jobs become eligible for garbage collection 30 days after their status is set to `DELETED`.
         * 
         */
        Deleted("DELETED");

        private final String value;

        TransferJobStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TransferJobStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
