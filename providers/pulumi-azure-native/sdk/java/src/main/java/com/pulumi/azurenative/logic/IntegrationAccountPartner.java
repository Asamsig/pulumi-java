// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.logic.IntegrationAccountPartnerArgs;
import com.pulumi.azurenative.logic.outputs.PartnerContentResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The integration account partner.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * ### Create or update a partner
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
 *         var integrationAccountPartner = new IntegrationAccountPartner(&#34;integrationAccountPartner&#34;, IntegrationAccountPartnerArgs.builder()        
 *             .content(Map.of(&#34;b2b&#34;, Map.of(&#34;businessIdentities&#34;, Map.ofEntries(
 *                 Map.entry(&#34;qualifier&#34;, &#34;AA&#34;),
 *                 Map.entry(&#34;value&#34;, &#34;ZZ&#34;)
 *             ))))
 *             .integrationAccountName(&#34;testIntegrationAccount&#34;)
 *             .location(&#34;westus&#34;)
 *             .metadata()
 *             .partnerName(&#34;testPartner&#34;)
 *             .partnerType(&#34;B2B&#34;)
 *             .resourceGroupName(&#34;testResourceGroup&#34;)
 *             .tags()
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
 * $ pulumi import azure-native:logic:IntegrationAccountPartner testPartner /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/flowrg/providers/Microsoft.Logic/integrationAccounts/testIntegrationAccount/partners/testPartner 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountPartner")
public class IntegrationAccountPartner extends com.pulumi.resources.CustomResource {
    /**
     * The changed time.
     * 
     */
    @Export(name="changedTime", type=String.class, parameters={})
    private Output<String> changedTime;

    /**
     * @return The changed time.
     * 
     */
    public Output<String> changedTime() {
        return this.changedTime;
    }
    /**
     * The partner content.
     * 
     */
    @Export(name="content", type=PartnerContentResponse.class, parameters={})
    private Output<PartnerContentResponse> content;

    /**
     * @return The partner content.
     * 
     */
    public Output<PartnerContentResponse> content() {
        return this.content;
    }
    /**
     * The created time.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The created time.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
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
     * The metadata.
     * 
     */
    @Export(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Output<Optional<Object>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Gets the resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The partner type.
     * 
     */
    @Export(name="partnerType", type=String.class, parameters={})
    private Output<String> partnerType;

    /**
     * @return The partner type.
     * 
     */
    public Output<String> partnerType() {
        return this.partnerType;
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Gets the resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccountPartner(String name) {
        this(name, IntegrationAccountPartnerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountPartner(String name, IntegrationAccountPartnerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountPartner(String name, IntegrationAccountPartnerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountPartner", name, args == null ? IntegrationAccountPartnerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationAccountPartner(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountPartner", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:logic/v20150801preview:IntegrationAccountPartner").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20160601:IntegrationAccountPartner").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20180701preview:IntegrationAccountPartner").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20190501:IntegrationAccountPartner").build())
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
    public static IntegrationAccountPartner get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccountPartner(name, id, options);
    }
}
