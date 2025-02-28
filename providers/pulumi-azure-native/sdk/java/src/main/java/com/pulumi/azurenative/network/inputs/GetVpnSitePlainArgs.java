// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVpnSitePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpnSitePlainArgs Empty = new GetVpnSitePlainArgs();

    /**
     * The resource group name of the VpnSite.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name of the VpnSite.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VpnSite being retrieved.
     * 
     */
    @Import(name="vpnSiteName", required=true)
    private String vpnSiteName;

    /**
     * @return The name of the VpnSite being retrieved.
     * 
     */
    public String vpnSiteName() {
        return this.vpnSiteName;
    }

    private GetVpnSitePlainArgs() {}

    private GetVpnSitePlainArgs(GetVpnSitePlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.vpnSiteName = $.vpnSiteName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpnSitePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpnSitePlainArgs $;

        public Builder() {
            $ = new GetVpnSitePlainArgs();
        }

        public Builder(GetVpnSitePlainArgs defaults) {
            $ = new GetVpnSitePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The resource group name of the VpnSite.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vpnSiteName The name of the VpnSite being retrieved.
         * 
         * @return builder
         * 
         */
        public Builder vpnSiteName(String vpnSiteName) {
            $.vpnSiteName = vpnSiteName;
            return this;
        }

        public GetVpnSitePlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vpnSiteName = Objects.requireNonNull($.vpnSiteName, "expected parameter 'vpnSiteName' to be non-null");
            return $;
        }
    }

}
