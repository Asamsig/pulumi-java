// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSliceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSliceArgs Empty = new GetSliceArgs();

    /**
     * The name of the mobile network.
     * 
     */
    @Import(name="mobileNetworkName", required=true)
    private Output<String> mobileNetworkName;

    /**
     * @return The name of the mobile network.
     * 
     */
    public Output<String> mobileNetworkName() {
        return this.mobileNetworkName;
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

    /**
     * The name of the mobile network slice.
     * 
     */
    @Import(name="sliceName", required=true)
    private Output<String> sliceName;

    /**
     * @return The name of the mobile network slice.
     * 
     */
    public Output<String> sliceName() {
        return this.sliceName;
    }

    private GetSliceArgs() {}

    private GetSliceArgs(GetSliceArgs $) {
        this.mobileNetworkName = $.mobileNetworkName;
        this.resourceGroupName = $.resourceGroupName;
        this.sliceName = $.sliceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSliceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSliceArgs $;

        public Builder() {
            $ = new GetSliceArgs();
        }

        public Builder(GetSliceArgs defaults) {
            $ = new GetSliceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileNetworkName The name of the mobile network.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkName(Output<String> mobileNetworkName) {
            $.mobileNetworkName = mobileNetworkName;
            return this;
        }

        /**
         * @param mobileNetworkName The name of the mobile network.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkName(String mobileNetworkName) {
            return mobileNetworkName(Output.of(mobileNetworkName));
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
         * @param sliceName The name of the mobile network slice.
         * 
         * @return builder
         * 
         */
        public Builder sliceName(Output<String> sliceName) {
            $.sliceName = sliceName;
            return this;
        }

        /**
         * @param sliceName The name of the mobile network slice.
         * 
         * @return builder
         * 
         */
        public Builder sliceName(String sliceName) {
            return sliceName(Output.of(sliceName));
        }

        public GetSliceArgs build() {
            $.mobileNetworkName = Objects.requireNonNull($.mobileNetworkName, "expected parameter 'mobileNetworkName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sliceName = Objects.requireNonNull($.sliceName, "expected parameter 'sliceName' to be non-null");
            return $;
        }
    }

}
