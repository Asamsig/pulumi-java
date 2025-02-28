// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.ContentItemArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Content type contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### ApiManagementCreateContentTypeContentItem
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
 *         var contentItem = new ContentItem(&#34;contentItem&#34;, ContentItemArgs.builder()        
 *             .contentItemId(&#34;4e3cf6a5-574a-ba08-1f23-2e7a38faa6d8&#34;)
 *             .contentTypeId(&#34;page&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .serviceName(&#34;apimService1&#34;)
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
 * $ pulumi import azure-native:apimanagement:ContentItem 4e3cf6a5-574a-ba08-1f23-2e7a38faa6d8 /contentTypes/page/contentItems/4e3cf6a5-574a-ba08-1f23-2e7a38faa6d8 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ContentItem")
public class ContentItem extends com.pulumi.resources.CustomResource {
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
     * Properties of the content item.
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Properties of the content item.
     * 
     */
    public Output<Object> properties() {
        return this.properties;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContentItem(String name) {
        this(name, ContentItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContentItem(String name, ContentItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContentItem(String name, ContentItemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ContentItem", name, args == null ? ContentItemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContentItem(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ContentItem", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:ContentItem").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:ContentItem").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:ContentItem").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:ContentItem").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:ContentItem").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:ContentItem").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20211201preview:ContentItem").build())
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
    public static ContentItem get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContentItem(name, id, options);
    }
}
