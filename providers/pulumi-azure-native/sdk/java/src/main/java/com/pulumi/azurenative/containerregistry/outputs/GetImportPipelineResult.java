// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.ImportPipelineSourcePropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.PipelineTriggerPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImportPipelineResult {
    /**
     * @return The resource ID.
     * 
     */
    private final String id;
    /**
     * @return The identity of the import pipeline.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identity;
    /**
     * @return The location of the import pipeline.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return The list of all options configured for the pipeline.
     * 
     */
    private final @Nullable List<String> options;
    /**
     * @return The provisioning state of the pipeline at the time the operation was called.
     * 
     */
    private final String provisioningState;
    /**
     * @return The source properties of the import pipeline.
     * 
     */
    private final ImportPipelineSourcePropertiesResponse source;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The properties that describe the trigger of the import pipeline.
     * 
     */
    private final @Nullable PipelineTriggerPropertiesResponse trigger;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetImportPipelineResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityPropertiesResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("options") @Nullable List<String> options,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("source") ImportPipelineSourcePropertiesResponse source,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("trigger") @Nullable PipelineTriggerPropertiesResponse trigger,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.options = options;
        this.provisioningState = provisioningState;
        this.source = source;
        this.systemData = systemData;
        this.trigger = trigger;
        this.type = type;
    }

    /**
     * @return The resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity of the import pipeline.
     * 
     */
    public Optional<IdentityPropertiesResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The location of the import pipeline.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The list of all options configured for the pipeline.
     * 
     */
    public List<String> options() {
        return this.options == null ? List.of() : this.options;
    }
    /**
     * @return The provisioning state of the pipeline at the time the operation was called.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The source properties of the import pipeline.
     * 
     */
    public ImportPipelineSourcePropertiesResponse source() {
        return this.source;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The properties that describe the trigger of the import pipeline.
     * 
     */
    public Optional<PipelineTriggerPropertiesResponse> trigger() {
        return Optional.ofNullable(this.trigger);
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImportPipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private @Nullable String location;
        private String name;
        private @Nullable List<String> options;
        private String provisioningState;
        private ImportPipelineSourcePropertiesResponse source;
        private SystemDataResponse systemData;
        private @Nullable PipelineTriggerPropertiesResponse trigger;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImportPipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.systemData = defaults.systemData;
    	      this.trigger = defaults.trigger;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder options(@Nullable List<String> options) {
            this.options = options;
            return this;
        }
        public Builder options(String... options) {
            return options(List.of(options));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder source(ImportPipelineSourcePropertiesResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder trigger(@Nullable PipelineTriggerPropertiesResponse trigger) {
            this.trigger = trigger;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetImportPipelineResult build() {
            return new GetImportPipelineResult(id, identity, location, name, options, provisioningState, source, systemData, trigger, type);
        }
    }
}
