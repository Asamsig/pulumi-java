// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.IpGroupArgs;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
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
 * The IpGroups resource information.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### CreateOrUpdate_IpGroups
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
 *         var ipGroup = new IpGroup(&#34;ipGroup&#34;, IpGroupArgs.builder()        
 *             .ipAddresses(            
 *                 &#34;13.64.39.16/32&#34;,
 *                 &#34;40.74.146.80/31&#34;,
 *                 &#34;40.74.147.32/28&#34;)
 *             .ipGroupsName(&#34;ipGroups1&#34;)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .tags(Map.of(&#34;key1&#34;, &#34;value1&#34;))
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
 * $ pulumi import azure-native:network:IpGroup ipGroups1 /subscriptions/subId/providers/Microsoft.Network/resourceGroup/myResourceGroup/ipGroups/ipGroups1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:IpGroup")
public class IpGroup extends com.pulumi.resources.CustomResource {
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
     * List of references to Firewall Policies resources that this IpGroups is associated with.
     * 
     */
    @Export(name="firewallPolicies", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> firewallPolicies;

    /**
     * @return List of references to Firewall Policies resources that this IpGroups is associated with.
     * 
     */
    public Output<List<SubResourceResponse>> firewallPolicies() {
        return this.firewallPolicies;
    }
    /**
     * List of references to Firewall resources that this IpGroups is associated with.
     * 
     */
    @Export(name="firewalls", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> firewalls;

    /**
     * @return List of references to Firewall resources that this IpGroups is associated with.
     * 
     */
    public Output<List<SubResourceResponse>> firewalls() {
        return this.firewalls;
    }
    /**
     * IpAddresses/IpAddressPrefixes in the IpGroups resource.
     * 
     */
    @Export(name="ipAddresses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ipAddresses;

    /**
     * @return IpAddresses/IpAddressPrefixes in the IpGroups resource.
     * 
     */
    public Output<Optional<List<String>>> ipAddresses() {
        return Codegen.optional(this.ipAddresses);
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
     * The provisioning state of the IpGroups resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the IpGroups resource.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpGroup(String name) {
        this(name, IpGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpGroup(String name, IpGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpGroup(String name, IpGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:IpGroup", name, args == null ? IpGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IpGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:IpGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20190901:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:IpGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:IpGroup").build())
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
    public static IpGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpGroup(name, id, options);
    }
}
