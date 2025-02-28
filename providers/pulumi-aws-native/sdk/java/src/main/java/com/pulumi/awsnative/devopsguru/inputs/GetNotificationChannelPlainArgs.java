// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devopsguru.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationChannelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationChannelPlainArgs Empty = new GetNotificationChannelPlainArgs();

    /**
     * The ID of a notification channel.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of a notification channel.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetNotificationChannelPlainArgs() {}

    private GetNotificationChannelPlainArgs(GetNotificationChannelPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationChannelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationChannelPlainArgs $;

        public Builder() {
            $ = new GetNotificationChannelPlainArgs();
        }

        public Builder(GetNotificationChannelPlainArgs defaults) {
            $ = new GetNotificationChannelPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of a notification channel.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetNotificationChannelPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
