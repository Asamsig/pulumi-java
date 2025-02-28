// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.cloudformation.StackSetArgs;
import com.pulumi.awsnative.cloudformation.enums.StackSetCallAs;
import com.pulumi.awsnative.cloudformation.enums.StackSetCapability;
import com.pulumi.awsnative.cloudformation.enums.StackSetPermissionModel;
import com.pulumi.awsnative.cloudformation.outputs.ManagedExecutionProperties;
import com.pulumi.awsnative.cloudformation.outputs.StackSetAutoDeployment;
import com.pulumi.awsnative.cloudformation.outputs.StackSetOperationPreferences;
import com.pulumi.awsnative.cloudformation.outputs.StackSetParameter;
import com.pulumi.awsnative.cloudformation.outputs.StackSetStackInstances;
import com.pulumi.awsnative.cloudformation.outputs.StackSetTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * StackSet as a resource provides one-click experience for provisioning a StackSet and StackInstances
 * 
 */
@ResourceType(type="aws-native:cloudformation:StackSet")
public class StackSet extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Number (ARN) of the IAM role to use to create this stack set. Specify an IAM role only if you are using customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account.
     * 
     */
    @Export(name="administrationRoleARN", type=String.class, parameters={})
    private Output</* @Nullable */ String> administrationRoleARN;

    /**
     * @return The Amazon Resource Number (ARN) of the IAM role to use to create this stack set. Specify an IAM role only if you are using customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account.
     * 
     */
    public Output<Optional<String>> administrationRoleARN() {
        return Codegen.optional(this.administrationRoleARN);
    }
    /**
     * Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to the target organization or organizational unit (OU). Specify only if PermissionModel is SERVICE_MANAGED.
     * 
     */
    @Export(name="autoDeployment", type=StackSetAutoDeployment.class, parameters={})
    private Output</* @Nullable */ StackSetAutoDeployment> autoDeployment;

    /**
     * @return Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to the target organization or organizational unit (OU). Specify only if PermissionModel is SERVICE_MANAGED.
     * 
     */
    public Output<Optional<StackSetAutoDeployment>> autoDeployment() {
        return Codegen.optional(this.autoDeployment);
    }
    /**
     * Specifies the AWS account that you are acting from. By default, SELF is specified. For self-managed permissions, specify SELF; for service-managed permissions, if you are signed in to the organization&#39;s management account, specify SELF. If you are signed in to a delegated administrator account, specify DELEGATED_ADMIN.
     * 
     */
    @Export(name="callAs", type=StackSetCallAs.class, parameters={})
    private Output</* @Nullable */ StackSetCallAs> callAs;

    /**
     * @return Specifies the AWS account that you are acting from. By default, SELF is specified. For self-managed permissions, specify SELF; for service-managed permissions, if you are signed in to the organization&#39;s management account, specify SELF. If you are signed in to a delegated administrator account, specify DELEGATED_ADMIN.
     * 
     */
    public Output<Optional<StackSetCallAs>> callAs() {
        return Codegen.optional(this.callAs);
    }
    /**
     * In some cases, you must explicitly acknowledge that your stack set template contains certain capabilities in order for AWS CloudFormation to create the stack set and related stack instances.
     * 
     */
    @Export(name="capabilities", type=List.class, parameters={StackSetCapability.class})
    private Output</* @Nullable */ List<StackSetCapability>> capabilities;

    /**
     * @return In some cases, you must explicitly acknowledge that your stack set template contains certain capabilities in order for AWS CloudFormation to create the stack set and related stack instances.
     * 
     */
    public Output<Optional<List<StackSetCapability>>> capabilities() {
        return Codegen.optional(this.capabilities);
    }
    /**
     * A description of the stack set. You can use the description to identify the stack set&#39;s purpose or other important information.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the stack set. You can use the description to identify the stack set&#39;s purpose or other important information.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the IAM execution role to use to create the stack set. If you do not specify an execution role, AWS CloudFormation uses the AWSCloudFormationStackSetExecutionRole role for the stack set operation.
     * 
     */
    @Export(name="executionRoleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> executionRoleName;

    /**
     * @return The name of the IAM execution role to use to create the stack set. If you do not specify an execution role, AWS CloudFormation uses the AWSCloudFormationStackSetExecutionRole role for the stack set operation.
     * 
     */
    public Output<Optional<String>> executionRoleName() {
        return Codegen.optional(this.executionRoleName);
    }
    /**
     * Describes whether StackSets performs non-conflicting operations concurrently and queues conflicting operations.
     * 
     */
    @Export(name="managedExecution", type=ManagedExecutionProperties.class, parameters={})
    private Output</* @Nullable */ ManagedExecutionProperties> managedExecution;

    /**
     * @return Describes whether StackSets performs non-conflicting operations concurrently and queues conflicting operations.
     * 
     */
    public Output<Optional<ManagedExecutionProperties>> managedExecution() {
        return Codegen.optional(this.managedExecution);
    }
    @Export(name="operationPreferences", type=StackSetOperationPreferences.class, parameters={})
    private Output</* @Nullable */ StackSetOperationPreferences> operationPreferences;

    public Output<Optional<StackSetOperationPreferences>> operationPreferences() {
        return Codegen.optional(this.operationPreferences);
    }
    /**
     * The input parameters for the stack set template.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={StackSetParameter.class})
    private Output</* @Nullable */ List<StackSetParameter>> parameters;

    /**
     * @return The input parameters for the stack set template.
     * 
     */
    public Output<Optional<List<StackSetParameter>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * Describes how the IAM roles required for stack set operations are created. By default, SELF-MANAGED is specified.
     * 
     */
    @Export(name="permissionModel", type=StackSetPermissionModel.class, parameters={})
    private Output<StackSetPermissionModel> permissionModel;

    /**
     * @return Describes how the IAM roles required for stack set operations are created. By default, SELF-MANAGED is specified.
     * 
     */
    public Output<StackSetPermissionModel> permissionModel() {
        return this.permissionModel;
    }
    /**
     * A group of stack instances with parameters in some specific accounts and regions.
     * 
     */
    @Export(name="stackInstancesGroup", type=List.class, parameters={StackSetStackInstances.class})
    private Output</* @Nullable */ List<StackSetStackInstances>> stackInstancesGroup;

    /**
     * @return A group of stack instances with parameters in some specific accounts and regions.
     * 
     */
    public Output<Optional<List<StackSetStackInstances>>> stackInstancesGroup() {
        return Codegen.optional(this.stackInstancesGroup);
    }
    /**
     * The ID of the stack set that you&#39;re creating.
     * 
     */
    @Export(name="stackSetId", type=String.class, parameters={})
    private Output<String> stackSetId;

    /**
     * @return The ID of the stack set that you&#39;re creating.
     * 
     */
    public Output<String> stackSetId() {
        return this.stackSetId;
    }
    /**
     * The name to associate with the stack set. The name must be unique in the Region where you create your stack set.
     * 
     */
    @Export(name="stackSetName", type=String.class, parameters={})
    private Output<String> stackSetName;

    /**
     * @return The name to associate with the stack set. The name must be unique in the Region where you create your stack set.
     * 
     */
    public Output<String> stackSetName() {
        return this.stackSetName;
    }
    /**
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be specified.
     * 
     */
    @Export(name="tags", type=List.class, parameters={StackSetTag.class})
    private Output</* @Nullable */ List<StackSetTag>> tags;

    /**
     * @return The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be specified.
     * 
     */
    public Output<Optional<List<StackSetTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200 bytes.
     * 
     */
    @Export(name="templateBody", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateBody;

    /**
     * @return The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200 bytes.
     * 
     */
    public Output<Optional<String>> templateBody() {
        return Codegen.optional(this.templateBody);
    }
    /**
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket.
     * 
     */
    @Export(name="templateURL", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateURL;

    /**
     * @return Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket.
     * 
     */
    public Output<Optional<String>> templateURL() {
        return Codegen.optional(this.templateURL);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StackSet(String name) {
        this(name, StackSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StackSet(String name, StackSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StackSet(String name, StackSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:StackSet", name, args == null ? StackSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StackSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:StackSet", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StackSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StackSet(name, id, options);
    }
}
