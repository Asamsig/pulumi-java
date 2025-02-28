// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the natural speech audio to be processed.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1AudioInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1AudioInputArgs Empty = new GoogleCloudDialogflowCxV3beta1AudioInputArgs();

    /**
     * The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
     * 
     */
    @Import(name="audio")
    private @Nullable Output<String> audio;

    /**
     * @return The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
     * 
     */
    public Optional<Output<String>> audio() {
        return Optional.ofNullable(this.audio);
    }

    /**
     * Instructs the speech recognizer how to process the speech audio.
     * 
     */
    @Import(name="config", required=true)
    private Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs> config;

    /**
     * @return Instructs the speech recognizer how to process the speech audio.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs> config() {
        return this.config;
    }

    private GoogleCloudDialogflowCxV3beta1AudioInputArgs() {}

    private GoogleCloudDialogflowCxV3beta1AudioInputArgs(GoogleCloudDialogflowCxV3beta1AudioInputArgs $) {
        this.audio = $.audio;
        this.config = $.config;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1AudioInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1AudioInputArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1AudioInputArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1AudioInputArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1AudioInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audio The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
         * 
         * @return builder
         * 
         */
        public Builder audio(@Nullable Output<String> audio) {
            $.audio = audio;
            return this;
        }

        /**
         * @param audio The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
         * 
         * @return builder
         * 
         */
        public Builder audio(String audio) {
            return audio(Output.of(audio));
        }

        /**
         * @param config Instructs the speech recognizer how to process the speech audio.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Instructs the speech recognizer how to process the speech audio.
         * 
         * @return builder
         * 
         */
        public Builder config(GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs config) {
            return config(Output.of(config));
        }

        public GoogleCloudDialogflowCxV3beta1AudioInputArgs build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            return $;
        }
    }

}
