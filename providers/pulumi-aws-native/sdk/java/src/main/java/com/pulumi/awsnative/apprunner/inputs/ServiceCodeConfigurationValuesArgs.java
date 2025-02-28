// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.awsnative.apprunner.enums.ServiceCodeConfigurationValuesRuntime;
import com.pulumi.awsnative.apprunner.inputs.ServiceKeyValuePairArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Code Configuration Values
 * 
 */
public final class ServiceCodeConfigurationValuesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceCodeConfigurationValuesArgs Empty = new ServiceCodeConfigurationValuesArgs();

    /**
     * Build Command
     * 
     */
    @Import(name="buildCommand")
    private @Nullable Output<String> buildCommand;

    /**
     * @return Build Command
     * 
     */
    public Optional<Output<String>> buildCommand() {
        return Optional.ofNullable(this.buildCommand);
    }

    /**
     * Port
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return Port
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Runtime
     * 
     */
    @Import(name="runtime", required=true)
    private Output<ServiceCodeConfigurationValuesRuntime> runtime;

    /**
     * @return Runtime
     * 
     */
    public Output<ServiceCodeConfigurationValuesRuntime> runtime() {
        return this.runtime;
    }

    @Import(name="runtimeEnvironmentVariables")
    private @Nullable Output<List<ServiceKeyValuePairArgs>> runtimeEnvironmentVariables;

    public Optional<Output<List<ServiceKeyValuePairArgs>>> runtimeEnvironmentVariables() {
        return Optional.ofNullable(this.runtimeEnvironmentVariables);
    }

    /**
     * Start Command
     * 
     */
    @Import(name="startCommand")
    private @Nullable Output<String> startCommand;

    /**
     * @return Start Command
     * 
     */
    public Optional<Output<String>> startCommand() {
        return Optional.ofNullable(this.startCommand);
    }

    private ServiceCodeConfigurationValuesArgs() {}

    private ServiceCodeConfigurationValuesArgs(ServiceCodeConfigurationValuesArgs $) {
        this.buildCommand = $.buildCommand;
        this.port = $.port;
        this.runtime = $.runtime;
        this.runtimeEnvironmentVariables = $.runtimeEnvironmentVariables;
        this.startCommand = $.startCommand;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceCodeConfigurationValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceCodeConfigurationValuesArgs $;

        public Builder() {
            $ = new ServiceCodeConfigurationValuesArgs();
        }

        public Builder(ServiceCodeConfigurationValuesArgs defaults) {
            $ = new ServiceCodeConfigurationValuesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildCommand Build Command
         * 
         * @return builder
         * 
         */
        public Builder buildCommand(@Nullable Output<String> buildCommand) {
            $.buildCommand = buildCommand;
            return this;
        }

        /**
         * @param buildCommand Build Command
         * 
         * @return builder
         * 
         */
        public Builder buildCommand(String buildCommand) {
            return buildCommand(Output.of(buildCommand));
        }

        /**
         * @param port Port
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param runtime Runtime
         * 
         * @return builder
         * 
         */
        public Builder runtime(Output<ServiceCodeConfigurationValuesRuntime> runtime) {
            $.runtime = runtime;
            return this;
        }

        /**
         * @param runtime Runtime
         * 
         * @return builder
         * 
         */
        public Builder runtime(ServiceCodeConfigurationValuesRuntime runtime) {
            return runtime(Output.of(runtime));
        }

        public Builder runtimeEnvironmentVariables(@Nullable Output<List<ServiceKeyValuePairArgs>> runtimeEnvironmentVariables) {
            $.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
            return this;
        }

        public Builder runtimeEnvironmentVariables(List<ServiceKeyValuePairArgs> runtimeEnvironmentVariables) {
            return runtimeEnvironmentVariables(Output.of(runtimeEnvironmentVariables));
        }

        public Builder runtimeEnvironmentVariables(ServiceKeyValuePairArgs... runtimeEnvironmentVariables) {
            return runtimeEnvironmentVariables(List.of(runtimeEnvironmentVariables));
        }

        /**
         * @param startCommand Start Command
         * 
         * @return builder
         * 
         */
        public Builder startCommand(@Nullable Output<String> startCommand) {
            $.startCommand = startCommand;
            return this;
        }

        /**
         * @param startCommand Start Command
         * 
         * @return builder
         * 
         */
        public Builder startCommand(String startCommand) {
            return startCommand(Output.of(startCommand));
        }

        public ServiceCodeConfigurationValuesArgs build() {
            $.runtime = Objects.requireNonNull($.runtime, "expected parameter 'runtime' to be non-null");
            return $;
        }
    }

}
