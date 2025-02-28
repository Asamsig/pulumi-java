// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.ServiceEndpointPolicyArgs;
import com.pulumi.azurenative.network.outputs.ServiceEndpointPolicyDefinitionResponse;
import com.pulumi.azurenative.network.outputs.SubnetResponse;
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
 * Service End point policy resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### Create service endpoint policy
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
 *         var serviceEndpointPolicy = new ServiceEndpointPolicy(&#34;serviceEndpointPolicy&#34;, ServiceEndpointPolicyArgs.builder()        
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .serviceEndpointPolicyName(&#34;testPolicy&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create service endpoint policy with definition
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
 *         var serviceEndpointPolicy = new ServiceEndpointPolicy(&#34;serviceEndpointPolicy&#34;, ServiceEndpointPolicyArgs.builder()        
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .serviceEndpointPolicyDefinitions(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;Storage Service EndpointPolicy Definition&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;StorageServiceEndpointPolicyDefinition&#34;),
 *                 Map.entry(&#34;service&#34;, &#34;Microsoft.Storage&#34;),
 *                 Map.entry(&#34;serviceResources&#34;,                 
 *                     &#34;/subscriptions/subid1&#34;,
 *                     &#34;/subscriptions/subid1/resourceGroups/storageRg&#34;,
 *                     &#34;/subscriptions/subid1/resourceGroups/storageRg/providers/Microsoft.Storage/storageAccounts/stAccount&#34;)
 *             ))
 *             .serviceEndpointPolicyName(&#34;testPolicy&#34;)
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
 * $ pulumi import azure-native:network:ServiceEndpointPolicy testnsg /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/ServiceEndpointPolicies/testpolicy 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:ServiceEndpointPolicy")
public class ServiceEndpointPolicy extends com.pulumi.resources.CustomResource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Kind of service endpoint policy. This is metadata used for the Azure portal experience.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of service endpoint policy. This is metadata used for the Azure portal experience.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning state of the service endpoint policy resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the service endpoint policy resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the service endpoint policy resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the service endpoint policy resource.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * A collection of service endpoint policy definitions of the service endpoint policy.
     * 
     */
    @Export(name="serviceEndpointPolicyDefinitions", type=List.class, parameters={ServiceEndpointPolicyDefinitionResponse.class})
    private Output</* @Nullable */ List<ServiceEndpointPolicyDefinitionResponse>> serviceEndpointPolicyDefinitions;

    /**
     * @return A collection of service endpoint policy definitions of the service endpoint policy.
     * 
     */
    public Output<Optional<List<ServiceEndpointPolicyDefinitionResponse>>> serviceEndpointPolicyDefinitions() {
        return Codegen.optional(this.serviceEndpointPolicyDefinitions);
    }
    /**
     * A collection of references to subnets.
     * 
     */
    @Export(name="subnets", type=List.class, parameters={SubnetResponse.class})
    private Output<List<SubnetResponse>> subnets;

    /**
     * @return A collection of references to subnets.
     * 
     */
    public Output<List<SubnetResponse>> subnets() {
        return this.subnets;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceEndpointPolicy(String name) {
        this(name, ServiceEndpointPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceEndpointPolicy(String name, ServiceEndpointPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceEndpointPolicy(String name, ServiceEndpointPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ServiceEndpointPolicy", name, args == null ? ServiceEndpointPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceEndpointPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ServiceEndpointPolicy", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20180701:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:ServiceEndpointPolicy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:ServiceEndpointPolicy").build())
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
    public static ServiceEndpointPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceEndpointPolicy(name, id, options);
    }
}
