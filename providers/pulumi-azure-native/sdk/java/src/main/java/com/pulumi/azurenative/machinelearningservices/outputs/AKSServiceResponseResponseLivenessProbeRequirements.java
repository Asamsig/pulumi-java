// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AKSServiceResponseResponseLivenessProbeRequirements {
    /**
     * @return The number of failures to allow before returning an unhealthy status.
     * 
     */
    private final @Nullable Integer failureThreshold;
    /**
     * @return The delay before the first probe in seconds.
     * 
     */
    private final @Nullable Integer initialDelaySeconds;
    /**
     * @return The length of time between probes in seconds.
     * 
     */
    private final @Nullable Integer periodSeconds;
    /**
     * @return The number of successful probes before returning a healthy status.
     * 
     */
    private final @Nullable Integer successThreshold;
    /**
     * @return The probe timeout in seconds.
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @CustomType.Constructor
    private AKSServiceResponseResponseLivenessProbeRequirements(
        @CustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold,
        @CustomType.Parameter("initialDelaySeconds") @Nullable Integer initialDelaySeconds,
        @CustomType.Parameter("periodSeconds") @Nullable Integer periodSeconds,
        @CustomType.Parameter("successThreshold") @Nullable Integer successThreshold,
        @CustomType.Parameter("timeoutSeconds") @Nullable Integer timeoutSeconds) {
        this.failureThreshold = failureThreshold;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * @return The number of failures to allow before returning an unhealthy status.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return The delay before the first probe in seconds.
     * 
     */
    public Optional<Integer> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    /**
     * @return The length of time between probes in seconds.
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * @return The number of successful probes before returning a healthy status.
     * 
     */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * @return The probe timeout in seconds.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceResponseResponseLivenessProbeRequirements defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failureThreshold;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceResponseResponseLivenessProbeRequirements defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Builder periodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Builder successThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }        public AKSServiceResponseResponseLivenessProbeRequirements build() {
            return new AKSServiceResponseResponseLivenessProbeRequirements(failureThreshold, initialDelaySeconds, periodSeconds, successThreshold, timeoutSeconds);
        }
    }
}
