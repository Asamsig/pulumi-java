// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineTopologyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineTopologyArgs Empty = new GetPipelineTopologyArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The Azure Video Analyzer account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Pipeline topology unique identifier.
     * 
     */
    @Import(name="pipelineTopologyName", required=true)
    private Output<String> pipelineTopologyName;

    /**
     * @return Pipeline topology unique identifier.
     * 
     */
    public Output<String> pipelineTopologyName() {
        return this.pipelineTopologyName;
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

    private GetPipelineTopologyArgs() {}

    private GetPipelineTopologyArgs(GetPipelineTopologyArgs $) {
        this.accountName = $.accountName;
        this.pipelineTopologyName = $.pipelineTopologyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelineTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelineTopologyArgs $;

        public Builder() {
            $ = new GetPipelineTopologyArgs();
        }

        public Builder(GetPipelineTopologyArgs defaults) {
            $ = new GetPipelineTopologyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param pipelineTopologyName Pipeline topology unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder pipelineTopologyName(Output<String> pipelineTopologyName) {
            $.pipelineTopologyName = pipelineTopologyName;
            return this;
        }

        /**
         * @param pipelineTopologyName Pipeline topology unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder pipelineTopologyName(String pipelineTopologyName) {
            return pipelineTopologyName(Output.of(pipelineTopologyName));
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

        public GetPipelineTopologyArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.pipelineTopologyName = Objects.requireNonNull($.pipelineTopologyName, "expected parameter 'pipelineTopologyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
