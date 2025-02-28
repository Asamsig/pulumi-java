// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataControllerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataControllerPlainArgs Empty = new GetDataControllerPlainArgs();

    @Import(name="dataControllerName", required=true)
    private String dataControllerName;

    public String dataControllerName() {
        return this.dataControllerName;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Azure resource group
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDataControllerPlainArgs() {}

    private GetDataControllerPlainArgs(GetDataControllerPlainArgs $) {
        this.dataControllerName = $.dataControllerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataControllerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataControllerPlainArgs $;

        public Builder() {
            $ = new GetDataControllerPlainArgs();
        }

        public Builder(GetDataControllerPlainArgs defaults) {
            $ = new GetDataControllerPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataControllerName(String dataControllerName) {
            $.dataControllerName = dataControllerName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDataControllerPlainArgs build() {
            $.dataControllerName = Objects.requireNonNull($.dataControllerName, "expected parameter 'dataControllerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
