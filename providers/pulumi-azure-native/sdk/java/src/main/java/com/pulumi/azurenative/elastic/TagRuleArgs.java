// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elastic;

import com.pulumi.azurenative.elastic.inputs.MonitoringTagRulesPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagRuleArgs Empty = new TagRuleArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private Output<String> monitorName;

    /**
     * @return Monitor resource name
     * 
     */
    public Output<String> monitorName() {
        return this.monitorName;
    }

    /**
     * Properties of the monitoring tag rules.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<MonitoringTagRulesPropertiesArgs> properties;

    /**
     * @return Properties of the monitoring tag rules.
     * 
     */
    public Optional<Output<MonitoringTagRulesPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group to which the Elastic resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to which the Elastic resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tag Rule Set resource name
     * 
     */
    @Import(name="ruleSetName")
    private @Nullable Output<String> ruleSetName;

    /**
     * @return Tag Rule Set resource name
     * 
     */
    public Optional<Output<String>> ruleSetName() {
        return Optional.ofNullable(this.ruleSetName);
    }

    private TagRuleArgs() {}

    private TagRuleArgs(TagRuleArgs $) {
        this.monitorName = $.monitorName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleSetName = $.ruleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagRuleArgs $;

        public Builder() {
            $ = new TagRuleArgs();
        }

        public Builder(TagRuleArgs defaults) {
            $ = new TagRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(Output<String> monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(String monitorName) {
            return monitorName(Output.of(monitorName));
        }

        /**
         * @param properties Properties of the monitoring tag rules.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<MonitoringTagRulesPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of the monitoring tag rules.
         * 
         * @return builder
         * 
         */
        public Builder properties(MonitoringTagRulesPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param ruleSetName Tag Rule Set resource name
         * 
         * @return builder
         * 
         */
        public Builder ruleSetName(@Nullable Output<String> ruleSetName) {
            $.ruleSetName = ruleSetName;
            return this;
        }

        /**
         * @param ruleSetName Tag Rule Set resource name
         * 
         * @return builder
         * 
         */
        public Builder ruleSetName(String ruleSetName) {
            return ruleSetName(Output.of(ruleSetName));
        }

        public TagRuleArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
