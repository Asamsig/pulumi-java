// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetModelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelPlainArgs Empty = new GetModelPlainArgs();

    @Import(name="modelId", required=true)
    private String modelId;

    public String modelId() {
        return this.modelId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetModelPlainArgs() {}

    private GetModelPlainArgs(GetModelPlainArgs $) {
        this.modelId = $.modelId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelPlainArgs $;

        public Builder() {
            $ = new GetModelPlainArgs();
        }

        public Builder(GetModelPlainArgs defaults) {
            $ = new GetModelPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder modelId(String modelId) {
            $.modelId = modelId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetModelPlainArgs build() {
            $.modelId = Objects.requireNonNull($.modelId, "expected parameter 'modelId' to be non-null");
            return $;
        }
    }

}
