// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.outputs;

import com.pulumi.awsnative.networkfirewall.enums.RuleGroupGeneratedRulesType;
import com.pulumi.awsnative.networkfirewall.enums.RuleGroupTargetType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRulesSourceList {
    private final RuleGroupGeneratedRulesType generatedRulesType;
    private final List<RuleGroupTargetType> targetTypes;
    private final List<String> targets;

    @CustomType.Constructor
    private RuleGroupRulesSourceList(
        @CustomType.Parameter("generatedRulesType") RuleGroupGeneratedRulesType generatedRulesType,
        @CustomType.Parameter("targetTypes") List<RuleGroupTargetType> targetTypes,
        @CustomType.Parameter("targets") List<String> targets) {
        this.generatedRulesType = generatedRulesType;
        this.targetTypes = targetTypes;
        this.targets = targets;
    }

    public RuleGroupGeneratedRulesType generatedRulesType() {
        return this.generatedRulesType;
    }
    public List<RuleGroupTargetType> targetTypes() {
        return this.targetTypes;
    }
    public List<String> targets() {
        return this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRulesSourceList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupGeneratedRulesType generatedRulesType;
        private List<RuleGroupTargetType> targetTypes;
        private List<String> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRulesSourceList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generatedRulesType = defaults.generatedRulesType;
    	      this.targetTypes = defaults.targetTypes;
    	      this.targets = defaults.targets;
        }

        public Builder generatedRulesType(RuleGroupGeneratedRulesType generatedRulesType) {
            this.generatedRulesType = Objects.requireNonNull(generatedRulesType);
            return this;
        }
        public Builder targetTypes(List<RuleGroupTargetType> targetTypes) {
            this.targetTypes = Objects.requireNonNull(targetTypes);
            return this;
        }
        public Builder targetTypes(RuleGroupTargetType... targetTypes) {
            return targetTypes(List.of(targetTypes));
        }
        public Builder targets(List<String> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }        public RuleGroupRulesSourceList build() {
            return new RuleGroupRulesSourceList(generatedRulesType, targetTypes, targets);
        }
    }
}
