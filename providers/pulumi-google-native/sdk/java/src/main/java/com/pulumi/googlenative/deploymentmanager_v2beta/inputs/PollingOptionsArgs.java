// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_v2beta.inputs.DiagnosticArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PollingOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PollingOptionsArgs Empty = new PollingOptionsArgs();

    /**
     * An array of diagnostics to be collected by Deployment Manager, these diagnostics will be displayed to the user.
     * 
     */
    @Import(name="diagnostics")
    private @Nullable Output<List<DiagnosticArgs>> diagnostics;

    /**
     * @return An array of diagnostics to be collected by Deployment Manager, these diagnostics will be displayed to the user.
     * 
     */
    public Optional<Output<List<DiagnosticArgs>>> diagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }

    /**
     * JsonPath expression that determines if the request failed.
     * 
     */
    @Import(name="failCondition")
    private @Nullable Output<String> failCondition;

    /**
     * @return JsonPath expression that determines if the request failed.
     * 
     */
    public Optional<Output<String>> failCondition() {
        return Optional.ofNullable(this.failCondition);
    }

    /**
     * JsonPath expression that determines if the request is completed.
     * 
     */
    @Import(name="finishCondition")
    private @Nullable Output<String> finishCondition;

    /**
     * @return JsonPath expression that determines if the request is completed.
     * 
     */
    public Optional<Output<String>> finishCondition() {
        return Optional.ofNullable(this.finishCondition);
    }

    /**
     * JsonPath expression that evaluates to string, it indicates where to poll.
     * 
     */
    @Import(name="pollingLink")
    private @Nullable Output<String> pollingLink;

    /**
     * @return JsonPath expression that evaluates to string, it indicates where to poll.
     * 
     */
    public Optional<Output<String>> pollingLink() {
        return Optional.ofNullable(this.pollingLink);
    }

    /**
     * JsonPath expression, after polling is completed, indicates where to fetch the resource.
     * 
     */
    @Import(name="targetLink")
    private @Nullable Output<String> targetLink;

    /**
     * @return JsonPath expression, after polling is completed, indicates where to fetch the resource.
     * 
     */
    public Optional<Output<String>> targetLink() {
        return Optional.ofNullable(this.targetLink);
    }

    private PollingOptionsArgs() {}

    private PollingOptionsArgs(PollingOptionsArgs $) {
        this.diagnostics = $.diagnostics;
        this.failCondition = $.failCondition;
        this.finishCondition = $.finishCondition;
        this.pollingLink = $.pollingLink;
        this.targetLink = $.targetLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PollingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PollingOptionsArgs $;

        public Builder() {
            $ = new PollingOptionsArgs();
        }

        public Builder(PollingOptionsArgs defaults) {
            $ = new PollingOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diagnostics An array of diagnostics to be collected by Deployment Manager, these diagnostics will be displayed to the user.
         * 
         * @return builder
         * 
         */
        public Builder diagnostics(@Nullable Output<List<DiagnosticArgs>> diagnostics) {
            $.diagnostics = diagnostics;
            return this;
        }

        /**
         * @param diagnostics An array of diagnostics to be collected by Deployment Manager, these diagnostics will be displayed to the user.
         * 
         * @return builder
         * 
         */
        public Builder diagnostics(List<DiagnosticArgs> diagnostics) {
            return diagnostics(Output.of(diagnostics));
        }

        /**
         * @param diagnostics An array of diagnostics to be collected by Deployment Manager, these diagnostics will be displayed to the user.
         * 
         * @return builder
         * 
         */
        public Builder diagnostics(DiagnosticArgs... diagnostics) {
            return diagnostics(List.of(diagnostics));
        }

        /**
         * @param failCondition JsonPath expression that determines if the request failed.
         * 
         * @return builder
         * 
         */
        public Builder failCondition(@Nullable Output<String> failCondition) {
            $.failCondition = failCondition;
            return this;
        }

        /**
         * @param failCondition JsonPath expression that determines if the request failed.
         * 
         * @return builder
         * 
         */
        public Builder failCondition(String failCondition) {
            return failCondition(Output.of(failCondition));
        }

        /**
         * @param finishCondition JsonPath expression that determines if the request is completed.
         * 
         * @return builder
         * 
         */
        public Builder finishCondition(@Nullable Output<String> finishCondition) {
            $.finishCondition = finishCondition;
            return this;
        }

        /**
         * @param finishCondition JsonPath expression that determines if the request is completed.
         * 
         * @return builder
         * 
         */
        public Builder finishCondition(String finishCondition) {
            return finishCondition(Output.of(finishCondition));
        }

        /**
         * @param pollingLink JsonPath expression that evaluates to string, it indicates where to poll.
         * 
         * @return builder
         * 
         */
        public Builder pollingLink(@Nullable Output<String> pollingLink) {
            $.pollingLink = pollingLink;
            return this;
        }

        /**
         * @param pollingLink JsonPath expression that evaluates to string, it indicates where to poll.
         * 
         * @return builder
         * 
         */
        public Builder pollingLink(String pollingLink) {
            return pollingLink(Output.of(pollingLink));
        }

        /**
         * @param targetLink JsonPath expression, after polling is completed, indicates where to fetch the resource.
         * 
         * @return builder
         * 
         */
        public Builder targetLink(@Nullable Output<String> targetLink) {
            $.targetLink = targetLink;
            return this;
        }

        /**
         * @param targetLink JsonPath expression, after polling is completed, indicates where to fetch the resource.
         * 
         * @return builder
         * 
         */
        public Builder targetLink(String targetLink) {
            return targetLink(Output.of(targetLink));
        }

        public PollingOptionsArgs build() {
            return $;
        }
    }

}
