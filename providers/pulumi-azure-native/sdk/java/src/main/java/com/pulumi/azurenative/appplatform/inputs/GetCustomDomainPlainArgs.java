// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomDomainPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomDomainPlainArgs Empty = new GetCustomDomainPlainArgs();

    /**
     * The name of the App resource.
     * 
     */
    @Import(name="appName", required=true)
    private String appName;

    /**
     * @return The name of the App resource.
     * 
     */
    public String appName() {
        return this.appName;
    }

    /**
     * The name of the custom domain resource.
     * 
     */
    @Import(name="domainName", required=true)
    private String domainName;

    /**
     * @return The name of the custom domain resource.
     * 
     */
    public String domainName() {
        return this.domainName;
    }

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
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the Service resource.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetCustomDomainPlainArgs() {}

    private GetCustomDomainPlainArgs(GetCustomDomainPlainArgs $) {
        this.appName = $.appName;
        this.domainName = $.domainName;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomDomainPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomDomainPlainArgs $;

        public Builder() {
            $ = new GetCustomDomainPlainArgs();
        }

        public Builder(GetCustomDomainPlainArgs defaults) {
            $ = new GetCustomDomainPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appName The name of the App resource.
         * 
         * @return builder
         * 
         */
        public Builder appName(String appName) {
            $.appName = appName;
            return this;
        }

        /**
         * @param domainName The name of the custom domain resource.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
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
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetCustomDomainPlainArgs build() {
            $.appName = Objects.requireNonNull($.appName, "expected parameter 'appName' to be non-null");
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
