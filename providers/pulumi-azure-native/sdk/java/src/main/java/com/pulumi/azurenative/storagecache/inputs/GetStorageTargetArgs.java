// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStorageTargetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStorageTargetArgs Empty = new GetStorageTargetArgs();

    /**
     * Name of Cache. Length of name must not be greater than 80 and chars must be from the [-0-9a-zA-Z_] char class.
     * 
     */
    @Import(name="cacheName", required=true)
    private Output<String> cacheName;

    /**
     * @return Name of Cache. Length of name must not be greater than 80 and chars must be from the [-0-9a-zA-Z_] char class.
     * 
     */
    public Output<String> cacheName() {
        return this.cacheName;
    }

    /**
     * Target resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Target resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Storage Target.
     * 
     */
    @Import(name="storageTargetName", required=true)
    private Output<String> storageTargetName;

    /**
     * @return Name of Storage Target.
     * 
     */
    public Output<String> storageTargetName() {
        return this.storageTargetName;
    }

    private GetStorageTargetArgs() {}

    private GetStorageTargetArgs(GetStorageTargetArgs $) {
        this.cacheName = $.cacheName;
        this.resourceGroupName = $.resourceGroupName;
        this.storageTargetName = $.storageTargetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageTargetArgs $;

        public Builder() {
            $ = new GetStorageTargetArgs();
        }

        public Builder(GetStorageTargetArgs defaults) {
            $ = new GetStorageTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the [-0-9a-zA-Z_] char class.
         * 
         * @return builder
         * 
         */
        public Builder cacheName(Output<String> cacheName) {
            $.cacheName = cacheName;
            return this;
        }

        /**
         * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the [-0-9a-zA-Z_] char class.
         * 
         * @return builder
         * 
         */
        public Builder cacheName(String cacheName) {
            return cacheName(Output.of(cacheName));
        }

        /**
         * @param resourceGroupName Target resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Target resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageTargetName Name of Storage Target.
         * 
         * @return builder
         * 
         */
        public Builder storageTargetName(Output<String> storageTargetName) {
            $.storageTargetName = storageTargetName;
            return this;
        }

        /**
         * @param storageTargetName Name of Storage Target.
         * 
         * @return builder
         * 
         */
        public Builder storageTargetName(String storageTargetName) {
            return storageTargetName(Output.of(storageTargetName));
        }

        public GetStorageTargetArgs build() {
            $.cacheName = Objects.requireNonNull($.cacheName, "expected parameter 'cacheName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageTargetName = Objects.requireNonNull($.storageTargetName, "expected parameter 'storageTargetName' to be non-null");
            return $;
        }
    }

}
