// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteArgs Empty = new GetRouteArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="route", required=true)
    private Output<String> route;

    public Output<String> route() {
        return this.route;
    }

    private GetRouteArgs() {}

    private GetRouteArgs(GetRouteArgs $) {
        this.project = $.project;
        this.route = $.route;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteArgs $;

        public Builder() {
            $ = new GetRouteArgs();
        }

        public Builder(GetRouteArgs defaults) {
            $ = new GetRouteArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder route(Output<String> route) {
            $.route = route;
            return this;
        }

        public Builder route(String route) {
            return route(Output.of(route));
        }

        public GetRouteArgs build() {
            $.route = Objects.requireNonNull($.route, "expected parameter 'route' to be non-null");
            return $;
        }
    }

}
