// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iottwinmaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iottwinmaker.inputs.GetComponentTypeArgs;
import com.pulumi.awsnative.iottwinmaker.inputs.GetComponentTypePlainArgs;
import com.pulumi.awsnative.iottwinmaker.inputs.GetEntityArgs;
import com.pulumi.awsnative.iottwinmaker.inputs.GetEntityPlainArgs;
import com.pulumi.awsnative.iottwinmaker.inputs.GetSceneArgs;
import com.pulumi.awsnative.iottwinmaker.inputs.GetScenePlainArgs;
import com.pulumi.awsnative.iottwinmaker.inputs.GetWorkspaceArgs;
import com.pulumi.awsnative.iottwinmaker.inputs.GetWorkspacePlainArgs;
import com.pulumi.awsnative.iottwinmaker.outputs.GetComponentTypeResult;
import com.pulumi.awsnative.iottwinmaker.outputs.GetEntityResult;
import com.pulumi.awsnative.iottwinmaker.outputs.GetSceneResult;
import com.pulumi.awsnative.iottwinmaker.outputs.GetWorkspaceResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IottwinmakerFunctions {
    /**
     * Resource schema for AWS::IoTTwinMaker::ComponentType
     * 
     */
    public static Output<GetComponentTypeResult> getComponentType(GetComponentTypeArgs args) {
        return getComponentType(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::ComponentType
     * 
     */
    public static CompletableFuture<GetComponentTypeResult> getComponentTypePlain(GetComponentTypePlainArgs args) {
        return getComponentTypePlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::ComponentType
     * 
     */
    public static Output<GetComponentTypeResult> getComponentType(GetComponentTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iottwinmaker:getComponentType", TypeShape.of(GetComponentTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::ComponentType
     * 
     */
    public static CompletableFuture<GetComponentTypeResult> getComponentTypePlain(GetComponentTypePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iottwinmaker:getComponentType", TypeShape.of(GetComponentTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Entity
     * 
     */
    public static Output<GetEntityResult> getEntity(GetEntityArgs args) {
        return getEntity(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Entity
     * 
     */
    public static CompletableFuture<GetEntityResult> getEntityPlain(GetEntityPlainArgs args) {
        return getEntityPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Entity
     * 
     */
    public static Output<GetEntityResult> getEntity(GetEntityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iottwinmaker:getEntity", TypeShape.of(GetEntityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Entity
     * 
     */
    public static CompletableFuture<GetEntityResult> getEntityPlain(GetEntityPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iottwinmaker:getEntity", TypeShape.of(GetEntityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Scene
     * 
     */
    public static Output<GetSceneResult> getScene(GetSceneArgs args) {
        return getScene(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Scene
     * 
     */
    public static CompletableFuture<GetSceneResult> getScenePlain(GetScenePlainArgs args) {
        return getScenePlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Scene
     * 
     */
    public static Output<GetSceneResult> getScene(GetSceneArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iottwinmaker:getScene", TypeShape.of(GetSceneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Scene
     * 
     */
    public static CompletableFuture<GetSceneResult> getScenePlain(GetScenePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iottwinmaker:getScene", TypeShape.of(GetSceneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Workspace
     * 
     */
    public static Output<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args) {
        return getWorkspace(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Workspace
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspacePlain(GetWorkspacePlainArgs args) {
        return getWorkspacePlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Workspace
     * 
     */
    public static Output<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:iottwinmaker:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::IoTTwinMaker::Workspace
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspacePlain(GetWorkspacePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iottwinmaker:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
}
