// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.customerinsights.ConnectorMappingArgs;
import com.pulumi.azurenative.customerinsights.outputs.ConnectorMappingPropertiesResponse;
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
 * The connector mapping resource format.
 * API Version: 2017-04-26.
 * 
 * ## Example Usage
 * ### ConnectorMappings_CreateOrUpdate
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
 *         var connectorMapping = new ConnectorMapping(&#34;connectorMapping&#34;, ConnectorMappingArgs.builder()        
 *             .connectorName(&#34;testConnector8858&#34;)
 *             .description(&#34;Test mapping&#34;)
 *             .displayName(&#34;testMapping12491&#34;)
 *             .entityType(&#34;Interaction&#34;)
 *             .entityTypeName(&#34;TestInteractionType2967&#34;)
 *             .hubName(&#34;sdkTestHub&#34;)
 *             .mappingName(&#34;testMapping12491&#34;)
 *             .mappingProperties(Map.ofEntries(
 *                 Map.entry(&#34;availability&#34;, Map.ofEntries(
 *                     Map.entry(&#34;frequency&#34;, &#34;Hour&#34;),
 *                     Map.entry(&#34;interval&#34;, 5)
 *                 )),
 *                 Map.entry(&#34;completeOperation&#34;, Map.ofEntries(
 *                     Map.entry(&#34;completionOperationType&#34;, &#34;DeleteFile&#34;),
 *                     Map.entry(&#34;destinationFolder&#34;, &#34;fakePath&#34;)
 *                 )),
 *                 Map.entry(&#34;errorManagement&#34;, Map.ofEntries(
 *                     Map.entry(&#34;errorLimit&#34;, 10),
 *                     Map.entry(&#34;errorManagementType&#34;, &#34;StopImport&#34;)
 *                 )),
 *                 Map.entry(&#34;fileFilter&#34;, &#34;unknown&#34;),
 *                 Map.entry(&#34;folderPath&#34;, &#34;http://sample.dne/file&#34;),
 *                 Map.entry(&#34;format&#34;, Map.ofEntries(
 *                     Map.entry(&#34;columnDelimiter&#34;, &#34;|&#34;),
 *                     Map.entry(&#34;formatType&#34;, &#34;TextFormat&#34;)
 *                 )),
 *                 Map.entry(&#34;hasHeader&#34;, false),
 *                 Map.entry(&#34;structure&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;columnName&#34;, &#34;unknown1&#34;),
 *                         Map.entry(&#34;isEncrypted&#34;, false),
 *                         Map.entry(&#34;propertyName&#34;, &#34;unknwon1&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;columnName&#34;, &#34;unknown2&#34;),
 *                         Map.entry(&#34;isEncrypted&#34;, true),
 *                         Map.entry(&#34;propertyName&#34;, &#34;unknwon2&#34;)
 *                     ))
 *             ))
 *             .resourceGroupName(&#34;TestHubRG&#34;)
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
 * $ pulumi import azure-native:customerinsights:ConnectorMapping sdkTestHub/testConnector8858/testMapping12491 /subscriptions/c909e979-ef71-4def-a970-bc7c154db8c5/resourceGroups/TestHubRG/providers/Microsoft.CustomerInsights/hubs/sdkTestHub/connectors/testConnector8858/mappings/testMapping12491 
 * ```
 * 
 */
@ResourceType(type="azure-native:customerinsights:ConnectorMapping")
public class ConnectorMapping extends com.pulumi.resources.CustomResource {
    /**
     * The connector mapping name
     * 
     */
    @Export(name="connectorMappingName", type=String.class, parameters={})
    private Output<String> connectorMappingName;

    /**
     * @return The connector mapping name
     * 
     */
    public Output<String> connectorMappingName() {
        return this.connectorMappingName;
    }
    /**
     * The connector name.
     * 
     */
    @Export(name="connectorName", type=String.class, parameters={})
    private Output<String> connectorName;

    /**
     * @return The connector name.
     * 
     */
    public Output<String> connectorName() {
        return this.connectorName;
    }
    /**
     * Type of connector.
     * 
     */
    @Export(name="connectorType", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectorType;

    /**
     * @return Type of connector.
     * 
     */
    public Output<Optional<String>> connectorType() {
        return Codegen.optional(this.connectorType);
    }
    /**
     * The created time.
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The created time.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * The DataFormat ID.
     * 
     */
    @Export(name="dataFormatId", type=String.class, parameters={})
    private Output<String> dataFormatId;

    /**
     * @return The DataFormat ID.
     * 
     */
    public Output<String> dataFormatId() {
        return this.dataFormatId;
    }
    /**
     * The description of the connector mapping.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the connector mapping.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Display name for the connector mapping.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display name for the connector mapping.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Defines which entity type the file should map to.
     * 
     */
    @Export(name="entityType", type=String.class, parameters={})
    private Output<String> entityType;

    /**
     * @return Defines which entity type the file should map to.
     * 
     */
    public Output<String> entityType() {
        return this.entityType;
    }
    /**
     * The mapping entity name.
     * 
     */
    @Export(name="entityTypeName", type=String.class, parameters={})
    private Output<String> entityTypeName;

    /**
     * @return The mapping entity name.
     * 
     */
    public Output<String> entityTypeName() {
        return this.entityTypeName;
    }
    /**
     * The last modified time.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The last modified time.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * The properties of the mapping.
     * 
     */
    @Export(name="mappingProperties", type=ConnectorMappingPropertiesResponse.class, parameters={})
    private Output<ConnectorMappingPropertiesResponse> mappingProperties;

    /**
     * @return The properties of the mapping.
     * 
     */
    public Output<ConnectorMappingPropertiesResponse> mappingProperties() {
        return this.mappingProperties;
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
     * The next run time based on customer&#39;s settings.
     * 
     */
    @Export(name="nextRunTime", type=String.class, parameters={})
    private Output<String> nextRunTime;

    /**
     * @return The next run time based on customer&#39;s settings.
     * 
     */
    public Output<String> nextRunTime() {
        return this.nextRunTime;
    }
    /**
     * The RunId.
     * 
     */
    @Export(name="runId", type=String.class, parameters={})
    private Output<String> runId;

    /**
     * @return The RunId.
     * 
     */
    public Output<String> runId() {
        return this.runId;
    }
    /**
     * State of connector mapping.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of connector mapping.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The hub name.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The hub name.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
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
    public ConnectorMapping(String name) {
        this(name, ConnectorMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectorMapping(String name, ConnectorMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectorMapping(String name, ConnectorMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:ConnectorMapping", name, args == null ? ConnectorMappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectorMapping(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:ConnectorMapping", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170101:ConnectorMapping").build()),
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170426:ConnectorMapping").build())
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
    public static ConnectorMapping get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectorMapping(name, id, options);
    }
}
