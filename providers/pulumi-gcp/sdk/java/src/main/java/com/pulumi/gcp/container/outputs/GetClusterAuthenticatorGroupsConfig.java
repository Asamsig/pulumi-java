// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterAuthenticatorGroupsConfig {
    private final String securityGroup;

    @CustomType.Constructor
    private GetClusterAuthenticatorGroupsConfig(@CustomType.Parameter("securityGroup") String securityGroup) {
        this.securityGroup = securityGroup;
    }

    public String securityGroup() {
        return this.securityGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAuthenticatorGroupsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAuthenticatorGroupsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder securityGroup(String securityGroup) {
            this.securityGroup = Objects.requireNonNull(securityGroup);
            return this;
        }        public GetClusterAuthenticatorGroupsConfig build() {
            return new GetClusterAuthenticatorGroupsConfig(securityGroup);
        }
    }
}
