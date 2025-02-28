// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.notificationhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceState Empty = new NamespaceState();

    /**
     * Is this Notification Hub Namespace enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is this Notification Hub Namespace enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The Azure Region in which this Notification Hub Namespace should be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region in which this Notification Hub Namespace should be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name to use for this Notification Hub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to use for this Notification Hub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Type of Namespace - possible values are `Messaging` or `NotificationHub`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="namespaceType")
    private @Nullable Output<String> namespaceType;

    /**
     * @return The Type of Namespace - possible values are `Messaging` or `NotificationHub`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> namespaceType() {
        return Optional.ofNullable(this.namespaceType);
    }

    /**
     * The name of the Resource Group in which the Notification Hub Namespace should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Notification Hub Namespace should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The ServiceBus Endpoint for this Notification Hub Namespace.
     * 
     */
    @Import(name="servicebusEndpoint")
    private @Nullable Output<String> servicebusEndpoint;

    /**
     * @return The ServiceBus Endpoint for this Notification Hub Namespace.
     * 
     */
    public Optional<Output<String>> servicebusEndpoint() {
        return Optional.ofNullable(this.servicebusEndpoint);
    }

    /**
     * The name of the SKU to use for this Notification Hub Namespace. Possible values are `Free`, `Basic` or `Standard`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return The name of the SKU to use for this Notification Hub Namespace. Possible values are `Free`, `Basic` or `Standard`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NamespaceState() {}

    private NamespaceState(NamespaceState $) {
        this.enabled = $.enabled;
        this.location = $.location;
        this.name = $.name;
        this.namespaceType = $.namespaceType;
        this.resourceGroupName = $.resourceGroupName;
        this.servicebusEndpoint = $.servicebusEndpoint;
        this.skuName = $.skuName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceState $;

        public Builder() {
            $ = new NamespaceState();
        }

        public Builder(NamespaceState defaults) {
            $ = new NamespaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Is this Notification Hub Namespace enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is this Notification Hub Namespace enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param location The Azure Region in which this Notification Hub Namespace should be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region in which this Notification Hub Namespace should be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name to use for this Notification Hub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to use for this Notification Hub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceType The Type of Namespace - possible values are `Messaging` or `NotificationHub`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceType(@Nullable Output<String> namespaceType) {
            $.namespaceType = namespaceType;
            return this;
        }

        /**
         * @param namespaceType The Type of Namespace - possible values are `Messaging` or `NotificationHub`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceType(String namespaceType) {
            return namespaceType(Output.of(namespaceType));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Notification Hub Namespace should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Notification Hub Namespace should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param servicebusEndpoint The ServiceBus Endpoint for this Notification Hub Namespace.
         * 
         * @return builder
         * 
         */
        public Builder servicebusEndpoint(@Nullable Output<String> servicebusEndpoint) {
            $.servicebusEndpoint = servicebusEndpoint;
            return this;
        }

        /**
         * @param servicebusEndpoint The ServiceBus Endpoint for this Notification Hub Namespace.
         * 
         * @return builder
         * 
         */
        public Builder servicebusEndpoint(String servicebusEndpoint) {
            return servicebusEndpoint(Output.of(servicebusEndpoint));
        }

        /**
         * @param skuName The name of the SKU to use for this Notification Hub Namespace. Possible values are `Free`, `Basic` or `Standard`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The name of the SKU to use for this Notification Hub Namespace. Possible values are `Free`, `Basic` or `Standard`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NamespaceState build() {
            return $;
        }
    }

}
