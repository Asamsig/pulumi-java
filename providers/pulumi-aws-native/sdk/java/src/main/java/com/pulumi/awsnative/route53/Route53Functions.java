// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.route53.inputs.GetDNSSECArgs;
import com.pulumi.awsnative.route53.inputs.GetDNSSECPlainArgs;
import com.pulumi.awsnative.route53.inputs.GetHealthCheckArgs;
import com.pulumi.awsnative.route53.inputs.GetHealthCheckPlainArgs;
import com.pulumi.awsnative.route53.inputs.GetHostedZoneArgs;
import com.pulumi.awsnative.route53.inputs.GetHostedZonePlainArgs;
import com.pulumi.awsnative.route53.inputs.GetKeySigningKeyArgs;
import com.pulumi.awsnative.route53.inputs.GetKeySigningKeyPlainArgs;
import com.pulumi.awsnative.route53.outputs.GetDNSSECResult;
import com.pulumi.awsnative.route53.outputs.GetHealthCheckResult;
import com.pulumi.awsnative.route53.outputs.GetHostedZoneResult;
import com.pulumi.awsnative.route53.outputs.GetKeySigningKeyResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Route53Functions {
    /**
     * Resource used to control (enable/disable) DNSSEC in a specific hosted zone.
     * 
     */
    public static Output<GetDNSSECResult> getDNSSEC(GetDNSSECArgs args) {
        return getDNSSEC(args, InvokeOptions.Empty);
    }
    /**
     * Resource used to control (enable/disable) DNSSEC in a specific hosted zone.
     * 
     */
    public static CompletableFuture<GetDNSSECResult> getDNSSECPlain(GetDNSSECPlainArgs args) {
        return getDNSSECPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource used to control (enable/disable) DNSSEC in a specific hosted zone.
     * 
     */
    public static Output<GetDNSSECResult> getDNSSEC(GetDNSSECArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:route53:getDNSSEC", TypeShape.of(GetDNSSECResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource used to control (enable/disable) DNSSEC in a specific hosted zone.
     * 
     */
    public static CompletableFuture<GetDNSSECResult> getDNSSECPlain(GetDNSSECPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53:getDNSSEC", TypeShape.of(GetDNSSECResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Route53::HealthCheck.
     * 
     */
    public static Output<GetHealthCheckResult> getHealthCheck(GetHealthCheckArgs args) {
        return getHealthCheck(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Route53::HealthCheck.
     * 
     */
    public static CompletableFuture<GetHealthCheckResult> getHealthCheckPlain(GetHealthCheckPlainArgs args) {
        return getHealthCheckPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Route53::HealthCheck.
     * 
     */
    public static Output<GetHealthCheckResult> getHealthCheck(GetHealthCheckArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:route53:getHealthCheck", TypeShape.of(GetHealthCheckResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Route53::HealthCheck.
     * 
     */
    public static CompletableFuture<GetHealthCheckResult> getHealthCheckPlain(GetHealthCheckPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53:getHealthCheck", TypeShape.of(GetHealthCheckResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Route53::HostedZone.
     * 
     */
    public static Output<GetHostedZoneResult> getHostedZone(GetHostedZoneArgs args) {
        return getHostedZone(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Route53::HostedZone.
     * 
     */
    public static CompletableFuture<GetHostedZoneResult> getHostedZonePlain(GetHostedZonePlainArgs args) {
        return getHostedZonePlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Route53::HostedZone.
     * 
     */
    public static Output<GetHostedZoneResult> getHostedZone(GetHostedZoneArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:route53:getHostedZone", TypeShape.of(GetHostedZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::Route53::HostedZone.
     * 
     */
    public static CompletableFuture<GetHostedZoneResult> getHostedZonePlain(GetHostedZonePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53:getHostedZone", TypeShape.of(GetHostedZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a key signing key (KSK) associated with a hosted zone. You can only have two KSKs per hosted zone.
     * 
     */
    public static Output<GetKeySigningKeyResult> getKeySigningKey(GetKeySigningKeyArgs args) {
        return getKeySigningKey(args, InvokeOptions.Empty);
    }
    /**
     * Represents a key signing key (KSK) associated with a hosted zone. You can only have two KSKs per hosted zone.
     * 
     */
    public static CompletableFuture<GetKeySigningKeyResult> getKeySigningKeyPlain(GetKeySigningKeyPlainArgs args) {
        return getKeySigningKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents a key signing key (KSK) associated with a hosted zone. You can only have two KSKs per hosted zone.
     * 
     */
    public static Output<GetKeySigningKeyResult> getKeySigningKey(GetKeySigningKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:route53:getKeySigningKey", TypeShape.of(GetKeySigningKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a key signing key (KSK) associated with a hosted zone. You can only have two KSKs per hosted zone.
     * 
     */
    public static CompletableFuture<GetKeySigningKeyResult> getKeySigningKeyPlain(GetKeySigningKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53:getKeySigningKey", TypeShape.of(GetKeySigningKeyResult.class), args, Utilities.withVersion(options));
    }
}
