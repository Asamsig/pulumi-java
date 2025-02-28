// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHttpsHealthCheckPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpsHealthCheckPlainArgs Empty = new GetHttpsHealthCheckPlainArgs();

    @Import(name="httpsHealthCheck", required=true)
    private String httpsHealthCheck;

    public String httpsHealthCheck() {
        return this.httpsHealthCheck;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetHttpsHealthCheckPlainArgs() {}

    private GetHttpsHealthCheckPlainArgs(GetHttpsHealthCheckPlainArgs $) {
        this.httpsHealthCheck = $.httpsHealthCheck;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpsHealthCheckPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpsHealthCheckPlainArgs $;

        public Builder() {
            $ = new GetHttpsHealthCheckPlainArgs();
        }

        public Builder(GetHttpsHealthCheckPlainArgs defaults) {
            $ = new GetHttpsHealthCheckPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder httpsHealthCheck(String httpsHealthCheck) {
            $.httpsHealthCheck = httpsHealthCheck;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetHttpsHealthCheckPlainArgs build() {
            $.httpsHealthCheck = Objects.requireNonNull($.httpsHealthCheck, "expected parameter 'httpsHealthCheck' to be non-null");
            return $;
        }
    }

}
