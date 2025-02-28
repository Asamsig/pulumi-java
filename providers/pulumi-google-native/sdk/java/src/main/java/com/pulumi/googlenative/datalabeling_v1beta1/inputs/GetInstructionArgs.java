// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstructionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstructionArgs Empty = new GetInstructionArgs();

    @Import(name="instructionId", required=true)
    private Output<String> instructionId;

    public Output<String> instructionId() {
        return this.instructionId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstructionArgs() {}

    private GetInstructionArgs(GetInstructionArgs $) {
        this.instructionId = $.instructionId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstructionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstructionArgs $;

        public Builder() {
            $ = new GetInstructionArgs();
        }

        public Builder(GetInstructionArgs defaults) {
            $ = new GetInstructionArgs(Objects.requireNonNull(defaults));
        }

        public Builder instructionId(Output<String> instructionId) {
            $.instructionId = instructionId;
            return this;
        }

        public Builder instructionId(String instructionId) {
            return instructionId(Output.of(instructionId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetInstructionArgs build() {
            $.instructionId = Objects.requireNonNull($.instructionId, "expected parameter 'instructionId' to be non-null");
            return $;
        }
    }

}
