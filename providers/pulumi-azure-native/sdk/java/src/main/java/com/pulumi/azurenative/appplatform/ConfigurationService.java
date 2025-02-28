// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.appplatform.ConfigurationServiceArgs;
import com.pulumi.azurenative.appplatform.outputs.ConfigurationServicePropertiesResponse;
import com.pulumi.azurenative.appplatform.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Application Configuration Service resource
 * API Version: 2022-01-01-preview.
 * 
 * ## Example Usage
 * ### ConfigurationServices_CreateOrUpdate
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
 *         var configurationService = new ConfigurationService(&#34;configurationService&#34;, ConfigurationServiceArgs.builder()        
 *             .configurationServiceName(&#34;default&#34;)
 *             .properties(Map.of(&#34;settings&#34;, Map.of(&#34;gitProperty&#34;, Map.of(&#34;repositories&#34;, Map.ofEntries(
 *                 Map.entry(&#34;label&#34;, &#34;master&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;fake&#34;),
 *                 Map.entry(&#34;patterns&#34;, &#34;app/dev&#34;),
 *                 Map.entry(&#34;uri&#34;, &#34;https://github.com/fake-user/fake-repository&#34;)
 *             )))))
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .serviceName(&#34;myservice&#34;)
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
 * $ pulumi import azure-native:appplatform:ConfigurationService default /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/configurationServices/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:appplatform:ConfigurationService")
public class ConfigurationService extends com.pulumi.resources.CustomResource {
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Application Configuration Service properties payload
     * 
     */
    @Export(name="properties", type=ConfigurationServicePropertiesResponse.class, parameters={})
    private Output<ConfigurationServicePropertiesResponse> properties;

    /**
     * @return Application Configuration Service properties payload
     * 
     */
    public Output<ConfigurationServicePropertiesResponse> properties() {
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
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationService(String name) {
        this(name, ConfigurationServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationService(String name, ConfigurationServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationService(String name, ConfigurationServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:ConfigurationService", name, args == null ? ConfigurationServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationService(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:ConfigurationService", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:appplatform/v20220101preview:ConfigurationService").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20220301preview:ConfigurationService").build())
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
    public static ConfigurationService get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationService(name, id, options);
    }
}
