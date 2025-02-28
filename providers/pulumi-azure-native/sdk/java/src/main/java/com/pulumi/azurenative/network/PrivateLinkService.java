// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.PrivateLinkServiceArgs;
import com.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.network.outputs.FrontendIPConfigurationResponse;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import com.pulumi.azurenative.network.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.network.outputs.PrivateLinkServiceIpConfigurationResponse;
import com.pulumi.azurenative.network.outputs.PrivateLinkServicePropertiesResponseAutoApproval;
import com.pulumi.azurenative.network.outputs.PrivateLinkServicePropertiesResponseVisibility;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Private link service resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### Create private link service
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
 *         var privateLinkService = new PrivateLinkService(&#34;privateLinkService&#34;, PrivateLinkServiceArgs.builder()        
 *             .autoApproval(Map.of(&#34;subscriptions&#34;,             
 *                 &#34;subscription1&#34;,
 *                 &#34;subscription2&#34;))
 *             .fqdns(            
 *                 &#34;fqdn1&#34;,
 *                 &#34;fqdn2&#34;,
 *                 &#34;fqdn3&#34;)
 *             .ipConfigurations(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;fe-lb&#34;),
 *                 Map.entry(&#34;privateIPAddress&#34;, &#34;10.0.1.4&#34;),
 *                 Map.entry(&#34;privateIPAddressVersion&#34;, &#34;IPv4&#34;),
 *                 Map.entry(&#34;privateIPAllocationMethod&#34;, &#34;Static&#34;),
 *                 Map.entry(&#34;subnet&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb&#34;))
 *             ))
 *             .loadBalancerFrontendIpConfigurations(Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb&#34;))
 *             .location(&#34;eastus&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .serviceName(&#34;testPls&#34;)
 *             .visibility(Map.of(&#34;subscriptions&#34;,             
 *                 &#34;subscription1&#34;,
 *                 &#34;subscription2&#34;,
 *                 &#34;subscription3&#34;))
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
 * $ pulumi import azure-native:network:PrivateLinkService testPls /subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateLinkServices/testPls 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:PrivateLinkService")
public class PrivateLinkService extends com.pulumi.resources.CustomResource {
    /**
     * The alias of the private link service.
     * 
     */
    @Export(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return The alias of the private link service.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * The auto-approval list of the private link service.
     * 
     */
    @Export(name="autoApproval", type=PrivateLinkServicePropertiesResponseAutoApproval.class, parameters={})
    private Output</* @Nullable */ PrivateLinkServicePropertiesResponseAutoApproval> autoApproval;

    /**
     * @return The auto-approval list of the private link service.
     * 
     */
    public Output<Optional<PrivateLinkServicePropertiesResponseAutoApproval>> autoApproval() {
        return Codegen.optional(this.autoApproval);
    }
    /**
     * Whether the private link service is enabled for proxy protocol or not.
     * 
     */
    @Export(name="enableProxyProtocol", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableProxyProtocol;

    /**
     * @return Whether the private link service is enabled for proxy protocol or not.
     * 
     */
    public Output<Optional<Boolean>> enableProxyProtocol() {
        return Codegen.optional(this.enableProxyProtocol);
    }
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
     * The extended location of the load balancer.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the load balancer.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
    }
    /**
     * The list of Fqdn.
     * 
     */
    @Export(name="fqdns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> fqdns;

    /**
     * @return The list of Fqdn.
     * 
     */
    public Output<Optional<List<String>>> fqdns() {
        return Codegen.optional(this.fqdns);
    }
    /**
     * An array of private link service IP configurations.
     * 
     */
    @Export(name="ipConfigurations", type=List.class, parameters={PrivateLinkServiceIpConfigurationResponse.class})
    private Output</* @Nullable */ List<PrivateLinkServiceIpConfigurationResponse>> ipConfigurations;

    /**
     * @return An array of private link service IP configurations.
     * 
     */
    public Output<Optional<List<PrivateLinkServiceIpConfigurationResponse>>> ipConfigurations() {
        return Codegen.optional(this.ipConfigurations);
    }
    /**
     * An array of references to the load balancer IP configurations.
     * 
     */
    @Export(name="loadBalancerFrontendIpConfigurations", type=List.class, parameters={FrontendIPConfigurationResponse.class})
    private Output</* @Nullable */ List<FrontendIPConfigurationResponse>> loadBalancerFrontendIpConfigurations;

    /**
     * @return An array of references to the load balancer IP configurations.
     * 
     */
    public Output<Optional<List<FrontendIPConfigurationResponse>>> loadBalancerFrontendIpConfigurations() {
        return Codegen.optional(this.loadBalancerFrontendIpConfigurations);
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
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
     * An array of references to the network interfaces created for this private link service.
     * 
     */
    @Export(name="networkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> networkInterfaces;

    /**
     * @return An array of references to the network interfaces created for this private link service.
     * 
     */
    public Output<List<NetworkInterfaceResponse>> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * An array of list about connections to the private endpoint.
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return An array of list about connections to the private endpoint.
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * The provisioning state of the private link service resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the private link service resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
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
     * The visibility list of the private link service.
     * 
     */
    @Export(name="visibility", type=PrivateLinkServicePropertiesResponseVisibility.class, parameters={})
    private Output</* @Nullable */ PrivateLinkServicePropertiesResponseVisibility> visibility;

    /**
     * @return The visibility list of the private link service.
     * 
     */
    public Output<Optional<PrivateLinkServicePropertiesResponseVisibility>> visibility() {
        return Codegen.optional(this.visibility);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkService(String name) {
        this(name, PrivateLinkServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkService(String name, PrivateLinkServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkService(String name, PrivateLinkServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateLinkService", name, args == null ? PrivateLinkServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkService(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateLinkService", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20190401:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:PrivateLinkService").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:PrivateLinkService").build())
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
    public static PrivateLinkService get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkService(name, id, options);
    }
}
