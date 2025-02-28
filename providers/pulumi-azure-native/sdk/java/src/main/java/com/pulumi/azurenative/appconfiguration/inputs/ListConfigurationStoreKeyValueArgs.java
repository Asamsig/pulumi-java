// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListConfigurationStoreKeyValueArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListConfigurationStoreKeyValueArgs Empty = new ListConfigurationStoreKeyValueArgs();

    /**
     * The name of the configuration store.
     * 
     */
    @Import(name="configStoreName", required=true)
    private Output<String> configStoreName;

    /**
     * @return The name of the configuration store.
     * 
     */
    public Output<String> configStoreName() {
        return this.configStoreName;
    }

    /**
     * The key to retrieve.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key to retrieve.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The label of the key.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label of the key.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to which the container registry belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListConfigurationStoreKeyValueArgs() {}

    private ListConfigurationStoreKeyValueArgs(ListConfigurationStoreKeyValueArgs $) {
        this.configStoreName = $.configStoreName;
        this.key = $.key;
        this.label = $.label;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListConfigurationStoreKeyValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListConfigurationStoreKeyValueArgs $;

        public Builder() {
            $ = new ListConfigurationStoreKeyValueArgs();
        }

        public Builder(ListConfigurationStoreKeyValueArgs defaults) {
            $ = new ListConfigurationStoreKeyValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configStoreName The name of the configuration store.
         * 
         * @return builder
         * 
         */
        public Builder configStoreName(Output<String> configStoreName) {
            $.configStoreName = configStoreName;
            return this;
        }

        /**
         * @param configStoreName The name of the configuration store.
         * 
         * @return builder
         * 
         */
        public Builder configStoreName(String configStoreName) {
            return configStoreName(Output.of(configStoreName));
        }

        /**
         * @param key The key to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param label The label of the key.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the key.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ListConfigurationStoreKeyValueArgs build() {
            $.configStoreName = Objects.requireNonNull($.configStoreName, "expected parameter 'configStoreName' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
