// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupMembershipsMembershipRole {
    /**
     * @return The name of the MembershipRole. One of OWNER, MANAGER, MEMBER.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetGroupMembershipsMembershipRole(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return The name of the MembershipRole. One of OWNER, MANAGER, MEMBER.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupMembershipsMembershipRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupMembershipsMembershipRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetGroupMembershipsMembershipRole build() {
            return new GetGroupMembershipsMembershipRole(name);
        }
    }
}
