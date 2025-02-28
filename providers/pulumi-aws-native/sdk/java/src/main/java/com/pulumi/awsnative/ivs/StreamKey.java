// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ivs.StreamKeyArgs;
import com.pulumi.awsnative.ivs.outputs.StreamKeyTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IVS::StreamKey
 * 
 */
@ResourceType(type="aws-native:ivs:StreamKey")
public class StreamKey extends com.pulumi.resources.CustomResource {
    /**
     * Stream Key ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Stream Key ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Channel ARN for the stream.
     * 
     */
    @Export(name="channelArn", type=String.class, parameters={})
    private Output<String> channelArn;

    /**
     * @return Channel ARN for the stream.
     * 
     */
    public Output<String> channelArn() {
        return this.channelArn;
    }
    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @Export(name="tags", type=List.class, parameters={StreamKeyTag.class})
    private Output</* @Nullable */ List<StreamKeyTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public Output<Optional<List<StreamKeyTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Stream-key value.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Stream-key value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamKey(String name) {
        this(name, StreamKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamKey(String name, StreamKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamKey(String name, StreamKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:StreamKey", name, args == null ? StreamKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StreamKey(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ivs:StreamKey", name, null, makeResourceOptions(options, id));
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
    public static StreamKey get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StreamKey(name, id, options);
    }
}
