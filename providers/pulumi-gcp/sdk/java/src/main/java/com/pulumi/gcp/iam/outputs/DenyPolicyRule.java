// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.iam.outputs.DenyPolicyRuleDenyRule;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DenyPolicyRule {
    /**
     * @return A deny rule in an IAM deny policy.
     * Structure is documented below.
     * 
     */
    private final @Nullable DenyPolicyRuleDenyRule denyRule;
    /**
     * @return Description of the expression. This is a longer text which describes the expression,
     * e.g. when hovered over it in a UI.
     * 
     */
    private final @Nullable String description;

    @CustomType.Constructor
    private DenyPolicyRule(
        @CustomType.Parameter("denyRule") @Nullable DenyPolicyRuleDenyRule denyRule,
        @CustomType.Parameter("description") @Nullable String description) {
        this.denyRule = denyRule;
        this.description = description;
    }

    /**
     * @return A deny rule in an IAM deny policy.
     * Structure is documented below.
     * 
     */
    public Optional<DenyPolicyRuleDenyRule> denyRule() {
        return Optional.ofNullable(this.denyRule);
    }
    /**
     * @return Description of the expression. This is a longer text which describes the expression,
     * e.g. when hovered over it in a UI.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DenyPolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DenyPolicyRuleDenyRule denyRule;
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(DenyPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.denyRule = defaults.denyRule;
    	      this.description = defaults.description;
        }

        public Builder denyRule(@Nullable DenyPolicyRuleDenyRule denyRule) {
            this.denyRule = denyRule;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }        public DenyPolicyRule build() {
            return new DenyPolicyRule(denyRule, description);
        }
    }
}
