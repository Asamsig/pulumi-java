// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.ManagedPrivateEndpointArgs;
import com.pulumi.azure.datafactory.inputs.ManagedPrivateEndpointState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Data Factory Managed Private Endpoint.
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
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .managedVirtualNetworkEnabled(true)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountKind(&#34;BlobStorage&#34;)
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleManagedPrivateEndpoint = new ManagedPrivateEndpoint(&#34;exampleManagedPrivateEndpoint&#34;, ManagedPrivateEndpointArgs.builder()        
 *             .dataFactoryId(exampleFactory.getId())
 *             .targetResourceId(exampleAccount.getId())
 *             .subresourceName(&#34;blob&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Factory Managed Private Endpoint can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/managedPrivateEndpoint:ManagedPrivateEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/managedVirtualNetworks/default/managedPrivateEndpoints/endpoint1
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/managedPrivateEndpoint:ManagedPrivateEndpoint")
public class ManagedPrivateEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Data Factory on which to create the Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The ID of the Data Factory on which to create the Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * Fully qualified domain names. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="fqdns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> fqdns;

    /**
     * @return Fully qualified domain names. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<String>>> fqdns() {
        return Codegen.optional(this.fqdns);
    }
    /**
     * Specifies the name which should be used for this Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Managed Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the sub resource name which the Data Factory Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="subresourceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> subresourceName;

    /**
     * @return Specifies the sub resource name which the Data Factory Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> subresourceName() {
        return Codegen.optional(this.subresourceName);
    }
    /**
     * The ID of the Private Link Enabled Remote Resource which this Data Factory Private Endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="targetResourceId", type=String.class, parameters={})
    private Output<String> targetResourceId;

    /**
     * @return The ID of the Private Link Enabled Remote Resource which this Data Factory Private Endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> targetResourceId() {
        return this.targetResourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedPrivateEndpoint(String name) {
        this(name, ManagedPrivateEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedPrivateEndpoint(String name, ManagedPrivateEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedPrivateEndpoint(String name, ManagedPrivateEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/managedPrivateEndpoint:ManagedPrivateEndpoint", name, args == null ? ManagedPrivateEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedPrivateEndpoint(String name, Output<String> id, @Nullable ManagedPrivateEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/managedPrivateEndpoint:ManagedPrivateEndpoint", name, state, makeResourceOptions(options, id));
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
    public static ManagedPrivateEndpoint get(String name, Output<String> id, @Nullable ManagedPrivateEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedPrivateEndpoint(name, id, state, options);
    }
}
