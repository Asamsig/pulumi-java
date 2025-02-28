// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.app.inputs.GetCertificateArgs;
import com.pulumi.azurenative.app.inputs.GetCertificatePlainArgs;
import com.pulumi.azurenative.app.inputs.GetContainerAppArgs;
import com.pulumi.azurenative.app.inputs.GetContainerAppPlainArgs;
import com.pulumi.azurenative.app.inputs.GetContainerAppsAuthConfigArgs;
import com.pulumi.azurenative.app.inputs.GetContainerAppsAuthConfigPlainArgs;
import com.pulumi.azurenative.app.inputs.GetContainerAppsSourceControlArgs;
import com.pulumi.azurenative.app.inputs.GetContainerAppsSourceControlPlainArgs;
import com.pulumi.azurenative.app.inputs.GetDaprComponentArgs;
import com.pulumi.azurenative.app.inputs.GetDaprComponentPlainArgs;
import com.pulumi.azurenative.app.inputs.GetManagedEnvironmentArgs;
import com.pulumi.azurenative.app.inputs.GetManagedEnvironmentPlainArgs;
import com.pulumi.azurenative.app.inputs.GetManagedEnvironmentsStorageArgs;
import com.pulumi.azurenative.app.inputs.GetManagedEnvironmentsStoragePlainArgs;
import com.pulumi.azurenative.app.inputs.ListContainerAppCustomHostNameAnalysisArgs;
import com.pulumi.azurenative.app.inputs.ListContainerAppCustomHostNameAnalysisPlainArgs;
import com.pulumi.azurenative.app.inputs.ListContainerAppSecretsArgs;
import com.pulumi.azurenative.app.inputs.ListContainerAppSecretsPlainArgs;
import com.pulumi.azurenative.app.inputs.ListDaprComponentSecretsArgs;
import com.pulumi.azurenative.app.inputs.ListDaprComponentSecretsPlainArgs;
import com.pulumi.azurenative.app.outputs.GetCertificateResult;
import com.pulumi.azurenative.app.outputs.GetContainerAppResult;
import com.pulumi.azurenative.app.outputs.GetContainerAppsAuthConfigResult;
import com.pulumi.azurenative.app.outputs.GetContainerAppsSourceControlResult;
import com.pulumi.azurenative.app.outputs.GetDaprComponentResult;
import com.pulumi.azurenative.app.outputs.GetManagedEnvironmentResult;
import com.pulumi.azurenative.app.outputs.GetManagedEnvironmentsStorageResult;
import com.pulumi.azurenative.app.outputs.ListContainerAppCustomHostNameAnalysisResult;
import com.pulumi.azurenative.app.outputs.ListContainerAppSecretsResult;
import com.pulumi.azurenative.app.outputs.ListDaprComponentSecretsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AppFunctions {
    /**
     * Certificate used for Custom Domain bindings of Container Apps in a Managed Environment
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Certificate used for Custom Domain bindings of Container Apps in a Managed Environment
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args) {
        return getCertificatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Certificate used for Custom Domain bindings of Container Apps in a Managed Environment
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Certificate used for Custom Domain bindings of Container Apps in a Managed Environment
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Container App.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetContainerAppResult> getContainerApp(GetContainerAppArgs args) {
        return getContainerApp(args, InvokeOptions.Empty);
    }
    /**
     * Container App.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetContainerAppResult> getContainerAppPlain(GetContainerAppPlainArgs args) {
        return getContainerAppPlain(args, InvokeOptions.Empty);
    }
    /**
     * Container App.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetContainerAppResult> getContainerApp(GetContainerAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:getContainerApp", TypeShape.of(GetContainerAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Container App.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetContainerAppResult> getContainerAppPlain(GetContainerAppPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:getContainerApp", TypeShape.of(GetContainerAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Configuration settings for the Azure ContainerApp Service Authentication / Authorization feature.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetContainerAppsAuthConfigResult> getContainerAppsAuthConfig(GetContainerAppsAuthConfigArgs args) {
        return getContainerAppsAuthConfig(args, InvokeOptions.Empty);
    }
    /**
     * Configuration settings for the Azure ContainerApp Service Authentication / Authorization feature.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetContainerAppsAuthConfigResult> getContainerAppsAuthConfigPlain(GetContainerAppsAuthConfigPlainArgs args) {
        return getContainerAppsAuthConfigPlain(args, InvokeOptions.Empty);
    }
    /**
     * Configuration settings for the Azure ContainerApp Service Authentication / Authorization feature.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetContainerAppsAuthConfigResult> getContainerAppsAuthConfig(GetContainerAppsAuthConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:getContainerAppsAuthConfig", TypeShape.of(GetContainerAppsAuthConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Configuration settings for the Azure ContainerApp Service Authentication / Authorization feature.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetContainerAppsAuthConfigResult> getContainerAppsAuthConfigPlain(GetContainerAppsAuthConfigPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:getContainerAppsAuthConfig", TypeShape.of(GetContainerAppsAuthConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Container App SourceControl.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetContainerAppsSourceControlResult> getContainerAppsSourceControl(GetContainerAppsSourceControlArgs args) {
        return getContainerAppsSourceControl(args, InvokeOptions.Empty);
    }
    /**
     * Container App SourceControl.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetContainerAppsSourceControlResult> getContainerAppsSourceControlPlain(GetContainerAppsSourceControlPlainArgs args) {
        return getContainerAppsSourceControlPlain(args, InvokeOptions.Empty);
    }
    /**
     * Container App SourceControl.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetContainerAppsSourceControlResult> getContainerAppsSourceControl(GetContainerAppsSourceControlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:getContainerAppsSourceControl", TypeShape.of(GetContainerAppsSourceControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Container App SourceControl.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetContainerAppsSourceControlResult> getContainerAppsSourceControlPlain(GetContainerAppsSourceControlPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:getContainerAppsSourceControl", TypeShape.of(GetContainerAppsSourceControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Dapr Component.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetDaprComponentResult> getDaprComponent(GetDaprComponentArgs args) {
        return getDaprComponent(args, InvokeOptions.Empty);
    }
    /**
     * Dapr Component.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetDaprComponentResult> getDaprComponentPlain(GetDaprComponentPlainArgs args) {
        return getDaprComponentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Dapr Component.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetDaprComponentResult> getDaprComponent(GetDaprComponentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:getDaprComponent", TypeShape.of(GetDaprComponentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Dapr Component.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetDaprComponentResult> getDaprComponentPlain(GetDaprComponentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:getDaprComponent", TypeShape.of(GetDaprComponentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An environment for hosting container apps
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetManagedEnvironmentResult> getManagedEnvironment(GetManagedEnvironmentArgs args) {
        return getManagedEnvironment(args, InvokeOptions.Empty);
    }
    /**
     * An environment for hosting container apps
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetManagedEnvironmentResult> getManagedEnvironmentPlain(GetManagedEnvironmentPlainArgs args) {
        return getManagedEnvironmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * An environment for hosting container apps
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetManagedEnvironmentResult> getManagedEnvironment(GetManagedEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:getManagedEnvironment", TypeShape.of(GetManagedEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An environment for hosting container apps
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetManagedEnvironmentResult> getManagedEnvironmentPlain(GetManagedEnvironmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:getManagedEnvironment", TypeShape.of(GetManagedEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Storage resource for managedEnvironment.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetManagedEnvironmentsStorageResult> getManagedEnvironmentsStorage(GetManagedEnvironmentsStorageArgs args) {
        return getManagedEnvironmentsStorage(args, InvokeOptions.Empty);
    }
    /**
     * Storage resource for managedEnvironment.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetManagedEnvironmentsStorageResult> getManagedEnvironmentsStoragePlain(GetManagedEnvironmentsStoragePlainArgs args) {
        return getManagedEnvironmentsStoragePlain(args, InvokeOptions.Empty);
    }
    /**
     * Storage resource for managedEnvironment.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<GetManagedEnvironmentsStorageResult> getManagedEnvironmentsStorage(GetManagedEnvironmentsStorageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:getManagedEnvironmentsStorage", TypeShape.of(GetManagedEnvironmentsStorageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Storage resource for managedEnvironment.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<GetManagedEnvironmentsStorageResult> getManagedEnvironmentsStoragePlain(GetManagedEnvironmentsStoragePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:getManagedEnvironmentsStorage", TypeShape.of(GetManagedEnvironmentsStorageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Custom domain analysis.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<ListContainerAppCustomHostNameAnalysisResult> listContainerAppCustomHostNameAnalysis(ListContainerAppCustomHostNameAnalysisArgs args) {
        return listContainerAppCustomHostNameAnalysis(args, InvokeOptions.Empty);
    }
    /**
     * Custom domain analysis.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<ListContainerAppCustomHostNameAnalysisResult> listContainerAppCustomHostNameAnalysisPlain(ListContainerAppCustomHostNameAnalysisPlainArgs args) {
        return listContainerAppCustomHostNameAnalysisPlain(args, InvokeOptions.Empty);
    }
    /**
     * Custom domain analysis.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<ListContainerAppCustomHostNameAnalysisResult> listContainerAppCustomHostNameAnalysis(ListContainerAppCustomHostNameAnalysisArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:listContainerAppCustomHostNameAnalysis", TypeShape.of(ListContainerAppCustomHostNameAnalysisResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Custom domain analysis.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<ListContainerAppCustomHostNameAnalysisResult> listContainerAppCustomHostNameAnalysisPlain(ListContainerAppCustomHostNameAnalysisPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:listContainerAppCustomHostNameAnalysis", TypeShape.of(ListContainerAppCustomHostNameAnalysisResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Container App Secrets Collection ARM resource.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<ListContainerAppSecretsResult> listContainerAppSecrets(ListContainerAppSecretsArgs args) {
        return listContainerAppSecrets(args, InvokeOptions.Empty);
    }
    /**
     * Container App Secrets Collection ARM resource.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<ListContainerAppSecretsResult> listContainerAppSecretsPlain(ListContainerAppSecretsPlainArgs args) {
        return listContainerAppSecretsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Container App Secrets Collection ARM resource.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<ListContainerAppSecretsResult> listContainerAppSecrets(ListContainerAppSecretsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:listContainerAppSecrets", TypeShape.of(ListContainerAppSecretsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Container App Secrets Collection ARM resource.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<ListContainerAppSecretsResult> listContainerAppSecretsPlain(ListContainerAppSecretsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:listContainerAppSecrets", TypeShape.of(ListContainerAppSecretsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Dapr component Secrets Collection ARM resource.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<ListDaprComponentSecretsResult> listDaprComponentSecrets(ListDaprComponentSecretsArgs args) {
        return listDaprComponentSecrets(args, InvokeOptions.Empty);
    }
    /**
     * Dapr component Secrets Collection ARM resource.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<ListDaprComponentSecretsResult> listDaprComponentSecretsPlain(ListDaprComponentSecretsPlainArgs args) {
        return listDaprComponentSecretsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Dapr component Secrets Collection ARM resource.
     * API Version: 2022-03-01.
     * 
     */
    public static Output<ListDaprComponentSecretsResult> listDaprComponentSecrets(ListDaprComponentSecretsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:app:listDaprComponentSecrets", TypeShape.of(ListDaprComponentSecretsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Dapr component Secrets Collection ARM resource.
     * API Version: 2022-03-01.
     * 
     */
    public static CompletableFuture<ListDaprComponentSecretsResult> listDaprComponentSecretsPlain(ListDaprComponentSecretsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:app:listDaprComponentSecrets", TypeShape.of(ListDaprComponentSecretsResult.class), args, Utilities.withVersion(options));
    }
}
