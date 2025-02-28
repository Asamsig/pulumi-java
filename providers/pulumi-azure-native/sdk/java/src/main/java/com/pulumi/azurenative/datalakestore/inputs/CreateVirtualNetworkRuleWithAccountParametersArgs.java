// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters used to create a new virtual network rule while creating a new Data Lake Store account.
 * 
 */
public final class CreateVirtualNetworkRuleWithAccountParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final CreateVirtualNetworkRuleWithAccountParametersArgs Empty = new CreateVirtualNetworkRuleWithAccountParametersArgs();

    /**
     * The unique name of the virtual network rule to create.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the virtual network rule to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The resource identifier for the subnet.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The resource identifier for the subnet.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private CreateVirtualNetworkRuleWithAccountParametersArgs() {}

    private CreateVirtualNetworkRuleWithAccountParametersArgs(CreateVirtualNetworkRuleWithAccountParametersArgs $) {
        this.name = $.name;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreateVirtualNetworkRuleWithAccountParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreateVirtualNetworkRuleWithAccountParametersArgs $;

        public Builder() {
            $ = new CreateVirtualNetworkRuleWithAccountParametersArgs();
        }

        public Builder(CreateVirtualNetworkRuleWithAccountParametersArgs defaults) {
            $ = new CreateVirtualNetworkRuleWithAccountParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The unique name of the virtual network rule to create.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the virtual network rule to create.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param subnetId The resource identifier for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The resource identifier for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public CreateVirtualNetworkRuleWithAccountParametersArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
