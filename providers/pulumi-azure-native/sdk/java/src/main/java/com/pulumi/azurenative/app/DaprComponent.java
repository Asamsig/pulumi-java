// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.app.DaprComponentArgs;
import com.pulumi.azurenative.app.outputs.DaprMetadataResponse;
import com.pulumi.azurenative.app.outputs.SecretResponse;
import com.pulumi.azurenative.app.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Dapr Component.
 * API Version: 2022-03-01.
 * 
 * ## Example Usage
 * ### Create or update dapr component
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
 *         var daprComponent = new DaprComponent(&#34;daprComponent&#34;, DaprComponentArgs.builder()        
 *             .componentType(&#34;state.azure.cosmosdb&#34;)
 *             .environmentName(&#34;myenvironment&#34;)
 *             .ignoreErrors(false)
 *             .initTimeout(&#34;50s&#34;)
 *             .metadata(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;url&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;&lt;COSMOS-URL&gt;&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;database&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;itemsDB&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;collection&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;items&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;masterkey&#34;),
 *                     Map.entry(&#34;secretRef&#34;, &#34;masterkey&#34;)
 *                 ))
 *             .name(&#34;reddog&#34;)
 *             .resourceGroupName(&#34;examplerg&#34;)
 *             .scopes(            
 *                 &#34;container-app-1&#34;,
 *                 &#34;container-app-2&#34;)
 *             .secrets(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;masterkey&#34;),
 *                 Map.entry(&#34;value&#34;, &#34;keyvalue&#34;)
 *             ))
 *             .version(&#34;v1&#34;)
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
 * $ pulumi import azure-native:app:DaprComponent reddog /subscriptions/8efdecc5-919e-44eb-b179-915dca89ebf9/resourceGroups/examplerg/providers/Microsoft.App/managedEnvironments/jlaw-demo1/daprcomponents/reddog 
 * ```
 * 
 */
@ResourceType(type="azure-native:app:DaprComponent")
public class DaprComponent extends com.pulumi.resources.CustomResource {
    /**
     * Component type
     * 
     */
    @Export(name="componentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> componentType;

    /**
     * @return Component type
     * 
     */
    public Output<Optional<String>> componentType() {
        return Codegen.optional(this.componentType);
    }
    /**
     * Boolean describing if the component errors are ignores
     * 
     */
    @Export(name="ignoreErrors", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreErrors;

    /**
     * @return Boolean describing if the component errors are ignores
     * 
     */
    public Output<Optional<Boolean>> ignoreErrors() {
        return Codegen.optional(this.ignoreErrors);
    }
    /**
     * Initialization timeout
     * 
     */
    @Export(name="initTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> initTimeout;

    /**
     * @return Initialization timeout
     * 
     */
    public Output<Optional<String>> initTimeout() {
        return Codegen.optional(this.initTimeout);
    }
    /**
     * Component metadata
     * 
     */
    @Export(name="metadata", type=List.class, parameters={DaprMetadataResponse.class})
    private Output</* @Nullable */ List<DaprMetadataResponse>> metadata;

    /**
     * @return Component metadata
     * 
     */
    public Output<Optional<List<DaprMetadataResponse>>> metadata() {
        return Codegen.optional(this.metadata);
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
     * Names of container apps that can use this Dapr component
     * 
     */
    @Export(name="scopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> scopes;

    /**
     * @return Names of container apps that can use this Dapr component
     * 
     */
    public Output<Optional<List<String>>> scopes() {
        return Codegen.optional(this.scopes);
    }
    /**
     * Collection of secrets used by a Dapr component
     * 
     */
    @Export(name="secrets", type=List.class, parameters={SecretResponse.class})
    private Output</* @Nullable */ List<SecretResponse>> secrets;

    /**
     * @return Collection of secrets used by a Dapr component
     * 
     */
    public Output<Optional<List<SecretResponse>>> secrets() {
        return Codegen.optional(this.secrets);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * Component version
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Component version
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DaprComponent(String name) {
        this(name, DaprComponentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DaprComponent(String name, DaprComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DaprComponent(String name, DaprComponentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:app:DaprComponent", name, args == null ? DaprComponentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DaprComponent(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:app:DaprComponent", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:app/v20220101preview:DaprComponent").build()),
                Output.of(Alias.builder().type("azure-native:app/v20220301:DaprComponent").build())
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
    public static DaprComponent get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DaprComponent(name, id, options);
    }
}
