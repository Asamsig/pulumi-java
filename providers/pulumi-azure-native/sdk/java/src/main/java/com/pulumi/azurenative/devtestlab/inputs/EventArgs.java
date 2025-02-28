// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.NotificationChannelEventType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An event to be notified for.
 * 
 */
public final class EventArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventArgs Empty = new EventArgs();

    /**
     * The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
     * 
     */
    @Import(name="eventName")
    private @Nullable Output<Either<String,NotificationChannelEventType>> eventName;

    /**
     * @return The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
     * 
     */
    public Optional<Output<Either<String,NotificationChannelEventType>>> eventName() {
        return Optional.ofNullable(this.eventName);
    }

    private EventArgs() {}

    private EventArgs(EventArgs $) {
        this.eventName = $.eventName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventArgs $;

        public Builder() {
            $ = new EventArgs();
        }

        public Builder(EventArgs defaults) {
            $ = new EventArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventName The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
         * 
         * @return builder
         * 
         */
        public Builder eventName(@Nullable Output<Either<String,NotificationChannelEventType>> eventName) {
            $.eventName = eventName;
            return this;
        }

        /**
         * @param eventName The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
         * 
         * @return builder
         * 
         */
        public Builder eventName(Either<String,NotificationChannelEventType> eventName) {
            return eventName(Output.of(eventName));
        }

        /**
         * @param eventName The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
         * 
         * @return builder
         * 
         */
        public Builder eventName(String eventName) {
            return eventName(Either.ofLeft(eventName));
        }

        /**
         * @param eventName The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
         * 
         * @return builder
         * 
         */
        public Builder eventName(NotificationChannelEventType eventName) {
            return eventName(Either.ofRight(eventName));
        }

        public EventArgs build() {
            return $;
        }
    }

}
