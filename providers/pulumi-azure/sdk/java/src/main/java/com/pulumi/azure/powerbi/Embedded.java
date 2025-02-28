// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.powerbi;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.powerbi.EmbeddedArgs;
import com.pulumi.azure.powerbi.inputs.EmbeddedState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a PowerBI Embedded.
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
 *         var exampleEmbedded = new Embedded(&#34;exampleEmbedded&#34;, EmbeddedArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .skuName(&#34;A1&#34;)
 *             .administrators(&#34;azsdktest@microsoft.com&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * PowerBI Embedded can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:powerbi/embedded:Embedded example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.PowerBIDedicated/capacities/capacity1
 * ```
 * 
 */
@ResourceType(type="azure:powerbi/embedded:Embedded")
public class Embedded extends com.pulumi.resources.CustomResource {
    /**
     * A set of administrator user identities, which manages the Power BI Embedded and must be a member user or a service principal in your AAD tenant.
     * 
     */
    @Export(name="administrators", type=List.class, parameters={String.class})
    private Output<List<String>> administrators;

    /**
     * @return A set of administrator user identities, which manages the Power BI Embedded and must be a member user or a service principal in your AAD tenant.
     * 
     */
    public Output<List<String>> administrators() {
        return this.administrators;
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Sets the PowerBI Embedded&#39;s mode. Possible values include: `Gen1`, `Gen2`. Defaults to `Gen1`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return Sets the PowerBI Embedded&#39;s mode. Possible values include: `Gen1`, `Gen2`. Defaults to `Gen1`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The name of the PowerBI Embedded. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the PowerBI Embedded. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the PowerBI Embedded should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the PowerBI Embedded should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Sets the PowerBI Embedded&#39;s pricing level&#39;s SKU. Possible values include: `A1`, `A2`, `A3`, `A4`, `A5`, `A6`.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return Sets the PowerBI Embedded&#39;s pricing level&#39;s SKU. Possible values include: `A1`, `A2`, `A3`, `A4`, `A5`, `A6`.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Embedded(String name) {
        this(name, EmbeddedArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Embedded(String name, EmbeddedArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Embedded(String name, EmbeddedArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:powerbi/embedded:Embedded", name, args == null ? EmbeddedArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Embedded(String name, Output<String> id, @Nullable EmbeddedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:powerbi/embedded:Embedded", name, state, makeResourceOptions(options, id));
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
    public static Embedded get(String name, Output<String> id, @Nullable EmbeddedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Embedded(name, id, state, options);
    }
}
