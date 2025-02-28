// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.RuleGroupCustomResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleActionBlockProperties {
    private final @Nullable RuleGroupCustomResponse customResponse;

    @CustomType.Constructor
    private RuleGroupRuleActionBlockProperties(@CustomType.Parameter("customResponse") @Nullable RuleGroupCustomResponse customResponse) {
        this.customResponse = customResponse;
    }

    public Optional<RuleGroupCustomResponse> customResponse() {
        return Optional.ofNullable(this.customResponse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionBlockProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupCustomResponse customResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionBlockProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponse = defaults.customResponse;
        }

        public Builder customResponse(@Nullable RuleGroupCustomResponse customResponse) {
            this.customResponse = customResponse;
            return this;
        }        public RuleGroupRuleActionBlockProperties build() {
            return new RuleGroupRuleActionBlockProperties(customResponse);
        }
    }
}
