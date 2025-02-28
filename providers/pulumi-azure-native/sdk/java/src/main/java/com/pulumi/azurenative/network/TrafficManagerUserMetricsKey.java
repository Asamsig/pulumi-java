// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.TrafficManagerUserMetricsKeyArgs;
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
 * Class representing Traffic Manager User Metrics.
 * API Version: 2018-08-01.
 * 
 * ## Example Usage
 * ### TrafficManagerUserMetricsKeys-PUT
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
 *         var trafficManagerUserMetricsKey = new TrafficManagerUserMetricsKey(&#34;trafficManagerUserMetricsKey&#34;);
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
 * $ pulumi import azure-native:network:TrafficManagerUserMetricsKey default /providers/Microsoft.Network/trafficManagerUserMetricsKeys/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:TrafficManagerUserMetricsKey")
public class TrafficManagerUserMetricsKey extends com.pulumi.resources.CustomResource {
    /**
     * The key returned by the User Metrics operation.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output</* @Nullable */ String> key;

    /**
     * @return The key returned by the User Metrics operation.
     * 
     */
    public Output<Optional<String>> key() {
        return Codegen.optional(this.key);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficManagerUserMetricsKey(String name) {
        this(name, TrafficManagerUserMetricsKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficManagerUserMetricsKey(String name, @Nullable TrafficManagerUserMetricsKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficManagerUserMetricsKey(String name, @Nullable TrafficManagerUserMetricsKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:TrafficManagerUserMetricsKey", name, args == null ? TrafficManagerUserMetricsKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficManagerUserMetricsKey(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:TrafficManagerUserMetricsKey", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20180401:TrafficManagerUserMetricsKey").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:TrafficManagerUserMetricsKey").build())
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
    public static TrafficManagerUserMetricsKey get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrafficManagerUserMetricsKey(name, id, options);
    }
}
