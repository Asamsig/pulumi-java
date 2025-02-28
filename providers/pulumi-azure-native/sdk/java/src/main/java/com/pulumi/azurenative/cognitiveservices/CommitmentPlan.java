// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.cognitiveservices.CommitmentPlanArgs;
import com.pulumi.azurenative.cognitiveservices.outputs.CommitmentPlanPropertiesResponse;
import com.pulumi.azurenative.cognitiveservices.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Cognitive Services account commitment plan.
 * API Version: 2021-10-01.
 * 
 * ## Example Usage
 * ### PutCommitmentPlan
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
 *         var commitmentPlan = new CommitmentPlan(&#34;commitmentPlan&#34;, CommitmentPlanArgs.builder()        
 *             .accountName(&#34;accountName&#34;)
 *             .commitmentPlanName(&#34;commitmentPlanName&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;autoRenew&#34;, true),
 *                 Map.entry(&#34;current&#34;, Map.of(&#34;tier&#34;, &#34;T1&#34;)),
 *                 Map.entry(&#34;hostingModel&#34;, &#34;Web&#34;),
 *                 Map.entry(&#34;planType&#34;, &#34;Speech2Text&#34;)
 *             ))
 *             .resourceGroupName(&#34;resourceGroupName&#34;)
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
 * $ pulumi import azure-native:cognitiveservices:CommitmentPlan commitmentPlanName /subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.CognitiveServices/accounts/accountName/commitmentPlans/commitmentPlanName 
 * ```
 * 
 */
@ResourceType(type="azure-native:cognitiveservices:CommitmentPlan")
public class CommitmentPlan extends com.pulumi.resources.CustomResource {
    /**
     * Resource Etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Resource Etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
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
     * Properties of Cognitive Services account commitment plan.
     * 
     */
    @Export(name="properties", type=CommitmentPlanPropertiesResponse.class, parameters={})
    private Output<CommitmentPlanPropertiesResponse> properties;

    /**
     * @return Properties of Cognitive Services account commitment plan.
     * 
     */
    public Output<CommitmentPlanPropertiesResponse> properties() {
        return this.properties;
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
    public CommitmentPlan(String name) {
        this(name, CommitmentPlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CommitmentPlan(String name, CommitmentPlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CommitmentPlan(String name, CommitmentPlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cognitiveservices:CommitmentPlan", name, args == null ? CommitmentPlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CommitmentPlan(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cognitiveservices:CommitmentPlan", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20211001:CommitmentPlan").build()),
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20220301:CommitmentPlan").build())
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
    public static CommitmentPlan get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CommitmentPlan(name, id, options);
    }
}
