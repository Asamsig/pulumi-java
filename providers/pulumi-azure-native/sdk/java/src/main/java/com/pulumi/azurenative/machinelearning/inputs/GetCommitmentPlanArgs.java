// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCommitmentPlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCommitmentPlanArgs Empty = new GetCommitmentPlanArgs();

    /**
     * The Azure ML commitment plan name.
     * 
     */
    @Import(name="commitmentPlanName", required=true)
    private Output<String> commitmentPlanName;

    /**
     * @return The Azure ML commitment plan name.
     * 
     */
    public Output<String> commitmentPlanName() {
        return this.commitmentPlanName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCommitmentPlanArgs() {}

    private GetCommitmentPlanArgs(GetCommitmentPlanArgs $) {
        this.commitmentPlanName = $.commitmentPlanName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCommitmentPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCommitmentPlanArgs $;

        public Builder() {
            $ = new GetCommitmentPlanArgs();
        }

        public Builder(GetCommitmentPlanArgs defaults) {
            $ = new GetCommitmentPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commitmentPlanName The Azure ML commitment plan name.
         * 
         * @return builder
         * 
         */
        public Builder commitmentPlanName(Output<String> commitmentPlanName) {
            $.commitmentPlanName = commitmentPlanName;
            return this;
        }

        /**
         * @param commitmentPlanName The Azure ML commitment plan name.
         * 
         * @return builder
         * 
         */
        public Builder commitmentPlanName(String commitmentPlanName) {
            return commitmentPlanName(Output.of(commitmentPlanName));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetCommitmentPlanArgs build() {
            $.commitmentPlanName = Objects.requireNonNull($.commitmentPlanName, "expected parameter 'commitmentPlanName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
