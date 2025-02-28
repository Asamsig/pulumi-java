// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPolicySetDefinitionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicySetDefinitionPlainArgs Empty = new GetPolicySetDefinitionPlainArgs();

    /**
     * The name of the policy set definition to get.
     * 
     */
    @Import(name="policySetDefinitionName", required=true)
    private String policySetDefinitionName;

    /**
     * @return The name of the policy set definition to get.
     * 
     */
    public String policySetDefinitionName() {
        return this.policySetDefinitionName;
    }

    private GetPolicySetDefinitionPlainArgs() {}

    private GetPolicySetDefinitionPlainArgs(GetPolicySetDefinitionPlainArgs $) {
        this.policySetDefinitionName = $.policySetDefinitionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicySetDefinitionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicySetDefinitionPlainArgs $;

        public Builder() {
            $ = new GetPolicySetDefinitionPlainArgs();
        }

        public Builder(GetPolicySetDefinitionPlainArgs defaults) {
            $ = new GetPolicySetDefinitionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policySetDefinitionName The name of the policy set definition to get.
         * 
         * @return builder
         * 
         */
        public Builder policySetDefinitionName(String policySetDefinitionName) {
            $.policySetDefinitionName = policySetDefinitionName;
            return this;
        }

        public GetPolicySetDefinitionPlainArgs build() {
            $.policySetDefinitionName = Objects.requireNonNull($.policySetDefinitionName, "expected parameter 'policySetDefinitionName' to be non-null");
            return $;
        }
    }

}
