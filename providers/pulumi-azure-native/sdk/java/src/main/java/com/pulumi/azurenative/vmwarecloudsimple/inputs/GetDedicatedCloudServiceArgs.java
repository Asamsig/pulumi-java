// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDedicatedCloudServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDedicatedCloudServiceArgs Empty = new GetDedicatedCloudServiceArgs();

    /**
     * dedicated cloud Service name
     * 
     */
    @Import(name="dedicatedCloudServiceName", required=true)
    private Output<String> dedicatedCloudServiceName;

    /**
     * @return dedicated cloud Service name
     * 
     */
    public Output<String> dedicatedCloudServiceName() {
        return this.dedicatedCloudServiceName;
    }

    /**
     * The name of the resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDedicatedCloudServiceArgs() {}

    private GetDedicatedCloudServiceArgs(GetDedicatedCloudServiceArgs $) {
        this.dedicatedCloudServiceName = $.dedicatedCloudServiceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDedicatedCloudServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDedicatedCloudServiceArgs $;

        public Builder() {
            $ = new GetDedicatedCloudServiceArgs();
        }

        public Builder(GetDedicatedCloudServiceArgs defaults) {
            $ = new GetDedicatedCloudServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dedicatedCloudServiceName dedicated cloud Service name
         * 
         * @return builder
         * 
         */
        public Builder dedicatedCloudServiceName(Output<String> dedicatedCloudServiceName) {
            $.dedicatedCloudServiceName = dedicatedCloudServiceName;
            return this;
        }

        /**
         * @param dedicatedCloudServiceName dedicated cloud Service name
         * 
         * @return builder
         * 
         */
        public Builder dedicatedCloudServiceName(String dedicatedCloudServiceName) {
            return dedicatedCloudServiceName(Output.of(dedicatedCloudServiceName));
        }

        /**
         * @param resourceGroupName The name of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetDedicatedCloudServiceArgs build() {
            $.dedicatedCloudServiceName = Objects.requireNonNull($.dedicatedCloudServiceName, "expected parameter 'dedicatedCloudServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
