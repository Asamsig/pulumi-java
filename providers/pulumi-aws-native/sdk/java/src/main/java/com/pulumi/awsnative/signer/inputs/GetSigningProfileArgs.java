// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.signer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSigningProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSigningProfileArgs Empty = new GetSigningProfileArgs();

    /**
     * The Amazon Resource Name (ARN) of the specified signing profile.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the specified signing profile.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetSigningProfileArgs() {}

    private GetSigningProfileArgs(GetSigningProfileArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSigningProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSigningProfileArgs $;

        public Builder() {
            $ = new GetSigningProfileArgs();
        }

        public Builder(GetSigningProfileArgs defaults) {
            $ = new GetSigningProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the specified signing profile.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the specified signing profile.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetSigningProfileArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
