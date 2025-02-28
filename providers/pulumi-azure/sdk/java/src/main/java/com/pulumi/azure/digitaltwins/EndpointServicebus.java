// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.digitaltwins;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.digitaltwins.EndpointServicebusArgs;
import com.pulumi.azure.digitaltwins.inputs.EndpointServicebusState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Digital Twins Service Bus Endpoint.
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
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var exampleTopic = new Topic(&#34;exampleTopic&#34;, TopicArgs.builder()        
 *             .namespaceId(exampleNamespace.getId())
 *             .build());
 * 
 *         var exampleTopicAuthorizationRule = new TopicAuthorizationRule(&#34;exampleTopicAuthorizationRule&#34;, TopicAuthorizationRuleArgs.builder()        
 *             .topicId(exampleTopic.getId())
 *             .listen(false)
 *             .send(true)
 *             .manage(false)
 *             .build());
 * 
 *         var exampleEndpointServicebus = new EndpointServicebus(&#34;exampleEndpointServicebus&#34;, EndpointServicebusArgs.builder()        
 *             .digitalTwinsId(exampleInstance.getId())
 *             .servicebusPrimaryConnectionString(exampleTopicAuthorizationRule.getPrimaryConnectionString())
 *             .servicebusSecondaryConnectionString(exampleTopicAuthorizationRule.getSecondaryConnectionString())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Digital Twins Service Bus Endpoints can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:digitaltwins/endpointServicebus:EndpointServicebus example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DigitalTwins/digitalTwinsInstances/dt1/endpoints/ep1
 * ```
 * 
 */
@ResourceType(type="azure:digitaltwins/endpointServicebus:EndpointServicebus")
public class EndpointServicebus extends com.pulumi.resources.CustomResource {
    /**
     * The storage secret of the dead-lettering, whose format is `https://&lt;storageAccountname&gt;.blob.core.windows.net/&lt;containerName&gt;?&lt;SASToken&gt;`. When an endpoint can&#39;t deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
     * 
     */
    @Export(name="deadLetterStorageSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> deadLetterStorageSecret;

    /**
     * @return The storage secret of the dead-lettering, whose format is `https://&lt;storageAccountname&gt;.blob.core.windows.net/&lt;containerName&gt;?&lt;SASToken&gt;`. When an endpoint can&#39;t deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
     * 
     */
    public Output<Optional<String>> deadLetterStorageSecret() {
        return Codegen.optional(this.deadLetterStorageSecret);
    }
    /**
     * The ID of the Digital Twins Instance. Changing this forces a new Digital Twins Service Bus Endpoint to be created.
     * 
     */
    @Export(name="digitalTwinsId", type=String.class, parameters={})
    private Output<String> digitalTwinsId;

    /**
     * @return The ID of the Digital Twins Instance. Changing this forces a new Digital Twins Service Bus Endpoint to be created.
     * 
     */
    public Output<String> digitalTwinsId() {
        return this.digitalTwinsId;
    }
    /**
     * The name which should be used for this Digital Twins Service Bus Endpoint. Changing this forces a new Digital Twins Service Bus Endpoint to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Digital Twins Service Bus Endpoint. Changing this forces a new Digital Twins Service Bus Endpoint to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The primary connection string of the Service Bus Topic Authorization Rule with a minimum of `send` permission. .
     * 
     */
    @Export(name="servicebusPrimaryConnectionString", type=String.class, parameters={})
    private Output<String> servicebusPrimaryConnectionString;

    /**
     * @return The primary connection string of the Service Bus Topic Authorization Rule with a minimum of `send` permission. .
     * 
     */
    public Output<String> servicebusPrimaryConnectionString() {
        return this.servicebusPrimaryConnectionString;
    }
    /**
     * The secondary connection string of the Service Bus Topic Authorization Rule with a minimum of `send` permission.
     * 
     */
    @Export(name="servicebusSecondaryConnectionString", type=String.class, parameters={})
    private Output<String> servicebusSecondaryConnectionString;

    /**
     * @return The secondary connection string of the Service Bus Topic Authorization Rule with a minimum of `send` permission.
     * 
     */
    public Output<String> servicebusSecondaryConnectionString() {
        return this.servicebusSecondaryConnectionString;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EndpointServicebus(String name) {
        this(name, EndpointServicebusArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EndpointServicebus(String name, EndpointServicebusArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EndpointServicebus(String name, EndpointServicebusArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:digitaltwins/endpointServicebus:EndpointServicebus", name, args == null ? EndpointServicebusArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EndpointServicebus(String name, Output<String> id, @Nullable EndpointServicebusState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:digitaltwins/endpointServicebus:EndpointServicebus", name, state, makeResourceOptions(options, id));
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
    public static EndpointServicebus get(String name, Output<String> id, @Nullable EndpointServicebusState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EndpointServicebus(name, id, state, options);
    }
}
