// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.azurenative.containerinstance.inputs.ContainerExecArgs;
import com.pulumi.azurenative.containerinstance.inputs.ContainerHttpGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container probe, for liveness or readiness
 * 
 */
public final class ContainerProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerProbeArgs Empty = new ContainerProbeArgs();

    /**
     * The execution command to probe
     * 
     */
    @Import(name="exec")
    private @Nullable Output<ContainerExecArgs> exec;

    /**
     * @return The execution command to probe
     * 
     */
    public Optional<Output<ContainerExecArgs>> exec() {
        return Optional.ofNullable(this.exec);
    }

    /**
     * The failure threshold.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Integer> failureThreshold;

    /**
     * @return The failure threshold.
     * 
     */
    public Optional<Output<Integer>> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    /**
     * The Http Get settings to probe
     * 
     */
    @Import(name="httpGet")
    private @Nullable Output<ContainerHttpGetArgs> httpGet;

    /**
     * @return The Http Get settings to probe
     * 
     */
    public Optional<Output<ContainerHttpGetArgs>> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }

    /**
     * The initial delay seconds.
     * 
     */
    @Import(name="initialDelaySeconds")
    private @Nullable Output<Integer> initialDelaySeconds;

    /**
     * @return The initial delay seconds.
     * 
     */
    public Optional<Output<Integer>> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }

    /**
     * The period seconds.
     * 
     */
    @Import(name="periodSeconds")
    private @Nullable Output<Integer> periodSeconds;

    /**
     * @return The period seconds.
     * 
     */
    public Optional<Output<Integer>> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }

    /**
     * The success threshold.
     * 
     */
    @Import(name="successThreshold")
    private @Nullable Output<Integer> successThreshold;

    /**
     * @return The success threshold.
     * 
     */
    public Optional<Output<Integer>> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }

    /**
     * The timeout seconds.
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    /**
     * @return The timeout seconds.
     * 
     */
    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private ContainerProbeArgs() {}

    private ContainerProbeArgs(ContainerProbeArgs $) {
        this.exec = $.exec;
        this.failureThreshold = $.failureThreshold;
        this.httpGet = $.httpGet;
        this.initialDelaySeconds = $.initialDelaySeconds;
        this.periodSeconds = $.periodSeconds;
        this.successThreshold = $.successThreshold;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerProbeArgs $;

        public Builder() {
            $ = new ContainerProbeArgs();
        }

        public Builder(ContainerProbeArgs defaults) {
            $ = new ContainerProbeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exec The execution command to probe
         * 
         * @return builder
         * 
         */
        public Builder exec(@Nullable Output<ContainerExecArgs> exec) {
            $.exec = exec;
            return this;
        }

        /**
         * @param exec The execution command to probe
         * 
         * @return builder
         * 
         */
        public Builder exec(ContainerExecArgs exec) {
            return exec(Output.of(exec));
        }

        /**
         * @param failureThreshold The failure threshold.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * @param failureThreshold The failure threshold.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(Integer failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        /**
         * @param httpGet The Http Get settings to probe
         * 
         * @return builder
         * 
         */
        public Builder httpGet(@Nullable Output<ContainerHttpGetArgs> httpGet) {
            $.httpGet = httpGet;
            return this;
        }

        /**
         * @param httpGet The Http Get settings to probe
         * 
         * @return builder
         * 
         */
        public Builder httpGet(ContainerHttpGetArgs httpGet) {
            return httpGet(Output.of(httpGet));
        }

        /**
         * @param initialDelaySeconds The initial delay seconds.
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(@Nullable Output<Integer> initialDelaySeconds) {
            $.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * @param initialDelaySeconds The initial delay seconds.
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            return initialDelaySeconds(Output.of(initialDelaySeconds));
        }

        /**
         * @param periodSeconds The period seconds.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(@Nullable Output<Integer> periodSeconds) {
            $.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * @param periodSeconds The period seconds.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(Integer periodSeconds) {
            return periodSeconds(Output.of(periodSeconds));
        }

        /**
         * @param successThreshold The success threshold.
         * 
         * @return builder
         * 
         */
        public Builder successThreshold(@Nullable Output<Integer> successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        /**
         * @param successThreshold The success threshold.
         * 
         * @return builder
         * 
         */
        public Builder successThreshold(Integer successThreshold) {
            return successThreshold(Output.of(successThreshold));
        }

        /**
         * @param timeoutSeconds The timeout seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * @param timeoutSeconds The timeout seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        public ContainerProbeArgs build() {
            return $;
        }
    }

}
