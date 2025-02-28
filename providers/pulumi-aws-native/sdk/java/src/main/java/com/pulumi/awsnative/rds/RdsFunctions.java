// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rds;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.rds.inputs.GetDBProxyArgs;
import com.pulumi.awsnative.rds.inputs.GetDBProxyEndpointArgs;
import com.pulumi.awsnative.rds.inputs.GetDBProxyEndpointPlainArgs;
import com.pulumi.awsnative.rds.inputs.GetDBProxyPlainArgs;
import com.pulumi.awsnative.rds.inputs.GetDBProxyTargetGroupArgs;
import com.pulumi.awsnative.rds.inputs.GetDBProxyTargetGroupPlainArgs;
import com.pulumi.awsnative.rds.inputs.GetGlobalClusterArgs;
import com.pulumi.awsnative.rds.inputs.GetGlobalClusterPlainArgs;
import com.pulumi.awsnative.rds.outputs.GetDBProxyEndpointResult;
import com.pulumi.awsnative.rds.outputs.GetDBProxyResult;
import com.pulumi.awsnative.rds.outputs.GetDBProxyTargetGroupResult;
import com.pulumi.awsnative.rds.outputs.GetGlobalClusterResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class RdsFunctions {
    /**
     * Resource schema for AWS::RDS::DBProxy
     * 
     */
    public static Output<GetDBProxyResult> getDBProxy(GetDBProxyArgs args) {
        return getDBProxy(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::RDS::DBProxy
     * 
     */
    public static CompletableFuture<GetDBProxyResult> getDBProxyPlain(GetDBProxyPlainArgs args) {
        return getDBProxyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::RDS::DBProxy
     * 
     */
    public static Output<GetDBProxyResult> getDBProxy(GetDBProxyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:rds:getDBProxy", TypeShape.of(GetDBProxyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::RDS::DBProxy
     * 
     */
    public static CompletableFuture<GetDBProxyResult> getDBProxyPlain(GetDBProxyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:rds:getDBProxy", TypeShape.of(GetDBProxyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::RDS::DBProxyEndpoint.
     * 
     */
    public static Output<GetDBProxyEndpointResult> getDBProxyEndpoint(GetDBProxyEndpointArgs args) {
        return getDBProxyEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::RDS::DBProxyEndpoint.
     * 
     */
    public static CompletableFuture<GetDBProxyEndpointResult> getDBProxyEndpointPlain(GetDBProxyEndpointPlainArgs args) {
        return getDBProxyEndpointPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::RDS::DBProxyEndpoint.
     * 
     */
    public static Output<GetDBProxyEndpointResult> getDBProxyEndpoint(GetDBProxyEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:rds:getDBProxyEndpoint", TypeShape.of(GetDBProxyEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::RDS::DBProxyEndpoint.
     * 
     */
    public static CompletableFuture<GetDBProxyEndpointResult> getDBProxyEndpointPlain(GetDBProxyEndpointPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:rds:getDBProxyEndpoint", TypeShape.of(GetDBProxyEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::RDS::DBProxyTargetGroup
     * 
     */
    public static Output<GetDBProxyTargetGroupResult> getDBProxyTargetGroup(GetDBProxyTargetGroupArgs args) {
        return getDBProxyTargetGroup(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::RDS::DBProxyTargetGroup
     * 
     */
    public static CompletableFuture<GetDBProxyTargetGroupResult> getDBProxyTargetGroupPlain(GetDBProxyTargetGroupPlainArgs args) {
        return getDBProxyTargetGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::RDS::DBProxyTargetGroup
     * 
     */
    public static Output<GetDBProxyTargetGroupResult> getDBProxyTargetGroup(GetDBProxyTargetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:rds:getDBProxyTargetGroup", TypeShape.of(GetDBProxyTargetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::RDS::DBProxyTargetGroup
     * 
     */
    public static CompletableFuture<GetDBProxyTargetGroupResult> getDBProxyTargetGroupPlain(GetDBProxyTargetGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:rds:getDBProxyTargetGroup", TypeShape.of(GetDBProxyTargetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::RDS::GlobalCluster
     * 
     */
    public static Output<GetGlobalClusterResult> getGlobalCluster(GetGlobalClusterArgs args) {
        return getGlobalCluster(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::RDS::GlobalCluster
     * 
     */
    public static CompletableFuture<GetGlobalClusterResult> getGlobalClusterPlain(GetGlobalClusterPlainArgs args) {
        return getGlobalClusterPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::RDS::GlobalCluster
     * 
     */
    public static Output<GetGlobalClusterResult> getGlobalCluster(GetGlobalClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:rds:getGlobalCluster", TypeShape.of(GetGlobalClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::RDS::GlobalCluster
     * 
     */
    public static CompletableFuture<GetGlobalClusterResult> getGlobalClusterPlain(GetGlobalClusterPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:rds:getGlobalCluster", TypeShape.of(GetGlobalClusterResult.class), args, Utilities.withVersion(options));
    }
}
