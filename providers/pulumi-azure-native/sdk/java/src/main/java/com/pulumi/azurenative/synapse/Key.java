// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.KeyArgs;
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
 * A workspace key
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * ### Create or update a workspace key
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
 *         var key = new Key(&#34;key&#34;, KeyArgs.builder()        
 *             .isActiveCMK(true)
 *             .keyName(&#34;somekey&#34;)
 *             .keyVaultUrl(&#34;https://vault.azure.net/keys/somesecret&#34;)
 *             .resourceGroupName(&#34;ExampleResourceGroup&#34;)
 *             .workspaceName(&#34;ExampleWorkspace&#34;)
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
 * $ pulumi import azure-native:synapse:Key somekey /subscriptions/01234567-89ab-4def-0123-456789abcdef/resourceGroups/ExampleResourceGroup/providers/Microsoft.Synapse/workspaces/ExampleWorkspace/keys/somekey 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:Key")
public class Key extends com.pulumi.resources.CustomResource {
    /**
     * Used to activate the workspace after a customer managed key is provided.
     * 
     */
    @Export(name="isActiveCMK", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isActiveCMK;

    /**
     * @return Used to activate the workspace after a customer managed key is provided.
     * 
     */
    public Output<Optional<Boolean>> isActiveCMK() {
        return Codegen.optional(this.isActiveCMK);
    }
    /**
     * The Key Vault Url of the workspace key.
     * 
     */
    @Export(name="keyVaultUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultUrl;

    /**
     * @return The Key Vault Url of the workspace key.
     * 
     */
    public Output<Optional<String>> keyVaultUrl() {
        return Codegen.optional(this.keyVaultUrl);
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
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, KeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Key(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:Key", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20190601preview:Key").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20201201:Key").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210301:Key").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:Key").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210501:Key").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601:Key").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:Key").build())
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
    public static Key get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}
