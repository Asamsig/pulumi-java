// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContentTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentTypeArgs Empty = new ContentTypeArgs();

    /**
     * Content type identifier.
     * 
     */
    @Import(name="contentTypeId")
    private @Nullable Output<String> contentTypeId;

    /**
     * @return Content type identifier.
     * 
     */
    public Optional<Output<String>> contentTypeId() {
        return Optional.ofNullable(this.contentTypeId);
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

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ContentTypeArgs() {}

    private ContentTypeArgs(ContentTypeArgs $) {
        this.contentTypeId = $.contentTypeId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentTypeArgs $;

        public Builder() {
            $ = new ContentTypeArgs();
        }

        public Builder(ContentTypeArgs defaults) {
            $ = new ContentTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentTypeId Content type identifier.
         * 
         * @return builder
         * 
         */
        public Builder contentTypeId(@Nullable Output<String> contentTypeId) {
            $.contentTypeId = contentTypeId;
            return this;
        }

        /**
         * @param contentTypeId Content type identifier.
         * 
         * @return builder
         * 
         */
        public Builder contentTypeId(String contentTypeId) {
            return contentTypeId(Output.of(contentTypeId));
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

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ContentTypeArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
