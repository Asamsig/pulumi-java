// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.RouteFilterArgs;
import com.pulumi.azurenative.network.outputs.ExpressRouteCircuitPeeringResponse;
import com.pulumi.azurenative.network.outputs.RouteFilterRuleResponse;
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
 * Route Filter Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### RouteFilterCreate
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
 *         var routeFilter = new RouteFilter(&#34;routeFilter&#34;, RouteFilterArgs.builder()        
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .routeFilterName(&#34;filterName&#34;)
 *             .rules(Map.ofEntries(
 *                 Map.entry(&#34;access&#34;, &#34;Allow&#34;),
 *                 Map.entry(&#34;communities&#34;,                 
 *                     &#34;12076:5030&#34;,
 *                     &#34;12076:5040&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;ruleName&#34;),
 *                 Map.entry(&#34;routeFilterRuleType&#34;, &#34;Community&#34;)
 *             ))
 *             .tags(Map.of(&#34;key1&#34;, &#34;value1&#34;))
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
 * $ pulumi import azure-native:network:RouteFilter filterName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/routeFilters/filterName 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:RouteFilter")
public class RouteFilter extends com.pulumi.resources.CustomResource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * A collection of references to express route circuit ipv6 peerings.
     * 
     */
    @Export(name="ipv6Peerings", type=List.class, parameters={ExpressRouteCircuitPeeringResponse.class})
    private Output<List<ExpressRouteCircuitPeeringResponse>> ipv6Peerings;

    /**
     * @return A collection of references to express route circuit ipv6 peerings.
     * 
     */
    public Output<List<ExpressRouteCircuitPeeringResponse>> ipv6Peerings() {
        return this.ipv6Peerings;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A collection of references to express route circuit peerings.
     * 
     */
    @Export(name="peerings", type=List.class, parameters={ExpressRouteCircuitPeeringResponse.class})
    private Output<List<ExpressRouteCircuitPeeringResponse>> peerings;

    /**
     * @return A collection of references to express route circuit peerings.
     * 
     */
    public Output<List<ExpressRouteCircuitPeeringResponse>> peerings() {
        return this.peerings;
    }
    /**
     * The provisioning state of the route filter resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the route filter resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Collection of RouteFilterRules contained within a route filter.
     * 
     */
    @Export(name="rules", type=List.class, parameters={RouteFilterRuleResponse.class})
    private Output</* @Nullable */ List<RouteFilterRuleResponse>> rules;

    /**
     * @return Collection of RouteFilterRules contained within a route filter.
     * 
     */
    public Output<Optional<List<RouteFilterRuleResponse>>> rules() {
        return Codegen.optional(this.rules);
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
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteFilter(String name) {
        this(name, RouteFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteFilter(String name, RouteFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteFilter(String name, RouteFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RouteFilter", name, args == null ? RouteFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouteFilter(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RouteFilter", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20161201:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:RouteFilter").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:RouteFilter").build())
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
    public static RouteFilter get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteFilter(name, id, options);
    }
}
