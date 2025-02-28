// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.core.SubscriptionTemplateDeploymentArgs;
import com.pulumi.azure.core.inputs.SubscriptionTemplateDeploymentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Subscription Template Deployment.
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
 *         var example = new SubscriptionTemplateDeployment(&#34;example&#34;, SubscriptionTemplateDeploymentArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .templateContent(&#34;&#34;&#34;
 *  {
 *    &#34;$schema&#34;: &#34;https://schema.management.azure.com/schemas/2015-01-01/deploymentTemplate.json#&#34;,
 *    &#34;contentVersion&#34;: &#34;1.0.0.0&#34;,
 *    &#34;parameters&#34;: {},
 *    &#34;variables&#34;: {},
 *    &#34;resources&#34;: [
 *      {
 *        &#34;type&#34;: &#34;Microsoft.Resources/resourceGroups&#34;,
 *        &#34;apiVersion&#34;: &#34;2018-05-01&#34;,
 *        &#34;location&#34;: &#34;West Europe&#34;,
 *        &#34;name&#34;: &#34;some-resource-group&#34;,
 *        &#34;properties&#34;: {}
 *      }
 *    ]
 *  }
 *  
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Subscription Template Deployments can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:core/subscriptionTemplateDeployment:SubscriptionTemplateDeployment example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Resources/deployments/template1
 * ```
 * 
 */
@ResourceType(type="azure:core/subscriptionTemplateDeployment:SubscriptionTemplateDeployment")
public class SubscriptionTemplateDeployment extends com.pulumi.resources.CustomResource {
    /**
     * The Debug Level which should be used for this Subscription Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
     * 
     */
    @Export(name="debugLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> debugLevel;

    /**
     * @return The Debug Level which should be used for this Subscription Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
     * 
     */
    public Output<Optional<String>> debugLevel() {
        return Codegen.optional(this.debugLevel);
    }
    /**
     * The Azure Region where the Subscription Template Deployment should exist. Changing this forces a new Subscription Template Deployment to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Subscription Template Deployment should exist. Changing this forces a new Subscription Template Deployment to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Subscription Template Deployment. Changing this forces a new Subscription Template Deployment to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Subscription Template Deployment. Changing this forces a new Subscription Template Deployment to be created.
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
     * A mapping of tags which should be assigned to the Subscription Template Deployment.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Subscription Template Deployment.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The contents of the ARM Template which should be deployed into this Subscription.
     * 
     */
    @Export(name="templateContent", type=String.class, parameters={})
    private Output<String> templateContent;

    /**
     * @return The contents of the ARM Template which should be deployed into this Subscription.
     * 
     */
    public Output<String> templateContent() {
        return this.templateContent;
    }
    /**
     * The ID of the Template Spec Version to deploy into the Subscription. Cannot be specified with `template_content`.
     * 
     */
    @Export(name="templateSpecVersionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateSpecVersionId;

    /**
     * @return The ID of the Template Spec Version to deploy into the Subscription. Cannot be specified with `template_content`.
     * 
     */
    public Output<Optional<String>> templateSpecVersionId() {
        return Codegen.optional(this.templateSpecVersionId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubscriptionTemplateDeployment(String name) {
        this(name, SubscriptionTemplateDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubscriptionTemplateDeployment(String name, @Nullable SubscriptionTemplateDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubscriptionTemplateDeployment(String name, @Nullable SubscriptionTemplateDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/subscriptionTemplateDeployment:SubscriptionTemplateDeployment", name, args == null ? SubscriptionTemplateDeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SubscriptionTemplateDeployment(String name, Output<String> id, @Nullable SubscriptionTemplateDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/subscriptionTemplateDeployment:SubscriptionTemplateDeployment", name, state, makeResourceOptions(options, id));
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
    public static SubscriptionTemplateDeployment get(String name, Output<String> id, @Nullable SubscriptionTemplateDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SubscriptionTemplateDeployment(name, id, state, options);
    }
}
