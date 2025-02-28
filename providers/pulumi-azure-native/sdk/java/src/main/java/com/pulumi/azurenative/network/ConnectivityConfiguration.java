// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.ConnectivityConfigurationArgs;
import com.pulumi.azurenative.network.outputs.ConnectivityGroupItemResponse;
import com.pulumi.azurenative.network.outputs.HubResponse;
import com.pulumi.azurenative.network.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The network manager connectivity configuration resource
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * ### ConnectivityConfigurationsPut
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
 *         var connectivityConfiguration = new ConnectivityConfiguration(&#34;connectivityConfiguration&#34;, ConnectivityConfigurationArgs.builder()        
 *             .appliesToGroups(Map.ofEntries(
 *                 Map.entry(&#34;groupConnectivity&#34;, &#34;None&#34;),
 *                 Map.entry(&#34;isGlobal&#34;, &#34;False&#34;),
 *                 Map.entry(&#34;networkGroupId&#34;, &#34;subscriptions/subscriptionA/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkManagers/testNetworkManager/networkGroups/group1&#34;),
 *                 Map.entry(&#34;useHubGateway&#34;, &#34;True&#34;)
 *             ))
 *             .configurationName(&#34;myTestConnectivityConfig&#34;)
 *             .connectivityTopology(&#34;HubAndSpoke&#34;)
 *             .deleteExistingPeering(&#34;True&#34;)
 *             .description(&#34;Sample Configuration&#34;)
 *             .displayName(&#34;myTestConnectivityConfig&#34;)
 *             .hubs(Map.ofEntries(
 *                 Map.entry(&#34;resourceId&#34;, &#34;subscriptions/subscriptionA/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/myTestConnectivityConfig&#34;),
 *                 Map.entry(&#34;resourceType&#34;, &#34;Microsoft.Network/virtualNetworks&#34;)
 *             ))
 *             .isGlobal(&#34;True&#34;)
 *             .networkManagerName(&#34;testNetworkManager&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
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
 * $ pulumi import azure-native:network:ConnectivityConfiguration myTestConnectivityConfig subscriptions/subscriptionA/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkManagers/testNetworkManager/connectivityConfigurations/myTestConnectivityConfig 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:ConnectivityConfiguration")
public class ConnectivityConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Groups for configuration
     * 
     */
    @Export(name="appliesToGroups", type=List.class, parameters={ConnectivityGroupItemResponse.class})
    private Output</* @Nullable */ List<ConnectivityGroupItemResponse>> appliesToGroups;

    /**
     * @return Groups for configuration
     * 
     */
    public Output<Optional<List<ConnectivityGroupItemResponse>>> appliesToGroups() {
        return Codegen.optional(this.appliesToGroups);
    }
    /**
     * Connectivity topology type.
     * 
     */
    @Export(name="connectivityTopology", type=String.class, parameters={})
    private Output<String> connectivityTopology;

    /**
     * @return Connectivity topology type.
     * 
     */
    public Output<String> connectivityTopology() {
        return this.connectivityTopology;
    }
    /**
     * Flag if need to remove current existing peerings.
     * 
     */
    @Export(name="deleteExistingPeering", type=String.class, parameters={})
    private Output</* @Nullable */ String> deleteExistingPeering;

    /**
     * @return Flag if need to remove current existing peerings.
     * 
     */
    public Output<Optional<String>> deleteExistingPeering() {
        return Codegen.optional(this.deleteExistingPeering);
    }
    /**
     * A description of the connectivity configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the connectivity configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A friendly name for the resource.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return A friendly name for the resource.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
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
     * List of hubItems
     * 
     */
    @Export(name="hubs", type=List.class, parameters={HubResponse.class})
    private Output</* @Nullable */ List<HubResponse>> hubs;

    /**
     * @return List of hubItems
     * 
     */
    public Output<Optional<List<HubResponse>>> hubs() {
        return Codegen.optional(this.hubs);
    }
    /**
     * Flag if global mesh is supported.
     * 
     */
    @Export(name="isGlobal", type=String.class, parameters={})
    private Output</* @Nullable */ String> isGlobal;

    /**
     * @return Flag if global mesh is supported.
     * 
     */
    public Output<Optional<String>> isGlobal() {
        return Codegen.optional(this.isGlobal);
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
     * The provisioning state of the connectivity configuration resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the connectivity configuration resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata related to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public ConnectivityConfiguration(String name) {
        this(name, ConnectivityConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectivityConfiguration(String name, ConnectivityConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectivityConfiguration(String name, ConnectivityConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ConnectivityConfiguration", name, args == null ? ConnectivityConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectivityConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ConnectivityConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20210201preview:ConnectivityConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501preview:ConnectivityConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20220201preview:ConnectivityConfiguration").build())
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
    public static ConnectivityConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectivityConfiguration(name, id, options);
    }
}
