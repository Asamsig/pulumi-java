// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReleasePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReleasePlainArgs Empty = new GetReleasePlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="releaseId", required=true)
    private String releaseId;

    public String releaseId() {
        return this.releaseId;
    }

    private GetReleasePlainArgs() {}

    private GetReleasePlainArgs(GetReleasePlainArgs $) {
        this.project = $.project;
        this.releaseId = $.releaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReleasePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReleasePlainArgs $;

        public Builder() {
            $ = new GetReleasePlainArgs();
        }

        public Builder(GetReleasePlainArgs defaults) {
            $ = new GetReleasePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder releaseId(String releaseId) {
            $.releaseId = releaseId;
            return this;
        }

        public GetReleasePlainArgs build() {
            $.releaseId = Objects.requireNonNull($.releaseId, "expected parameter 'releaseId' to be non-null");
            return $;
        }
    }

}
