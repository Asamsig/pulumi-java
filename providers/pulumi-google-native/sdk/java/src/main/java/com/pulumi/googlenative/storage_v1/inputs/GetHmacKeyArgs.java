// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHmacKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHmacKeyArgs Empty = new GetHmacKeyArgs();

    @Import(name="accessId", required=true)
    private Output<String> accessId;

    public Output<String> accessId() {
        return this.accessId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="userProject")
    private @Nullable Output<String> userProject;

    public Optional<Output<String>> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    private GetHmacKeyArgs() {}

    private GetHmacKeyArgs(GetHmacKeyArgs $) {
        this.accessId = $.accessId;
        this.project = $.project;
        this.userProject = $.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHmacKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHmacKeyArgs $;

        public Builder() {
            $ = new GetHmacKeyArgs();
        }

        public Builder(GetHmacKeyArgs defaults) {
            $ = new GetHmacKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessId(Output<String> accessId) {
            $.accessId = accessId;
            return this;
        }

        public Builder accessId(String accessId) {
            return accessId(Output.of(accessId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder userProject(@Nullable Output<String> userProject) {
            $.userProject = userProject;
            return this;
        }

        public Builder userProject(String userProject) {
            return userProject(Output.of(userProject));
        }

        public GetHmacKeyArgs build() {
            $.accessId = Objects.requireNonNull($.accessId, "expected parameter 'accessId' to be non-null");
            return $;
        }
    }

}
