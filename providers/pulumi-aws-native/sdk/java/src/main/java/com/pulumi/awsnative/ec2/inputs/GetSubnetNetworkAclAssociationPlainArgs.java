// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubnetNetworkAclAssociationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetNetworkAclAssociationPlainArgs Empty = new GetSubnetNetworkAclAssociationPlainArgs();

    @Import(name="associationId", required=true)
    private String associationId;

    public String associationId() {
        return this.associationId;
    }

    private GetSubnetNetworkAclAssociationPlainArgs() {}

    private GetSubnetNetworkAclAssociationPlainArgs(GetSubnetNetworkAclAssociationPlainArgs $) {
        this.associationId = $.associationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetNetworkAclAssociationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetNetworkAclAssociationPlainArgs $;

        public Builder() {
            $ = new GetSubnetNetworkAclAssociationPlainArgs();
        }

        public Builder(GetSubnetNetworkAclAssociationPlainArgs defaults) {
            $ = new GetSubnetNetworkAclAssociationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder associationId(String associationId) {
            $.associationId = associationId;
            return this;
        }

        public GetSubnetNetworkAclAssociationPlainArgs build() {
            $.associationId = Objects.requireNonNull($.associationId, "expected parameter 'associationId' to be non-null");
            return $;
        }
    }

}
