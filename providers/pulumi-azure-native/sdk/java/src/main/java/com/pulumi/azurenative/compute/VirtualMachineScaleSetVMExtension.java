// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.VirtualMachineScaleSetVMExtensionArgs;
import com.pulumi.azurenative.compute.outputs.VirtualMachineExtensionInstanceViewResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Describes a VMSS VM Extension.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * ### Create VirtualMachineScaleSet VM extension.
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
 *         var virtualMachineScaleSetVMExtension = new VirtualMachineScaleSetVMExtension(&#34;virtualMachineScaleSetVMExtension&#34;, VirtualMachineScaleSetVMExtensionArgs.builder()        
 *             .autoUpgradeMinorVersion(true)
 *             .instanceId(&#34;0&#34;)
 *             .publisher(&#34;extPublisher&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .settings(Map.of(&#34;UserName&#34;, &#34;xyz@microsoft.com&#34;))
 *             .type(&#34;extType&#34;)
 *             .typeHandlerVersion(&#34;1.2&#34;)
 *             .vmExtensionName(&#34;myVMExtension&#34;)
 *             .vmScaleSetName(&#34;myvmScaleSet&#34;)
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
 * $ pulumi import azure-native:compute:VirtualMachineScaleSetVMExtension myVMExtension /subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachineScaleSets/myvmScaleSet/virtualMachines/0/extensions/myVMExtension 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:VirtualMachineScaleSetVMExtension")
public class VirtualMachineScaleSetVMExtension extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @Export(name="autoUpgradeMinorVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpgradeMinorVersion;

    /**
     * @return Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    public Output<Optional<Boolean>> autoUpgradeMinorVersion() {
        return Codegen.optional(this.autoUpgradeMinorVersion);
    }
    /**
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    @Export(name="enableAutomaticUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutomaticUpgrade;

    /**
     * @return Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    public Output<Optional<Boolean>> enableAutomaticUpgrade() {
        return Codegen.optional(this.enableAutomaticUpgrade);
    }
    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    @Export(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    /**
     * @return How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    public Output<Optional<String>> forceUpdateTag() {
        return Codegen.optional(this.forceUpdateTag);
    }
    /**
     * The virtual machine extension instance view.
     * 
     */
    @Export(name="instanceView", type=VirtualMachineExtensionInstanceViewResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineExtensionInstanceViewResponse> instanceView;

    /**
     * @return The virtual machine extension instance view.
     * 
     */
    public Output<Optional<VirtualMachineExtensionInstanceViewResponse>> instanceView() {
        return Codegen.optional(this.instanceView);
    }
    /**
     * The name of the extension.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the extension.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    @Export(name="protectedSettings", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> protectedSettings;

    /**
     * @return The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    public Output<Optional<Object>> protectedSettings() {
        return Codegen.optional(this.protectedSettings);
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the extension handler publisher.
     * 
     */
    @Export(name="publisher", type=String.class, parameters={})
    private Output</* @Nullable */ String> publisher;

    /**
     * @return The name of the extension handler publisher.
     * 
     */
    public Output<Optional<String>> publisher() {
        return Codegen.optional(this.publisher);
    }
    /**
     * Json formatted public settings for the extension.
     * 
     */
    @Export(name="settings", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> settings;

    /**
     * @return Json formatted public settings for the extension.
     * 
     */
    public Output<Optional<Object>> settings() {
        return Codegen.optional(this.settings);
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
    /**
     * Specifies the version of the script handler.
     * 
     */
    @Export(name="typeHandlerVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeHandlerVersion;

    /**
     * @return Specifies the version of the script handler.
     * 
     */
    public Output<Optional<String>> typeHandlerVersion() {
        return Codegen.optional(this.typeHandlerVersion);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachineScaleSetVMExtension(String name) {
        this(name, VirtualMachineScaleSetVMExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineScaleSetVMExtension(String name, VirtualMachineScaleSetVMExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineScaleSetVMExtension(String name, VirtualMachineScaleSetVMExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSetVMExtension", name, args == null ? VirtualMachineScaleSetVMExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachineScaleSetVMExtension(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSetVMExtension", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20190701:VirtualMachineScaleSetVMExtension").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191201:VirtualMachineScaleSetVMExtension").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200601:VirtualMachineScaleSetVMExtension").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:VirtualMachineScaleSetVMExtension").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210301:VirtualMachineScaleSetVMExtension").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:VirtualMachineScaleSetVMExtension").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:VirtualMachineScaleSetVMExtension").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211101:VirtualMachineScaleSetVMExtension").build())
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
    public static VirtualMachineScaleSetVMExtension get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineScaleSetVMExtension(name, id, options);
    }
}
