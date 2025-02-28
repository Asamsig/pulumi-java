// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf.inputs;

import com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionMatchVariableArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyCustomRuleMatchConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyCustomRuleMatchConditionArgs Empty = new PolicyCustomRuleMatchConditionArgs();

    /**
     * A list of match values.
     * 
     */
    @Import(name="matchValues", required=true)
    private Output<List<String>> matchValues;

    /**
     * @return A list of match values.
     * 
     */
    public Output<List<String>> matchValues() {
        return this.matchValues;
    }

    /**
     * One or more `match_variables` blocks as defined below.
     * 
     */
    @Import(name="matchVariables", required=true)
    private Output<List<PolicyCustomRuleMatchConditionMatchVariableArgs>> matchVariables;

    /**
     * @return One or more `match_variables` blocks as defined below.
     * 
     */
    public Output<List<PolicyCustomRuleMatchConditionMatchVariableArgs>> matchVariables() {
        return this.matchVariables;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @Import(name="negationCondition")
    private @Nullable Output<Boolean> negationCondition;

    /**
     * @return Describes if this is negate condition or not
     * 
     */
    public Optional<Output<Boolean>> negationCondition() {
        return Optional.ofNullable(this.negationCondition);
    }

    /**
     * Describes operator to be matched.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return Describes operator to be matched.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * A list of transformations to do before the match is attempted.
     * 
     */
    @Import(name="transforms")
    private @Nullable Output<List<String>> transforms;

    /**
     * @return A list of transformations to do before the match is attempted.
     * 
     */
    public Optional<Output<List<String>>> transforms() {
        return Optional.ofNullable(this.transforms);
    }

    private PolicyCustomRuleMatchConditionArgs() {}

    private PolicyCustomRuleMatchConditionArgs(PolicyCustomRuleMatchConditionArgs $) {
        this.matchValues = $.matchValues;
        this.matchVariables = $.matchVariables;
        this.negationCondition = $.negationCondition;
        this.operator = $.operator;
        this.transforms = $.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyCustomRuleMatchConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyCustomRuleMatchConditionArgs $;

        public Builder() {
            $ = new PolicyCustomRuleMatchConditionArgs();
        }

        public Builder(PolicyCustomRuleMatchConditionArgs defaults) {
            $ = new PolicyCustomRuleMatchConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchValues A list of match values.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(Output<List<String>> matchValues) {
            $.matchValues = matchValues;
            return this;
        }

        /**
         * @param matchValues A list of match values.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(List<String> matchValues) {
            return matchValues(Output.of(matchValues));
        }

        /**
         * @param matchValues A list of match values.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }

        /**
         * @param matchVariables One or more `match_variables` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder matchVariables(Output<List<PolicyCustomRuleMatchConditionMatchVariableArgs>> matchVariables) {
            $.matchVariables = matchVariables;
            return this;
        }

        /**
         * @param matchVariables One or more `match_variables` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder matchVariables(List<PolicyCustomRuleMatchConditionMatchVariableArgs> matchVariables) {
            return matchVariables(Output.of(matchVariables));
        }

        /**
         * @param matchVariables One or more `match_variables` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder matchVariables(PolicyCustomRuleMatchConditionMatchVariableArgs... matchVariables) {
            return matchVariables(List.of(matchVariables));
        }

        /**
         * @param negationCondition Describes if this is negate condition or not
         * 
         * @return builder
         * 
         */
        public Builder negationCondition(@Nullable Output<Boolean> negationCondition) {
            $.negationCondition = negationCondition;
            return this;
        }

        /**
         * @param negationCondition Describes if this is negate condition or not
         * 
         * @return builder
         * 
         */
        public Builder negationCondition(Boolean negationCondition) {
            return negationCondition(Output.of(negationCondition));
        }

        /**
         * @param operator Describes operator to be matched.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Describes operator to be matched.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param transforms A list of transformations to do before the match is attempted.
         * 
         * @return builder
         * 
         */
        public Builder transforms(@Nullable Output<List<String>> transforms) {
            $.transforms = transforms;
            return this;
        }

        /**
         * @param transforms A list of transformations to do before the match is attempted.
         * 
         * @return builder
         * 
         */
        public Builder transforms(List<String> transforms) {
            return transforms(Output.of(transforms));
        }

        /**
         * @param transforms A list of transformations to do before the match is attempted.
         * 
         * @return builder
         * 
         */
        public Builder transforms(String... transforms) {
            return transforms(List.of(transforms));
        }

        public PolicyCustomRuleMatchConditionArgs build() {
            $.matchValues = Objects.requireNonNull($.matchValues, "expected parameter 'matchValues' to be non-null");
            $.matchVariables = Objects.requireNonNull($.matchVariables, "expected parameter 'matchVariables' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            return $;
        }
    }

}
