// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscaleCapacityResponse {
    /**
     * @return The maximum instance count of the cluster
     * 
     */
    private final @Nullable Integer maxInstanceCount;
    /**
     * @return The minimum instance count of the cluster
     * 
     */
    private final @Nullable Integer minInstanceCount;

    @CustomType.Constructor
    private AutoscaleCapacityResponse(
        @CustomType.Parameter("maxInstanceCount") @Nullable Integer maxInstanceCount,
        @CustomType.Parameter("minInstanceCount") @Nullable Integer minInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
        this.minInstanceCount = minInstanceCount;
    }

    /**
     * @return The maximum instance count of the cluster
     * 
     */
    public Optional<Integer> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }
    /**
     * @return The minimum instance count of the cluster
     * 
     */
    public Optional<Integer> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxInstanceCount;
        private @Nullable Integer minInstanceCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.minInstanceCount = defaults.minInstanceCount;
        }

        public Builder maxInstanceCount(@Nullable Integer maxInstanceCount) {
            this.maxInstanceCount = maxInstanceCount;
            return this;
        }
        public Builder minInstanceCount(@Nullable Integer minInstanceCount) {
            this.minInstanceCount = minInstanceCount;
            return this;
        }        public AutoscaleCapacityResponse build() {
            return new AutoscaleCapacityResponse(maxInstanceCount, minInstanceCount);
        }
    }
}
