// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkWatcherArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkWatcherArgs Empty = new GetNetworkWatcherArgs();

    /**
     * The name of the network watcher.
     * 
     */
    @Import(name="networkWatcherName", required=true)
    private Output<String> networkWatcherName;

    /**
     * @return The name of the network watcher.
     * 
     */
    public Output<String> networkWatcherName() {
        return this.networkWatcherName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNetworkWatcherArgs() {}

    private GetNetworkWatcherArgs(GetNetworkWatcherArgs $) {
        this.networkWatcherName = $.networkWatcherName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkWatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkWatcherArgs $;

        public Builder() {
            $ = new GetNetworkWatcherArgs();
        }

        public Builder(GetNetworkWatcherArgs defaults) {
            $ = new GetNetworkWatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkWatcherName The name of the network watcher.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherName(Output<String> networkWatcherName) {
            $.networkWatcherName = networkWatcherName;
            return this;
        }

        /**
         * @param networkWatcherName The name of the network watcher.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherName(String networkWatcherName) {
            return networkWatcherName(Output.of(networkWatcherName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetNetworkWatcherArgs build() {
            $.networkWatcherName = Objects.requireNonNull($.networkWatcherName, "expected parameter 'networkWatcherName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
