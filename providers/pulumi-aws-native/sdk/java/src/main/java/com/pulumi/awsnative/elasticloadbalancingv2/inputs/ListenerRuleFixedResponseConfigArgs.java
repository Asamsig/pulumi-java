// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleFixedResponseConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleFixedResponseConfigArgs Empty = new ListenerRuleFixedResponseConfigArgs();

    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    @Import(name="messageBody")
    private @Nullable Output<String> messageBody;

    public Optional<Output<String>> messageBody() {
        return Optional.ofNullable(this.messageBody);
    }

    @Import(name="statusCode", required=true)
    private Output<String> statusCode;

    public Output<String> statusCode() {
        return this.statusCode;
    }

    private ListenerRuleFixedResponseConfigArgs() {}

    private ListenerRuleFixedResponseConfigArgs(ListenerRuleFixedResponseConfigArgs $) {
        this.contentType = $.contentType;
        this.messageBody = $.messageBody;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleFixedResponseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleFixedResponseConfigArgs $;

        public Builder() {
            $ = new ListenerRuleFixedResponseConfigArgs();
        }

        public Builder(ListenerRuleFixedResponseConfigArgs defaults) {
            $ = new ListenerRuleFixedResponseConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder messageBody(@Nullable Output<String> messageBody) {
            $.messageBody = messageBody;
            return this;
        }

        public Builder messageBody(String messageBody) {
            return messageBody(Output.of(messageBody));
        }

        public Builder statusCode(Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public ListenerRuleFixedResponseConfigArgs build() {
            $.statusCode = Objects.requireNonNull($.statusCode, "expected parameter 'statusCode' to be non-null");
            return $;
        }
    }

}
