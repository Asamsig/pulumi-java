// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect.inputs;

import com.pulumi.awsnative.connect.enums.QuickConnectType;
import com.pulumi.awsnative.connect.inputs.QuickConnectPhoneNumberQuickConnectConfigArgs;
import com.pulumi.awsnative.connect.inputs.QuickConnectQueueQuickConnectConfigArgs;
import com.pulumi.awsnative.connect.inputs.QuickConnectUserQuickConnectConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration settings for the quick connect.
 * 
 */
public final class QuickConnectConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final QuickConnectConfigArgs Empty = new QuickConnectConfigArgs();

    @Import(name="phoneConfig")
    private @Nullable Output<QuickConnectPhoneNumberQuickConnectConfigArgs> phoneConfig;

    public Optional<Output<QuickConnectPhoneNumberQuickConnectConfigArgs>> phoneConfig() {
        return Optional.ofNullable(this.phoneConfig);
    }

    @Import(name="queueConfig")
    private @Nullable Output<QuickConnectQueueQuickConnectConfigArgs> queueConfig;

    public Optional<Output<QuickConnectQueueQuickConnectConfigArgs>> queueConfig() {
        return Optional.ofNullable(this.queueConfig);
    }

    @Import(name="quickConnectType", required=true)
    private Output<QuickConnectType> quickConnectType;

    public Output<QuickConnectType> quickConnectType() {
        return this.quickConnectType;
    }

    @Import(name="userConfig")
    private @Nullable Output<QuickConnectUserQuickConnectConfigArgs> userConfig;

    public Optional<Output<QuickConnectUserQuickConnectConfigArgs>> userConfig() {
        return Optional.ofNullable(this.userConfig);
    }

    private QuickConnectConfigArgs() {}

    private QuickConnectConfigArgs(QuickConnectConfigArgs $) {
        this.phoneConfig = $.phoneConfig;
        this.queueConfig = $.queueConfig;
        this.quickConnectType = $.quickConnectType;
        this.userConfig = $.userConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QuickConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QuickConnectConfigArgs $;

        public Builder() {
            $ = new QuickConnectConfigArgs();
        }

        public Builder(QuickConnectConfigArgs defaults) {
            $ = new QuickConnectConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder phoneConfig(@Nullable Output<QuickConnectPhoneNumberQuickConnectConfigArgs> phoneConfig) {
            $.phoneConfig = phoneConfig;
            return this;
        }

        public Builder phoneConfig(QuickConnectPhoneNumberQuickConnectConfigArgs phoneConfig) {
            return phoneConfig(Output.of(phoneConfig));
        }

        public Builder queueConfig(@Nullable Output<QuickConnectQueueQuickConnectConfigArgs> queueConfig) {
            $.queueConfig = queueConfig;
            return this;
        }

        public Builder queueConfig(QuickConnectQueueQuickConnectConfigArgs queueConfig) {
            return queueConfig(Output.of(queueConfig));
        }

        public Builder quickConnectType(Output<QuickConnectType> quickConnectType) {
            $.quickConnectType = quickConnectType;
            return this;
        }

        public Builder quickConnectType(QuickConnectType quickConnectType) {
            return quickConnectType(Output.of(quickConnectType));
        }

        public Builder userConfig(@Nullable Output<QuickConnectUserQuickConnectConfigArgs> userConfig) {
            $.userConfig = userConfig;
            return this;
        }

        public Builder userConfig(QuickConnectUserQuickConnectConfigArgs userConfig) {
            return userConfig(Output.of(userConfig));
        }

        public QuickConnectConfigArgs build() {
            $.quickConnectType = Objects.requireNonNull($.quickConnectType, "expected parameter 'quickConnectType' to be non-null");
            return $;
        }
    }

}
