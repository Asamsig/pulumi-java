// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSimArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSimArgs Empty = new GetSimArgs();

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

    /**
     * The name of the SIM.
     * 
     */
    @Import(name="simName", required=true)
    private Output<String> simName;

    /**
     * @return The name of the SIM.
     * 
     */
    public Output<String> simName() {
        return this.simName;
    }

    private GetSimArgs() {}

    private GetSimArgs(GetSimArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.simName = $.simName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSimArgs $;

        public Builder() {
            $ = new GetSimArgs();
        }

        public Builder(GetSimArgs defaults) {
            $ = new GetSimArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param simName The name of the SIM.
         * 
         * @return builder
         * 
         */
        public Builder simName(Output<String> simName) {
            $.simName = simName;
            return this;
        }

        /**
         * @param simName The name of the SIM.
         * 
         * @return builder
         * 
         */
        public Builder simName(String simName) {
            return simName(Output.of(simName));
        }

        public GetSimArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.simName = Objects.requireNonNull($.simName, "expected parameter 'simName' to be non-null");
            return $;
        }
    }

}
