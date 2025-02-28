// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import com.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdMarkers;
import com.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdTriggersItem;
import com.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestPlaylistType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A HTTP Live Streaming (HLS) manifest configuration.
 * 
 */
public final class OriginEndpointHlsManifestArgs extends com.pulumi.resources.ResourceArgs {

    public static final OriginEndpointHlsManifestArgs Empty = new OriginEndpointHlsManifestArgs();

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. &#34;NONE&#34; will omit all SCTE-35 ad markers from the output. &#34;PASSTHROUGH&#34; causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. &#34;SCTE35_ENHANCED&#34; generates ad markers and blackout tags based on SCTE-35 messages in the input source. &#34;DATERANGE&#34; inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
     */
    @Import(name="adMarkers")
    private @Nullable Output<OriginEndpointHlsManifestAdMarkers> adMarkers;

    /**
     * @return This setting controls how ad markers are included in the packaged OriginEndpoint. &#34;NONE&#34; will omit all SCTE-35 ad markers from the output. &#34;PASSTHROUGH&#34; causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. &#34;SCTE35_ENHANCED&#34; generates ad markers and blackout tags based on SCTE-35 messages in the input source. &#34;DATERANGE&#34; inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
     */
    public Optional<Output<OriginEndpointHlsManifestAdMarkers>> adMarkers() {
        return Optional.ofNullable(this.adMarkers);
    }

    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    @Import(name="adTriggers")
    private @Nullable Output<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers;

    /**
     * @return A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    public Optional<Output<List<OriginEndpointHlsManifestAdTriggersItem>>> adTriggers() {
        return Optional.ofNullable(this.adTriggers);
    }

    @Import(name="adsOnDeliveryRestrictions")
    private @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;

    public Optional<Output<OriginEndpointAdsOnDeliveryRestrictions>> adsOnDeliveryRestrictions() {
        return Optional.ofNullable(this.adsOnDeliveryRestrictions);
    }

    /**
     * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    @Import(name="includeIframeOnlyStream")
    private @Nullable Output<Boolean> includeIframeOnlyStream;

    /**
     * @return When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    public Optional<Output<Boolean>> includeIframeOnlyStream() {
        return Optional.ofNullable(this.includeIframeOnlyStream);
    }

    /**
     * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
     * 
     */
    @Import(name="manifestName")
    private @Nullable Output<String> manifestName;

    /**
     * @return An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
     * 
     */
    public Optional<Output<String>> manifestName() {
        return Optional.ofNullable(this.manifestName);
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either &#34;EVENT&#34; or &#34;VOD&#34; is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     */
    @Import(name="playlistType")
    private @Nullable Output<OriginEndpointHlsManifestPlaylistType> playlistType;

    /**
     * @return The HTTP Live Streaming (HLS) playlist type. When either &#34;EVENT&#34; or &#34;VOD&#34; is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     */
    public Optional<Output<OriginEndpointHlsManifestPlaylistType>> playlistType() {
        return Optional.ofNullable(this.playlistType);
    }

    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
     */
    @Import(name="playlistWindowSeconds")
    private @Nullable Output<Integer> playlistWindowSeconds;

    /**
     * @return Time window (in seconds) contained in each parent manifest.
     * 
     */
    public Optional<Output<Integer>> playlistWindowSeconds() {
        return Optional.ofNullable(this.playlistWindowSeconds);
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    @Import(name="programDateTimeIntervalSeconds")
    private @Nullable Output<Integer> programDateTimeIntervalSeconds;

    /**
     * @return The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    public Optional<Output<Integer>> programDateTimeIntervalSeconds() {
        return Optional.ofNullable(this.programDateTimeIntervalSeconds);
    }

    /**
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the packaged OriginEndpoint for consumption.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private OriginEndpointHlsManifestArgs() {}

    private OriginEndpointHlsManifestArgs(OriginEndpointHlsManifestArgs $) {
        this.adMarkers = $.adMarkers;
        this.adTriggers = $.adTriggers;
        this.adsOnDeliveryRestrictions = $.adsOnDeliveryRestrictions;
        this.id = $.id;
        this.includeIframeOnlyStream = $.includeIframeOnlyStream;
        this.manifestName = $.manifestName;
        this.playlistType = $.playlistType;
        this.playlistWindowSeconds = $.playlistWindowSeconds;
        this.programDateTimeIntervalSeconds = $.programDateTimeIntervalSeconds;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginEndpointHlsManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginEndpointHlsManifestArgs $;

        public Builder() {
            $ = new OriginEndpointHlsManifestArgs();
        }

        public Builder(OriginEndpointHlsManifestArgs defaults) {
            $ = new OriginEndpointHlsManifestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adMarkers This setting controls how ad markers are included in the packaged OriginEndpoint. &#34;NONE&#34; will omit all SCTE-35 ad markers from the output. &#34;PASSTHROUGH&#34; causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. &#34;SCTE35_ENHANCED&#34; generates ad markers and blackout tags based on SCTE-35 messages in the input source. &#34;DATERANGE&#34; inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder adMarkers(@Nullable Output<OriginEndpointHlsManifestAdMarkers> adMarkers) {
            $.adMarkers = adMarkers;
            return this;
        }

        /**
         * @param adMarkers This setting controls how ad markers are included in the packaged OriginEndpoint. &#34;NONE&#34; will omit all SCTE-35 ad markers from the output. &#34;PASSTHROUGH&#34; causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. &#34;SCTE35_ENHANCED&#34; generates ad markers and blackout tags based on SCTE-35 messages in the input source. &#34;DATERANGE&#34; inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder adMarkers(OriginEndpointHlsManifestAdMarkers adMarkers) {
            return adMarkers(Output.of(adMarkers));
        }

        /**
         * @param adTriggers A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
         * 
         * @return builder
         * 
         */
        public Builder adTriggers(@Nullable Output<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers) {
            $.adTriggers = adTriggers;
            return this;
        }

        /**
         * @param adTriggers A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
         * 
         * @return builder
         * 
         */
        public Builder adTriggers(List<OriginEndpointHlsManifestAdTriggersItem> adTriggers) {
            return adTriggers(Output.of(adTriggers));
        }

        /**
         * @param adTriggers A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
         * 
         * @return builder
         * 
         */
        public Builder adTriggers(OriginEndpointHlsManifestAdTriggersItem... adTriggers) {
            return adTriggers(List.of(adTriggers));
        }

        public Builder adsOnDeliveryRestrictions(@Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions) {
            $.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }

        public Builder adsOnDeliveryRestrictions(OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            return adsOnDeliveryRestrictions(Output.of(adsOnDeliveryRestrictions));
        }

        /**
         * @param id The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param includeIframeOnlyStream When enabled, an I-Frame only stream will be included in the output.
         * 
         * @return builder
         * 
         */
        public Builder includeIframeOnlyStream(@Nullable Output<Boolean> includeIframeOnlyStream) {
            $.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        /**
         * @param includeIframeOnlyStream When enabled, an I-Frame only stream will be included in the output.
         * 
         * @return builder
         * 
         */
        public Builder includeIframeOnlyStream(Boolean includeIframeOnlyStream) {
            return includeIframeOnlyStream(Output.of(includeIframeOnlyStream));
        }

        /**
         * @param manifestName An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder manifestName(@Nullable Output<String> manifestName) {
            $.manifestName = manifestName;
            return this;
        }

        /**
         * @param manifestName An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder manifestName(String manifestName) {
            return manifestName(Output.of(manifestName));
        }

        /**
         * @param playlistType The HTTP Live Streaming (HLS) playlist type. When either &#34;EVENT&#34; or &#34;VOD&#34; is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
         * 
         * @return builder
         * 
         */
        public Builder playlistType(@Nullable Output<OriginEndpointHlsManifestPlaylistType> playlistType) {
            $.playlistType = playlistType;
            return this;
        }

        /**
         * @param playlistType The HTTP Live Streaming (HLS) playlist type. When either &#34;EVENT&#34; or &#34;VOD&#34; is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
         * 
         * @return builder
         * 
         */
        public Builder playlistType(OriginEndpointHlsManifestPlaylistType playlistType) {
            return playlistType(Output.of(playlistType));
        }

        /**
         * @param playlistWindowSeconds Time window (in seconds) contained in each parent manifest.
         * 
         * @return builder
         * 
         */
        public Builder playlistWindowSeconds(@Nullable Output<Integer> playlistWindowSeconds) {
            $.playlistWindowSeconds = playlistWindowSeconds;
            return this;
        }

        /**
         * @param playlistWindowSeconds Time window (in seconds) contained in each parent manifest.
         * 
         * @return builder
         * 
         */
        public Builder playlistWindowSeconds(Integer playlistWindowSeconds) {
            return playlistWindowSeconds(Output.of(playlistWindowSeconds));
        }

        /**
         * @param programDateTimeIntervalSeconds The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
         * 
         * @return builder
         * 
         */
        public Builder programDateTimeIntervalSeconds(@Nullable Output<Integer> programDateTimeIntervalSeconds) {
            $.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        /**
         * @param programDateTimeIntervalSeconds The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
         * 
         * @return builder
         * 
         */
        public Builder programDateTimeIntervalSeconds(Integer programDateTimeIntervalSeconds) {
            return programDateTimeIntervalSeconds(Output.of(programDateTimeIntervalSeconds));
        }

        /**
         * @param url The URL of the packaged OriginEndpoint for consumption.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the packaged OriginEndpoint for consumption.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public OriginEndpointHlsManifestArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
