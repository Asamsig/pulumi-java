// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.appplatform.ServiceRegistryArgs;
import com.pulumi.azurenative.appplatform.outputs.ServiceRegistryPropertiesResponse;
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
 * Service Registry resource
 * API Version: 2022-01-01-preview.
 * 
 * ## Example Usage
 * ### ServiceRegistries_CreateOrUpdate
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
 *         var serviceRegistry = new ServiceRegistry(&#34;serviceRegistry&#34;, ServiceRegistryArgs.builder()        
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .serviceName(&#34;myservice&#34;)
 *             .serviceRegistryName(&#34;default&#34;)
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
 * $ pulumi import azure-native:appplatform:ServiceRegistry default /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/serviceRegistries/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:appplatform:ServiceRegistry")
public class ServiceRegistry extends com.pulumi.resources.CustomResource {
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
     * Service Registry properties payload
     * 
     */
    @Export(name="properties", type=ServiceRegistryPropertiesResponse.class, parameters={})
    private Output<ServiceRegistryPropertiesResponse> properties;

    /**
     * @return Service Registry properties payload
     * 
     */
    public Output<ServiceRegistryPropertiesResponse> properties() {
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
    public ServiceRegistry(String name) {
        this(name, ServiceRegistryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceRegistry(String name, ServiceRegistryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceRegistry(String name, ServiceRegistryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:ServiceRegistry", name, args == null ? ServiceRegistryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceRegistry(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:ServiceRegistry", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:appplatform/v20220101preview:ServiceRegistry").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20220301preview:ServiceRegistry").build())
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
    public static ServiceRegistry get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceRegistry(name, id, options);
    }
}
