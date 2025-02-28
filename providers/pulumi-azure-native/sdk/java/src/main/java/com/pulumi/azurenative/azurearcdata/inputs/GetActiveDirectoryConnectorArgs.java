// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetActiveDirectoryConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetActiveDirectoryConnectorArgs Empty = new GetActiveDirectoryConnectorArgs();

    /**
     * The name of the Active Directory connector instance
     * 
     */
    @Import(name="activeDirectoryConnectorName", required=true)
    private Output<String> activeDirectoryConnectorName;

    /**
     * @return The name of the Active Directory connector instance
     * 
     */
    public Output<String> activeDirectoryConnectorName() {
        return this.activeDirectoryConnectorName;
    }

    /**
     * The name of the data controller
     * 
     */
    @Import(name="dataControllerName", required=true)
    private Output<String> dataControllerName;

    /**
     * @return The name of the data controller
     * 
     */
    public Output<String> dataControllerName() {
        return this.dataControllerName;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Azure resource group
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetActiveDirectoryConnectorArgs() {}

    private GetActiveDirectoryConnectorArgs(GetActiveDirectoryConnectorArgs $) {
        this.activeDirectoryConnectorName = $.activeDirectoryConnectorName;
        this.dataControllerName = $.dataControllerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetActiveDirectoryConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetActiveDirectoryConnectorArgs $;

        public Builder() {
            $ = new GetActiveDirectoryConnectorArgs();
        }

        public Builder(GetActiveDirectoryConnectorArgs defaults) {
            $ = new GetActiveDirectoryConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectoryConnectorName The name of the Active Directory connector instance
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryConnectorName(Output<String> activeDirectoryConnectorName) {
            $.activeDirectoryConnectorName = activeDirectoryConnectorName;
            return this;
        }

        /**
         * @param activeDirectoryConnectorName The name of the Active Directory connector instance
         * 
         * @return builder
         * 
         */
        public Builder activeDirectoryConnectorName(String activeDirectoryConnectorName) {
            return activeDirectoryConnectorName(Output.of(activeDirectoryConnectorName));
        }

        /**
         * @param dataControllerName The name of the data controller
         * 
         * @return builder
         * 
         */
        public Builder dataControllerName(Output<String> dataControllerName) {
            $.dataControllerName = dataControllerName;
            return this;
        }

        /**
         * @param dataControllerName The name of the data controller
         * 
         * @return builder
         * 
         */
        public Builder dataControllerName(String dataControllerName) {
            return dataControllerName(Output.of(dataControllerName));
        }

        /**
         * @param resourceGroupName The name of the Azure resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetActiveDirectoryConnectorArgs build() {
            $.activeDirectoryConnectorName = Objects.requireNonNull($.activeDirectoryConnectorName, "expected parameter 'activeDirectoryConnectorName' to be non-null");
            $.dataControllerName = Objects.requireNonNull($.dataControllerName, "expected parameter 'dataControllerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
