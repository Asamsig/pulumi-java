// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.enums.FirewallPolicyRuleOrder;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyStatefulEngineOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyStatefulEngineOptionsArgs Empty = new FirewallPolicyStatefulEngineOptionsArgs();

    @Import(name="ruleOrder")
    private @Nullable Output<FirewallPolicyRuleOrder> ruleOrder;

    public Optional<Output<FirewallPolicyRuleOrder>> ruleOrder() {
        return Optional.ofNullable(this.ruleOrder);
    }

    private FirewallPolicyStatefulEngineOptionsArgs() {}

    private FirewallPolicyStatefulEngineOptionsArgs(FirewallPolicyStatefulEngineOptionsArgs $) {
        this.ruleOrder = $.ruleOrder;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyStatefulEngineOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyStatefulEngineOptionsArgs $;

        public Builder() {
            $ = new FirewallPolicyStatefulEngineOptionsArgs();
        }

        public Builder(FirewallPolicyStatefulEngineOptionsArgs defaults) {
            $ = new FirewallPolicyStatefulEngineOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder ruleOrder(@Nullable Output<FirewallPolicyRuleOrder> ruleOrder) {
            $.ruleOrder = ruleOrder;
            return this;
        }

        public Builder ruleOrder(FirewallPolicyRuleOrder ruleOrder) {
            return ruleOrder(Output.of(ruleOrder));
        }

        public FirewallPolicyStatefulEngineOptionsArgs build() {
            return $;
        }
    }

}
