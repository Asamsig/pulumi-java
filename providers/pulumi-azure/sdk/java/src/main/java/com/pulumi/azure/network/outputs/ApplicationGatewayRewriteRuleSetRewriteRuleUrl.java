// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayRewriteRuleSetRewriteRuleUrl {
    /**
     * @return The URL path to rewrite.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The query string to rewrite.
     * 
     */
    private final @Nullable String queryString;
    /**
     * @return Whether the URL path map should be reevaluated after this rewrite has been applied. [More info on rewrite configutation](https://docs.microsoft.com/en-us/azure/application-gateway/rewrite-http-headers-url#rewrite-configuration)
     * 
     */
    private final @Nullable Boolean reroute;

    @CustomType.Constructor
    private ApplicationGatewayRewriteRuleSetRewriteRuleUrl(
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("queryString") @Nullable String queryString,
        @CustomType.Parameter("reroute") @Nullable Boolean reroute) {
        this.path = path;
        this.queryString = queryString;
        this.reroute = reroute;
    }

    /**
     * @return The URL path to rewrite.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The query string to rewrite.
     * 
     */
    public Optional<String> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Whether the URL path map should be reevaluated after this rewrite has been applied. [More info on rewrite configutation](https://docs.microsoft.com/en-us/azure/application-gateway/rewrite-http-headers-url#rewrite-configuration)
     * 
     */
    public Optional<Boolean> reroute() {
        return Optional.ofNullable(this.reroute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleSetRewriteRuleUrl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String path;
        private @Nullable String queryString;
        private @Nullable Boolean reroute;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleSetRewriteRuleUrl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.queryString = defaults.queryString;
    	      this.reroute = defaults.reroute;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder queryString(@Nullable String queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder reroute(@Nullable Boolean reroute) {
            this.reroute = reroute;
            return this;
        }        public ApplicationGatewayRewriteRuleSetRewriteRuleUrl build() {
            return new ApplicationGatewayRewriteRuleSetRewriteRuleUrl(path, queryString, reroute);
        }
    }
}
