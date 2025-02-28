// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBookmarkRelationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBookmarkRelationArgs Empty = new GetBookmarkRelationArgs();

    /**
     * Bookmark ID
     * 
     */
    @Import(name="bookmarkId", required=true)
    private Output<String> bookmarkId;

    /**
     * @return Bookmark ID
     * 
     */
    public Output<String> bookmarkId() {
        return this.bookmarkId;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private Output<String> operationalInsightsResourceProvider;

    /**
     * @return The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    public Output<String> operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * Relation Name
     * 
     */
    @Import(name="relationName", required=true)
    private Output<String> relationName;

    /**
     * @return Relation Name
     * 
     */
    public Output<String> relationName() {
        return this.relationName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private GetBookmarkRelationArgs() {}

    private GetBookmarkRelationArgs(GetBookmarkRelationArgs $) {
        this.bookmarkId = $.bookmarkId;
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.relationName = $.relationName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBookmarkRelationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBookmarkRelationArgs $;

        public Builder() {
            $ = new GetBookmarkRelationArgs();
        }

        public Builder(GetBookmarkRelationArgs defaults) {
            $ = new GetBookmarkRelationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bookmarkId Bookmark ID
         * 
         * @return builder
         * 
         */
        public Builder bookmarkId(Output<String> bookmarkId) {
            $.bookmarkId = bookmarkId;
            return this;
        }

        /**
         * @param bookmarkId Bookmark ID
         * 
         * @return builder
         * 
         */
        public Builder bookmarkId(String bookmarkId) {
            return bookmarkId(Output.of(bookmarkId));
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            return operationalInsightsResourceProvider(Output.of(operationalInsightsResourceProvider));
        }

        /**
         * @param relationName Relation Name
         * 
         * @return builder
         * 
         */
        public Builder relationName(Output<String> relationName) {
            $.relationName = relationName;
            return this;
        }

        /**
         * @param relationName Relation Name
         * 
         * @return builder
         * 
         */
        public Builder relationName(String relationName) {
            return relationName(Output.of(relationName));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public GetBookmarkRelationArgs build() {
            $.bookmarkId = Objects.requireNonNull($.bookmarkId, "expected parameter 'bookmarkId' to be non-null");
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.relationName = Objects.requireNonNull($.relationName, "expected parameter 'relationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
