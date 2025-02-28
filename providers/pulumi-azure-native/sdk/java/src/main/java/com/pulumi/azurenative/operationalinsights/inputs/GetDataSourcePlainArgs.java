// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataSourcePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataSourcePlainArgs Empty = new GetDataSourcePlainArgs();

    /**
     * Name of the datasource
     * 
     */
    @Import(name="dataSourceName", required=true)
    private String dataSourceName;

    /**
     * @return Name of the datasource
     * 
     */
    public String dataSourceName() {
        return this.dataSourceName;
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
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetDataSourcePlainArgs() {}

    private GetDataSourcePlainArgs(GetDataSourcePlainArgs $) {
        this.dataSourceName = $.dataSourceName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataSourcePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataSourcePlainArgs $;

        public Builder() {
            $ = new GetDataSourcePlainArgs();
        }

        public Builder(GetDataSourcePlainArgs defaults) {
            $ = new GetDataSourcePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataSourceName Name of the datasource
         * 
         * @return builder
         * 
         */
        public Builder dataSourceName(String dataSourceName) {
            $.dataSourceName = dataSourceName;
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
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetDataSourcePlainArgs build() {
            $.dataSourceName = Objects.requireNonNull($.dataSourceName, "expected parameter 'dataSourceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
