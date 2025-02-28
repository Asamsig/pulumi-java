// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInternetGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInternetGatewayPlainArgs Empty = new GetInternetGatewayPlainArgs();

    /**
     * ID of internet gateway.
     * 
     */
    @Import(name="internetGatewayId", required=true)
    private String internetGatewayId;

    /**
     * @return ID of internet gateway.
     * 
     */
    public String internetGatewayId() {
        return this.internetGatewayId;
    }

    private GetInternetGatewayPlainArgs() {}

    private GetInternetGatewayPlainArgs(GetInternetGatewayPlainArgs $) {
        this.internetGatewayId = $.internetGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInternetGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInternetGatewayPlainArgs $;

        public Builder() {
            $ = new GetInternetGatewayPlainArgs();
        }

        public Builder(GetInternetGatewayPlainArgs defaults) {
            $ = new GetInternetGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param internetGatewayId ID of internet gateway.
         * 
         * @return builder
         * 
         */
        public Builder internetGatewayId(String internetGatewayId) {
            $.internetGatewayId = internetGatewayId;
            return this;
        }

        public GetInternetGatewayPlainArgs build() {
            $.internetGatewayId = Objects.requireNonNull($.internetGatewayId, "expected parameter 'internetGatewayId' to be non-null");
            return $;
        }
    }

}
