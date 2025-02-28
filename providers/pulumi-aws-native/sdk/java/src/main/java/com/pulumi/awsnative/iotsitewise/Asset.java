// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotsitewise.AssetArgs;
import com.pulumi.awsnative.iotsitewise.outputs.AssetHierarchy;
import com.pulumi.awsnative.iotsitewise.outputs.AssetProperty;
import com.pulumi.awsnative.iotsitewise.outputs.AssetTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::IoTSiteWise::Asset
 * 
 */
@ResourceType(type="aws-native:iotsitewise:Asset")
public class Asset extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the asset
     * 
     */
    @Export(name="assetArn", type=String.class, parameters={})
    private Output<String> assetArn;

    /**
     * @return The ARN of the asset
     * 
     */
    public Output<String> assetArn() {
        return this.assetArn;
    }
    @Export(name="assetHierarchies", type=List.class, parameters={AssetHierarchy.class})
    private Output</* @Nullable */ List<AssetHierarchy>> assetHierarchies;

    public Output<Optional<List<AssetHierarchy>>> assetHierarchies() {
        return Codegen.optional(this.assetHierarchies);
    }
    /**
     * The ID of the asset
     * 
     */
    @Export(name="assetId", type=String.class, parameters={})
    private Output<String> assetId;

    /**
     * @return The ID of the asset
     * 
     */
    public Output<String> assetId() {
        return this.assetId;
    }
    /**
     * The ID of the asset model from which to create the asset.
     * 
     */
    @Export(name="assetModelId", type=String.class, parameters={})
    private Output<String> assetModelId;

    /**
     * @return The ID of the asset model from which to create the asset.
     * 
     */
    public Output<String> assetModelId() {
        return this.assetModelId;
    }
    /**
     * A unique, friendly name for the asset.
     * 
     */
    @Export(name="assetName", type=String.class, parameters={})
    private Output<String> assetName;

    /**
     * @return A unique, friendly name for the asset.
     * 
     */
    public Output<String> assetName() {
        return this.assetName;
    }
    @Export(name="assetProperties", type=List.class, parameters={AssetProperty.class})
    private Output</* @Nullable */ List<AssetProperty>> assetProperties;

    public Output<Optional<List<AssetProperty>>> assetProperties() {
        return Codegen.optional(this.assetProperties);
    }
    /**
     * A list of key-value pairs that contain metadata for the asset.
     * 
     */
    @Export(name="tags", type=List.class, parameters={AssetTag.class})
    private Output</* @Nullable */ List<AssetTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset.
     * 
     */
    public Output<Optional<List<AssetTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Asset(String name) {
        this(name, AssetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Asset(String name, AssetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Asset(String name, AssetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Asset", name, args == null ? AssetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Asset(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Asset", name, null, makeResourceOptions(options, id));
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
    public static Asset get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Asset(name, id, options);
    }
}
