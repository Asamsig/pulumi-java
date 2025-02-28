// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.servicemanagement_v1.outputs.ContextRuleResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ContextResponse {
    /**
     * @return A list of RPC context rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
     * 
     */
    private final List<ContextRuleResponse> rules;

    @CustomType.Constructor
    private ContextResponse(@CustomType.Parameter("rules") List<ContextRuleResponse> rules) {
        this.rules = rules;
    }

    /**
     * @return A list of RPC context rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
     * 
     */
    public List<ContextRuleResponse> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ContextRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(List<ContextRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(ContextRuleResponse... rules) {
            return rules(List.of(rules));
        }        public ContextResponse build() {
            return new ContextResponse(rules);
        }
    }
}
