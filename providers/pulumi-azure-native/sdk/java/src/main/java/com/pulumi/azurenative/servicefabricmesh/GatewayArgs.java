// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh;

import com.pulumi.azurenative.servicefabricmesh.inputs.HttpConfigArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.NetworkRefArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.TcpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * User readable description of the gateway.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User readable description of the gateway.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Network that the Application is using.
     * 
     */
    @Import(name="destinationNetwork", required=true)
    private Output<NetworkRefArgs> destinationNetwork;

    /**
     * @return Network that the Application is using.
     * 
     */
    public Output<NetworkRefArgs> destinationNetwork() {
        return this.destinationNetwork;
    }

    /**
     * The identity of the gateway.
     * 
     */
    @Import(name="gatewayResourceName")
    private @Nullable Output<String> gatewayResourceName;

    /**
     * @return The identity of the gateway.
     * 
     */
    public Optional<Output<String>> gatewayResourceName() {
        return Optional.ofNullable(this.gatewayResourceName);
    }

    /**
     * Configuration for http connectivity for this gateway.
     * 
     */
    @Import(name="http")
    private @Nullable Output<List<HttpConfigArgs>> http;

    /**
     * @return Configuration for http connectivity for this gateway.
     * 
     */
    public Optional<Output<List<HttpConfigArgs>>> http() {
        return Optional.ofNullable(this.http);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Azure resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Azure resource group name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Network the gateway should listen on for requests.
     * 
     */
    @Import(name="sourceNetwork", required=true)
    private Output<NetworkRefArgs> sourceNetwork;

    /**
     * @return Network the gateway should listen on for requests.
     * 
     */
    public Output<NetworkRefArgs> sourceNetwork() {
        return this.sourceNetwork;
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

    /**
     * Configuration for tcp connectivity for this gateway.
     * 
     */
    @Import(name="tcp")
    private @Nullable Output<List<TcpConfigArgs>> tcp;

    /**
     * @return Configuration for tcp connectivity for this gateway.
     * 
     */
    public Optional<Output<List<TcpConfigArgs>>> tcp() {
        return Optional.ofNullable(this.tcp);
    }

    private GatewayArgs() {}

    private GatewayArgs(GatewayArgs $) {
        this.description = $.description;
        this.destinationNetwork = $.destinationNetwork;
        this.gatewayResourceName = $.gatewayResourceName;
        this.http = $.http;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.sourceNetwork = $.sourceNetwork;
        this.tags = $.tags;
        this.tcp = $.tcp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayArgs $;

        public Builder() {
            $ = new GatewayArgs();
        }

        public Builder(GatewayArgs defaults) {
            $ = new GatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description User readable description of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User readable description of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationNetwork Network that the Application is using.
         * 
         * @return builder
         * 
         */
        public Builder destinationNetwork(Output<NetworkRefArgs> destinationNetwork) {
            $.destinationNetwork = destinationNetwork;
            return this;
        }

        /**
         * @param destinationNetwork Network that the Application is using.
         * 
         * @return builder
         * 
         */
        public Builder destinationNetwork(NetworkRefArgs destinationNetwork) {
            return destinationNetwork(Output.of(destinationNetwork));
        }

        /**
         * @param gatewayResourceName The identity of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayResourceName(@Nullable Output<String> gatewayResourceName) {
            $.gatewayResourceName = gatewayResourceName;
            return this;
        }

        /**
         * @param gatewayResourceName The identity of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayResourceName(String gatewayResourceName) {
            return gatewayResourceName(Output.of(gatewayResourceName));
        }

        /**
         * @param http Configuration for http connectivity for this gateway.
         * 
         * @return builder
         * 
         */
        public Builder http(@Nullable Output<List<HttpConfigArgs>> http) {
            $.http = http;
            return this;
        }

        /**
         * @param http Configuration for http connectivity for this gateway.
         * 
         * @return builder
         * 
         */
        public Builder http(List<HttpConfigArgs> http) {
            return http(Output.of(http));
        }

        /**
         * @param http Configuration for http connectivity for this gateway.
         * 
         * @return builder
         * 
         */
        public Builder http(HttpConfigArgs... http) {
            return http(List.of(http));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName Azure resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Azure resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sourceNetwork Network the gateway should listen on for requests.
         * 
         * @return builder
         * 
         */
        public Builder sourceNetwork(Output<NetworkRefArgs> sourceNetwork) {
            $.sourceNetwork = sourceNetwork;
            return this;
        }

        /**
         * @param sourceNetwork Network the gateway should listen on for requests.
         * 
         * @return builder
         * 
         */
        public Builder sourceNetwork(NetworkRefArgs sourceNetwork) {
            return sourceNetwork(Output.of(sourceNetwork));
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

        /**
         * @param tcp Configuration for tcp connectivity for this gateway.
         * 
         * @return builder
         * 
         */
        public Builder tcp(@Nullable Output<List<TcpConfigArgs>> tcp) {
            $.tcp = tcp;
            return this;
        }

        /**
         * @param tcp Configuration for tcp connectivity for this gateway.
         * 
         * @return builder
         * 
         */
        public Builder tcp(List<TcpConfigArgs> tcp) {
            return tcp(Output.of(tcp));
        }

        /**
         * @param tcp Configuration for tcp connectivity for this gateway.
         * 
         * @return builder
         * 
         */
        public Builder tcp(TcpConfigArgs... tcp) {
            return tcp(List.of(tcp));
        }

        public GatewayArgs build() {
            $.destinationNetwork = Objects.requireNonNull($.destinationNetwork, "expected parameter 'destinationNetwork' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sourceNetwork = Objects.requireNonNull($.sourceNetwork, "expected parameter 'sourceNetwork' to be non-null");
            return $;
        }
    }

}
