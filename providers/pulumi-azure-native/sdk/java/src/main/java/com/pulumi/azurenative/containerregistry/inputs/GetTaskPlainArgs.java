// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTaskPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTaskPlainArgs Empty = new GetTaskPlainArgs();

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
    private String registryName;

    /**
     * @return The name of the container registry.
     * 
     */
    public String registryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group to which the container registry belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the container registry task.
     * 
     */
    @Import(name="taskName", required=true)
    private String taskName;

    /**
     * @return The name of the container registry task.
     * 
     */
    public String taskName() {
        return this.taskName;
    }

    private GetTaskPlainArgs() {}

    private GetTaskPlainArgs(GetTaskPlainArgs $) {
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
        this.taskName = $.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTaskPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTaskPlainArgs $;

        public Builder() {
            $ = new GetTaskPlainArgs();
        }

        public Builder(GetTaskPlainArgs defaults) {
            $ = new GetTaskPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(String registryName) {
            $.registryName = registryName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param taskName The name of the container registry task.
         * 
         * @return builder
         * 
         */
        public Builder taskName(String taskName) {
            $.taskName = taskName;
            return this;
        }

        public GetTaskPlainArgs build() {
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.taskName = Objects.requireNonNull($.taskName, "expected parameter 'taskName' to be non-null");
            return $;
        }
    }

}
