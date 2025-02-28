// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.GuestDiagnosticsSettingsAssociationArgs;
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
 * Virtual machine guest diagnostic settings resource.
 * API Version: 2018-06-01-preview.
 * 
 * ## Example Usage
 * ### Create or update an guest diagnostic settings association
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
 *         var guestDiagnosticsSettingsAssociation = new GuestDiagnosticsSettingsAssociation(&#34;guestDiagnosticsSettingsAssociation&#34;, GuestDiagnosticsSettingsAssociationArgs.builder()        
 *             .associationName(&#34;healthSystemMachineConfigAssociation&#34;)
 *             .guestDiagnosticSettingsName(&#34;/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/Default-Association-ResourceGroup/providers/providers/microsoft.insights/guestDiagnosticSettings/vmSettingForSecurity&#34;)
 *             .location(&#34;Global&#34;)
 *             .resourceUri(&#34;subscriptions/8498f01b-8064-4e37-856e-318f3c6c685f/resourceGroups/healthsystem/providers/Microsoft.Compute/virtualMachines/eastussojai&#34;)
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
 * $ pulumi import azure-native:insights:GuestDiagnosticsSettingsAssociation healthSystemMachineConfigAssociation /subscriptions/8498f01b-8064-4e37-856e-318f3c6c685f/resourceGroups/healthsystem/providers/Microsoft.Compute/virtualMachines/eastussojai/providers/microsoft.insights/guestDiagnosticSettingsAssociation/healthSystemMachineConfigAssociation 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:GuestDiagnosticsSettingsAssociation")
public class GuestDiagnosticsSettingsAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The guest diagnostic settings name.
     * 
     */
    @Export(name="guestDiagnosticSettingsName", type=String.class, parameters={})
    private Output<String> guestDiagnosticSettingsName;

    /**
     * @return The guest diagnostic settings name.
     * 
     */
    public Output<String> guestDiagnosticSettingsName() {
        return this.guestDiagnosticSettingsName;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GuestDiagnosticsSettingsAssociation(String name) {
        this(name, GuestDiagnosticsSettingsAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GuestDiagnosticsSettingsAssociation(String name, GuestDiagnosticsSettingsAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestDiagnosticsSettingsAssociation(String name, GuestDiagnosticsSettingsAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:GuestDiagnosticsSettingsAssociation", name, args == null ? GuestDiagnosticsSettingsAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GuestDiagnosticsSettingsAssociation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:GuestDiagnosticsSettingsAssociation", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20180601preview:GuestDiagnosticsSettingsAssociation").build())
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
    public static GuestDiagnosticsSettingsAssociation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GuestDiagnosticsSettingsAssociation(name, id, options);
    }
}
