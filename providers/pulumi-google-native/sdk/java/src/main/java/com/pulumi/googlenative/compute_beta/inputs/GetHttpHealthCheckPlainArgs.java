// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHttpHealthCheckPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpHealthCheckPlainArgs Empty = new GetHttpHealthCheckPlainArgs();

    @Import(name="httpHealthCheck", required=true)
    private String httpHealthCheck;

    public String httpHealthCheck() {
        return this.httpHealthCheck;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetHttpHealthCheckPlainArgs() {}

    private GetHttpHealthCheckPlainArgs(GetHttpHealthCheckPlainArgs $) {
        this.httpHealthCheck = $.httpHealthCheck;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpHealthCheckPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpHealthCheckPlainArgs $;

        public Builder() {
            $ = new GetHttpHealthCheckPlainArgs();
        }

        public Builder(GetHttpHealthCheckPlainArgs defaults) {
            $ = new GetHttpHealthCheckPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder httpHealthCheck(String httpHealthCheck) {
            $.httpHealthCheck = httpHealthCheck;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetHttpHealthCheckPlainArgs build() {
            $.httpHealthCheck = Objects.requireNonNull($.httpHealthCheck, "expected parameter 'httpHealthCheck' to be non-null");
            return $;
        }
    }

}
