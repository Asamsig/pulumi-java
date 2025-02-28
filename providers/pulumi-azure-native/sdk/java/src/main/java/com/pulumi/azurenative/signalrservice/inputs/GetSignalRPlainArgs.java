// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSignalRPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSignalRPlainArgs Empty = new GetSignalRPlainArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SignalR resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the SignalR resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetSignalRPlainArgs() {}

    private GetSignalRPlainArgs(GetSignalRPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSignalRPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSignalRPlainArgs $;

        public Builder() {
            $ = new GetSignalRPlainArgs();
        }

        public Builder(GetSignalRPlainArgs defaults) {
            $ = new GetSignalRPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the SignalR resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetSignalRPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
