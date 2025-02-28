// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SuppressionScheduleResponse {
    /**
     * @return End date for suppression
     * 
     */
    private final @Nullable String endDate;
    /**
     * @return End date for suppression
     * 
     */
    private final @Nullable String endTime;
    /**
     * @return Specifies the values for recurrence pattern
     * 
     */
    private final @Nullable List<Integer> recurrenceValues;
    /**
     * @return Start date for suppression
     * 
     */
    private final @Nullable String startDate;
    /**
     * @return Start time for suppression
     * 
     */
    private final @Nullable String startTime;

    @CustomType.Constructor
    private SuppressionScheduleResponse(
        @CustomType.Parameter("endDate") @Nullable String endDate,
        @CustomType.Parameter("endTime") @Nullable String endTime,
        @CustomType.Parameter("recurrenceValues") @Nullable List<Integer> recurrenceValues,
        @CustomType.Parameter("startDate") @Nullable String startDate,
        @CustomType.Parameter("startTime") @Nullable String startTime) {
        this.endDate = endDate;
        this.endTime = endTime;
        this.recurrenceValues = recurrenceValues;
        this.startDate = startDate;
        this.startTime = startTime;
    }

    /**
     * @return End date for suppression
     * 
     */
    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * @return End date for suppression
     * 
     */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return Specifies the values for recurrence pattern
     * 
     */
    public List<Integer> recurrenceValues() {
        return this.recurrenceValues == null ? List.of() : this.recurrenceValues;
    }
    /**
     * @return Start date for suppression
     * 
     */
    public Optional<String> startDate() {
        return Optional.ofNullable(this.startDate);
    }
    /**
     * @return Start time for suppression
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endDate;
        private @Nullable String endTime;
        private @Nullable List<Integer> recurrenceValues;
        private @Nullable String startDate;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.endTime = defaults.endTime;
    	      this.recurrenceValues = defaults.recurrenceValues;
    	      this.startDate = defaults.startDate;
    	      this.startTime = defaults.startTime;
        }

        public Builder endDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder recurrenceValues(@Nullable List<Integer> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }
        public Builder recurrenceValues(Integer... recurrenceValues) {
            return recurrenceValues(List.of(recurrenceValues));
        }
        public Builder startDate(@Nullable String startDate) {
            this.startDate = startDate;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }        public SuppressionScheduleResponse build() {
            return new SuppressionScheduleResponse(endDate, endTime, recurrenceValues, startDate, startTime);
        }
    }
}
