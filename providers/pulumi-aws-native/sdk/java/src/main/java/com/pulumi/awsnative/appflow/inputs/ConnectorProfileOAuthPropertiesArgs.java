// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorProfileOAuthPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileOAuthPropertiesArgs Empty = new ConnectorProfileOAuthPropertiesArgs();

    @Import(name="authCodeUrl")
    private @Nullable Output<String> authCodeUrl;

    public Optional<Output<String>> authCodeUrl() {
        return Optional.ofNullable(this.authCodeUrl);
    }

    @Import(name="oAuthScopes")
    private @Nullable Output<List<String>> oAuthScopes;

    public Optional<Output<List<String>>> oAuthScopes() {
        return Optional.ofNullable(this.oAuthScopes);
    }

    @Import(name="tokenUrl")
    private @Nullable Output<String> tokenUrl;

    public Optional<Output<String>> tokenUrl() {
        return Optional.ofNullable(this.tokenUrl);
    }

    private ConnectorProfileOAuthPropertiesArgs() {}

    private ConnectorProfileOAuthPropertiesArgs(ConnectorProfileOAuthPropertiesArgs $) {
        this.authCodeUrl = $.authCodeUrl;
        this.oAuthScopes = $.oAuthScopes;
        this.tokenUrl = $.tokenUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileOAuthPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileOAuthPropertiesArgs $;

        public Builder() {
            $ = new ConnectorProfileOAuthPropertiesArgs();
        }

        public Builder(ConnectorProfileOAuthPropertiesArgs defaults) {
            $ = new ConnectorProfileOAuthPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder authCodeUrl(@Nullable Output<String> authCodeUrl) {
            $.authCodeUrl = authCodeUrl;
            return this;
        }

        public Builder authCodeUrl(String authCodeUrl) {
            return authCodeUrl(Output.of(authCodeUrl));
        }

        public Builder oAuthScopes(@Nullable Output<List<String>> oAuthScopes) {
            $.oAuthScopes = oAuthScopes;
            return this;
        }

        public Builder oAuthScopes(List<String> oAuthScopes) {
            return oAuthScopes(Output.of(oAuthScopes));
        }

        public Builder oAuthScopes(String... oAuthScopes) {
            return oAuthScopes(List.of(oAuthScopes));
        }

        public Builder tokenUrl(@Nullable Output<String> tokenUrl) {
            $.tokenUrl = tokenUrl;
            return this;
        }

        public Builder tokenUrl(String tokenUrl) {
            return tokenUrl(Output.of(tokenUrl));
        }

        public ConnectorProfileOAuthPropertiesArgs build() {
            return $;
        }
    }

}
