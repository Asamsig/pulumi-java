// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.ExpressRouteCircuitConnectionArgs;
import com.pulumi.azure.network.inputs.ExpressRouteCircuitConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Express Route Circuit Connection.
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
 *         var exampleExpressRoutePort = new ExpressRoutePort(&#34;exampleExpressRoutePort&#34;, ExpressRoutePortArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .peeringLocation(&#34;Equinix-Seattle-SE2&#34;)
 *             .bandwidthInGbps(10)
 *             .encapsulation(&#34;Dot1Q&#34;)
 *             .build());
 * 
 *         var exampleExpressRouteCircuit = new ExpressRouteCircuit(&#34;exampleExpressRouteCircuit&#34;, ExpressRouteCircuitArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .expressRoutePortId(exampleExpressRoutePort.getId())
 *             .bandwidthInGbps(5)
 *             .sku(ExpressRouteCircuitSku.builder()
 *                 .tier(&#34;Standard&#34;)
 *                 .family(&#34;MeteredData&#34;)
 *                 .build())
 *             .build());
 * 
 *         var example2ExpressRoutePort = new ExpressRoutePort(&#34;example2ExpressRoutePort&#34;, ExpressRoutePortArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .peeringLocation(&#34;Allied-Toronto-King-West&#34;)
 *             .bandwidthInGbps(10)
 *             .encapsulation(&#34;Dot1Q&#34;)
 *             .build());
 * 
 *         var example2ExpressRouteCircuit = new ExpressRouteCircuit(&#34;example2ExpressRouteCircuit&#34;, ExpressRouteCircuitArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .expressRoutePortId(example2ExpressRoutePort.getId())
 *             .bandwidthInGbps(5)
 *             .sku(ExpressRouteCircuitSku.builder()
 *                 .tier(&#34;Standard&#34;)
 *                 .family(&#34;MeteredData&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleExpressRouteCircuitPeering = new ExpressRouteCircuitPeering(&#34;exampleExpressRouteCircuitPeering&#34;, ExpressRouteCircuitPeeringArgs.builder()        
 *             .peeringType(&#34;AzurePrivatePeering&#34;)
 *             .expressRouteCircuitName(exampleExpressRouteCircuit.getName())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sharedKey(&#34;ItsASecret&#34;)
 *             .peerAsn(100)
 *             .primaryPeerAddressPrefix(&#34;192.168.1.0/30&#34;)
 *             .secondaryPeerAddressPrefix(&#34;192.168.1.0/30&#34;)
 *             .vlanId(100)
 *             .build());
 * 
 *         var example2ExpressRouteCircuitPeering = new ExpressRouteCircuitPeering(&#34;example2ExpressRouteCircuitPeering&#34;, ExpressRouteCircuitPeeringArgs.builder()        
 *             .peeringType(&#34;AzurePrivatePeering&#34;)
 *             .expressRouteCircuitName(example2ExpressRouteCircuit.getName())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sharedKey(&#34;ItsASecret&#34;)
 *             .peerAsn(100)
 *             .primaryPeerAddressPrefix(&#34;192.168.1.0/30&#34;)
 *             .secondaryPeerAddressPrefix(&#34;192.168.1.0/30&#34;)
 *             .vlanId(100)
 *             .build());
 * 
 *         var exampleExpressRouteCircuitConnection = new ExpressRouteCircuitConnection(&#34;exampleExpressRouteCircuitConnection&#34;, ExpressRouteCircuitConnectionArgs.builder()        
 *             .peeringId(exampleExpressRouteCircuitPeering.getId())
 *             .peerPeeringId(example2ExpressRouteCircuitPeering.getId())
 *             .addressPrefixIpv4(&#34;192.169.9.0/29&#34;)
 *             .authorizationKey(&#34;846a1918-b7a2-4917-b43c-8c4cdaee006a&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Express Route Circuit Connections can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/expressRouteCircuitConnection:ExpressRouteCircuitConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/expressRouteCircuits/circuit1/peerings/peering1/connections/connection1
 * ```
 * 
 */
@ResourceType(type="azure:network/expressRouteCircuitConnection:ExpressRouteCircuitConnection")
public class ExpressRouteCircuitConnection extends com.pulumi.resources.CustomResource {
    /**
     * The IPv4 address space from which to allocate customer address for global reach. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    @Export(name="addressPrefixIpv4", type=String.class, parameters={})
    private Output<String> addressPrefixIpv4;

    /**
     * @return The IPv4 address space from which to allocate customer address for global reach. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    public Output<String> addressPrefixIpv4() {
        return this.addressPrefixIpv4;
    }
    /**
     * The IPv6 address space from which to allocate customer addresses for global reach.
     * 
     */
    @Export(name="addressPrefixIpv6", type=String.class, parameters={})
    private Output</* @Nullable */ String> addressPrefixIpv6;

    /**
     * @return The IPv6 address space from which to allocate customer addresses for global reach.
     * 
     */
    public Output<Optional<String>> addressPrefixIpv6() {
        return Codegen.optional(this.addressPrefixIpv6);
    }
    /**
     * The authorization key which is associated with the Express Route Circuit Connection.
     * 
     */
    @Export(name="authorizationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationKey;

    /**
     * @return The authorization key which is associated with the Express Route Circuit Connection.
     * 
     */
    public Output<Optional<String>> authorizationKey() {
        return Codegen.optional(this.authorizationKey);
    }
    /**
     * The name which should be used for this Express Route Circuit Connection. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Express Route Circuit Connection. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the peered Express Route Circuit Private Peering. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    @Export(name="peerPeeringId", type=String.class, parameters={})
    private Output<String> peerPeeringId;

    /**
     * @return The ID of the peered Express Route Circuit Private Peering. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    public Output<String> peerPeeringId() {
        return this.peerPeeringId;
    }
    /**
     * The ID of the Express Route Circuit Private Peering that this Express Route Circuit Connection connects with. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    @Export(name="peeringId", type=String.class, parameters={})
    private Output<String> peeringId;

    /**
     * @return The ID of the Express Route Circuit Private Peering that this Express Route Circuit Connection connects with. Changing this forces a new Express Route Circuit Connection to be created.
     * 
     */
    public Output<String> peeringId() {
        return this.peeringId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExpressRouteCircuitConnection(String name) {
        this(name, ExpressRouteCircuitConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressRouteCircuitConnection(String name, ExpressRouteCircuitConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressRouteCircuitConnection(String name, ExpressRouteCircuitConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/expressRouteCircuitConnection:ExpressRouteCircuitConnection", name, args == null ? ExpressRouteCircuitConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExpressRouteCircuitConnection(String name, Output<String> id, @Nullable ExpressRouteCircuitConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/expressRouteCircuitConnection:ExpressRouteCircuitConnection", name, state, makeResourceOptions(options, id));
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
    public static ExpressRouteCircuitConnection get(String name, Output<String> id, @Nullable ExpressRouteCircuitConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteCircuitConnection(name, id, state, options);
    }
}
