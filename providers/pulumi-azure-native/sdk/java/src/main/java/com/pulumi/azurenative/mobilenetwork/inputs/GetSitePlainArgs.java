// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSitePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSitePlainArgs Empty = new GetSitePlainArgs();

    /**
     * The name of the mobile network.
     * 
     */
    @Import(name="mobileNetworkName", required=true)
    private String mobileNetworkName;

    /**
     * @return The name of the mobile network.
     * 
     */
    public String mobileNetworkName() {
        return this.mobileNetworkName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the mobile network site.
     * 
     */
    @Import(name="siteName", required=true)
    private String siteName;

    /**
     * @return The name of the mobile network site.
     * 
     */
    public String siteName() {
        return this.siteName;
    }

    private GetSitePlainArgs() {}

    private GetSitePlainArgs(GetSitePlainArgs $) {
        this.mobileNetworkName = $.mobileNetworkName;
        this.resourceGroupName = $.resourceGroupName;
        this.siteName = $.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSitePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSitePlainArgs $;

        public Builder() {
            $ = new GetSitePlainArgs();
        }

        public Builder(GetSitePlainArgs defaults) {
            $ = new GetSitePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileNetworkName The name of the mobile network.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkName(String mobileNetworkName) {
            $.mobileNetworkName = mobileNetworkName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param siteName The name of the mobile network site.
         * 
         * @return builder
         * 
         */
        public Builder siteName(String siteName) {
            $.siteName = siteName;
            return this;
        }

        public GetSitePlainArgs build() {
            $.mobileNetworkName = Objects.requireNonNull($.mobileNetworkName, "expected parameter 'mobileNetworkName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.siteName = Objects.requireNonNull($.siteName, "expected parameter 'siteName' to be non-null");
            return $;
        }
    }

}
