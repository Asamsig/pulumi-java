// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLabAccountRegionalAvailabilityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLabAccountRegionalAvailabilityPlainArgs Empty = new GetLabAccountRegionalAvailabilityPlainArgs();

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
    private String labAccountName;

    /**
     * @return The name of the lab Account.
     * 
     */
    public String labAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLabAccountRegionalAvailabilityPlainArgs() {}

    private GetLabAccountRegionalAvailabilityPlainArgs(GetLabAccountRegionalAvailabilityPlainArgs $) {
        this.labAccountName = $.labAccountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLabAccountRegionalAvailabilityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLabAccountRegionalAvailabilityPlainArgs $;

        public Builder() {
            $ = new GetLabAccountRegionalAvailabilityPlainArgs();
        }

        public Builder(GetLabAccountRegionalAvailabilityPlainArgs defaults) {
            $ = new GetLabAccountRegionalAvailabilityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labAccountName The name of the lab Account.
         * 
         * @return builder
         * 
         */
        public Builder labAccountName(String labAccountName) {
            $.labAccountName = labAccountName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetLabAccountRegionalAvailabilityPlainArgs build() {
            $.labAccountName = Objects.requireNonNull($.labAccountName, "expected parameter 'labAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
