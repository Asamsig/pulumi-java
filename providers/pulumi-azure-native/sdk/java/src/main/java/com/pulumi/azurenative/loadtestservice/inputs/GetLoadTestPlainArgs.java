// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.loadtestservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLoadTestPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadTestPlainArgs Empty = new GetLoadTestPlainArgs();

    /**
     * Load Test name.
     * 
     */
    @Import(name="loadTestName", required=true)
    private String loadTestName;

    /**
     * @return Load Test name.
     * 
     */
    public String loadTestName() {
        return this.loadTestName;
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

    private GetLoadTestPlainArgs() {}

    private GetLoadTestPlainArgs(GetLoadTestPlainArgs $) {
        this.loadTestName = $.loadTestName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadTestPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadTestPlainArgs $;

        public Builder() {
            $ = new GetLoadTestPlainArgs();
        }

        public Builder(GetLoadTestPlainArgs defaults) {
            $ = new GetLoadTestPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loadTestName Load Test name.
         * 
         * @return builder
         * 
         */
        public Builder loadTestName(String loadTestName) {
            $.loadTestName = loadTestName;
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

        public GetLoadTestPlainArgs build() {
            $.loadTestName = Objects.requireNonNull($.loadTestName, "expected parameter 'loadTestName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
