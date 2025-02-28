// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ec2.TransitGatewayVpcAttachmentArgs;
import com.pulumi.awsnative.ec2.outputs.OptionsProperties;
import com.pulumi.awsnative.ec2.outputs.TransitGatewayVpcAttachmentTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::TransitGatewayVpcAttachment
 * 
 */
@ResourceType(type="aws-native:ec2:TransitGatewayVpcAttachment")
public class TransitGatewayVpcAttachment extends com.pulumi.resources.CustomResource {
    @Export(name="addSubnetIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> addSubnetIds;

    public Output<Optional<List<String>>> addSubnetIds() {
        return Codegen.optional(this.addSubnetIds);
    }
    /**
     * The options for the transit gateway vpc attachment.
     * 
     */
    @Export(name="options", type=OptionsProperties.class, parameters={})
    private Output</* @Nullable */ OptionsProperties> options;

    /**
     * @return The options for the transit gateway vpc attachment.
     * 
     */
    public Output<Optional<OptionsProperties>> options() {
        return Codegen.optional(this.options);
    }
    @Export(name="removeSubnetIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> removeSubnetIds;

    public Output<Optional<List<String>>> removeSubnetIds() {
        return Codegen.optional(this.removeSubnetIds);
    }
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    @Export(name="tags", type=List.class, parameters={TransitGatewayVpcAttachmentTag.class})
    private Output</* @Nullable */ List<TransitGatewayVpcAttachmentTag>> tags;

    public Output<Optional<List<TransitGatewayVpcAttachmentTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="transitGatewayId", type=String.class, parameters={})
    private Output<String> transitGatewayId;

    public Output<String> transitGatewayId() {
        return this.transitGatewayId;
    }
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayVpcAttachment(String name) {
        this(name, TransitGatewayVpcAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayVpcAttachment(String name, TransitGatewayVpcAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayVpcAttachment(String name, TransitGatewayVpcAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayVpcAttachment", name, args == null ? TransitGatewayVpcAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGatewayVpcAttachment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayVpcAttachment", name, null, makeResourceOptions(options, id));
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
    public static TransitGatewayVpcAttachment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayVpcAttachment(name, id, options);
    }
}
