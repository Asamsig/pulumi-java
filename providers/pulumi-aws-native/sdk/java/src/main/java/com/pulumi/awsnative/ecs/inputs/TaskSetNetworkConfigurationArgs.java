// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.inputs.TaskSetAwsVpcConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object representing the network configuration for a task or service.
 * 
 */
public final class TaskSetNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskSetNetworkConfigurationArgs Empty = new TaskSetNetworkConfigurationArgs();

    @Import(name="awsVpcConfiguration")
    private @Nullable Output<TaskSetAwsVpcConfigurationArgs> awsVpcConfiguration;

    public Optional<Output<TaskSetAwsVpcConfigurationArgs>> awsVpcConfiguration() {
        return Optional.ofNullable(this.awsVpcConfiguration);
    }

    private TaskSetNetworkConfigurationArgs() {}

    private TaskSetNetworkConfigurationArgs(TaskSetNetworkConfigurationArgs $) {
        this.awsVpcConfiguration = $.awsVpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskSetNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSetNetworkConfigurationArgs $;

        public Builder() {
            $ = new TaskSetNetworkConfigurationArgs();
        }

        public Builder(TaskSetNetworkConfigurationArgs defaults) {
            $ = new TaskSetNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsVpcConfiguration(@Nullable Output<TaskSetAwsVpcConfigurationArgs> awsVpcConfiguration) {
            $.awsVpcConfiguration = awsVpcConfiguration;
            return this;
        }

        public Builder awsVpcConfiguration(TaskSetAwsVpcConfigurationArgs awsVpcConfiguration) {
            return awsVpcConfiguration(Output.of(awsVpcConfiguration));
        }

        public TaskSetNetworkConfigurationArgs build() {
            return $;
        }
    }

}
