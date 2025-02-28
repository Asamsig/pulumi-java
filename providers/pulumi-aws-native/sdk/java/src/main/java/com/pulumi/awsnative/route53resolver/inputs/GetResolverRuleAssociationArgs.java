// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53resolver.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResolverRuleAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResolverRuleAssociationArgs Empty = new GetResolverRuleAssociationArgs();

    /**
     * Primary Identifier for Resolver Rule Association
     * 
     */
    @Import(name="resolverRuleAssociationId", required=true)
    private Output<String> resolverRuleAssociationId;

    /**
     * @return Primary Identifier for Resolver Rule Association
     * 
     */
    public Output<String> resolverRuleAssociationId() {
        return this.resolverRuleAssociationId;
    }

    private GetResolverRuleAssociationArgs() {}

    private GetResolverRuleAssociationArgs(GetResolverRuleAssociationArgs $) {
        this.resolverRuleAssociationId = $.resolverRuleAssociationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResolverRuleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResolverRuleAssociationArgs $;

        public Builder() {
            $ = new GetResolverRuleAssociationArgs();
        }

        public Builder(GetResolverRuleAssociationArgs defaults) {
            $ = new GetResolverRuleAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resolverRuleAssociationId Primary Identifier for Resolver Rule Association
         * 
         * @return builder
         * 
         */
        public Builder resolverRuleAssociationId(Output<String> resolverRuleAssociationId) {
            $.resolverRuleAssociationId = resolverRuleAssociationId;
            return this;
        }

        /**
         * @param resolverRuleAssociationId Primary Identifier for Resolver Rule Association
         * 
         * @return builder
         * 
         */
        public Builder resolverRuleAssociationId(String resolverRuleAssociationId) {
            return resolverRuleAssociationId(Output.of(resolverRuleAssociationId));
        }

        public GetResolverRuleAssociationArgs build() {
            $.resolverRuleAssociationId = Objects.requireNonNull($.resolverRuleAssociationId, "expected parameter 'resolverRuleAssociationId' to be non-null");
            return $;
        }
    }

}
