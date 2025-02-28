// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class VideoFlagsResponse {
    /**
     * @return Value indicating whether or not the video can be streamed. Only &#34;archive&#34; type videos can be streamed.
     * 
     */
    private final Boolean canStream;
    /**
     * @return Value indicating whether or not there has ever been data recorded or uploaded into the video. Newly created videos have this value set to false.
     * 
     */
    private final Boolean hasData;
    /**
     * @return Value indicating whether or not the video is currently being referenced be an active live pipeline. The fact that is being referenced, doesn&#39;t necessarily indicate that data is being received. For example, video recording may be gated on events or camera may not be accessible at the time.
     * 
     */
    private final Boolean isRecording;

    @CustomType.Constructor
    private VideoFlagsResponse(
        @CustomType.Parameter("canStream") Boolean canStream,
        @CustomType.Parameter("hasData") Boolean hasData,
        @CustomType.Parameter("isRecording") Boolean isRecording) {
        this.canStream = canStream;
        this.hasData = hasData;
        this.isRecording = isRecording;
    }

    /**
     * @return Value indicating whether or not the video can be streamed. Only &#34;archive&#34; type videos can be streamed.
     * 
     */
    public Boolean canStream() {
        return this.canStream;
    }
    /**
     * @return Value indicating whether or not there has ever been data recorded or uploaded into the video. Newly created videos have this value set to false.
     * 
     */
    public Boolean hasData() {
        return this.hasData;
    }
    /**
     * @return Value indicating whether or not the video is currently being referenced be an active live pipeline. The fact that is being referenced, doesn&#39;t necessarily indicate that data is being received. For example, video recording may be gated on events or camera may not be accessible at the time.
     * 
     */
    public Boolean isRecording() {
        return this.isRecording;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoFlagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canStream;
        private Boolean hasData;
        private Boolean isRecording;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoFlagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canStream = defaults.canStream;
    	      this.hasData = defaults.hasData;
    	      this.isRecording = defaults.isRecording;
        }

        public Builder canStream(Boolean canStream) {
            this.canStream = Objects.requireNonNull(canStream);
            return this;
        }
        public Builder hasData(Boolean hasData) {
            this.hasData = Objects.requireNonNull(hasData);
            return this;
        }
        public Builder isRecording(Boolean isRecording) {
            this.isRecording = Objects.requireNonNull(isRecording);
            return this;
        }        public VideoFlagsResponse build() {
            return new VideoFlagsResponse(canStream, hasData, isRecording);
        }
    }
}
