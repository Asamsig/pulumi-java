// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIndexArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIndexArgs Empty = new GetIndexArgs();

    @Import(name="databaseId", required=true)
    private Output<String> databaseId;

    public Output<String> databaseId() {
        return this.databaseId;
    }

    @Import(name="indexId", required=true)
    private Output<String> indexId;

    public Output<String> indexId() {
        return this.indexId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetIndexArgs() {}

    private GetIndexArgs(GetIndexArgs $) {
        this.databaseId = $.databaseId;
        this.indexId = $.indexId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIndexArgs $;

        public Builder() {
            $ = new GetIndexArgs();
        }

        public Builder(GetIndexArgs defaults) {
            $ = new GetIndexArgs(Objects.requireNonNull(defaults));
        }

        public Builder databaseId(Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        public Builder indexId(Output<String> indexId) {
            $.indexId = indexId;
            return this;
        }

        public Builder indexId(String indexId) {
            return indexId(Output.of(indexId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetIndexArgs build() {
            $.databaseId = Objects.requireNonNull($.databaseId, "expected parameter 'databaseId' to be non-null");
            $.indexId = Objects.requireNonNull($.indexId, "expected parameter 'indexId' to be non-null");
            return $;
        }
    }

}
