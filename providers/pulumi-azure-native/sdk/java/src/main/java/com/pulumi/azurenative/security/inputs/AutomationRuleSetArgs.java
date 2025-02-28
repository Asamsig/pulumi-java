// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.inputs.AutomationTriggeringRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule set which evaluates all its rules upon an event interception. Only when all the included rules in the rule set will be evaluated as &#39;true&#39;, will the event trigger the defined actions.
 * 
 */
public final class AutomationRuleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationRuleSetArgs Empty = new AutomationRuleSetArgs();

    @Import(name="rules")
    private @Nullable Output<List<AutomationTriggeringRuleArgs>> rules;

    public Optional<Output<List<AutomationTriggeringRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private AutomationRuleSetArgs() {}

    private AutomationRuleSetArgs(AutomationRuleSetArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleSetArgs $;

        public Builder() {
            $ = new AutomationRuleSetArgs();
        }

        public Builder(AutomationRuleSetArgs defaults) {
            $ = new AutomationRuleSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(@Nullable Output<List<AutomationTriggeringRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<AutomationTriggeringRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(AutomationTriggeringRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public AutomationRuleSetArgs build() {
            return $;
        }
    }

}
