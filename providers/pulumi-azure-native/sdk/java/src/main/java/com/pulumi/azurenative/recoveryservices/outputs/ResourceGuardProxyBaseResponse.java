// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.ResourceGuardOperationDetailResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceGuardProxyBaseResponse {
    private final @Nullable String lastUpdatedTime;
    private final @Nullable List<ResourceGuardOperationDetailResponse> resourceGuardOperationDetails;
    private final @Nullable String resourceGuardResourceId;

    @CustomType.Constructor
    private ResourceGuardProxyBaseResponse(
        @CustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @CustomType.Parameter("resourceGuardOperationDetails") @Nullable List<ResourceGuardOperationDetailResponse> resourceGuardOperationDetails,
        @CustomType.Parameter("resourceGuardResourceId") @Nullable String resourceGuardResourceId) {
        this.lastUpdatedTime = lastUpdatedTime;
        this.resourceGuardOperationDetails = resourceGuardOperationDetails;
        this.resourceGuardResourceId = resourceGuardResourceId;
    }

    public Optional<String> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public List<ResourceGuardOperationDetailResponse> resourceGuardOperationDetails() {
        return this.resourceGuardOperationDetails == null ? List.of() : this.resourceGuardOperationDetails;
    }
    public Optional<String> resourceGuardResourceId() {
        return Optional.ofNullable(this.resourceGuardResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardProxyBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastUpdatedTime;
        private @Nullable List<ResourceGuardOperationDetailResponse> resourceGuardOperationDetails;
        private @Nullable String resourceGuardResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardProxyBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.resourceGuardOperationDetails = defaults.resourceGuardOperationDetails;
    	      this.resourceGuardResourceId = defaults.resourceGuardResourceId;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder resourceGuardOperationDetails(@Nullable List<ResourceGuardOperationDetailResponse> resourceGuardOperationDetails) {
            this.resourceGuardOperationDetails = resourceGuardOperationDetails;
            return this;
        }
        public Builder resourceGuardOperationDetails(ResourceGuardOperationDetailResponse... resourceGuardOperationDetails) {
            return resourceGuardOperationDetails(List.of(resourceGuardOperationDetails));
        }
        public Builder resourceGuardResourceId(@Nullable String resourceGuardResourceId) {
            this.resourceGuardResourceId = resourceGuardResourceId;
            return this;
        }        public ResourceGuardProxyBaseResponse build() {
            return new ResourceGuardProxyBaseResponse(lastUpdatedTime, resourceGuardOperationDetails, resourceGuardResourceId);
        }
    }
}
