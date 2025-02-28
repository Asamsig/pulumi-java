// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.azurenative.securityinsights.outputs.AutomationRulePropertyValuesConditionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationRuleTriggeringLogicResponse {
    /**
     * @return The conditions to evaluate to determine if the automation rule should be triggered on a given object
     * 
     */
    private final @Nullable List<AutomationRulePropertyValuesConditionResponse> conditions;
    /**
     * @return Determines when the automation rule should automatically expire and be disabled.
     * 
     */
    private final @Nullable String expirationTimeUtc;
    /**
     * @return Determines whether the automation rule is enabled or disabled.
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return The type of object the automation rule triggers on
     * 
     */
    private final String triggersOn;
    /**
     * @return The type of event the automation rule triggers on
     * 
     */
    private final String triggersWhen;

    @CustomType.Constructor
    private AutomationRuleTriggeringLogicResponse(
        @CustomType.Parameter("conditions") @Nullable List<AutomationRulePropertyValuesConditionResponse> conditions,
        @CustomType.Parameter("expirationTimeUtc") @Nullable String expirationTimeUtc,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("triggersOn") String triggersOn,
        @CustomType.Parameter("triggersWhen") String triggersWhen) {
        this.conditions = conditions;
        this.expirationTimeUtc = expirationTimeUtc;
        this.isEnabled = isEnabled;
        this.triggersOn = triggersOn;
        this.triggersWhen = triggersWhen;
    }

    /**
     * @return The conditions to evaluate to determine if the automation rule should be triggered on a given object
     * 
     */
    public List<AutomationRulePropertyValuesConditionResponse> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return Determines when the automation rule should automatically expire and be disabled.
     * 
     */
    public Optional<String> expirationTimeUtc() {
        return Optional.ofNullable(this.expirationTimeUtc);
    }
    /**
     * @return Determines whether the automation rule is enabled or disabled.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return The type of object the automation rule triggers on
     * 
     */
    public String triggersOn() {
        return this.triggersOn;
    }
    /**
     * @return The type of event the automation rule triggers on
     * 
     */
    public String triggersWhen() {
        return this.triggersWhen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleTriggeringLogicResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AutomationRulePropertyValuesConditionResponse> conditions;
        private @Nullable String expirationTimeUtc;
        private Boolean isEnabled;
        private String triggersOn;
        private String triggersWhen;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleTriggeringLogicResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.expirationTimeUtc = defaults.expirationTimeUtc;
    	      this.isEnabled = defaults.isEnabled;
    	      this.triggersOn = defaults.triggersOn;
    	      this.triggersWhen = defaults.triggersWhen;
        }

        public Builder conditions(@Nullable List<AutomationRulePropertyValuesConditionResponse> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(AutomationRulePropertyValuesConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder expirationTimeUtc(@Nullable String expirationTimeUtc) {
            this.expirationTimeUtc = expirationTimeUtc;
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder triggersOn(String triggersOn) {
            this.triggersOn = Objects.requireNonNull(triggersOn);
            return this;
        }
        public Builder triggersWhen(String triggersWhen) {
            this.triggersWhen = Objects.requireNonNull(triggersWhen);
            return this;
        }        public AutomationRuleTriggeringLogicResponse build() {
            return new AutomationRuleTriggeringLogicResponse(conditions, expirationTimeUtc, isEnabled, triggersOn, triggersWhen);
        }
    }
}
