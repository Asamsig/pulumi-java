// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults_v1beta3.enums.IndividualOutcomeOutcomeSummary;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.DurationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Step Id and outcome of each individual step that was run as a group with other steps with the same configuration.
 * 
 */
public final class IndividualOutcomeArgs extends com.pulumi.resources.ResourceArgs {

    public static final IndividualOutcomeArgs Empty = new IndividualOutcomeArgs();

    /**
     * Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
     */
    @Import(name="multistepNumber")
    private @Nullable Output<Integer> multistepNumber;

    /**
     * @return Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
     */
    public Optional<Output<Integer>> multistepNumber() {
        return Optional.ofNullable(this.multistepNumber);
    }

    @Import(name="outcomeSummary")
    private @Nullable Output<IndividualOutcomeOutcomeSummary> outcomeSummary;

    public Optional<Output<IndividualOutcomeOutcomeSummary>> outcomeSummary() {
        return Optional.ofNullable(this.outcomeSummary);
    }

    /**
     * How long it took for this step to run.
     * 
     */
    @Import(name="runDuration")
    private @Nullable Output<DurationArgs> runDuration;

    /**
     * @return How long it took for this step to run.
     * 
     */
    public Optional<Output<DurationArgs>> runDuration() {
        return Optional.ofNullable(this.runDuration);
    }

    @Import(name="stepId")
    private @Nullable Output<String> stepId;

    public Optional<Output<String>> stepId() {
        return Optional.ofNullable(this.stepId);
    }

    private IndividualOutcomeArgs() {}

    private IndividualOutcomeArgs(IndividualOutcomeArgs $) {
        this.multistepNumber = $.multistepNumber;
        this.outcomeSummary = $.outcomeSummary;
        this.runDuration = $.runDuration;
        this.stepId = $.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndividualOutcomeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndividualOutcomeArgs $;

        public Builder() {
            $ = new IndividualOutcomeArgs();
        }

        public Builder(IndividualOutcomeArgs defaults) {
            $ = new IndividualOutcomeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param multistepNumber Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
         * 
         * @return builder
         * 
         */
        public Builder multistepNumber(@Nullable Output<Integer> multistepNumber) {
            $.multistepNumber = multistepNumber;
            return this;
        }

        /**
         * @param multistepNumber Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
         * 
         * @return builder
         * 
         */
        public Builder multistepNumber(Integer multistepNumber) {
            return multistepNumber(Output.of(multistepNumber));
        }

        public Builder outcomeSummary(@Nullable Output<IndividualOutcomeOutcomeSummary> outcomeSummary) {
            $.outcomeSummary = outcomeSummary;
            return this;
        }

        public Builder outcomeSummary(IndividualOutcomeOutcomeSummary outcomeSummary) {
            return outcomeSummary(Output.of(outcomeSummary));
        }

        /**
         * @param runDuration How long it took for this step to run.
         * 
         * @return builder
         * 
         */
        public Builder runDuration(@Nullable Output<DurationArgs> runDuration) {
            $.runDuration = runDuration;
            return this;
        }

        /**
         * @param runDuration How long it took for this step to run.
         * 
         * @return builder
         * 
         */
        public Builder runDuration(DurationArgs runDuration) {
            return runDuration(Output.of(runDuration));
        }

        public Builder stepId(@Nullable Output<String> stepId) {
            $.stepId = stepId;
            return this;
        }

        public Builder stepId(String stepId) {
            return stepId(Output.of(stepId));
        }

        public IndividualOutcomeArgs build() {
            return $;
        }
    }

}
