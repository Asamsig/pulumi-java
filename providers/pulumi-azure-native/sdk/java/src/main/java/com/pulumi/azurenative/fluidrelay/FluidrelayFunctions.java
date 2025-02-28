// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.fluidrelay;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.fluidrelay.inputs.GetFluidRelayServerArgs;
import com.pulumi.azurenative.fluidrelay.inputs.GetFluidRelayServerKeysArgs;
import com.pulumi.azurenative.fluidrelay.inputs.GetFluidRelayServerKeysPlainArgs;
import com.pulumi.azurenative.fluidrelay.inputs.GetFluidRelayServerPlainArgs;
import com.pulumi.azurenative.fluidrelay.outputs.GetFluidRelayServerKeysResult;
import com.pulumi.azurenative.fluidrelay.outputs.GetFluidRelayServerResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class FluidrelayFunctions {
    /**
     * A FluidRelay Server.
     * API Version: 2021-03-12-preview.
     * 
     */
    public static Output<GetFluidRelayServerResult> getFluidRelayServer(GetFluidRelayServerArgs args) {
        return getFluidRelayServer(args, InvokeOptions.Empty);
    }
    /**
     * A FluidRelay Server.
     * API Version: 2021-03-12-preview.
     * 
     */
    public static CompletableFuture<GetFluidRelayServerResult> getFluidRelayServerPlain(GetFluidRelayServerPlainArgs args) {
        return getFluidRelayServerPlain(args, InvokeOptions.Empty);
    }
    /**
     * A FluidRelay Server.
     * API Version: 2021-03-12-preview.
     * 
     */
    public static Output<GetFluidRelayServerResult> getFluidRelayServer(GetFluidRelayServerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:fluidrelay:getFluidRelayServer", TypeShape.of(GetFluidRelayServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A FluidRelay Server.
     * API Version: 2021-03-12-preview.
     * 
     */
    public static CompletableFuture<GetFluidRelayServerResult> getFluidRelayServerPlain(GetFluidRelayServerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:fluidrelay:getFluidRelayServer", TypeShape.of(GetFluidRelayServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The set of available keys for this server.
     * API Version: 2021-03-12-preview.
     * 
     */
    public static Output<GetFluidRelayServerKeysResult> getFluidRelayServerKeys(GetFluidRelayServerKeysArgs args) {
        return getFluidRelayServerKeys(args, InvokeOptions.Empty);
    }
    /**
     * The set of available keys for this server.
     * API Version: 2021-03-12-preview.
     * 
     */
    public static CompletableFuture<GetFluidRelayServerKeysResult> getFluidRelayServerKeysPlain(GetFluidRelayServerKeysPlainArgs args) {
        return getFluidRelayServerKeysPlain(args, InvokeOptions.Empty);
    }
    /**
     * The set of available keys for this server.
     * API Version: 2021-03-12-preview.
     * 
     */
    public static Output<GetFluidRelayServerKeysResult> getFluidRelayServerKeys(GetFluidRelayServerKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:fluidrelay:getFluidRelayServerKeys", TypeShape.of(GetFluidRelayServerKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The set of available keys for this server.
     * API Version: 2021-03-12-preview.
     * 
     */
    public static CompletableFuture<GetFluidRelayServerKeysResult> getFluidRelayServerKeysPlain(GetFluidRelayServerKeysPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:fluidrelay:getFluidRelayServerKeys", TypeShape.of(GetFluidRelayServerKeysResult.class), args, Utilities.withVersion(options));
    }
}
