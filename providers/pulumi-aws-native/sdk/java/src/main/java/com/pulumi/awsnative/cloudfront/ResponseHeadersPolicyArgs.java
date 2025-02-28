// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront;

import com.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class ResponseHeadersPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyArgs Empty = new ResponseHeadersPolicyArgs();

    @Import(name="responseHeadersPolicyConfig", required=true)
    private Output<ResponseHeadersPolicyConfigArgs> responseHeadersPolicyConfig;

    public Output<ResponseHeadersPolicyConfigArgs> responseHeadersPolicyConfig() {
        return this.responseHeadersPolicyConfig;
    }

    private ResponseHeadersPolicyArgs() {}

    private ResponseHeadersPolicyArgs(ResponseHeadersPolicyArgs $) {
        this.responseHeadersPolicyConfig = $.responseHeadersPolicyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyArgs();
        }

        public Builder(ResponseHeadersPolicyArgs defaults) {
            $ = new ResponseHeadersPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder responseHeadersPolicyConfig(Output<ResponseHeadersPolicyConfigArgs> responseHeadersPolicyConfig) {
            $.responseHeadersPolicyConfig = responseHeadersPolicyConfig;
            return this;
        }

        public Builder responseHeadersPolicyConfig(ResponseHeadersPolicyConfigArgs responseHeadersPolicyConfig) {
            return responseHeadersPolicyConfig(Output.of(responseHeadersPolicyConfig));
        }

        public ResponseHeadersPolicyArgs build() {
            $.responseHeadersPolicyConfig = Objects.requireNonNull($.responseHeadersPolicyConfig, "expected parameter 'responseHeadersPolicyConfig' to be non-null");
            return $;
        }
    }

}
