// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMembershipPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMembershipPlainArgs Empty = new GetMembershipPlainArgs();

    @Import(name="groupId", required=true)
    private String groupId;

    public String groupId() {
        return this.groupId;
    }

    @Import(name="membershipId", required=true)
    private String membershipId;

    public String membershipId() {
        return this.membershipId;
    }

    private GetMembershipPlainArgs() {}

    private GetMembershipPlainArgs(GetMembershipPlainArgs $) {
        this.groupId = $.groupId;
        this.membershipId = $.membershipId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMembershipPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMembershipPlainArgs $;

        public Builder() {
            $ = new GetMembershipPlainArgs();
        }

        public Builder(GetMembershipPlainArgs defaults) {
            $ = new GetMembershipPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupId(String groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder membershipId(String membershipId) {
            $.membershipId = membershipId;
            return this;
        }

        public GetMembershipPlainArgs build() {
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.membershipId = Objects.requireNonNull($.membershipId, "expected parameter 'membershipId' to be non-null");
            return $;
        }
    }

}
