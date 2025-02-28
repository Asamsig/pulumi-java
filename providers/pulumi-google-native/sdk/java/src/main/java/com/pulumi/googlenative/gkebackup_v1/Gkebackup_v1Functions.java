// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupPlainArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupPlanArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupPlanBackupIamPolicyArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupPlanBackupIamPolicyPlainArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupPlanBackupVolumeBackupIamPolicyArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupPlanBackupVolumeBackupIamPolicyPlainArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupPlanIamPolicyArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupPlanIamPolicyPlainArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetBackupPlanPlainArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestoreArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestorePlainArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestorePlanArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestorePlanIamPolicyArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestorePlanIamPolicyPlainArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestorePlanPlainArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestorePlanRestoreIamPolicyArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestorePlanRestoreIamPolicyPlainArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestorePlanRestoreVolumeRestoreIamPolicyArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.GetRestorePlanRestoreVolumeRestoreIamPolicyPlainArgs;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetBackupPlanBackupIamPolicyResult;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetBackupPlanBackupVolumeBackupIamPolicyResult;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetBackupPlanIamPolicyResult;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetBackupPlanResult;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetBackupResult;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetRestorePlanIamPolicyResult;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetRestorePlanRestoreIamPolicyResult;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetRestorePlanRestoreVolumeRestoreIamPolicyResult;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetRestorePlanResult;
import com.pulumi.googlenative.gkebackup_v1.outputs.GetRestoreResult;
import java.util.concurrent.CompletableFuture;

public final class Gkebackup_v1Functions {
    /**
     * Retrieve the details of a single Backup.
     * 
     */
    public static Output<GetBackupResult> getBackup(GetBackupArgs args) {
        return getBackup(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the details of a single Backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackupPlain(GetBackupPlainArgs args) {
        return getBackupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the details of a single Backup.
     * 
     */
    public static Output<GetBackupResult> getBackup(GetBackupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the details of a single Backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackupPlain(GetBackupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the details of a single BackupPlan.
     * 
     */
    public static Output<GetBackupPlanResult> getBackupPlan(GetBackupPlanArgs args) {
        return getBackupPlan(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the details of a single BackupPlan.
     * 
     */
    public static CompletableFuture<GetBackupPlanResult> getBackupPlanPlain(GetBackupPlanPlainArgs args) {
        return getBackupPlanPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the details of a single BackupPlan.
     * 
     */
    public static Output<GetBackupPlanResult> getBackupPlan(GetBackupPlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getBackupPlan", TypeShape.of(GetBackupPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the details of a single BackupPlan.
     * 
     */
    public static CompletableFuture<GetBackupPlanResult> getBackupPlanPlain(GetBackupPlanPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getBackupPlan", TypeShape.of(GetBackupPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetBackupPlanBackupIamPolicyResult> getBackupPlanBackupIamPolicy(GetBackupPlanBackupIamPolicyArgs args) {
        return getBackupPlanBackupIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetBackupPlanBackupIamPolicyResult> getBackupPlanBackupIamPolicyPlain(GetBackupPlanBackupIamPolicyPlainArgs args) {
        return getBackupPlanBackupIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetBackupPlanBackupIamPolicyResult> getBackupPlanBackupIamPolicy(GetBackupPlanBackupIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getBackupPlanBackupIamPolicy", TypeShape.of(GetBackupPlanBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetBackupPlanBackupIamPolicyResult> getBackupPlanBackupIamPolicyPlain(GetBackupPlanBackupIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getBackupPlanBackupIamPolicy", TypeShape.of(GetBackupPlanBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetBackupPlanBackupVolumeBackupIamPolicyResult> getBackupPlanBackupVolumeBackupIamPolicy(GetBackupPlanBackupVolumeBackupIamPolicyArgs args) {
        return getBackupPlanBackupVolumeBackupIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetBackupPlanBackupVolumeBackupIamPolicyResult> getBackupPlanBackupVolumeBackupIamPolicyPlain(GetBackupPlanBackupVolumeBackupIamPolicyPlainArgs args) {
        return getBackupPlanBackupVolumeBackupIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetBackupPlanBackupVolumeBackupIamPolicyResult> getBackupPlanBackupVolumeBackupIamPolicy(GetBackupPlanBackupVolumeBackupIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getBackupPlanBackupVolumeBackupIamPolicy", TypeShape.of(GetBackupPlanBackupVolumeBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetBackupPlanBackupVolumeBackupIamPolicyResult> getBackupPlanBackupVolumeBackupIamPolicyPlain(GetBackupPlanBackupVolumeBackupIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getBackupPlanBackupVolumeBackupIamPolicy", TypeShape.of(GetBackupPlanBackupVolumeBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetBackupPlanIamPolicyResult> getBackupPlanIamPolicy(GetBackupPlanIamPolicyArgs args) {
        return getBackupPlanIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetBackupPlanIamPolicyResult> getBackupPlanIamPolicyPlain(GetBackupPlanIamPolicyPlainArgs args) {
        return getBackupPlanIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetBackupPlanIamPolicyResult> getBackupPlanIamPolicy(GetBackupPlanIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getBackupPlanIamPolicy", TypeShape.of(GetBackupPlanIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetBackupPlanIamPolicyResult> getBackupPlanIamPolicyPlain(GetBackupPlanIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getBackupPlanIamPolicy", TypeShape.of(GetBackupPlanIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the details of a single Restore.
     * 
     */
    public static Output<GetRestoreResult> getRestore(GetRestoreArgs args) {
        return getRestore(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the details of a single Restore.
     * 
     */
    public static CompletableFuture<GetRestoreResult> getRestorePlain(GetRestorePlainArgs args) {
        return getRestorePlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the details of a single Restore.
     * 
     */
    public static Output<GetRestoreResult> getRestore(GetRestoreArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getRestore", TypeShape.of(GetRestoreResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the details of a single Restore.
     * 
     */
    public static CompletableFuture<GetRestoreResult> getRestorePlain(GetRestorePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getRestore", TypeShape.of(GetRestoreResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the details of a single RestorePlan.
     * 
     */
    public static Output<GetRestorePlanResult> getRestorePlan(GetRestorePlanArgs args) {
        return getRestorePlan(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the details of a single RestorePlan.
     * 
     */
    public static CompletableFuture<GetRestorePlanResult> getRestorePlanPlain(GetRestorePlanPlainArgs args) {
        return getRestorePlanPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the details of a single RestorePlan.
     * 
     */
    public static Output<GetRestorePlanResult> getRestorePlan(GetRestorePlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getRestorePlan", TypeShape.of(GetRestorePlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the details of a single RestorePlan.
     * 
     */
    public static CompletableFuture<GetRestorePlanResult> getRestorePlanPlain(GetRestorePlanPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getRestorePlan", TypeShape.of(GetRestorePlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetRestorePlanIamPolicyResult> getRestorePlanIamPolicy(GetRestorePlanIamPolicyArgs args) {
        return getRestorePlanIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRestorePlanIamPolicyResult> getRestorePlanIamPolicyPlain(GetRestorePlanIamPolicyPlainArgs args) {
        return getRestorePlanIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetRestorePlanIamPolicyResult> getRestorePlanIamPolicy(GetRestorePlanIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getRestorePlanIamPolicy", TypeShape.of(GetRestorePlanIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRestorePlanIamPolicyResult> getRestorePlanIamPolicyPlain(GetRestorePlanIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getRestorePlanIamPolicy", TypeShape.of(GetRestorePlanIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetRestorePlanRestoreIamPolicyResult> getRestorePlanRestoreIamPolicy(GetRestorePlanRestoreIamPolicyArgs args) {
        return getRestorePlanRestoreIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRestorePlanRestoreIamPolicyResult> getRestorePlanRestoreIamPolicyPlain(GetRestorePlanRestoreIamPolicyPlainArgs args) {
        return getRestorePlanRestoreIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetRestorePlanRestoreIamPolicyResult> getRestorePlanRestoreIamPolicy(GetRestorePlanRestoreIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getRestorePlanRestoreIamPolicy", TypeShape.of(GetRestorePlanRestoreIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRestorePlanRestoreIamPolicyResult> getRestorePlanRestoreIamPolicyPlain(GetRestorePlanRestoreIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getRestorePlanRestoreIamPolicy", TypeShape.of(GetRestorePlanRestoreIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetRestorePlanRestoreVolumeRestoreIamPolicyResult> getRestorePlanRestoreVolumeRestoreIamPolicy(GetRestorePlanRestoreVolumeRestoreIamPolicyArgs args) {
        return getRestorePlanRestoreVolumeRestoreIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRestorePlanRestoreVolumeRestoreIamPolicyResult> getRestorePlanRestoreVolumeRestoreIamPolicyPlain(GetRestorePlanRestoreVolumeRestoreIamPolicyPlainArgs args) {
        return getRestorePlanRestoreVolumeRestoreIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetRestorePlanRestoreVolumeRestoreIamPolicyResult> getRestorePlanRestoreVolumeRestoreIamPolicy(GetRestorePlanRestoreVolumeRestoreIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:gkebackup/v1:getRestorePlanRestoreVolumeRestoreIamPolicy", TypeShape.of(GetRestorePlanRestoreVolumeRestoreIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetRestorePlanRestoreVolumeRestoreIamPolicyResult> getRestorePlanRestoreVolumeRestoreIamPolicyPlain(GetRestorePlanRestoreVolumeRestoreIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkebackup/v1:getRestorePlanRestoreVolumeRestoreIamPolicy", TypeShape.of(GetRestorePlanRestoreVolumeRestoreIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
