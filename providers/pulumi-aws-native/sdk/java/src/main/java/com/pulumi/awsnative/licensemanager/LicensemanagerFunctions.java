// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.licensemanager;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.licensemanager.inputs.GetGrantArgs;
import com.pulumi.awsnative.licensemanager.inputs.GetGrantPlainArgs;
import com.pulumi.awsnative.licensemanager.inputs.GetLicenseArgs;
import com.pulumi.awsnative.licensemanager.inputs.GetLicensePlainArgs;
import com.pulumi.awsnative.licensemanager.outputs.GetGrantResult;
import com.pulumi.awsnative.licensemanager.outputs.GetLicenseResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class LicensemanagerFunctions {
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static Output<GetGrantResult> getGrant(GetGrantArgs args) {
        return getGrant(args, InvokeOptions.Empty);
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetGrantResult> getGrantPlain(GetGrantPlainArgs args) {
        return getGrantPlain(args, InvokeOptions.Empty);
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static Output<GetGrantResult> getGrant(GetGrantArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:licensemanager:getGrant", TypeShape.of(GetGrantResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetGrantResult> getGrantPlain(GetGrantPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:licensemanager:getGrant", TypeShape.of(GetGrantResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::LicenseManager::License
     * 
     */
    public static Output<GetLicenseResult> getLicense(GetLicenseArgs args) {
        return getLicense(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::LicenseManager::License
     * 
     */
    public static CompletableFuture<GetLicenseResult> getLicensePlain(GetLicensePlainArgs args) {
        return getLicensePlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::LicenseManager::License
     * 
     */
    public static Output<GetLicenseResult> getLicense(GetLicenseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:licensemanager:getLicense", TypeShape.of(GetLicenseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::LicenseManager::License
     * 
     */
    public static CompletableFuture<GetLicenseResult> getLicensePlain(GetLicensePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:licensemanager:getLicense", TypeShape.of(GetLicenseResult.class), args, Utilities.withVersion(options));
    }
}
