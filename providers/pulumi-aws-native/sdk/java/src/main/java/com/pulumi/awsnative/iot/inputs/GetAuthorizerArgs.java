// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAuthorizerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizerArgs Empty = new GetAuthorizerArgs();

    @Import(name="authorizerName", required=true)
    private Output<String> authorizerName;

    public Output<String> authorizerName() {
        return this.authorizerName;
    }

    private GetAuthorizerArgs() {}

    private GetAuthorizerArgs(GetAuthorizerArgs $) {
        this.authorizerName = $.authorizerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizerArgs $;

        public Builder() {
            $ = new GetAuthorizerArgs();
        }

        public Builder(GetAuthorizerArgs defaults) {
            $ = new GetAuthorizerArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizerName(Output<String> authorizerName) {
            $.authorizerName = authorizerName;
            return this;
        }

        public Builder authorizerName(String authorizerName) {
            return authorizerName(Output.of(authorizerName));
        }

        public GetAuthorizerArgs build() {
            $.authorizerName = Objects.requireNonNull($.authorizerName, "expected parameter 'authorizerName' to be non-null");
            return $;
        }
    }

}
