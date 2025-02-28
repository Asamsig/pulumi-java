// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTriggerArgs Empty = new GetTriggerArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private Output<String> factoryName;

    /**
     * @return The factory name.
     * 
     */
    public Output<String> factoryName() {
        return this.factoryName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The trigger name.
     * 
     */
    @Import(name="triggerName", required=true)
    private Output<String> triggerName;

    /**
     * @return The trigger name.
     * 
     */
    public Output<String> triggerName() {
        return this.triggerName;
    }

    private GetTriggerArgs() {}

    private GetTriggerArgs(GetTriggerArgs $) {
        this.factoryName = $.factoryName;
        this.resourceGroupName = $.resourceGroupName;
        this.triggerName = $.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTriggerArgs $;

        public Builder() {
            $ = new GetTriggerArgs();
        }

        public Builder(GetTriggerArgs defaults) {
            $ = new GetTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(Output<String> factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            return factoryName(Output.of(factoryName));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param triggerName The trigger name.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(Output<String> triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        /**
         * @param triggerName The trigger name.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(String triggerName) {
            return triggerName(Output.of(triggerName));
        }

        public GetTriggerArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            return $;
        }
    }

}
