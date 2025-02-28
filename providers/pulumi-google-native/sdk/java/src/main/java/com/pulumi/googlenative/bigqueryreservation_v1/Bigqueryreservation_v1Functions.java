// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryreservation_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.bigqueryreservation_v1.inputs.GetCapacityCommitmentArgs;
import com.pulumi.googlenative.bigqueryreservation_v1.inputs.GetCapacityCommitmentPlainArgs;
import com.pulumi.googlenative.bigqueryreservation_v1.inputs.GetReservationArgs;
import com.pulumi.googlenative.bigqueryreservation_v1.inputs.GetReservationPlainArgs;
import com.pulumi.googlenative.bigqueryreservation_v1.outputs.GetCapacityCommitmentResult;
import com.pulumi.googlenative.bigqueryreservation_v1.outputs.GetReservationResult;
import java.util.concurrent.CompletableFuture;

public final class Bigqueryreservation_v1Functions {
    /**
     * Returns information about the capacity commitment.
     * 
     */
    public static Output<GetCapacityCommitmentResult> getCapacityCommitment(GetCapacityCommitmentArgs args) {
        return getCapacityCommitment(args, InvokeOptions.Empty);
    }
    /**
     * Returns information about the capacity commitment.
     * 
     */
    public static CompletableFuture<GetCapacityCommitmentResult> getCapacityCommitmentPlain(GetCapacityCommitmentPlainArgs args) {
        return getCapacityCommitmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns information about the capacity commitment.
     * 
     */
    public static Output<GetCapacityCommitmentResult> getCapacityCommitment(GetCapacityCommitmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:bigqueryreservation/v1:getCapacityCommitment", TypeShape.of(GetCapacityCommitmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns information about the capacity commitment.
     * 
     */
    public static CompletableFuture<GetCapacityCommitmentResult> getCapacityCommitmentPlain(GetCapacityCommitmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigqueryreservation/v1:getCapacityCommitment", TypeShape.of(GetCapacityCommitmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns information about the reservation.
     * 
     */
    public static Output<GetReservationResult> getReservation(GetReservationArgs args) {
        return getReservation(args, InvokeOptions.Empty);
    }
    /**
     * Returns information about the reservation.
     * 
     */
    public static CompletableFuture<GetReservationResult> getReservationPlain(GetReservationPlainArgs args) {
        return getReservationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns information about the reservation.
     * 
     */
    public static Output<GetReservationResult> getReservation(GetReservationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:bigqueryreservation/v1:getReservation", TypeShape.of(GetReservationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns information about the reservation.
     * 
     */
    public static CompletableFuture<GetReservationResult> getReservationPlain(GetReservationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigqueryreservation/v1:getReservation", TypeShape.of(GetReservationResult.class), args, Utilities.withVersion(options));
    }
}
