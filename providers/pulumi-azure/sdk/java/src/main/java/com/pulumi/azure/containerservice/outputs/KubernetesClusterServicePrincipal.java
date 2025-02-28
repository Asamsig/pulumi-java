// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KubernetesClusterServicePrincipal {
    /**
     * @return The Client ID for the Service Principal.
     * 
     */
    private final String clientId;
    /**
     * @return The Client Secret for the Service Principal.
     * 
     */
    private final String clientSecret;

    @CustomType.Constructor
    private KubernetesClusterServicePrincipal(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * @return The Client ID for the Service Principal.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The Client Secret for the Service Principal.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterServicePrincipal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterServicePrincipal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }        public KubernetesClusterServicePrincipal build() {
            return new KubernetesClusterServicePrincipal(clientId, clientSecret);
        }
    }
}
