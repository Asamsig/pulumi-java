// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExportRecurrencePeriodResponse {
    /**
     * @return The start date of recurrence.
     * 
     */
    private final String from;
    /**
     * @return The end date of recurrence.
     * 
     */
    private final @Nullable String to;

    @CustomType.Constructor
    private ExportRecurrencePeriodResponse(
        @CustomType.Parameter("from") String from,
        @CustomType.Parameter("to") @Nullable String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * @return The start date of recurrence.
     * 
     */
    public String from() {
        return this.from;
    }
    /**
     * @return The end date of recurrence.
     * 
     */
    public Optional<String> to() {
        return Optional.ofNullable(this.to);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportRecurrencePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String from;
        private @Nullable String to;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportRecurrencePeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(String from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }
        public Builder to(@Nullable String to) {
            this.to = to;
            return this;
        }        public ExportRecurrencePeriodResponse build() {
            return new ExportRecurrencePeriodResponse(from, to);
        }
    }
}
