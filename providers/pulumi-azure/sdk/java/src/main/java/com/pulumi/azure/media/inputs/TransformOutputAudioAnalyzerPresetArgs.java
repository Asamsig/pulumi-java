// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransformOutputAudioAnalyzerPresetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransformOutputAudioAnalyzerPresetArgs Empty = new TransformOutputAudioAnalyzerPresetArgs();

    /**
     * Possibles value are `Basic` or `Standard`. Determines the set of audio analysis operations to be performed.
     * 
     */
    @Import(name="audioAnalysisMode")
    private @Nullable Output<String> audioAnalysisMode;

    /**
     * @return Possibles value are `Basic` or `Standard`. Determines the set of audio analysis operations to be performed.
     * 
     */
    public Optional<Output<String>> audioAnalysisMode() {
        return Optional.ofNullable(this.audioAnalysisMode);
    }

    /**
     * The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;). If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode:Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernible speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463.
     * 
     */
    @Import(name="audioLanguage")
    private @Nullable Output<String> audioLanguage;

    /**
     * @return The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;). If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode:Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernible speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463.
     * 
     */
    public Optional<Output<String>> audioLanguage() {
        return Optional.ofNullable(this.audioLanguage);
    }

    private TransformOutputAudioAnalyzerPresetArgs() {}

    private TransformOutputAudioAnalyzerPresetArgs(TransformOutputAudioAnalyzerPresetArgs $) {
        this.audioAnalysisMode = $.audioAnalysisMode;
        this.audioLanguage = $.audioLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransformOutputAudioAnalyzerPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransformOutputAudioAnalyzerPresetArgs $;

        public Builder() {
            $ = new TransformOutputAudioAnalyzerPresetArgs();
        }

        public Builder(TransformOutputAudioAnalyzerPresetArgs defaults) {
            $ = new TransformOutputAudioAnalyzerPresetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioAnalysisMode Possibles value are `Basic` or `Standard`. Determines the set of audio analysis operations to be performed.
         * 
         * @return builder
         * 
         */
        public Builder audioAnalysisMode(@Nullable Output<String> audioAnalysisMode) {
            $.audioAnalysisMode = audioAnalysisMode;
            return this;
        }

        /**
         * @param audioAnalysisMode Possibles value are `Basic` or `Standard`. Determines the set of audio analysis operations to be performed.
         * 
         * @return builder
         * 
         */
        public Builder audioAnalysisMode(String audioAnalysisMode) {
            return audioAnalysisMode(Output.of(audioAnalysisMode));
        }

        /**
         * @param audioLanguage The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;). If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode:Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernible speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463.
         * 
         * @return builder
         * 
         */
        public Builder audioLanguage(@Nullable Output<String> audioLanguage) {
            $.audioLanguage = audioLanguage;
            return this;
        }

        /**
         * @param audioLanguage The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;). If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode:Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernible speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463.
         * 
         * @return builder
         * 
         */
        public Builder audioLanguage(String audioLanguage) {
            return audioLanguage(Output.of(audioLanguage));
        }

        public TransformOutputAudioAnalyzerPresetArgs build() {
            return $;
        }
    }

}
