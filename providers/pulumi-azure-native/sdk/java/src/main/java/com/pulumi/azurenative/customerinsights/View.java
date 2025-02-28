// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.customerinsights.ViewArgs;
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
 * The view resource format.
 * API Version: 2017-04-26.
 * 
 * ## Example Usage
 * ### Views_CreateOrUpdate
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
 *         var view = new View(&#34;view&#34;, ViewArgs.builder()        
 *             .definition(&#34;{\\\&#34;isProfileType\\\&#34;:false,\\\&#34;profileTypes\\\&#34;:[],\\\&#34;widgets\\\&#34;:[],\\\&#34;style\\\&#34;:[]}&#34;)
 *             .displayName(Map.of(&#34;en&#34;, &#34;some name&#34;))
 *             .hubName(&#34;sdkTestHub&#34;)
 *             .resourceGroupName(&#34;TestHubRG&#34;)
 *             .userId(&#34;testUser&#34;)
 *             .viewName(&#34;testView&#34;)
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
 * $ pulumi import azure-native:customerinsights:View sdkTestHub/testView /subscriptions/c909e979-ef71-4def-a970-bc7c154db8c5/resourceGroups/TestHubRG/providers/Microsoft.CustomerInsights/hubs/sdkTestHub/views/testView 
 * ```
 * 
 */
@ResourceType(type="azure-native:customerinsights:View")
public class View extends com.pulumi.resources.CustomResource {
    /**
     * Date time when view was last modified.
     * 
     */
    @Export(name="changed", type=String.class, parameters={})
    private Output<String> changed;

    /**
     * @return Date time when view was last modified.
     * 
     */
    public Output<String> changed() {
        return this.changed;
    }
    /**
     * Date time when view was created.
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return Date time when view was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * View definition.
     * 
     */
    @Export(name="definition", type=String.class, parameters={})
    private Output<String> definition;

    /**
     * @return View definition.
     * 
     */
    public Output<String> definition() {
        return this.definition;
    }
    /**
     * Localized display name for the view.
     * 
     */
    @Export(name="displayName", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> displayName;

    /**
     * @return Localized display name for the view.
     * 
     */
    public Output<Optional<Map<String,String>>> displayName() {
        return Codegen.optional(this.displayName);
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
     * the hub name.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return the hub name.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
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
     * the user ID.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output</* @Nullable */ String> userId;

    /**
     * @return the user ID.
     * 
     */
    public Output<Optional<String>> userId() {
        return Codegen.optional(this.userId);
    }
    /**
     * Name of the view.
     * 
     */
    @Export(name="viewName", type=String.class, parameters={})
    private Output<String> viewName;

    /**
     * @return Name of the view.
     * 
     */
    public Output<String> viewName() {
        return this.viewName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public View(String name) {
        this(name, ViewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public View(String name, ViewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public View(String name, ViewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:View", name, args == null ? ViewArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private View(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:View", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170101:View").build()),
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170426:View").build())
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
    public static View get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new View(name, id, options);
    }
}
