// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.coordination.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LeaseSpec {
    /**
     * @return acquireTime is a time when the current lease was acquired.
     * 
     */
    private final @Nullable String acquireTime;
    /**
     * @return holderIdentity contains the identity of the holder of a current lease.
     * 
     */
    private final @Nullable String holderIdentity;
    /**
     * @return leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
     * 
     */
    private final @Nullable Integer leaseDurationSeconds;
    /**
     * @return leaseTransitions is the number of transitions of a lease between holders.
     * 
     */
    private final @Nullable Integer leaseTransitions;
    /**
     * @return renewTime is a time when the current holder of a lease has last updated the lease.
     * 
     */
    private final @Nullable String renewTime;

    @CustomType.Constructor
    private LeaseSpec(
        @CustomType.Parameter("acquireTime") @Nullable String acquireTime,
        @CustomType.Parameter("holderIdentity") @Nullable String holderIdentity,
        @CustomType.Parameter("leaseDurationSeconds") @Nullable Integer leaseDurationSeconds,
        @CustomType.Parameter("leaseTransitions") @Nullable Integer leaseTransitions,
        @CustomType.Parameter("renewTime") @Nullable String renewTime) {
        this.acquireTime = acquireTime;
        this.holderIdentity = holderIdentity;
        this.leaseDurationSeconds = leaseDurationSeconds;
        this.leaseTransitions = leaseTransitions;
        this.renewTime = renewTime;
    }

    /**
     * @return acquireTime is a time when the current lease was acquired.
     * 
     */
    public Optional<String> acquireTime() {
        return Optional.ofNullable(this.acquireTime);
    }
    /**
     * @return holderIdentity contains the identity of the holder of a current lease.
     * 
     */
    public Optional<String> holderIdentity() {
        return Optional.ofNullable(this.holderIdentity);
    }
    /**
     * @return leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
     * 
     */
    public Optional<Integer> leaseDurationSeconds() {
        return Optional.ofNullable(this.leaseDurationSeconds);
    }
    /**
     * @return leaseTransitions is the number of transitions of a lease between holders.
     * 
     */
    public Optional<Integer> leaseTransitions() {
        return Optional.ofNullable(this.leaseTransitions);
    }
    /**
     * @return renewTime is a time when the current holder of a lease has last updated the lease.
     * 
     */
    public Optional<String> renewTime() {
        return Optional.ofNullable(this.renewTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LeaseSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acquireTime;
        private @Nullable String holderIdentity;
        private @Nullable Integer leaseDurationSeconds;
        private @Nullable Integer leaseTransitions;
        private @Nullable String renewTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LeaseSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acquireTime = defaults.acquireTime;
    	      this.holderIdentity = defaults.holderIdentity;
    	      this.leaseDurationSeconds = defaults.leaseDurationSeconds;
    	      this.leaseTransitions = defaults.leaseTransitions;
    	      this.renewTime = defaults.renewTime;
        }

        public Builder acquireTime(@Nullable String acquireTime) {
            this.acquireTime = acquireTime;
            return this;
        }
        public Builder holderIdentity(@Nullable String holderIdentity) {
            this.holderIdentity = holderIdentity;
            return this;
        }
        public Builder leaseDurationSeconds(@Nullable Integer leaseDurationSeconds) {
            this.leaseDurationSeconds = leaseDurationSeconds;
            return this;
        }
        public Builder leaseTransitions(@Nullable Integer leaseTransitions) {
            this.leaseTransitions = leaseTransitions;
            return this;
        }
        public Builder renewTime(@Nullable String renewTime) {
            this.renewTime = renewTime;
            return this;
        }        public LeaseSpec build() {
            return new LeaseSpec(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, renewTime);
        }
    }
}
