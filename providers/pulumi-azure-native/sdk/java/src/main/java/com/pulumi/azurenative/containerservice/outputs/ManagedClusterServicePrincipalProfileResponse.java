// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedClusterServicePrincipalProfileResponse {
    /**
     * @return The ID for the service principal.
     * 
     */
    private final String clientId;
    /**
     * @return The secret password associated with the service principal in plain text.
     * 
     */
    private final @Nullable String secret;

    @CustomType.Constructor
    private ManagedClusterServicePrincipalProfileResponse(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("secret") @Nullable String secret) {
        this.clientId = clientId;
        this.secret = secret;
    }

    /**
     * @return The ID for the service principal.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The secret password associated with the service principal in plain text.
     * 
     */
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterServicePrincipalProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private @Nullable String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterServicePrincipalProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder secret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }        public ManagedClusterServicePrincipalProfileResponse build() {
            return new ManagedClusterServicePrincipalProfileResponse(clientId, secret);
        }
    }
}
