// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationEndpointArgs Empty = new NotificationEndpointArgs();

    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    @Import(name="notificationDestination")
    private @Nullable Output<String> notificationDestination;

    public Optional<Output<String>> notificationDestination() {
        return Optional.ofNullable(this.notificationDestination);
    }

    private NotificationEndpointArgs() {}

    private NotificationEndpointArgs(NotificationEndpointArgs $) {
        this.locations = $.locations;
        this.notificationDestination = $.notificationDestination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationEndpointArgs $;

        public Builder() {
            $ = new NotificationEndpointArgs();
        }

        public Builder(NotificationEndpointArgs defaults) {
            $ = new NotificationEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        public Builder notificationDestination(@Nullable Output<String> notificationDestination) {
            $.notificationDestination = notificationDestination;
            return this;
        }

        public Builder notificationDestination(String notificationDestination) {
            return notificationDestination(Output.of(notificationDestination));
        }

        public NotificationEndpointArgs build() {
            return $;
        }
    }

}
