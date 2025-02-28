// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.WorkloadCrrAccessTokenResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRecoveryPointAccessTokenResult {
    /**
     * @return Optional ETag.
     * 
     */
    private final @Nullable String eTag;
    /**
     * @return Resource Id represents the complete path to the resource.
     * 
     */
    private final String id;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Resource name associated with the resource.
     * 
     */
    private final String name;
    /**
     * @return CrrAccessTokenResource properties
     * 
     */
    private final WorkloadCrrAccessTokenResponse properties;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRecoveryPointAccessTokenResult(
        @CustomType.Parameter("eTag") @Nullable String eTag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") WorkloadCrrAccessTokenResponse properties,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.eTag = eTag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Optional ETag.
     * 
     */
    public Optional<String> eTag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * @return Resource Id represents the complete path to the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Resource name associated with the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return CrrAccessTokenResource properties
     * 
     */
    public WorkloadCrrAccessTokenResponse properties() {
        return this.properties;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecoveryPointAccessTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private @Nullable String location;
        private String name;
        private WorkloadCrrAccessTokenResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecoveryPointAccessTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = eTag;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(WorkloadCrrAccessTokenResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRecoveryPointAccessTokenResult build() {
            return new GetRecoveryPointAccessTokenResult(eTag, id, location, name, properties, tags, type);
        }
    }
}
