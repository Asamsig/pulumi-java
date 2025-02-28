// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.outputs;

import com.pulumi.awsnative.networkfirewall.outputs.RuleGroupDimension;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupPublishMetricAction {
    private final List<RuleGroupDimension> dimensions;

    @CustomType.Constructor
    private RuleGroupPublishMetricAction(@CustomType.Parameter("dimensions") List<RuleGroupDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public List<RuleGroupDimension> dimensions() {
        return this.dimensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupPublishMetricAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupDimension> dimensions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupPublishMetricAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
        }

        public Builder dimensions(List<RuleGroupDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(RuleGroupDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }        public RuleGroupPublishMetricAction build() {
            return new RuleGroupPublishMetricAction(dimensions);
        }
    }
}
