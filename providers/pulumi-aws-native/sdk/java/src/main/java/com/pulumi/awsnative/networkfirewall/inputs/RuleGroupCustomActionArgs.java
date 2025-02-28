// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupActionDefinitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupCustomActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupCustomActionArgs Empty = new RuleGroupCustomActionArgs();

    @Import(name="actionDefinition", required=true)
    private Output<RuleGroupActionDefinitionArgs> actionDefinition;

    public Output<RuleGroupActionDefinitionArgs> actionDefinition() {
        return this.actionDefinition;
    }

    @Import(name="actionName", required=true)
    private Output<String> actionName;

    public Output<String> actionName() {
        return this.actionName;
    }

    private RuleGroupCustomActionArgs() {}

    private RuleGroupCustomActionArgs(RuleGroupCustomActionArgs $) {
        this.actionDefinition = $.actionDefinition;
        this.actionName = $.actionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupCustomActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupCustomActionArgs $;

        public Builder() {
            $ = new RuleGroupCustomActionArgs();
        }

        public Builder(RuleGroupCustomActionArgs defaults) {
            $ = new RuleGroupCustomActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionDefinition(Output<RuleGroupActionDefinitionArgs> actionDefinition) {
            $.actionDefinition = actionDefinition;
            return this;
        }

        public Builder actionDefinition(RuleGroupActionDefinitionArgs actionDefinition) {
            return actionDefinition(Output.of(actionDefinition));
        }

        public Builder actionName(Output<String> actionName) {
            $.actionName = actionName;
            return this;
        }

        public Builder actionName(String actionName) {
            return actionName(Output.of(actionName));
        }

        public RuleGroupCustomActionArgs build() {
            $.actionDefinition = Objects.requireNonNull($.actionDefinition, "expected parameter 'actionDefinition' to be non-null");
            $.actionName = Objects.requireNonNull($.actionName, "expected parameter 'actionName' to be non-null");
            return $;
        }
    }

}
