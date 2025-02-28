// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate_v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.translate_v3beta1.GlossaryArgs;
import com.pulumi.googlenative.translate_v3beta1.outputs.GlossaryInputConfigResponse;
import com.pulumi.googlenative.translate_v3beta1.outputs.LanguageCodePairResponse;
import com.pulumi.googlenative.translate_v3beta1.outputs.LanguageCodesSetResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a glossary and returns the long-running operation. Returns NOT_FOUND, if the project doesn&#39;t exist.
 * 
 */
@ResourceType(type="google-native:translate/v3beta1:Glossary")
public class Glossary extends com.pulumi.resources.CustomResource {
    /**
     * When the glossary creation was finished.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return When the glossary creation was finished.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * The number of entries defined in the glossary.
     * 
     */
    @Export(name="entryCount", type=Integer.class, parameters={})
    private Output<Integer> entryCount;

    /**
     * @return The number of entries defined in the glossary.
     * 
     */
    public Output<Integer> entryCount() {
        return this.entryCount;
    }
    /**
     * Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints.
     * 
     */
    @Export(name="inputConfig", type=GlossaryInputConfigResponse.class, parameters={})
    private Output<GlossaryInputConfigResponse> inputConfig;

    /**
     * @return Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints.
     * 
     */
    public Output<GlossaryInputConfigResponse> inputConfig() {
        return this.inputConfig;
    }
    /**
     * Used with equivalent term set glossaries.
     * 
     */
    @Export(name="languageCodesSet", type=LanguageCodesSetResponse.class, parameters={})
    private Output<LanguageCodesSetResponse> languageCodesSet;

    /**
     * @return Used with equivalent term set glossaries.
     * 
     */
    public Output<LanguageCodesSetResponse> languageCodesSet() {
        return this.languageCodesSet;
    }
    /**
     * Used with unidirectional glossaries.
     * 
     */
    @Export(name="languagePair", type=LanguageCodePairResponse.class, parameters={})
    private Output<LanguageCodePairResponse> languagePair;

    /**
     * @return Used with unidirectional glossaries.
     * 
     */
    public Output<LanguageCodePairResponse> languagePair() {
        return this.languagePair;
    }
    /**
     * The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * When CreateGlossary was called.
     * 
     */
    @Export(name="submitTime", type=String.class, parameters={})
    private Output<String> submitTime;

    /**
     * @return When CreateGlossary was called.
     * 
     */
    public Output<String> submitTime() {
        return this.submitTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Glossary(String name) {
        this(name, GlossaryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Glossary(String name, GlossaryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Glossary(String name, GlossaryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:translate/v3beta1:Glossary", name, args == null ? GlossaryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Glossary(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:translate/v3beta1:Glossary", name, null, makeResourceOptions(options, id));
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
    public static Glossary get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Glossary(name, id, options);
    }
}
