// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoutePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoutePlainArgs Empty = new GetRoutePlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="privateConnectionId", required=true)
    private String privateConnectionId;

    public String privateConnectionId() {
        return this.privateConnectionId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="routeId", required=true)
    private String routeId;

    public String routeId() {
        return this.routeId;
    }

    private GetRoutePlainArgs() {}

    private GetRoutePlainArgs(GetRoutePlainArgs $) {
        this.location = $.location;
        this.privateConnectionId = $.privateConnectionId;
        this.project = $.project;
        this.routeId = $.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoutePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoutePlainArgs $;

        public Builder() {
            $ = new GetRoutePlainArgs();
        }

        public Builder(GetRoutePlainArgs defaults) {
            $ = new GetRoutePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder privateConnectionId(String privateConnectionId) {
            $.privateConnectionId = privateConnectionId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder routeId(String routeId) {
            $.routeId = routeId;
            return this;
        }

        public GetRoutePlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.privateConnectionId = Objects.requireNonNull($.privateConnectionId, "expected parameter 'privateConnectionId' to be non-null");
            $.routeId = Objects.requireNonNull($.routeId, "expected parameter 'routeId' to be non-null");
            return $;
        }
    }

}
