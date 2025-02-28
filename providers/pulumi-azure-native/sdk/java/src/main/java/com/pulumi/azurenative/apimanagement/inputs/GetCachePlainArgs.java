// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCachePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCachePlainArgs Empty = new GetCachePlainArgs();

    /**
     * Identifier of the Cache entity. Cache identifier (should be either &#39;default&#39; or valid Azure region identifier).
     * 
     */
    @Import(name="cacheId", required=true)
    private String cacheId;

    /**
     * @return Identifier of the Cache entity. Cache identifier (should be either &#39;default&#39; or valid Azure region identifier).
     * 
     */
    public String cacheId() {
        return this.cacheId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetCachePlainArgs() {}

    private GetCachePlainArgs(GetCachePlainArgs $) {
        this.cacheId = $.cacheId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCachePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCachePlainArgs $;

        public Builder() {
            $ = new GetCachePlainArgs();
        }

        public Builder(GetCachePlainArgs defaults) {
            $ = new GetCachePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheId Identifier of the Cache entity. Cache identifier (should be either &#39;default&#39; or valid Azure region identifier).
         * 
         * @return builder
         * 
         */
        public Builder cacheId(String cacheId) {
            $.cacheId = cacheId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetCachePlainArgs build() {
            $.cacheId = Objects.requireNonNull($.cacheId, "expected parameter 'cacheId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
