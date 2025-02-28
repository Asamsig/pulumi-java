// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2InputDatasetArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2SmartReplyModelMetadataArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConversationModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConversationModelArgs Empty = new ConversationModelArgs();

    /**
     * Metadata for article suggestion models.
     * 
     */
    @Import(name="articleSuggestionModelMetadata")
    private @Nullable Output<GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs> articleSuggestionModelMetadata;

    /**
     * @return Metadata for article suggestion models.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs>> articleSuggestionModelMetadata() {
        return Optional.ofNullable(this.articleSuggestionModelMetadata);
    }

    /**
     * Datasets used to create model.
     * 
     */
    @Import(name="datasets", required=true)
    private Output<List<GoogleCloudDialogflowV2InputDatasetArgs>> datasets;

    /**
     * @return Datasets used to create model.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2InputDatasetArgs>> datasets() {
        return this.datasets;
    }

    /**
     * The display name of the model. At most 64 bytes long.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name of the model. At most 64 bytes long.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Language code for the conversation model. If not specified, the language is en-US. Language at ConversationModel should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return Language code for the conversation model. If not specified, the language is en-US. Language at ConversationModel should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * ConversationModel resource name. Format: `projects//conversationModels/`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return ConversationModel resource name. Format: `projects//conversationModels/`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Metadata for smart reply models.
     * 
     */
    @Import(name="smartReplyModelMetadata")
    private @Nullable Output<GoogleCloudDialogflowV2SmartReplyModelMetadataArgs> smartReplyModelMetadata;

    /**
     * @return Metadata for smart reply models.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2SmartReplyModelMetadataArgs>> smartReplyModelMetadata() {
        return Optional.ofNullable(this.smartReplyModelMetadata);
    }

    private ConversationModelArgs() {}

    private ConversationModelArgs(ConversationModelArgs $) {
        this.articleSuggestionModelMetadata = $.articleSuggestionModelMetadata;
        this.datasets = $.datasets;
        this.displayName = $.displayName;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.smartReplyModelMetadata = $.smartReplyModelMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConversationModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConversationModelArgs $;

        public Builder() {
            $ = new ConversationModelArgs();
        }

        public Builder(ConversationModelArgs defaults) {
            $ = new ConversationModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param articleSuggestionModelMetadata Metadata for article suggestion models.
         * 
         * @return builder
         * 
         */
        public Builder articleSuggestionModelMetadata(@Nullable Output<GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs> articleSuggestionModelMetadata) {
            $.articleSuggestionModelMetadata = articleSuggestionModelMetadata;
            return this;
        }

        /**
         * @param articleSuggestionModelMetadata Metadata for article suggestion models.
         * 
         * @return builder
         * 
         */
        public Builder articleSuggestionModelMetadata(GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs articleSuggestionModelMetadata) {
            return articleSuggestionModelMetadata(Output.of(articleSuggestionModelMetadata));
        }

        /**
         * @param datasets Datasets used to create model.
         * 
         * @return builder
         * 
         */
        public Builder datasets(Output<List<GoogleCloudDialogflowV2InputDatasetArgs>> datasets) {
            $.datasets = datasets;
            return this;
        }

        /**
         * @param datasets Datasets used to create model.
         * 
         * @return builder
         * 
         */
        public Builder datasets(List<GoogleCloudDialogflowV2InputDatasetArgs> datasets) {
            return datasets(Output.of(datasets));
        }

        /**
         * @param datasets Datasets used to create model.
         * 
         * @return builder
         * 
         */
        public Builder datasets(GoogleCloudDialogflowV2InputDatasetArgs... datasets) {
            return datasets(List.of(datasets));
        }

        /**
         * @param displayName The display name of the model. At most 64 bytes long.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the model. At most 64 bytes long.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param languageCode Language code for the conversation model. If not specified, the language is en-US. Language at ConversationModel should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode Language code for the conversation model. If not specified, the language is en-US. Language at ConversationModel should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name ConversationModel resource name. Format: `projects//conversationModels/`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name ConversationModel resource name. Format: `projects//conversationModels/`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param smartReplyModelMetadata Metadata for smart reply models.
         * 
         * @return builder
         * 
         */
        public Builder smartReplyModelMetadata(@Nullable Output<GoogleCloudDialogflowV2SmartReplyModelMetadataArgs> smartReplyModelMetadata) {
            $.smartReplyModelMetadata = smartReplyModelMetadata;
            return this;
        }

        /**
         * @param smartReplyModelMetadata Metadata for smart reply models.
         * 
         * @return builder
         * 
         */
        public Builder smartReplyModelMetadata(GoogleCloudDialogflowV2SmartReplyModelMetadataArgs smartReplyModelMetadata) {
            return smartReplyModelMetadata(Output.of(smartReplyModelMetadata));
        }

        public ConversationModelArgs build() {
            $.datasets = Objects.requireNonNull($.datasets, "expected parameter 'datasets' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
