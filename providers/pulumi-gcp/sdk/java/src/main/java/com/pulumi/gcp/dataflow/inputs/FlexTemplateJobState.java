// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexTemplateJobState extends com.pulumi.resources.ResourceArgs {

    public static final FlexTemplateJobState Empty = new FlexTemplateJobState();

    /**
     * The GCS path to the Dataflow job Flex
     * Template.
     * 
     */
    @Import(name="containerSpecGcsPath")
    private @Nullable Output<String> containerSpecGcsPath;

    /**
     * @return The GCS path to the Dataflow job Flex
     * Template.
     * 
     */
    public Optional<Output<String>> containerSpecGcsPath() {
        return Optional.ofNullable(this.containerSpecGcsPath);
    }

    /**
     * The unique ID of this job.
     * 
     */
    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    /**
     * @return The unique ID of this job.
     * 
     */
    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * User labels to be specified for the job. Keys and values
     * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
     * page. **Note**: This field is marked as deprecated as the API does not currently
     * support adding labels.
     * **NOTE**: Google-provided Dataflow templates often provide default labels
     * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
     * labels will be ignored to prevent diffs on re-apply.
     * 
     * @deprecated
     * Deprecated until the API supports this field
     * 
     */
    @Deprecated /* Deprecated until the API supports this field */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return User labels to be specified for the job. Keys and values
     * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
     * page. **Note**: This field is marked as deprecated as the API does not currently
     * support adding labels.
     * **NOTE**: Google-provided Dataflow templates often provide default labels
     * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
     * labels will be ignored to prevent diffs on re-apply.
     * 
     * @deprecated
     * Deprecated until the API supports this field
     * 
     */
    @Deprecated /* Deprecated until the API supports this field */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * A unique name for the resource, required by Dataflow.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource, required by Dataflow.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One of &#34;drain&#34; or &#34;cancel&#34;. Specifies behavior of
     * deletion during `pulumi destroy`.  See above note.
     * 
     */
    @Import(name="onDelete")
    private @Nullable Output<String> onDelete;

    /**
     * @return One of &#34;drain&#34; or &#34;cancel&#34;. Specifies behavior of
     * deletion during `pulumi destroy`.  See above note.
     * 
     */
    public Optional<Output<String>> onDelete() {
        return Optional.ofNullable(this.onDelete);
    }

    /**
     * Key/Value pairs to be passed to the Dataflow job (as
     * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
     * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    /**
     * @return Key/Value pairs to be passed to the Dataflow job (as
     * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
     * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
     * 
     */
    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The project in which the resource belongs. If it is not
     * provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it is not
     * provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the created job should run.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which the created job should run.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * If true, treat DRAINING and CANCELLING as terminal job states and do not wait for further changes before removing from
     * terraform state and moving on. WARNING: this will lead to job name conflicts if you do not ensure that the job names are
     * different, e.g. by embedding a release ID or by using a random_id.
     * 
     */
    @Import(name="skipWaitOnJobTermination")
    private @Nullable Output<Boolean> skipWaitOnJobTermination;

    /**
     * @return If true, treat DRAINING and CANCELLING as terminal job states and do not wait for further changes before removing from
     * terraform state and moving on. WARNING: this will lead to job name conflicts if you do not ensure that the job names are
     * different, e.g. by embedding a release ID or by using a random_id.
     * 
     */
    public Optional<Output<Boolean>> skipWaitOnJobTermination() {
        return Optional.ofNullable(this.skipWaitOnJobTermination);
    }

    /**
     * The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private FlexTemplateJobState() {}

    private FlexTemplateJobState(FlexTemplateJobState $) {
        this.containerSpecGcsPath = $.containerSpecGcsPath;
        this.jobId = $.jobId;
        this.labels = $.labels;
        this.name = $.name;
        this.onDelete = $.onDelete;
        this.parameters = $.parameters;
        this.project = $.project;
        this.region = $.region;
        this.skipWaitOnJobTermination = $.skipWaitOnJobTermination;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexTemplateJobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexTemplateJobState $;

        public Builder() {
            $ = new FlexTemplateJobState();
        }

        public Builder(FlexTemplateJobState defaults) {
            $ = new FlexTemplateJobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerSpecGcsPath The GCS path to the Dataflow job Flex
         * Template.
         * 
         * @return builder
         * 
         */
        public Builder containerSpecGcsPath(@Nullable Output<String> containerSpecGcsPath) {
            $.containerSpecGcsPath = containerSpecGcsPath;
            return this;
        }

        /**
         * @param containerSpecGcsPath The GCS path to the Dataflow job Flex
         * Template.
         * 
         * @return builder
         * 
         */
        public Builder containerSpecGcsPath(String containerSpecGcsPath) {
            return containerSpecGcsPath(Output.of(containerSpecGcsPath));
        }

        /**
         * @param jobId The unique ID of this job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId The unique ID of this job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param labels User labels to be specified for the job. Keys and values
         * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
         * page. **Note**: This field is marked as deprecated as the API does not currently
         * support adding labels.
         * **NOTE**: Google-provided Dataflow templates often provide default labels
         * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
         * labels will be ignored to prevent diffs on re-apply.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated until the API supports this field
         * 
         */
        @Deprecated /* Deprecated until the API supports this field */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User labels to be specified for the job. Keys and values
         * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
         * page. **Note**: This field is marked as deprecated as the API does not currently
         * support adding labels.
         * **NOTE**: Google-provided Dataflow templates often provide default labels
         * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
         * labels will be ignored to prevent diffs on re-apply.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated until the API supports this field
         * 
         */
        @Deprecated /* Deprecated until the API supports this field */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name A unique name for the resource, required by Dataflow.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource, required by Dataflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onDelete One of &#34;drain&#34; or &#34;cancel&#34;. Specifies behavior of
         * deletion during `pulumi destroy`.  See above note.
         * 
         * @return builder
         * 
         */
        public Builder onDelete(@Nullable Output<String> onDelete) {
            $.onDelete = onDelete;
            return this;
        }

        /**
         * @param onDelete One of &#34;drain&#34; or &#34;cancel&#34;. Specifies behavior of
         * deletion during `pulumi destroy`.  See above note.
         * 
         * @return builder
         * 
         */
        public Builder onDelete(String onDelete) {
            return onDelete(Output.of(onDelete));
        }

        /**
         * @param parameters Key/Value pairs to be passed to the Dataflow job (as
         * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
         * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Key/Value pairs to be passed to the Dataflow job (as
         * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
         * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param project The project in which the resource belongs. If it is not
         * provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it is not
         * provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region in which the created job should run.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which the created job should run.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param skipWaitOnJobTermination If true, treat DRAINING and CANCELLING as terminal job states and do not wait for further changes before removing from
         * terraform state and moving on. WARNING: this will lead to job name conflicts if you do not ensure that the job names are
         * different, e.g. by embedding a release ID or by using a random_id.
         * 
         * @return builder
         * 
         */
        public Builder skipWaitOnJobTermination(@Nullable Output<Boolean> skipWaitOnJobTermination) {
            $.skipWaitOnJobTermination = skipWaitOnJobTermination;
            return this;
        }

        /**
         * @param skipWaitOnJobTermination If true, treat DRAINING and CANCELLING as terminal job states and do not wait for further changes before removing from
         * terraform state and moving on. WARNING: this will lead to job name conflicts if you do not ensure that the job names are
         * different, e.g. by embedding a release ID or by using a random_id.
         * 
         * @return builder
         * 
         */
        public Builder skipWaitOnJobTermination(Boolean skipWaitOnJobTermination) {
            return skipWaitOnJobTermination(Output.of(skipWaitOnJobTermination));
        }

        /**
         * @param state The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public FlexTemplateJobState build() {
            return $;
        }
    }

}
