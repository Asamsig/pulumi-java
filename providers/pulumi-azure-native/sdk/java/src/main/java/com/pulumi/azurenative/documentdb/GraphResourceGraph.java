// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.documentdb.GraphResourceGraphArgs;
import com.pulumi.azurenative.documentdb.outputs.GraphResourceGetPropertiesResponseOptions;
import com.pulumi.azurenative.documentdb.outputs.GraphResourceGetPropertiesResponseResource;
import com.pulumi.azurenative.documentdb.outputs.ManagedServiceIdentityResponse;
import com.pulumi.core.Alias;
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
 * An Azure Cosmos DB Graph resource.
 * API Version: 2021-07-01-preview.
 * 
 * ## Example Usage
 * ### CosmosDBGraphCreateUpdate
 * 
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
 *         var graphResourceGraph = new GraphResourceGraph(&#34;graphResourceGraph&#34;, GraphResourceGraphArgs.builder()        
 *             .accountName(&#34;ddb1&#34;)
 *             .graphName(&#34;graphName&#34;)
 *             .location(&#34;West US&#34;)
 *             .options()
 *             .resource(Map.of(&#34;id&#34;, &#34;graphName&#34;))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .tags()
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:GraphResourceGraph graphName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/graphs/graphName 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:GraphResourceGraph")
public class GraphResourceGraph extends com.pulumi.resources.CustomResource {
    /**
     * Identity for the resource.
     * 
     */
    @Export(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output<Optional<ManagedServiceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the ARM resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ARM resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="options", type=GraphResourceGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ GraphResourceGetPropertiesResponseOptions> options;

    public Output<Optional<GraphResourceGetPropertiesResponseOptions>> options() {
        return Codegen.optional(this.options);
    }
    @Export(name="resource", type=GraphResourceGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ GraphResourceGetPropertiesResponseResource> resource;

    public Output<Optional<GraphResourceGetPropertiesResponseResource>> resource() {
        return Codegen.optional(this.resource);
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of Azure resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GraphResourceGraph(String name) {
        this(name, GraphResourceGraphArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GraphResourceGraph(String name, GraphResourceGraphArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GraphResourceGraph(String name, GraphResourceGraphArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:GraphResourceGraph", name, args == null ? GraphResourceGraphArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GraphResourceGraph(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:GraphResourceGraph", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:GraphResourceGraph").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:GraphResourceGraph").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211115preview:GraphResourceGraph").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20220215preview:GraphResourceGraph").build())
            ))
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
    public static GraphResourceGraph get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GraphResourceGraph(name, id, options);
    }
}
