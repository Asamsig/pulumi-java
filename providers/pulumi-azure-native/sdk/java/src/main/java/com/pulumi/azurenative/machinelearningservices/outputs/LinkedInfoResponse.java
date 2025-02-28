// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinkedInfoResponse {
    /**
     * @return LinkedId id.
     * 
     */
    private final @Nullable String linkedId;
    /**
     * @return Linked resource name.
     * 
     */
    private final @Nullable String linkedResourceName;
    /**
     * @return Datastore origin
     * 
     */
    private final @Nullable String origin;

    @CustomType.Constructor
    private LinkedInfoResponse(
        @CustomType.Parameter("linkedId") @Nullable String linkedId,
        @CustomType.Parameter("linkedResourceName") @Nullable String linkedResourceName,
        @CustomType.Parameter("origin") @Nullable String origin) {
        this.linkedId = linkedId;
        this.linkedResourceName = linkedResourceName;
        this.origin = origin;
    }

    /**
     * @return LinkedId id.
     * 
     */
    public Optional<String> linkedId() {
        return Optional.ofNullable(this.linkedId);
    }
    /**
     * @return Linked resource name.
     * 
     */
    public Optional<String> linkedResourceName() {
        return Optional.ofNullable(this.linkedResourceName);
    }
    /**
     * @return Datastore origin
     * 
     */
    public Optional<String> origin() {
        return Optional.ofNullable(this.origin);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linkedId;
        private @Nullable String linkedResourceName;
        private @Nullable String origin;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedId = defaults.linkedId;
    	      this.linkedResourceName = defaults.linkedResourceName;
    	      this.origin = defaults.origin;
        }

        public Builder linkedId(@Nullable String linkedId) {
            this.linkedId = linkedId;
            return this;
        }
        public Builder linkedResourceName(@Nullable String linkedResourceName) {
            this.linkedResourceName = linkedResourceName;
            return this;
        }
        public Builder origin(@Nullable String origin) {
            this.origin = origin;
            return this;
        }        public LinkedInfoResponse build() {
            return new LinkedInfoResponse(linkedId, linkedResourceName, origin);
        }
    }
}
