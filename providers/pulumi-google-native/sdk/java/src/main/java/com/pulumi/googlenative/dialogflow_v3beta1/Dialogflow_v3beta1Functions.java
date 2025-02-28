// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetAgentArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetAgentPlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetEntityTypeArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetEntityTypePlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetEnvironmentArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetEnvironmentPlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetExperimentArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetExperimentPlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetFlowArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetFlowPlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetIntentArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetIntentPlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetPageArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetPagePlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetSecuritySettingArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetSecuritySettingPlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetSessionEntityTypeArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetSessionEntityTypePlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetTestCaseArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetTestCasePlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetTransitionRouteGroupArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetTransitionRouteGroupPlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetVersionArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetVersionPlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetWebhookArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GetWebhookPlainArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetAgentResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetEntityTypeResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetEnvironmentResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetExperimentResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetFlowResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetIntentResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetPageResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetSecuritySettingResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetSessionEntityTypeResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetTestCaseResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetTransitionRouteGroupResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetVersionResult;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GetWebhookResult;
import java.util.concurrent.CompletableFuture;

public final class Dialogflow_v3beta1Functions {
    /**
     * Retrieves the specified agent.
     * 
     */
    public static Output<GetAgentResult> getAgent(GetAgentArgs args) {
        return getAgent(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified agent.
     * 
     */
    public static CompletableFuture<GetAgentResult> getAgentPlain(GetAgentPlainArgs args) {
        return getAgentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified agent.
     * 
     */
    public static Output<GetAgentResult> getAgent(GetAgentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getAgent", TypeShape.of(GetAgentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified agent.
     * 
     */
    public static CompletableFuture<GetAgentResult> getAgentPlain(GetAgentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getAgent", TypeShape.of(GetAgentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified entity type.
     * 
     */
    public static Output<GetEntityTypeResult> getEntityType(GetEntityTypeArgs args) {
        return getEntityType(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified entity type.
     * 
     */
    public static CompletableFuture<GetEntityTypeResult> getEntityTypePlain(GetEntityTypePlainArgs args) {
        return getEntityTypePlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified entity type.
     * 
     */
    public static Output<GetEntityTypeResult> getEntityType(GetEntityTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getEntityType", TypeShape.of(GetEntityTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified entity type.
     * 
     */
    public static CompletableFuture<GetEntityTypeResult> getEntityTypePlain(GetEntityTypePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getEntityType", TypeShape.of(GetEntityTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified Environment.
     * 
     */
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified Environment.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args) {
        return getEnvironmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified Environment.
     * 
     */
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified Environment.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified Experiment.
     * 
     */
    public static Output<GetExperimentResult> getExperiment(GetExperimentArgs args) {
        return getExperiment(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified Experiment.
     * 
     */
    public static CompletableFuture<GetExperimentResult> getExperimentPlain(GetExperimentPlainArgs args) {
        return getExperimentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified Experiment.
     * 
     */
    public static Output<GetExperimentResult> getExperiment(GetExperimentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getExperiment", TypeShape.of(GetExperimentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified Experiment.
     * 
     */
    public static CompletableFuture<GetExperimentResult> getExperimentPlain(GetExperimentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getExperiment", TypeShape.of(GetExperimentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified flow.
     * 
     */
    public static Output<GetFlowResult> getFlow(GetFlowArgs args) {
        return getFlow(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified flow.
     * 
     */
    public static CompletableFuture<GetFlowResult> getFlowPlain(GetFlowPlainArgs args) {
        return getFlowPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified flow.
     * 
     */
    public static Output<GetFlowResult> getFlow(GetFlowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getFlow", TypeShape.of(GetFlowResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified flow.
     * 
     */
    public static CompletableFuture<GetFlowResult> getFlowPlain(GetFlowPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getFlow", TypeShape.of(GetFlowResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified intent.
     * 
     */
    public static Output<GetIntentResult> getIntent(GetIntentArgs args) {
        return getIntent(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified intent.
     * 
     */
    public static CompletableFuture<GetIntentResult> getIntentPlain(GetIntentPlainArgs args) {
        return getIntentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified intent.
     * 
     */
    public static Output<GetIntentResult> getIntent(GetIntentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getIntent", TypeShape.of(GetIntentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified intent.
     * 
     */
    public static CompletableFuture<GetIntentResult> getIntentPlain(GetIntentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getIntent", TypeShape.of(GetIntentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified page.
     * 
     */
    public static Output<GetPageResult> getPage(GetPageArgs args) {
        return getPage(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified page.
     * 
     */
    public static CompletableFuture<GetPageResult> getPagePlain(GetPagePlainArgs args) {
        return getPagePlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified page.
     * 
     */
    public static Output<GetPageResult> getPage(GetPageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getPage", TypeShape.of(GetPageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified page.
     * 
     */
    public static CompletableFuture<GetPageResult> getPagePlain(GetPagePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getPage", TypeShape.of(GetPageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified SecuritySettings. The returned settings may be stale by up to 1 minute.
     * 
     */
    public static Output<GetSecuritySettingResult> getSecuritySetting(GetSecuritySettingArgs args) {
        return getSecuritySetting(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified SecuritySettings. The returned settings may be stale by up to 1 minute.
     * 
     */
    public static CompletableFuture<GetSecuritySettingResult> getSecuritySettingPlain(GetSecuritySettingPlainArgs args) {
        return getSecuritySettingPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified SecuritySettings. The returned settings may be stale by up to 1 minute.
     * 
     */
    public static Output<GetSecuritySettingResult> getSecuritySetting(GetSecuritySettingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getSecuritySetting", TypeShape.of(GetSecuritySettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified SecuritySettings. The returned settings may be stale by up to 1 minute.
     * 
     */
    public static CompletableFuture<GetSecuritySettingResult> getSecuritySettingPlain(GetSecuritySettingPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getSecuritySetting", TypeShape.of(GetSecuritySettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified session entity type.
     * 
     */
    public static Output<GetSessionEntityTypeResult> getSessionEntityType(GetSessionEntityTypeArgs args) {
        return getSessionEntityType(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified session entity type.
     * 
     */
    public static CompletableFuture<GetSessionEntityTypeResult> getSessionEntityTypePlain(GetSessionEntityTypePlainArgs args) {
        return getSessionEntityTypePlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified session entity type.
     * 
     */
    public static Output<GetSessionEntityTypeResult> getSessionEntityType(GetSessionEntityTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getSessionEntityType", TypeShape.of(GetSessionEntityTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified session entity type.
     * 
     */
    public static CompletableFuture<GetSessionEntityTypeResult> getSessionEntityTypePlain(GetSessionEntityTypePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getSessionEntityType", TypeShape.of(GetSessionEntityTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a test case.
     * 
     */
    public static Output<GetTestCaseResult> getTestCase(GetTestCaseArgs args) {
        return getTestCase(args, InvokeOptions.Empty);
    }
    /**
     * Gets a test case.
     * 
     */
    public static CompletableFuture<GetTestCaseResult> getTestCasePlain(GetTestCasePlainArgs args) {
        return getTestCasePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a test case.
     * 
     */
    public static Output<GetTestCaseResult> getTestCase(GetTestCaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getTestCase", TypeShape.of(GetTestCaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a test case.
     * 
     */
    public static CompletableFuture<GetTestCaseResult> getTestCasePlain(GetTestCasePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getTestCase", TypeShape.of(GetTestCaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified TransitionRouteGroup.
     * 
     */
    public static Output<GetTransitionRouteGroupResult> getTransitionRouteGroup(GetTransitionRouteGroupArgs args) {
        return getTransitionRouteGroup(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified TransitionRouteGroup.
     * 
     */
    public static CompletableFuture<GetTransitionRouteGroupResult> getTransitionRouteGroupPlain(GetTransitionRouteGroupPlainArgs args) {
        return getTransitionRouteGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified TransitionRouteGroup.
     * 
     */
    public static Output<GetTransitionRouteGroupResult> getTransitionRouteGroup(GetTransitionRouteGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getTransitionRouteGroup", TypeShape.of(GetTransitionRouteGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified TransitionRouteGroup.
     * 
     */
    public static CompletableFuture<GetTransitionRouteGroupResult> getTransitionRouteGroupPlain(GetTransitionRouteGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getTransitionRouteGroup", TypeShape.of(GetTransitionRouteGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified Version.
     * 
     */
    public static Output<GetVersionResult> getVersion(GetVersionArgs args) {
        return getVersion(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified Version.
     * 
     */
    public static CompletableFuture<GetVersionResult> getVersionPlain(GetVersionPlainArgs args) {
        return getVersionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified Version.
     * 
     */
    public static Output<GetVersionResult> getVersion(GetVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getVersion", TypeShape.of(GetVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified Version.
     * 
     */
    public static CompletableFuture<GetVersionResult> getVersionPlain(GetVersionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getVersion", TypeShape.of(GetVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified webhook.
     * 
     */
    public static Output<GetWebhookResult> getWebhook(GetWebhookArgs args) {
        return getWebhook(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified webhook.
     * 
     */
    public static CompletableFuture<GetWebhookResult> getWebhookPlain(GetWebhookPlainArgs args) {
        return getWebhookPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the specified webhook.
     * 
     */
    public static Output<GetWebhookResult> getWebhook(GetWebhookArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:dialogflow/v3beta1:getWebhook", TypeShape.of(GetWebhookResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the specified webhook.
     * 
     */
    public static CompletableFuture<GetWebhookResult> getWebhookPlain(GetWebhookPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v3beta1:getWebhook", TypeShape.of(GetWebhookResult.class), args, Utilities.withVersion(options));
    }
}
