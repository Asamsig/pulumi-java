// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.inputs.SlackChannelPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Slack channel definition
 * 
 */
public final class SlackChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlackChannelArgs Empty = new SlackChannelArgs();

    /**
     * The channel name
     * Expected value is &#39;SlackChannel&#39;.
     * 
     */
    @Import(name="channelName", required=true)
    private Output<String> channelName;

    /**
     * @return The channel name
     * Expected value is &#39;SlackChannel&#39;.
     * 
     */
    public Output<String> channelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Entity Tag of the resource
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The set of properties specific to Slack channel resource
     * 
     */
    @Import(name="properties")
    private @Nullable Output<SlackChannelPropertiesArgs> properties;

    /**
     * @return The set of properties specific to Slack channel resource
     * 
     */
    public Optional<Output<SlackChannelPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private SlackChannelArgs() {}

    private SlackChannelArgs(SlackChannelArgs $) {
        this.channelName = $.channelName;
        this.etag = $.etag;
        this.location = $.location;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlackChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlackChannelArgs $;

        public Builder() {
            $ = new SlackChannelArgs();
        }

        public Builder(SlackChannelArgs defaults) {
            $ = new SlackChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelName The channel name
         * Expected value is &#39;SlackChannel&#39;.
         * 
         * @return builder
         * 
         */
        public Builder channelName(Output<String> channelName) {
            $.channelName = channelName;
            return this;
        }

        /**
         * @param channelName The channel name
         * Expected value is &#39;SlackChannel&#39;.
         * 
         * @return builder
         * 
         */
        public Builder channelName(String channelName) {
            return channelName(Output.of(channelName));
        }

        /**
         * @param etag Entity Tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Entity Tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param location Specifies the location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties The set of properties specific to Slack channel resource
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<SlackChannelPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The set of properties specific to Slack channel resource
         * 
         * @return builder
         * 
         */
        public Builder properties(SlackChannelPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public SlackChannelArgs build() {
            $.channelName = Codegen.stringProp("channelName").output().arg($.channelName).require();
            $.location = Codegen.stringProp("location").output().arg($.location).def("global").getNullable();
            return $;
        }
    }

}
