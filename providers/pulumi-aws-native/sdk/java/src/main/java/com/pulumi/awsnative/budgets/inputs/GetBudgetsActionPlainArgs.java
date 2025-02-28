// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.budgets.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBudgetsActionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBudgetsActionPlainArgs Empty = new GetBudgetsActionPlainArgs();

    @Import(name="actionId", required=true)
    private String actionId;

    public String actionId() {
        return this.actionId;
    }

    @Import(name="budgetName", required=true)
    private String budgetName;

    public String budgetName() {
        return this.budgetName;
    }

    private GetBudgetsActionPlainArgs() {}

    private GetBudgetsActionPlainArgs(GetBudgetsActionPlainArgs $) {
        this.actionId = $.actionId;
        this.budgetName = $.budgetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBudgetsActionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBudgetsActionPlainArgs $;

        public Builder() {
            $ = new GetBudgetsActionPlainArgs();
        }

        public Builder(GetBudgetsActionPlainArgs defaults) {
            $ = new GetBudgetsActionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionId(String actionId) {
            $.actionId = actionId;
            return this;
        }

        public Builder budgetName(String budgetName) {
            $.budgetName = budgetName;
            return this;
        }

        public GetBudgetsActionPlainArgs build() {
            $.actionId = Objects.requireNonNull($.actionId, "expected parameter 'actionId' to be non-null");
            $.budgetName = Objects.requireNonNull($.budgetName, "expected parameter 'budgetName' to be non-null");
            return $;
        }
    }

}
