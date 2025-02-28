// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStandardArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStandardArgs Empty = new GetStandardArgs();

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
     * The Security Standard key - unique key for the standard type
     * 
     */
    @Import(name="standardId", required=true)
    private Output<String> standardId;

    /**
     * @return The Security Standard key - unique key for the standard type
     * 
     */
    public Output<String> standardId() {
        return this.standardId;
    }

    private GetStandardArgs() {}

    private GetStandardArgs(GetStandardArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.standardId = $.standardId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStandardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStandardArgs $;

        public Builder() {
            $ = new GetStandardArgs();
        }

        public Builder(GetStandardArgs defaults) {
            $ = new GetStandardArgs(Objects.requireNonNull(defaults));
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
         * @param standardId The Security Standard key - unique key for the standard type
         * 
         * @return builder
         * 
         */
        public Builder standardId(Output<String> standardId) {
            $.standardId = standardId;
            return this;
        }

        /**
         * @param standardId The Security Standard key - unique key for the standard type
         * 
         * @return builder
         * 
         */
        public Builder standardId(String standardId) {
            return standardId(Output.of(standardId));
        }

        public GetStandardArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.standardId = Objects.requireNonNull($.standardId, "expected parameter 'standardId' to be non-null");
            return $;
        }
    }

}
