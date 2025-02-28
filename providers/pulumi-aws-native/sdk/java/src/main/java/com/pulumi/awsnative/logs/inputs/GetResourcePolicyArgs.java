// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.logs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicyArgs Empty = new GetResourcePolicyArgs();

    /**
     * A name for resource policy
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return A name for resource policy
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    private GetResourcePolicyArgs() {}

    private GetResourcePolicyArgs(GetResourcePolicyArgs $) {
        this.policyName = $.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourcePolicyArgs $;

        public Builder() {
            $ = new GetResourcePolicyArgs();
        }

        public Builder(GetResourcePolicyArgs defaults) {
            $ = new GetResourcePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyName A name for resource policy
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName A name for resource policy
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        public GetResourcePolicyArgs build() {
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            return $;
        }
    }

}
