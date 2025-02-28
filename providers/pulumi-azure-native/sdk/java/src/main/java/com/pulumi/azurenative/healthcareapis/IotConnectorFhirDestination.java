// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.healthcareapis.IotConnectorFhirDestinationArgs;
import com.pulumi.azurenative.healthcareapis.outputs.IotMappingPropertiesResponse;
import com.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
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
 * IoT Connector FHIR destination definition.
 * API Version: 2021-11-01.
 * 
 * ## Example Usage
 * ### Create or update an Iot Connector FHIR destination
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
 *         var iotConnectorFhirDestination = new IotConnectorFhirDestination(&#34;iotConnectorFhirDestination&#34;, IotConnectorFhirDestinationArgs.builder()        
 *             .fhirDestinationName(&#34;dest1&#34;)
 *             .fhirMapping(Map.of(&#34;content&#34;, Map.ofEntries(
 *                 Map.entry(&#34;template&#34;, IotMappingProperties.builder()
 *                     .template(Map.ofEntries(
 *                         Map.entry(&#34;codes&#34;, Map.ofEntries(
 *                             Map.entry(&#34;code&#34;, &#34;8867-4&#34;),
 *                             Map.entry(&#34;display&#34;, &#34;Heart rate&#34;),
 *                             Map.entry(&#34;system&#34;, &#34;http://loinc.org&#34;)
 *                         )),
 *                         Map.entry(&#34;periodInterval&#34;, 60),
 *                         Map.entry(&#34;typeName&#34;, &#34;heartrate&#34;),
 *                         Map.entry(&#34;value&#34;, Map.ofEntries(
 *                             Map.entry(&#34;defaultPeriod&#34;, 5000),
 *                             Map.entry(&#34;unit&#34;, &#34;count/min&#34;),
 *                             Map.entry(&#34;valueName&#34;, &#34;hr&#34;),
 *                             Map.entry(&#34;valueType&#34;, &#34;SampledData&#34;)
 *                         ))
 *                     ))
 *                     .templateType(&#34;CodeValueFhir&#34;)
 *                     .build()),
 *                 Map.entry(&#34;templateType&#34;, &#34;CollectionFhirTemplate&#34;)
 *             )))
 *             .fhirServiceResourceId(&#34;subscriptions/11111111-2222-3333-4444-555566667777/resourceGroups/myrg/providers/Microsoft.HealthcareApis/workspaces/myworkspace/fhirservices/myfhirservice&#34;)
 *             .iotConnectorName(&#34;blue&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;testRG&#34;)
 *             .resourceIdentityResolutionType(&#34;Create&#34;)
 *             .workspaceName(&#34;workspace1&#34;)
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
 * $ pulumi import azure-native:healthcareapis:IotConnectorFhirDestination dest1 /subscriptions/subid/resourceGroups/testRG/providers/Microsoft.HealthcareApis/workspaces/workspace1/iotconnectors/blue/fhirdestinations/dest1 
 * ```
 * 
 */
@ResourceType(type="azure-native:healthcareapis:IotConnectorFhirDestination")
public class IotConnectorFhirDestination extends com.pulumi.resources.CustomResource {
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * FHIR Mappings
     * 
     */
    @Export(name="fhirMapping", type=IotMappingPropertiesResponse.class, parameters={})
    private Output<IotMappingPropertiesResponse> fhirMapping;

    /**
     * @return FHIR Mappings
     * 
     */
    public Output<IotMappingPropertiesResponse> fhirMapping() {
        return this.fhirMapping;
    }
    /**
     * Fully qualified resource id of the FHIR service to connect to.
     * 
     */
    @Export(name="fhirServiceResourceId", type=String.class, parameters={})
    private Output<String> fhirServiceResourceId;

    /**
     * @return Fully qualified resource id of the FHIR service to connect to.
     * 
     */
    public Output<String> fhirServiceResourceId() {
        return this.fhirServiceResourceId;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Determines how resource identity is resolved on the destination.
     * 
     */
    @Export(name="resourceIdentityResolutionType", type=String.class, parameters={})
    private Output<String> resourceIdentityResolutionType;

    /**
     * @return Determines how resource identity is resolved on the destination.
     * 
     */
    public Output<String> resourceIdentityResolutionType() {
        return this.resourceIdentityResolutionType;
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
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IotConnectorFhirDestination(String name) {
        this(name, IotConnectorFhirDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IotConnectorFhirDestination(String name, IotConnectorFhirDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IotConnectorFhirDestination(String name, IotConnectorFhirDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:IotConnectorFhirDestination", name, args == null ? IotConnectorFhirDestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IotConnectorFhirDestination(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:IotConnectorFhirDestination", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:healthcareapis/v20210601preview:IotConnectorFhirDestination").build()),
                Output.of(Alias.builder().type("azure-native:healthcareapis/v20211101:IotConnectorFhirDestination").build()),
                Output.of(Alias.builder().type("azure-native:healthcareapis/v20220131preview:IotConnectorFhirDestination").build())
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
    public static IotConnectorFhirDestination get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IotConnectorFhirDestination(name, id, options);
    }
}
