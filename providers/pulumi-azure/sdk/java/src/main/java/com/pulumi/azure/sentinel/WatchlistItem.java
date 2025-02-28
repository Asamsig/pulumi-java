// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.WatchlistItemArgs;
import com.pulumi.azure.sentinel.inputs.WatchlistItemState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a Sentinel Watchlist Item.
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
 *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace(&#34;exampleAnalyticsWorkspace&#34;, AnalyticsWorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(&#34;PerGB2018&#34;)
 *             .build());
 * 
 *         var exampleAnalyticsSolution = new AnalyticsSolution(&#34;exampleAnalyticsSolution&#34;, AnalyticsSolutionArgs.builder()        
 *             .solutionName(&#34;SecurityInsights&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .workspaceResourceId(exampleAnalyticsWorkspace.getId())
 *             .workspaceName(exampleAnalyticsWorkspace.getName())
 *             .plan(AnalyticsSolutionPlan.builder()
 *                 .publisher(&#34;Microsoft&#34;)
 *                 .product(&#34;OMSGallery/SecurityInsights&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleWatchlist = new Watchlist(&#34;exampleWatchlist&#34;, WatchlistArgs.builder()        
 *             .logAnalyticsWorkspaceId(exampleAnalyticsSolution.getWorkspaceResourceId())
 *             .displayName(&#34;example-wl&#34;)
 *             .build());
 * 
 *         var exampleWatchlistItem = new WatchlistItem(&#34;exampleWatchlistItem&#34;, WatchlistItemArgs.builder()        
 *             .watchlistId(exampleWatchlist.getId())
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;k1&#34;, &#34;v1&#34;),
 *                 Map.entry(&#34;k2&#34;, &#34;v2&#34;)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Sentinel Watchlist Items can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:sentinel/watchlistItem:WatchlistItem example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/watchlists/list1/watchlistItems/item1
 * ```
 * 
 */
@ResourceType(type="azure:sentinel/watchlistItem:WatchlistItem")
public class WatchlistItem extends com.pulumi.resources.CustomResource {
    /**
     * The name in UUID format which should be used for this Sentinel Watchlist Item. Changing this forces a new Sentinel Watchlist Item to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name in UUID format which should be used for this Sentinel Watchlist Item. Changing this forces a new Sentinel Watchlist Item to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The key value pairs of the Sentinel Watchlist Item.
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> properties;

    /**
     * @return The key value pairs of the Sentinel Watchlist Item.
     * 
     */
    public Output<Map<String,String>> properties() {
        return this.properties;
    }
    /**
     * The ID of the Sentinel Watchlist that this Item resides in. Changing this forces a new Sentinel Watchlist Item to be created.
     * 
     */
    @Export(name="watchlistId", type=String.class, parameters={})
    private Output<String> watchlistId;

    /**
     * @return The ID of the Sentinel Watchlist that this Item resides in. Changing this forces a new Sentinel Watchlist Item to be created.
     * 
     */
    public Output<String> watchlistId() {
        return this.watchlistId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WatchlistItem(String name) {
        this(name, WatchlistItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WatchlistItem(String name, WatchlistItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WatchlistItem(String name, WatchlistItemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/watchlistItem:WatchlistItem", name, args == null ? WatchlistItemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WatchlistItem(String name, Output<String> id, @Nullable WatchlistItemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/watchlistItem:WatchlistItem", name, state, makeResourceOptions(options, id));
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
    public static WatchlistItem get(String name, Output<String> id, @Nullable WatchlistItemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WatchlistItem(name, id, state, options);
    }
}
