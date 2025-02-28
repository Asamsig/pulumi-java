// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devopsguru;

import com.pulumi.awsnative.devopsguru.inputs.NotificationChannelConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class NotificationChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationChannelArgs Empty = new NotificationChannelArgs();

    @Import(name="config", required=true)
    private Output<NotificationChannelConfigArgs> config;

    public Output<NotificationChannelConfigArgs> config() {
        return this.config;
    }

    private NotificationChannelArgs() {}

    private NotificationChannelArgs(NotificationChannelArgs $) {
        this.config = $.config;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationChannelArgs $;

        public Builder() {
            $ = new NotificationChannelArgs();
        }

        public Builder(NotificationChannelArgs defaults) {
            $ = new NotificationChannelArgs(Objects.requireNonNull(defaults));
        }

        public Builder config(Output<NotificationChannelConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(NotificationChannelConfigArgs config) {
            return config(Output.of(config));
        }

        public NotificationChannelArgs build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            return $;
        }
    }

}
