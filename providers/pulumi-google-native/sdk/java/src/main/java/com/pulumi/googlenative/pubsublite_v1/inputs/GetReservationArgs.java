// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReservationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReservationArgs Empty = new GetReservationArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="reservationId", required=true)
    private Output<String> reservationId;

    public Output<String> reservationId() {
        return this.reservationId;
    }

    private GetReservationArgs() {}

    private GetReservationArgs(GetReservationArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.reservationId = $.reservationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReservationArgs $;

        public Builder() {
            $ = new GetReservationArgs();
        }

        public Builder(GetReservationArgs defaults) {
            $ = new GetReservationArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder reservationId(Output<String> reservationId) {
            $.reservationId = reservationId;
            return this;
        }

        public Builder reservationId(String reservationId) {
            return reservationId(Output.of(reservationId));
        }

        public GetReservationArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.reservationId = Objects.requireNonNull($.reservationId, "expected parameter 'reservationId' to be non-null");
            return $;
        }
    }

}
