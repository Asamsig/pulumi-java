// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMachineLearningDatastorePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMachineLearningDatastorePlainArgs Empty = new GetMachineLearningDatastorePlainArgs();

    /**
     * The Datastore name.
     * 
     */
    @Import(name="datastoreName", required=true)
    private String datastoreName;

    /**
     * @return The Datastore name.
     * 
     */
    public String datastoreName() {
        return this.datastoreName;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group in which workspace is located.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetMachineLearningDatastorePlainArgs() {}

    private GetMachineLearningDatastorePlainArgs(GetMachineLearningDatastorePlainArgs $) {
        this.datastoreName = $.datastoreName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMachineLearningDatastorePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMachineLearningDatastorePlainArgs $;

        public Builder() {
            $ = new GetMachineLearningDatastorePlainArgs();
        }

        public Builder(GetMachineLearningDatastorePlainArgs defaults) {
            $ = new GetMachineLearningDatastorePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datastoreName The Datastore name.
         * 
         * @return builder
         * 
         */
        public Builder datastoreName(String datastoreName) {
            $.datastoreName = datastoreName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetMachineLearningDatastorePlainArgs build() {
            $.datastoreName = Objects.requireNonNull($.datastoreName, "expected parameter 'datastoreName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
