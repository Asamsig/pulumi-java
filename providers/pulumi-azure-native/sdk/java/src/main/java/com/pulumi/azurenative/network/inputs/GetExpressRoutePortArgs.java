// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExpressRoutePortArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExpressRoutePortArgs Empty = new GetExpressRoutePortArgs();

    /**
     * The name of ExpressRoutePort.
     * 
     */
    @Import(name="expressRoutePortName", required=true)
    private Output<String> expressRoutePortName;

    /**
     * @return The name of ExpressRoutePort.
     * 
     */
    public Output<String> expressRoutePortName() {
        return this.expressRoutePortName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetExpressRoutePortArgs() {}

    private GetExpressRoutePortArgs(GetExpressRoutePortArgs $) {
        this.expressRoutePortName = $.expressRoutePortName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExpressRoutePortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExpressRoutePortArgs $;

        public Builder() {
            $ = new GetExpressRoutePortArgs();
        }

        public Builder(GetExpressRoutePortArgs defaults) {
            $ = new GetExpressRoutePortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expressRoutePortName The name of ExpressRoutePort.
         * 
         * @return builder
         * 
         */
        public Builder expressRoutePortName(Output<String> expressRoutePortName) {
            $.expressRoutePortName = expressRoutePortName;
            return this;
        }

        /**
         * @param expressRoutePortName The name of ExpressRoutePort.
         * 
         * @return builder
         * 
         */
        public Builder expressRoutePortName(String expressRoutePortName) {
            return expressRoutePortName(Output.of(expressRoutePortName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetExpressRoutePortArgs build() {
            $.expressRoutePortName = Objects.requireNonNull($.expressRoutePortName, "expected parameter 'expressRoutePortName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
