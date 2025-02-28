// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.azurenative.videoanalyzer.outputs.ParameterDefinitionResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.PipelineJobErrorResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPipelineJobResult {
    /**
     * @return An optional description for the pipeline.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Details about the error, in case the pipeline job fails.
     * 
     */
    private final PipelineJobErrorResponse error;
    /**
     * @return The date-time by when this pipeline job will be automatically deleted from your account.
     * 
     */
    private final String expiration;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
     */
    private final @Nullable List<ParameterDefinitionResponse> parameters;
    /**
     * @return Current state of the pipeline (read-only).
     * 
     */
    private final String state;
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Reference to an existing pipeline topology. When activated, this pipeline job will process content according to the pipeline topology definition.
     * 
     */
    private final String topologyName;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPipelineJobResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("error") PipelineJobErrorResponse error,
        @CustomType.Parameter("expiration") String expiration,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable List<ParameterDefinitionResponse> parameters,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("topologyName") String topologyName,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.error = error;
        this.expiration = expiration;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.state = state;
        this.systemData = systemData;
        this.topologyName = topologyName;
        this.type = type;
    }

    /**
     * @return An optional description for the pipeline.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Details about the error, in case the pipeline job fails.
     * 
     */
    public PipelineJobErrorResponse error() {
        return this.error;
    }
    /**
     * @return The date-time by when this pipeline job will be automatically deleted from your account.
     * 
     */
    public String expiration() {
        return this.expiration;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
     */
    public List<ParameterDefinitionResponse> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * @return Current state of the pipeline (read-only).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Reference to an existing pipeline topology. When activated, this pipeline job will process content according to the pipeline topology definition.
     * 
     */
    public String topologyName() {
        return this.topologyName;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private PipelineJobErrorResponse error;
        private String expiration;
        private String id;
        private String name;
        private @Nullable List<ParameterDefinitionResponse> parameters;
        private String state;
        private SystemDataResponse systemData;
        private String topologyName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.error = defaults.error;
    	      this.expiration = defaults.expiration;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.state = defaults.state;
    	      this.systemData = defaults.systemData;
    	      this.topologyName = defaults.topologyName;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder error(PipelineJobErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder expiration(String expiration) {
            this.expiration = Objects.requireNonNull(expiration);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable List<ParameterDefinitionResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(ParameterDefinitionResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder topologyName(String topologyName) {
            this.topologyName = Objects.requireNonNull(topologyName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetPipelineJobResult build() {
            return new GetPipelineJobResult(description, error, expiration, id, name, parameters, state, systemData, topologyName, type);
        }
    }
}
