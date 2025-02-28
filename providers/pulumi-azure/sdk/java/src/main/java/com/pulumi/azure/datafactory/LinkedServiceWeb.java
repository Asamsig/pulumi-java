// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.LinkedServiceWebArgs;
import com.pulumi.azure.datafactory.inputs.LinkedServiceWebState;
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
 * Manages a Linked Service (connection) between a Web Server and Azure Data Factory.
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleLinkedServiceWeb = new LinkedServiceWeb(&#34;exampleLinkedServiceWeb&#34;, LinkedServiceWebArgs.builder()        
 *             .dataFactoryId(exampleFactory.getId())
 *             .authenticationType(&#34;Anonymous&#34;)
 *             .url(&#34;http://www.bing.com&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Factory Linked Service&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/linkedServiceWeb:LinkedServiceWeb example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/linkedServiceWeb:LinkedServiceWeb")
public class LinkedServiceWeb extends com.pulumi.resources.CustomResource {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The type of authentication used to connect to the web table source. Valid options are `Anonymous`, `Basic` and `ClientCertificate`.
     * 
     */
    @Export(name="authenticationType", type=String.class, parameters={})
    private Output<String> authenticationType;

    /**
     * @return The type of authentication used to connect to the web table source. Valid options are `Anonymous`, `Basic` and `ClientCertificate`.
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Linked Service.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="integrationRuntimeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<String>> integrationRuntimeName() {
        return Codegen.optional(this.integrationRuntimeName);
    }
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    @Export(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The URL of the web service endpoint (e.g. http://www.microsoft.com).
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The URL of the web service endpoint (e.g. http://www.microsoft.com).
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    @Export(name="username", type=String.class, parameters={})
    private Output</* @Nullable */ String> username;

    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedServiceWeb(String name) {
        this(name, LinkedServiceWebArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedServiceWeb(String name, LinkedServiceWebArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedServiceWeb(String name, LinkedServiceWebArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceWeb:LinkedServiceWeb", name, args == null ? LinkedServiceWebArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkedServiceWeb(String name, Output<String> id, @Nullable LinkedServiceWebState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceWeb:LinkedServiceWeb", name, state, makeResourceOptions(options, id));
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
    public static LinkedServiceWeb get(String name, Output<String> id, @Nullable LinkedServiceWebState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkedServiceWeb(name, id, state, options);
    }
}
