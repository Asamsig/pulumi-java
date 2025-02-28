// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rum.outputs;

import com.pulumi.awsnative.rum.outputs.AppMonitorConfiguration;
import com.pulumi.awsnative.rum.outputs.AppMonitorTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppMonitorResult {
    private final @Nullable AppMonitorConfiguration appMonitorConfiguration;
    /**
     * @return Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
     * 
     */
    private final @Nullable Boolean cwLogEnabled;
    /**
     * @return The top-level internet domain name for which your application has administrative authority.
     * 
     */
    private final @Nullable String domain;
    private final @Nullable List<AppMonitorTag> tags;

    @CustomType.Constructor
    private GetAppMonitorResult(
        @CustomType.Parameter("appMonitorConfiguration") @Nullable AppMonitorConfiguration appMonitorConfiguration,
        @CustomType.Parameter("cwLogEnabled") @Nullable Boolean cwLogEnabled,
        @CustomType.Parameter("domain") @Nullable String domain,
        @CustomType.Parameter("tags") @Nullable List<AppMonitorTag> tags) {
        this.appMonitorConfiguration = appMonitorConfiguration;
        this.cwLogEnabled = cwLogEnabled;
        this.domain = domain;
        this.tags = tags;
    }

    public Optional<AppMonitorConfiguration> appMonitorConfiguration() {
        return Optional.ofNullable(this.appMonitorConfiguration);
    }
    /**
     * @return Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
     * 
     */
    public Optional<Boolean> cwLogEnabled() {
        return Optional.ofNullable(this.cwLogEnabled);
    }
    /**
     * @return The top-level internet domain name for which your application has administrative authority.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    public List<AppMonitorTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppMonitorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppMonitorConfiguration appMonitorConfiguration;
        private @Nullable Boolean cwLogEnabled;
        private @Nullable String domain;
        private @Nullable List<AppMonitorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppMonitorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appMonitorConfiguration = defaults.appMonitorConfiguration;
    	      this.cwLogEnabled = defaults.cwLogEnabled;
    	      this.domain = defaults.domain;
    	      this.tags = defaults.tags;
        }

        public Builder appMonitorConfiguration(@Nullable AppMonitorConfiguration appMonitorConfiguration) {
            this.appMonitorConfiguration = appMonitorConfiguration;
            return this;
        }
        public Builder cwLogEnabled(@Nullable Boolean cwLogEnabled) {
            this.cwLogEnabled = cwLogEnabled;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        public Builder tags(@Nullable List<AppMonitorTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(AppMonitorTag... tags) {
            return tags(List.of(tags));
        }        public GetAppMonitorResult build() {
            return new GetAppMonitorResult(appMonitorConfiguration, cwLogEnabled, domain, tags);
        }
    }
}
