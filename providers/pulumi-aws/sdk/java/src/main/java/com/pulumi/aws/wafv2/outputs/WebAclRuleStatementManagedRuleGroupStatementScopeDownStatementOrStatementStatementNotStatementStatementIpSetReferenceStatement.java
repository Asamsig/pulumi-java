// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement {
    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    private final String arn;
    /**
     * @return Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

    @CustomType.Constructor
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("ipSetForwardedIpConfig") @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
        this.arn = arn;
        this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig> ipSetForwardedIpConfig() {
        return Optional.ofNullable(this.ipSetForwardedIpConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetForwardedIpConfig = defaults.ipSetForwardedIpConfig;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder ipSetForwardedIpConfig(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement(arn, ipSetForwardedIpConfig);
        }
    }
}
