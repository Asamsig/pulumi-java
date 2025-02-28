// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1AudioInputResponse {
    /**
     * @return The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
     * 
     */
    private final String audio;
    /**
     * @return Instructs the speech recognizer how to process the speech audio.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse config;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1AudioInputResponse(
        @CustomType.Parameter("audio") String audio,
        @CustomType.Parameter("config") GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse config) {
        this.audio = audio;
        this.config = config;
    }

    /**
     * @return The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
     * 
     */
    public String audio() {
        return this.audio;
    }
    /**
     * @return Instructs the speech recognizer how to process the speech audio.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse config() {
        return this.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1AudioInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audio;
        private GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse config;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1AudioInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.config = defaults.config;
        }

        public Builder audio(String audio) {
            this.audio = Objects.requireNonNull(audio);
            return this;
        }
        public Builder config(GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1AudioInputResponse build() {
            return new GoogleCloudDialogflowCxV3beta1AudioInputResponse(audio, config);
        }
    }
}
