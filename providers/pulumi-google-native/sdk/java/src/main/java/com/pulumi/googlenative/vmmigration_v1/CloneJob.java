// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.vmmigration_v1.CloneJobArgs;
import com.pulumi.googlenative.vmmigration_v1.outputs.ComputeEngineTargetDetailsResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.StatusResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Initiates a Clone of a specific migrating VM.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1:CloneJob")
public class CloneJob extends com.pulumi.resources.CustomResource {
    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    @Export(name="computeEngineTargetDetails", type=ComputeEngineTargetDetailsResponse.class, parameters={})
    private Output<ComputeEngineTargetDetailsResponse> computeEngineTargetDetails;

    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    public Output<ComputeEngineTargetDetailsResponse> computeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }
    /**
     * The time the clone job was created (as an API call, not when it was actually created in the target).
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the clone job was created (as an API call, not when it was actually created in the target).
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The time the clone job was ended.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The time the clone job was ended.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * Provides details for the errors that led to the Clone Job&#39;s state.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details for the errors that led to the Clone Job&#39;s state.
     * 
     */
    public Output<StatusResponse> error() {
        return this.error;
    }
    /**
     * The name of the clone.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the clone.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * State of the clone job.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the clone job.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The time the state was last updated.
     * 
     */
    @Export(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    /**
     * @return The time the state was last updated.
     * 
     */
    public Output<String> stateTime() {
        return this.stateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloneJob(String name) {
        this(name, CloneJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloneJob(String name, CloneJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloneJob(String name, CloneJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:CloneJob", name, args == null ? CloneJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloneJob(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:CloneJob", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CloneJob get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloneJob(name, id, options);
    }
}
