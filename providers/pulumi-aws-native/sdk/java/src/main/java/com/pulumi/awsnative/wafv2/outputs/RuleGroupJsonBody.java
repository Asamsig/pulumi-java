// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.enums.RuleGroupBodyParsingFallbackBehavior;
import com.pulumi.awsnative.wafv2.enums.RuleGroupJsonMatchScope;
import com.pulumi.awsnative.wafv2.outputs.RuleGroupJsonMatchPattern;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupJsonBody {
    private final @Nullable RuleGroupBodyParsingFallbackBehavior invalidFallbackBehavior;
    private final RuleGroupJsonMatchPattern matchPattern;
    private final RuleGroupJsonMatchScope matchScope;

    @CustomType.Constructor
    private RuleGroupJsonBody(
        @CustomType.Parameter("invalidFallbackBehavior") @Nullable RuleGroupBodyParsingFallbackBehavior invalidFallbackBehavior,
        @CustomType.Parameter("matchPattern") RuleGroupJsonMatchPattern matchPattern,
        @CustomType.Parameter("matchScope") RuleGroupJsonMatchScope matchScope) {
        this.invalidFallbackBehavior = invalidFallbackBehavior;
        this.matchPattern = matchPattern;
        this.matchScope = matchScope;
    }

    public Optional<RuleGroupBodyParsingFallbackBehavior> invalidFallbackBehavior() {
        return Optional.ofNullable(this.invalidFallbackBehavior);
    }
    public RuleGroupJsonMatchPattern matchPattern() {
        return this.matchPattern;
    }
    public RuleGroupJsonMatchScope matchScope() {
        return this.matchScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupJsonBody defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupBodyParsingFallbackBehavior invalidFallbackBehavior;
        private RuleGroupJsonMatchPattern matchPattern;
        private RuleGroupJsonMatchScope matchScope;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupJsonBody defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invalidFallbackBehavior = defaults.invalidFallbackBehavior;
    	      this.matchPattern = defaults.matchPattern;
    	      this.matchScope = defaults.matchScope;
        }

        public Builder invalidFallbackBehavior(@Nullable RuleGroupBodyParsingFallbackBehavior invalidFallbackBehavior) {
            this.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }
        public Builder matchPattern(RuleGroupJsonMatchPattern matchPattern) {
            this.matchPattern = Objects.requireNonNull(matchPattern);
            return this;
        }
        public Builder matchScope(RuleGroupJsonMatchScope matchScope) {
            this.matchScope = Objects.requireNonNull(matchScope);
            return this;
        }        public RuleGroupJsonBody build() {
            return new RuleGroupJsonBody(invalidFallbackBehavior, matchPattern, matchScope);
        }
    }
}
