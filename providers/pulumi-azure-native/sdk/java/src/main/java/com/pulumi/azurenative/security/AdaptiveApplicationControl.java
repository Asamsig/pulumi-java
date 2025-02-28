// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.security.AdaptiveApplicationControlArgs;
import com.pulumi.azurenative.security.outputs.AdaptiveApplicationControlIssueSummaryResponse;
import com.pulumi.azurenative.security.outputs.PathRecommendationResponse;
import com.pulumi.azurenative.security.outputs.ProtectionModeResponse;
import com.pulumi.azurenative.security.outputs.VmRecommendationResponse;
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
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * ### Update an application control machine group by adding a new application
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
 *         var adaptiveApplicationControl = new AdaptiveApplicationControl(&#34;adaptiveApplicationControl&#34;, AdaptiveApplicationControlArgs.builder()        
 *             .ascLocation(&#34;centralus&#34;)
 *             .enforcementMode(&#34;Audit&#34;)
 *             .groupName(&#34;ERELGROUP1&#34;)
 *             .pathRecommendations(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;action&#34;, &#34;Recommended&#34;),
 *                     Map.entry(&#34;common&#34;, true),
 *                     Map.entry(&#34;configurationStatus&#34;, &#34;Configured&#34;),
 *                     Map.entry(&#34;fileType&#34;, &#34;Exe&#34;),
 *                     Map.entry(&#34;path&#34;, &#34;[Exe] O=MICROSOFT CORPORATION, L=REDMOND, S=WASHINGTON, C=US\\*\\*\\0.0.0.0&#34;),
 *                     Map.entry(&#34;publisherInfo&#34;, Map.ofEntries(
 *                         Map.entry(&#34;binaryName&#34;, &#34;*&#34;),
 *                         Map.entry(&#34;productName&#34;, &#34;*&#34;),
 *                         Map.entry(&#34;publisherName&#34;, &#34;O=MICROSOFT CORPORATION, L=REDMOND, S=WASHINGTON, C=US&#34;),
 *                         Map.entry(&#34;version&#34;, &#34;0.0.0.0&#34;)
 *                     )),
 *                     Map.entry(&#34;type&#34;, &#34;PublisherSignature&#34;),
 *                     Map.entry(&#34;userSids&#34;, &#34;S-1-1-0&#34;),
 *                     Map.entry(&#34;usernames&#34;, Map.ofEntries(
 *                         Map.entry(&#34;recommendationAction&#34;, &#34;Recommended&#34;),
 *                         Map.entry(&#34;username&#34;, &#34;Everyone&#34;)
 *                     ))
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;action&#34;, &#34;Recommended&#34;),
 *                     Map.entry(&#34;common&#34;, true),
 *                     Map.entry(&#34;configurationStatus&#34;, &#34;Configured&#34;),
 *                     Map.entry(&#34;fileType&#34;, &#34;Exe&#34;),
 *                     Map.entry(&#34;path&#34;, &#34;%OSDRIVE%\\WINDOWSAZURE\\SECAGENT\\WASECAGENTPROV.EXE&#34;),
 *                     Map.entry(&#34;publisherInfo&#34;, Map.ofEntries(
 *                         Map.entry(&#34;binaryName&#34;, &#34;*&#34;),
 *                         Map.entry(&#34;productName&#34;, &#34;MICROSOFT® COREXT&#34;),
 *                         Map.entry(&#34;publisherName&#34;, &#34;CN=MICROSOFT AZURE DEPENDENCY CODE SIGN&#34;),
 *                         Map.entry(&#34;version&#34;, &#34;0.0.0.0&#34;)
 *                     )),
 *                     Map.entry(&#34;type&#34;, &#34;ProductSignature&#34;),
 *                     Map.entry(&#34;userSids&#34;, &#34;S-1-1-0&#34;),
 *                     Map.entry(&#34;usernames&#34;, Map.ofEntries(
 *                         Map.entry(&#34;recommendationAction&#34;, &#34;Recommended&#34;),
 *                         Map.entry(&#34;username&#34;, &#34;NT AUTHORITY\\SYSTEM&#34;)
 *                     ))
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;action&#34;, &#34;Recommended&#34;),
 *                     Map.entry(&#34;common&#34;, true),
 *                     Map.entry(&#34;configurationStatus&#34;, &#34;Configured&#34;),
 *                     Map.entry(&#34;fileType&#34;, &#34;Exe&#34;),
 *                     Map.entry(&#34;path&#34;, &#34;%OSDRIVE%\\WINDOWSAZURE\\PACKAGES_201973_7415\\COLLECTGUESTLOGS.EXE&#34;),
 *                     Map.entry(&#34;publisherInfo&#34;, Map.ofEntries(
 *                         Map.entry(&#34;binaryName&#34;, &#34;*&#34;),
 *                         Map.entry(&#34;productName&#34;, &#34;*&#34;),
 *                         Map.entry(&#34;publisherName&#34;, &#34;CN=MICROSOFT AZURE DEPENDENCY CODE SIGN&#34;),
 *                         Map.entry(&#34;version&#34;, &#34;0.0.0.0&#34;)
 *                     )),
 *                     Map.entry(&#34;type&#34;, &#34;PublisherSignature&#34;),
 *                     Map.entry(&#34;userSids&#34;, &#34;S-1-1-0&#34;),
 *                     Map.entry(&#34;usernames&#34;, Map.ofEntries(
 *                         Map.entry(&#34;recommendationAction&#34;, &#34;Recommended&#34;),
 *                         Map.entry(&#34;username&#34;, &#34;NT AUTHORITY\\SYSTEM&#34;)
 *                     ))
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;action&#34;, &#34;Add&#34;),
 *                     Map.entry(&#34;common&#34;, true),
 *                     Map.entry(&#34;path&#34;, &#34;C:\\directory\\file.exe&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;File&#34;)
 *                 ))
 *             .protectionMode(Map.ofEntries(
 *                 Map.entry(&#34;exe&#34;, &#34;Audit&#34;),
 *                 Map.entry(&#34;msi&#34;, &#34;None&#34;),
 *                 Map.entry(&#34;script&#34;, &#34;None&#34;)
 *             ))
 *             .vmRecommendations(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;configurationStatus&#34;, &#34;Configured&#34;),
 *                     Map.entry(&#34;enforcementSupport&#34;, &#34;Supported&#34;),
 *                     Map.entry(&#34;recommendationAction&#34;, &#34;Recommended&#34;),
 *                     Map.entry(&#34;resourceId&#34;, &#34;/subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourcegroups/erelh-stable/providers/microsoft.compute/virtualmachines/erelh-16090&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;configurationStatus&#34;, &#34;Configured&#34;),
 *                     Map.entry(&#34;enforcementSupport&#34;, &#34;Supported&#34;),
 *                     Map.entry(&#34;recommendationAction&#34;, &#34;Recommended&#34;),
 *                     Map.entry(&#34;resourceId&#34;, &#34;/subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourcegroups/matanvs/providers/microsoft.compute/virtualmachines/matanvs19&#34;)
 *                 ))
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
 * $ pulumi import azure-native:security:AdaptiveApplicationControl ERELGROUP1 /subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/providers/Microsoft.Security/locations/centralus/applicationWhitelistings/ERELGROUP1 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:AdaptiveApplicationControl")
public class AdaptiveApplicationControl extends com.pulumi.resources.CustomResource {
    /**
     * The configuration status of the machines group or machine or rule
     * 
     */
    @Export(name="configurationStatus", type=String.class, parameters={})
    private Output<String> configurationStatus;

    /**
     * @return The configuration status of the machines group or machine or rule
     * 
     */
    public Output<String> configurationStatus() {
        return this.configurationStatus;
    }
    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @Export(name="enforcementMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> enforcementMode;

    /**
     * @return The application control policy enforcement/protection mode of the machine group
     * 
     */
    public Output<Optional<String>> enforcementMode() {
        return Codegen.optional(this.enforcementMode);
    }
    @Export(name="issues", type=List.class, parameters={AdaptiveApplicationControlIssueSummaryResponse.class})
    private Output<List<AdaptiveApplicationControlIssueSummaryResponse>> issues;

    public Output<List<AdaptiveApplicationControlIssueSummaryResponse>> issues() {
        return this.issues;
    }
    /**
     * Location where the resource is stored
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location where the resource is stored
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="pathRecommendations", type=List.class, parameters={PathRecommendationResponse.class})
    private Output</* @Nullable */ List<PathRecommendationResponse>> pathRecommendations;

    public Output<Optional<List<PathRecommendationResponse>>> pathRecommendations() {
        return Codegen.optional(this.pathRecommendations);
    }
    /**
     * The protection mode of the collection/file types. Exe/Msi/Script are used for Windows, Executable is used for Linux.
     * 
     */
    @Export(name="protectionMode", type=ProtectionModeResponse.class, parameters={})
    private Output</* @Nullable */ ProtectionModeResponse> protectionMode;

    /**
     * @return The protection mode of the collection/file types. Exe/Msi/Script are used for Windows, Executable is used for Linux.
     * 
     */
    public Output<Optional<ProtectionModeResponse>> protectionMode() {
        return Codegen.optional(this.protectionMode);
    }
    /**
     * The initial recommendation status of the machine group or machine
     * 
     */
    @Export(name="recommendationStatus", type=String.class, parameters={})
    private Output<String> recommendationStatus;

    /**
     * @return The initial recommendation status of the machine group or machine
     * 
     */
    public Output<String> recommendationStatus() {
        return this.recommendationStatus;
    }
    /**
     * The source type of the machine group
     * 
     */
    @Export(name="sourceSystem", type=String.class, parameters={})
    private Output<String> sourceSystem;

    /**
     * @return The source type of the machine group
     * 
     */
    public Output<String> sourceSystem() {
        return this.sourceSystem;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="vmRecommendations", type=List.class, parameters={VmRecommendationResponse.class})
    private Output</* @Nullable */ List<VmRecommendationResponse>> vmRecommendations;

    public Output<Optional<List<VmRecommendationResponse>>> vmRecommendations() {
        return Codegen.optional(this.vmRecommendations);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AdaptiveApplicationControl(String name) {
        this(name, AdaptiveApplicationControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AdaptiveApplicationControl(String name, AdaptiveApplicationControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AdaptiveApplicationControl(String name, AdaptiveApplicationControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:AdaptiveApplicationControl", name, args == null ? AdaptiveApplicationControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AdaptiveApplicationControl(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:AdaptiveApplicationControl", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20150601preview:AdaptiveApplicationControl").build()),
                Output.of(Alias.builder().type("azure-native:security/v20200101:AdaptiveApplicationControl").build())
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
    public static AdaptiveApplicationControl get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AdaptiveApplicationControl(name, id, options);
    }
}
