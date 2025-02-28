// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Config for suggestion query.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs();

    /**
     * Confidence threshold of query result. Agent Assist gives each suggestion a score in the range [0.0, 1.0], based on the relevance between the suggestion and the current conversation context. A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with a score greater than or equal to the value of this field are included in the results. For a baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom model, there is no recommended value. Tune this value by starting from a very low value and slowly increasing until you have desired results. If this field is not set, it defaults to 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION, FAQ, SMART_REPLY, SMART_COMPOSE.
     * 
     */
    @Import(name="confidenceThreshold")
    private @Nullable Output<Double> confidenceThreshold;

    /**
     * @return Confidence threshold of query result. Agent Assist gives each suggestion a score in the range [0.0, 1.0], based on the relevance between the suggestion and the current conversation context. A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with a score greater than or equal to the value of this field are included in the results. For a baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom model, there is no recommended value. Tune this value by starting from a very low value and slowly increasing until you have desired results. If this field is not set, it defaults to 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION, FAQ, SMART_REPLY, SMART_COMPOSE.
     * 
     */
    public Optional<Output<Double>> confidenceThreshold() {
        return Optional.ofNullable(this.confidenceThreshold);
    }

    /**
     * Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
     * 
     */
    @Import(name="contextFilterSettings")
    private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs> contextFilterSettings;

    /**
     * @return Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs>> contextFilterSettings() {
        return Optional.ofNullable(this.contextFilterSettings);
    }

    /**
     * Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
     * 
     */
    @Import(name="dialogflowQuerySource")
    private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs> dialogflowQuerySource;

    /**
     * @return Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs>> dialogflowQuerySource() {
        return Optional.ofNullable(this.dialogflowQuerySource);
    }

    /**
     * Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
     * 
     */
    @Import(name="documentQuerySource")
    private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs> documentQuerySource;

    /**
     * @return Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs>> documentQuerySource() {
        return Optional.ofNullable(this.documentQuerySource);
    }

    /**
     * Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
     * 
     */
    @Import(name="knowledgeBaseQuerySource")
    private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs> knowledgeBaseQuerySource;

    /**
     * @return Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs>> knowledgeBaseQuerySource() {
        return Optional.ofNullable(this.knowledgeBaseQuerySource);
    }

    /**
     * Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is 20.
     * 
     */
    @Import(name="maxResults")
    private @Nullable Output<Integer> maxResults;

    /**
     * @return Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is 20.
     * 
     */
    public Optional<Output<Integer>> maxResults() {
        return Optional.ofNullable(this.maxResults);
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs() {}

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs $) {
        this.confidenceThreshold = $.confidenceThreshold;
        this.contextFilterSettings = $.contextFilterSettings;
        this.dialogflowQuerySource = $.dialogflowQuerySource;
        this.documentQuerySource = $.documentQuerySource;
        this.knowledgeBaseQuerySource = $.knowledgeBaseQuerySource;
        this.maxResults = $.maxResults;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param confidenceThreshold Confidence threshold of query result. Agent Assist gives each suggestion a score in the range [0.0, 1.0], based on the relevance between the suggestion and the current conversation context. A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with a score greater than or equal to the value of this field are included in the results. For a baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom model, there is no recommended value. Tune this value by starting from a very low value and slowly increasing until you have desired results. If this field is not set, it defaults to 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION, FAQ, SMART_REPLY, SMART_COMPOSE.
         * 
         * @return builder
         * 
         */
        public Builder confidenceThreshold(@Nullable Output<Double> confidenceThreshold) {
            $.confidenceThreshold = confidenceThreshold;
            return this;
        }

        /**
         * @param confidenceThreshold Confidence threshold of query result. Agent Assist gives each suggestion a score in the range [0.0, 1.0], based on the relevance between the suggestion and the current conversation context. A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with a score greater than or equal to the value of this field are included in the results. For a baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom model, there is no recommended value. Tune this value by starting from a very low value and slowly increasing until you have desired results. If this field is not set, it defaults to 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION, FAQ, SMART_REPLY, SMART_COMPOSE.
         * 
         * @return builder
         * 
         */
        public Builder confidenceThreshold(Double confidenceThreshold) {
            return confidenceThreshold(Output.of(confidenceThreshold));
        }

        /**
         * @param contextFilterSettings Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
         * 
         * @return builder
         * 
         */
        public Builder contextFilterSettings(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs> contextFilterSettings) {
            $.contextFilterSettings = contextFilterSettings;
            return this;
        }

        /**
         * @param contextFilterSettings Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
         * 
         * @return builder
         * 
         */
        public Builder contextFilterSettings(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs contextFilterSettings) {
            return contextFilterSettings(Output.of(contextFilterSettings));
        }

        /**
         * @param dialogflowQuerySource Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
         * 
         * @return builder
         * 
         */
        public Builder dialogflowQuerySource(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs> dialogflowQuerySource) {
            $.dialogflowQuerySource = dialogflowQuerySource;
            return this;
        }

        /**
         * @param dialogflowQuerySource Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
         * 
         * @return builder
         * 
         */
        public Builder dialogflowQuerySource(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs dialogflowQuerySource) {
            return dialogflowQuerySource(Output.of(dialogflowQuerySource));
        }

        /**
         * @param documentQuerySource Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
         * 
         * @return builder
         * 
         */
        public Builder documentQuerySource(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs> documentQuerySource) {
            $.documentQuerySource = documentQuerySource;
            return this;
        }

        /**
         * @param documentQuerySource Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
         * 
         * @return builder
         * 
         */
        public Builder documentQuerySource(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs documentQuerySource) {
            return documentQuerySource(Output.of(documentQuerySource));
        }

        /**
         * @param knowledgeBaseQuerySource Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
         * 
         * @return builder
         * 
         */
        public Builder knowledgeBaseQuerySource(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs> knowledgeBaseQuerySource) {
            $.knowledgeBaseQuerySource = knowledgeBaseQuerySource;
            return this;
        }

        /**
         * @param knowledgeBaseQuerySource Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
         * 
         * @return builder
         * 
         */
        public Builder knowledgeBaseQuerySource(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs knowledgeBaseQuerySource) {
            return knowledgeBaseQuerySource(Output.of(knowledgeBaseQuerySource));
        }

        /**
         * @param maxResults Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is 20.
         * 
         * @return builder
         * 
         */
        public Builder maxResults(@Nullable Output<Integer> maxResults) {
            $.maxResults = maxResults;
            return this;
        }

        /**
         * @param maxResults Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is 20.
         * 
         * @return builder
         * 
         */
        public Builder maxResults(Integer maxResults) {
            return maxResults(Output.of(maxResults));
        }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs build() {
            return $;
        }
    }

}
