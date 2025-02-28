// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WatchlistArgs extends com.pulumi.resources.ResourceArgs {

    public static final WatchlistArgs Empty = new WatchlistArgs();

    /**
     * The default duration in ISO8601 duration form of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    @Import(name="defaultDuration")
    private @Nullable Output<String> defaultDuration;

    /**
     * @return The default duration in ISO8601 duration form of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    public Optional<Output<String>> defaultDuration() {
        return Optional.ofNullable(this.defaultDuration);
    }

    /**
     * The description of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The key used to optimize query performance when using Watchlist for joins with other data. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    @Import(name="itemSearchKey", required=true)
    private Output<String> itemSearchKey;

    /**
     * @return The key used to optimize query performance when using Watchlist for joins with other data. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    public Output<String> itemSearchKey() {
        return this.itemSearchKey;
    }

    /**
     * Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The ID of the Log Analytics Workspace where this Sentinel Watchlist resides in. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace where this Sentinel Watchlist resides in. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * The name which should be used for this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private WatchlistArgs() {}

    private WatchlistArgs(WatchlistArgs $) {
        this.defaultDuration = $.defaultDuration;
        this.description = $.description;
        this.displayName = $.displayName;
        this.itemSearchKey = $.itemSearchKey;
        this.labels = $.labels;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WatchlistArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WatchlistArgs $;

        public Builder() {
            $ = new WatchlistArgs();
        }

        public Builder(WatchlistArgs defaults) {
            $ = new WatchlistArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultDuration The default duration in ISO8601 duration form of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder defaultDuration(@Nullable Output<String> defaultDuration) {
            $.defaultDuration = defaultDuration;
            return this;
        }

        /**
         * @param defaultDuration The default duration in ISO8601 duration form of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder defaultDuration(String defaultDuration) {
            return defaultDuration(Output.of(defaultDuration));
        }

        /**
         * @param description The description of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param itemSearchKey The key used to optimize query performance when using Watchlist for joins with other data. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder itemSearchKey(Output<String> itemSearchKey) {
            $.itemSearchKey = itemSearchKey;
            return this;
        }

        /**
         * @param itemSearchKey The key used to optimize query performance when using Watchlist for joins with other data. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder itemSearchKey(String itemSearchKey) {
            return itemSearchKey(Output.of(itemSearchKey));
        }

        /**
         * @param labels Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels Specifies a list of labels related to this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace where this Sentinel Watchlist resides in. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace where this Sentinel Watchlist resides in. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param name The name which should be used for this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Sentinel Watchlist. Changing this forces a new Sentinel Watchlist to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WatchlistArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.itemSearchKey = Objects.requireNonNull($.itemSearchKey, "expected parameter 'itemSearchKey' to be non-null");
            $.logAnalyticsWorkspaceId = Objects.requireNonNull($.logAnalyticsWorkspaceId, "expected parameter 'logAnalyticsWorkspaceId' to be non-null");
            return $;
        }
    }

}
