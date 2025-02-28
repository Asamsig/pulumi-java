// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media;

import com.pulumi.azurenative.media.inputs.MediaGraphAssetSinkArgs;
import com.pulumi.azurenative.media.inputs.MediaGraphRtspSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MediaGraphArgs extends com.pulumi.resources.ResourceArgs {

    public static final MediaGraphArgs Empty = new MediaGraphArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The Media Services account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Media Graph description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Media Graph description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Media Graph name.
     * 
     */
    @Import(name="mediaGraphName")
    private @Nullable Output<String> mediaGraphName;

    /**
     * @return The Media Graph name.
     * 
     */
    public Optional<Output<String>> mediaGraphName() {
        return Optional.ofNullable(this.mediaGraphName);
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Media Graph sinks.
     * 
     */
    @Import(name="sinks", required=true)
    private Output<List<MediaGraphAssetSinkArgs>> sinks;

    /**
     * @return Media Graph sinks.
     * 
     */
    public Output<List<MediaGraphAssetSinkArgs>> sinks() {
        return this.sinks;
    }

    /**
     * Media Graph sources.
     * 
     */
    @Import(name="sources", required=true)
    private Output<List<MediaGraphRtspSourceArgs>> sources;

    /**
     * @return Media Graph sources.
     * 
     */
    public Output<List<MediaGraphRtspSourceArgs>> sources() {
        return this.sources;
    }

    private MediaGraphArgs() {}

    private MediaGraphArgs(MediaGraphArgs $) {
        this.accountName = $.accountName;
        this.description = $.description;
        this.mediaGraphName = $.mediaGraphName;
        this.resourceGroupName = $.resourceGroupName;
        this.sinks = $.sinks;
        this.sources = $.sources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MediaGraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MediaGraphArgs $;

        public Builder() {
            $ = new MediaGraphArgs();
        }

        public Builder(MediaGraphArgs defaults) {
            $ = new MediaGraphArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param description Media Graph description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Media Graph description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param mediaGraphName The Media Graph name.
         * 
         * @return builder
         * 
         */
        public Builder mediaGraphName(@Nullable Output<String> mediaGraphName) {
            $.mediaGraphName = mediaGraphName;
            return this;
        }

        /**
         * @param mediaGraphName The Media Graph name.
         * 
         * @return builder
         * 
         */
        public Builder mediaGraphName(String mediaGraphName) {
            return mediaGraphName(Output.of(mediaGraphName));
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sinks Media Graph sinks.
         * 
         * @return builder
         * 
         */
        public Builder sinks(Output<List<MediaGraphAssetSinkArgs>> sinks) {
            $.sinks = sinks;
            return this;
        }

        /**
         * @param sinks Media Graph sinks.
         * 
         * @return builder
         * 
         */
        public Builder sinks(List<MediaGraphAssetSinkArgs> sinks) {
            return sinks(Output.of(sinks));
        }

        /**
         * @param sinks Media Graph sinks.
         * 
         * @return builder
         * 
         */
        public Builder sinks(MediaGraphAssetSinkArgs... sinks) {
            return sinks(List.of(sinks));
        }

        /**
         * @param sources Media Graph sources.
         * 
         * @return builder
         * 
         */
        public Builder sources(Output<List<MediaGraphRtspSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Media Graph sources.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<MediaGraphRtspSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Media Graph sources.
         * 
         * @return builder
         * 
         */
        public Builder sources(MediaGraphRtspSourceArgs... sources) {
            return sources(List.of(sources));
        }

        public MediaGraphArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sinks = Objects.requireNonNull($.sinks, "expected parameter 'sinks' to be non-null");
            $.sources = Objects.requireNonNull($.sources, "expected parameter 'sources' to be non-null");
            return $;
        }
    }

}
