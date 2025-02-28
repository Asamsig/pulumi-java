// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * A JSON object that contains the activities that will be associated with the Data Factory Pipeline.
     * 
     */
    @Import(name="activitiesJson")
    private @Nullable Output<String> activitiesJson;

    /**
     * @return A JSON object that contains the activities that will be associated with the Data Factory Pipeline.
     * 
     */
    public Optional<Output<String>> activitiesJson() {
        return Optional.ofNullable(this.activitiesJson);
    }

    /**
     * List of tags that can be used for describing the Data Factory Pipeline.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Pipeline.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The max number of concurrent runs for the Data Factory Pipeline. Must be between `1` and `50`.
     * 
     */
    @Import(name="concurrency")
    private @Nullable Output<Integer> concurrency;

    /**
     * @return The max number of concurrent runs for the Data Factory Pipeline. Must be between `1` and `50`.
     * 
     */
    public Optional<Output<Integer>> concurrency() {
        return Optional.ofNullable(this.concurrency);
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId", required=true)
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }

    /**
     * The description for the Data Factory Pipeline.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Pipeline.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The folder that this Pipeline is in. If not specified, the Pipeline will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The folder that this Pipeline is in. If not specified, the Pipeline will appear at the root level.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The TimeSpan value after which an Azure Monitoring Metric is fired.
     * 
     */
    @Import(name="moniterMetricsAfterDuration")
    private @Nullable Output<String> moniterMetricsAfterDuration;

    /**
     * @return The TimeSpan value after which an Azure Monitoring Metric is fired.
     * 
     */
    public Optional<Output<String>> moniterMetricsAfterDuration() {
        return Optional.ofNullable(this.moniterMetricsAfterDuration);
    }

    /**
     * Specifies the name of the Data Factory Pipeline. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Pipeline. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Data Factory Pipeline.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Pipeline.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * A map of variables to associate with the Data Factory Pipeline.
     * 
     */
    @Import(name="variables")
    private @Nullable Output<Map<String,String>> variables;

    /**
     * @return A map of variables to associate with the Data Factory Pipeline.
     * 
     */
    public Optional<Output<Map<String,String>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private PipelineArgs() {}

    private PipelineArgs(PipelineArgs $) {
        this.activitiesJson = $.activitiesJson;
        this.annotations = $.annotations;
        this.concurrency = $.concurrency;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.folder = $.folder;
        this.moniterMetricsAfterDuration = $.moniterMetricsAfterDuration;
        this.name = $.name;
        this.parameters = $.parameters;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineArgs $;

        public Builder() {
            $ = new PipelineArgs();
        }

        public Builder(PipelineArgs defaults) {
            $ = new PipelineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activitiesJson A JSON object that contains the activities that will be associated with the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder activitiesJson(@Nullable Output<String> activitiesJson) {
            $.activitiesJson = activitiesJson;
            return this;
        }

        /**
         * @param activitiesJson A JSON object that contains the activities that will be associated with the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder activitiesJson(String activitiesJson) {
            return activitiesJson(Output.of(activitiesJson));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param concurrency The max number of concurrent runs for the Data Factory Pipeline. Must be between `1` and `50`.
         * 
         * @return builder
         * 
         */
        public Builder concurrency(@Nullable Output<Integer> concurrency) {
            $.concurrency = concurrency;
            return this;
        }

        /**
         * @param concurrency The max number of concurrent runs for the Data Factory Pipeline. Must be between `1` and `50`.
         * 
         * @return builder
         * 
         */
        public Builder concurrency(Integer concurrency) {
            return concurrency(Output.of(concurrency));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description The description for the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param folder The folder that this Pipeline is in. If not specified, the Pipeline will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The folder that this Pipeline is in. If not specified, the Pipeline will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param moniterMetricsAfterDuration The TimeSpan value after which an Azure Monitoring Metric is fired.
         * 
         * @return builder
         * 
         */
        public Builder moniterMetricsAfterDuration(@Nullable Output<String> moniterMetricsAfterDuration) {
            $.moniterMetricsAfterDuration = moniterMetricsAfterDuration;
            return this;
        }

        /**
         * @param moniterMetricsAfterDuration The TimeSpan value after which an Azure Monitoring Metric is fired.
         * 
         * @return builder
         * 
         */
        public Builder moniterMetricsAfterDuration(String moniterMetricsAfterDuration) {
            return moniterMetricsAfterDuration(Output.of(moniterMetricsAfterDuration));
        }

        /**
         * @param name Specifies the name of the Data Factory Pipeline. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Pipeline. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param variables A map of variables to associate with the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<Map<String,String>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables A map of variables to associate with the Data Factory Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder variables(Map<String,String> variables) {
            return variables(Output.of(variables));
        }

        public PipelineArgs build() {
            $.dataFactoryId = Objects.requireNonNull($.dataFactoryId, "expected parameter 'dataFactoryId' to be non-null");
            return $;
        }
    }

}
