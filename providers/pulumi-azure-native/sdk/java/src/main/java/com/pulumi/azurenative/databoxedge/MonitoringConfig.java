// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.databoxedge.MonitoringConfigArgs;
import com.pulumi.azurenative.databoxedge.outputs.MetricConfigurationResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The metric setting details for the role
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### PutMonitoringConfig
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
 *         var monitoringConfig = new MonitoringConfig(&#34;monitoringConfig&#34;, MonitoringConfigArgs.builder()        
 *             .deviceName(&#34;testedgedevice&#34;)
 *             .metricConfigurations(Map.ofEntries(
 *                 Map.entry(&#34;counterSets&#34;, Map.of(&#34;counters&#34;, Map.of(&#34;name&#34;, &#34;test&#34;))),
 *                 Map.entry(&#34;mdmAccount&#34;, &#34;test&#34;),
 *                 Map.entry(&#34;metricNameSpace&#34;, &#34;test&#34;),
 *                 Map.entry(&#34;resourceId&#34;, &#34;test&#34;)
 *             ))
 *             .resourceGroupName(&#34;GroupForEdgeAutomation&#34;)
 *             .roleName(&#34;testrole&#34;)
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
 * $ pulumi import azure-native:databoxedge:MonitoringConfig myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/{deviceName}/roles/{roleName}/monitoringConfig/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:MonitoringConfig")
public class MonitoringConfig extends com.pulumi.resources.CustomResource {
    /**
     * The metrics configuration details
     * 
     */
    @Export(name="metricConfigurations", type=List.class, parameters={MetricConfigurationResponse.class})
    private Output<List<MetricConfigurationResponse>> metricConfigurations;

    /**
     * @return The metrics configuration details
     * 
     */
    public Output<List<MetricConfigurationResponse>> metricConfigurations() {
        return this.metricConfigurations;
    }
    /**
     * The object name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MonitoringConfig(String name) {
        this(name, MonitoringConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MonitoringConfig(String name, MonitoringConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MonitoringConfig(String name, MonitoringConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:MonitoringConfig", name, args == null ? MonitoringConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MonitoringConfig(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:MonitoringConfig", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901:MonitoringConfig").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901preview:MonitoringConfig").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20201201:MonitoringConfig").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201:MonitoringConfig").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201preview:MonitoringConfig").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601:MonitoringConfig").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601preview:MonitoringConfig").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20220301:MonitoringConfig").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20220401preview:MonitoringConfig").build())
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
    public static MonitoringConfig get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MonitoringConfig(name, id, options);
    }
}
