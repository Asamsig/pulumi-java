// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.outputs;

import com.pulumi.awsnative.frauddetector.outputs.EntityTypeTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEntityTypeResult {
    /**
     * @return The entity type ARN.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return The timestamp when the entity type was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * @return The entity type description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The timestamp when the entity type was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    /**
     * @return Tags associated with this entity type.
     * 
     */
    private final @Nullable List<EntityTypeTag> tags;

    @CustomType.Constructor
    private GetEntityTypeResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @CustomType.Parameter("tags") @Nullable List<EntityTypeTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.lastUpdatedTime = lastUpdatedTime;
        this.tags = tags;
    }

    /**
     * @return The entity type ARN.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The timestamp when the entity type was created.
     * 
     */
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * @return The entity type description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The timestamp when the entity type was last updated.
     * 
     */
    public Optional<String> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    /**
     * @return Tags associated with this entity type.
     * 
     */
    public List<EntityTypeTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String lastUpdatedTime;
        private @Nullable List<EntityTypeTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder tags(@Nullable List<EntityTypeTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(EntityTypeTag... tags) {
            return tags(List.of(tags));
        }        public GetEntityTypeResult build() {
            return new GetEntityTypeResult(arn, createdTime, description, lastUpdatedTime, tags);
        }
    }
}
