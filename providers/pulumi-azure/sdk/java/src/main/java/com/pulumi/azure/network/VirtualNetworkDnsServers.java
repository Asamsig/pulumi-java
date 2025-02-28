// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.VirtualNetworkDnsServersArgs;
import com.pulumi.azure.network.inputs.VirtualNetworkDnsServersState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .subnets(VirtualNetworkSubnet.builder()
 *                 .name(&#34;subnet1&#34;)
 *                 .addressPrefix(&#34;10.0.1.0/24&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleVirtualNetworkDnsServers = new VirtualNetworkDnsServers(&#34;exampleVirtualNetworkDnsServers&#34;, VirtualNetworkDnsServersArgs.builder()        
 *             .virtualNetworkId(exampleVirtualNetwork.getId())
 *             .dnsServers(            
 *                 &#34;10.7.7.2&#34;,
 *                 &#34;10.7.7.7&#34;,
 *                 &#34;10.7.7.1&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Virtual Network DNS Servers can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/virtualNetworkDnsServers:VirtualNetworkDnsServers exampleNetwork /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/virtualNetworks/myvnet1/dnsServers/default
 * ```
 * 
 */
@ResourceType(type="azure:network/virtualNetworkDnsServers:VirtualNetworkDnsServers")
public class VirtualNetworkDnsServers extends com.pulumi.resources.CustomResource {
    /**
     * List of IP addresses of DNS servers
     * 
     */
    @Export(name="dnsServers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> dnsServers;

    /**
     * @return List of IP addresses of DNS servers
     * 
     */
    public Output<Optional<List<String>>> dnsServers() {
        return Codegen.optional(this.dnsServers);
    }
    /**
     * The ID of the Virtual Network that should be linked to the DNS Zone. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualNetworkId", type=String.class, parameters={})
    private Output<String> virtualNetworkId;

    /**
     * @return The ID of the Virtual Network that should be linked to the DNS Zone. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkDnsServers(String name) {
        this(name, VirtualNetworkDnsServersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkDnsServers(String name, VirtualNetworkDnsServersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkDnsServers(String name, VirtualNetworkDnsServersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualNetworkDnsServers:VirtualNetworkDnsServers", name, args == null ? VirtualNetworkDnsServersArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualNetworkDnsServers(String name, Output<String> id, @Nullable VirtualNetworkDnsServersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualNetworkDnsServers:VirtualNetworkDnsServers", name, state, makeResourceOptions(options, id));
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
    public static VirtualNetworkDnsServers get(String name, Output<String> id, @Nullable VirtualNetworkDnsServersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkDnsServers(name, id, state, options);
    }
}
