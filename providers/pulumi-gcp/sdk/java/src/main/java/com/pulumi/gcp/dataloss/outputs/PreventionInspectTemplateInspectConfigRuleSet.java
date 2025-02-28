// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSetInfoType;
import com.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSetRule;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PreventionInspectTemplateInspectConfigRuleSet {
    /**
     * @return If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
     */
    private final List<PreventionInspectTemplateInspectConfigRuleSetInfoType> infoTypes;
    /**
     * @return Set of rules to be applied to infoTypes. The rules are applied in order.
     * Structure is documented below.
     * 
     */
    private final List<PreventionInspectTemplateInspectConfigRuleSetRule> rules;

    @CustomType.Constructor
    private PreventionInspectTemplateInspectConfigRuleSet(
        @CustomType.Parameter("infoTypes") List<PreventionInspectTemplateInspectConfigRuleSetInfoType> infoTypes,
        @CustomType.Parameter("rules") List<PreventionInspectTemplateInspectConfigRuleSetRule> rules) {
        this.infoTypes = infoTypes;
        this.rules = rules;
    }

    /**
     * @return If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
     */
    public List<PreventionInspectTemplateInspectConfigRuleSetInfoType> infoTypes() {
        return this.infoTypes;
    }
    /**
     * @return Set of rules to be applied to infoTypes. The rules are applied in order.
     * Structure is documented below.
     * 
     */
    public List<PreventionInspectTemplateInspectConfigRuleSetRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<PreventionInspectTemplateInspectConfigRuleSetInfoType> infoTypes;
        private List<PreventionInspectTemplateInspectConfigRuleSetRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.rules = defaults.rules;
        }

        public Builder infoTypes(List<PreventionInspectTemplateInspectConfigRuleSetInfoType> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }
        public Builder infoTypes(PreventionInspectTemplateInspectConfigRuleSetInfoType... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        public Builder rules(List<PreventionInspectTemplateInspectConfigRuleSetRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(PreventionInspectTemplateInspectConfigRuleSetRule... rules) {
            return rules(List.of(rules));
        }        public PreventionInspectTemplateInspectConfigRuleSet build() {
            return new PreventionInspectTemplateInspectConfigRuleSet(infoTypes, rules);
        }
    }
}
