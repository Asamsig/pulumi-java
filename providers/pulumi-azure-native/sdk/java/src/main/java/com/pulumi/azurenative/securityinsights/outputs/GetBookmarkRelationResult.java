// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBookmarkRelationResult {
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
     * @return Azure resource name
     * 
     */
    private final String name;
    /**
     * @return The resource ID of the related resource
     * 
     */
    private final String relatedResourceId;
    /**
     * @return The resource kind of the related resource
     * 
     */
    private final String relatedResourceKind;
    /**
     * @return The name of the related resource
     * 
     */
    private final String relatedResourceName;
    /**
     * @return The resource type of the related resource
     * 
     */
    private final String relatedResourceType;
    /**
     * @return Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetBookmarkRelationResult(
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("relatedResourceId") String relatedResourceId,
        @CustomType.Parameter("relatedResourceKind") String relatedResourceKind,
        @CustomType.Parameter("relatedResourceName") String relatedResourceName,
        @CustomType.Parameter("relatedResourceType") String relatedResourceType,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.relatedResourceId = relatedResourceId;
        this.relatedResourceKind = relatedResourceKind;
        this.relatedResourceName = relatedResourceName;
        this.relatedResourceType = relatedResourceType;
        this.type = type;
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
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource ID of the related resource
     * 
     */
    public String relatedResourceId() {
        return this.relatedResourceId;
    }
    /**
     * @return The resource kind of the related resource
     * 
     */
    public String relatedResourceKind() {
        return this.relatedResourceKind;
    }
    /**
     * @return The name of the related resource
     * 
     */
    public String relatedResourceName() {
        return this.relatedResourceName;
    }
    /**
     * @return The resource type of the related resource
     * 
     */
    public String relatedResourceType() {
        return this.relatedResourceType;
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

    public static Builder builder(GetBookmarkRelationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String name;
        private String relatedResourceId;
        private String relatedResourceKind;
        private String relatedResourceName;
        private String relatedResourceType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBookmarkRelationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.relatedResourceId = defaults.relatedResourceId;
    	      this.relatedResourceKind = defaults.relatedResourceKind;
    	      this.relatedResourceName = defaults.relatedResourceName;
    	      this.relatedResourceType = defaults.relatedResourceType;
    	      this.type = defaults.type;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
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
        public Builder relatedResourceId(String relatedResourceId) {
            this.relatedResourceId = Objects.requireNonNull(relatedResourceId);
            return this;
        }
        public Builder relatedResourceKind(String relatedResourceKind) {
            this.relatedResourceKind = Objects.requireNonNull(relatedResourceKind);
            return this;
        }
        public Builder relatedResourceName(String relatedResourceName) {
            this.relatedResourceName = Objects.requireNonNull(relatedResourceName);
            return this;
        }
        public Builder relatedResourceType(String relatedResourceType) {
            this.relatedResourceType = Objects.requireNonNull(relatedResourceType);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetBookmarkRelationResult build() {
            return new GetBookmarkRelationResult(etag, id, name, relatedResourceId, relatedResourceKind, relatedResourceName, relatedResourceType, type);
        }
    }
}
