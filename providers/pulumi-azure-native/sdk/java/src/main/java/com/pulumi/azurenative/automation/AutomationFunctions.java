// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.automation.inputs.GetAutomationAccountArgs;
import com.pulumi.azurenative.automation.inputs.GetAutomationAccountPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetCertificateArgs;
import com.pulumi.azurenative.automation.inputs.GetCertificatePlainArgs;
import com.pulumi.azurenative.automation.inputs.GetConnectionArgs;
import com.pulumi.azurenative.automation.inputs.GetConnectionPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetConnectionTypeArgs;
import com.pulumi.azurenative.automation.inputs.GetConnectionTypePlainArgs;
import com.pulumi.azurenative.automation.inputs.GetCredentialArgs;
import com.pulumi.azurenative.automation.inputs.GetCredentialPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetDscConfigurationArgs;
import com.pulumi.azurenative.automation.inputs.GetDscConfigurationPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetDscNodeConfigurationArgs;
import com.pulumi.azurenative.automation.inputs.GetDscNodeConfigurationPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetHybridRunbookWorkerArgs;
import com.pulumi.azurenative.automation.inputs.GetHybridRunbookWorkerGroupArgs;
import com.pulumi.azurenative.automation.inputs.GetHybridRunbookWorkerGroupPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetHybridRunbookWorkerPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetJobScheduleArgs;
import com.pulumi.azurenative.automation.inputs.GetJobSchedulePlainArgs;
import com.pulumi.azurenative.automation.inputs.GetModuleArgs;
import com.pulumi.azurenative.automation.inputs.GetModulePlainArgs;
import com.pulumi.azurenative.automation.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.automation.inputs.GetPrivateEndpointConnectionPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetPython2PackageArgs;
import com.pulumi.azurenative.automation.inputs.GetPython2PackagePlainArgs;
import com.pulumi.azurenative.automation.inputs.GetRunbookArgs;
import com.pulumi.azurenative.automation.inputs.GetRunbookPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetScheduleArgs;
import com.pulumi.azurenative.automation.inputs.GetSchedulePlainArgs;
import com.pulumi.azurenative.automation.inputs.GetSoftwareUpdateConfigurationByNameArgs;
import com.pulumi.azurenative.automation.inputs.GetSoftwareUpdateConfigurationByNamePlainArgs;
import com.pulumi.azurenative.automation.inputs.GetSourceControlArgs;
import com.pulumi.azurenative.automation.inputs.GetSourceControlPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetVariableArgs;
import com.pulumi.azurenative.automation.inputs.GetVariablePlainArgs;
import com.pulumi.azurenative.automation.inputs.GetWatcherArgs;
import com.pulumi.azurenative.automation.inputs.GetWatcherPlainArgs;
import com.pulumi.azurenative.automation.inputs.GetWebhookArgs;
import com.pulumi.azurenative.automation.inputs.GetWebhookPlainArgs;
import com.pulumi.azurenative.automation.inputs.ListKeyByAutomationAccountArgs;
import com.pulumi.azurenative.automation.inputs.ListKeyByAutomationAccountPlainArgs;
import com.pulumi.azurenative.automation.outputs.GetAutomationAccountResult;
import com.pulumi.azurenative.automation.outputs.GetCertificateResult;
import com.pulumi.azurenative.automation.outputs.GetConnectionResult;
import com.pulumi.azurenative.automation.outputs.GetConnectionTypeResult;
import com.pulumi.azurenative.automation.outputs.GetCredentialResult;
import com.pulumi.azurenative.automation.outputs.GetDscConfigurationResult;
import com.pulumi.azurenative.automation.outputs.GetDscNodeConfigurationResult;
import com.pulumi.azurenative.automation.outputs.GetHybridRunbookWorkerGroupResult;
import com.pulumi.azurenative.automation.outputs.GetHybridRunbookWorkerResult;
import com.pulumi.azurenative.automation.outputs.GetJobScheduleResult;
import com.pulumi.azurenative.automation.outputs.GetModuleResult;
import com.pulumi.azurenative.automation.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.automation.outputs.GetPython2PackageResult;
import com.pulumi.azurenative.automation.outputs.GetRunbookResult;
import com.pulumi.azurenative.automation.outputs.GetScheduleResult;
import com.pulumi.azurenative.automation.outputs.GetSoftwareUpdateConfigurationByNameResult;
import com.pulumi.azurenative.automation.outputs.GetSourceControlResult;
import com.pulumi.azurenative.automation.outputs.GetVariableResult;
import com.pulumi.azurenative.automation.outputs.GetWatcherResult;
import com.pulumi.azurenative.automation.outputs.GetWebhookResult;
import com.pulumi.azurenative.automation.outputs.ListKeyByAutomationAccountResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AutomationFunctions {
    /**
     * Definition of the automation account type.
     * API Version: 2021-06-22.
     * 
     */
    public static Output<GetAutomationAccountResult> getAutomationAccount(GetAutomationAccountArgs args) {
        return getAutomationAccount(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the automation account type.
     * API Version: 2021-06-22.
     * 
     */
    public static CompletableFuture<GetAutomationAccountResult> getAutomationAccountPlain(GetAutomationAccountPlainArgs args) {
        return getAutomationAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the automation account type.
     * API Version: 2021-06-22.
     * 
     */
    public static Output<GetAutomationAccountResult> getAutomationAccount(GetAutomationAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getAutomationAccount", TypeShape.of(GetAutomationAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the automation account type.
     * API Version: 2021-06-22.
     * 
     */
    public static CompletableFuture<GetAutomationAccountResult> getAutomationAccountPlain(GetAutomationAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getAutomationAccount", TypeShape.of(GetAutomationAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the certificate.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the certificate.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args) {
        return getCertificatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the certificate.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the certificate.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the connection.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetConnectionResult> getConnection(GetConnectionArgs args) {
        return getConnection(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the connection.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnectionPlain(GetConnectionPlainArgs args) {
        return getConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the connection.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetConnectionResult> getConnection(GetConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getConnection", TypeShape.of(GetConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the connection.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnectionPlain(GetConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getConnection", TypeShape.of(GetConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the connection type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetConnectionTypeResult> getConnectionType(GetConnectionTypeArgs args) {
        return getConnectionType(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the connection type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetConnectionTypeResult> getConnectionTypePlain(GetConnectionTypePlainArgs args) {
        return getConnectionTypePlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the connection type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetConnectionTypeResult> getConnectionType(GetConnectionTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getConnectionType", TypeShape.of(GetConnectionTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the connection type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetConnectionTypeResult> getConnectionTypePlain(GetConnectionTypePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getConnectionType", TypeShape.of(GetConnectionTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the credential.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetCredentialResult> getCredential(GetCredentialArgs args) {
        return getCredential(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the credential.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetCredentialResult> getCredentialPlain(GetCredentialPlainArgs args) {
        return getCredentialPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the credential.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetCredentialResult> getCredential(GetCredentialArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getCredential", TypeShape.of(GetCredentialResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the credential.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetCredentialResult> getCredentialPlain(GetCredentialPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getCredential", TypeShape.of(GetCredentialResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the configuration type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetDscConfigurationResult> getDscConfiguration(GetDscConfigurationArgs args) {
        return getDscConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the configuration type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetDscConfigurationResult> getDscConfigurationPlain(GetDscConfigurationPlainArgs args) {
        return getDscConfigurationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the configuration type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetDscConfigurationResult> getDscConfiguration(GetDscConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getDscConfiguration", TypeShape.of(GetDscConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the configuration type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetDscConfigurationResult> getDscConfigurationPlain(GetDscConfigurationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getDscConfiguration", TypeShape.of(GetDscConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the dsc node configuration.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetDscNodeConfigurationResult> getDscNodeConfiguration(GetDscNodeConfigurationArgs args) {
        return getDscNodeConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the dsc node configuration.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetDscNodeConfigurationResult> getDscNodeConfigurationPlain(GetDscNodeConfigurationPlainArgs args) {
        return getDscNodeConfigurationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the dsc node configuration.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetDscNodeConfigurationResult> getDscNodeConfiguration(GetDscNodeConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getDscNodeConfiguration", TypeShape.of(GetDscNodeConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the dsc node configuration.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetDscNodeConfigurationResult> getDscNodeConfigurationPlain(GetDscNodeConfigurationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getDscNodeConfiguration", TypeShape.of(GetDscNodeConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of hybrid runbook worker.
     * API Version: 2021-06-22.
     * 
     */
    public static Output<GetHybridRunbookWorkerResult> getHybridRunbookWorker(GetHybridRunbookWorkerArgs args) {
        return getHybridRunbookWorker(args, InvokeOptions.Empty);
    }
    /**
     * Definition of hybrid runbook worker.
     * API Version: 2021-06-22.
     * 
     */
    public static CompletableFuture<GetHybridRunbookWorkerResult> getHybridRunbookWorkerPlain(GetHybridRunbookWorkerPlainArgs args) {
        return getHybridRunbookWorkerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of hybrid runbook worker.
     * API Version: 2021-06-22.
     * 
     */
    public static Output<GetHybridRunbookWorkerResult> getHybridRunbookWorker(GetHybridRunbookWorkerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getHybridRunbookWorker", TypeShape.of(GetHybridRunbookWorkerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of hybrid runbook worker.
     * API Version: 2021-06-22.
     * 
     */
    public static CompletableFuture<GetHybridRunbookWorkerResult> getHybridRunbookWorkerPlain(GetHybridRunbookWorkerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getHybridRunbookWorker", TypeShape.of(GetHybridRunbookWorkerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of hybrid runbook worker group.
     * API Version: 2021-06-22.
     * 
     */
    public static Output<GetHybridRunbookWorkerGroupResult> getHybridRunbookWorkerGroup(GetHybridRunbookWorkerGroupArgs args) {
        return getHybridRunbookWorkerGroup(args, InvokeOptions.Empty);
    }
    /**
     * Definition of hybrid runbook worker group.
     * API Version: 2021-06-22.
     * 
     */
    public static CompletableFuture<GetHybridRunbookWorkerGroupResult> getHybridRunbookWorkerGroupPlain(GetHybridRunbookWorkerGroupPlainArgs args) {
        return getHybridRunbookWorkerGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of hybrid runbook worker group.
     * API Version: 2021-06-22.
     * 
     */
    public static Output<GetHybridRunbookWorkerGroupResult> getHybridRunbookWorkerGroup(GetHybridRunbookWorkerGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getHybridRunbookWorkerGroup", TypeShape.of(GetHybridRunbookWorkerGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of hybrid runbook worker group.
     * API Version: 2021-06-22.
     * 
     */
    public static CompletableFuture<GetHybridRunbookWorkerGroupResult> getHybridRunbookWorkerGroupPlain(GetHybridRunbookWorkerGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getHybridRunbookWorkerGroup", TypeShape.of(GetHybridRunbookWorkerGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the job schedule.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetJobScheduleResult> getJobSchedule(GetJobScheduleArgs args) {
        return getJobSchedule(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the job schedule.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetJobScheduleResult> getJobSchedulePlain(GetJobSchedulePlainArgs args) {
        return getJobSchedulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the job schedule.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetJobScheduleResult> getJobSchedule(GetJobScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getJobSchedule", TypeShape.of(GetJobScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the job schedule.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetJobScheduleResult> getJobSchedulePlain(GetJobSchedulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getJobSchedule", TypeShape.of(GetJobScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the module type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetModuleResult> getModule(GetModuleArgs args) {
        return getModule(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the module type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetModuleResult> getModulePlain(GetModulePlainArgs args) {
        return getModulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the module type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetModuleResult> getModule(GetModuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getModule", TypeShape.of(GetModuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the module type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetModuleResult> getModulePlain(GetModulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getModule", TypeShape.of(GetModuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private endpoint connection
     * API Version: 2020-01-13-preview.
     * 
     */
    public static Output<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * A private endpoint connection
     * API Version: 2020-01-13-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnectionPlain(GetPrivateEndpointConnectionPlainArgs args) {
        return getPrivateEndpointConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * A private endpoint connection
     * API Version: 2020-01-13-preview.
     * 
     */
    public static Output<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private endpoint connection
     * API Version: 2020-01-13-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnectionPlain(GetPrivateEndpointConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the module type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetPython2PackageResult> getPython2Package(GetPython2PackageArgs args) {
        return getPython2Package(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the module type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetPython2PackageResult> getPython2PackagePlain(GetPython2PackagePlainArgs args) {
        return getPython2PackagePlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the module type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetPython2PackageResult> getPython2Package(GetPython2PackageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getPython2Package", TypeShape.of(GetPython2PackageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the module type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetPython2PackageResult> getPython2PackagePlain(GetPython2PackagePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getPython2Package", TypeShape.of(GetPython2PackageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the runbook type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetRunbookResult> getRunbook(GetRunbookArgs args) {
        return getRunbook(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the runbook type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetRunbookResult> getRunbookPlain(GetRunbookPlainArgs args) {
        return getRunbookPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the runbook type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetRunbookResult> getRunbook(GetRunbookArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getRunbook", TypeShape.of(GetRunbookResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the runbook type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetRunbookResult> getRunbookPlain(GetRunbookPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getRunbook", TypeShape.of(GetRunbookResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the schedule.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetScheduleResult> getSchedule(GetScheduleArgs args) {
        return getSchedule(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the schedule.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetScheduleResult> getSchedulePlain(GetSchedulePlainArgs args) {
        return getSchedulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the schedule.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetScheduleResult> getSchedule(GetScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getSchedule", TypeShape.of(GetScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the schedule.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetScheduleResult> getSchedulePlain(GetSchedulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getSchedule", TypeShape.of(GetScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Software update configuration properties.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetSoftwareUpdateConfigurationByNameResult> getSoftwareUpdateConfigurationByName(GetSoftwareUpdateConfigurationByNameArgs args) {
        return getSoftwareUpdateConfigurationByName(args, InvokeOptions.Empty);
    }
    /**
     * Software update configuration properties.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetSoftwareUpdateConfigurationByNameResult> getSoftwareUpdateConfigurationByNamePlain(GetSoftwareUpdateConfigurationByNamePlainArgs args) {
        return getSoftwareUpdateConfigurationByNamePlain(args, InvokeOptions.Empty);
    }
    /**
     * Software update configuration properties.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetSoftwareUpdateConfigurationByNameResult> getSoftwareUpdateConfigurationByName(GetSoftwareUpdateConfigurationByNameArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getSoftwareUpdateConfigurationByName", TypeShape.of(GetSoftwareUpdateConfigurationByNameResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Software update configuration properties.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetSoftwareUpdateConfigurationByNameResult> getSoftwareUpdateConfigurationByNamePlain(GetSoftwareUpdateConfigurationByNamePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getSoftwareUpdateConfigurationByName", TypeShape.of(GetSoftwareUpdateConfigurationByNameResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the source control.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetSourceControlResult> getSourceControl(GetSourceControlArgs args) {
        return getSourceControl(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the source control.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetSourceControlResult> getSourceControlPlain(GetSourceControlPlainArgs args) {
        return getSourceControlPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the source control.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetSourceControlResult> getSourceControl(GetSourceControlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getSourceControl", TypeShape.of(GetSourceControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the source control.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetSourceControlResult> getSourceControlPlain(GetSourceControlPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getSourceControl", TypeShape.of(GetSourceControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the variable.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetVariableResult> getVariable(GetVariableArgs args) {
        return getVariable(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the variable.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetVariableResult> getVariablePlain(GetVariablePlainArgs args) {
        return getVariablePlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the variable.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetVariableResult> getVariable(GetVariableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getVariable", TypeShape.of(GetVariableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the variable.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetVariableResult> getVariablePlain(GetVariablePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getVariable", TypeShape.of(GetVariableResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the watcher type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetWatcherResult> getWatcher(GetWatcherArgs args) {
        return getWatcher(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the watcher type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetWatcherResult> getWatcherPlain(GetWatcherPlainArgs args) {
        return getWatcherPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the watcher type.
     * API Version: 2019-06-01.
     * 
     */
    public static Output<GetWatcherResult> getWatcher(GetWatcherArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getWatcher", TypeShape.of(GetWatcherResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the watcher type.
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetWatcherResult> getWatcherPlain(GetWatcherPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getWatcher", TypeShape.of(GetWatcherResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the webhook type.
     * API Version: 2015-10-31.
     * 
     */
    public static Output<GetWebhookResult> getWebhook(GetWebhookArgs args) {
        return getWebhook(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the webhook type.
     * API Version: 2015-10-31.
     * 
     */
    public static CompletableFuture<GetWebhookResult> getWebhookPlain(GetWebhookPlainArgs args) {
        return getWebhookPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of the webhook type.
     * API Version: 2015-10-31.
     * 
     */
    public static Output<GetWebhookResult> getWebhook(GetWebhookArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:getWebhook", TypeShape.of(GetWebhookResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of the webhook type.
     * API Version: 2015-10-31.
     * 
     */
    public static CompletableFuture<GetWebhookResult> getWebhookPlain(GetWebhookPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getWebhook", TypeShape.of(GetWebhookResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2021-06-22.
     * 
     */
    public static Output<ListKeyByAutomationAccountResult> listKeyByAutomationAccount(ListKeyByAutomationAccountArgs args) {
        return listKeyByAutomationAccount(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2021-06-22.
     * 
     */
    public static CompletableFuture<ListKeyByAutomationAccountResult> listKeyByAutomationAccountPlain(ListKeyByAutomationAccountPlainArgs args) {
        return listKeyByAutomationAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2021-06-22.
     * 
     */
    public static Output<ListKeyByAutomationAccountResult> listKeyByAutomationAccount(ListKeyByAutomationAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:automation:listKeyByAutomationAccount", TypeShape.of(ListKeyByAutomationAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2021-06-22.
     * 
     */
    public static CompletableFuture<ListKeyByAutomationAccountResult> listKeyByAutomationAccountPlain(ListKeyByAutomationAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:listKeyByAutomationAccount", TypeShape.of(ListKeyByAutomationAccountResult.class), args, Utilities.withVersion(options));
    }
}
