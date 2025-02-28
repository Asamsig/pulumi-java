// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWatchlistItemPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWatchlistItemPlainArgs Empty = new GetWatchlistItemPlainArgs();

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private String operationalInsightsResourceProvider;

    /**
     * @return The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    public String operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Watchlist Alias
     * 
     */
    @Import(name="watchlistAlias", required=true)
    private String watchlistAlias;

    /**
     * @return Watchlist Alias
     * 
     */
    public String watchlistAlias() {
        return this.watchlistAlias;
    }

    /**
     * Watchlist Item Id (GUID)
     * 
     */
    @Import(name="watchlistItemId", required=true)
    private String watchlistItemId;

    /**
     * @return Watchlist Item Id (GUID)
     * 
     */
    public String watchlistItemId() {
        return this.watchlistItemId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetWatchlistItemPlainArgs() {}

    private GetWatchlistItemPlainArgs(GetWatchlistItemPlainArgs $) {
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.resourceGroupName = $.resourceGroupName;
        this.watchlistAlias = $.watchlistAlias;
        this.watchlistItemId = $.watchlistItemId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWatchlistItemPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWatchlistItemPlainArgs $;

        public Builder() {
            $ = new GetWatchlistItemPlainArgs();
        }

        public Builder(GetWatchlistItemPlainArgs defaults) {
            $ = new GetWatchlistItemPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param watchlistAlias Watchlist Alias
         * 
         * @return builder
         * 
         */
        public Builder watchlistAlias(String watchlistAlias) {
            $.watchlistAlias = watchlistAlias;
            return this;
        }

        /**
         * @param watchlistItemId Watchlist Item Id (GUID)
         * 
         * @return builder
         * 
         */
        public Builder watchlistItemId(String watchlistItemId) {
            $.watchlistItemId = watchlistItemId;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetWatchlistItemPlainArgs build() {
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.watchlistAlias = Objects.requireNonNull($.watchlistAlias, "expected parameter 'watchlistAlias' to be non-null");
            $.watchlistItemId = Objects.requireNonNull($.watchlistItemId, "expected parameter 'watchlistItemId' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
