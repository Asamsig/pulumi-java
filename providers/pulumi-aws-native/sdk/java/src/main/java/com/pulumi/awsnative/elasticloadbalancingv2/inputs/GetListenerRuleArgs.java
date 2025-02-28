// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetListenerRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListenerRuleArgs Empty = new GetListenerRuleArgs();

    @Import(name="ruleArn", required=true)
    private Output<String> ruleArn;

    public Output<String> ruleArn() {
        return this.ruleArn;
    }

    private GetListenerRuleArgs() {}

    private GetListenerRuleArgs(GetListenerRuleArgs $) {
        this.ruleArn = $.ruleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListenerRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListenerRuleArgs $;

        public Builder() {
            $ = new GetListenerRuleArgs();
        }

        public Builder(GetListenerRuleArgs defaults) {
            $ = new GetListenerRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder ruleArn(Output<String> ruleArn) {
            $.ruleArn = ruleArn;
            return this;
        }

        public Builder ruleArn(String ruleArn) {
            return ruleArn(Output.of(ruleArn));
        }

        public GetListenerRuleArgs build() {
            $.ruleArn = Objects.requireNonNull($.ruleArn, "expected parameter 'ruleArn' to be non-null");
            return $;
        }
    }

}
