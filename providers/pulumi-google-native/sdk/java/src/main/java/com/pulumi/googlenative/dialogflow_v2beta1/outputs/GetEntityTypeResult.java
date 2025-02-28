// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1EntityTypeEntityResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEntityTypeResult {
    /**
     * @return Optional. Indicates whether the entity type can be automatically expanded.
     * 
     */
    private final String autoExpansionMode;
    /**
     * @return The name of the entity type.
     * 
     */
    private final String displayName;
    /**
     * @return Optional. Enables fuzzy entity extraction during classification.
     * 
     */
    private final Boolean enableFuzzyExtraction;
    /**
     * @return Optional. The collection of entity entries associated with the entity type.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities;
    /**
     * @return Indicates the kind of entity type.
     * 
     */
    private final String kind;
    /**
     * @return The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetEntityTypeResult(
        @CustomType.Parameter("autoExpansionMode") String autoExpansionMode,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("enableFuzzyExtraction") Boolean enableFuzzyExtraction,
        @CustomType.Parameter("entities") List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name) {
        this.autoExpansionMode = autoExpansionMode;
        this.displayName = displayName;
        this.enableFuzzyExtraction = enableFuzzyExtraction;
        this.entities = entities;
        this.kind = kind;
        this.name = name;
    }

    /**
     * @return Optional. Indicates whether the entity type can be automatically expanded.
     * 
     */
    public String autoExpansionMode() {
        return this.autoExpansionMode;
    }
    /**
     * @return The name of the entity type.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Optional. Enables fuzzy entity extraction during classification.
     * 
     */
    public Boolean enableFuzzyExtraction() {
        return this.enableFuzzyExtraction;
    }
    /**
     * @return Optional. The collection of entity entries associated with the entity type.
     * 
     */
    public List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities() {
        return this.entities;
    }
    /**
     * @return Indicates the kind of entity type.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoExpansionMode;
        private String displayName;
        private Boolean enableFuzzyExtraction;
        private List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities;
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoExpansionMode = defaults.autoExpansionMode;
    	      this.displayName = defaults.displayName;
    	      this.enableFuzzyExtraction = defaults.enableFuzzyExtraction;
    	      this.entities = defaults.entities;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder autoExpansionMode(String autoExpansionMode) {
            this.autoExpansionMode = Objects.requireNonNull(autoExpansionMode);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder enableFuzzyExtraction(Boolean enableFuzzyExtraction) {
            this.enableFuzzyExtraction = Objects.requireNonNull(enableFuzzyExtraction);
            return this;
        }
        public Builder entities(List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }
        public Builder entities(GoogleCloudDialogflowV2beta1EntityTypeEntityResponse... entities) {
            return entities(List.of(entities));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetEntityTypeResult build() {
            return new GetEntityTypeResult(autoExpansionMode, displayName, enableFuzzyExtraction, entities, kind, name);
        }
    }
}
