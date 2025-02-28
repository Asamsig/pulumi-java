// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.FirewallPolicyRuleMatcherLayer4ConfigResponse;
import com.pulumi.googlenative.compute_v1.outputs.FirewallPolicyRuleSecureTagResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FirewallPolicyRuleMatcherResponse {
    /**
     * @return CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    private final List<String> destIpRanges;
    /**
     * @return Pairs of IP protocols and ports that the rule should match.
     * 
     */
    private final List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;
    /**
     * @return CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    private final List<String> srcIpRanges;
    /**
     * @return List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    private final List<FirewallPolicyRuleSecureTagResponse> srcSecureTags;

    @CustomType.Constructor
    private FirewallPolicyRuleMatcherResponse(
        @CustomType.Parameter("destIpRanges") List<String> destIpRanges,
        @CustomType.Parameter("layer4Configs") List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs,
        @CustomType.Parameter("srcIpRanges") List<String> srcIpRanges,
        @CustomType.Parameter("srcSecureTags") List<FirewallPolicyRuleSecureTagResponse> srcSecureTags) {
        this.destIpRanges = destIpRanges;
        this.layer4Configs = layer4Configs;
        this.srcIpRanges = srcIpRanges;
        this.srcSecureTags = srcSecureTags;
    }

    /**
     * @return CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    public List<String> destIpRanges() {
        return this.destIpRanges;
    }
    /**
     * @return Pairs of IP protocols and ports that the rule should match.
     * 
     */
    public List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs() {
        return this.layer4Configs;
    }
    /**
     * @return CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    public List<String> srcIpRanges() {
        return this.srcIpRanges;
    }
    /**
     * @return List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    public List<FirewallPolicyRuleSecureTagResponse> srcSecureTags() {
        return this.srcSecureTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destIpRanges;
        private List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;
        private List<String> srcIpRanges;
        private List<FirewallPolicyRuleSecureTagResponse> srcSecureTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
    	      this.srcSecureTags = defaults.srcSecureTags;
        }

        public Builder destIpRanges(List<String> destIpRanges) {
            this.destIpRanges = Objects.requireNonNull(destIpRanges);
            return this;
        }
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }
        public Builder layer4Configs(List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }
        public Builder layer4Configs(FirewallPolicyRuleMatcherLayer4ConfigResponse... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }
        public Builder srcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }
        public Builder srcSecureTags(List<FirewallPolicyRuleSecureTagResponse> srcSecureTags) {
            this.srcSecureTags = Objects.requireNonNull(srcSecureTags);
            return this;
        }
        public Builder srcSecureTags(FirewallPolicyRuleSecureTagResponse... srcSecureTags) {
            return srcSecureTags(List.of(srcSecureTags));
        }        public FirewallPolicyRuleMatcherResponse build() {
            return new FirewallPolicyRuleMatcherResponse(destIpRanges, layer4Configs, srcIpRanges, srcSecureTags);
        }
    }
}
