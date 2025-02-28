// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetNetworkConfigurationArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetPlacementConstraintArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventTargetEcsTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventTargetEcsTargetArgs Empty = new EventTargetEcsTargetArgs();

    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     * 
     */
    @Import(name="enableEcsManagedTags")
    private @Nullable Output<Boolean> enableEcsManagedTags;

    /**
     * @return Specifies whether to enable Amazon ECS managed tags for the task.
     * 
     */
    public Optional<Output<Boolean>> enableEcsManagedTags() {
        return Optional.ofNullable(this.enableEcsManagedTags);
    }

    /**
     * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables execute command functionality on all containers in the task.
     * 
     */
    @Import(name="enableExecuteCommand")
    private @Nullable Output<Boolean> enableExecuteCommand;

    /**
     * @return Whether or not to enable the execute command functionality for the containers in this task. If true, this enables execute command functionality on all containers in the task.
     * 
     */
    public Optional<Output<Boolean>> enableExecuteCommand() {
        return Optional.ofNullable(this.enableExecuteCommand);
    }

    /**
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return Specifies an ECS task group for the task. The maximum length is 255 characters.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values include: an empty string `&#34;&#34;` (to specify no launch type), `EC2`, or `FARGATE`.
     * 
     */
    @Import(name="launchType")
    private @Nullable Output<String> launchType;

    /**
     * @return Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values include: an empty string `&#34;&#34;` (to specify no launch type), `EC2`, or `FARGATE`.
     * 
     */
    public Optional<Output<String>> launchType() {
        return Optional.ofNullable(this.launchType);
    }

    /**
     * Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launch_type is FARGATE because the awsvpc mode is required for Fargate tasks.
     * 
     */
    @Import(name="networkConfiguration")
    private @Nullable Output<EventTargetEcsTargetNetworkConfigurationArgs> networkConfiguration;

    /**
     * @return Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launch_type is FARGATE because the awsvpc mode is required for Fargate tasks.
     * 
     */
    public Optional<Output<EventTargetEcsTargetNetworkConfigurationArgs>> networkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }

    /**
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
     * 
     */
    @Import(name="placementConstraints")
    private @Nullable Output<List<EventTargetEcsTargetPlacementConstraintArgs>> placementConstraints;

    /**
     * @return An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
     * 
     */
    public Optional<Output<List<EventTargetEcsTargetPlacementConstraintArgs>>> placementConstraints() {
        return Optional.ofNullable(this.placementConstraints);
    }

    /**
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @Import(name="platformVersion")
    private @Nullable Output<String> platformVersion;

    /**
     * @return Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    public Optional<Output<String>> platformVersion() {
        return Optional.ofNullable(this.platformVersion);
    }

    /**
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation.
     * 
     */
    @Import(name="propagateTags")
    private @Nullable Output<String> propagateTags;

    /**
     * @return Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation.
     * 
     */
    public Optional<Output<String>> propagateTags() {
        return Optional.ofNullable(this.propagateTags);
    }

    /**
     * A map of tags to assign to ecs resources.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to ecs resources.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The number of tasks to create based on the TaskDefinition. The default is 1.
     * 
     */
    @Import(name="taskCount")
    private @Nullable Output<Integer> taskCount;

    /**
     * @return The number of tasks to create based on the TaskDefinition. The default is 1.
     * 
     */
    public Optional<Output<Integer>> taskCount() {
        return Optional.ofNullable(this.taskCount);
    }

    /**
     * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * 
     */
    @Import(name="taskDefinitionArn", required=true)
    private Output<String> taskDefinitionArn;

    /**
     * @return The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * 
     */
    public Output<String> taskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    private EventTargetEcsTargetArgs() {}

    private EventTargetEcsTargetArgs(EventTargetEcsTargetArgs $) {
        this.enableEcsManagedTags = $.enableEcsManagedTags;
        this.enableExecuteCommand = $.enableExecuteCommand;
        this.group = $.group;
        this.launchType = $.launchType;
        this.networkConfiguration = $.networkConfiguration;
        this.placementConstraints = $.placementConstraints;
        this.platformVersion = $.platformVersion;
        this.propagateTags = $.propagateTags;
        this.tags = $.tags;
        this.taskCount = $.taskCount;
        this.taskDefinitionArn = $.taskDefinitionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventTargetEcsTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventTargetEcsTargetArgs $;

        public Builder() {
            $ = new EventTargetEcsTargetArgs();
        }

        public Builder(EventTargetEcsTargetArgs defaults) {
            $ = new EventTargetEcsTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
         * 
         * @return builder
         * 
         */
        public Builder enableEcsManagedTags(@Nullable Output<Boolean> enableEcsManagedTags) {
            $.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }

        /**
         * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the task.
         * 
         * @return builder
         * 
         */
        public Builder enableEcsManagedTags(Boolean enableEcsManagedTags) {
            return enableEcsManagedTags(Output.of(enableEcsManagedTags));
        }

        /**
         * @param enableExecuteCommand Whether or not to enable the execute command functionality for the containers in this task. If true, this enables execute command functionality on all containers in the task.
         * 
         * @return builder
         * 
         */
        public Builder enableExecuteCommand(@Nullable Output<Boolean> enableExecuteCommand) {
            $.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        /**
         * @param enableExecuteCommand Whether or not to enable the execute command functionality for the containers in this task. If true, this enables execute command functionality on all containers in the task.
         * 
         * @return builder
         * 
         */
        public Builder enableExecuteCommand(Boolean enableExecuteCommand) {
            return enableExecuteCommand(Output.of(enableExecuteCommand));
        }

        /**
         * @param group Specifies an ECS task group for the task. The maximum length is 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group Specifies an ECS task group for the task. The maximum length is 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param launchType Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values include: an empty string `&#34;&#34;` (to specify no launch type), `EC2`, or `FARGATE`.
         * 
         * @return builder
         * 
         */
        public Builder launchType(@Nullable Output<String> launchType) {
            $.launchType = launchType;
            return this;
        }

        /**
         * @param launchType Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values include: an empty string `&#34;&#34;` (to specify no launch type), `EC2`, or `FARGATE`.
         * 
         * @return builder
         * 
         */
        public Builder launchType(String launchType) {
            return launchType(Output.of(launchType));
        }

        /**
         * @param networkConfiguration Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launch_type is FARGATE because the awsvpc mode is required for Fargate tasks.
         * 
         * @return builder
         * 
         */
        public Builder networkConfiguration(@Nullable Output<EventTargetEcsTargetNetworkConfigurationArgs> networkConfiguration) {
            $.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * @param networkConfiguration Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launch_type is FARGATE because the awsvpc mode is required for Fargate tasks.
         * 
         * @return builder
         * 
         */
        public Builder networkConfiguration(EventTargetEcsTargetNetworkConfigurationArgs networkConfiguration) {
            return networkConfiguration(Output.of(networkConfiguration));
        }

        /**
         * @param placementConstraints An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
         * 
         * @return builder
         * 
         */
        public Builder placementConstraints(@Nullable Output<List<EventTargetEcsTargetPlacementConstraintArgs>> placementConstraints) {
            $.placementConstraints = placementConstraints;
            return this;
        }

        /**
         * @param placementConstraints An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
         * 
         * @return builder
         * 
         */
        public Builder placementConstraints(List<EventTargetEcsTargetPlacementConstraintArgs> placementConstraints) {
            return placementConstraints(Output.of(placementConstraints));
        }

        /**
         * @param placementConstraints An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
         * 
         * @return builder
         * 
         */
        public Builder placementConstraints(EventTargetEcsTargetPlacementConstraintArgs... placementConstraints) {
            return placementConstraints(List.of(placementConstraints));
        }

        /**
         * @param platformVersion Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
         * 
         * @return builder
         * 
         */
        public Builder platformVersion(@Nullable Output<String> platformVersion) {
            $.platformVersion = platformVersion;
            return this;
        }

        /**
         * @param platformVersion Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
         * 
         * @return builder
         * 
         */
        public Builder platformVersion(String platformVersion) {
            return platformVersion(Output.of(platformVersion));
        }

        /**
         * @param propagateTags Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation.
         * 
         * @return builder
         * 
         */
        public Builder propagateTags(@Nullable Output<String> propagateTags) {
            $.propagateTags = propagateTags;
            return this;
        }

        /**
         * @param propagateTags Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation.
         * 
         * @return builder
         * 
         */
        public Builder propagateTags(String propagateTags) {
            return propagateTags(Output.of(propagateTags));
        }

        /**
         * @param tags A map of tags to assign to ecs resources.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to ecs resources.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param taskCount The number of tasks to create based on the TaskDefinition. The default is 1.
         * 
         * @return builder
         * 
         */
        public Builder taskCount(@Nullable Output<Integer> taskCount) {
            $.taskCount = taskCount;
            return this;
        }

        /**
         * @param taskCount The number of tasks to create based on the TaskDefinition. The default is 1.
         * 
         * @return builder
         * 
         */
        public Builder taskCount(Integer taskCount) {
            return taskCount(Output.of(taskCount));
        }

        /**
         * @param taskDefinitionArn The ARN of the task definition to use if the event target is an Amazon ECS cluster.
         * 
         * @return builder
         * 
         */
        public Builder taskDefinitionArn(Output<String> taskDefinitionArn) {
            $.taskDefinitionArn = taskDefinitionArn;
            return this;
        }

        /**
         * @param taskDefinitionArn The ARN of the task definition to use if the event target is an Amazon ECS cluster.
         * 
         * @return builder
         * 
         */
        public Builder taskDefinitionArn(String taskDefinitionArn) {
            return taskDefinitionArn(Output.of(taskDefinitionArn));
        }

        public EventTargetEcsTargetArgs build() {
            $.taskDefinitionArn = Objects.requireNonNull($.taskDefinitionArn, "expected parameter 'taskDefinitionArn' to be non-null");
            return $;
        }
    }

}
