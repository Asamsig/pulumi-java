// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybriddata.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataStorePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataStorePlainArgs Empty = new GetDataStorePlainArgs();

    /**
     * The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @Import(name="dataManagerName", required=true)
    private String dataManagerName;

    /**
     * @return The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    public String dataManagerName() {
        return this.dataManagerName;
    }

    /**
     * The data store/repository name queried.
     * 
     */
    @Import(name="dataStoreName", required=true)
    private String dataStoreName;

    /**
     * @return The data store/repository name queried.
     * 
     */
    public String dataStoreName() {
        return this.dataStoreName;
    }

    /**
     * The Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Resource Group Name
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDataStorePlainArgs() {}

    private GetDataStorePlainArgs(GetDataStorePlainArgs $) {
        this.dataManagerName = $.dataManagerName;
        this.dataStoreName = $.dataStoreName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataStorePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataStorePlainArgs $;

        public Builder() {
            $ = new GetDataStorePlainArgs();
        }

        public Builder(GetDataStorePlainArgs defaults) {
            $ = new GetDataStorePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
         * 
         * @return builder
         * 
         */
        public Builder dataManagerName(String dataManagerName) {
            $.dataManagerName = dataManagerName;
            return this;
        }

        /**
         * @param dataStoreName The data store/repository name queried.
         * 
         * @return builder
         * 
         */
        public Builder dataStoreName(String dataStoreName) {
            $.dataStoreName = dataStoreName;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group Name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDataStorePlainArgs build() {
            $.dataManagerName = Objects.requireNonNull($.dataManagerName, "expected parameter 'dataManagerName' to be non-null");
            $.dataStoreName = Objects.requireNonNull($.dataStoreName, "expected parameter 'dataStoreName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
