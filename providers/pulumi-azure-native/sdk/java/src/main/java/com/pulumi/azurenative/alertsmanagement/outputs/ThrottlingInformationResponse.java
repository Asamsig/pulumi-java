// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThrottlingInformationResponse {
    /**
     * @return The required duration (in ISO8601 format) to wait before notifying on the alert rule again. The time granularity must be in minutes and minimum value is 0 minutes
     * 
     */
    private final @Nullable String duration;

    @CustomType.Constructor
    private ThrottlingInformationResponse(@CustomType.Parameter("duration") @Nullable String duration) {
        this.duration = duration;
    }

    /**
     * @return The required duration (in ISO8601 format) to wait before notifying on the alert rule again. The time granularity must be in minutes and minimum value is 0 minutes
     * 
     */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThrottlingInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String duration;

        public Builder() {
    	      // Empty
        }

        public Builder(ThrottlingInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }        public ThrottlingInformationResponse build() {
            return new ThrottlingInformationResponse(duration);
        }
    }
}
