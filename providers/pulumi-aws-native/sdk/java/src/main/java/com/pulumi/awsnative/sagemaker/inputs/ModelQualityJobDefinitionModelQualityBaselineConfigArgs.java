// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionConstraintsResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Baseline configuration used to validate that the data conforms to the specified constraints and statistics.
 * 
 */
public final class ModelQualityJobDefinitionModelQualityBaselineConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionModelQualityBaselineConfigArgs Empty = new ModelQualityJobDefinitionModelQualityBaselineConfigArgs();

    @Import(name="baseliningJobName")
    private @Nullable Output<String> baseliningJobName;

    public Optional<Output<String>> baseliningJobName() {
        return Optional.ofNullable(this.baseliningJobName);
    }

    @Import(name="constraintsResource")
    private @Nullable Output<ModelQualityJobDefinitionConstraintsResourceArgs> constraintsResource;

    public Optional<Output<ModelQualityJobDefinitionConstraintsResourceArgs>> constraintsResource() {
        return Optional.ofNullable(this.constraintsResource);
    }

    private ModelQualityJobDefinitionModelQualityBaselineConfigArgs() {}

    private ModelQualityJobDefinitionModelQualityBaselineConfigArgs(ModelQualityJobDefinitionModelQualityBaselineConfigArgs $) {
        this.baseliningJobName = $.baseliningJobName;
        this.constraintsResource = $.constraintsResource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelQualityJobDefinitionModelQualityBaselineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelQualityJobDefinitionModelQualityBaselineConfigArgs $;

        public Builder() {
            $ = new ModelQualityJobDefinitionModelQualityBaselineConfigArgs();
        }

        public Builder(ModelQualityJobDefinitionModelQualityBaselineConfigArgs defaults) {
            $ = new ModelQualityJobDefinitionModelQualityBaselineConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseliningJobName(@Nullable Output<String> baseliningJobName) {
            $.baseliningJobName = baseliningJobName;
            return this;
        }

        public Builder baseliningJobName(String baseliningJobName) {
            return baseliningJobName(Output.of(baseliningJobName));
        }

        public Builder constraintsResource(@Nullable Output<ModelQualityJobDefinitionConstraintsResourceArgs> constraintsResource) {
            $.constraintsResource = constraintsResource;
            return this;
        }

        public Builder constraintsResource(ModelQualityJobDefinitionConstraintsResourceArgs constraintsResource) {
            return constraintsResource(Output.of(constraintsResource));
        }

        public ModelQualityJobDefinitionModelQualityBaselineConfigArgs build() {
            return $;
        }
    }

}
