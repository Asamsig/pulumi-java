// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListKustoPoolLanguageExtensionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListKustoPoolLanguageExtensionsArgs Empty = new ListKustoPoolLanguageExtensionsArgs();

    /**
     * The name of the Kusto pool.
     * 
     */
    @Import(name="kustoPoolName", required=true)
    private Output<String> kustoPoolName;

    /**
     * @return The name of the Kusto pool.
     * 
     */
    public Output<String> kustoPoolName() {
        return this.kustoPoolName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
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

    private ListKustoPoolLanguageExtensionsArgs() {}

    private ListKustoPoolLanguageExtensionsArgs(ListKustoPoolLanguageExtensionsArgs $) {
        this.kustoPoolName = $.kustoPoolName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListKustoPoolLanguageExtensionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListKustoPoolLanguageExtensionsArgs $;

        public Builder() {
            $ = new ListKustoPoolLanguageExtensionsArgs();
        }

        public Builder(ListKustoPoolLanguageExtensionsArgs defaults) {
            $ = new ListKustoPoolLanguageExtensionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kustoPoolName The name of the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder kustoPoolName(Output<String> kustoPoolName) {
            $.kustoPoolName = kustoPoolName;
            return this;
        }

        /**
         * @param kustoPoolName The name of the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder kustoPoolName(String kustoPoolName) {
            return kustoPoolName(Output.of(kustoPoolName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
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

        public ListKustoPoolLanguageExtensionsArgs build() {
            $.kustoPoolName = Objects.requireNonNull($.kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
