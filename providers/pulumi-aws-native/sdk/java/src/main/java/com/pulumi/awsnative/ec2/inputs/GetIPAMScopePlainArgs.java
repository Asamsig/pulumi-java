// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIPAMScopePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIPAMScopePlainArgs Empty = new GetIPAMScopePlainArgs();

    /**
     * Id of the IPAM scope.
     * 
     */
    @Import(name="ipamScopeId", required=true)
    private String ipamScopeId;

    /**
     * @return Id of the IPAM scope.
     * 
     */
    public String ipamScopeId() {
        return this.ipamScopeId;
    }

    private GetIPAMScopePlainArgs() {}

    private GetIPAMScopePlainArgs(GetIPAMScopePlainArgs $) {
        this.ipamScopeId = $.ipamScopeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIPAMScopePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIPAMScopePlainArgs $;

        public Builder() {
            $ = new GetIPAMScopePlainArgs();
        }

        public Builder(GetIPAMScopePlainArgs defaults) {
            $ = new GetIPAMScopePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipamScopeId Id of the IPAM scope.
         * 
         * @return builder
         * 
         */
        public Builder ipamScopeId(String ipamScopeId) {
            $.ipamScopeId = ipamScopeId;
            return this;
        }

        public GetIPAMScopePlainArgs build() {
            $.ipamScopeId = Objects.requireNonNull($.ipamScopeId, "expected parameter 'ipamScopeId' to be non-null");
            return $;
        }
    }

}
