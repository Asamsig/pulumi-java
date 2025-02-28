// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.SecurityUserConfigurationArgs;
import com.pulumi.azurenative.network.outputs.SystemDataResponse;
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
 * Defines the security configuration
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * ### Create network manager security user configuration
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
 *         var securityUserConfiguration = new SecurityUserConfiguration(&#34;securityUserConfiguration&#34;, SecurityUserConfigurationArgs.builder()        
 *             .configurationName(&#34;myTestSecurityConfig&#34;)
 *             .deleteExistingNSGs(&#34;True&#34;)
 *             .description(&#34;A sample policy&#34;)
 *             .networkManagerName(&#34;testNetworkManager&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .securityType(&#34;UserPolicy&#34;)
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
 * $ pulumi import azure-native:network:SecurityUserConfiguration myTestSecurityConfig /subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/networkManager/testNetworkManager/securityConfigurations/myTestSecurityConfig 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:SecurityUserConfiguration")
public class SecurityUserConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Flag if need to delete existing network security groups.
     * 
     */
    @Export(name="deleteExistingNSGs", type=String.class, parameters={})
    private Output</* @Nullable */ String> deleteExistingNSGs;

    /**
     * @return Flag if need to delete existing network security groups.
     * 
     */
    public Output<Optional<String>> deleteExistingNSGs() {
        return Codegen.optional(this.deleteExistingNSGs);
    }
    /**
     * A description of the security configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the security configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A display name of the security configuration.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return A display name of the security configuration.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
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
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Security Type.
     * 
     */
    @Export(name="securityType", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityType;

    /**
     * @return Security Type.
     * 
     */
    public Output<Optional<String>> securityType() {
        return Codegen.optional(this.securityType);
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata related to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public SecurityUserConfiguration(String name) {
        this(name, SecurityUserConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityUserConfiguration(String name, SecurityUserConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityUserConfiguration(String name, SecurityUserConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:SecurityUserConfiguration", name, args == null ? SecurityUserConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityUserConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:SecurityUserConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20210201preview:SecurityUserConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501preview:SecurityUserConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20220201preview:SecurityUserConfiguration").build())
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
    public static SecurityUserConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityUserConfiguration(name, id, options);
    }
}
