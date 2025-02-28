// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.documentdb.TableResourceTableArgs;
import com.pulumi.azurenative.documentdb.outputs.TableGetPropertiesResponseOptions;
import com.pulumi.azurenative.documentdb.outputs.TableGetPropertiesResponseResource;
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
 * An Azure Cosmos DB Table.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * ### CosmosDBTableReplace
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
 *         var tableResourceTable = new TableResourceTable(&#34;tableResourceTable&#34;, TableResourceTableArgs.builder()        
 *             .accountName(&#34;ddb1&#34;)
 *             .location(&#34;West US&#34;)
 *             .options()
 *             .resource(Map.of(&#34;id&#34;, &#34;tableName&#34;))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .tableName(&#34;tableName&#34;)
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
 * $ pulumi import azure-native:documentdb:TableResourceTable tableName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/tables/tableName 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:TableResourceTable")
public class TableResourceTable extends com.pulumi.resources.CustomResource {
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
    @Export(name="options", type=TableGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ TableGetPropertiesResponseOptions> options;

    public Output<Optional<TableGetPropertiesResponseOptions>> options() {
        return Codegen.optional(this.options);
    }
    @Export(name="resource", type=TableGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ TableGetPropertiesResponseResource> resource;

    public Output<Optional<TableGetPropertiesResponseResource>> resource() {
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
    public TableResourceTable(String name) {
        this(name, TableResourceTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableResourceTable(String name, TableResourceTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableResourceTable(String name, TableResourceTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:TableResourceTable", name, args == null ? TableResourceTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TableResourceTable(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:TableResourceTable", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20150401:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20150408:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20151106:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160319:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160331:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20190801:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20191212:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200301:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200401:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200601preview:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200901:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210115:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210315:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210415:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210515:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210615:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211115preview:TableResourceTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20220215preview:TableResourceTable").build())
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
    public static TableResourceTable get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TableResourceTable(name, id, options);
    }
}
