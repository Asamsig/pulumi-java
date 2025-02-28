// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertHttpChallengeResponse {
    /**
     * @return The URL path on which to serve the specified token to satisfy the certificate challenge.
     * 
     */
    private final String path;
    /**
     * @return The token to serve at the specified URL path to satisfy the certificate challenge.
     * 
     */
    private final String token;

    @CustomType.Constructor
    private CertHttpChallengeResponse(
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("token") String token) {
        this.path = path;
        this.token = token;
    }

    /**
     * @return The URL path on which to serve the specified token to satisfy the certificate challenge.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The token to serve at the specified URL path to satisfy the certificate challenge.
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertHttpChallengeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(CertHttpChallengeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.token = defaults.token;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }        public CertHttpChallengeResponse build() {
            return new CertHttpChallengeResponse(path, token);
        }
    }
}
