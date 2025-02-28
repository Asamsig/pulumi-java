// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.vmwarecloudsimple.inputs.GetDedicatedCloudNodeArgs;
import com.pulumi.azurenative.vmwarecloudsimple.inputs.GetDedicatedCloudNodePlainArgs;
import com.pulumi.azurenative.vmwarecloudsimple.inputs.GetDedicatedCloudServiceArgs;
import com.pulumi.azurenative.vmwarecloudsimple.inputs.GetDedicatedCloudServicePlainArgs;
import com.pulumi.azurenative.vmwarecloudsimple.inputs.GetVirtualMachineArgs;
import com.pulumi.azurenative.vmwarecloudsimple.inputs.GetVirtualMachinePlainArgs;
import com.pulumi.azurenative.vmwarecloudsimple.outputs.GetDedicatedCloudNodeResult;
import com.pulumi.azurenative.vmwarecloudsimple.outputs.GetDedicatedCloudServiceResult;
import com.pulumi.azurenative.vmwarecloudsimple.outputs.GetVirtualMachineResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class VmwarecloudsimpleFunctions {
    /**
     * Dedicated cloud node model
     * API Version: 2019-04-01.
     * 
     */
    public static Output<GetDedicatedCloudNodeResult> getDedicatedCloudNode(GetDedicatedCloudNodeArgs args) {
        return getDedicatedCloudNode(args, InvokeOptions.Empty);
    }
    /**
     * Dedicated cloud node model
     * API Version: 2019-04-01.
     * 
     */
    public static CompletableFuture<GetDedicatedCloudNodeResult> getDedicatedCloudNodePlain(GetDedicatedCloudNodePlainArgs args) {
        return getDedicatedCloudNodePlain(args, InvokeOptions.Empty);
    }
    /**
     * Dedicated cloud node model
     * API Version: 2019-04-01.
     * 
     */
    public static Output<GetDedicatedCloudNodeResult> getDedicatedCloudNode(GetDedicatedCloudNodeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:vmwarecloudsimple:getDedicatedCloudNode", TypeShape.of(GetDedicatedCloudNodeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Dedicated cloud node model
     * API Version: 2019-04-01.
     * 
     */
    public static CompletableFuture<GetDedicatedCloudNodeResult> getDedicatedCloudNodePlain(GetDedicatedCloudNodePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:vmwarecloudsimple:getDedicatedCloudNode", TypeShape.of(GetDedicatedCloudNodeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Dedicated cloud service model
     * API Version: 2019-04-01.
     * 
     */
    public static Output<GetDedicatedCloudServiceResult> getDedicatedCloudService(GetDedicatedCloudServiceArgs args) {
        return getDedicatedCloudService(args, InvokeOptions.Empty);
    }
    /**
     * Dedicated cloud service model
     * API Version: 2019-04-01.
     * 
     */
    public static CompletableFuture<GetDedicatedCloudServiceResult> getDedicatedCloudServicePlain(GetDedicatedCloudServicePlainArgs args) {
        return getDedicatedCloudServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Dedicated cloud service model
     * API Version: 2019-04-01.
     * 
     */
    public static Output<GetDedicatedCloudServiceResult> getDedicatedCloudService(GetDedicatedCloudServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:vmwarecloudsimple:getDedicatedCloudService", TypeShape.of(GetDedicatedCloudServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Dedicated cloud service model
     * API Version: 2019-04-01.
     * 
     */
    public static CompletableFuture<GetDedicatedCloudServiceResult> getDedicatedCloudServicePlain(GetDedicatedCloudServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:vmwarecloudsimple:getDedicatedCloudService", TypeShape.of(GetDedicatedCloudServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Virtual machine model
     * API Version: 2019-04-01.
     * 
     */
    public static Output<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args) {
        return getVirtualMachine(args, InvokeOptions.Empty);
    }
    /**
     * Virtual machine model
     * API Version: 2019-04-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachinePlain(GetVirtualMachinePlainArgs args) {
        return getVirtualMachinePlain(args, InvokeOptions.Empty);
    }
    /**
     * Virtual machine model
     * API Version: 2019-04-01.
     * 
     */
    public static Output<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:vmwarecloudsimple:getVirtualMachine", TypeShape.of(GetVirtualMachineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Virtual machine model
     * API Version: 2019-04-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachinePlain(GetVirtualMachinePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:vmwarecloudsimple:getVirtualMachine", TypeShape.of(GetVirtualMachineResult.class), args, Utilities.withVersion(options));
    }
}
