// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigateway_v1.inputs.GetApiArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetApiConfigIamPolicyArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetApiConfigIamPolicyPlainArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetApiIamPolicyArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetApiIamPolicyPlainArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetApiPlainArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetConfigArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetConfigPlainArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetGatewayArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetGatewayIamPolicyArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetGatewayIamPolicyPlainArgs;
import com.pulumi.googlenative.apigateway_v1.inputs.GetGatewayPlainArgs;
import com.pulumi.googlenative.apigateway_v1.outputs.GetApiConfigIamPolicyResult;
import com.pulumi.googlenative.apigateway_v1.outputs.GetApiIamPolicyResult;
import com.pulumi.googlenative.apigateway_v1.outputs.GetApiResult;
import com.pulumi.googlenative.apigateway_v1.outputs.GetConfigResult;
import com.pulumi.googlenative.apigateway_v1.outputs.GetGatewayIamPolicyResult;
import com.pulumi.googlenative.apigateway_v1.outputs.GetGatewayResult;
import java.util.concurrent.CompletableFuture;

public final class Apigateway_v1Functions {
    /**
     * Gets details of a single Api.
     * 
     */
    public static Output<GetApiResult> getApi(GetApiArgs args) {
        return getApi(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Api.
     * 
     */
    public static CompletableFuture<GetApiResult> getApiPlain(GetApiPlainArgs args) {
        return getApiPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Api.
     * 
     */
    public static Output<GetApiResult> getApi(GetApiArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:apigateway/v1:getApi", TypeShape.of(GetApiResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Api.
     * 
     */
    public static CompletableFuture<GetApiResult> getApiPlain(GetApiPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1:getApi", TypeShape.of(GetApiResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetApiConfigIamPolicyResult> getApiConfigIamPolicy(GetApiConfigIamPolicyArgs args) {
        return getApiConfigIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetApiConfigIamPolicyResult> getApiConfigIamPolicyPlain(GetApiConfigIamPolicyPlainArgs args) {
        return getApiConfigIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetApiConfigIamPolicyResult> getApiConfigIamPolicy(GetApiConfigIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:apigateway/v1:getApiConfigIamPolicy", TypeShape.of(GetApiConfigIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetApiConfigIamPolicyResult> getApiConfigIamPolicyPlain(GetApiConfigIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1:getApiConfigIamPolicy", TypeShape.of(GetApiConfigIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetApiIamPolicyResult> getApiIamPolicy(GetApiIamPolicyArgs args) {
        return getApiIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetApiIamPolicyResult> getApiIamPolicyPlain(GetApiIamPolicyPlainArgs args) {
        return getApiIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetApiIamPolicyResult> getApiIamPolicy(GetApiIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:apigateway/v1:getApiIamPolicy", TypeShape.of(GetApiIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetApiIamPolicyResult> getApiIamPolicyPlain(GetApiIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1:getApiIamPolicy", TypeShape.of(GetApiIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single ApiConfig.
     * 
     */
    public static Output<GetConfigResult> getConfig(GetConfigArgs args) {
        return getConfig(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single ApiConfig.
     * 
     */
    public static CompletableFuture<GetConfigResult> getConfigPlain(GetConfigPlainArgs args) {
        return getConfigPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single ApiConfig.
     * 
     */
    public static Output<GetConfigResult> getConfig(GetConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:apigateway/v1:getConfig", TypeShape.of(GetConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single ApiConfig.
     * 
     */
    public static CompletableFuture<GetConfigResult> getConfigPlain(GetConfigPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1:getConfig", TypeShape.of(GetConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static Output<GetGatewayResult> getGateway(GetGatewayArgs args) {
        return getGateway(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGatewayPlain(GetGatewayPlainArgs args) {
        return getGatewayPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static Output<GetGatewayResult> getGateway(GetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:apigateway/v1:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGatewayPlain(GetGatewayPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetGatewayIamPolicyResult> getGatewayIamPolicy(GetGatewayIamPolicyArgs args) {
        return getGatewayIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> getGatewayIamPolicyPlain(GetGatewayIamPolicyPlainArgs args) {
        return getGatewayIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetGatewayIamPolicyResult> getGatewayIamPolicy(GetGatewayIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:apigateway/v1:getGatewayIamPolicy", TypeShape.of(GetGatewayIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> getGatewayIamPolicyPlain(GetGatewayIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigateway/v1:getGatewayIamPolicy", TypeShape.of(GetGatewayIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
