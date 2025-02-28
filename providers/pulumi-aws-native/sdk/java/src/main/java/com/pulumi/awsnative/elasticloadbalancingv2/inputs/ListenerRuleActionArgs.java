// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleAuthenticateCognitoConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleAuthenticateOidcConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleFixedResponseConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleForwardConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleRedirectConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionArgs Empty = new ListenerRuleActionArgs();

    @Import(name="authenticateCognitoConfig")
    private @Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig;

    public Optional<Output<ListenerRuleAuthenticateCognitoConfigArgs>> authenticateCognitoConfig() {
        return Optional.ofNullable(this.authenticateCognitoConfig);
    }

    @Import(name="authenticateOidcConfig")
    private @Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig;

    public Optional<Output<ListenerRuleAuthenticateOidcConfigArgs>> authenticateOidcConfig() {
        return Optional.ofNullable(this.authenticateOidcConfig);
    }

    @Import(name="fixedResponseConfig")
    private @Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig;

    public Optional<Output<ListenerRuleFixedResponseConfigArgs>> fixedResponseConfig() {
        return Optional.ofNullable(this.fixedResponseConfig);
    }

    @Import(name="forwardConfig")
    private @Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig;

    public Optional<Output<ListenerRuleForwardConfigArgs>> forwardConfig() {
        return Optional.ofNullable(this.forwardConfig);
    }

    @Import(name="order")
    private @Nullable Output<Integer> order;

    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    @Import(name="redirectConfig")
    private @Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig;

    public Optional<Output<ListenerRuleRedirectConfigArgs>> redirectConfig() {
        return Optional.ofNullable(this.redirectConfig);
    }

    @Import(name="targetGroupArn")
    private @Nullable Output<String> targetGroupArn;

    public Optional<Output<String>> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ListenerRuleActionArgs() {}

    private ListenerRuleActionArgs(ListenerRuleActionArgs $) {
        this.authenticateCognitoConfig = $.authenticateCognitoConfig;
        this.authenticateOidcConfig = $.authenticateOidcConfig;
        this.fixedResponseConfig = $.fixedResponseConfig;
        this.forwardConfig = $.forwardConfig;
        this.order = $.order;
        this.redirectConfig = $.redirectConfig;
        this.targetGroupArn = $.targetGroupArn;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleActionArgs $;

        public Builder() {
            $ = new ListenerRuleActionArgs();
        }

        public Builder(ListenerRuleActionArgs defaults) {
            $ = new ListenerRuleActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticateCognitoConfig(@Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig) {
            $.authenticateCognitoConfig = authenticateCognitoConfig;
            return this;
        }

        public Builder authenticateCognitoConfig(ListenerRuleAuthenticateCognitoConfigArgs authenticateCognitoConfig) {
            return authenticateCognitoConfig(Output.of(authenticateCognitoConfig));
        }

        public Builder authenticateOidcConfig(@Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig) {
            $.authenticateOidcConfig = authenticateOidcConfig;
            return this;
        }

        public Builder authenticateOidcConfig(ListenerRuleAuthenticateOidcConfigArgs authenticateOidcConfig) {
            return authenticateOidcConfig(Output.of(authenticateOidcConfig));
        }

        public Builder fixedResponseConfig(@Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig) {
            $.fixedResponseConfig = fixedResponseConfig;
            return this;
        }

        public Builder fixedResponseConfig(ListenerRuleFixedResponseConfigArgs fixedResponseConfig) {
            return fixedResponseConfig(Output.of(fixedResponseConfig));
        }

        public Builder forwardConfig(@Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig) {
            $.forwardConfig = forwardConfig;
            return this;
        }

        public Builder forwardConfig(ListenerRuleForwardConfigArgs forwardConfig) {
            return forwardConfig(Output.of(forwardConfig));
        }

        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public Builder redirectConfig(@Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig) {
            $.redirectConfig = redirectConfig;
            return this;
        }

        public Builder redirectConfig(ListenerRuleRedirectConfigArgs redirectConfig) {
            return redirectConfig(Output.of(redirectConfig));
        }

        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            $.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder targetGroupArn(String targetGroupArn) {
            return targetGroupArn(Output.of(targetGroupArn));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ListenerRuleActionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
