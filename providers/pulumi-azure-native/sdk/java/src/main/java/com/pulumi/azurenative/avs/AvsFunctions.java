// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.avs.inputs.GetAddonArgs;
import com.pulumi.azurenative.avs.inputs.GetAddonPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetAuthorizationArgs;
import com.pulumi.azurenative.avs.inputs.GetAuthorizationPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetCloudLinkArgs;
import com.pulumi.azurenative.avs.inputs.GetCloudLinkPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetClusterArgs;
import com.pulumi.azurenative.avs.inputs.GetClusterPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetDatastoreArgs;
import com.pulumi.azurenative.avs.inputs.GetDatastorePlainArgs;
import com.pulumi.azurenative.avs.inputs.GetGlobalReachConnectionArgs;
import com.pulumi.azurenative.avs.inputs.GetGlobalReachConnectionPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetHcxEnterpriseSiteArgs;
import com.pulumi.azurenative.avs.inputs.GetHcxEnterpriseSitePlainArgs;
import com.pulumi.azurenative.avs.inputs.GetPlacementPolicyArgs;
import com.pulumi.azurenative.avs.inputs.GetPlacementPolicyPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetPrivateCloudArgs;
import com.pulumi.azurenative.avs.inputs.GetPrivateCloudPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetScriptExecutionArgs;
import com.pulumi.azurenative.avs.inputs.GetScriptExecutionLogsArgs;
import com.pulumi.azurenative.avs.inputs.GetScriptExecutionLogsPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetScriptExecutionPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkDhcpArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkDhcpPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkDnsServiceArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkDnsServicePlainArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkDnsZoneArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkDnsZonePlainArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkPortMirroringArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkPortMirroringPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkPublicIPArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkPublicIPPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkSegmentArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkSegmentPlainArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkVMGroupArgs;
import com.pulumi.azurenative.avs.inputs.GetWorkloadNetworkVMGroupPlainArgs;
import com.pulumi.azurenative.avs.inputs.ListPrivateCloudAdminCredentialsArgs;
import com.pulumi.azurenative.avs.inputs.ListPrivateCloudAdminCredentialsPlainArgs;
import com.pulumi.azurenative.avs.outputs.GetAddonResult;
import com.pulumi.azurenative.avs.outputs.GetAuthorizationResult;
import com.pulumi.azurenative.avs.outputs.GetCloudLinkResult;
import com.pulumi.azurenative.avs.outputs.GetClusterResult;
import com.pulumi.azurenative.avs.outputs.GetDatastoreResult;
import com.pulumi.azurenative.avs.outputs.GetGlobalReachConnectionResult;
import com.pulumi.azurenative.avs.outputs.GetHcxEnterpriseSiteResult;
import com.pulumi.azurenative.avs.outputs.GetPlacementPolicyResult;
import com.pulumi.azurenative.avs.outputs.GetPrivateCloudResult;
import com.pulumi.azurenative.avs.outputs.GetScriptExecutionLogsResult;
import com.pulumi.azurenative.avs.outputs.GetScriptExecutionResult;
import com.pulumi.azurenative.avs.outputs.GetWorkloadNetworkDhcpResult;
import com.pulumi.azurenative.avs.outputs.GetWorkloadNetworkDnsServiceResult;
import com.pulumi.azurenative.avs.outputs.GetWorkloadNetworkDnsZoneResult;
import com.pulumi.azurenative.avs.outputs.GetWorkloadNetworkPortMirroringResult;
import com.pulumi.azurenative.avs.outputs.GetWorkloadNetworkPublicIPResult;
import com.pulumi.azurenative.avs.outputs.GetWorkloadNetworkSegmentResult;
import com.pulumi.azurenative.avs.outputs.GetWorkloadNetworkVMGroupResult;
import com.pulumi.azurenative.avs.outputs.ListPrivateCloudAdminCredentialsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AvsFunctions {
    /**
     * An addon resource
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetAddonResult> getAddon(GetAddonArgs args) {
        return getAddon(args, InvokeOptions.Empty);
    }
    /**
     * An addon resource
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetAddonResult> getAddonPlain(GetAddonPlainArgs args) {
        return getAddonPlain(args, InvokeOptions.Empty);
    }
    /**
     * An addon resource
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetAddonResult> getAddon(GetAddonArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getAddon", TypeShape.of(GetAddonResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An addon resource
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetAddonResult> getAddonPlain(GetAddonPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getAddon", TypeShape.of(GetAddonResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ExpressRoute Circuit Authorization
     * API Version: 2020-03-20.
     * 
     */
    public static Output<GetAuthorizationResult> getAuthorization(GetAuthorizationArgs args) {
        return getAuthorization(args, InvokeOptions.Empty);
    }
    /**
     * ExpressRoute Circuit Authorization
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<GetAuthorizationResult> getAuthorizationPlain(GetAuthorizationPlainArgs args) {
        return getAuthorizationPlain(args, InvokeOptions.Empty);
    }
    /**
     * ExpressRoute Circuit Authorization
     * API Version: 2020-03-20.
     * 
     */
    public static Output<GetAuthorizationResult> getAuthorization(GetAuthorizationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getAuthorization", TypeShape.of(GetAuthorizationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ExpressRoute Circuit Authorization
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<GetAuthorizationResult> getAuthorizationPlain(GetAuthorizationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getAuthorization", TypeShape.of(GetAuthorizationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A cloud link resource
     * API Version: 2021-06-01.
     * 
     */
    public static Output<GetCloudLinkResult> getCloudLink(GetCloudLinkArgs args) {
        return getCloudLink(args, InvokeOptions.Empty);
    }
    /**
     * A cloud link resource
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetCloudLinkResult> getCloudLinkPlain(GetCloudLinkPlainArgs args) {
        return getCloudLinkPlain(args, InvokeOptions.Empty);
    }
    /**
     * A cloud link resource
     * API Version: 2021-06-01.
     * 
     */
    public static Output<GetCloudLinkResult> getCloudLink(GetCloudLinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getCloudLink", TypeShape.of(GetCloudLinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A cloud link resource
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetCloudLinkResult> getCloudLinkPlain(GetCloudLinkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getCloudLink", TypeShape.of(GetCloudLinkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A cluster resource
     * API Version: 2020-03-20.
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * A cluster resource
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args) {
        return getClusterPlain(args, InvokeOptions.Empty);
    }
    /**
     * A cluster resource
     * API Version: 2020-03-20.
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A cluster resource
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A datastore resource
     * API Version: 2021-01-01-preview.
     * 
     */
    public static Output<GetDatastoreResult> getDatastore(GetDatastoreArgs args) {
        return getDatastore(args, InvokeOptions.Empty);
    }
    /**
     * A datastore resource
     * API Version: 2021-01-01-preview.
     * 
     */
    public static CompletableFuture<GetDatastoreResult> getDatastorePlain(GetDatastorePlainArgs args) {
        return getDatastorePlain(args, InvokeOptions.Empty);
    }
    /**
     * A datastore resource
     * API Version: 2021-01-01-preview.
     * 
     */
    public static Output<GetDatastoreResult> getDatastore(GetDatastoreArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getDatastore", TypeShape.of(GetDatastoreResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A datastore resource
     * API Version: 2021-01-01-preview.
     * 
     */
    public static CompletableFuture<GetDatastoreResult> getDatastorePlain(GetDatastorePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getDatastore", TypeShape.of(GetDatastoreResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A global reach connection resource
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetGlobalReachConnectionResult> getGlobalReachConnection(GetGlobalReachConnectionArgs args) {
        return getGlobalReachConnection(args, InvokeOptions.Empty);
    }
    /**
     * A global reach connection resource
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetGlobalReachConnectionResult> getGlobalReachConnectionPlain(GetGlobalReachConnectionPlainArgs args) {
        return getGlobalReachConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * A global reach connection resource
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetGlobalReachConnectionResult> getGlobalReachConnection(GetGlobalReachConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getGlobalReachConnection", TypeShape.of(GetGlobalReachConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A global reach connection resource
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetGlobalReachConnectionResult> getGlobalReachConnectionPlain(GetGlobalReachConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getGlobalReachConnection", TypeShape.of(GetGlobalReachConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An HCX Enterprise Site resource
     * API Version: 2020-03-20.
     * 
     */
    public static Output<GetHcxEnterpriseSiteResult> getHcxEnterpriseSite(GetHcxEnterpriseSiteArgs args) {
        return getHcxEnterpriseSite(args, InvokeOptions.Empty);
    }
    /**
     * An HCX Enterprise Site resource
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<GetHcxEnterpriseSiteResult> getHcxEnterpriseSitePlain(GetHcxEnterpriseSitePlainArgs args) {
        return getHcxEnterpriseSitePlain(args, InvokeOptions.Empty);
    }
    /**
     * An HCX Enterprise Site resource
     * API Version: 2020-03-20.
     * 
     */
    public static Output<GetHcxEnterpriseSiteResult> getHcxEnterpriseSite(GetHcxEnterpriseSiteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getHcxEnterpriseSite", TypeShape.of(GetHcxEnterpriseSiteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An HCX Enterprise Site resource
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<GetHcxEnterpriseSiteResult> getHcxEnterpriseSitePlain(GetHcxEnterpriseSitePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getHcxEnterpriseSite", TypeShape.of(GetHcxEnterpriseSiteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A vSphere Distributed Resource Scheduler (DRS) placement policy
     * API Version: 2021-12-01.
     * 
     */
    public static Output<GetPlacementPolicyResult> getPlacementPolicy(GetPlacementPolicyArgs args) {
        return getPlacementPolicy(args, InvokeOptions.Empty);
    }
    /**
     * A vSphere Distributed Resource Scheduler (DRS) placement policy
     * API Version: 2021-12-01.
     * 
     */
    public static CompletableFuture<GetPlacementPolicyResult> getPlacementPolicyPlain(GetPlacementPolicyPlainArgs args) {
        return getPlacementPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * A vSphere Distributed Resource Scheduler (DRS) placement policy
     * API Version: 2021-12-01.
     * 
     */
    public static Output<GetPlacementPolicyResult> getPlacementPolicy(GetPlacementPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getPlacementPolicy", TypeShape.of(GetPlacementPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A vSphere Distributed Resource Scheduler (DRS) placement policy
     * API Version: 2021-12-01.
     * 
     */
    public static CompletableFuture<GetPlacementPolicyResult> getPlacementPolicyPlain(GetPlacementPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getPlacementPolicy", TypeShape.of(GetPlacementPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private cloud resource
     * API Version: 2020-03-20.
     * 
     */
    public static Output<GetPrivateCloudResult> getPrivateCloud(GetPrivateCloudArgs args) {
        return getPrivateCloud(args, InvokeOptions.Empty);
    }
    /**
     * A private cloud resource
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<GetPrivateCloudResult> getPrivateCloudPlain(GetPrivateCloudPlainArgs args) {
        return getPrivateCloudPlain(args, InvokeOptions.Empty);
    }
    /**
     * A private cloud resource
     * API Version: 2020-03-20.
     * 
     */
    public static Output<GetPrivateCloudResult> getPrivateCloud(GetPrivateCloudArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getPrivateCloud", TypeShape.of(GetPrivateCloudResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private cloud resource
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<GetPrivateCloudResult> getPrivateCloudPlain(GetPrivateCloudPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getPrivateCloud", TypeShape.of(GetPrivateCloudResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     */
    public static Output<GetScriptExecutionResult> getScriptExecution(GetScriptExecutionArgs args) {
        return getScriptExecution(args, InvokeOptions.Empty);
    }
    /**
     * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetScriptExecutionResult> getScriptExecutionPlain(GetScriptExecutionPlainArgs args) {
        return getScriptExecutionPlain(args, InvokeOptions.Empty);
    }
    /**
     * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     */
    public static Output<GetScriptExecutionResult> getScriptExecution(GetScriptExecutionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getScriptExecution", TypeShape.of(GetScriptExecutionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetScriptExecutionResult> getScriptExecutionPlain(GetScriptExecutionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getScriptExecution", TypeShape.of(GetScriptExecutionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     */
    public static Output<GetScriptExecutionLogsResult> getScriptExecutionLogs(GetScriptExecutionLogsArgs args) {
        return getScriptExecutionLogs(args, InvokeOptions.Empty);
    }
    /**
     * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetScriptExecutionLogsResult> getScriptExecutionLogsPlain(GetScriptExecutionLogsPlainArgs args) {
        return getScriptExecutionLogsPlain(args, InvokeOptions.Empty);
    }
    /**
     * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     */
    public static Output<GetScriptExecutionLogsResult> getScriptExecutionLogs(GetScriptExecutionLogsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getScriptExecutionLogs", TypeShape.of(GetScriptExecutionLogsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An instance of a script executed by a user - custom or AVS
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetScriptExecutionLogsResult> getScriptExecutionLogsPlain(GetScriptExecutionLogsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getScriptExecutionLogs", TypeShape.of(GetScriptExecutionLogsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX DHCP
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkDhcpResult> getWorkloadNetworkDhcp(GetWorkloadNetworkDhcpArgs args) {
        return getWorkloadNetworkDhcp(args, InvokeOptions.Empty);
    }
    /**
     * NSX DHCP
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkDhcpResult> getWorkloadNetworkDhcpPlain(GetWorkloadNetworkDhcpPlainArgs args) {
        return getWorkloadNetworkDhcpPlain(args, InvokeOptions.Empty);
    }
    /**
     * NSX DHCP
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkDhcpResult> getWorkloadNetworkDhcp(GetWorkloadNetworkDhcpArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getWorkloadNetworkDhcp", TypeShape.of(GetWorkloadNetworkDhcpResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX DHCP
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkDhcpResult> getWorkloadNetworkDhcpPlain(GetWorkloadNetworkDhcpPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkDhcp", TypeShape.of(GetWorkloadNetworkDhcpResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX DNS Service
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkDnsServiceResult> getWorkloadNetworkDnsService(GetWorkloadNetworkDnsServiceArgs args) {
        return getWorkloadNetworkDnsService(args, InvokeOptions.Empty);
    }
    /**
     * NSX DNS Service
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkDnsServiceResult> getWorkloadNetworkDnsServicePlain(GetWorkloadNetworkDnsServicePlainArgs args) {
        return getWorkloadNetworkDnsServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * NSX DNS Service
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkDnsServiceResult> getWorkloadNetworkDnsService(GetWorkloadNetworkDnsServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getWorkloadNetworkDnsService", TypeShape.of(GetWorkloadNetworkDnsServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX DNS Service
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkDnsServiceResult> getWorkloadNetworkDnsServicePlain(GetWorkloadNetworkDnsServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkDnsService", TypeShape.of(GetWorkloadNetworkDnsServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX DNS Zone
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkDnsZoneResult> getWorkloadNetworkDnsZone(GetWorkloadNetworkDnsZoneArgs args) {
        return getWorkloadNetworkDnsZone(args, InvokeOptions.Empty);
    }
    /**
     * NSX DNS Zone
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkDnsZoneResult> getWorkloadNetworkDnsZonePlain(GetWorkloadNetworkDnsZonePlainArgs args) {
        return getWorkloadNetworkDnsZonePlain(args, InvokeOptions.Empty);
    }
    /**
     * NSX DNS Zone
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkDnsZoneResult> getWorkloadNetworkDnsZone(GetWorkloadNetworkDnsZoneArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getWorkloadNetworkDnsZone", TypeShape.of(GetWorkloadNetworkDnsZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX DNS Zone
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkDnsZoneResult> getWorkloadNetworkDnsZonePlain(GetWorkloadNetworkDnsZonePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkDnsZone", TypeShape.of(GetWorkloadNetworkDnsZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX Port Mirroring
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkPortMirroringResult> getWorkloadNetworkPortMirroring(GetWorkloadNetworkPortMirroringArgs args) {
        return getWorkloadNetworkPortMirroring(args, InvokeOptions.Empty);
    }
    /**
     * NSX Port Mirroring
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkPortMirroringResult> getWorkloadNetworkPortMirroringPlain(GetWorkloadNetworkPortMirroringPlainArgs args) {
        return getWorkloadNetworkPortMirroringPlain(args, InvokeOptions.Empty);
    }
    /**
     * NSX Port Mirroring
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkPortMirroringResult> getWorkloadNetworkPortMirroring(GetWorkloadNetworkPortMirroringArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getWorkloadNetworkPortMirroring", TypeShape.of(GetWorkloadNetworkPortMirroringResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX Port Mirroring
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkPortMirroringResult> getWorkloadNetworkPortMirroringPlain(GetWorkloadNetworkPortMirroringPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkPortMirroring", TypeShape.of(GetWorkloadNetworkPortMirroringResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX Public IP Block
     * API Version: 2021-06-01.
     * 
     */
    public static Output<GetWorkloadNetworkPublicIPResult> getWorkloadNetworkPublicIP(GetWorkloadNetworkPublicIPArgs args) {
        return getWorkloadNetworkPublicIP(args, InvokeOptions.Empty);
    }
    /**
     * NSX Public IP Block
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkPublicIPResult> getWorkloadNetworkPublicIPPlain(GetWorkloadNetworkPublicIPPlainArgs args) {
        return getWorkloadNetworkPublicIPPlain(args, InvokeOptions.Empty);
    }
    /**
     * NSX Public IP Block
     * API Version: 2021-06-01.
     * 
     */
    public static Output<GetWorkloadNetworkPublicIPResult> getWorkloadNetworkPublicIP(GetWorkloadNetworkPublicIPArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getWorkloadNetworkPublicIP", TypeShape.of(GetWorkloadNetworkPublicIPResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX Public IP Block
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkPublicIPResult> getWorkloadNetworkPublicIPPlain(GetWorkloadNetworkPublicIPPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkPublicIP", TypeShape.of(GetWorkloadNetworkPublicIPResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX Segment
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkSegmentResult> getWorkloadNetworkSegment(GetWorkloadNetworkSegmentArgs args) {
        return getWorkloadNetworkSegment(args, InvokeOptions.Empty);
    }
    /**
     * NSX Segment
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkSegmentResult> getWorkloadNetworkSegmentPlain(GetWorkloadNetworkSegmentPlainArgs args) {
        return getWorkloadNetworkSegmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * NSX Segment
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkSegmentResult> getWorkloadNetworkSegment(GetWorkloadNetworkSegmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getWorkloadNetworkSegment", TypeShape.of(GetWorkloadNetworkSegmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX Segment
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkSegmentResult> getWorkloadNetworkSegmentPlain(GetWorkloadNetworkSegmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkSegment", TypeShape.of(GetWorkloadNetworkSegmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX VM Group
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkVMGroupResult> getWorkloadNetworkVMGroup(GetWorkloadNetworkVMGroupArgs args) {
        return getWorkloadNetworkVMGroup(args, InvokeOptions.Empty);
    }
    /**
     * NSX VM Group
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkVMGroupResult> getWorkloadNetworkVMGroupPlain(GetWorkloadNetworkVMGroupPlainArgs args) {
        return getWorkloadNetworkVMGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * NSX VM Group
     * API Version: 2020-07-17-preview.
     * 
     */
    public static Output<GetWorkloadNetworkVMGroupResult> getWorkloadNetworkVMGroup(GetWorkloadNetworkVMGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:getWorkloadNetworkVMGroup", TypeShape.of(GetWorkloadNetworkVMGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * NSX VM Group
     * API Version: 2020-07-17-preview.
     * 
     */
    public static CompletableFuture<GetWorkloadNetworkVMGroupResult> getWorkloadNetworkVMGroupPlain(GetWorkloadNetworkVMGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkVMGroup", TypeShape.of(GetWorkloadNetworkVMGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Administrative credentials for accessing vCenter and NSX-T
     * API Version: 2020-03-20.
     * 
     */
    public static Output<ListPrivateCloudAdminCredentialsResult> listPrivateCloudAdminCredentials(ListPrivateCloudAdminCredentialsArgs args) {
        return listPrivateCloudAdminCredentials(args, InvokeOptions.Empty);
    }
    /**
     * Administrative credentials for accessing vCenter and NSX-T
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<ListPrivateCloudAdminCredentialsResult> listPrivateCloudAdminCredentialsPlain(ListPrivateCloudAdminCredentialsPlainArgs args) {
        return listPrivateCloudAdminCredentialsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Administrative credentials for accessing vCenter and NSX-T
     * API Version: 2020-03-20.
     * 
     */
    public static Output<ListPrivateCloudAdminCredentialsResult> listPrivateCloudAdminCredentials(ListPrivateCloudAdminCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:avs:listPrivateCloudAdminCredentials", TypeShape.of(ListPrivateCloudAdminCredentialsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Administrative credentials for accessing vCenter and NSX-T
     * API Version: 2020-03-20.
     * 
     */
    public static CompletableFuture<ListPrivateCloudAdminCredentialsResult> listPrivateCloudAdminCredentialsPlain(ListPrivateCloudAdminCredentialsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:listPrivateCloudAdminCredentials", TypeShape.of(ListPrivateCloudAdminCredentialsResult.class), args, Utilities.withVersion(options));
    }
}
