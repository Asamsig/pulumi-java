// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.streamanalytics.OutputFunctionArgs;
import com.pulumi.azure.streamanalytics.inputs.OutputFunctionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Stream Analytics Output Function.
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;);
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var examplePlan = new Plan(&#34;examplePlan&#34;, PlanArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .kind(&#34;FunctionApp&#34;)
 *             .reserved(true)
 *             .sku(PlanSku.builder()
 *                 .tier(&#34;Dynamic&#34;)
 *                 .size(&#34;Y1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleFunctionApp = new FunctionApp(&#34;exampleFunctionApp&#34;, FunctionAppArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .appServicePlanId(examplePlan.getId())
 *             .storageAccountName(exampleAccount.getName())
 *             .storageAccountAccessKey(exampleAccount.getPrimaryAccessKey())
 *             .osType(&#34;linux&#34;)
 *             .version(&#34;~3&#34;)
 *             .build());
 * 
 *         var exampleJob = new Job(&#34;exampleJob&#34;, JobArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .streamingUnits(3)
 *             .transformationQuery(&#34;&#34;&#34;
 *     SELECT *
 *     INTO [YourOutputAlias]
 *     FROM [YourInputAlias]
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var exampleOutputFunction = new OutputFunction(&#34;exampleOutputFunction&#34;, OutputFunctionArgs.builder()        
 *             .resourceGroupName(exampleJob.getResourceGroupName())
 *             .streamAnalyticsJobName(exampleJob.getName())
 *             .functionApp(exampleFunctionApp.getName())
 *             .functionName(&#34;examplefunctionname&#34;)
 *             .apiKey(&#34;exampleapikey&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Stream Analytics Output Functions can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:streamanalytics/outputFunction:OutputFunction example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingjobs/job1/outputs/output1
 * ```
 * 
 */
@ResourceType(type="azure:streamanalytics/outputFunction:OutputFunction")
public class OutputFunction extends com.pulumi.resources.CustomResource {
    /**
     * The API key for the Function.
     * 
     */
    @Export(name="apiKey", type=String.class, parameters={})
    private Output<String> apiKey;

    /**
     * @return The API key for the Function.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }
    /**
     * The maximum number of events in each batch that&#39;s sent to the function. Defaults to `100`.
     * 
     */
    @Export(name="batchMaxCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> batchMaxCount;

    /**
     * @return The maximum number of events in each batch that&#39;s sent to the function. Defaults to `100`.
     * 
     */
    public Output<Optional<Integer>> batchMaxCount() {
        return Codegen.optional(this.batchMaxCount);
    }
    /**
     * The maximum batch size in bytes that&#39;s sent to the function. Defaults to `262144` (256 kB).
     * 
     */
    @Export(name="batchMaxInBytes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> batchMaxInBytes;

    /**
     * @return The maximum batch size in bytes that&#39;s sent to the function. Defaults to `262144` (256 kB).
     * 
     */
    public Output<Optional<Integer>> batchMaxInBytes() {
        return Codegen.optional(this.batchMaxInBytes);
    }
    /**
     * The name of the Function App.
     * 
     */
    @Export(name="functionApp", type=String.class, parameters={})
    private Output<String> functionApp;

    /**
     * @return The name of the Function App.
     * 
     */
    public Output<String> functionApp() {
        return this.functionApp;
    }
    /**
     * The name of the function in the Function App.
     * 
     */
    @Export(name="functionName", type=String.class, parameters={})
    private Output<String> functionName;

    /**
     * @return The name of the function in the Function App.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }
    /**
     * The name which should be used for this Stream Analytics Output. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Stream Analytics Output. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Stream Analytics Output should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Output should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="streamAnalyticsJobName", type=String.class, parameters={})
    private Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsJobName() {
        return this.streamAnalyticsJobName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OutputFunction(String name) {
        this(name, OutputFunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OutputFunction(String name, OutputFunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OutputFunction(String name, OutputFunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/outputFunction:OutputFunction", name, args == null ? OutputFunctionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OutputFunction(String name, Output<String> id, @Nullable OutputFunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/outputFunction:OutputFunction", name, state, makeResourceOptions(options, id));
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
    public static OutputFunction get(String name, Output<String> id, @Nullable OutputFunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OutputFunction(name, id, state, options);
    }
}
