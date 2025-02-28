// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.media.ServiceAccountArgs;
import com.pulumi.azure.media.inputs.ServiceAccountState;
import com.pulumi.azure.media.outputs.ServiceAccountIdentity;
import com.pulumi.azure.media.outputs.ServiceAccountKeyDeliveryAccessControl;
import com.pulumi.azure.media.outputs.ServiceAccountStorageAccount;
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
 * Manages a Media Services Account.
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;GRS&#34;)
 *             .build());
 * 
 *         var exampleServiceAccount = new ServiceAccount(&#34;exampleServiceAccount&#34;, ServiceAccountArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .storageAccounts(ServiceAccountStorageAccount.builder()
 *                 .id(exampleAccount.getId())
 *                 .isPrimary(true)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Media Services Accounts can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:media/serviceAccount:ServiceAccount account /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Media/mediaservices/account1
 * ```
 * 
 */
@ResourceType(type="azure:media/serviceAccount:ServiceAccount")
public class ServiceAccount extends com.pulumi.resources.CustomResource {
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=ServiceAccountIdentity.class, parameters={})
    private Output</* @Nullable */ ServiceAccountIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<ServiceAccountIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * A `key_delivery_access_control` block as defined below.
     * 
     */
    @Export(name="keyDeliveryAccessControl", type=ServiceAccountKeyDeliveryAccessControl.class, parameters={})
    private Output<ServiceAccountKeyDeliveryAccessControl> keyDeliveryAccessControl;

    /**
     * @return A `key_delivery_access_control` block as defined below.
     * 
     */
    public Output<ServiceAccountKeyDeliveryAccessControl> keyDeliveryAccessControl() {
        return this.keyDeliveryAccessControl;
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Media Services Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Media Services Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Media Services Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * One or more `storage_account` blocks as defined below.
     * 
     */
    @Export(name="storageAccounts", type=List.class, parameters={ServiceAccountStorageAccount.class})
    private Output<List<ServiceAccountStorageAccount>> storageAccounts;

    /**
     * @return One or more `storage_account` blocks as defined below.
     * 
     */
    public Output<List<ServiceAccountStorageAccount>> storageAccounts() {
        return this.storageAccounts;
    }
    /**
     * Specifies the storage authentication type.
     * Possible value is  `ManagedIdentity` or `System`.
     * 
     */
    @Export(name="storageAuthenticationType", type=String.class, parameters={})
    private Output<String> storageAuthenticationType;

    /**
     * @return Specifies the storage authentication type.
     * Possible value is  `ManagedIdentity` or `System`.
     * 
     */
    public Output<String> storageAuthenticationType() {
        return this.storageAuthenticationType;
    }
    /**
     * A mapping of tags assigned to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceAccount(String name) {
        this(name, ServiceAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAccount(String name, ServiceAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAccount(String name, ServiceAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:media/serviceAccount:ServiceAccount", name, args == null ? ServiceAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceAccount(String name, Output<String> id, @Nullable ServiceAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:media/serviceAccount:ServiceAccount", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure:mediaservices/account:Account").build())
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServiceAccount get(String name, Output<String> id, @Nullable ServiceAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAccount(name, id, state, options);
    }
}
