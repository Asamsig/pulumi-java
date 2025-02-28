// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.outputs;

import com.pulumi.azurenative.automation.outputs.ContentLinkResponse;
import com.pulumi.azurenative.automation.outputs.ModuleErrorInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetModuleResult {
    /**
     * @return Gets or sets the activity count of the module.
     * 
     */
    private final @Nullable Integer activityCount;
    /**
     * @return Gets or sets the contentLink of the module.
     * 
     */
    private final @Nullable ContentLinkResponse contentLink;
    /**
     * @return Gets or sets the creation time.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * @return Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Gets or sets the error info of the module.
     * 
     */
    private final @Nullable ModuleErrorInfoResponse error;
    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * @return Gets or sets type of module, if its composite or not.
     * 
     */
    private final @Nullable Boolean isComposite;
    /**
     * @return Gets or sets the isGlobal flag of the module.
     * 
     */
    private final @Nullable Boolean isGlobal;
    /**
     * @return Gets or sets the last modified time.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * @return The Azure Region where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Gets or sets the provisioning state of the module.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * @return Gets or sets the size in bytes of the module.
     * 
     */
    private final @Nullable Double sizeInBytes;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;
    /**
     * @return Gets or sets the version of the module.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private GetModuleResult(
        @CustomType.Parameter("activityCount") @Nullable Integer activityCount,
        @CustomType.Parameter("contentLink") @Nullable ContentLinkResponse contentLink,
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("error") @Nullable ModuleErrorInfoResponse error,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isComposite") @Nullable Boolean isComposite,
        @CustomType.Parameter("isGlobal") @Nullable Boolean isGlobal,
        @CustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("sizeInBytes") @Nullable Double sizeInBytes,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") @Nullable String version) {
        this.activityCount = activityCount;
        this.contentLink = contentLink;
        this.creationTime = creationTime;
        this.description = description;
        this.error = error;
        this.etag = etag;
        this.id = id;
        this.isComposite = isComposite;
        this.isGlobal = isGlobal;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sizeInBytes = sizeInBytes;
        this.tags = tags;
        this.type = type;
        this.version = version;
    }

    /**
     * @return Gets or sets the activity count of the module.
     * 
     */
    public Optional<Integer> activityCount() {
        return Optional.ofNullable(this.activityCount);
    }
    /**
     * @return Gets or sets the contentLink of the module.
     * 
     */
    public Optional<ContentLinkResponse> contentLink() {
        return Optional.ofNullable(this.contentLink);
    }
    /**
     * @return Gets or sets the creation time.
     * 
     */
    public Optional<String> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * @return Gets or sets the description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Gets or sets the error info of the module.
     * 
     */
    public Optional<ModuleErrorInfoResponse> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Fully qualified resource Id for the resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Gets or sets type of module, if its composite or not.
     * 
     */
    public Optional<Boolean> isComposite() {
        return Optional.ofNullable(this.isComposite);
    }
    /**
     * @return Gets or sets the isGlobal flag of the module.
     * 
     */
    public Optional<Boolean> isGlobal() {
        return Optional.ofNullable(this.isGlobal);
    }
    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public Optional<String> lastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Gets or sets the provisioning state of the module.
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * @return Gets or sets the size in bytes of the module.
     * 
     */
    public Optional<Double> sizeInBytes() {
        return Optional.ofNullable(this.sizeInBytes);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Gets or sets the version of the module.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer activityCount;
        private @Nullable ContentLinkResponse contentLink;
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable ModuleErrorInfoResponse error;
        private @Nullable String etag;
        private String id;
        private @Nullable Boolean isComposite;
        private @Nullable Boolean isGlobal;
        private @Nullable String lastModifiedTime;
        private @Nullable String location;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable Double sizeInBytes;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activityCount = defaults.activityCount;
    	      this.contentLink = defaults.contentLink;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.error = defaults.error;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.isComposite = defaults.isComposite;
    	      this.isGlobal = defaults.isGlobal;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder activityCount(@Nullable Integer activityCount) {
            this.activityCount = activityCount;
            return this;
        }
        public Builder contentLink(@Nullable ContentLinkResponse contentLink) {
            this.contentLink = contentLink;
            return this;
        }
        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder error(@Nullable ModuleErrorInfoResponse error) {
            this.error = error;
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
        public Builder isComposite(@Nullable Boolean isComposite) {
            this.isComposite = isComposite;
            return this;
        }
        public Builder isGlobal(@Nullable Boolean isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }
        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
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
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder sizeInBytes(@Nullable Double sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetModuleResult build() {
            return new GetModuleResult(activityCount, contentLink, creationTime, description, error, etag, id, isComposite, isGlobal, lastModifiedTime, location, name, provisioningState, sizeInBytes, tags, type, version);
        }
    }
}
