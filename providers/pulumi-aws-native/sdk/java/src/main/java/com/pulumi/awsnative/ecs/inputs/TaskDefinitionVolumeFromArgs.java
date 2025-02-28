// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeFromArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeFromArgs Empty = new TaskDefinitionVolumeFromArgs();

    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    @Import(name="sourceContainer")
    private @Nullable Output<String> sourceContainer;

    public Optional<Output<String>> sourceContainer() {
        return Optional.ofNullable(this.sourceContainer);
    }

    private TaskDefinitionVolumeFromArgs() {}

    private TaskDefinitionVolumeFromArgs(TaskDefinitionVolumeFromArgs $) {
        this.readOnly = $.readOnly;
        this.sourceContainer = $.sourceContainer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionVolumeFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionVolumeFromArgs $;

        public Builder() {
            $ = new TaskDefinitionVolumeFromArgs();
        }

        public Builder(TaskDefinitionVolumeFromArgs defaults) {
            $ = new TaskDefinitionVolumeFromArgs(Objects.requireNonNull(defaults));
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public Builder sourceContainer(@Nullable Output<String> sourceContainer) {
            $.sourceContainer = sourceContainer;
            return this;
        }

        public Builder sourceContainer(String sourceContainer) {
            return sourceContainer(Output.of(sourceContainer));
        }

        public TaskDefinitionVolumeFromArgs build() {
            return $;
        }
    }

}
