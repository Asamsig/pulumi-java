// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetes.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectedClusterIdentityResponse {
    /**
     * @return The principal id of connected cluster identity. This property will only be provided for a system assigned identity.
     * 
     */
    private final String principalId;
    /**
     * @return The tenant id associated with the connected cluster. This property will only be provided for a system assigned identity.
     * 
     */
    private final String tenantId;
    /**
     * @return The type of identity used for the connected cluster. The type &#39;SystemAssigned, includes a system created identity. The type &#39;None&#39; means no identity is assigned to the connected cluster.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ConnectedClusterIdentityResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return The principal id of connected cluster identity. This property will only be provided for a system assigned identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The tenant id associated with the connected cluster. This property will only be provided for a system assigned identity.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The type of identity used for the connected cluster. The type &#39;SystemAssigned, includes a system created identity. The type &#39;None&#39; means no identity is assigned to the connected cluster.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectedClusterIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectedClusterIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ConnectedClusterIdentityResponse build() {
            return new ConnectedClusterIdentityResponse(principalId, tenantId, type);
        }
    }
}
