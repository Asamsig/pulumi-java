// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.WorkflowTriggerRecurrenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BatchReleaseCriteriaResponse {
    /**
     * @return The batch size in bytes.
     * 
     */
    private final @Nullable Integer batchSize;
    /**
     * @return The message count.
     * 
     */
    private final @Nullable Integer messageCount;
    /**
     * @return The recurrence.
     * 
     */
    private final @Nullable WorkflowTriggerRecurrenceResponse recurrence;

    @CustomType.Constructor
    private BatchReleaseCriteriaResponse(
        @CustomType.Parameter("batchSize") @Nullable Integer batchSize,
        @CustomType.Parameter("messageCount") @Nullable Integer messageCount,
        @CustomType.Parameter("recurrence") @Nullable WorkflowTriggerRecurrenceResponse recurrence) {
        this.batchSize = batchSize;
        this.messageCount = messageCount;
        this.recurrence = recurrence;
    }

    /**
     * @return The batch size in bytes.
     * 
     */
    public Optional<Integer> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * @return The message count.
     * 
     */
    public Optional<Integer> messageCount() {
        return Optional.ofNullable(this.messageCount);
    }
    /**
     * @return The recurrence.
     * 
     */
    public Optional<WorkflowTriggerRecurrenceResponse> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchReleaseCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer batchSize;
        private @Nullable Integer messageCount;
        private @Nullable WorkflowTriggerRecurrenceResponse recurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchReleaseCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.messageCount = defaults.messageCount;
    	      this.recurrence = defaults.recurrence;
        }

        public Builder batchSize(@Nullable Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Builder messageCount(@Nullable Integer messageCount) {
            this.messageCount = messageCount;
            return this;
        }
        public Builder recurrence(@Nullable WorkflowTriggerRecurrenceResponse recurrence) {
            this.recurrence = recurrence;
            return this;
        }        public BatchReleaseCriteriaResponse build() {
            return new BatchReleaseCriteriaResponse(batchSize, messageCount, recurrence);
        }
    }
}
