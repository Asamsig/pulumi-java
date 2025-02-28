// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretVersionArgs Empty = new GetSecretVersionArgs();

    /**
     * The project to get the secret version for. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project to get the secret version for. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The secret to get the secret version for.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The secret to get the secret version for.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    /**
     * The version of the secret to get. If it
     * is not provided, the latest version is retrieved.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the secret to get. If it
     * is not provided, the latest version is retrieved.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetSecretVersionArgs() {}

    private GetSecretVersionArgs(GetSecretVersionArgs $) {
        this.project = $.project;
        this.secret = $.secret;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretVersionArgs $;

        public Builder() {
            $ = new GetSecretVersionArgs();
        }

        public Builder(GetSecretVersionArgs defaults) {
            $ = new GetSecretVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The project to get the secret version for. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project to get the secret version for. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param secret The secret to get the secret version for.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The secret to get the secret version for.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param version The version of the secret to get. If it
         * is not provided, the latest version is retrieved.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the secret to get. If it
         * is not provided, the latest version is retrieved.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GetSecretVersionArgs build() {
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}
