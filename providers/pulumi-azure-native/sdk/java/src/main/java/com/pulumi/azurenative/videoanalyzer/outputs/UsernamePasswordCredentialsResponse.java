// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UsernamePasswordCredentialsResponse {
    /**
     * @return Password to be presented as part of the credentials. It is recommended that this value is parameterized as a secret string in order to prevent this value to be returned as part of the resource on API requests.
     * 
     */
    private final String password;
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.UsernamePasswordCredentials&#39;.
     * 
     */
    private final String type;
    /**
     * @return Username to be presented as part of the credentials.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private UsernamePasswordCredentialsResponse(
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("username") String username) {
        this.password = password;
        this.type = type;
        this.username = username;
    }

    /**
     * @return Password to be presented as part of the credentials. It is recommended that this value is parameterized as a secret string in order to prevent this value to be returned as part of the resource on API requests.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.UsernamePasswordCredentials&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Username to be presented as part of the credentials.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsernamePasswordCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String type;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(UsernamePasswordCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public UsernamePasswordCredentialsResponse build() {
            return new UsernamePasswordCredentialsResponse(password, type, username);
        }
    }
}
