// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityinsights.EntityQueryArgs;
import com.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Specific entity query.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * ### Creates or updates an Activity entity query.
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
 *         var entityQuery = new EntityQuery(&#34;entityQuery&#34;, EntityQueryArgs.builder()        
 *             .entityQueryId(&#34;07da3cc8-c8ad-4710-a44e-334cdcb7882b&#34;)
 *             .kind(&#34;Activity&#34;)
 *             .operationalInsightsResourceProvider(&#34;Microsoft.OperationalIinsights&#34;)
 *             .resourceGroupName(&#34;myRg&#34;)
 *             .workspaceName(&#34;myWorkspace&#34;)
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
 * $ pulumi import azure-native:securityinsights:EntityQuery 07da3cc8-c8ad-4710-a44e-334cdcb7882b /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/entityQueries/07da3cc8-c8ad-4710-a44e-334cdcb7882b 
 * ```
 * 
 * @deprecated
 * Please use one of the variants: ActivityCustomEntityQuery.
 * 
 */
@Deprecated /* Please use one of the variants: ActivityCustomEntityQuery. */
@ResourceType(type="azure-native:securityinsights:EntityQuery")
public class EntityQuery extends com.pulumi.resources.CustomResource {
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * the entity query kind
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return the entity query kind
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EntityQuery(String name) {
        this(name, EntityQueryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EntityQuery(String name, EntityQueryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntityQuery(String name, EntityQueryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:EntityQuery", name, args == null ? EntityQueryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EntityQuery(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:EntityQuery", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:EntityQuery").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:EntityQuery").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20211001preview:EntityQuery").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20220101preview:EntityQuery").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20220401preview:EntityQuery").build())
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
    public static EntityQuery get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EntityQuery(name, id, options);
    }
}
