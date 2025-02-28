// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RouterInterfaceArgs;
import com.pulumi.gcp.compute.inputs.RouterInterfaceState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Cloud Router interface. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/cloudrouter)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/routers).
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
 *         var foobar = new RouterInterface(&#34;foobar&#34;, RouterInterfaceArgs.builder()        
 *             .ipRange(&#34;169.254.1.1/30&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .router(&#34;router-1&#34;)
 *             .vpnTunnel(&#34;tunnel-1&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Router interfaces can be imported using the `region`, `router`, and `name`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerInterface:RouterInterface foobar us-central1/router-1/interface-1
 * ```
 * 
 */
@ResourceType(type="gcp:compute/routerInterface:RouterInterface")
public class RouterInterface extends com.pulumi.resources.CustomResource {
    /**
     * The name or resource link to the
     * VLAN interconnect for this interface. Changing this forces a new interface to
     * be created. Only one of `vpn_tunnel` and `interconnect_attachment` can be
     * specified.
     * 
     */
    @Export(name="interconnectAttachment", type=String.class, parameters={})
    private Output</* @Nullable */ String> interconnectAttachment;

    /**
     * @return The name or resource link to the
     * VLAN interconnect for this interface. Changing this forces a new interface to
     * be created. Only one of `vpn_tunnel` and `interconnect_attachment` can be
     * specified.
     * 
     */
    public Output<Optional<String>> interconnectAttachment() {
        return Codegen.optional(this.interconnectAttachment);
    }
    /**
     * IP address and range of the interface. The IP range must be
     * in the RFC3927 link-local IP space. Changing this forces a new interface to be created.
     * 
     */
    @Export(name="ipRange", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipRange;

    /**
     * @return IP address and range of the interface. The IP range must be
     * in the RFC3927 link-local IP space. Changing this forces a new interface to be created.
     * 
     */
    public Output<Optional<String>> ipRange() {
        return Codegen.optional(this.ipRange);
    }
    /**
     * A unique name for the interface, required by GCE. Changing
     * this forces a new interface to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the interface, required by GCE. Changing
     * this forces a new interface to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which this interface&#39;s router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new interface to be created.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which this interface&#39;s router belongs. If it
     * is not provided, the provider project is used. Changing this forces a new interface to be created.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region this interface&#39;s router sits in. If not specified,
     * the project region will be used. Changing this forces a new interface to be
     * created.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region this interface&#39;s router sits in. If not specified,
     * the project region will be used. Changing this forces a new interface to be
     * created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The name of the router this interface will be attached to.
     * Changing this forces a new interface to be created.
     * 
     */
    @Export(name="router", type=String.class, parameters={})
    private Output<String> router;

    /**
     * @return The name of the router this interface will be attached to.
     * Changing this forces a new interface to be created.
     * 
     */
    public Output<String> router() {
        return this.router;
    }
    /**
     * The name or resource link to the VPN tunnel this
     * interface will be linked to. Changing this forces a new interface to be created. Only
     * one of `vpn_tunnel` and `interconnect_attachment` can be specified.
     * 
     */
    @Export(name="vpnTunnel", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnTunnel;

    /**
     * @return The name or resource link to the VPN tunnel this
     * interface will be linked to. Changing this forces a new interface to be created. Only
     * one of `vpn_tunnel` and `interconnect_attachment` can be specified.
     * 
     */
    public Output<Optional<String>> vpnTunnel() {
        return Codegen.optional(this.vpnTunnel);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouterInterface(String name) {
        this(name, RouterInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouterInterface(String name, RouterInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterInterface(String name, RouterInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerInterface:RouterInterface", name, args == null ? RouterInterfaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouterInterface(String name, Output<String> id, @Nullable RouterInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerInterface:RouterInterface", name, state, makeResourceOptions(options, id));
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
    public static RouterInterface get(String name, Output<String> id, @Nullable RouterInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouterInterface(name, id, state, options);
    }
}
