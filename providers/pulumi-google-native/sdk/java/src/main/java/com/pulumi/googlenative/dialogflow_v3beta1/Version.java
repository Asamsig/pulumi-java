// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow_v3beta1.VersionArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1NluSettingsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a Version in the specified Flow. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: CreateVersionOperationMetadata - `response`: Version
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:Version")
public class Version extends com.pulumi.resources.CustomResource {
    /**
     * Create time of the version.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Create time of the version.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the version. Limit of 64 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The NLU settings of the flow at version creation.
     * 
     */
    @Export(name="nluSettings", type=GoogleCloudDialogflowCxV3beta1NluSettingsResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1NluSettingsResponse> nluSettings;

    /**
     * @return The NLU settings of the flow at version creation.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1NluSettingsResponse> nluSettings() {
        return this.nluSettings;
    }
    /**
     * The state of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of this version. This field is read-only and cannot be set by create and update methods.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Version(String name) {
        this(name, VersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Version(String name, VersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Version(String name, VersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Version", name, args == null ? VersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Version(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Version", name, null, makeResourceOptions(options, id));
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
    public static Version get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Version(name, id, options);
    }
}
