// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventgrid.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.eventgrid.outputs.ConnectionStateResponse;
import com.pulumi.azurenative.eventgrid.outputs.PrivateEndpointResponse;
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
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * ### PrivateEndpointConnections_Update
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
 *         var privateEndpointConnection = new PrivateEndpointConnection(&#34;privateEndpointConnection&#34;, PrivateEndpointConnectionArgs.builder()        
 *             .parentName(&#34;exampletopic1&#34;)
 *             .parentType(&#34;topics&#34;)
 *             .privateEndpointConnectionName(&#34;BMTPE5.8A30D251-4C61-489D-A1AA-B37C4A329B8B&#34;)
 *             .privateLinkServiceConnectionState(Map.ofEntries(
 *                 Map.entry(&#34;actionsRequired&#34;, &#34;None&#34;),
 *                 Map.entry(&#34;description&#34;, &#34;approving connection&#34;),
 *                 Map.entry(&#34;status&#34;, &#34;Approved&#34;)
 *             ))
 *             .resourceGroupName(&#34;examplerg&#34;)
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
 * $ pulumi import azure-native:eventgrid:PrivateEndpointConnection BMTPE5.8A30D251-4C61-489D-A1AA-B37C4A329B8B /subscriptions/5B4B650E-28B9-4790-B3AB-DDBD88D727C4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic1/privateEndpointConnections/BMTPE5.8A30D251-4C61-489D-A1AA-B37C4A329B8B 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventgrid:PrivateEndpointConnection")
public class PrivateEndpointConnection extends com.pulumi.resources.CustomResource {
    /**
     * GroupIds from the private link service resource.
     * 
     */
    @Export(name="groupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> groupIds;

    /**
     * @return GroupIds from the private link service resource.
     * 
     */
    public Output<Optional<List<String>>> groupIds() {
        return Codegen.optional(this.groupIds);
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Private Endpoint resource for this Connection.
     * 
     */
    @Export(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output</* @Nullable */ PrivateEndpointResponse> privateEndpoint;

    /**
     * @return The Private Endpoint resource for this Connection.
     * 
     */
    public Output<Optional<PrivateEndpointResponse>> privateEndpoint() {
        return Codegen.optional(this.privateEndpoint);
    }
    /**
     * Details about the state of the connection.
     * 
     */
    @Export(name="privateLinkServiceConnectionState", type=ConnectionStateResponse.class, parameters={})
    private Output</* @Nullable */ ConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return Details about the state of the connection.
     * 
     */
    public Output<Optional<ConnectionStateResponse>> privateLinkServiceConnectionState() {
        return Codegen.optional(this.privateLinkServiceConnectionState);
    }
    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Provisioning state of the Private Endpoint Connection.
     * 
     */
    public Output<Optional<String>> provisioningState() {
        return Codegen.optional(this.provisioningState);
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateEndpointConnection(String name) {
        this(name, PrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventgrid/v20200401preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20200601:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20201015preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20210601preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20211015preview:PrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20211201:PrivateEndpointConnection").build())
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
    public static PrivateEndpointConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
