// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.migrate.MoveCollectionArgs;
import com.pulumi.azurenative.migrate.outputs.IdentityResponse;
import com.pulumi.azurenative.migrate.outputs.MoveCollectionPropertiesResponse;
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
 * Define the move collection.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * ### MoveCollections_Create
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
 *         var moveCollection = new MoveCollection(&#34;moveCollection&#34;, MoveCollectionArgs.builder()        
 *             .identity(Map.of(&#34;type&#34;, &#34;SystemAssigned&#34;))
 *             .location(&#34;eastus2&#34;)
 *             .moveCollectionName(&#34;movecollection1&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;sourceRegion&#34;, &#34;eastus&#34;),
 *                 Map.entry(&#34;targetRegion&#34;, &#34;westus&#34;)
 *             ))
 *             .resourceGroupName(&#34;rg1&#34;)
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
 * $ pulumi import azure-native:migrate:MoveCollection movecollection1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Migrate/MoveCollections/movecollection1 
 * ```
 * 
 */
@ResourceType(type="azure-native:migrate:MoveCollection")
public class MoveCollection extends com.pulumi.resources.CustomResource {
    /**
     * The etag of the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag of the resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Defines the MSI properties of the Move Collection.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return Defines the MSI properties of the Move Collection.
     * 
     */
    public Output<Optional<IdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The geo-location where the resource lives.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geo-location where the resource lives.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Defines the move collection properties.
     * 
     */
    @Export(name="properties", type=MoveCollectionPropertiesResponse.class, parameters={})
    private Output<MoveCollectionPropertiesResponse> properties;

    /**
     * @return Defines the move collection properties.
     * 
     */
    public Output<MoveCollectionPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MoveCollection(String name) {
        this(name, MoveCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MoveCollection(String name, MoveCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MoveCollection(String name, MoveCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:MoveCollection", name, args == null ? MoveCollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MoveCollection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:MoveCollection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:migrate/v20191001preview:MoveCollection").build()),
                Output.of(Alias.builder().type("azure-native:migrate/v20210101:MoveCollection").build()),
                Output.of(Alias.builder().type("azure-native:migrate/v20210801:MoveCollection").build())
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
    public static MoveCollection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MoveCollection(name, id, options);
    }
}
