// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.ContainerNetworkInterfaceConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * List of chid container network interface configurations.
     * 
     */
    @Import(name="containerNetworkInterfaceConfigurations")
    private @Nullable Output<List<ContainerNetworkInterfaceConfigurationArgs>> containerNetworkInterfaceConfigurations;

    /**
     * @return List of chid container network interface configurations.
     * 
     */
    public Optional<Output<List<ContainerNetworkInterfaceConfigurationArgs>>> containerNetworkInterfaceConfigurations() {
        return Optional.ofNullable(this.containerNetworkInterfaceConfigurations);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the network profile.
     * 
     */
    @Import(name="networkProfileName")
    private @Nullable Output<String> networkProfileName;

    /**
     * @return The name of the network profile.
     * 
     */
    public Optional<Output<String>> networkProfileName() {
        return Optional.ofNullable(this.networkProfileName);
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

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkProfileArgs() {}

    private NetworkProfileArgs(NetworkProfileArgs $) {
        this.containerNetworkInterfaceConfigurations = $.containerNetworkInterfaceConfigurations;
        this.id = $.id;
        this.location = $.location;
        this.networkProfileName = $.networkProfileName;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkProfileArgs $;

        public Builder() {
            $ = new NetworkProfileArgs();
        }

        public Builder(NetworkProfileArgs defaults) {
            $ = new NetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerNetworkInterfaceConfigurations List of chid container network interface configurations.
         * 
         * @return builder
         * 
         */
        public Builder containerNetworkInterfaceConfigurations(@Nullable Output<List<ContainerNetworkInterfaceConfigurationArgs>> containerNetworkInterfaceConfigurations) {
            $.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
            return this;
        }

        /**
         * @param containerNetworkInterfaceConfigurations List of chid container network interface configurations.
         * 
         * @return builder
         * 
         */
        public Builder containerNetworkInterfaceConfigurations(List<ContainerNetworkInterfaceConfigurationArgs> containerNetworkInterfaceConfigurations) {
            return containerNetworkInterfaceConfigurations(Output.of(containerNetworkInterfaceConfigurations));
        }

        /**
         * @param containerNetworkInterfaceConfigurations List of chid container network interface configurations.
         * 
         * @return builder
         * 
         */
        public Builder containerNetworkInterfaceConfigurations(ContainerNetworkInterfaceConfigurationArgs... containerNetworkInterfaceConfigurations) {
            return containerNetworkInterfaceConfigurations(List.of(containerNetworkInterfaceConfigurations));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param networkProfileName The name of the network profile.
         * 
         * @return builder
         * 
         */
        public Builder networkProfileName(@Nullable Output<String> networkProfileName) {
            $.networkProfileName = networkProfileName;
            return this;
        }

        /**
         * @param networkProfileName The name of the network profile.
         * 
         * @return builder
         * 
         */
        public Builder networkProfileName(String networkProfileName) {
            return networkProfileName(Output.of(networkProfileName));
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

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkProfileArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
