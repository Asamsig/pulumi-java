// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ecs.ClusterCapacityProviderAssociationsArgs;
import com.pulumi.awsnative.ecs.outputs.ClusterCapacityProviderAssociationsCapacityProviderStrategy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Associate a set of ECS Capacity Providers with a specified ECS Cluster
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ecs:ClusterCapacityProviderAssociations")
public class ClusterCapacityProviderAssociations extends com.pulumi.resources.CustomResource {
    @Export(name="capacityProviders", type=List.class, parameters={String.class})
    private Output<List<String>> capacityProviders;

    public Output<List<String>> capacityProviders() {
        return this.capacityProviders;
    }
    @Export(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    public Output<String> cluster() {
        return this.cluster;
    }
    @Export(name="defaultCapacityProviderStrategy", type=List.class, parameters={ClusterCapacityProviderAssociationsCapacityProviderStrategy.class})
    private Output<List<ClusterCapacityProviderAssociationsCapacityProviderStrategy>> defaultCapacityProviderStrategy;

    public Output<List<ClusterCapacityProviderAssociationsCapacityProviderStrategy>> defaultCapacityProviderStrategy() {
        return this.defaultCapacityProviderStrategy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterCapacityProviderAssociations(String name) {
        this(name, ClusterCapacityProviderAssociationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterCapacityProviderAssociations(String name, ClusterCapacityProviderAssociationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterCapacityProviderAssociations(String name, ClusterCapacityProviderAssociationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:ClusterCapacityProviderAssociations", name, args == null ? ClusterCapacityProviderAssociationsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterCapacityProviderAssociations(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:ClusterCapacityProviderAssociations", name, null, makeResourceOptions(options, id));
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
    public static ClusterCapacityProviderAssociations get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterCapacityProviderAssociations(name, id, options);
    }
}
