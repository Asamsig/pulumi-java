// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.extendedlocation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.extendedlocation.inputs.GetCustomLocationArgs;
import com.pulumi.azurenative.extendedlocation.inputs.GetCustomLocationPlainArgs;
import com.pulumi.azurenative.extendedlocation.inputs.GetResourceSyncRuleArgs;
import com.pulumi.azurenative.extendedlocation.inputs.GetResourceSyncRulePlainArgs;
import com.pulumi.azurenative.extendedlocation.outputs.GetCustomLocationResult;
import com.pulumi.azurenative.extendedlocation.outputs.GetResourceSyncRuleResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ExtendedlocationFunctions {
    /**
     * Custom Locations definition.
     * API Version: 2021-03-15-preview.
     * 
     */
    public static Output<GetCustomLocationResult> getCustomLocation(GetCustomLocationArgs args) {
        return getCustomLocation(args, InvokeOptions.Empty);
    }
    /**
     * Custom Locations definition.
     * API Version: 2021-03-15-preview.
     * 
     */
    public static CompletableFuture<GetCustomLocationResult> getCustomLocationPlain(GetCustomLocationPlainArgs args) {
        return getCustomLocationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Custom Locations definition.
     * API Version: 2021-03-15-preview.
     * 
     */
    public static Output<GetCustomLocationResult> getCustomLocation(GetCustomLocationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:extendedlocation:getCustomLocation", TypeShape.of(GetCustomLocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Custom Locations definition.
     * API Version: 2021-03-15-preview.
     * 
     */
    public static CompletableFuture<GetCustomLocationResult> getCustomLocationPlain(GetCustomLocationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:extendedlocation:getCustomLocation", TypeShape.of(GetCustomLocationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Sync Rules definition.
     * API Version: 2021-08-31-preview.
     * 
     */
    public static Output<GetResourceSyncRuleResult> getResourceSyncRule(GetResourceSyncRuleArgs args) {
        return getResourceSyncRule(args, InvokeOptions.Empty);
    }
    /**
     * Resource Sync Rules definition.
     * API Version: 2021-08-31-preview.
     * 
     */
    public static CompletableFuture<GetResourceSyncRuleResult> getResourceSyncRulePlain(GetResourceSyncRulePlainArgs args) {
        return getResourceSyncRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Sync Rules definition.
     * API Version: 2021-08-31-preview.
     * 
     */
    public static Output<GetResourceSyncRuleResult> getResourceSyncRule(GetResourceSyncRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:extendedlocation:getResourceSyncRule", TypeShape.of(GetResourceSyncRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Sync Rules definition.
     * API Version: 2021-08-31-preview.
     * 
     */
    public static CompletableFuture<GetResourceSyncRuleResult> getResourceSyncRulePlain(GetResourceSyncRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:extendedlocation:getResourceSyncRule", TypeShape.of(GetResourceSyncRuleResult.class), args, Utilities.withVersion(options));
    }
}
