// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.ActionGroupResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ActionListResponse {
    /**
     * @return The list of the Action Groups.
     * 
     */
    private final @Nullable List<ActionGroupResponse> actionGroups;

    @CustomType.Constructor
    private ActionListResponse(@CustomType.Parameter("actionGroups") @Nullable List<ActionGroupResponse> actionGroups) {
        this.actionGroups = actionGroups;
    }

    /**
     * @return The list of the Action Groups.
     * 
     */
    public List<ActionGroupResponse> actionGroups() {
        return this.actionGroups == null ? List.of() : this.actionGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActionGroupResponse> actionGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroups = defaults.actionGroups;
        }

        public Builder actionGroups(@Nullable List<ActionGroupResponse> actionGroups) {
            this.actionGroups = actionGroups;
            return this;
        }
        public Builder actionGroups(ActionGroupResponse... actionGroups) {
            return actionGroups(List.of(actionGroups));
        }        public ActionListResponse build() {
            return new ActionListResponse(actionGroups);
        }
    }
}
