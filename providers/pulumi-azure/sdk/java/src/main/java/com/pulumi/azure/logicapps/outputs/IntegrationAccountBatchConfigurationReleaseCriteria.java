// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.outputs;

import com.pulumi.azure.logicapps.outputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrence;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationAccountBatchConfigurationReleaseCriteria {
    /**
     * @return The batch size in bytes for the Logic App Integration Batch Configuration.
     * 
     */
    private final @Nullable Integer batchSize;
    /**
     * @return The message count for the Logic App Integration Batch Configuration.
     * 
     */
    private final @Nullable Integer messageCount;
    /**
     * @return A `recurrence` block as documented below.
     * 
     */
    private final @Nullable IntegrationAccountBatchConfigurationReleaseCriteriaRecurrence recurrence;

    @CustomType.Constructor
    private IntegrationAccountBatchConfigurationReleaseCriteria(
        @CustomType.Parameter("batchSize") @Nullable Integer batchSize,
        @CustomType.Parameter("messageCount") @Nullable Integer messageCount,
        @CustomType.Parameter("recurrence") @Nullable IntegrationAccountBatchConfigurationReleaseCriteriaRecurrence recurrence) {
        this.batchSize = batchSize;
        this.messageCount = messageCount;
        this.recurrence = recurrence;
    }

    /**
     * @return The batch size in bytes for the Logic App Integration Batch Configuration.
     * 
     */
    public Optional<Integer> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * @return The message count for the Logic App Integration Batch Configuration.
     * 
     */
    public Optional<Integer> messageCount() {
        return Optional.ofNullable(this.messageCount);
    }
    /**
     * @return A `recurrence` block as documented below.
     * 
     */
    public Optional<IntegrationAccountBatchConfigurationReleaseCriteriaRecurrence> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountBatchConfigurationReleaseCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer batchSize;
        private @Nullable Integer messageCount;
        private @Nullable IntegrationAccountBatchConfigurationReleaseCriteriaRecurrence recurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountBatchConfigurationReleaseCriteria defaults) {
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
        public Builder recurrence(@Nullable IntegrationAccountBatchConfigurationReleaseCriteriaRecurrence recurrence) {
            this.recurrence = recurrence;
            return this;
        }        public IntegrationAccountBatchConfigurationReleaseCriteria build() {
            return new IntegrationAccountBatchConfigurationReleaseCriteria(batchSize, messageCount, recurrence);
        }
    }
}
