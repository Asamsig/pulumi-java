// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ses;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ses.TemplateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SES::Template
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ses:Template")
public class Template extends com.pulumi.resources.CustomResource {
    @Export(name="template", type=com.pulumi.awsnative.ses.outputs.Template.class, parameters={})
    private Output</* @Nullable */ com.pulumi.awsnative.ses.outputs.Template> template;

    public Output<Optional<com.pulumi.awsnative.ses.outputs.Template>> template() {
        return Codegen.optional(this.template);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Template(String name) {
        this(name, TemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Template(String name, @Nullable TemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Template(String name, @Nullable TemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ses:Template", name, args == null ? TemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Template(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ses:Template", name, null, makeResourceOptions(options, id));
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
    public static Template get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Template(name, id, options);
    }
}
