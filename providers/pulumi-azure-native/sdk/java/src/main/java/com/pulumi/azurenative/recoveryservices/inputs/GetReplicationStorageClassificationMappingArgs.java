// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationStorageClassificationMappingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationStorageClassificationMappingArgs Empty = new GetReplicationStorageClassificationMappingArgs();

    /**
     * Fabric name.
     * 
     */
    @Import(name="fabricName", required=true)
    private Output<String> fabricName;

    /**
     * @return Fabric name.
     * 
     */
    public Output<String> fabricName() {
        return this.fabricName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the recovery services vault is present.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Storage classification mapping name.
     * 
     */
    @Import(name="storageClassificationMappingName", required=true)
    private Output<String> storageClassificationMappingName;

    /**
     * @return Storage classification mapping name.
     * 
     */
    public Output<String> storageClassificationMappingName() {
        return this.storageClassificationMappingName;
    }

    /**
     * Storage classification name.
     * 
     */
    @Import(name="storageClassificationName", required=true)
    private Output<String> storageClassificationName;

    /**
     * @return Storage classification name.
     * 
     */
    public Output<String> storageClassificationName() {
        return this.storageClassificationName;
    }

    private GetReplicationStorageClassificationMappingArgs() {}

    private GetReplicationStorageClassificationMappingArgs(GetReplicationStorageClassificationMappingArgs $) {
        this.fabricName = $.fabricName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.storageClassificationMappingName = $.storageClassificationMappingName;
        this.storageClassificationName = $.storageClassificationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationStorageClassificationMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationStorageClassificationMappingArgs $;

        public Builder() {
            $ = new GetReplicationStorageClassificationMappingArgs();
        }

        public Builder(GetReplicationStorageClassificationMappingArgs defaults) {
            $ = new GetReplicationStorageClassificationMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fabricName Fabric name.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(Output<String> fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        /**
         * @param fabricName Fabric name.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(String fabricName) {
            return fabricName(Output.of(fabricName));
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param storageClassificationMappingName Storage classification mapping name.
         * 
         * @return builder
         * 
         */
        public Builder storageClassificationMappingName(Output<String> storageClassificationMappingName) {
            $.storageClassificationMappingName = storageClassificationMappingName;
            return this;
        }

        /**
         * @param storageClassificationMappingName Storage classification mapping name.
         * 
         * @return builder
         * 
         */
        public Builder storageClassificationMappingName(String storageClassificationMappingName) {
            return storageClassificationMappingName(Output.of(storageClassificationMappingName));
        }

        /**
         * @param storageClassificationName Storage classification name.
         * 
         * @return builder
         * 
         */
        public Builder storageClassificationName(Output<String> storageClassificationName) {
            $.storageClassificationName = storageClassificationName;
            return this;
        }

        /**
         * @param storageClassificationName Storage classification name.
         * 
         * @return builder
         * 
         */
        public Builder storageClassificationName(String storageClassificationName) {
            return storageClassificationName(Output.of(storageClassificationName));
        }

        public GetReplicationStorageClassificationMappingArgs build() {
            $.fabricName = Objects.requireNonNull($.fabricName, "expected parameter 'fabricName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            $.storageClassificationMappingName = Objects.requireNonNull($.storageClassificationMappingName, "expected parameter 'storageClassificationMappingName' to be non-null");
            $.storageClassificationName = Objects.requireNonNull($.storageClassificationName, "expected parameter 'storageClassificationName' to be non-null");
            return $;
        }
    }

}
