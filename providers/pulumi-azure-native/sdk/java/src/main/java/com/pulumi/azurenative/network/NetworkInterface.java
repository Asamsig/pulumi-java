// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.NetworkInterfaceArgs;
import com.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceDnsSettingsResponse;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationResponse;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceTapConfigurationResponse;
import com.pulumi.azurenative.network.outputs.NetworkSecurityGroupResponse;
import com.pulumi.azurenative.network.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.network.outputs.PrivateLinkServiceResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
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
 * A network interface in a resource group.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### Create network interface
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
 *         var networkInterface = new NetworkInterface(&#34;networkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .enableAcceleratedNetworking(true)
 *             .ipConfigurations(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;ipconfig1&#34;),
 *                 Map.entry(&#34;publicIPAddress&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/test-ip&#34;)),
 *                 Map.entry(&#34;subnet&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/rg1-vnet/subnets/default&#34;))
 *             ))
 *             .location(&#34;eastus&#34;)
 *             .networkInterfaceName(&#34;test-nic&#34;)
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
 * $ pulumi import azure-native:network:NetworkInterface test-nic /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkInterfaces/test-nic 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:NetworkInterface")
public class NetworkInterface extends com.pulumi.resources.CustomResource {
    /**
     * The DNS settings in network interface.
     * 
     */
    @Export(name="dnsSettings", type=NetworkInterfaceDnsSettingsResponse.class, parameters={})
    private Output</* @Nullable */ NetworkInterfaceDnsSettingsResponse> dnsSettings;

    /**
     * @return The DNS settings in network interface.
     * 
     */
    public Output<Optional<NetworkInterfaceDnsSettingsResponse>> dnsSettings() {
        return Codegen.optional(this.dnsSettings);
    }
    /**
     * A reference to the dscp configuration to which the network interface is linked.
     * 
     */
    @Export(name="dscpConfiguration", type=SubResourceResponse.class, parameters={})
    private Output<SubResourceResponse> dscpConfiguration;

    /**
     * @return A reference to the dscp configuration to which the network interface is linked.
     * 
     */
    public Output<SubResourceResponse> dscpConfiguration() {
        return this.dscpConfiguration;
    }
    /**
     * If the network interface is accelerated networking enabled.
     * 
     */
    @Export(name="enableAcceleratedNetworking", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAcceleratedNetworking;

    /**
     * @return If the network interface is accelerated networking enabled.
     * 
     */
    public Output<Optional<Boolean>> enableAcceleratedNetworking() {
        return Codegen.optional(this.enableAcceleratedNetworking);
    }
    /**
     * Indicates whether IP forwarding is enabled on this network interface.
     * 
     */
    @Export(name="enableIPForwarding", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableIPForwarding;

    /**
     * @return Indicates whether IP forwarding is enabled on this network interface.
     * 
     */
    public Output<Optional<Boolean>> enableIPForwarding() {
        return Codegen.optional(this.enableIPForwarding);
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
     * The extended location of the network interface.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the network interface.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
    }
    /**
     * A list of references to linked BareMetal resources.
     * 
     */
    @Export(name="hostedWorkloads", type=List.class, parameters={String.class})
    private Output<List<String>> hostedWorkloads;

    /**
     * @return A list of references to linked BareMetal resources.
     * 
     */
    public Output<List<String>> hostedWorkloads() {
        return this.hostedWorkloads;
    }
    /**
     * A list of IPConfigurations of the network interface.
     * 
     */
    @Export(name="ipConfigurations", type=List.class, parameters={NetworkInterfaceIPConfigurationResponse.class})
    private Output</* @Nullable */ List<NetworkInterfaceIPConfigurationResponse>> ipConfigurations;

    /**
     * @return A list of IPConfigurations of the network interface.
     * 
     */
    public Output<Optional<List<NetworkInterfaceIPConfigurationResponse>>> ipConfigurations() {
        return Codegen.optional(this.ipConfigurations);
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
     * The MAC address of the network interface.
     * 
     */
    @Export(name="macAddress", type=String.class, parameters={})
    private Output<String> macAddress;

    /**
     * @return The MAC address of the network interface.
     * 
     */
    public Output<String> macAddress() {
        return this.macAddress;
    }
    /**
     * Migration phase of Network Interface resource.
     * 
     */
    @Export(name="migrationPhase", type=String.class, parameters={})
    private Output</* @Nullable */ String> migrationPhase;

    /**
     * @return Migration phase of Network Interface resource.
     * 
     */
    public Output<Optional<String>> migrationPhase() {
        return Codegen.optional(this.migrationPhase);
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
     * The reference to the NetworkSecurityGroup resource.
     * 
     */
    @Export(name="networkSecurityGroup", type=NetworkSecurityGroupResponse.class, parameters={})
    private Output</* @Nullable */ NetworkSecurityGroupResponse> networkSecurityGroup;

    /**
     * @return The reference to the NetworkSecurityGroup resource.
     * 
     */
    public Output<Optional<NetworkSecurityGroupResponse>> networkSecurityGroup() {
        return Codegen.optional(this.networkSecurityGroup);
    }
    /**
     * Type of Network Interface resource.
     * 
     */
    @Export(name="nicType", type=String.class, parameters={})
    private Output</* @Nullable */ String> nicType;

    /**
     * @return Type of Network Interface resource.
     * 
     */
    public Output<Optional<String>> nicType() {
        return Codegen.optional(this.nicType);
    }
    /**
     * Whether this is a primary network interface on a virtual machine.
     * 
     */
    @Export(name="primary", type=Boolean.class, parameters={})
    private Output<Boolean> primary;

    /**
     * @return Whether this is a primary network interface on a virtual machine.
     * 
     */
    public Output<Boolean> primary() {
        return this.primary;
    }
    /**
     * A reference to the private endpoint to which the network interface is linked.
     * 
     */
    @Export(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output<PrivateEndpointResponse> privateEndpoint;

    /**
     * @return A reference to the private endpoint to which the network interface is linked.
     * 
     */
    public Output<PrivateEndpointResponse> privateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * Privatelinkservice of the network interface resource.
     * 
     */
    @Export(name="privateLinkService", type=PrivateLinkServiceResponse.class, parameters={})
    private Output</* @Nullable */ PrivateLinkServiceResponse> privateLinkService;

    /**
     * @return Privatelinkservice of the network interface resource.
     * 
     */
    public Output<Optional<PrivateLinkServiceResponse>> privateLinkService() {
        return Codegen.optional(this.privateLinkService);
    }
    /**
     * The provisioning state of the network interface resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the network interface resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the network interface resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the network interface resource.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
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
     * A list of TapConfigurations of the network interface.
     * 
     */
    @Export(name="tapConfigurations", type=List.class, parameters={NetworkInterfaceTapConfigurationResponse.class})
    private Output<List<NetworkInterfaceTapConfigurationResponse>> tapConfigurations;

    /**
     * @return A list of TapConfigurations of the network interface.
     * 
     */
    public Output<List<NetworkInterfaceTapConfigurationResponse>> tapConfigurations() {
        return this.tapConfigurations;
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
     * The reference to a virtual machine.
     * 
     */
    @Export(name="virtualMachine", type=SubResourceResponse.class, parameters={})
    private Output<SubResourceResponse> virtualMachine;

    /**
     * @return The reference to a virtual machine.
     * 
     */
    public Output<SubResourceResponse> virtualMachine() {
        return this.virtualMachine;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInterface(String name) {
        this(name, NetworkInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInterface(String name, NetworkInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInterface(String name, NetworkInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkInterface", name, args == null ? NetworkInterfaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkInterface(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkInterface", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150501preview:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20150615:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160330:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160901:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:NetworkInterface").build())
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
    public static NetworkInterface get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterface(name, id, options);
    }
}
