// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.azurenative.streamanalytics.outputs.PrivateLinkServiceConnectionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointPropertiesResponse {
    /**
     * @return The date when this private endpoint was created.
     * 
     */
    private final String createdDate;
    /**
     * @return A list of connections to the remote resource. Immutable after it is set.
     * 
     */
    private final @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;

    @CustomType.Constructor
    private PrivateEndpointPropertiesResponse(
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("manualPrivateLinkServiceConnections") @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
        this.createdDate = createdDate;
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
    }

    /**
     * @return The date when this private endpoint was created.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return A list of connections to the remote resource. Immutable after it is set.
     * 
     */
    public List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections == null ? List.of() : this.manualPrivateLinkServiceConnections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.manualPrivateLinkServiceConnections = defaults.manualPrivateLinkServiceConnections;
        }

        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder manualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }
        public Builder manualPrivateLinkServiceConnections(PrivateLinkServiceConnectionResponse... manualPrivateLinkServiceConnections) {
            return manualPrivateLinkServiceConnections(List.of(manualPrivateLinkServiceConnections));
        }        public PrivateEndpointPropertiesResponse build() {
            return new PrivateEndpointPropertiesResponse(createdDate, manualPrivateLinkServiceConnections);
        }
    }
}
