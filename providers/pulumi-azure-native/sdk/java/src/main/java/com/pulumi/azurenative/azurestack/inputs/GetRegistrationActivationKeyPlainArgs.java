// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegistrationActivationKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistrationActivationKeyPlainArgs Empty = new GetRegistrationActivationKeyPlainArgs();

    /**
     * Name of the Azure Stack registration.
     * 
     */
    @Import(name="registrationName", required=true)
    private String registrationName;

    /**
     * @return Name of the Azure Stack registration.
     * 
     */
    public String registrationName() {
        return this.registrationName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private String resourceGroup;

    /**
     * @return Name of the resource group.
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    private GetRegistrationActivationKeyPlainArgs() {}

    private GetRegistrationActivationKeyPlainArgs(GetRegistrationActivationKeyPlainArgs $) {
        this.registrationName = $.registrationName;
        this.resourceGroup = $.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistrationActivationKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistrationActivationKeyPlainArgs $;

        public Builder() {
            $ = new GetRegistrationActivationKeyPlainArgs();
        }

        public Builder(GetRegistrationActivationKeyPlainArgs defaults) {
            $ = new GetRegistrationActivationKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param registrationName Name of the Azure Stack registration.
         * 
         * @return builder
         * 
         */
        public Builder registrationName(String registrationName) {
            $.registrationName = registrationName;
            return this;
        }

        /**
         * @param resourceGroup Name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        public GetRegistrationActivationKeyPlainArgs build() {
            $.registrationName = Objects.requireNonNull($.registrationName, "expected parameter 'registrationName' to be non-null");
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            return $;
        }
    }

}
