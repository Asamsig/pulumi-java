// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs;

import com.pulumi.awsnative.ivs.inputs.StreamKeyTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamKeyArgs Empty = new StreamKeyArgs();

    /**
     * Channel ARN for the stream.
     * 
     */
    @Import(name="channelArn", required=true)
    private Output<String> channelArn;

    /**
     * @return Channel ARN for the stream.
     * 
     */
    public Output<String> channelArn() {
        return this.channelArn;
    }

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<StreamKeyTagArgs>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public Optional<Output<List<StreamKeyTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private StreamKeyArgs() {}

    private StreamKeyArgs(StreamKeyArgs $) {
        this.channelArn = $.channelArn;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamKeyArgs $;

        public Builder() {
            $ = new StreamKeyArgs();
        }

        public Builder(StreamKeyArgs defaults) {
            $ = new StreamKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelArn Channel ARN for the stream.
         * 
         * @return builder
         * 
         */
        public Builder channelArn(Output<String> channelArn) {
            $.channelArn = channelArn;
            return this;
        }

        /**
         * @param channelArn Channel ARN for the stream.
         * 
         * @return builder
         * 
         */
        public Builder channelArn(String channelArn) {
            return channelArn(Output.of(channelArn));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset model.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<StreamKeyTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset model.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<StreamKeyTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset model.
         * 
         * @return builder
         * 
         */
        public Builder tags(StreamKeyTagArgs... tags) {
            return tags(List.of(tags));
        }

        public StreamKeyArgs build() {
            $.channelArn = Objects.requireNonNull($.channelArn, "expected parameter 'channelArn' to be non-null");
            return $;
        }
    }

}
