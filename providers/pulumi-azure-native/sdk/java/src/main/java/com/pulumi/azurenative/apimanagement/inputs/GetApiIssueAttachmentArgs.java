// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiIssueAttachmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiIssueAttachmentArgs Empty = new GetApiIssueAttachmentArgs();

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return API identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Attachment identifier within an Issue. Must be unique in the current Issue.
     * 
     */
    @Import(name="attachmentId", required=true)
    private Output<String> attachmentId;

    /**
     * @return Attachment identifier within an Issue. Must be unique in the current Issue.
     * 
     */
    public Output<String> attachmentId() {
        return this.attachmentId;
    }

    /**
     * Issue identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="issueId", required=true)
    private Output<String> issueId;

    /**
     * @return Issue identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> issueId() {
        return this.issueId;
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

    private GetApiIssueAttachmentArgs() {}

    private GetApiIssueAttachmentArgs(GetApiIssueAttachmentArgs $) {
        this.apiId = $.apiId;
        this.attachmentId = $.attachmentId;
        this.issueId = $.issueId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiIssueAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiIssueAttachmentArgs $;

        public Builder() {
            $ = new GetApiIssueAttachmentArgs();
        }

        public Builder(GetApiIssueAttachmentArgs defaults) {
            $ = new GetApiIssueAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param attachmentId Attachment identifier within an Issue. Must be unique in the current Issue.
         * 
         * @return builder
         * 
         */
        public Builder attachmentId(Output<String> attachmentId) {
            $.attachmentId = attachmentId;
            return this;
        }

        /**
         * @param attachmentId Attachment identifier within an Issue. Must be unique in the current Issue.
         * 
         * @return builder
         * 
         */
        public Builder attachmentId(String attachmentId) {
            return attachmentId(Output.of(attachmentId));
        }

        /**
         * @param issueId Issue identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder issueId(Output<String> issueId) {
            $.issueId = issueId;
            return this;
        }

        /**
         * @param issueId Issue identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder issueId(String issueId) {
            return issueId(Output.of(issueId));
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

        public GetApiIssueAttachmentArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.attachmentId = Objects.requireNonNull($.attachmentId, "expected parameter 'attachmentId' to be non-null");
            $.issueId = Objects.requireNonNull($.issueId, "expected parameter 'issueId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
