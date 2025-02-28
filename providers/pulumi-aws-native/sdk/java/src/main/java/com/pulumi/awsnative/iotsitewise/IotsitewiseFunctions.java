// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotsitewise.inputs.GetAccessPolicyArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetAccessPolicyPlainArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetAssetArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetAssetModelArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetAssetModelPlainArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetAssetPlainArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetDashboardArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetDashboardPlainArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetGatewayArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetGatewayPlainArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetPortalArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetPortalPlainArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetProjectArgs;
import com.pulumi.awsnative.iotsitewise.inputs.GetProjectPlainArgs;
import com.pulumi.awsnative.iotsitewise.outputs.GetAccessPolicyResult;
import com.pulumi.awsnative.iotsitewise.outputs.GetAssetModelResult;
import com.pulumi.awsnative.iotsitewise.outputs.GetAssetResult;
import com.pulumi.awsnative.iotsitewise.outputs.GetDashboardResult;
import com.pulumi.awsnative.iotsitewise.outputs.GetGatewayResult;
import com.pulumi.awsnative.iotsitewise.outputs.GetPortalResult;
import com.pulumi.awsnative.iotsitewise.outputs.GetProjectResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IotsitewiseFunctions {
    /**
     * Resource schema for AWS::IoTSiteWise::AccessPolicy
     * 
     */
    public static Output<GetAccessPolicyResult> getAccessPolicy(GetAccessPolicyArgs args) {
        return getAccessPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::AccessPolicy
     * 
     */
    public static CompletableFuture<GetAccessPolicyResult> getAccessPolicyPlain(GetAccessPolicyPlainArgs args) {
        return getAccessPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::AccessPolicy
     * 
     */
    public static Output<GetAccessPolicyResult> getAccessPolicy(GetAccessPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iotsitewise:getAccessPolicy", TypeShape.of(GetAccessPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::AccessPolicy
     * 
     */
    public static CompletableFuture<GetAccessPolicyResult> getAccessPolicyPlain(GetAccessPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotsitewise:getAccessPolicy", TypeShape.of(GetAccessPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Asset
     * 
     */
    public static Output<GetAssetResult> getAsset(GetAssetArgs args) {
        return getAsset(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Asset
     * 
     */
    public static CompletableFuture<GetAssetResult> getAssetPlain(GetAssetPlainArgs args) {
        return getAssetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Asset
     * 
     */
    public static Output<GetAssetResult> getAsset(GetAssetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iotsitewise:getAsset", TypeShape.of(GetAssetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Asset
     * 
     */
    public static CompletableFuture<GetAssetResult> getAssetPlain(GetAssetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotsitewise:getAsset", TypeShape.of(GetAssetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::AssetModel
     * 
     */
    public static Output<GetAssetModelResult> getAssetModel(GetAssetModelArgs args) {
        return getAssetModel(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::AssetModel
     * 
     */
    public static CompletableFuture<GetAssetModelResult> getAssetModelPlain(GetAssetModelPlainArgs args) {
        return getAssetModelPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::AssetModel
     * 
     */
    public static Output<GetAssetModelResult> getAssetModel(GetAssetModelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iotsitewise:getAssetModel", TypeShape.of(GetAssetModelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::AssetModel
     * 
     */
    public static CompletableFuture<GetAssetModelResult> getAssetModelPlain(GetAssetModelPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotsitewise:getAssetModel", TypeShape.of(GetAssetModelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Dashboard
     * 
     */
    public static Output<GetDashboardResult> getDashboard(GetDashboardArgs args) {
        return getDashboard(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Dashboard
     * 
     */
    public static CompletableFuture<GetDashboardResult> getDashboardPlain(GetDashboardPlainArgs args) {
        return getDashboardPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Dashboard
     * 
     */
    public static Output<GetDashboardResult> getDashboard(GetDashboardArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iotsitewise:getDashboard", TypeShape.of(GetDashboardResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Dashboard
     * 
     */
    public static CompletableFuture<GetDashboardResult> getDashboardPlain(GetDashboardPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotsitewise:getDashboard", TypeShape.of(GetDashboardResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Gateway
     * 
     */
    public static Output<GetGatewayResult> getGateway(GetGatewayArgs args) {
        return getGateway(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Gateway
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGatewayPlain(GetGatewayPlainArgs args) {
        return getGatewayPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Gateway
     * 
     */
    public static Output<GetGatewayResult> getGateway(GetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iotsitewise:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Gateway
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGatewayPlain(GetGatewayPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotsitewise:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Portal
     * 
     */
    public static Output<GetPortalResult> getPortal(GetPortalArgs args) {
        return getPortal(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Portal
     * 
     */
    public static CompletableFuture<GetPortalResult> getPortalPlain(GetPortalPlainArgs args) {
        return getPortalPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Portal
     * 
     */
    public static Output<GetPortalResult> getPortal(GetPortalArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iotsitewise:getPortal", TypeShape.of(GetPortalResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Portal
     * 
     */
    public static CompletableFuture<GetPortalResult> getPortalPlain(GetPortalPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotsitewise:getPortal", TypeShape.of(GetPortalResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Project
     * 
     */
    public static Output<GetProjectResult> getProject(GetProjectArgs args) {
        return getProject(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Project
     * 
     */
    public static CompletableFuture<GetProjectResult> getProjectPlain(GetProjectPlainArgs args) {
        return getProjectPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Project
     * 
     */
    public static Output<GetProjectResult> getProject(GetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iotsitewise:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTSiteWise::Project
     * 
     */
    public static CompletableFuture<GetProjectResult> getProjectPlain(GetProjectPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotsitewise:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
}
