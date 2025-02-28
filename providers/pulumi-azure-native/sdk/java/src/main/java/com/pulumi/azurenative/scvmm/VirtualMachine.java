// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scvmm;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.scvmm.VirtualMachineArgs;
import com.pulumi.azurenative.scvmm.outputs.CheckpointResponse;
import com.pulumi.azurenative.scvmm.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.scvmm.outputs.HardwareProfileResponse;
import com.pulumi.azurenative.scvmm.outputs.NetworkProfileResponse;
import com.pulumi.azurenative.scvmm.outputs.OsProfileResponse;
import com.pulumi.azurenative.scvmm.outputs.StorageProfileResponse;
import com.pulumi.azurenative.scvmm.outputs.SystemDataResponse;
import com.pulumi.azurenative.scvmm.outputs.VirtualMachinePropertiesResponseAvailabilitySets;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The VirtualMachines resource definition.
 * API Version: 2020-06-05-preview.
 * 
 * ## Example Usage
 * ### CreateVirtualMachine
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
 *         var virtualMachine = new VirtualMachine(&#34;virtualMachine&#34;, VirtualMachineArgs.builder()        
 *             .cloudId(&#34;/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.SCVMM/Clouds/HRCloud&#34;)
 *             .extendedLocation(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.Arc/customLocations/contoso&#34;),
 *                 Map.entry(&#34;type&#34;, &#34;customLocation&#34;)
 *             ))
 *             .hardwareProfile(Map.ofEntries(
 *                 Map.entry(&#34;cpuCount&#34;, 4),
 *                 Map.entry(&#34;memoryMB&#34;, 4096)
 *             ))
 *             .location(&#34;East US&#34;)
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .templateId(&#34;/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.SCVMM/VirtualMachineTemplates/HRVirtualMachineTemplate&#34;)
 *             .virtualMachineName(&#34;DemoVM&#34;)
 *             .vmmServerId(&#34;/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.SCVMM/VMMServers/ContosoVMMServer&#34;)
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
 * $ pulumi import azure-native:scvmm:VirtualMachine DemoVM /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.SCVMM/VirtualMachines/DemoVM 
 * ```
 * 
 */
@ResourceType(type="azure-native:scvmm:VirtualMachine")
public class VirtualMachine extends com.pulumi.resources.CustomResource {
    /**
     * Availability Sets in vm.
     * 
     */
    @Export(name="availabilitySets", type=List.class, parameters={VirtualMachinePropertiesResponseAvailabilitySets.class})
    private Output</* @Nullable */ List<VirtualMachinePropertiesResponseAvailabilitySets>> availabilitySets;

    /**
     * @return Availability Sets in vm.
     * 
     */
    public Output<Optional<List<VirtualMachinePropertiesResponseAvailabilitySets>>> availabilitySets() {
        return Codegen.optional(this.availabilitySets);
    }
    /**
     * Type of checkpoint supported for the vm.
     * 
     */
    @Export(name="checkpointType", type=String.class, parameters={})
    private Output</* @Nullable */ String> checkpointType;

    /**
     * @return Type of checkpoint supported for the vm.
     * 
     */
    public Output<Optional<String>> checkpointType() {
        return Codegen.optional(this.checkpointType);
    }
    /**
     * Checkpoints in the vm.
     * 
     */
    @Export(name="checkpoints", type=List.class, parameters={CheckpointResponse.class})
    private Output</* @Nullable */ List<CheckpointResponse>> checkpoints;

    /**
     * @return Checkpoints in the vm.
     * 
     */
    public Output<Optional<List<CheckpointResponse>>> checkpoints() {
        return Codegen.optional(this.checkpoints);
    }
    /**
     * ARM Id of the cloud resource to use for deploying the vm.
     * 
     */
    @Export(name="cloudId", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudId;

    /**
     * @return ARM Id of the cloud resource to use for deploying the vm.
     * 
     */
    public Output<Optional<String>> cloudId() {
        return Codegen.optional(this.cloudId);
    }
    /**
     * The extended location.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output<ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location.
     * 
     */
    public Output<ExtendedLocationResponse> extendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Gets or sets the generation for the vm.
     * 
     */
    @Export(name="generation", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> generation;

    /**
     * @return Gets or sets the generation for the vm.
     * 
     */
    public Output<Optional<Integer>> generation() {
        return Codegen.optional(this.generation);
    }
    /**
     * Hardware properties.
     * 
     */
    @Export(name="hardwareProfile", type=HardwareProfileResponse.class, parameters={})
    private Output</* @Nullable */ HardwareProfileResponse> hardwareProfile;

    /**
     * @return Hardware properties.
     * 
     */
    public Output<Optional<HardwareProfileResponse>> hardwareProfile() {
        return Codegen.optional(this.hardwareProfile);
    }
    /**
     * Gets or sets the inventory Item ID for the resource.
     * 
     */
    @Export(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the resource.
     * 
     */
    public Output<Optional<String>> inventoryItemId() {
        return Codegen.optional(this.inventoryItemId);
    }
    /**
     * Gets or sets the location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network properties.
     * 
     */
    @Export(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return Network properties.
     * 
     */
    public Output<Optional<NetworkProfileResponse>> networkProfile() {
        return Codegen.optional(this.networkProfile);
    }
    /**
     * OS properties.
     * 
     */
    @Export(name="osProfile", type=OsProfileResponse.class, parameters={})
    private Output</* @Nullable */ OsProfileResponse> osProfile;

    /**
     * @return OS properties.
     * 
     */
    public Output<Optional<OsProfileResponse>> osProfile() {
        return Codegen.optional(this.osProfile);
    }
    /**
     * Gets the power state of the virtual machine.
     * 
     */
    @Export(name="powerState", type=String.class, parameters={})
    private Output<String> powerState;

    /**
     * @return Gets the power state of the virtual machine.
     * 
     */
    public Output<String> powerState() {
        return this.powerState;
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Storage properties.
     * 
     */
    @Export(name="storageProfile", type=StorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ StorageProfileResponse> storageProfile;

    /**
     * @return Storage properties.
     * 
     */
    public Output<Optional<StorageProfileResponse>> storageProfile() {
        return Codegen.optional(this.storageProfile);
    }
    /**
     * The system data.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
     * ARM Id of the template resource to use for deploying the vm.
     * 
     */
    @Export(name="templateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateId;

    /**
     * @return ARM Id of the template resource to use for deploying the vm.
     * 
     */
    public Output<Optional<String>> templateId() {
        return Codegen.optional(this.templateId);
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Unique ID of the virtual machine.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output</* @Nullable */ String> uuid;

    /**
     * @return Unique ID of the virtual machine.
     * 
     */
    public Output<Optional<String>> uuid() {
        return Codegen.optional(this.uuid);
    }
    /**
     * VMName is the name of VM on the SCVMM server.
     * 
     */
    @Export(name="vmName", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmName;

    /**
     * @return VMName is the name of VM on the SCVMM server.
     * 
     */
    public Output<Optional<String>> vmName() {
        return Codegen.optional(this.vmName);
    }
    /**
     * ARM Id of the vmmServer resource in which this resource resides.
     * 
     */
    @Export(name="vmmServerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmmServerId;

    /**
     * @return ARM Id of the vmmServer resource in which this resource resides.
     * 
     */
    public Output<Optional<String>> vmmServerId() {
        return Codegen.optional(this.vmmServerId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachine(String name) {
        this(name, VirtualMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachine(String name, VirtualMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachine(String name, VirtualMachineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:scvmm:VirtualMachine", name, args == null ? VirtualMachineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachine(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:scvmm:VirtualMachine", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:scvmm/v20200605preview:VirtualMachine").build())
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
    public static VirtualMachine get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachine(name, id, options);
    }
}
