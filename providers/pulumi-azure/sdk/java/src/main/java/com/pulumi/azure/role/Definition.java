// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.role;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.role.DefinitionArgs;
import com.pulumi.azure.role.inputs.DefinitionState;
import com.pulumi.azure.role.outputs.DefinitionPermission;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a custom Role Definition, used to assign Roles to Users/Principals. See [&#39;Understand role definitions&#39;](https://docs.microsoft.com/en-us/azure/role-based-access-control/role-definitions) in the Azure documentation for more details.
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
 *         final var primary = Output.of(CoreFunctions.getSubscription());
 * 
 *         var example = new RoleDefinition(&#34;example&#34;, RoleDefinitionArgs.builder()        
 *             .scope(primary.apply(getBudgetSubscriptionResult -&gt; getBudgetSubscriptionResult.getId()))
 *             .description(&#34;This is a custom role created&#34;)
 *             .permissions(RoleDefinitionPermission.builder()
 *                 .actions(&#34;*&#34;)
 *                 .notActions()
 *                 .build())
 *             .assignableScopes(primary.apply(getBudgetSubscriptionResult -&gt; getBudgetSubscriptionResult.getId()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Role Definitions can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:role/definition:Definition example &#34;/subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Authorization/roleDefinitions/00000000-0000-0000-0000-000000000000|/subscriptions/00000000-0000-0000-0000-000000000000&#34;
 * ```
 * 
 * @deprecated
 * azure.role.Definition has been deprecated in favor of azure.authorization.RoleDefinition
 * 
 */
@Deprecated /* azure.role.Definition has been deprecated in favor of azure.authorization.RoleDefinition */
@ResourceType(type="azure:role/definition:Definition")
public class Definition extends com.pulumi.resources.CustomResource {
    /**
     * One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
     * 
     */
    @Export(name="assignableScopes", type=List.class, parameters={String.class})
    private Output<List<String>> assignableScopes;

    /**
     * @return One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
     * 
     */
    public Output<List<String>> assignableScopes() {
        return this.assignableScopes;
    }
    /**
     * A description of the Role Definition.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the Role Definition.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the Role Definition. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Role Definition. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `permissions` block as defined below.
     * 
     */
    @Export(name="permissions", type=List.class, parameters={DefinitionPermission.class})
    private Output</* @Nullable */ List<DefinitionPermission>> permissions;

    /**
     * @return A `permissions` block as defined below.
     * 
     */
    public Output<Optional<List<DefinitionPermission>>> permissions() {
        return Codegen.optional(this.permissions);
    }
    /**
     * A unique UUID/GUID which identifies this role - one will be generated if not specified. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="roleDefinitionId", type=String.class, parameters={})
    private Output<String> roleDefinitionId;

    /**
     * @return A unique UUID/GUID which identifies this role - one will be generated if not specified. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The Azure Resource Manager ID for the resource.
     * 
     */
    @Export(name="roleDefinitionResourceId", type=String.class, parameters={})
    private Output<String> roleDefinitionResourceId;

    /**
     * @return The Azure Resource Manager ID for the resource.
     * 
     */
    public Output<String> roleDefinitionResourceId() {
        return this.roleDefinitionResourceId;
    }
    /**
     * The scope at which the Role Definition applies to, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`. It is recommended to use the first entry of the `assignable_scopes`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return The scope at which the Role Definition applies to, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`. It is recommended to use the first entry of the `assignable_scopes`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Definition(String name) {
        this(name, DefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Definition(String name, DefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Definition(String name, DefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:role/definition:Definition", name, args == null ? DefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Definition(String name, Output<String> id, @Nullable DefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:role/definition:Definition", name, state, makeResourceOptions(options, id));
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
    public static Definition get(String name, Output<String> id, @Nullable DefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Definition(name, id, state, options);
    }
}
