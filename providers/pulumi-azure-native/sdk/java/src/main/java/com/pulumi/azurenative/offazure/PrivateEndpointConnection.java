// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.offazure;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.offazure.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.offazure.outputs.PrivateEndpointConnectionPropertiesResponse;
import com.pulumi.azurenative.offazure.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * REST model used to encapsulate the user visible state of a PrivateEndpoint.
 * API Version: 2020-07-07.
 * 
 * ## Example Usage
 * ### Put privateEndpointConnection
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
 *             .peConnectionName(&#34;privateendpt1938mastersit9007pe.4f2f2970-0bfa-45d4-9ee1-d9f79502fc6f&#34;)
 *             .resourceGroupName(&#34;ayagrawrg&#34;)
 *             .siteName(&#34;privateendpt1938mastersite&#34;)
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
 * $ pulumi import azure-native:offazure:PrivateEndpointConnection privateendpt1938mastersit9007pe.4f2f2970-0bfa-45d4-9ee1-d9f79502fc6f /subscriptions/4bd2aa0f-2bd2-4d67-91a8-5a4533d58600/resourceGroups/ayagrawrg/providers/Microsoft.OffAzure/MasterSites/privateendpt1938mastersite/privateEndpointConnections/privateendpt1938mastersit9007pe.4f2f2970-0bfa-45d4-9ee1-d9f79502fc6f 
 * ```
 * 
 */
@ResourceType(type="azure-native:offazure:PrivateEndpointConnection")
public class PrivateEndpointConnection extends com.pulumi.resources.CustomResource {
    /**
     * Gets the tag for optimistic concurrency control.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output<String> eTag;

    /**
     * @return Gets the tag for optimistic concurrency control.
     * 
     */
    public Output<String> eTag() {
        return this.eTag;
    }
    /**
     * Gets the name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Gets the properties of the object.
     * 
     */
    @Export(name="properties", type=PrivateEndpointConnectionPropertiesResponse.class, parameters={})
    private Output<PrivateEndpointConnectionPropertiesResponse> properties;

    /**
     * @return Gets the properties of the object.
     * 
     */
    public Output<PrivateEndpointConnectionPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Gets the resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
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
        super("azure-native:offazure:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:offazure:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:offazure/v20200707:PrivateEndpointConnection").build())
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
