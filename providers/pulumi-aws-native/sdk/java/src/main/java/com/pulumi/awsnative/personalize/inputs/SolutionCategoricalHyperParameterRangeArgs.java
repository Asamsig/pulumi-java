// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Provides the name and values of a Categorical hyperparameter.
 * 
 */
public final class SolutionCategoricalHyperParameterRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SolutionCategoricalHyperParameterRangeArgs Empty = new SolutionCategoricalHyperParameterRangeArgs();

    /**
     * The name of the hyperparameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the hyperparameter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of the categories for the hyperparameter.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return A list of the categories for the hyperparameter.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private SolutionCategoricalHyperParameterRangeArgs() {}

    private SolutionCategoricalHyperParameterRangeArgs(SolutionCategoricalHyperParameterRangeArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SolutionCategoricalHyperParameterRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SolutionCategoricalHyperParameterRangeArgs $;

        public Builder() {
            $ = new SolutionCategoricalHyperParameterRangeArgs();
        }

        public Builder(SolutionCategoricalHyperParameterRangeArgs defaults) {
            $ = new SolutionCategoricalHyperParameterRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param values A list of the categories for the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A list of the categories for the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values A list of the categories for the hyperparameter.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public SolutionCategoricalHyperParameterRangeArgs build() {
            return $;
        }
    }

}
