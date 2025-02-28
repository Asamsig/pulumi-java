// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.management.GroupTemplateDeploymentArgs;
import com.pulumi.azure.management.inputs.GroupTemplateDeploymentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Template Deployment at a Management Group Scope.
 * 
 * &gt; **Note:** Deleting a Deployment at the Management Group Scope will not delete any resources created by the deployment.
 * 
 * &gt; **Note:** Deployments to a Management Group are always Incrementally applied. Existing resources that are not part of the template will not be removed.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var exampleGroup = Output.of(ManagementFunctions.getGroup(GetGroupArgs.builder()
 *             .name(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .build()));
 * 
 *         var exampleGroupTemplateDeployment = new GroupTemplateDeployment(&#34;exampleGroupTemplateDeployment&#34;, GroupTemplateDeploymentArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .managementGroupId(exampleGroup.apply(getGroupResult -&gt; getGroupResult.getId()))
 *             .templateContent(&#34;&#34;&#34;
 * {
 *   &#34;$schema&#34;: &#34;https://schema.management.azure.com/schemas/2019-04-01/deploymentTemplate.json#&#34;,
 *   &#34;contentVersion&#34;: &#34;1.0.0.0&#34;,
 *   &#34;parameters&#34;: {
 *     &#34;policyAssignmentName&#34;: {
 *       &#34;type&#34;: &#34;string&#34;,
 *       &#34;defaultValue&#34;: &#34;[guid(parameters(&#39;policyDefinitionID&#39;), resourceGroup().name)]&#34;,
 *       &#34;metadata&#34;: {
 *         &#34;description&#34;: &#34;Specifies the name of the policy assignment, can be used defined or an idempotent name as the defaultValue provides.&#34;
 *       }
 *     },
 *     &#34;policyDefinitionID&#34;: {
 *       &#34;type&#34;: &#34;string&#34;,
 *       &#34;metadata&#34;: {
 *         &#34;description&#34;: &#34;Specifies the ID of the policy definition or policy set definition being assigned.&#34;
 *       }
 *     }
 *   },
 *   &#34;resources&#34;: [
 *     {
 *       &#34;type&#34;: &#34;Microsoft.Authorization/policyAssignments&#34;,
 *       &#34;name&#34;: &#34;[parameters(&#39;policyAssignmentName&#39;)]&#34;,
 *       &#34;apiVersion&#34;: &#34;2019-09-01&#34;,
 *       &#34;properties&#34;: {
 *         &#34;scope&#34;: &#34;[subscriptionResourceId(&#39;Microsoft.Resources/resourceGroups&#39;, resourceGroup().name)]&#34;,
 *         &#34;policyDefinitionId&#34;: &#34;[parameters(&#39;policyDefinitionID&#39;)]&#34;
 *       }
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .parametersContent(&#34;&#34;&#34;
 * {
 *   &#34;$schema&#34;: &#34;https://schema.management.azure.com/schemas/2019-04-01/deploymentParameters.json#&#34;,
 *   &#34;contentVersion&#34;: &#34;1.0.0.0&#34;,
 *   &#34;parameters&#34;: {
 *     &#34;policyDefinitionID&#34;: {
 *       &#34;value&#34;: &#34;/providers/Microsoft.Authorization/policyDefinitions/0a914e76-4921-4c19-b460-a2d36003525a&#34;
 *     }
 *   }
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var exampleGroup = Output.of(ManagementFunctions.getGroup(GetGroupArgs.builder()
 *             .name(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .build()));
 * 
 *         var exampleGroupTemplateDeployment = new GroupTemplateDeployment(&#34;exampleGroupTemplateDeployment&#34;, GroupTemplateDeploymentArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .managementGroupId(exampleGroup.apply(getGroupResult -&gt; getGroupResult.getId()))
 *             .templateContent(Files.readString(&#34;templates/example-deploy-template.json&#34;))
 *             .parametersContent(Files.readString(&#34;templates/example-deploy-params.json&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var exampleGroup = Output.of(ManagementFunctions.getGroup(GetGroupArgs.builder()
 *             .name(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .build()));
 * 
 *         final var exampleTemplateSpecVersion = Output.of(CoreFunctions.getTemplateSpecVersion(GetTemplateSpecVersionArgs.builder()
 *             .name(&#34;exampleTemplateForManagementGroup&#34;)
 *             .resourceGroupName(&#34;exampleResourceGroup&#34;)
 *             .version(&#34;v1.0.9&#34;)
 *             .build()));
 * 
 *         var exampleGroupTemplateDeployment = new GroupTemplateDeployment(&#34;exampleGroupTemplateDeployment&#34;, GroupTemplateDeploymentArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .managementGroupId(exampleGroup.apply(getGroupResult -&gt; getGroupResult.getId()))
 *             .templateSpecVersionId(exampleTemplateSpecVersion.apply(getTemplateSpecVersionResult -&gt; getTemplateSpecVersionResult.getId()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Management Group Template Deployments can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:management/groupTemplateDeployment:GroupTemplateDeployment example /providers/Microsoft.Management/managementGroups/my-management-group-id/providers/Microsoft.Resources/deployments/deploy1
 * ```
 * 
 */
@ResourceType(type="azure:management/groupTemplateDeployment:GroupTemplateDeployment")
public class GroupTemplateDeployment extends com.pulumi.resources.CustomResource {
    /**
     * The Debug Level which should be used for this Resource Group Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
     * 
     */
    @Export(name="debugLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> debugLevel;

    /**
     * @return The Debug Level which should be used for this Resource Group Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
     * 
     */
    public Output<Optional<String>> debugLevel() {
        return Codegen.optional(this.debugLevel);
    }
    /**
     * The Azure Region where the Template should exist. Changing this forces a new Template to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Template should exist. Changing this forces a new Template to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    @Export(name="managementGroupId", type=String.class, parameters={})
    private Output<String> managementGroupId;

    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }
    /**
     * The name which should be used for this Template Deployment. Changing this forces a new Template Deployment to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Template Deployment. Changing this forces a new Template Deployment to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The JSON Content of the Outputs of the ARM Template Deployment.
     * 
     */
    @Export(name="outputContent", type=String.class, parameters={})
    private Output<String> outputContent;

    /**
     * @return The JSON Content of the Outputs of the ARM Template Deployment.
     * 
     */
    public Output<String> outputContent() {
        return this.outputContent;
    }
    /**
     * The contents of the ARM Template parameters file - containing a JSON list of parameters.
     * 
     */
    @Export(name="parametersContent", type=String.class, parameters={})
    private Output<String> parametersContent;

    /**
     * @return The contents of the ARM Template parameters file - containing a JSON list of parameters.
     * 
     */
    public Output<String> parametersContent() {
        return this.parametersContent;
    }
    /**
     * A mapping of tags which should be assigned to the Template.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Template.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The contents of the ARM Template which should be deployed into this Resource Group. Cannot be specified with `template_spec_version_id`.
     * 
     */
    @Export(name="templateContent", type=String.class, parameters={})
    private Output<String> templateContent;

    /**
     * @return The contents of the ARM Template which should be deployed into this Resource Group. Cannot be specified with `template_spec_version_id`.
     * 
     */
    public Output<String> templateContent() {
        return this.templateContent;
    }
    /**
     * The ID of the Template Spec Version to deploy. Cannot be specified with `template_content`.
     * 
     */
    @Export(name="templateSpecVersionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateSpecVersionId;

    /**
     * @return The ID of the Template Spec Version to deploy. Cannot be specified with `template_content`.
     * 
     */
    public Output<Optional<String>> templateSpecVersionId() {
        return Codegen.optional(this.templateSpecVersionId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupTemplateDeployment(String name) {
        this(name, GroupTemplateDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupTemplateDeployment(String name, GroupTemplateDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupTemplateDeployment(String name, GroupTemplateDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:management/groupTemplateDeployment:GroupTemplateDeployment", name, args == null ? GroupTemplateDeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupTemplateDeployment(String name, Output<String> id, @Nullable GroupTemplateDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:management/groupTemplateDeployment:GroupTemplateDeployment", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GroupTemplateDeployment get(String name, Output<String> id, @Nullable GroupTemplateDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupTemplateDeployment(name, id, state, options);
    }
}
