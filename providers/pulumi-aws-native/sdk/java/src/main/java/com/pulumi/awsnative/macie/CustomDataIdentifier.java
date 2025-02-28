// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.macie;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.macie.CustomDataIdentifierArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Macie CustomDataIdentifier resource schema
 * 
 */
@ResourceType(type="aws-native:macie:CustomDataIdentifier")
public class CustomDataIdentifier extends com.pulumi.resources.CustomResource {
    /**
     * Custom data identifier ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Custom data identifier ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of custom data identifier.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of custom data identifier.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Words to be ignored.
     * 
     */
    @Export(name="ignoreWords", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ignoreWords;

    /**
     * @return Words to be ignored.
     * 
     */
    public Output<Optional<List<String>>> ignoreWords() {
        return Codegen.optional(this.ignoreWords);
    }
    /**
     * Keywords to be matched against.
     * 
     */
    @Export(name="keywords", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> keywords;

    /**
     * @return Keywords to be matched against.
     * 
     */
    public Output<Optional<List<String>>> keywords() {
        return Codegen.optional(this.keywords);
    }
    /**
     * Maximum match distance.
     * 
     */
    @Export(name="maximumMatchDistance", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumMatchDistance;

    /**
     * @return Maximum match distance.
     * 
     */
    public Output<Optional<Integer>> maximumMatchDistance() {
        return Codegen.optional(this.maximumMatchDistance);
    }
    /**
     * Name of custom data identifier.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of custom data identifier.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Regular expression for custom data identifier.
     * 
     */
    @Export(name="regex", type=String.class, parameters={})
    private Output<String> regex;

    /**
     * @return Regular expression for custom data identifier.
     * 
     */
    public Output<String> regex() {
        return this.regex;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomDataIdentifier(String name) {
        this(name, CustomDataIdentifierArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDataIdentifier(String name, CustomDataIdentifierArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDataIdentifier(String name, CustomDataIdentifierArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:macie:CustomDataIdentifier", name, args == null ? CustomDataIdentifierArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomDataIdentifier(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:macie:CustomDataIdentifier", name, null, makeResourceOptions(options, id));
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
    public static CustomDataIdentifier get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomDataIdentifier(name, id, options);
    }
}
