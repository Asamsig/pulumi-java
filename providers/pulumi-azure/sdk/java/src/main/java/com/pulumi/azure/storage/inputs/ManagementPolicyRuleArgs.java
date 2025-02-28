// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.ManagementPolicyRuleActionsArgs;
import com.pulumi.azure.storage.inputs.ManagementPolicyRuleFiltersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyRuleArgs Empty = new ManagementPolicyRuleArgs();

    /**
     * An `actions` block as documented below.
     * 
     */
    @Import(name="actions", required=true)
    private Output<ManagementPolicyRuleActionsArgs> actions;

    /**
     * @return An `actions` block as documented below.
     * 
     */
    public Output<ManagementPolicyRuleActionsArgs> actions() {
        return this.actions;
    }

    /**
     * Boolean to specify whether the rule is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Boolean to specify whether the rule is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * A `filter` block as documented below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<ManagementPolicyRuleFiltersArgs> filters;

    /**
     * @return A `filter` block as documented below.
     * 
     */
    public Optional<Output<ManagementPolicyRuleFiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ManagementPolicyRuleArgs() {}

    private ManagementPolicyRuleArgs(ManagementPolicyRuleArgs $) {
        this.actions = $.actions;
        this.enabled = $.enabled;
        this.filters = $.filters;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyRuleArgs $;

        public Builder() {
            $ = new ManagementPolicyRuleArgs();
        }

        public Builder(ManagementPolicyRuleArgs defaults) {
            $ = new ManagementPolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions An `actions` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<ManagementPolicyRuleActionsArgs> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions An `actions` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder actions(ManagementPolicyRuleActionsArgs actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param enabled Boolean to specify whether the rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean to specify whether the rule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filters A `filter` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<ManagementPolicyRuleFiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A `filter` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(ManagementPolicyRuleFiltersArgs filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param name A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ManagementPolicyRuleArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
