// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A custom alert rule that checks if a value (depends on the custom alert type) is within the given range.
 * 
 */
public final class ThresholdCustomAlertRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThresholdCustomAlertRuleArgs Empty = new ThresholdCustomAlertRuleArgs();

    /**
     * Status of the custom alert.
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    /**
     * @return Status of the custom alert.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * The maximum threshold.
     * 
     */
    @Import(name="maxThreshold", required=true)
    private Output<Integer> maxThreshold;

    /**
     * @return The maximum threshold.
     * 
     */
    public Output<Integer> maxThreshold() {
        return this.maxThreshold;
    }

    /**
     * The minimum threshold.
     * 
     */
    @Import(name="minThreshold", required=true)
    private Output<Integer> minThreshold;

    /**
     * @return The minimum threshold.
     * 
     */
    public Output<Integer> minThreshold() {
        return this.minThreshold;
    }

    /**
     * The type of the custom alert rule.
     * Expected value is &#39;ThresholdCustomAlertRule&#39;.
     * 
     */
    @Import(name="ruleType", required=true)
    private Output<String> ruleType;

    /**
     * @return The type of the custom alert rule.
     * Expected value is &#39;ThresholdCustomAlertRule&#39;.
     * 
     */
    public Output<String> ruleType() {
        return this.ruleType;
    }

    private ThresholdCustomAlertRuleArgs() {}

    private ThresholdCustomAlertRuleArgs(ThresholdCustomAlertRuleArgs $) {
        this.isEnabled = $.isEnabled;
        this.maxThreshold = $.maxThreshold;
        this.minThreshold = $.minThreshold;
        this.ruleType = $.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThresholdCustomAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThresholdCustomAlertRuleArgs $;

        public Builder() {
            $ = new ThresholdCustomAlertRuleArgs();
        }

        public Builder(ThresholdCustomAlertRuleArgs defaults) {
            $ = new ThresholdCustomAlertRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isEnabled Status of the custom alert.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Status of the custom alert.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param maxThreshold The maximum threshold.
         * 
         * @return builder
         * 
         */
        public Builder maxThreshold(Output<Integer> maxThreshold) {
            $.maxThreshold = maxThreshold;
            return this;
        }

        /**
         * @param maxThreshold The maximum threshold.
         * 
         * @return builder
         * 
         */
        public Builder maxThreshold(Integer maxThreshold) {
            return maxThreshold(Output.of(maxThreshold));
        }

        /**
         * @param minThreshold The minimum threshold.
         * 
         * @return builder
         * 
         */
        public Builder minThreshold(Output<Integer> minThreshold) {
            $.minThreshold = minThreshold;
            return this;
        }

        /**
         * @param minThreshold The minimum threshold.
         * 
         * @return builder
         * 
         */
        public Builder minThreshold(Integer minThreshold) {
            return minThreshold(Output.of(minThreshold));
        }

        /**
         * @param ruleType The type of the custom alert rule.
         * Expected value is &#39;ThresholdCustomAlertRule&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(Output<String> ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        /**
         * @param ruleType The type of the custom alert rule.
         * Expected value is &#39;ThresholdCustomAlertRule&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(String ruleType) {
            return ruleType(Output.of(ruleType));
        }

        public ThresholdCustomAlertRuleArgs build() {
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.maxThreshold = Objects.requireNonNull($.maxThreshold, "expected parameter 'maxThreshold' to be non-null");
            $.minThreshold = Objects.requireNonNull($.minThreshold, "expected parameter 'minThreshold' to be non-null");
            $.ruleType = Codegen.stringProp("ruleType").output().arg($.ruleType).require();
            return $;
        }
    }

}
