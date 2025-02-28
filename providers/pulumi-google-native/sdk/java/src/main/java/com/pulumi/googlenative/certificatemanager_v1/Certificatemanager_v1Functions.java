// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.certificatemanager_v1.inputs.GetCertificateArgs;
import com.pulumi.googlenative.certificatemanager_v1.inputs.GetCertificateMapArgs;
import com.pulumi.googlenative.certificatemanager_v1.inputs.GetCertificateMapEntryArgs;
import com.pulumi.googlenative.certificatemanager_v1.inputs.GetCertificateMapEntryPlainArgs;
import com.pulumi.googlenative.certificatemanager_v1.inputs.GetCertificateMapPlainArgs;
import com.pulumi.googlenative.certificatemanager_v1.inputs.GetCertificatePlainArgs;
import com.pulumi.googlenative.certificatemanager_v1.inputs.GetDnsAuthorizationArgs;
import com.pulumi.googlenative.certificatemanager_v1.inputs.GetDnsAuthorizationPlainArgs;
import com.pulumi.googlenative.certificatemanager_v1.outputs.GetCertificateMapEntryResult;
import com.pulumi.googlenative.certificatemanager_v1.outputs.GetCertificateMapResult;
import com.pulumi.googlenative.certificatemanager_v1.outputs.GetCertificateResult;
import com.pulumi.googlenative.certificatemanager_v1.outputs.GetDnsAuthorizationResult;
import java.util.concurrent.CompletableFuture;

public final class Certificatemanager_v1Functions {
    /**
     * Gets details of a single Certificate.
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Certificate.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args) {
        return getCertificatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Certificate.
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:certificatemanager/v1:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Certificate.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:certificatemanager/v1:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single CertificateMap.
     * 
     */
    public static Output<GetCertificateMapResult> getCertificateMap(GetCertificateMapArgs args) {
        return getCertificateMap(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single CertificateMap.
     * 
     */
    public static CompletableFuture<GetCertificateMapResult> getCertificateMapPlain(GetCertificateMapPlainArgs args) {
        return getCertificateMapPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single CertificateMap.
     * 
     */
    public static Output<GetCertificateMapResult> getCertificateMap(GetCertificateMapArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:certificatemanager/v1:getCertificateMap", TypeShape.of(GetCertificateMapResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single CertificateMap.
     * 
     */
    public static CompletableFuture<GetCertificateMapResult> getCertificateMapPlain(GetCertificateMapPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:certificatemanager/v1:getCertificateMap", TypeShape.of(GetCertificateMapResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single CertificateMapEntry.
     * 
     */
    public static Output<GetCertificateMapEntryResult> getCertificateMapEntry(GetCertificateMapEntryArgs args) {
        return getCertificateMapEntry(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single CertificateMapEntry.
     * 
     */
    public static CompletableFuture<GetCertificateMapEntryResult> getCertificateMapEntryPlain(GetCertificateMapEntryPlainArgs args) {
        return getCertificateMapEntryPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single CertificateMapEntry.
     * 
     */
    public static Output<GetCertificateMapEntryResult> getCertificateMapEntry(GetCertificateMapEntryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:certificatemanager/v1:getCertificateMapEntry", TypeShape.of(GetCertificateMapEntryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single CertificateMapEntry.
     * 
     */
    public static CompletableFuture<GetCertificateMapEntryResult> getCertificateMapEntryPlain(GetCertificateMapEntryPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:certificatemanager/v1:getCertificateMapEntry", TypeShape.of(GetCertificateMapEntryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single DnsAuthorization.
     * 
     */
    public static Output<GetDnsAuthorizationResult> getDnsAuthorization(GetDnsAuthorizationArgs args) {
        return getDnsAuthorization(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single DnsAuthorization.
     * 
     */
    public static CompletableFuture<GetDnsAuthorizationResult> getDnsAuthorizationPlain(GetDnsAuthorizationPlainArgs args) {
        return getDnsAuthorizationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single DnsAuthorization.
     * 
     */
    public static Output<GetDnsAuthorizationResult> getDnsAuthorization(GetDnsAuthorizationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:certificatemanager/v1:getDnsAuthorization", TypeShape.of(GetDnsAuthorizationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single DnsAuthorization.
     * 
     */
    public static CompletableFuture<GetDnsAuthorizationResult> getDnsAuthorizationPlain(GetDnsAuthorizationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:certificatemanager/v1:getDnsAuthorization", TypeShape.of(GetDnsAuthorizationResult.class), args, Utilities.withVersion(options));
    }
}
