// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ActionRuleSuppressionConditionMonitor {
    /**
     * @return The operator for a given condition. Possible values are `Equals` and `NotEquals`.
     * 
     */
    private final String operator;
    /**
     * @return A list of values to match for a given condition. Possible values are `Fired` and `Resolved`.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private ActionRuleSuppressionConditionMonitor(
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("values") List<String> values) {
        this.operator = operator;
        this.values = values;
    }

    /**
     * @return The operator for a given condition. Possible values are `Equals` and `NotEquals`.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return A list of values to match for a given condition. Possible values are `Fired` and `Resolved`.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionRuleSuppressionConditionMonitor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionRuleSuppressionConditionMonitor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ActionRuleSuppressionConditionMonitor build() {
            return new ActionRuleSuppressionConditionMonitor(operator, values);
        }
    }
}
