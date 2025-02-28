// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.qldb;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.qldb.inputs.GetStreamArgs;
import com.pulumi.awsnative.qldb.inputs.GetStreamPlainArgs;
import com.pulumi.awsnative.qldb.outputs.GetStreamResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class QldbFunctions {
    /**
     * Resource schema for AWS::QLDB::Stream.
     * 
     */
    public static Output<GetStreamResult> getStream(GetStreamArgs args) {
        return getStream(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::QLDB::Stream.
     * 
     */
    public static CompletableFuture<GetStreamResult> getStreamPlain(GetStreamPlainArgs args) {
        return getStreamPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::QLDB::Stream.
     * 
     */
    public static Output<GetStreamResult> getStream(GetStreamArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:qldb:getStream", TypeShape.of(GetStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::QLDB::Stream.
     * 
     */
    public static CompletableFuture<GetStreamResult> getStreamPlain(GetStreamPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:qldb:getStream", TypeShape.of(GetStreamResult.class), args, Utilities.withVersion(options));
    }
}
