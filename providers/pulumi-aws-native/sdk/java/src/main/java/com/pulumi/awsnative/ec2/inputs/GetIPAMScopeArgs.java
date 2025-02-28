// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIPAMScopeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIPAMScopeArgs Empty = new GetIPAMScopeArgs();

    /**
     * Id of the IPAM scope.
     * 
     */
    @Import(name="ipamScopeId", required=true)
    private Output<String> ipamScopeId;

    /**
     * @return Id of the IPAM scope.
     * 
     */
    public Output<String> ipamScopeId() {
        return this.ipamScopeId;
    }

    private GetIPAMScopeArgs() {}

    private GetIPAMScopeArgs(GetIPAMScopeArgs $) {
        this.ipamScopeId = $.ipamScopeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIPAMScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIPAMScopeArgs $;

        public Builder() {
            $ = new GetIPAMScopeArgs();
        }

        public Builder(GetIPAMScopeArgs defaults) {
            $ = new GetIPAMScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipamScopeId Id of the IPAM scope.
         * 
         * @return builder
         * 
         */
        public Builder ipamScopeId(Output<String> ipamScopeId) {
            $.ipamScopeId = ipamScopeId;
            return this;
        }

        /**
         * @param ipamScopeId Id of the IPAM scope.
         * 
         * @return builder
         * 
         */
        public Builder ipamScopeId(String ipamScopeId) {
            return ipamScopeId(Output.of(ipamScopeId));
        }

        public GetIPAMScopeArgs build() {
            $.ipamScopeId = Objects.requireNonNull($.ipamScopeId, "expected parameter 'ipamScopeId' to be non-null");
            return $;
        }
    }

}
