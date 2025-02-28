// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import com.pulumi.azurenative.documentdb.inputs.GraphResourceArgs;
import com.pulumi.azurenative.documentdb.inputs.ManagedServiceIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GraphResourceGraphArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphResourceGraphArgs Empty = new GraphResourceGraphArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Cosmos DB database account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB graph resource name.
     * 
     */
    @Import(name="graphName")
    private @Nullable Output<String> graphName;

    /**
     * @return Cosmos DB graph resource name.
     * 
     */
    public Optional<Output<String>> graphName() {
        return Optional.ofNullable(this.graphName);
    }

    /**
     * Identity for the resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ManagedServiceIdentityArgs> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Optional<Output<ManagedServiceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     * 
     */
    @Import(name="options")
    private @Nullable Output<CreateUpdateOptionsArgs> options;

    /**
     * @return A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     * 
     */
    public Optional<Output<CreateUpdateOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * The standard JSON format of a Graph resource
     * 
     */
    @Import(name="resource", required=true)
    private Output<GraphResourceArgs> resource;

    /**
     * @return The standard JSON format of a Graph resource
     * 
     */
    public Output<GraphResourceArgs> resource() {
        return this.resource;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GraphResourceGraphArgs() {}

    private GraphResourceGraphArgs(GraphResourceGraphArgs $) {
        this.accountName = $.accountName;
        this.graphName = $.graphName;
        this.identity = $.identity;
        this.location = $.location;
        this.options = $.options;
        this.resource = $.resource;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphResourceGraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphResourceGraphArgs $;

        public Builder() {
            $ = new GraphResourceGraphArgs();
        }

        public Builder(GraphResourceGraphArgs defaults) {
            $ = new GraphResourceGraphArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param graphName Cosmos DB graph resource name.
         * 
         * @return builder
         * 
         */
        public Builder graphName(@Nullable Output<String> graphName) {
            $.graphName = graphName;
            return this;
        }

        /**
         * @param graphName Cosmos DB graph resource name.
         * 
         * @return builder
         * 
         */
        public Builder graphName(String graphName) {
            return graphName(Output.of(graphName));
        }

        /**
         * @param identity Identity for the resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity Identity for the resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(ManagedServiceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The location of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<CreateUpdateOptionsArgs> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
         * 
         * @return builder
         * 
         */
        public Builder options(CreateUpdateOptionsArgs options) {
            return options(Output.of(options));
        }

        /**
         * @param resource The standard JSON format of a Graph resource
         * 
         * @return builder
         * 
         */
        public Builder resource(Output<GraphResourceArgs> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The standard JSON format of a Graph resource
         * 
         * @return builder
         * 
         */
        public Builder resource(GraphResourceArgs resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GraphResourceGraphArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
