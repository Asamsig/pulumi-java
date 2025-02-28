// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.serialconsole;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.serialconsole.inputs.GetSerialPortArgs;
import com.pulumi.azurenative.serialconsole.inputs.GetSerialPortPlainArgs;
import com.pulumi.azurenative.serialconsole.outputs.GetSerialPortResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SerialconsoleFunctions {
    /**
     * Represents the serial port of the parent resource.
     * API Version: 2018-05-01.
     * 
     */
    public static Output<GetSerialPortResult> getSerialPort(GetSerialPortArgs args) {
        return getSerialPort(args, InvokeOptions.Empty);
    }
    /**
     * Represents the serial port of the parent resource.
     * API Version: 2018-05-01.
     * 
     */
    public static CompletableFuture<GetSerialPortResult> getSerialPortPlain(GetSerialPortPlainArgs args) {
        return getSerialPortPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents the serial port of the parent resource.
     * API Version: 2018-05-01.
     * 
     */
    public static Output<GetSerialPortResult> getSerialPort(GetSerialPortArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:serialconsole:getSerialPort", TypeShape.of(GetSerialPortResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the serial port of the parent resource.
     * API Version: 2018-05-01.
     * 
     */
    public static CompletableFuture<GetSerialPortResult> getSerialPortPlain(GetSerialPortPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:serialconsole:getSerialPort", TypeShape.of(GetSerialPortResult.class), args, Utilities.withVersion(options));
    }
}
