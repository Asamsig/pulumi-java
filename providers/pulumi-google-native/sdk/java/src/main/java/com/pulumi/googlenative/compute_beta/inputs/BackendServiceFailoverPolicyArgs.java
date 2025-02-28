// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). On failover or failback, this field indicates whether connection draining will be honored. Google Cloud has a fixed connection draining timeout of 10 minutes. A setting of true terminates existing TCP connections to the active pool during failover and failback, immediately draining traffic. A setting of false allows existing TCP connections to persist, even on VMs no longer in the active pool, for up to the duration of the connection draining timeout (10 minutes).
 * 
 */
public final class BackendServiceFailoverPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceFailoverPolicyArgs Empty = new BackendServiceFailoverPolicyArgs();

    /**
     * This can be set to true only if the protocol is TCP. The default is false.
     * 
     */
    @Import(name="disableConnectionDrainOnFailover")
    private @Nullable Output<Boolean> disableConnectionDrainOnFailover;

    /**
     * @return This can be set to true only if the protocol is TCP. The default is false.
     * 
     */
    public Optional<Output<Boolean>> disableConnectionDrainOnFailover() {
        return Optional.ofNullable(this.disableConnectionDrainOnFailover);
    }

    /**
     * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * 
     */
    @Import(name="dropTrafficIfUnhealthy")
    private @Nullable Output<Boolean> dropTrafficIfUnhealthy;

    /**
     * @return If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * 
     */
    public Optional<Output<Boolean>> dropTrafficIfUnhealthy() {
        return Optional.ofNullable(this.dropTrafficIfUnhealthy);
    }

    /**
     * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
     */
    @Import(name="failoverRatio")
    private @Nullable Output<Double> failoverRatio;

    /**
     * @return The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
     */
    public Optional<Output<Double>> failoverRatio() {
        return Optional.ofNullable(this.failoverRatio);
    }

    private BackendServiceFailoverPolicyArgs() {}

    private BackendServiceFailoverPolicyArgs(BackendServiceFailoverPolicyArgs $) {
        this.disableConnectionDrainOnFailover = $.disableConnectionDrainOnFailover;
        this.dropTrafficIfUnhealthy = $.dropTrafficIfUnhealthy;
        this.failoverRatio = $.failoverRatio;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceFailoverPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceFailoverPolicyArgs $;

        public Builder() {
            $ = new BackendServiceFailoverPolicyArgs();
        }

        public Builder(BackendServiceFailoverPolicyArgs defaults) {
            $ = new BackendServiceFailoverPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableConnectionDrainOnFailover This can be set to true only if the protocol is TCP. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder disableConnectionDrainOnFailover(@Nullable Output<Boolean> disableConnectionDrainOnFailover) {
            $.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
            return this;
        }

        /**
         * @param disableConnectionDrainOnFailover This can be set to true only if the protocol is TCP. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder disableConnectionDrainOnFailover(Boolean disableConnectionDrainOnFailover) {
            return disableConnectionDrainOnFailover(Output.of(disableConnectionDrainOnFailover));
        }

        /**
         * @param dropTrafficIfUnhealthy If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
         * 
         * @return builder
         * 
         */
        public Builder dropTrafficIfUnhealthy(@Nullable Output<Boolean> dropTrafficIfUnhealthy) {
            $.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
            return this;
        }

        /**
         * @param dropTrafficIfUnhealthy If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
         * 
         * @return builder
         * 
         */
        public Builder dropTrafficIfUnhealthy(Boolean dropTrafficIfUnhealthy) {
            return dropTrafficIfUnhealthy(Output.of(dropTrafficIfUnhealthy));
        }

        /**
         * @param failoverRatio The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
         * 
         * @return builder
         * 
         */
        public Builder failoverRatio(@Nullable Output<Double> failoverRatio) {
            $.failoverRatio = failoverRatio;
            return this;
        }

        /**
         * @param failoverRatio The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
         * 
         * @return builder
         * 
         */
        public Builder failoverRatio(Double failoverRatio) {
            return failoverRatio(Output.of(failoverRatio));
        }

        public BackendServiceFailoverPolicyArgs build() {
            return $;
        }
    }

}
