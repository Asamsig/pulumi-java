// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmcontacts.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContactChannelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactChannelPlainArgs Empty = new GetContactChannelPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetContactChannelPlainArgs() {}

    private GetContactChannelPlainArgs(GetContactChannelPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactChannelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactChannelPlainArgs $;

        public Builder() {
            $ = new GetContactChannelPlainArgs();
        }

        public Builder(GetContactChannelPlainArgs defaults) {
            $ = new GetContactChannelPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the engagement to a contact channel.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetContactChannelPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
