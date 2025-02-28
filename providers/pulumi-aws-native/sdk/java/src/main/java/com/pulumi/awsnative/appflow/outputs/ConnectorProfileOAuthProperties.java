// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileOAuthProperties {
    private final @Nullable String authCodeUrl;
    private final @Nullable List<String> oAuthScopes;
    private final @Nullable String tokenUrl;

    @CustomType.Constructor
    private ConnectorProfileOAuthProperties(
        @CustomType.Parameter("authCodeUrl") @Nullable String authCodeUrl,
        @CustomType.Parameter("oAuthScopes") @Nullable List<String> oAuthScopes,
        @CustomType.Parameter("tokenUrl") @Nullable String tokenUrl) {
        this.authCodeUrl = authCodeUrl;
        this.oAuthScopes = oAuthScopes;
        this.tokenUrl = tokenUrl;
    }

    public Optional<String> authCodeUrl() {
        return Optional.ofNullable(this.authCodeUrl);
    }
    public List<String> oAuthScopes() {
        return this.oAuthScopes == null ? List.of() : this.oAuthScopes;
    }
    public Optional<String> tokenUrl() {
        return Optional.ofNullable(this.tokenUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileOAuthProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authCodeUrl;
        private @Nullable List<String> oAuthScopes;
        private @Nullable String tokenUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileOAuthProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authCodeUrl = defaults.authCodeUrl;
    	      this.oAuthScopes = defaults.oAuthScopes;
    	      this.tokenUrl = defaults.tokenUrl;
        }

        public Builder authCodeUrl(@Nullable String authCodeUrl) {
            this.authCodeUrl = authCodeUrl;
            return this;
        }
        public Builder oAuthScopes(@Nullable List<String> oAuthScopes) {
            this.oAuthScopes = oAuthScopes;
            return this;
        }
        public Builder oAuthScopes(String... oAuthScopes) {
            return oAuthScopes(List.of(oAuthScopes));
        }
        public Builder tokenUrl(@Nullable String tokenUrl) {
            this.tokenUrl = tokenUrl;
            return this;
        }        public ConnectorProfileOAuthProperties build() {
            return new ConnectorProfileOAuthProperties(authCodeUrl, oAuthScopes, tokenUrl);
        }
    }
}
