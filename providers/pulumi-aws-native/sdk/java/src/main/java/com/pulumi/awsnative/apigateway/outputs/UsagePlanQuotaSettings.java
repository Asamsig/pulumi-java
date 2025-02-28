// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UsagePlanQuotaSettings {
    /**
     * @return The maximum number of requests that users can make within the specified time period.
     * 
     */
    private final @Nullable Integer limit;
    /**
     * @return For the initial time period, the number of requests to subtract from the specified limit. When you first implement a usage plan, the plan might start in the middle of the week or month. With this property, you can decrease the limit for this initial time period.
     * 
     */
    private final @Nullable Integer offset;
    /**
     * @return The time period for which the maximum limit of requests applies, such as DAY or WEEK. For valid values, see the period property for the UsagePlan resource in the Amazon API Gateway REST API Reference.
     * 
     */
    private final @Nullable String period;

    @CustomType.Constructor
    private UsagePlanQuotaSettings(
        @CustomType.Parameter("limit") @Nullable Integer limit,
        @CustomType.Parameter("offset") @Nullable Integer offset,
        @CustomType.Parameter("period") @Nullable String period) {
        this.limit = limit;
        this.offset = offset;
        this.period = period;
    }

    /**
     * @return The maximum number of requests that users can make within the specified time period.
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return For the initial time period, the number of requests to subtract from the specified limit. When you first implement a usage plan, the plan might start in the middle of the week or month. With this property, you can decrease the limit for this initial time period.
     * 
     */
    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }
    /**
     * @return The time period for which the maximum limit of requests applies, such as DAY or WEEK. For valid values, see the period property for the UsagePlan resource in the Amazon API Gateway REST API Reference.
     * 
     */
    public Optional<String> period() {
        return Optional.ofNullable(this.period);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanQuotaSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer limit;
        private @Nullable Integer offset;
        private @Nullable String period;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanQuotaSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.offset = defaults.offset;
    	      this.period = defaults.period;
        }

        public Builder limit(@Nullable Integer limit) {
            this.limit = limit;
            return this;
        }
        public Builder offset(@Nullable Integer offset) {
            this.offset = offset;
            return this;
        }
        public Builder period(@Nullable String period) {
            this.period = period;
            return this;
        }        public UsagePlanQuotaSettings build() {
            return new UsagePlanQuotaSettings(limit, offset, period);
        }
    }
}
