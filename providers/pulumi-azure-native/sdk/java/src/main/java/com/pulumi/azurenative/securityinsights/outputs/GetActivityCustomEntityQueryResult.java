// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.azurenative.securityinsights.outputs.ActivityEntityQueriesPropertiesResponseQueryDefinitions;
import com.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetActivityCustomEntityQueryResult {
    /**
     * @return The entity query content to display in timeline
     * 
     */
    private final @Nullable String content;
    /**
     * @return The time the activity was created
     * 
     */
    private final String createdTimeUtc;
    /**
     * @return The entity query description
     * 
     */
    private final @Nullable String description;
    /**
     * @return Determines whether this activity is enabled or disabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The query applied only to entities matching to all filters
     * 
     */
    private final @Nullable Map<String,List<String>> entitiesFilter;
    /**
     * @return Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Azure resource Id
     * 
     */
    private final String id;
    /**
     * @return The type of the query&#39;s source entity
     * 
     */
    private final @Nullable String inputEntityType;
    /**
     * @return The kind of the entity query
     * Expected value is &#39;Activity&#39;.
     * 
     */
    private final String kind;
    /**
     * @return The last time the activity was updated
     * 
     */
    private final String lastModifiedTimeUtc;
    /**
     * @return Azure resource name
     * 
     */
    private final String name;
    /**
     * @return The Activity query definitions
     * 
     */
    private final @Nullable ActivityEntityQueriesPropertiesResponseQueryDefinitions queryDefinitions;
    /**
     * @return List of the fields of the source entity that are required to run the query
     * 
     */
    private final @Nullable List<List<String>> requiredInputFieldsSets;
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The template id this activity was created from
     * 
     */
    private final @Nullable String templateName;
    /**
     * @return The entity query title
     * 
     */
    private final @Nullable String title;
    /**
     * @return Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetActivityCustomEntityQueryResult(
        @CustomType.Parameter("content") @Nullable String content,
        @CustomType.Parameter("createdTimeUtc") String createdTimeUtc,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("entitiesFilter") @Nullable Map<String,List<String>> entitiesFilter,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("inputEntityType") @Nullable String inputEntityType,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("lastModifiedTimeUtc") String lastModifiedTimeUtc,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("queryDefinitions") @Nullable ActivityEntityQueriesPropertiesResponseQueryDefinitions queryDefinitions,
        @CustomType.Parameter("requiredInputFieldsSets") @Nullable List<List<String>> requiredInputFieldsSets,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("templateName") @Nullable String templateName,
        @CustomType.Parameter("title") @Nullable String title,
        @CustomType.Parameter("type") String type) {
        this.content = content;
        this.createdTimeUtc = createdTimeUtc;
        this.description = description;
        this.enabled = enabled;
        this.entitiesFilter = entitiesFilter;
        this.etag = etag;
        this.id = id;
        this.inputEntityType = inputEntityType;
        this.kind = kind;
        this.lastModifiedTimeUtc = lastModifiedTimeUtc;
        this.name = name;
        this.queryDefinitions = queryDefinitions;
        this.requiredInputFieldsSets = requiredInputFieldsSets;
        this.systemData = systemData;
        this.templateName = templateName;
        this.title = title;
        this.type = type;
    }

    /**
     * @return The entity query content to display in timeline
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The time the activity was created
     * 
     */
    public String createdTimeUtc() {
        return this.createdTimeUtc;
    }
    /**
     * @return The entity query description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Determines whether this activity is enabled or disabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The query applied only to entities matching to all filters
     * 
     */
    public Map<String,List<String>> entitiesFilter() {
        return this.entitiesFilter == null ? Map.of() : this.entitiesFilter;
    }
    /**
     * @return Etag of the azure resource
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Azure resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The type of the query&#39;s source entity
     * 
     */
    public Optional<String> inputEntityType() {
        return Optional.ofNullable(this.inputEntityType);
    }
    /**
     * @return The kind of the entity query
     * Expected value is &#39;Activity&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The last time the activity was updated
     * 
     */
    public String lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    /**
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Activity query definitions
     * 
     */
    public Optional<ActivityEntityQueriesPropertiesResponseQueryDefinitions> queryDefinitions() {
        return Optional.ofNullable(this.queryDefinitions);
    }
    /**
     * @return List of the fields of the source entity that are required to run the query
     * 
     */
    public List<List<String>> requiredInputFieldsSets() {
        return this.requiredInputFieldsSets == null ? List.of() : this.requiredInputFieldsSets;
    }
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The template id this activity was created from
     * 
     */
    public Optional<String> templateName() {
        return Optional.ofNullable(this.templateName);
    }
    /**
     * @return The entity query title
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * @return Azure resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivityCustomEntityQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private String createdTimeUtc;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private @Nullable Map<String,List<String>> entitiesFilter;
        private @Nullable String etag;
        private String id;
        private @Nullable String inputEntityType;
        private String kind;
        private String lastModifiedTimeUtc;
        private String name;
        private @Nullable ActivityEntityQueriesPropertiesResponseQueryDefinitions queryDefinitions;
        private @Nullable List<List<String>> requiredInputFieldsSets;
        private SystemDataResponse systemData;
        private @Nullable String templateName;
        private @Nullable String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActivityCustomEntityQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.createdTimeUtc = defaults.createdTimeUtc;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.entitiesFilter = defaults.entitiesFilter;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.inputEntityType = defaults.inputEntityType;
    	      this.kind = defaults.kind;
    	      this.lastModifiedTimeUtc = defaults.lastModifiedTimeUtc;
    	      this.name = defaults.name;
    	      this.queryDefinitions = defaults.queryDefinitions;
    	      this.requiredInputFieldsSets = defaults.requiredInputFieldsSets;
    	      this.systemData = defaults.systemData;
    	      this.templateName = defaults.templateName;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        public Builder createdTimeUtc(String createdTimeUtc) {
            this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder entitiesFilter(@Nullable Map<String,List<String>> entitiesFilter) {
            this.entitiesFilter = entitiesFilter;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder inputEntityType(@Nullable String inputEntityType) {
            this.inputEntityType = inputEntityType;
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder lastModifiedTimeUtc(String lastModifiedTimeUtc) {
            this.lastModifiedTimeUtc = Objects.requireNonNull(lastModifiedTimeUtc);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder queryDefinitions(@Nullable ActivityEntityQueriesPropertiesResponseQueryDefinitions queryDefinitions) {
            this.queryDefinitions = queryDefinitions;
            return this;
        }
        public Builder requiredInputFieldsSets(@Nullable List<List<String>> requiredInputFieldsSets) {
            this.requiredInputFieldsSets = requiredInputFieldsSets;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder templateName(@Nullable String templateName) {
            this.templateName = templateName;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetActivityCustomEntityQueryResult build() {
            return new GetActivityCustomEntityQueryResult(content, createdTimeUtc, description, enabled, entitiesFilter, etag, id, inputEntityType, kind, lastModifiedTimeUtc, name, queryDefinitions, requiredInputFieldsSets, systemData, templateName, title, type);
        }
    }
}
