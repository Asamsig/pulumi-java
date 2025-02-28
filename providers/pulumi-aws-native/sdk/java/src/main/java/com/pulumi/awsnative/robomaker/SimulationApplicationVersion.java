// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.robomaker.SimulationApplicationVersionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * AWS::RoboMaker::SimulationApplicationVersion resource creates an AWS RoboMaker SimulationApplicationVersion. This helps you control which code your simulation uses.
 * 
 */
@ResourceType(type="aws-native:robomaker:SimulationApplicationVersion")
public class SimulationApplicationVersion extends com.pulumi.resources.CustomResource {
    @Export(name="application", type=String.class, parameters={})
    private Output<String> application;

    public Output<String> application() {
        return this.application;
    }
    @Export(name="applicationVersion", type=String.class, parameters={})
    private Output<String> applicationVersion;

    public Output<String> applicationVersion() {
        return this.applicationVersion;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The revision ID of robot application.
     * 
     */
    @Export(name="currentRevisionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> currentRevisionId;

    /**
     * @return The revision ID of robot application.
     * 
     */
    public Output<Optional<String>> currentRevisionId() {
        return Codegen.optional(this.currentRevisionId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SimulationApplicationVersion(String name) {
        this(name, SimulationApplicationVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SimulationApplicationVersion(String name, SimulationApplicationVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SimulationApplicationVersion(String name, SimulationApplicationVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:SimulationApplicationVersion", name, args == null ? SimulationApplicationVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SimulationApplicationVersion(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:SimulationApplicationVersion", name, null, makeResourceOptions(options, id));
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
    public static SimulationApplicationVersion get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SimulationApplicationVersion(name, id, options);
    }
}
