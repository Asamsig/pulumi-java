// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybriddata.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobDefinitionArgs Empty = new GetJobDefinitionArgs();

    /**
     * The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @Import(name="dataManagerName", required=true)
    private Output<String> dataManagerName;

    /**
     * @return The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    public Output<String> dataManagerName() {
        return this.dataManagerName;
    }

    /**
     * The data service name of the job definition
     * 
     */
    @Import(name="dataServiceName", required=true)
    private Output<String> dataServiceName;

    /**
     * @return The data service name of the job definition
     * 
     */
    public Output<String> dataServiceName() {
        return this.dataServiceName;
    }

    /**
     * The job definition name that is being queried.
     * 
     */
    @Import(name="jobDefinitionName", required=true)
    private Output<String> jobDefinitionName;

    /**
     * @return The job definition name that is being queried.
     * 
     */
    public Output<String> jobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * The Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Resource Group Name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetJobDefinitionArgs() {}

    private GetJobDefinitionArgs(GetJobDefinitionArgs $) {
        this.dataManagerName = $.dataManagerName;
        this.dataServiceName = $.dataServiceName;
        this.jobDefinitionName = $.jobDefinitionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobDefinitionArgs $;

        public Builder() {
            $ = new GetJobDefinitionArgs();
        }

        public Builder(GetJobDefinitionArgs defaults) {
            $ = new GetJobDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
         * 
         * @return builder
         * 
         */
        public Builder dataManagerName(Output<String> dataManagerName) {
            $.dataManagerName = dataManagerName;
            return this;
        }

        /**
         * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
         * 
         * @return builder
         * 
         */
        public Builder dataManagerName(String dataManagerName) {
            return dataManagerName(Output.of(dataManagerName));
        }

        /**
         * @param dataServiceName The data service name of the job definition
         * 
         * @return builder
         * 
         */
        public Builder dataServiceName(Output<String> dataServiceName) {
            $.dataServiceName = dataServiceName;
            return this;
        }

        /**
         * @param dataServiceName The data service name of the job definition
         * 
         * @return builder
         * 
         */
        public Builder dataServiceName(String dataServiceName) {
            return dataServiceName(Output.of(dataServiceName));
        }

        /**
         * @param jobDefinitionName The job definition name that is being queried.
         * 
         * @return builder
         * 
         */
        public Builder jobDefinitionName(Output<String> jobDefinitionName) {
            $.jobDefinitionName = jobDefinitionName;
            return this;
        }

        /**
         * @param jobDefinitionName The job definition name that is being queried.
         * 
         * @return builder
         * 
         */
        public Builder jobDefinitionName(String jobDefinitionName) {
            return jobDefinitionName(Output.of(jobDefinitionName));
        }

        /**
         * @param resourceGroupName The Resource Group Name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group Name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetJobDefinitionArgs build() {
            $.dataManagerName = Objects.requireNonNull($.dataManagerName, "expected parameter 'dataManagerName' to be non-null");
            $.dataServiceName = Objects.requireNonNull($.dataServiceName, "expected parameter 'dataServiceName' to be non-null");
            $.jobDefinitionName = Objects.requireNonNull($.jobDefinitionName, "expected parameter 'jobDefinitionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
