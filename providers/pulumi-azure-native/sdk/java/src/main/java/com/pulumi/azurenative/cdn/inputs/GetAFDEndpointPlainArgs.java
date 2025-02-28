// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAFDEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAFDEndpointPlainArgs Empty = new GetAFDEndpointPlainArgs();

    /**
     * Name of the endpoint under the profile which is unique globally.
     * 
     */
    @Import(name="endpointName", required=true)
    private String endpointName;

    /**
     * @return Name of the endpoint under the profile which is unique globally.
     * 
     */
    public String endpointName() {
        return this.endpointName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
    private String profileName;

    /**
     * @return Name of the CDN profile which is unique within the resource group.
     * 
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAFDEndpointPlainArgs() {}

    private GetAFDEndpointPlainArgs(GetAFDEndpointPlainArgs $) {
        this.endpointName = $.endpointName;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAFDEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAFDEndpointPlainArgs $;

        public Builder() {
            $ = new GetAFDEndpointPlainArgs();
        }

        public Builder(GetAFDEndpointPlainArgs defaults) {
            $ = new GetAFDEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointName Name of the endpoint under the profile which is unique globally.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param profileName Name of the CDN profile which is unique within the resource group.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAFDEndpointPlainArgs build() {
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
