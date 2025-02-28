// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionKernelCapabilities {
    private final @Nullable List<String> add;
    private final @Nullable List<String> drop;

    @CustomType.Constructor
    private TaskDefinitionKernelCapabilities(
        @CustomType.Parameter("add") @Nullable List<String> add,
        @CustomType.Parameter("drop") @Nullable List<String> drop) {
        this.add = add;
        this.drop = drop;
    }

    public List<String> add() {
        return this.add == null ? List.of() : this.add;
    }
    public List<String> drop() {
        return this.drop == null ? List.of() : this.drop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionKernelCapabilities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> add;
        private @Nullable List<String> drop;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionKernelCapabilities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.add = defaults.add;
    	      this.drop = defaults.drop;
        }

        public Builder add(@Nullable List<String> add) {
            this.add = add;
            return this;
        }
        public Builder add(String... add) {
            return add(List.of(add));
        }
        public Builder drop(@Nullable List<String> drop) {
            this.drop = drop;
            return this;
        }
        public Builder drop(String... drop) {
            return drop(List.of(drop));
        }        public TaskDefinitionKernelCapabilities build() {
            return new TaskDefinitionKernelCapabilities(add, drop);
        }
    }
}
