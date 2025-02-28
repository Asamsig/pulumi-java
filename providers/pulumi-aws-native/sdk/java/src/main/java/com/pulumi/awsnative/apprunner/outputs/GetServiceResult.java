// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.outputs;

import com.pulumi.awsnative.apprunner.outputs.ServiceHealthCheckConfiguration;
import com.pulumi.awsnative.apprunner.outputs.ServiceInstanceConfiguration;
import com.pulumi.awsnative.apprunner.outputs.ServiceNetworkConfiguration;
import com.pulumi.awsnative.apprunner.outputs.ServiceObservabilityConfiguration;
import com.pulumi.awsnative.apprunner.outputs.ServiceSourceConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceResult {
    private final @Nullable ServiceHealthCheckConfiguration healthCheckConfiguration;
    private final @Nullable ServiceInstanceConfiguration instanceConfiguration;
    private final @Nullable ServiceNetworkConfiguration networkConfiguration;
    private final @Nullable ServiceObservabilityConfiguration observabilityConfiguration;
    /**
     * @return The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    private final @Nullable String serviceArn;
    /**
     * @return The AppRunner Service Id
     * 
     */
    private final @Nullable String serviceId;
    /**
     * @return The Service Url of the AppRunner Service.
     * 
     */
    private final @Nullable String serviceUrl;
    private final @Nullable ServiceSourceConfiguration sourceConfiguration;
    /**
     * @return AppRunner Service status.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetServiceResult(
        @CustomType.Parameter("healthCheckConfiguration") @Nullable ServiceHealthCheckConfiguration healthCheckConfiguration,
        @CustomType.Parameter("instanceConfiguration") @Nullable ServiceInstanceConfiguration instanceConfiguration,
        @CustomType.Parameter("networkConfiguration") @Nullable ServiceNetworkConfiguration networkConfiguration,
        @CustomType.Parameter("observabilityConfiguration") @Nullable ServiceObservabilityConfiguration observabilityConfiguration,
        @CustomType.Parameter("serviceArn") @Nullable String serviceArn,
        @CustomType.Parameter("serviceId") @Nullable String serviceId,
        @CustomType.Parameter("serviceUrl") @Nullable String serviceUrl,
        @CustomType.Parameter("sourceConfiguration") @Nullable ServiceSourceConfiguration sourceConfiguration,
        @CustomType.Parameter("status") @Nullable String status) {
        this.healthCheckConfiguration = healthCheckConfiguration;
        this.instanceConfiguration = instanceConfiguration;
        this.networkConfiguration = networkConfiguration;
        this.observabilityConfiguration = observabilityConfiguration;
        this.serviceArn = serviceArn;
        this.serviceId = serviceId;
        this.serviceUrl = serviceUrl;
        this.sourceConfiguration = sourceConfiguration;
        this.status = status;
    }

    public Optional<ServiceHealthCheckConfiguration> healthCheckConfiguration() {
        return Optional.ofNullable(this.healthCheckConfiguration);
    }
    public Optional<ServiceInstanceConfiguration> instanceConfiguration() {
        return Optional.ofNullable(this.instanceConfiguration);
    }
    public Optional<ServiceNetworkConfiguration> networkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }
    public Optional<ServiceObservabilityConfiguration> observabilityConfiguration() {
        return Optional.ofNullable(this.observabilityConfiguration);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    public Optional<String> serviceArn() {
        return Optional.ofNullable(this.serviceArn);
    }
    /**
     * @return The AppRunner Service Id
     * 
     */
    public Optional<String> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }
    /**
     * @return The Service Url of the AppRunner Service.
     * 
     */
    public Optional<String> serviceUrl() {
        return Optional.ofNullable(this.serviceUrl);
    }
    public Optional<ServiceSourceConfiguration> sourceConfiguration() {
        return Optional.ofNullable(this.sourceConfiguration);
    }
    /**
     * @return AppRunner Service status.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceHealthCheckConfiguration healthCheckConfiguration;
        private @Nullable ServiceInstanceConfiguration instanceConfiguration;
        private @Nullable ServiceNetworkConfiguration networkConfiguration;
        private @Nullable ServiceObservabilityConfiguration observabilityConfiguration;
        private @Nullable String serviceArn;
        private @Nullable String serviceId;
        private @Nullable String serviceUrl;
        private @Nullable ServiceSourceConfiguration sourceConfiguration;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckConfiguration = defaults.healthCheckConfiguration;
    	      this.instanceConfiguration = defaults.instanceConfiguration;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.observabilityConfiguration = defaults.observabilityConfiguration;
    	      this.serviceArn = defaults.serviceArn;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.sourceConfiguration = defaults.sourceConfiguration;
    	      this.status = defaults.status;
        }

        public Builder healthCheckConfiguration(@Nullable ServiceHealthCheckConfiguration healthCheckConfiguration) {
            this.healthCheckConfiguration = healthCheckConfiguration;
            return this;
        }
        public Builder instanceConfiguration(@Nullable ServiceInstanceConfiguration instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            return this;
        }
        public Builder networkConfiguration(@Nullable ServiceNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public Builder observabilityConfiguration(@Nullable ServiceObservabilityConfiguration observabilityConfiguration) {
            this.observabilityConfiguration = observabilityConfiguration;
            return this;
        }
        public Builder serviceArn(@Nullable String serviceArn) {
            this.serviceArn = serviceArn;
            return this;
        }
        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Builder serviceUrl(@Nullable String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }
        public Builder sourceConfiguration(@Nullable ServiceSourceConfiguration sourceConfiguration) {
            this.sourceConfiguration = sourceConfiguration;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetServiceResult build() {
            return new GetServiceResult(healthCheckConfiguration, instanceConfiguration, networkConfiguration, observabilityConfiguration, serviceArn, serviceId, serviceUrl, sourceConfiguration, status);
        }
    }
}
