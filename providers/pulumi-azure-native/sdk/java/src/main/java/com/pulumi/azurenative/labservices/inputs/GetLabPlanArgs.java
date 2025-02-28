// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLabPlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLabPlanArgs Empty = new GetLabPlanArgs();

    /**
     * The name of the lab plan that uniquely identifies it within containing resource group. Used in resource URIs and in UI.
     * 
     */
    @Import(name="labPlanName", required=true)
    private Output<String> labPlanName;

    /**
     * @return The name of the lab plan that uniquely identifies it within containing resource group. Used in resource URIs and in UI.
     * 
     */
    public Output<String> labPlanName() {
        return this.labPlanName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLabPlanArgs() {}

    private GetLabPlanArgs(GetLabPlanArgs $) {
        this.labPlanName = $.labPlanName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLabPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLabPlanArgs $;

        public Builder() {
            $ = new GetLabPlanArgs();
        }

        public Builder(GetLabPlanArgs defaults) {
            $ = new GetLabPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labPlanName The name of the lab plan that uniquely identifies it within containing resource group. Used in resource URIs and in UI.
         * 
         * @return builder
         * 
         */
        public Builder labPlanName(Output<String> labPlanName) {
            $.labPlanName = labPlanName;
            return this;
        }

        /**
         * @param labPlanName The name of the lab plan that uniquely identifies it within containing resource group. Used in resource URIs and in UI.
         * 
         * @return builder
         * 
         */
        public Builder labPlanName(String labPlanName) {
            return labPlanName(Output.of(labPlanName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetLabPlanArgs build() {
            $.labPlanName = Objects.requireNonNull($.labPlanName, "expected parameter 'labPlanName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
