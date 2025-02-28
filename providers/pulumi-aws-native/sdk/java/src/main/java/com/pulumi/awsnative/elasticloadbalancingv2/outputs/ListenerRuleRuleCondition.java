// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.outputs;

import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleHostHeaderConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleHttpHeaderConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleHttpRequestMethodConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRulePathPatternConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleQueryStringConfig;
import com.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleSourceIpConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleRuleCondition {
    private final @Nullable String field;
    private final @Nullable ListenerRuleHostHeaderConfig hostHeaderConfig;
    private final @Nullable ListenerRuleHttpHeaderConfig httpHeaderConfig;
    private final @Nullable ListenerRuleHttpRequestMethodConfig httpRequestMethodConfig;
    private final @Nullable ListenerRulePathPatternConfig pathPatternConfig;
    private final @Nullable ListenerRuleQueryStringConfig queryStringConfig;
    private final @Nullable ListenerRuleSourceIpConfig sourceIpConfig;
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private ListenerRuleRuleCondition(
        @CustomType.Parameter("field") @Nullable String field,
        @CustomType.Parameter("hostHeaderConfig") @Nullable ListenerRuleHostHeaderConfig hostHeaderConfig,
        @CustomType.Parameter("httpHeaderConfig") @Nullable ListenerRuleHttpHeaderConfig httpHeaderConfig,
        @CustomType.Parameter("httpRequestMethodConfig") @Nullable ListenerRuleHttpRequestMethodConfig httpRequestMethodConfig,
        @CustomType.Parameter("pathPatternConfig") @Nullable ListenerRulePathPatternConfig pathPatternConfig,
        @CustomType.Parameter("queryStringConfig") @Nullable ListenerRuleQueryStringConfig queryStringConfig,
        @CustomType.Parameter("sourceIpConfig") @Nullable ListenerRuleSourceIpConfig sourceIpConfig,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.field = field;
        this.hostHeaderConfig = hostHeaderConfig;
        this.httpHeaderConfig = httpHeaderConfig;
        this.httpRequestMethodConfig = httpRequestMethodConfig;
        this.pathPatternConfig = pathPatternConfig;
        this.queryStringConfig = queryStringConfig;
        this.sourceIpConfig = sourceIpConfig;
        this.values = values;
    }

    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }
    public Optional<ListenerRuleHostHeaderConfig> hostHeaderConfig() {
        return Optional.ofNullable(this.hostHeaderConfig);
    }
    public Optional<ListenerRuleHttpHeaderConfig> httpHeaderConfig() {
        return Optional.ofNullable(this.httpHeaderConfig);
    }
    public Optional<ListenerRuleHttpRequestMethodConfig> httpRequestMethodConfig() {
        return Optional.ofNullable(this.httpRequestMethodConfig);
    }
    public Optional<ListenerRulePathPatternConfig> pathPatternConfig() {
        return Optional.ofNullable(this.pathPatternConfig);
    }
    public Optional<ListenerRuleQueryStringConfig> queryStringConfig() {
        return Optional.ofNullable(this.queryStringConfig);
    }
    public Optional<ListenerRuleSourceIpConfig> sourceIpConfig() {
        return Optional.ofNullable(this.sourceIpConfig);
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String field;
        private @Nullable ListenerRuleHostHeaderConfig hostHeaderConfig;
        private @Nullable ListenerRuleHttpHeaderConfig httpHeaderConfig;
        private @Nullable ListenerRuleHttpRequestMethodConfig httpRequestMethodConfig;
        private @Nullable ListenerRulePathPatternConfig pathPatternConfig;
        private @Nullable ListenerRuleQueryStringConfig queryStringConfig;
        private @Nullable ListenerRuleSourceIpConfig sourceIpConfig;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.hostHeaderConfig = defaults.hostHeaderConfig;
    	      this.httpHeaderConfig = defaults.httpHeaderConfig;
    	      this.httpRequestMethodConfig = defaults.httpRequestMethodConfig;
    	      this.pathPatternConfig = defaults.pathPatternConfig;
    	      this.queryStringConfig = defaults.queryStringConfig;
    	      this.sourceIpConfig = defaults.sourceIpConfig;
    	      this.values = defaults.values;
        }

        public Builder field(@Nullable String field) {
            this.field = field;
            return this;
        }
        public Builder hostHeaderConfig(@Nullable ListenerRuleHostHeaderConfig hostHeaderConfig) {
            this.hostHeaderConfig = hostHeaderConfig;
            return this;
        }
        public Builder httpHeaderConfig(@Nullable ListenerRuleHttpHeaderConfig httpHeaderConfig) {
            this.httpHeaderConfig = httpHeaderConfig;
            return this;
        }
        public Builder httpRequestMethodConfig(@Nullable ListenerRuleHttpRequestMethodConfig httpRequestMethodConfig) {
            this.httpRequestMethodConfig = httpRequestMethodConfig;
            return this;
        }
        public Builder pathPatternConfig(@Nullable ListenerRulePathPatternConfig pathPatternConfig) {
            this.pathPatternConfig = pathPatternConfig;
            return this;
        }
        public Builder queryStringConfig(@Nullable ListenerRuleQueryStringConfig queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }
        public Builder sourceIpConfig(@Nullable ListenerRuleSourceIpConfig sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ListenerRuleRuleCondition build() {
            return new ListenerRuleRuleCondition(field, hostHeaderConfig, httpHeaderConfig, httpRequestMethodConfig, pathPatternConfig, queryStringConfig, sourceIpConfig, values);
        }
    }
}
