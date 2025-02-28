// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallPolicyIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyIamPolicyPlainArgs Empty = new GetFirewallPolicyIamPolicyPlainArgs();

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="resource", required=true)
    private String resource;

    public String resource() {
        return this.resource;
    }

    private GetFirewallPolicyIamPolicyPlainArgs() {}

    private GetFirewallPolicyIamPolicyPlainArgs(GetFirewallPolicyIamPolicyPlainArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetFirewallPolicyIamPolicyPlainArgs();
        }

        public Builder(GetFirewallPolicyIamPolicyPlainArgs defaults) {
            $ = new GetFirewallPolicyIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder resource(String resource) {
            $.resource = resource;
            return this;
        }

        public GetFirewallPolicyIamPolicyPlainArgs build() {
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            return $;
        }
    }

}
