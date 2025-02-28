// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AutoHealActionsResponse;
import com.pulumi.azurenative.web.outputs.AutoHealTriggersResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoHealRulesResponse {
    /**
     * @return Actions to be executed when a rule is triggered.
     * 
     */
    private final @Nullable AutoHealActionsResponse actions;
    /**
     * @return Conditions that describe when to execute the auto-heal actions.
     * 
     */
    private final @Nullable AutoHealTriggersResponse triggers;

    @CustomType.Constructor
    private AutoHealRulesResponse(
        @CustomType.Parameter("actions") @Nullable AutoHealActionsResponse actions,
        @CustomType.Parameter("triggers") @Nullable AutoHealTriggersResponse triggers) {
        this.actions = actions;
        this.triggers = triggers;
    }

    /**
     * @return Actions to be executed when a rule is triggered.
     * 
     */
    public Optional<AutoHealActionsResponse> actions() {
        return Optional.ofNullable(this.actions);
    }
    /**
     * @return Conditions that describe when to execute the auto-heal actions.
     * 
     */
    public Optional<AutoHealTriggersResponse> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoHealActionsResponse actions;
        private @Nullable AutoHealTriggersResponse triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.triggers = defaults.triggers;
        }

        public Builder actions(@Nullable AutoHealActionsResponse actions) {
            this.actions = actions;
            return this;
        }
        public Builder triggers(@Nullable AutoHealTriggersResponse triggers) {
            this.triggers = triggers;
            return this;
        }        public AutoHealRulesResponse build() {
            return new AutoHealRulesResponse(actions, triggers);
        }
    }
}
