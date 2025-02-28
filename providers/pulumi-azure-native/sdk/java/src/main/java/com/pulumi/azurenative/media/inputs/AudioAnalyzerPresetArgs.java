// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.AudioAnalysisMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Audio Analyzer preset applies a pre-defined set of AI-based analysis operations, including speech transcription. Currently, the preset supports processing of content with a single audio track.
 * 
 */
public final class AudioAnalyzerPresetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AudioAnalyzerPresetArgs Empty = new AudioAnalyzerPresetArgs();

    /**
     * The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;).  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
     * 
     */
    @Import(name="audioLanguage")
    private @Nullable Output<String> audioLanguage;

    /**
     * @return The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;).  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
     * 
     */
    public Optional<Output<String>> audioLanguage() {
        return Optional.ofNullable(this.audioLanguage);
    }

    /**
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    @Import(name="experimentalOptions")
    private @Nullable Output<Map<String,String>> experimentalOptions;

    /**
     * @return Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    public Optional<Output<Map<String,String>>> experimentalOptions() {
        return Optional.ofNullable(this.experimentalOptions);
    }

    /**
     * Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Either<String,AudioAnalysisMode>> mode;

    /**
     * @return Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
     * 
     */
    public Optional<Output<Either<String,AudioAnalysisMode>>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.AudioAnalyzerPreset&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.AudioAnalyzerPreset&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private AudioAnalyzerPresetArgs() {}

    private AudioAnalyzerPresetArgs(AudioAnalyzerPresetArgs $) {
        this.audioLanguage = $.audioLanguage;
        this.experimentalOptions = $.experimentalOptions;
        this.mode = $.mode;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AudioAnalyzerPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AudioAnalyzerPresetArgs $;

        public Builder() {
            $ = new AudioAnalyzerPresetArgs();
        }

        public Builder(AudioAnalyzerPresetArgs defaults) {
            $ = new AudioAnalyzerPresetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioLanguage The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;).  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
         * 
         * @return builder
         * 
         */
        public Builder audioLanguage(@Nullable Output<String> audioLanguage) {
            $.audioLanguage = audioLanguage;
            return this;
        }

        /**
         * @param audioLanguage The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;).  If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463
         * 
         * @return builder
         * 
         */
        public Builder audioLanguage(String audioLanguage) {
            return audioLanguage(Output.of(audioLanguage));
        }

        /**
         * @param experimentalOptions Dictionary containing key value pairs for parameters not exposed in the preset itself
         * 
         * @return builder
         * 
         */
        public Builder experimentalOptions(@Nullable Output<Map<String,String>> experimentalOptions) {
            $.experimentalOptions = experimentalOptions;
            return this;
        }

        /**
         * @param experimentalOptions Dictionary containing key value pairs for parameters not exposed in the preset itself
         * 
         * @return builder
         * 
         */
        public Builder experimentalOptions(Map<String,String> experimentalOptions) {
            return experimentalOptions(Output.of(experimentalOptions));
        }

        /**
         * @param mode Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Either<String,AudioAnalysisMode>> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
         * 
         * @return builder
         * 
         */
        public Builder mode(Either<String,AudioAnalysisMode> mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param mode Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Either.ofLeft(mode));
        }

        /**
         * @param mode Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode would be chosen.
         * 
         * @return builder
         * 
         */
        public Builder mode(AudioAnalysisMode mode) {
            return mode(Either.ofRight(mode));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.AudioAnalyzerPreset&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.AudioAnalyzerPreset&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public AudioAnalyzerPresetArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
