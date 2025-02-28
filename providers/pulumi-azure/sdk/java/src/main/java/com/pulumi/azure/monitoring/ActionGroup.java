// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.monitoring.ActionGroupArgs;
import com.pulumi.azure.monitoring.inputs.ActionGroupState;
import com.pulumi.azure.monitoring.outputs.ActionGroupArmRoleReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupAutomationRunbookReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupAzureAppPushReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupAzureFunctionReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupEmailReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupEventHubReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupItsmReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupLogicAppReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupSmsReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupVoiceReceiver;
import com.pulumi.azure.monitoring.outputs.ActionGroupWebhookReceiver;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Action Group within Azure Monitor.
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleActionGroup = new ActionGroup(&#34;exampleActionGroup&#34;, ActionGroupArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .shortName(&#34;p0action&#34;)
 *             .armRoleReceivers(ActionGroupArmRoleReceiver.builder()
 *                 .name(&#34;armroleaction&#34;)
 *                 .roleId(&#34;de139f84-1756-47ae-9be6-808fbbe84772&#34;)
 *                 .useCommonAlertSchema(true)
 *                 .build())
 *             .automationRunbookReceivers(ActionGroupAutomationRunbookReceiver.builder()
 *                 .name(&#34;action_name_1&#34;)
 *                 .automationAccountId(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg-runbooks/providers/microsoft.automation/automationaccounts/aaa001&#34;)
 *                 .runbookName(&#34;my runbook&#34;)
 *                 .webhookResourceId(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg-runbooks/providers/microsoft.automation/automationaccounts/aaa001/webhooks/webhook_alert&#34;)
 *                 .isGlobalRunbook(true)
 *                 .serviceUri(&#34;https://s13events.azure-automation.net/webhooks?token=randomtoken&#34;)
 *                 .useCommonAlertSchema(true)
 *                 .build())
 *             .azureAppPushReceivers(ActionGroupAzureAppPushReceiver.builder()
 *                 .name(&#34;pushtoadmin&#34;)
 *                 .emailAddress(&#34;admin@contoso.com&#34;)
 *                 .build())
 *             .azureFunctionReceivers(ActionGroupAzureFunctionReceiver.builder()
 *                 .name(&#34;funcaction&#34;)
 *                 .functionAppResourceId(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-funcapp/providers/Microsoft.Web/sites/funcapp&#34;)
 *                 .functionName(&#34;myfunc&#34;)
 *                 .httpTriggerUrl(&#34;https://example.com/trigger&#34;)
 *                 .useCommonAlertSchema(true)
 *                 .build())
 *             .emailReceivers(            
 *                 ActionGroupEmailReceiver.builder()
 *                     .name(&#34;sendtoadmin&#34;)
 *                     .emailAddress(&#34;admin@contoso.com&#34;)
 *                     .build(),
 *                 ActionGroupEmailReceiver.builder()
 *                     .name(&#34;sendtodevops&#34;)
 *                     .emailAddress(&#34;devops@contoso.com&#34;)
 *                     .useCommonAlertSchema(true)
 *                     .build())
 *             .eventHubReceivers(ActionGroupEventHubReceiver.builder()
 *                 .name(&#34;sendtoeventhub&#34;)
 *                 .eventHubId(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-eventhub/providers/Microsoft.EventHub/namespaces/eventhubnamespace/eventhubs/eventhub1&#34;)
 *                 .useCommonAlertSchema(false)
 *                 .build())
 *             .itsmReceivers(ActionGroupItsmReceiver.builder()
 *                 .name(&#34;createorupdateticket&#34;)
 *                 .workspaceId(&#34;6eee3a18-aac3-40e4-b98e-1f309f329816&#34;)
 *                 .connectionId(&#34;53de6956-42b4-41ba-be3c-b154cdf17b13&#34;)
 *                 .ticketConfiguration(&#34;{}&#34;)
 *                 .region(&#34;southcentralus&#34;)
 *                 .build())
 *             .logicAppReceivers(ActionGroupLogicAppReceiver.builder()
 *                 .name(&#34;logicappaction&#34;)
 *                 .resourceId(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-logicapp/providers/Microsoft.Logic/workflows/logicapp&#34;)
 *                 .callbackUrl(&#34;https://logicapptriggerurl/...&#34;)
 *                 .useCommonAlertSchema(true)
 *                 .build())
 *             .smsReceivers(ActionGroupSmsReceiver.builder()
 *                 .name(&#34;oncallmsg&#34;)
 *                 .countryCode(&#34;1&#34;)
 *                 .phoneNumber(&#34;1231231234&#34;)
 *                 .build())
 *             .voiceReceivers(ActionGroupVoiceReceiver.builder()
 *                 .name(&#34;remotesupport&#34;)
 *                 .countryCode(&#34;86&#34;)
 *                 .phoneNumber(&#34;13888888888&#34;)
 *                 .build())
 *             .webhookReceivers(ActionGroupWebhookReceiver.builder()
 *                 .name(&#34;callmyapiaswell&#34;)
 *                 .serviceUri(&#34;http://example.com/alert&#34;)
 *                 .useCommonAlertSchema(true)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Action Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:monitoring/actionGroup:ActionGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Insights/actionGroups/myagname
 * ```
 * 
 */
@ResourceType(type="azure:monitoring/actionGroup:ActionGroup")
public class ActionGroup extends com.pulumi.resources.CustomResource {
    /**
     * One or more `arm_role_receiver` blocks as defined below.
     * 
     */
    @Export(name="armRoleReceivers", type=List.class, parameters={ActionGroupArmRoleReceiver.class})
    private Output</* @Nullable */ List<ActionGroupArmRoleReceiver>> armRoleReceivers;

    /**
     * @return One or more `arm_role_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupArmRoleReceiver>>> armRoleReceivers() {
        return Codegen.optional(this.armRoleReceivers);
    }
    /**
     * One or more `automation_runbook_receiver` blocks as defined below.
     * 
     */
    @Export(name="automationRunbookReceivers", type=List.class, parameters={ActionGroupAutomationRunbookReceiver.class})
    private Output</* @Nullable */ List<ActionGroupAutomationRunbookReceiver>> automationRunbookReceivers;

    /**
     * @return One or more `automation_runbook_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupAutomationRunbookReceiver>>> automationRunbookReceivers() {
        return Codegen.optional(this.automationRunbookReceivers);
    }
    /**
     * One or more `azure_app_push_receiver` blocks as defined below.
     * 
     */
    @Export(name="azureAppPushReceivers", type=List.class, parameters={ActionGroupAzureAppPushReceiver.class})
    private Output</* @Nullable */ List<ActionGroupAzureAppPushReceiver>> azureAppPushReceivers;

    /**
     * @return One or more `azure_app_push_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupAzureAppPushReceiver>>> azureAppPushReceivers() {
        return Codegen.optional(this.azureAppPushReceivers);
    }
    /**
     * One or more `azure_function_receiver` blocks as defined below.
     * 
     */
    @Export(name="azureFunctionReceivers", type=List.class, parameters={ActionGroupAzureFunctionReceiver.class})
    private Output</* @Nullable */ List<ActionGroupAzureFunctionReceiver>> azureFunctionReceivers;

    /**
     * @return One or more `azure_function_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupAzureFunctionReceiver>>> azureFunctionReceivers() {
        return Codegen.optional(this.azureFunctionReceivers);
    }
    /**
     * One or more `email_receiver` blocks as defined below.
     * 
     */
    @Export(name="emailReceivers", type=List.class, parameters={ActionGroupEmailReceiver.class})
    private Output</* @Nullable */ List<ActionGroupEmailReceiver>> emailReceivers;

    /**
     * @return One or more `email_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupEmailReceiver>>> emailReceivers() {
        return Codegen.optional(this.emailReceivers);
    }
    /**
     * Whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * One or more `event_hub_receiver` blocks as defined below.
     * 
     */
    @Export(name="eventHubReceivers", type=List.class, parameters={ActionGroupEventHubReceiver.class})
    private Output</* @Nullable */ List<ActionGroupEventHubReceiver>> eventHubReceivers;

    /**
     * @return One or more `event_hub_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupEventHubReceiver>>> eventHubReceivers() {
        return Codegen.optional(this.eventHubReceivers);
    }
    /**
     * One or more `itsm_receiver` blocks as defined below.
     * 
     */
    @Export(name="itsmReceivers", type=List.class, parameters={ActionGroupItsmReceiver.class})
    private Output</* @Nullable */ List<ActionGroupItsmReceiver>> itsmReceivers;

    /**
     * @return One or more `itsm_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupItsmReceiver>>> itsmReceivers() {
        return Codegen.optional(this.itsmReceivers);
    }
    /**
     * One or more `logic_app_receiver` blocks as defined below.
     * 
     */
    @Export(name="logicAppReceivers", type=List.class, parameters={ActionGroupLogicAppReceiver.class})
    private Output</* @Nullable */ List<ActionGroupLogicAppReceiver>> logicAppReceivers;

    /**
     * @return One or more `logic_app_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupLogicAppReceiver>>> logicAppReceivers() {
        return Codegen.optional(this.logicAppReceivers);
    }
    /**
     * The name of the Action Group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Action Group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which to create the Action Group instance.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Action Group instance.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The short name of the action group. This will be used in SMS messages.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return The short name of the action group. This will be used in SMS messages.
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }
    /**
     * One or more `sms_receiver` blocks as defined below.
     * 
     */
    @Export(name="smsReceivers", type=List.class, parameters={ActionGroupSmsReceiver.class})
    private Output</* @Nullable */ List<ActionGroupSmsReceiver>> smsReceivers;

    /**
     * @return One or more `sms_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupSmsReceiver>>> smsReceivers() {
        return Codegen.optional(this.smsReceivers);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * One or more `voice_receiver` blocks as defined below.
     * 
     */
    @Export(name="voiceReceivers", type=List.class, parameters={ActionGroupVoiceReceiver.class})
    private Output</* @Nullable */ List<ActionGroupVoiceReceiver>> voiceReceivers;

    /**
     * @return One or more `voice_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupVoiceReceiver>>> voiceReceivers() {
        return Codegen.optional(this.voiceReceivers);
    }
    /**
     * One or more `webhook_receiver` blocks as defined below.
     * 
     */
    @Export(name="webhookReceivers", type=List.class, parameters={ActionGroupWebhookReceiver.class})
    private Output</* @Nullable */ List<ActionGroupWebhookReceiver>> webhookReceivers;

    /**
     * @return One or more `webhook_receiver` blocks as defined below.
     * 
     */
    public Output<Optional<List<ActionGroupWebhookReceiver>>> webhookReceivers() {
        return Codegen.optional(this.webhookReceivers);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActionGroup(String name) {
        this(name, ActionGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionGroup(String name, ActionGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionGroup(String name, ActionGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/actionGroup:ActionGroup", name, args == null ? ActionGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActionGroup(String name, Output<String> id, @Nullable ActionGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/actionGroup:ActionGroup", name, state, makeResourceOptions(options, id));
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
    public static ActionGroup get(String name, Output<String> id, @Nullable ActionGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActionGroup(name, id, state, options);
    }
}
