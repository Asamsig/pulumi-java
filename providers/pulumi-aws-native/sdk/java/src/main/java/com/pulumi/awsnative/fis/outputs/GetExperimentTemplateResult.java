// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.fis.outputs;

import com.pulumi.awsnative.fis.outputs.ExperimentTemplateActionMap;
import com.pulumi.awsnative.fis.outputs.ExperimentTemplateLogConfiguration;
import com.pulumi.awsnative.fis.outputs.ExperimentTemplateStopCondition;
import com.pulumi.awsnative.fis.outputs.ExperimentTemplateTargetMap;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExperimentTemplateResult {
    private final @Nullable ExperimentTemplateActionMap actions;
    private final @Nullable String description;
    private final @Nullable String id;
    private final @Nullable ExperimentTemplateLogConfiguration logConfiguration;
    private final @Nullable String roleArn;
    private final @Nullable List<ExperimentTemplateStopCondition> stopConditions;
    private final @Nullable ExperimentTemplateTargetMap targets;

    @CustomType.Constructor
    private GetExperimentTemplateResult(
        @CustomType.Parameter("actions") @Nullable ExperimentTemplateActionMap actions,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("logConfiguration") @Nullable ExperimentTemplateLogConfiguration logConfiguration,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("stopConditions") @Nullable List<ExperimentTemplateStopCondition> stopConditions,
        @CustomType.Parameter("targets") @Nullable ExperimentTemplateTargetMap targets) {
        this.actions = actions;
        this.description = description;
        this.id = id;
        this.logConfiguration = logConfiguration;
        this.roleArn = roleArn;
        this.stopConditions = stopConditions;
        this.targets = targets;
    }

    public Optional<ExperimentTemplateActionMap> actions() {
        return Optional.ofNullable(this.actions);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<ExperimentTemplateLogConfiguration> logConfiguration() {
        return Optional.ofNullable(this.logConfiguration);
    }
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public List<ExperimentTemplateStopCondition> stopConditions() {
        return this.stopConditions == null ? List.of() : this.stopConditions;
    }
    public Optional<ExperimentTemplateTargetMap> targets() {
        return Optional.ofNullable(this.targets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperimentTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExperimentTemplateActionMap actions;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable ExperimentTemplateLogConfiguration logConfiguration;
        private @Nullable String roleArn;
        private @Nullable List<ExperimentTemplateStopCondition> stopConditions;
        private @Nullable ExperimentTemplateTargetMap targets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperimentTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.logConfiguration = defaults.logConfiguration;
    	      this.roleArn = defaults.roleArn;
    	      this.stopConditions = defaults.stopConditions;
    	      this.targets = defaults.targets;
        }

        public Builder actions(@Nullable ExperimentTemplateActionMap actions) {
            this.actions = actions;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder logConfiguration(@Nullable ExperimentTemplateLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder stopConditions(@Nullable List<ExperimentTemplateStopCondition> stopConditions) {
            this.stopConditions = stopConditions;
            return this;
        }
        public Builder stopConditions(ExperimentTemplateStopCondition... stopConditions) {
            return stopConditions(List.of(stopConditions));
        }
        public Builder targets(@Nullable ExperimentTemplateTargetMap targets) {
            this.targets = targets;
            return this;
        }        public GetExperimentTemplateResult build() {
            return new GetExperimentTemplateResult(actions, description, id, logConfiguration, roleArn, stopConditions, targets);
        }
    }
}
