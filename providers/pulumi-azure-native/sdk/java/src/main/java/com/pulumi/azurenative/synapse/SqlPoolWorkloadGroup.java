// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.SqlPoolWorkloadGroupArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Workload group operations for a sql pool
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * ### Create a workload group with all properties specified.
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
 *         var sqlPoolWorkloadGroup = new SqlPoolWorkloadGroup(&#34;sqlPoolWorkloadGroup&#34;, SqlPoolWorkloadGroupArgs.builder()        
 *             .importance(&#34;normal&#34;)
 *             .maxResourcePercent(100)
 *             .maxResourcePercentPerRequest(3)
 *             .minResourcePercent(0)
 *             .minResourcePercentPerRequest(3)
 *             .queryExecutionTimeout(0)
 *             .resourceGroupName(&#34;sqlcrudtest-6852&#34;)
 *             .sqlPoolName(&#34;sqlcrudtest-9187&#34;)
 *             .workloadGroupName(&#34;smallrc&#34;)
 *             .workspaceName(&#34;sqlcrudtest-2080&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a workload group with the required properties specified.
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
 *         var sqlPoolWorkloadGroup = new SqlPoolWorkloadGroup(&#34;sqlPoolWorkloadGroup&#34;, SqlPoolWorkloadGroupArgs.builder()        
 *             .maxResourcePercent(100)
 *             .minResourcePercent(0)
 *             .minResourcePercentPerRequest(3)
 *             .resourceGroupName(&#34;sqlcrudtest-6852&#34;)
 *             .sqlPoolName(&#34;sqlcrudtest-9187&#34;)
 *             .workloadGroupName(&#34;smallrc&#34;)
 *             .workspaceName(&#34;sqlcrudtest-2080&#34;)
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
 * $ pulumi import azure-native:synapse:SqlPoolWorkloadGroup smallrc /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-6852/providers/Microsoft.Synapse/workspaces/sqlcrudtest-2080/sqlPools/workloadGroups/smallrc 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:SqlPoolWorkloadGroup")
public class SqlPoolWorkloadGroup extends com.pulumi.resources.CustomResource {
    /**
     * The workload group importance level.
     * 
     */
    @Export(name="importance", type=String.class, parameters={})
    private Output</* @Nullable */ String> importance;

    /**
     * @return The workload group importance level.
     * 
     */
    public Output<Optional<String>> importance() {
        return Codegen.optional(this.importance);
    }
    /**
     * The workload group cap percentage resource.
     * 
     */
    @Export(name="maxResourcePercent", type=Integer.class, parameters={})
    private Output<Integer> maxResourcePercent;

    /**
     * @return The workload group cap percentage resource.
     * 
     */
    public Output<Integer> maxResourcePercent() {
        return this.maxResourcePercent;
    }
    /**
     * The workload group request maximum grant percentage.
     * 
     */
    @Export(name="maxResourcePercentPerRequest", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxResourcePercentPerRequest;

    /**
     * @return The workload group request maximum grant percentage.
     * 
     */
    public Output<Optional<Double>> maxResourcePercentPerRequest() {
        return Codegen.optional(this.maxResourcePercentPerRequest);
    }
    /**
     * The workload group minimum percentage resource.
     * 
     */
    @Export(name="minResourcePercent", type=Integer.class, parameters={})
    private Output<Integer> minResourcePercent;

    /**
     * @return The workload group minimum percentage resource.
     * 
     */
    public Output<Integer> minResourcePercent() {
        return this.minResourcePercent;
    }
    /**
     * The workload group request minimum grant percentage.
     * 
     */
    @Export(name="minResourcePercentPerRequest", type=Double.class, parameters={})
    private Output<Double> minResourcePercentPerRequest;

    /**
     * @return The workload group request minimum grant percentage.
     * 
     */
    public Output<Double> minResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
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
     * The workload group query execution timeout.
     * 
     */
    @Export(name="queryExecutionTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> queryExecutionTimeout;

    /**
     * @return The workload group query execution timeout.
     * 
     */
    public Output<Optional<Integer>> queryExecutionTimeout() {
        return Codegen.optional(this.queryExecutionTimeout);
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
    public SqlPoolWorkloadGroup(String name) {
        this(name, SqlPoolWorkloadGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlPoolWorkloadGroup(String name, SqlPoolWorkloadGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlPoolWorkloadGroup(String name, SqlPoolWorkloadGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolWorkloadGroup", name, args == null ? SqlPoolWorkloadGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlPoolWorkloadGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolWorkloadGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20190601preview:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20201201:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210301:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210501:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:SqlPoolWorkloadGroup").build())
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
    public static SqlPoolWorkloadGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlPoolWorkloadGroup(name, id, options);
    }
}
