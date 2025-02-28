// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.OutputFileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties for generating an MPEG-2 Transport Stream (ISO/IEC 13818-1) output video file(s).
 * 
 */
public final class TransportStreamFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransportStreamFormatArgs Empty = new TransportStreamFormatArgs();

    /**
     * The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    @Import(name="filenamePattern", required=true)
    private Output<String> filenamePattern;

    /**
     * @return The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    public Output<String> filenamePattern() {
        return this.filenamePattern;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.TransportStreamFormat&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.TransportStreamFormat&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
     * 
     */
    @Import(name="outputFiles")
    private @Nullable Output<List<OutputFileArgs>> outputFiles;

    /**
     * @return The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
     * 
     */
    public Optional<Output<List<OutputFileArgs>>> outputFiles() {
        return Optional.ofNullable(this.outputFiles);
    }

    private TransportStreamFormatArgs() {}

    private TransportStreamFormatArgs(TransportStreamFormatArgs $) {
        this.filenamePattern = $.filenamePattern;
        this.odataType = $.odataType;
        this.outputFiles = $.outputFiles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransportStreamFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransportStreamFormatArgs $;

        public Builder() {
            $ = new TransportStreamFormatArgs();
        }

        public Builder(TransportStreamFormatArgs defaults) {
            $ = new TransportStreamFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filenamePattern The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
         * 
         * @return builder
         * 
         */
        public Builder filenamePattern(Output<String> filenamePattern) {
            $.filenamePattern = filenamePattern;
            return this;
        }

        /**
         * @param filenamePattern The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
         * 
         * @return builder
         * 
         */
        public Builder filenamePattern(String filenamePattern) {
            return filenamePattern(Output.of(filenamePattern));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.TransportStreamFormat&#39;.
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
         * Expected value is &#39;#Microsoft.Media.TransportStreamFormat&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param outputFiles The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
         * 
         * @return builder
         * 
         */
        public Builder outputFiles(@Nullable Output<List<OutputFileArgs>> outputFiles) {
            $.outputFiles = outputFiles;
            return this;
        }

        /**
         * @param outputFiles The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
         * 
         * @return builder
         * 
         */
        public Builder outputFiles(List<OutputFileArgs> outputFiles) {
            return outputFiles(Output.of(outputFiles));
        }

        /**
         * @param outputFiles The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
         * 
         * @return builder
         * 
         */
        public Builder outputFiles(OutputFileArgs... outputFiles) {
            return outputFiles(List.of(outputFiles));
        }

        public TransportStreamFormatArgs build() {
            $.filenamePattern = Objects.requireNonNull($.filenamePattern, "expected parameter 'filenamePattern' to be non-null");
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
