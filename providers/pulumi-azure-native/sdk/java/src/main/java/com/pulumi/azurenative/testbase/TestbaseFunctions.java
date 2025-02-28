// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.testbase.inputs.GetCustomerEventArgs;
import com.pulumi.azurenative.testbase.inputs.GetCustomerEventPlainArgs;
import com.pulumi.azurenative.testbase.inputs.GetFavoriteProcessArgs;
import com.pulumi.azurenative.testbase.inputs.GetFavoriteProcessPlainArgs;
import com.pulumi.azurenative.testbase.inputs.GetPackageArgs;
import com.pulumi.azurenative.testbase.inputs.GetPackageDownloadURLArgs;
import com.pulumi.azurenative.testbase.inputs.GetPackageDownloadURLPlainArgs;
import com.pulumi.azurenative.testbase.inputs.GetPackagePlainArgs;
import com.pulumi.azurenative.testbase.inputs.GetTestBaseAccountArgs;
import com.pulumi.azurenative.testbase.inputs.GetTestBaseAccountFileUploadUrlArgs;
import com.pulumi.azurenative.testbase.inputs.GetTestBaseAccountFileUploadUrlPlainArgs;
import com.pulumi.azurenative.testbase.inputs.GetTestBaseAccountPlainArgs;
import com.pulumi.azurenative.testbase.inputs.GetTestResultDownloadURLArgs;
import com.pulumi.azurenative.testbase.inputs.GetTestResultDownloadURLPlainArgs;
import com.pulumi.azurenative.testbase.inputs.GetTestResultVideoDownloadURLArgs;
import com.pulumi.azurenative.testbase.inputs.GetTestResultVideoDownloadURLPlainArgs;
import com.pulumi.azurenative.testbase.outputs.GetCustomerEventResult;
import com.pulumi.azurenative.testbase.outputs.GetFavoriteProcessResult;
import com.pulumi.azurenative.testbase.outputs.GetPackageDownloadURLResult;
import com.pulumi.azurenative.testbase.outputs.GetPackageResult;
import com.pulumi.azurenative.testbase.outputs.GetTestBaseAccountFileUploadUrlResult;
import com.pulumi.azurenative.testbase.outputs.GetTestBaseAccountResult;
import com.pulumi.azurenative.testbase.outputs.GetTestResultDownloadURLResult;
import com.pulumi.azurenative.testbase.outputs.GetTestResultVideoDownloadURLResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class TestbaseFunctions {
    /**
     * The Customer Notification Event resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetCustomerEventResult> getCustomerEvent(GetCustomerEventArgs args) {
        return getCustomerEvent(args, InvokeOptions.Empty);
    }
    /**
     * The Customer Notification Event resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetCustomerEventResult> getCustomerEventPlain(GetCustomerEventPlainArgs args) {
        return getCustomerEventPlain(args, InvokeOptions.Empty);
    }
    /**
     * The Customer Notification Event resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetCustomerEventResult> getCustomerEvent(GetCustomerEventArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:testbase:getCustomerEvent", TypeShape.of(GetCustomerEventResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Customer Notification Event resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetCustomerEventResult> getCustomerEventPlain(GetCustomerEventPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getCustomerEvent", TypeShape.of(GetCustomerEventResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A favorite process identifier.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetFavoriteProcessResult> getFavoriteProcess(GetFavoriteProcessArgs args) {
        return getFavoriteProcess(args, InvokeOptions.Empty);
    }
    /**
     * A favorite process identifier.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetFavoriteProcessResult> getFavoriteProcessPlain(GetFavoriteProcessPlainArgs args) {
        return getFavoriteProcessPlain(args, InvokeOptions.Empty);
    }
    /**
     * A favorite process identifier.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetFavoriteProcessResult> getFavoriteProcess(GetFavoriteProcessArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:testbase:getFavoriteProcess", TypeShape.of(GetFavoriteProcessResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A favorite process identifier.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetFavoriteProcessResult> getFavoriteProcessPlain(GetFavoriteProcessPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getFavoriteProcess", TypeShape.of(GetFavoriteProcessResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Test Base Package resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetPackageResult> getPackage(GetPackageArgs args) {
        return getPackage(args, InvokeOptions.Empty);
    }
    /**
     * The Test Base Package resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetPackageResult> getPackagePlain(GetPackagePlainArgs args) {
        return getPackagePlain(args, InvokeOptions.Empty);
    }
    /**
     * The Test Base Package resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetPackageResult> getPackage(GetPackageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:testbase:getPackage", TypeShape.of(GetPackageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Test Base Package resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetPackageResult> getPackagePlain(GetPackagePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getPackage", TypeShape.of(GetPackageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetPackageDownloadURLResult> getPackageDownloadURL(GetPackageDownloadURLArgs args) {
        return getPackageDownloadURL(args, InvokeOptions.Empty);
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetPackageDownloadURLResult> getPackageDownloadURLPlain(GetPackageDownloadURLPlainArgs args) {
        return getPackageDownloadURLPlain(args, InvokeOptions.Empty);
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetPackageDownloadURLResult> getPackageDownloadURL(GetPackageDownloadURLArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:testbase:getPackageDownloadURL", TypeShape.of(GetPackageDownloadURLResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetPackageDownloadURLResult> getPackageDownloadURLPlain(GetPackageDownloadURLPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getPackageDownloadURL", TypeShape.of(GetPackageDownloadURLResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Test Base Account resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetTestBaseAccountResult> getTestBaseAccount(GetTestBaseAccountArgs args) {
        return getTestBaseAccount(args, InvokeOptions.Empty);
    }
    /**
     * The Test Base Account resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestBaseAccountResult> getTestBaseAccountPlain(GetTestBaseAccountPlainArgs args) {
        return getTestBaseAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * The Test Base Account resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetTestBaseAccountResult> getTestBaseAccount(GetTestBaseAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:testbase:getTestBaseAccount", TypeShape.of(GetTestBaseAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Test Base Account resource.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestBaseAccountResult> getTestBaseAccountPlain(GetTestBaseAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getTestBaseAccount", TypeShape.of(GetTestBaseAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The URL response
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetTestBaseAccountFileUploadUrlResult> getTestBaseAccountFileUploadUrl(GetTestBaseAccountFileUploadUrlArgs args) {
        return getTestBaseAccountFileUploadUrl(args, InvokeOptions.Empty);
    }
    /**
     * The URL response
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestBaseAccountFileUploadUrlResult> getTestBaseAccountFileUploadUrlPlain(GetTestBaseAccountFileUploadUrlPlainArgs args) {
        return getTestBaseAccountFileUploadUrlPlain(args, InvokeOptions.Empty);
    }
    /**
     * The URL response
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetTestBaseAccountFileUploadUrlResult> getTestBaseAccountFileUploadUrl(GetTestBaseAccountFileUploadUrlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:testbase:getTestBaseAccountFileUploadUrl", TypeShape.of(GetTestBaseAccountFileUploadUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The URL response
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestBaseAccountFileUploadUrlResult> getTestBaseAccountFileUploadUrlPlain(GetTestBaseAccountFileUploadUrlPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getTestBaseAccountFileUploadUrl", TypeShape.of(GetTestBaseAccountFileUploadUrlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetTestResultDownloadURLResult> getTestResultDownloadURL(GetTestResultDownloadURLArgs args) {
        return getTestResultDownloadURL(args, InvokeOptions.Empty);
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestResultDownloadURLResult> getTestResultDownloadURLPlain(GetTestResultDownloadURLPlainArgs args) {
        return getTestResultDownloadURLPlain(args, InvokeOptions.Empty);
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetTestResultDownloadURLResult> getTestResultDownloadURL(GetTestResultDownloadURLArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:testbase:getTestResultDownloadURL", TypeShape.of(GetTestResultDownloadURLResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestResultDownloadURLResult> getTestResultDownloadURLPlain(GetTestResultDownloadURLPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getTestResultDownloadURL", TypeShape.of(GetTestResultDownloadURLResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetTestResultVideoDownloadURLResult> getTestResultVideoDownloadURL(GetTestResultVideoDownloadURLArgs args) {
        return getTestResultVideoDownloadURL(args, InvokeOptions.Empty);
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestResultVideoDownloadURLResult> getTestResultVideoDownloadURLPlain(GetTestResultVideoDownloadURLPlainArgs args) {
        return getTestResultVideoDownloadURLPlain(args, InvokeOptions.Empty);
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static Output<GetTestResultVideoDownloadURLResult> getTestResultVideoDownloadURL(GetTestResultVideoDownloadURLArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:testbase:getTestResultVideoDownloadURL", TypeShape.of(GetTestResultVideoDownloadURLResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     */
    public static CompletableFuture<GetTestResultVideoDownloadURLResult> getTestResultVideoDownloadURLPlain(GetTestResultVideoDownloadURLPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getTestResultVideoDownloadURL", TypeShape.of(GetTestResultVideoDownloadURLResult.class), args, Utilities.withVersion(options));
    }
}
