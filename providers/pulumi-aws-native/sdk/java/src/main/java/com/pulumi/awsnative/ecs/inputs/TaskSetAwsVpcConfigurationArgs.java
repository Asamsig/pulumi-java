// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.enums.TaskSetAwsVpcConfigurationAssignPublicIp;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The VPC subnets and security groups associated with a task. All specified subnets and security groups must be from the same VPC.
 * 
 */
public final class TaskSetAwsVpcConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskSetAwsVpcConfigurationArgs Empty = new TaskSetAwsVpcConfigurationArgs();

    /**
     * Whether the task&#39;s elastic network interface receives a public IP address. The default value is DISABLED.
     * 
     */
    @Import(name="assignPublicIp")
    private @Nullable Output<TaskSetAwsVpcConfigurationAssignPublicIp> assignPublicIp;

    /**
     * @return Whether the task&#39;s elastic network interface receives a public IP address. The default value is DISABLED.
     * 
     */
    public Optional<Output<TaskSetAwsVpcConfigurationAssignPublicIp>> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }

    /**
     * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.
     * 
     */
    @Import(name="subnets", required=true)
    private Output<List<String>> subnets;

    /**
     * @return The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.
     * 
     */
    public Output<List<String>> subnets() {
        return this.subnets;
    }

    private TaskSetAwsVpcConfigurationArgs() {}

    private TaskSetAwsVpcConfigurationArgs(TaskSetAwsVpcConfigurationArgs $) {
        this.assignPublicIp = $.assignPublicIp;
        this.securityGroups = $.securityGroups;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskSetAwsVpcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSetAwsVpcConfigurationArgs $;

        public Builder() {
            $ = new TaskSetAwsVpcConfigurationArgs();
        }

        public Builder(TaskSetAwsVpcConfigurationArgs defaults) {
            $ = new TaskSetAwsVpcConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignPublicIp Whether the task&#39;s elastic network interface receives a public IP address. The default value is DISABLED.
         * 
         * @return builder
         * 
         */
        public Builder assignPublicIp(@Nullable Output<TaskSetAwsVpcConfigurationAssignPublicIp> assignPublicIp) {
            $.assignPublicIp = assignPublicIp;
            return this;
        }

        /**
         * @param assignPublicIp Whether the task&#39;s elastic network interface receives a public IP address. The default value is DISABLED.
         * 
         * @return builder
         * 
         */
        public Builder assignPublicIp(TaskSetAwsVpcConfigurationAssignPublicIp assignPublicIp) {
            return assignPublicIp(Output.of(assignPublicIp));
        }

        /**
         * @param securityGroups The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param subnets The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder subnets(Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        public TaskSetAwsVpcConfigurationArgs build() {
            $.subnets = Objects.requireNonNull($.subnets, "expected parameter 'subnets' to be non-null");
            return $;
        }
    }

}
