// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Document source settings. Supported features: SMART_REPLY, SMART_COMPOSE.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs();

    /**
     * Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, at most 5 documents are supported.
     * 
     */
    @Import(name="documents", required=true)
    private Output<List<String>> documents;

    /**
     * @return Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, at most 5 documents are supported.
     * 
     */
    public Output<List<String>> documents() {
        return this.documents;
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs() {}

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs $) {
        this.documents = $.documents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs();
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs defaults) {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param documents Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, at most 5 documents are supported.
         * 
         * @return builder
         * 
         */
        public Builder documents(Output<List<String>> documents) {
            $.documents = documents;
            return this;
        }

        /**
         * @param documents Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, at most 5 documents are supported.
         * 
         * @return builder
         * 
         */
        public Builder documents(List<String> documents) {
            return documents(Output.of(documents));
        }

        /**
         * @param documents Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, at most 5 documents are supported.
         * 
         * @return builder
         * 
         */
        public Builder documents(String... documents) {
            return documents(List.of(documents));
        }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs build() {
            $.documents = Objects.requireNonNull($.documents, "expected parameter 'documents' to be non-null");
            return $;
        }
    }

}
