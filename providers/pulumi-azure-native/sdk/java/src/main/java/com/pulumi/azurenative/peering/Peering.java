// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.peering.PeeringArgs;
import com.pulumi.azurenative.peering.outputs.PeeringPropertiesDirectResponse;
import com.pulumi.azurenative.peering.outputs.PeeringPropertiesExchangeResponse;
import com.pulumi.azurenative.peering.outputs.PeeringSkuResponse;
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
 * Peering is a logical representation of a set of connections to the Microsoft Cloud Edge at a location.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * ### Create a direct peering
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
 *         var peering = new Peering(&#34;peering&#34;, PeeringArgs.builder()        
 *             .direct(Map.ofEntries(
 *                 Map.entry(&#34;connections&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;bandwidthInMbps&#34;, 10000),
 *                         Map.entry(&#34;bgpSession&#34;, Map.ofEntries(
 *                             Map.entry(&#34;maxPrefixesAdvertisedV4&#34;, 1000),
 *                             Map.entry(&#34;maxPrefixesAdvertisedV6&#34;, 100),
 *                             Map.entry(&#34;md5AuthenticationKey&#34;, &#34;test-md5-auth-key&#34;),
 *                             Map.entry(&#34;sessionPrefixV4&#34;, &#34;192.168.0.0/31&#34;),
 *                             Map.entry(&#34;sessionPrefixV6&#34;, &#34;fd00::0/127&#34;)
 *                         )),
 *                         Map.entry(&#34;connectionIdentifier&#34;, &#34;5F4CB5C7-6B43-4444-9338-9ABC72606C16&#34;),
 *                         Map.entry(&#34;peeringDBFacilityId&#34;, 99999),
 *                         Map.entry(&#34;sessionAddressProvider&#34;, &#34;Peer&#34;),
 *                         Map.entry(&#34;useForPeeringService&#34;, false)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;bandwidthInMbps&#34;, 10000),
 *                         Map.entry(&#34;connectionIdentifier&#34;, &#34;8AB00818-D533-4504-A25A-03A17F61201C&#34;),
 *                         Map.entry(&#34;peeringDBFacilityId&#34;, 99999),
 *                         Map.entry(&#34;sessionAddressProvider&#34;, &#34;Microsoft&#34;),
 *                         Map.entry(&#34;useForPeeringService&#34;, true)
 *                     )),
 *                 Map.entry(&#34;directPeeringType&#34;, &#34;Edge&#34;),
 *                 Map.entry(&#34;peerAsn&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subId/providers/Microsoft.Peering/peerAsns/myAsn1&#34;))
 *             ))
 *             .kind(&#34;Direct&#34;)
 *             .location(&#34;eastus&#34;)
 *             .peeringLocation(&#34;peeringLocation0&#34;)
 *             .peeringName(&#34;peeringName&#34;)
 *             .resourceGroupName(&#34;rgName&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;Basic_Direct_Free&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a peering with exchange route server
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
 *         var peering = new Peering(&#34;peering&#34;, PeeringArgs.builder()        
 *             .direct(Map.ofEntries(
 *                 Map.entry(&#34;connections&#34;, Map.ofEntries(
 *                     Map.entry(&#34;bandwidthInMbps&#34;, 10000),
 *                     Map.entry(&#34;bgpSession&#34;, Map.ofEntries(
 *                         Map.entry(&#34;maxPrefixesAdvertisedV4&#34;, 1000),
 *                         Map.entry(&#34;maxPrefixesAdvertisedV6&#34;, 100),
 *                         Map.entry(&#34;microsoftSessionIPv4Address&#34;, &#34;192.168.0.123&#34;),
 *                         Map.entry(&#34;peerSessionIPv4Address&#34;, &#34;192.168.0.234&#34;),
 *                         Map.entry(&#34;sessionPrefixV4&#34;, &#34;192.168.0.0/24&#34;)
 *                     )),
 *                     Map.entry(&#34;connectionIdentifier&#34;, &#34;5F4CB5C7-6B43-4444-9338-9ABC72606C16&#34;),
 *                     Map.entry(&#34;peeringDBFacilityId&#34;, 99999),
 *                     Map.entry(&#34;sessionAddressProvider&#34;, &#34;Peer&#34;),
 *                     Map.entry(&#34;useForPeeringService&#34;, true)
 *                 )),
 *                 Map.entry(&#34;directPeeringType&#34;, &#34;IxRs&#34;),
 *                 Map.entry(&#34;peerAsn&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subId/providers/Microsoft.Peering/peerAsns/myAsn1&#34;))
 *             ))
 *             .kind(&#34;Direct&#34;)
 *             .location(&#34;eastus&#34;)
 *             .peeringLocation(&#34;peeringLocation0&#34;)
 *             .peeringName(&#34;peeringName&#34;)
 *             .resourceGroupName(&#34;rgName&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;Premium_Direct_Free&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create an exchange peering
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
 *         var peering = new Peering(&#34;peering&#34;, PeeringArgs.builder()        
 *             .exchange(Map.ofEntries(
 *                 Map.entry(&#34;connections&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;bgpSession&#34;, Map.ofEntries(
 *                             Map.entry(&#34;maxPrefixesAdvertisedV4&#34;, 1000),
 *                             Map.entry(&#34;maxPrefixesAdvertisedV6&#34;, 100),
 *                             Map.entry(&#34;md5AuthenticationKey&#34;, &#34;test-md5-auth-key&#34;),
 *                             Map.entry(&#34;peerSessionIPv4Address&#34;, &#34;192.168.2.1&#34;),
 *                             Map.entry(&#34;peerSessionIPv6Address&#34;, &#34;fd00::1&#34;)
 *                         )),
 *                         Map.entry(&#34;connectionIdentifier&#34;, &#34;CE495334-0E94-4E51-8164-8116D6CD284D&#34;),
 *                         Map.entry(&#34;peeringDBFacilityId&#34;, 99999)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;bgpSession&#34;, Map.ofEntries(
 *                             Map.entry(&#34;maxPrefixesAdvertisedV4&#34;, 1000),
 *                             Map.entry(&#34;maxPrefixesAdvertisedV6&#34;, 100),
 *                             Map.entry(&#34;md5AuthenticationKey&#34;, &#34;test-md5-auth-key&#34;),
 *                             Map.entry(&#34;peerSessionIPv4Address&#34;, &#34;192.168.2.2&#34;),
 *                             Map.entry(&#34;peerSessionIPv6Address&#34;, &#34;fd00::2&#34;)
 *                         )),
 *                         Map.entry(&#34;connectionIdentifier&#34;, &#34;CDD8E673-CB07-47E6-84DE-3739F778762B&#34;),
 *                         Map.entry(&#34;peeringDBFacilityId&#34;, 99999)
 *                     )),
 *                 Map.entry(&#34;peerAsn&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subId/providers/Microsoft.Peering/peerAsns/myAsn1&#34;))
 *             ))
 *             .kind(&#34;Exchange&#34;)
 *             .location(&#34;eastus&#34;)
 *             .peeringLocation(&#34;peeringLocation0&#34;)
 *             .peeringName(&#34;peeringName&#34;)
 *             .resourceGroupName(&#34;rgName&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;Basic_Exchange_Free&#34;))
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
 * $ pulumi import azure-native:peering:Peering peeringName /subscriptions/subId/resourceGroups/rgName/providers/Microsoft.Peering/peerings/peeringName 
 * ```
 * 
 */
@ResourceType(type="azure-native:peering:Peering")
public class Peering extends com.pulumi.resources.CustomResource {
    /**
     * The properties that define a direct peering.
     * 
     */
    @Export(name="direct", type=PeeringPropertiesDirectResponse.class, parameters={})
    private Output</* @Nullable */ PeeringPropertiesDirectResponse> direct;

    /**
     * @return The properties that define a direct peering.
     * 
     */
    public Output<Optional<PeeringPropertiesDirectResponse>> direct() {
        return Codegen.optional(this.direct);
    }
    /**
     * The properties that define an exchange peering.
     * 
     */
    @Export(name="exchange", type=PeeringPropertiesExchangeResponse.class, parameters={})
    private Output</* @Nullable */ PeeringPropertiesExchangeResponse> exchange;

    /**
     * @return The properties that define an exchange peering.
     * 
     */
    public Output<Optional<PeeringPropertiesExchangeResponse>> exchange() {
        return Codegen.optional(this.exchange);
    }
    /**
     * The kind of the peering.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the peering.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The location of the peering.
     * 
     */
    @Export(name="peeringLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> peeringLocation;

    /**
     * @return The location of the peering.
     * 
     */
    public Output<Optional<String>> peeringLocation() {
        return Codegen.optional(this.peeringLocation);
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU that defines the tier and kind of the peering.
     * 
     */
    @Export(name="sku", type=PeeringSkuResponse.class, parameters={})
    private Output<PeeringSkuResponse> sku;

    /**
     * @return The SKU that defines the tier and kind of the peering.
     * 
     */
    public Output<PeeringSkuResponse> sku() {
        return this.sku;
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
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
    public Peering(String name) {
        this(name, PeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Peering(String name, PeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Peering(String name, PeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:Peering", name, args == null ? PeeringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Peering(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:Peering", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:peering/v20190801preview:Peering").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20190901preview:Peering").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20200101preview:Peering").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20200401:Peering").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20201001:Peering").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20210101:Peering").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20210601:Peering").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20220101:Peering").build())
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
    public static Peering get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Peering(name, id, options);
    }
}
