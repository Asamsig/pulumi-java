// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagPlainArgs Empty = new GetTagPlainArgs();

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

    /**
     * Tag identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="tagId", required=true)
    private String tagId;

    /**
     * @return Tag identifier. Must be unique in the current API Management service instance.
     * 
     */
    public String tagId() {
        return this.tagId;
    }

    private GetTagPlainArgs() {}

    private GetTagPlainArgs(GetTagPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.tagId = $.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagPlainArgs $;

        public Builder() {
            $ = new GetTagPlainArgs();
        }

        public Builder(GetTagPlainArgs defaults) {
            $ = new GetTagPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param tagId Tag identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder tagId(String tagId) {
            $.tagId = tagId;
            return this;
        }

        public GetTagPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.tagId = Objects.requireNonNull($.tagId, "expected parameter 'tagId' to be non-null");
            return $;
        }
    }

}
