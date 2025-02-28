// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiReleaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiReleaseArgs Empty = new ApiReleaseArgs();

    /**
     * Identifier of the API the release belongs to.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return Identifier of the API the release belongs to.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Release Notes
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return Release Notes
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * Release identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="releaseId")
    private @Nullable Output<String> releaseId;

    /**
     * @return Release identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    public Optional<Output<String>> releaseId() {
        return Optional.ofNullable(this.releaseId);
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

    private ApiReleaseArgs() {}

    private ApiReleaseArgs(ApiReleaseArgs $) {
        this.apiId = $.apiId;
        this.notes = $.notes;
        this.releaseId = $.releaseId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiReleaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiReleaseArgs $;

        public Builder() {
            $ = new ApiReleaseArgs();
        }

        public Builder(ApiReleaseArgs defaults) {
            $ = new ApiReleaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId Identifier of the API the release belongs to.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId Identifier of the API the release belongs to.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param notes Release Notes
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes Release Notes
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        /**
         * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder releaseId(@Nullable Output<String> releaseId) {
            $.releaseId = releaseId;
            return this;
        }

        /**
         * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder releaseId(String releaseId) {
            return releaseId(Output.of(releaseId));
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

        public ApiReleaseArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
