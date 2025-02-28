// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectServiceAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectServiceAccountPlainArgs Empty = new GetProjectServiceAccountPlainArgs();

    /**
     * The project the unique service account was created for. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project the unique service account was created for. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The project the lookup originates from. This field is used if you are making the request
     * from a different account than the one you are finding the service account for.
     * 
     */
    @Import(name="userProject")
    private @Nullable String userProject;

    /**
     * @return The project the lookup originates from. This field is used if you are making the request
     * from a different account than the one you are finding the service account for.
     * 
     */
    public Optional<String> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    private GetProjectServiceAccountPlainArgs() {}

    private GetProjectServiceAccountPlainArgs(GetProjectServiceAccountPlainArgs $) {
        this.project = $.project;
        this.userProject = $.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectServiceAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectServiceAccountPlainArgs $;

        public Builder() {
            $ = new GetProjectServiceAccountPlainArgs();
        }

        public Builder(GetProjectServiceAccountPlainArgs defaults) {
            $ = new GetProjectServiceAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The project the unique service account was created for. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param userProject The project the lookup originates from. This field is used if you are making the request
         * from a different account than the one you are finding the service account for.
         * 
         * @return builder
         * 
         */
        public Builder userProject(@Nullable String userProject) {
            $.userProject = userProject;
            return this;
        }

        public GetProjectServiceAccountPlainArgs build() {
            return $;
        }
    }

}
