// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storsimple.ManagerArgs;
import com.pulumi.azurenative.storsimple.outputs.ManagerIntrinsicSettingsResponse;
import com.pulumi.azurenative.storsimple.outputs.ManagerSkuResponse;
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
 * The StorSimple Manager.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * ### ManagersCreateOrUpdate
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
 *         var manager = new Manager(&#34;manager&#34;, ManagerArgs.builder()        
 *             .cisIntrinsicSettings(Map.of(&#34;type&#34;, &#34;GardaV1&#34;))
 *             .location(&#34;westus&#34;)
 *             .managerName(&#34;ManagerForSDKTest2&#34;)
 *             .resourceGroupName(&#34;ResourceGroupForSDKTest&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;Standard&#34;))
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
 * $ pulumi import azure-native:storsimple:Manager ManagerForSDKTest2 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.StorSimple/Managers/ManagerForSDKTest2 
 * ```
 * 
 */
@ResourceType(type="azure-native:storsimple:Manager")
public class Manager extends com.pulumi.resources.CustomResource {
    /**
     * Represents the type of StorSimple Manager.
     * 
     */
    @Export(name="cisIntrinsicSettings", type=ManagerIntrinsicSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ManagerIntrinsicSettingsResponse> cisIntrinsicSettings;

    /**
     * @return Represents the type of StorSimple Manager.
     * 
     */
    public Output<Optional<ManagerIntrinsicSettingsResponse>> cisIntrinsicSettings() {
        return Codegen.optional(this.cisIntrinsicSettings);
    }
    /**
     * The etag of the manager.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return The etag of the manager.
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * The geo location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo location of the resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the state of the resource as it is getting provisioned. Value of &#34;Succeeded&#34; means the Manager was successfully created.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Specifies the state of the resource as it is getting provisioned. Value of &#34;Succeeded&#34; means the Manager was successfully created.
     * 
     */
    public Output<Optional<String>> provisioningState() {
        return Codegen.optional(this.provisioningState);
    }
    /**
     * Specifies the Sku.
     * 
     */
    @Export(name="sku", type=ManagerSkuResponse.class, parameters={})
    private Output</* @Nullable */ ManagerSkuResponse> sku;

    /**
     * @return Specifies the Sku.
     * 
     */
    public Output<Optional<ManagerSkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * The tags attached to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags attached to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Manager(String name) {
        this(name, ManagerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Manager(String name, ManagerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Manager(String name, ManagerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Manager", name, args == null ? ManagerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Manager(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:Manager", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storsimple/v20161001:Manager").build()),
                Output.of(Alias.builder().type("azure-native:storsimple/v20170601:Manager").build())
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
    public static Manager get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Manager(name, id, options);
    }
}
