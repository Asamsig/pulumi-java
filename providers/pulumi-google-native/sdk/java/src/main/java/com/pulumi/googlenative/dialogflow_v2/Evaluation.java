// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow_v2.EvaluationArgs;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2EvaluationConfigResponse;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2SmartReplyMetricsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates evaluation of a conversation model.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2:Evaluation")
public class Evaluation extends com.pulumi.resources.CustomResource {
    /**
     * Creation time of this model.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation time of this model.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. The display name of the model evaluation. At most 64 bytes long.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. The display name of the model evaluation. At most 64 bytes long.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Optional. The configuration of the evaluation task.
     * 
     */
    @Export(name="evaluationConfig", type=GoogleCloudDialogflowV2EvaluationConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2EvaluationConfigResponse> evaluationConfig;

    /**
     * @return Optional. The configuration of the evaluation task.
     * 
     */
    public Output<GoogleCloudDialogflowV2EvaluationConfigResponse> evaluationConfig() {
        return this.evaluationConfig;
    }
    /**
     * The resource name of the evaluation. Format: `projects//conversationModels//evaluations/`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the evaluation. Format: `projects//conversationModels//evaluations/`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Only available when model is for smart reply.
     * 
     */
    @Export(name="smartReplyMetrics", type=GoogleCloudDialogflowV2SmartReplyMetricsResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2SmartReplyMetricsResponse> smartReplyMetrics;

    /**
     * @return Only available when model is for smart reply.
     * 
     */
    public Output<GoogleCloudDialogflowV2SmartReplyMetricsResponse> smartReplyMetrics() {
        return this.smartReplyMetrics;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Evaluation(String name) {
        this(name, EvaluationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Evaluation(String name, EvaluationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Evaluation(String name, EvaluationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Evaluation", name, args == null ? EvaluationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Evaluation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Evaluation", name, null, makeResourceOptions(options, id));
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
    public static Evaluation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Evaluation(name, id, options);
    }
}
