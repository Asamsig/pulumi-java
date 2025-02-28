// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaConditionArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleBoostActionArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleFilterActionArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleIgnoreActionArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleRedirectActionArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleReplacementActionArgs;
import com.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule is a condition-action pair * A condition defines when a rule is to be triggered. * An action specifies what occurs on that trigger. Currently only boost rules are supported. Currently only supported by the search endpoint.
 * 
 */
public final class GoogleCloudRetailV2alphaRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleArgs Empty = new GoogleCloudRetailV2alphaRuleArgs();

    /**
     * A boost action.
     * 
     */
    @Import(name="boostAction")
    private @Nullable Output<GoogleCloudRetailV2alphaRuleBoostActionArgs> boostAction;

    /**
     * @return A boost action.
     * 
     */
    public Optional<Output<GoogleCloudRetailV2alphaRuleBoostActionArgs>> boostAction() {
        return Optional.ofNullable(this.boostAction);
    }

    /**
     * The condition that triggers the rule. If the condition is empty, the rule will always apply.
     * 
     */
    @Import(name="condition", required=true)
    private Output<GoogleCloudRetailV2alphaConditionArgs> condition;

    /**
     * @return The condition that triggers the rule. If the condition is empty, the rule will always apply.
     * 
     */
    public Output<GoogleCloudRetailV2alphaConditionArgs> condition() {
        return this.condition;
    }

    /**
     * Prevents term from being associated with other terms.
     * 
     */
    @Import(name="doNotAssociateAction")
    private @Nullable Output<GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs> doNotAssociateAction;

    /**
     * @return Prevents term from being associated with other terms.
     * 
     */
    public Optional<Output<GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs>> doNotAssociateAction() {
        return Optional.ofNullable(this.doNotAssociateAction);
    }

    /**
     * Filters results.
     * 
     */
    @Import(name="filterAction")
    private @Nullable Output<GoogleCloudRetailV2alphaRuleFilterActionArgs> filterAction;

    /**
     * @return Filters results.
     * 
     */
    public Optional<Output<GoogleCloudRetailV2alphaRuleFilterActionArgs>> filterAction() {
        return Optional.ofNullable(this.filterAction);
    }

    /**
     * Ignores specific terms from query during search.
     * 
     */
    @Import(name="ignoreAction")
    private @Nullable Output<GoogleCloudRetailV2alphaRuleIgnoreActionArgs> ignoreAction;

    /**
     * @return Ignores specific terms from query during search.
     * 
     */
    public Optional<Output<GoogleCloudRetailV2alphaRuleIgnoreActionArgs>> ignoreAction() {
        return Optional.ofNullable(this.ignoreAction);
    }

    /**
     * Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
     * 
     */
    @Import(name="onewaySynonymsAction")
    private @Nullable Output<GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs> onewaySynonymsAction;

    /**
     * @return Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
     * 
     */
    public Optional<Output<GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs>> onewaySynonymsAction() {
        return Optional.ofNullable(this.onewaySynonymsAction);
    }

    /**
     * Redirects a shopper to a specific page.
     * 
     */
    @Import(name="redirectAction")
    private @Nullable Output<GoogleCloudRetailV2alphaRuleRedirectActionArgs> redirectAction;

    /**
     * @return Redirects a shopper to a specific page.
     * 
     */
    public Optional<Output<GoogleCloudRetailV2alphaRuleRedirectActionArgs>> redirectAction() {
        return Optional.ofNullable(this.redirectAction);
    }

    /**
     * Replaces specific terms in the query.
     * 
     */
    @Import(name="replacementAction")
    private @Nullable Output<GoogleCloudRetailV2alphaRuleReplacementActionArgs> replacementAction;

    /**
     * @return Replaces specific terms in the query.
     * 
     */
    public Optional<Output<GoogleCloudRetailV2alphaRuleReplacementActionArgs>> replacementAction() {
        return Optional.ofNullable(this.replacementAction);
    }

    /**
     * Treats a set of terms as synonyms of one another.
     * 
     */
    @Import(name="twowaySynonymsAction")
    private @Nullable Output<GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs> twowaySynonymsAction;

    /**
     * @return Treats a set of terms as synonyms of one another.
     * 
     */
    public Optional<Output<GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs>> twowaySynonymsAction() {
        return Optional.ofNullable(this.twowaySynonymsAction);
    }

    private GoogleCloudRetailV2alphaRuleArgs() {}

    private GoogleCloudRetailV2alphaRuleArgs(GoogleCloudRetailV2alphaRuleArgs $) {
        this.boostAction = $.boostAction;
        this.condition = $.condition;
        this.doNotAssociateAction = $.doNotAssociateAction;
        this.filterAction = $.filterAction;
        this.ignoreAction = $.ignoreAction;
        this.onewaySynonymsAction = $.onewaySynonymsAction;
        this.redirectAction = $.redirectAction;
        this.replacementAction = $.replacementAction;
        this.twowaySynonymsAction = $.twowaySynonymsAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaRuleArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaRuleArgs();
        }

        public Builder(GoogleCloudRetailV2alphaRuleArgs defaults) {
            $ = new GoogleCloudRetailV2alphaRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param boostAction A boost action.
         * 
         * @return builder
         * 
         */
        public Builder boostAction(@Nullable Output<GoogleCloudRetailV2alphaRuleBoostActionArgs> boostAction) {
            $.boostAction = boostAction;
            return this;
        }

        /**
         * @param boostAction A boost action.
         * 
         * @return builder
         * 
         */
        public Builder boostAction(GoogleCloudRetailV2alphaRuleBoostActionArgs boostAction) {
            return boostAction(Output.of(boostAction));
        }

        /**
         * @param condition The condition that triggers the rule. If the condition is empty, the rule will always apply.
         * 
         * @return builder
         * 
         */
        public Builder condition(Output<GoogleCloudRetailV2alphaConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The condition that triggers the rule. If the condition is empty, the rule will always apply.
         * 
         * @return builder
         * 
         */
        public Builder condition(GoogleCloudRetailV2alphaConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param doNotAssociateAction Prevents term from being associated with other terms.
         * 
         * @return builder
         * 
         */
        public Builder doNotAssociateAction(@Nullable Output<GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs> doNotAssociateAction) {
            $.doNotAssociateAction = doNotAssociateAction;
            return this;
        }

        /**
         * @param doNotAssociateAction Prevents term from being associated with other terms.
         * 
         * @return builder
         * 
         */
        public Builder doNotAssociateAction(GoogleCloudRetailV2alphaRuleDoNotAssociateActionArgs doNotAssociateAction) {
            return doNotAssociateAction(Output.of(doNotAssociateAction));
        }

        /**
         * @param filterAction Filters results.
         * 
         * @return builder
         * 
         */
        public Builder filterAction(@Nullable Output<GoogleCloudRetailV2alphaRuleFilterActionArgs> filterAction) {
            $.filterAction = filterAction;
            return this;
        }

        /**
         * @param filterAction Filters results.
         * 
         * @return builder
         * 
         */
        public Builder filterAction(GoogleCloudRetailV2alphaRuleFilterActionArgs filterAction) {
            return filterAction(Output.of(filterAction));
        }

        /**
         * @param ignoreAction Ignores specific terms from query during search.
         * 
         * @return builder
         * 
         */
        public Builder ignoreAction(@Nullable Output<GoogleCloudRetailV2alphaRuleIgnoreActionArgs> ignoreAction) {
            $.ignoreAction = ignoreAction;
            return this;
        }

        /**
         * @param ignoreAction Ignores specific terms from query during search.
         * 
         * @return builder
         * 
         */
        public Builder ignoreAction(GoogleCloudRetailV2alphaRuleIgnoreActionArgs ignoreAction) {
            return ignoreAction(Output.of(ignoreAction));
        }

        /**
         * @param onewaySynonymsAction Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
         * 
         * @return builder
         * 
         */
        public Builder onewaySynonymsAction(@Nullable Output<GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs> onewaySynonymsAction) {
            $.onewaySynonymsAction = onewaySynonymsAction;
            return this;
        }

        /**
         * @param onewaySynonymsAction Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
         * 
         * @return builder
         * 
         */
        public Builder onewaySynonymsAction(GoogleCloudRetailV2alphaRuleOnewaySynonymsActionArgs onewaySynonymsAction) {
            return onewaySynonymsAction(Output.of(onewaySynonymsAction));
        }

        /**
         * @param redirectAction Redirects a shopper to a specific page.
         * 
         * @return builder
         * 
         */
        public Builder redirectAction(@Nullable Output<GoogleCloudRetailV2alphaRuleRedirectActionArgs> redirectAction) {
            $.redirectAction = redirectAction;
            return this;
        }

        /**
         * @param redirectAction Redirects a shopper to a specific page.
         * 
         * @return builder
         * 
         */
        public Builder redirectAction(GoogleCloudRetailV2alphaRuleRedirectActionArgs redirectAction) {
            return redirectAction(Output.of(redirectAction));
        }

        /**
         * @param replacementAction Replaces specific terms in the query.
         * 
         * @return builder
         * 
         */
        public Builder replacementAction(@Nullable Output<GoogleCloudRetailV2alphaRuleReplacementActionArgs> replacementAction) {
            $.replacementAction = replacementAction;
            return this;
        }

        /**
         * @param replacementAction Replaces specific terms in the query.
         * 
         * @return builder
         * 
         */
        public Builder replacementAction(GoogleCloudRetailV2alphaRuleReplacementActionArgs replacementAction) {
            return replacementAction(Output.of(replacementAction));
        }

        /**
         * @param twowaySynonymsAction Treats a set of terms as synonyms of one another.
         * 
         * @return builder
         * 
         */
        public Builder twowaySynonymsAction(@Nullable Output<GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs> twowaySynonymsAction) {
            $.twowaySynonymsAction = twowaySynonymsAction;
            return this;
        }

        /**
         * @param twowaySynonymsAction Treats a set of terms as synonyms of one another.
         * 
         * @return builder
         * 
         */
        public Builder twowaySynonymsAction(GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs twowaySynonymsAction) {
            return twowaySynonymsAction(Output.of(twowaySynonymsAction));
        }

        public GoogleCloudRetailV2alphaRuleArgs build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            return $;
        }
    }

}
