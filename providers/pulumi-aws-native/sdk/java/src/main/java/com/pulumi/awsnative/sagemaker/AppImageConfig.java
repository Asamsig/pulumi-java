// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.sagemaker.AppImageConfigArgs;
import com.pulumi.awsnative.sagemaker.outputs.AppImageConfigKernelGatewayImageConfig;
import com.pulumi.awsnative.sagemaker.outputs.AppImageConfigTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::AppImageConfig
 * 
 */
@ResourceType(type="aws-native:sagemaker:AppImageConfig")
public class AppImageConfig extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * 
     */
    @Export(name="appImageConfigArn", type=String.class, parameters={})
    private Output<String> appImageConfigArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppImageConfig.
     * 
     */
    public Output<String> appImageConfigArn() {
        return this.appImageConfigArn;
    }
    /**
     * The Name of the AppImageConfig.
     * 
     */
    @Export(name="appImageConfigName", type=String.class, parameters={})
    private Output<String> appImageConfigName;

    /**
     * @return The Name of the AppImageConfig.
     * 
     */
    public Output<String> appImageConfigName() {
        return this.appImageConfigName;
    }
    /**
     * The KernelGatewayImageConfig.
     * 
     */
    @Export(name="kernelGatewayImageConfig", type=AppImageConfigKernelGatewayImageConfig.class, parameters={})
    private Output</* @Nullable */ AppImageConfigKernelGatewayImageConfig> kernelGatewayImageConfig;

    /**
     * @return The KernelGatewayImageConfig.
     * 
     */
    public Output<Optional<AppImageConfigKernelGatewayImageConfig>> kernelGatewayImageConfig() {
        return Codegen.optional(this.kernelGatewayImageConfig);
    }
    /**
     * A list of tags to apply to the AppImageConfig.
     * 
     */
    @Export(name="tags", type=List.class, parameters={AppImageConfigTag.class})
    private Output</* @Nullable */ List<AppImageConfigTag>> tags;

    /**
     * @return A list of tags to apply to the AppImageConfig.
     * 
     */
    public Output<Optional<List<AppImageConfigTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppImageConfig(String name) {
        this(name, AppImageConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppImageConfig(String name, @Nullable AppImageConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppImageConfig(String name, @Nullable AppImageConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:AppImageConfig", name, args == null ? AppImageConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppImageConfig(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:AppImageConfig", name, null, makeResourceOptions(options, id));
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
    public static AppImageConfig get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppImageConfig(name, id, options);
    }
}
