// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.softwareplan;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.softwareplan.HybridUseBenefitArgs;
import com.pulumi.azurenative.softwareplan.outputs.SkuResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Response on GET of a hybrid use benefit
 * API Version: 2019-06-01-preview.
 * 
 * ## Example Usage
 * ### HybridUseBenefit
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
 *         var hybridUseBenefit = new HybridUseBenefit(&#34;hybridUseBenefit&#34;, HybridUseBenefitArgs.builder()        
 *             .planId(&#34;94f46eda-45f8-493a-8425-251921463a89&#34;)
 *             .scope(&#34;subscriptions/{sub-id}/resourceGroups/{rg-name}/providers/Microsoft.Compute/HostGroups/{host-group-name}/hosts/{host-name}&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;SQL_Server_Perpetual&#34;))
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
 * $ pulumi import azure-native:softwareplan:HybridUseBenefit SQL_{hostGroupName}_{hostName} /subscriptions/{sub-id}/resourceGroups/{rg-name}/providers/Microsoft.Compute/HostGroups/{host-group-name}/hosts/{host-name}/providers/Microsoft.SoftwarePlan/hybridUseBenefits/SQL_{hostGroupName}_{hostName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:softwareplan:HybridUseBenefit")
public class HybridUseBenefit extends com.pulumi.resources.CustomResource {
    /**
     * Created date
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return Created date
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Indicates the revision of the hybrid use benefit
     * 
     */
    @Export(name="etag", type=Integer.class, parameters={})
    private Output<Integer> etag;

    /**
     * @return Indicates the revision of the hybrid use benefit
     * 
     */
    public Output<Integer> etag() {
        return this.etag;
    }
    /**
     * Last updated date
     * 
     */
    @Export(name="lastUpdatedDate", type=String.class, parameters={})
    private Output<String> lastUpdatedDate;

    /**
     * @return Last updated date
     * 
     */
    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
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
     * Provisioning state
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Hybrid use benefit SKU
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return Hybrid use benefit SKU
     * 
     */
    public Output<SkuResponse> sku() {
        return this.sku;
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
    public HybridUseBenefit(String name) {
        this(name, HybridUseBenefitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridUseBenefit(String name, HybridUseBenefitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridUseBenefit(String name, HybridUseBenefitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:softwareplan:HybridUseBenefit", name, args == null ? HybridUseBenefitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HybridUseBenefit(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:softwareplan:HybridUseBenefit", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:softwareplan/v20190601preview:HybridUseBenefit").build()),
                Output.of(Alias.builder().type("azure-native:softwareplan/v20191201:HybridUseBenefit").build())
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
    public static HybridUseBenefit get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HybridUseBenefit(name, id, options);
    }
}
