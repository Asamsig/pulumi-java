// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.enums.TrialState;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_Trial_ParameterArgs;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__MeasurementArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrialArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrialArgs Empty = new TrialArgs();

    /**
     * The final measurement containing the objective value.
     * 
     */
    @Import(name="finalMeasurement")
    private @Nullable Output<GoogleCloudMlV1__MeasurementArgs> finalMeasurement;

    /**
     * @return The final measurement containing the objective value.
     * 
     */
    public Optional<Output<GoogleCloudMlV1__MeasurementArgs>> finalMeasurement() {
        return Optional.ofNullable(this.finalMeasurement);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
     * 
     */
    @Import(name="measurements")
    private @Nullable Output<List<GoogleCloudMlV1__MeasurementArgs>> measurements;

    /**
     * @return A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
     * 
     */
    public Optional<Output<List<GoogleCloudMlV1__MeasurementArgs>>> measurements() {
        return Optional.ofNullable(this.measurements);
    }

    /**
     * The parameters of the trial.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<GoogleCloudMlV1_Trial_ParameterArgs>> parameters;

    /**
     * @return The parameters of the trial.
     * 
     */
    public Optional<Output<List<GoogleCloudMlV1_Trial_ParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The detailed state of a trial.
     * 
     */
    @Import(name="state")
    private @Nullable Output<TrialState> state;

    /**
     * @return The detailed state of a trial.
     * 
     */
    public Optional<Output<TrialState>> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="studyId", required=true)
    private Output<String> studyId;

    public Output<String> studyId() {
        return this.studyId;
    }

    private TrialArgs() {}

    private TrialArgs(TrialArgs $) {
        this.finalMeasurement = $.finalMeasurement;
        this.location = $.location;
        this.measurements = $.measurements;
        this.parameters = $.parameters;
        this.project = $.project;
        this.state = $.state;
        this.studyId = $.studyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrialArgs $;

        public Builder() {
            $ = new TrialArgs();
        }

        public Builder(TrialArgs defaults) {
            $ = new TrialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param finalMeasurement The final measurement containing the objective value.
         * 
         * @return builder
         * 
         */
        public Builder finalMeasurement(@Nullable Output<GoogleCloudMlV1__MeasurementArgs> finalMeasurement) {
            $.finalMeasurement = finalMeasurement;
            return this;
        }

        /**
         * @param finalMeasurement The final measurement containing the objective value.
         * 
         * @return builder
         * 
         */
        public Builder finalMeasurement(GoogleCloudMlV1__MeasurementArgs finalMeasurement) {
            return finalMeasurement(Output.of(finalMeasurement));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param measurements A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
         * 
         * @return builder
         * 
         */
        public Builder measurements(@Nullable Output<List<GoogleCloudMlV1__MeasurementArgs>> measurements) {
            $.measurements = measurements;
            return this;
        }

        /**
         * @param measurements A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
         * 
         * @return builder
         * 
         */
        public Builder measurements(List<GoogleCloudMlV1__MeasurementArgs> measurements) {
            return measurements(Output.of(measurements));
        }

        /**
         * @param measurements A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
         * 
         * @return builder
         * 
         */
        public Builder measurements(GoogleCloudMlV1__MeasurementArgs... measurements) {
            return measurements(List.of(measurements));
        }

        /**
         * @param parameters The parameters of the trial.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<GoogleCloudMlV1_Trial_ParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters of the trial.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<GoogleCloudMlV1_Trial_ParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters The parameters of the trial.
         * 
         * @return builder
         * 
         */
        public Builder parameters(GoogleCloudMlV1_Trial_ParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param state The detailed state of a trial.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<TrialState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The detailed state of a trial.
         * 
         * @return builder
         * 
         */
        public Builder state(TrialState state) {
            return state(Output.of(state));
        }

        public Builder studyId(Output<String> studyId) {
            $.studyId = studyId;
            return this;
        }

        public Builder studyId(String studyId) {
            return studyId(Output.of(studyId));
        }

        public TrialArgs build() {
            $.studyId = Objects.requireNonNull($.studyId, "expected parameter 'studyId' to be non-null");
            return $;
        }
    }

}
