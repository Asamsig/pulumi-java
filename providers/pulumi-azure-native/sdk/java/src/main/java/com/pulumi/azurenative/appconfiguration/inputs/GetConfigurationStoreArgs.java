// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationStoreArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigurationStoreArgs Empty = new GetConfigurationStoreArgs();

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

    private GetConfigurationStoreArgs() {}

    private GetConfigurationStoreArgs(GetConfigurationStoreArgs $) {
        this.configStoreName = $.configStoreName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigurationStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigurationStoreArgs $;

        public Builder() {
            $ = new GetConfigurationStoreArgs();
        }

        public Builder(GetConfigurationStoreArgs defaults) {
            $ = new GetConfigurationStoreArgs(Objects.requireNonNull(defaults));
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

        public GetConfigurationStoreArgs build() {
            $.configStoreName = Objects.requireNonNull($.configStoreName, "expected parameter 'configStoreName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
