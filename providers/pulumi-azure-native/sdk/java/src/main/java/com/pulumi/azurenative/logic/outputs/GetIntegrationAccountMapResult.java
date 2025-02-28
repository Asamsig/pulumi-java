// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.ContentLinkResponse;
import com.pulumi.azurenative.logic.outputs.IntegrationAccountMapPropertiesResponseParametersSchema;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIntegrationAccountMapResult {
    /**
     * @return The changed time.
     * 
     */
    private final String changedTime;
    /**
     * @return The content.
     * 
     */
    private final @Nullable String content;
    /**
     * @return The content link.
     * 
     */
    private final ContentLinkResponse contentLink;
    /**
     * @return The content type.
     * 
     */
    private final @Nullable String contentType;
    /**
     * @return The created time.
     * 
     */
    private final String createdTime;
    /**
     * @return The resource id.
     * 
     */
    private final String id;
    /**
     * @return The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The map type.
     * 
     */
    private final String mapType;
    /**
     * @return The metadata.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * @return Gets the resource name.
     * 
     */
    private final String name;
    /**
     * @return The parameters schema of integration account map.
     * 
     */
    private final @Nullable IntegrationAccountMapPropertiesResponseParametersSchema parametersSchema;
    /**
     * @return The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Gets the resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIntegrationAccountMapResult(
        @CustomType.Parameter("changedTime") String changedTime,
        @CustomType.Parameter("content") @Nullable String content,
        @CustomType.Parameter("contentLink") ContentLinkResponse contentLink,
        @CustomType.Parameter("contentType") @Nullable String contentType,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("mapType") String mapType,
        @CustomType.Parameter("metadata") @Nullable Object metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parametersSchema") @Nullable IntegrationAccountMapPropertiesResponseParametersSchema parametersSchema,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.changedTime = changedTime;
        this.content = content;
        this.contentLink = contentLink;
        this.contentType = contentType;
        this.createdTime = createdTime;
        this.id = id;
        this.location = location;
        this.mapType = mapType;
        this.metadata = metadata;
        this.name = name;
        this.parametersSchema = parametersSchema;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The changed time.
     * 
     */
    public String changedTime() {
        return this.changedTime;
    }
    /**
     * @return The content.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The content link.
     * 
     */
    public ContentLinkResponse contentLink() {
        return this.contentLink;
    }
    /**
     * @return The content type.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * @return The created time.
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return The resource id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The map type.
     * 
     */
    public String mapType() {
        return this.mapType;
    }
    /**
     * @return The metadata.
     * 
     */
    public Optional<Object> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return Gets the resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The parameters schema of integration account map.
     * 
     */
    public Optional<IntegrationAccountMapPropertiesResponseParametersSchema> parametersSchema() {
        return Optional.ofNullable(this.parametersSchema);
    }
    /**
     * @return The resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Gets the resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountMapResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String changedTime;
        private @Nullable String content;
        private ContentLinkResponse contentLink;
        private @Nullable String contentType;
        private String createdTime;
        private String id;
        private @Nullable String location;
        private String mapType;
        private @Nullable Object metadata;
        private String name;
        private @Nullable IntegrationAccountMapPropertiesResponseParametersSchema parametersSchema;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountMapResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changedTime = defaults.changedTime;
    	      this.content = defaults.content;
    	      this.contentLink = defaults.contentLink;
    	      this.contentType = defaults.contentType;
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.mapType = defaults.mapType;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.parametersSchema = defaults.parametersSchema;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder changedTime(String changedTime) {
            this.changedTime = Objects.requireNonNull(changedTime);
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        public Builder contentLink(ContentLinkResponse contentLink) {
            this.contentLink = Objects.requireNonNull(contentLink);
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder mapType(String mapType) {
            this.mapType = Objects.requireNonNull(mapType);
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parametersSchema(@Nullable IntegrationAccountMapPropertiesResponseParametersSchema parametersSchema) {
            this.parametersSchema = parametersSchema;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIntegrationAccountMapResult build() {
            return new GetIntegrationAccountMapResult(changedTime, content, contentLink, contentType, createdTime, id, location, mapType, metadata, name, parametersSchema, tags, type);
        }
    }
}
