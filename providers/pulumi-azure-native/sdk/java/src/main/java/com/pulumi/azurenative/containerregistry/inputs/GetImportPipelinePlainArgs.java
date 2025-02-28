// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImportPipelinePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImportPipelinePlainArgs Empty = new GetImportPipelinePlainArgs();

    /**
     * The name of the import pipeline.
     * 
     */
    @Import(name="importPipelineName", required=true)
    private String importPipelineName;

    /**
     * @return The name of the import pipeline.
     * 
     */
    public String importPipelineName() {
        return this.importPipelineName;
    }

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

    private GetImportPipelinePlainArgs() {}

    private GetImportPipelinePlainArgs(GetImportPipelinePlainArgs $) {
        this.importPipelineName = $.importPipelineName;
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImportPipelinePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImportPipelinePlainArgs $;

        public Builder() {
            $ = new GetImportPipelinePlainArgs();
        }

        public Builder(GetImportPipelinePlainArgs defaults) {
            $ = new GetImportPipelinePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param importPipelineName The name of the import pipeline.
         * 
         * @return builder
         * 
         */
        public Builder importPipelineName(String importPipelineName) {
            $.importPipelineName = importPipelineName;
            return this;
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

        public GetImportPipelinePlainArgs build() {
            $.importPipelineName = Objects.requireNonNull($.importPipelineName, "expected parameter 'importPipelineName' to be non-null");
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
