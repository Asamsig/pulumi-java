// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.operationalinsights.QueryArgs;
import com.pulumi.azurenative.operationalinsights.outputs.LogAnalyticsQueryPackQueryPropertiesResponseRelated;
import com.pulumi.azurenative.operationalinsights.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Log Analytics QueryPack-Query definition.
 * API Version: 2019-09-01.
 * 
 * ## Example Usage
 * ### QueryPut
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
 *         var query = new Query(&#34;query&#34;, QueryArgs.builder()        
 *             .body(&#34;&#34;&#34;
 * let newExceptionsTimeRange = 1d;
 * let timeRangeToCheckBefore = 7d;
 * exceptions
 * | where timestamp &lt; ago(timeRangeToCheckBefore)
 * | summarize count() by problemId
 * | join kind= rightanti (
 * exceptions
 * | where timestamp &gt;= ago(newExceptionsTimeRange)
 * | extend stack = tostring(details[0].rawStack)
 * | summarize count(), dcount(user_AuthenticatedId), min(timestamp), max(timestamp), any(stack) by problemId  
 * ) on problemId 
 * | order by  count_ desc
 *             &#34;&#34;&#34;)
 *             .description(&#34;my description&#34;)
 *             .displayName(&#34;Exceptions - New in the last 24 hours&#34;)
 *             .id(&#34;a449f8af-8e64-4b3a-9b16-5a7165ff98c4&#34;)
 *             .queryPackName(&#34;my-querypack&#34;)
 *             .related(Map.of(&#34;categories&#34;, &#34;analytics&#34;))
 *             .resourceGroupName(&#34;my-resource-group&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;my-label&#34;, &#34;label1&#34;),
 *                 Map.entry(&#34;my-other-label&#34;, &#34;label2&#34;)
 *             ))
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
 * $ pulumi import azure-native:operationalinsights:Query a449f8af-8e64-4b3a-9b16-5a7165ff98c4 /subscriptions/86dc51d3-92ed-4d7e-947a-775ea79b4918/resourceGroups/my-resource-group/providers/microsoft.operationalinsights/queryPacks/my-querypack/queries/a449f8af-8e64-4b3a-9b16-5a7165ff98c4 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:Query")
public class Query extends com.pulumi.resources.CustomResource {
    /**
     * Object Id of user creating the query.
     * 
     */
    @Export(name="author", type=String.class, parameters={})
    private Output<String> author;

    /**
     * @return Object Id of user creating the query.
     * 
     */
    public Output<String> author() {
        return this.author;
    }
    /**
     * Body of the query.
     * 
     */
    @Export(name="body", type=String.class, parameters={})
    private Output<String> body;

    /**
     * @return Body of the query.
     * 
     */
    public Output<String> body() {
        return this.body;
    }
    /**
     * Description of the query.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the query.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique display name for your query within the Query Pack.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Unique display name for your query within the Query Pack.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Additional properties that can be set for the query.
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Additional properties that can be set for the query.
     * 
     */
    public Output<Object> properties() {
        return this.properties;
    }
    /**
     * The related metadata items for the function.
     * 
     */
    @Export(name="related", type=LogAnalyticsQueryPackQueryPropertiesResponseRelated.class, parameters={})
    private Output</* @Nullable */ LogAnalyticsQueryPackQueryPropertiesResponseRelated> related;

    /**
     * @return The related metadata items for the function.
     * 
     */
    public Output<Optional<LogAnalyticsQueryPackQueryPropertiesResponseRelated>> related() {
        return Codegen.optional(this.related);
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Tags associated with the query.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, List.class})
    private Output</* @Nullable */ Map<String,List<String>>> tags;

    /**
     * @return Tags associated with the query.
     * 
     */
    public Output<Optional<Map<String,List<String>>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Creation Date for the Log Analytics Query, in ISO 8601 format.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return Creation Date for the Log Analytics Query, in ISO 8601 format.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * Last modified date of the Log Analytics Query, in ISO 8601 format.
     * 
     */
    @Export(name="timeModified", type=String.class, parameters={})
    private Output<String> timeModified;

    /**
     * @return Last modified date of the Log Analytics Query, in ISO 8601 format.
     * 
     */
    public Output<String> timeModified() {
        return this.timeModified;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Query(String name) {
        this(name, QueryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Query(String name, QueryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Query(String name, QueryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Query", name, args == null ? QueryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Query(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Query", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20190901:Query").build()),
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20190901preview:Query").build())
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
    public static Query get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Query(name, id, options);
    }
}
