// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListMachineLearningComputeKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListMachineLearningComputeKeysArgs Empty = new ListMachineLearningComputeKeysArgs();

    /**
     * Name of the Azure Machine Learning compute.
     * 
     */
    @Import(name="computeName", required=true)
    private Output<String> computeName;

    /**
     * @return Name of the Azure Machine Learning compute.
     * 
     */
    public Output<String> computeName() {
        return this.computeName;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group in which workspace is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private ListMachineLearningComputeKeysArgs() {}

    private ListMachineLearningComputeKeysArgs(ListMachineLearningComputeKeysArgs $) {
        this.computeName = $.computeName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListMachineLearningComputeKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListMachineLearningComputeKeysArgs $;

        public Builder() {
            $ = new ListMachineLearningComputeKeysArgs();
        }

        public Builder(ListMachineLearningComputeKeysArgs defaults) {
            $ = new ListMachineLearningComputeKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeName Name of the Azure Machine Learning compute.
         * 
         * @return builder
         * 
         */
        public Builder computeName(Output<String> computeName) {
            $.computeName = computeName;
            return this;
        }

        /**
         * @param computeName Name of the Azure Machine Learning compute.
         * 
         * @return builder
         * 
         */
        public Builder computeName(String computeName) {
            return computeName(Output.of(computeName));
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public ListMachineLearningComputeKeysArgs build() {
            $.computeName = Objects.requireNonNull($.computeName, "expected parameter 'computeName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
