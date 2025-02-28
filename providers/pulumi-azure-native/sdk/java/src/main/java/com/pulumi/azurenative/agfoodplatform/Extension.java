// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.agfoodplatform;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.agfoodplatform.ExtensionArgs;
import com.pulumi.azurenative.agfoodplatform.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Extension resource.
 * API Version: 2020-05-12-preview.
 * 
 * ## Example Usage
 * ### Extensions_Create
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
 *         var extension = new Extension(&#34;extension&#34;, ExtensionArgs.builder()        
 *             .extensionId(&#34;provider.extension&#34;)
 *             .farmBeatsResourceName(&#34;examples-farmbeatsResourceName&#34;)
 *             .resourceGroupName(&#34;examples-rg&#34;)
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
 * $ pulumi import azure-native:agfoodplatform:Extension provider.extension /subscriptions/11111111-2222-3333-4444-555555555555/resourceGroups/examples-rg/Microsoft.AgFoodPlatform/farmBeats/examples-farmbeatsResourceName/extensions/provider.extension 
 * ```
 * 
 */
@ResourceType(type="azure-native:agfoodplatform:Extension")
public class Extension extends com.pulumi.resources.CustomResource {
    /**
     * The ETag value to implement optimistic concurrency.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output<String> eTag;

    /**
     * @return The ETag value to implement optimistic concurrency.
     * 
     */
    public Output<String> eTag() {
        return this.eTag;
    }
    /**
     * Extension api docs link.
     * 
     */
    @Export(name="extensionApiDocsLink", type=String.class, parameters={})
    private Output<String> extensionApiDocsLink;

    /**
     * @return Extension api docs link.
     * 
     */
    public Output<String> extensionApiDocsLink() {
        return this.extensionApiDocsLink;
    }
    /**
     * Extension auth link.
     * 
     */
    @Export(name="extensionAuthLink", type=String.class, parameters={})
    private Output<String> extensionAuthLink;

    /**
     * @return Extension auth link.
     * 
     */
    public Output<String> extensionAuthLink() {
        return this.extensionAuthLink;
    }
    /**
     * Extension category. e.g. weather/sensor/satellite.
     * 
     */
    @Export(name="extensionCategory", type=String.class, parameters={})
    private Output<String> extensionCategory;

    /**
     * @return Extension category. e.g. weather/sensor/satellite.
     * 
     */
    public Output<String> extensionCategory() {
        return this.extensionCategory;
    }
    /**
     * Extension Id.
     * 
     */
    @Export(name="extensionId", type=String.class, parameters={})
    private Output<String> extensionId;

    /**
     * @return Extension Id.
     * 
     */
    public Output<String> extensionId() {
        return this.extensionId;
    }
    /**
     * Installed extension version.
     * 
     */
    @Export(name="installedExtensionVersion", type=String.class, parameters={})
    private Output<String> installedExtensionVersion;

    /**
     * @return Installed extension version.
     * 
     */
    public Output<String> installedExtensionVersion() {
        return this.installedExtensionVersion;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Extension(String name) {
        this(name, ExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Extension(String name, ExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Extension(String name, ExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:agfoodplatform:Extension", name, args == null ? ExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Extension(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:agfoodplatform:Extension", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:agfoodplatform/v20200512preview:Extension").build())
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
    public static Extension get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Extension(name, id, options);
    }
}
