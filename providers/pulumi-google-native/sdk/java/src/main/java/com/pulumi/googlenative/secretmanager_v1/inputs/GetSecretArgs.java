// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretArgs Empty = new GetSecretArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="secretId", required=true)
    private Output<String> secretId;

    public Output<String> secretId() {
        return this.secretId;
    }

    private GetSecretArgs() {}

    private GetSecretArgs(GetSecretArgs $) {
        this.project = $.project;
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretArgs $;

        public Builder() {
            $ = new GetSecretArgs();
        }

        public Builder(GetSecretArgs defaults) {
            $ = new GetSecretArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder secretId(Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        public GetSecretArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
