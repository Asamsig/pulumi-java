// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.inputs.ApiArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.AuthenticationArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.BackendArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.BillingArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.ContextArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.ControlArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.CustomErrorArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.DocumentationArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.EndpointArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.EnumArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.HttpArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.LogDescriptorArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.LoggingArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.MetricDescriptorArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.MonitoredResourceDescriptorArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.MonitoringArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.QuotaArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.SystemParametersArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.TypeArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.UsageArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigArgs Empty = new ConfigArgs();

    /**
     * A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
     * 
     */
    @Import(name="apis")
    private @Nullable Output<List<ApiArgs>> apis;

    /**
     * @return A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
     * 
     */
    public Optional<Output<List<ApiArgs>>> apis() {
        return Optional.ofNullable(this.apis);
    }

    /**
     * Auth configuration.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<AuthenticationArgs> authentication;

    /**
     * @return Auth configuration.
     * 
     */
    public Optional<Output<AuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * API backend configuration.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<BackendArgs> backend;

    /**
     * @return API backend configuration.
     * 
     */
    public Optional<Output<BackendArgs>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * Billing configuration.
     * 
     */
    @Import(name="billing")
    private @Nullable Output<BillingArgs> billing;

    /**
     * @return Billing configuration.
     * 
     */
    public Optional<Output<BillingArgs>> billing() {
        return Optional.ofNullable(this.billing);
    }

    /**
     * Obsolete. Do not use. This field has no semantic meaning. The service config compiler always sets this field to `3`.
     * 
     */
    @Import(name="configVersion")
    private @Nullable Output<Integer> configVersion;

    /**
     * @return Obsolete. Do not use. This field has no semantic meaning. The service config compiler always sets this field to `3`.
     * 
     */
    public Optional<Output<Integer>> configVersion() {
        return Optional.ofNullable(this.configVersion);
    }

    /**
     * Context configuration.
     * 
     */
    @Import(name="context")
    private @Nullable Output<ContextArgs> context;

    /**
     * @return Context configuration.
     * 
     */
    public Optional<Output<ContextArgs>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * Configuration for the service control plane.
     * 
     */
    @Import(name="control")
    private @Nullable Output<ControlArgs> control;

    /**
     * @return Configuration for the service control plane.
     * 
     */
    public Optional<Output<ControlArgs>> control() {
        return Optional.ofNullable(this.control);
    }

    /**
     * Custom error configuration.
     * 
     */
    @Import(name="customError")
    private @Nullable Output<CustomErrorArgs> customError;

    /**
     * @return Custom error configuration.
     * 
     */
    public Optional<Output<CustomErrorArgs>> customError() {
        return Optional.ofNullable(this.customError);
    }

    /**
     * Additional API documentation.
     * 
     */
    @Import(name="documentation")
    private @Nullable Output<DocumentationArgs> documentation;

    /**
     * @return Additional API documentation.
     * 
     */
    public Optional<Output<DocumentationArgs>> documentation() {
        return Optional.ofNullable(this.documentation);
    }

    /**
     * Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<List<EndpointArgs>> endpoints;

    /**
     * @return Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs.
     * 
     */
    public Optional<Output<List<EndpointArgs>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be included should be listed here by name by the configuration author. Example: enums: - name: google.someapi.v1.SomeEnum
     * 
     */
    @Import(name="enums")
    private @Nullable Output<List<EnumArgs>> enums;

    /**
     * @return A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be included should be listed here by name by the configuration author. Example: enums: - name: google.someapi.v1.SomeEnum
     * 
     */
    public Optional<Output<List<EnumArgs>>> enums() {
        return Optional.ofNullable(this.enums);
    }

    /**
     * HTTP configuration.
     * 
     */
    @Import(name="http")
    private @Nullable Output<HttpArgs> http;

    /**
     * @return HTTP configuration.
     * 
     */
    public Optional<Output<HttpArgs>> http() {
        return Optional.ofNullable(this.http);
    }

    /**
     * A unique ID for a specific instance of this message, typically assigned by the client for tracking purpose. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If empty, the server may choose to generate one instead.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return A unique ID for a specific instance of this message, typically assigned by the client for tracking purpose. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If empty, the server may choose to generate one instead.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Logging configuration.
     * 
     */
    @Import(name="logging")
    private @Nullable Output<LoggingArgs> logging;

    /**
     * @return Logging configuration.
     * 
     */
    public Optional<Output<LoggingArgs>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * Defines the logs used by this service.
     * 
     */
    @Import(name="logs")
    private @Nullable Output<List<LogDescriptorArgs>> logs;

    /**
     * @return Defines the logs used by this service.
     * 
     */
    public Optional<Output<List<LogDescriptorArgs>>> logs() {
        return Optional.ofNullable(this.logs);
    }

    /**
     * Defines the metrics used by this service.
     * 
     */
    @Import(name="metrics")
    private @Nullable Output<List<MetricDescriptorArgs>> metrics;

    /**
     * @return Defines the metrics used by this service.
     * 
     */
    public Optional<Output<List<MetricDescriptorArgs>>> metrics() {
        return Optional.ofNullable(this.metrics);
    }

    /**
     * Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations.
     * 
     */
    @Import(name="monitoredResources")
    private @Nullable Output<List<MonitoredResourceDescriptorArgs>> monitoredResources;

    /**
     * @return Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations.
     * 
     */
    public Optional<Output<List<MonitoredResourceDescriptorArgs>>> monitoredResources() {
        return Optional.ofNullable(this.monitoredResources);
    }

    /**
     * Monitoring configuration.
     * 
     */
    @Import(name="monitoring")
    private @Nullable Output<MonitoringArgs> monitoring;

    /**
     * @return Monitoring configuration.
     * 
     */
    public Optional<Output<MonitoringArgs>> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }

    /**
     * The service name, which is a DNS-like logical identifier for the service, such as `calendar.googleapis.com`. The service name typically goes through DNS verification to make sure the owner of the service also owns the DNS name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The service name, which is a DNS-like logical identifier for the service, such as `calendar.googleapis.com`. The service name typically goes through DNS verification to make sure the owner of the service also owns the DNS name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Google project that owns this service.
     * 
     */
    @Import(name="producerProjectId")
    private @Nullable Output<String> producerProjectId;

    /**
     * @return The Google project that owns this service.
     * 
     */
    public Optional<Output<String>> producerProjectId() {
        return Optional.ofNullable(this.producerProjectId);
    }

    /**
     * Quota configuration.
     * 
     */
    @Import(name="quota")
    private @Nullable Output<QuotaArgs> quota;

    /**
     * @return Quota configuration.
     * 
     */
    public Optional<Output<QuotaArgs>> quota() {
        return Optional.ofNullable(this.quota);
    }

    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * System parameter configuration.
     * 
     */
    @Import(name="systemParameters")
    private @Nullable Output<SystemParametersArgs> systemParameters;

    /**
     * @return System parameter configuration.
     * 
     */
    public Optional<Output<SystemParametersArgs>> systemParameters() {
        return Optional.ofNullable(this.systemParameters);
    }

    /**
     * A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs. Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
     * 
     */
    @Import(name="systemTypes")
    private @Nullable Output<List<TypeArgs>> systemTypes;

    /**
     * @return A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs. Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
     * 
     */
    public Optional<Output<List<TypeArgs>>> systemTypes() {
        return Optional.ofNullable(this.systemTypes);
    }

    /**
     * The product title for this service, it is the name displayed in Google Cloud Console.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The product title for this service, it is the name displayed in Google Cloud Console.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name by the configuration author. Example: types: - name: google.protobuf.Int32
     * 
     */
    @Import(name="types")
    private @Nullable Output<List<TypeArgs>> types;

    /**
     * @return A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name by the configuration author. Example: types: - name: google.protobuf.Int32
     * 
     */
    public Optional<Output<List<TypeArgs>>> types() {
        return Optional.ofNullable(this.types);
    }

    /**
     * Configuration controlling usage of this service.
     * 
     */
    @Import(name="usage")
    private @Nullable Output<UsageArgs> usage;

    /**
     * @return Configuration controlling usage of this service.
     * 
     */
    public Optional<Output<UsageArgs>> usage() {
        return Optional.ofNullable(this.usage);
    }

    private ConfigArgs() {}

    private ConfigArgs(ConfigArgs $) {
        this.apis = $.apis;
        this.authentication = $.authentication;
        this.backend = $.backend;
        this.billing = $.billing;
        this.configVersion = $.configVersion;
        this.context = $.context;
        this.control = $.control;
        this.customError = $.customError;
        this.documentation = $.documentation;
        this.endpoints = $.endpoints;
        this.enums = $.enums;
        this.http = $.http;
        this.id = $.id;
        this.logging = $.logging;
        this.logs = $.logs;
        this.metrics = $.metrics;
        this.monitoredResources = $.monitoredResources;
        this.monitoring = $.monitoring;
        this.name = $.name;
        this.producerProjectId = $.producerProjectId;
        this.quota = $.quota;
        this.serviceName = $.serviceName;
        this.systemParameters = $.systemParameters;
        this.systemTypes = $.systemTypes;
        this.title = $.title;
        this.types = $.types;
        this.usage = $.usage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigArgs $;

        public Builder() {
            $ = new ConfigArgs();
        }

        public Builder(ConfigArgs defaults) {
            $ = new ConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apis A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
         * 
         * @return builder
         * 
         */
        public Builder apis(@Nullable Output<List<ApiArgs>> apis) {
            $.apis = apis;
            return this;
        }

        /**
         * @param apis A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
         * 
         * @return builder
         * 
         */
        public Builder apis(List<ApiArgs> apis) {
            return apis(Output.of(apis));
        }

        /**
         * @param apis A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
         * 
         * @return builder
         * 
         */
        public Builder apis(ApiArgs... apis) {
            return apis(List.of(apis));
        }

        /**
         * @param authentication Auth configuration.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<AuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Auth configuration.
         * 
         * @return builder
         * 
         */
        public Builder authentication(AuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param backend API backend configuration.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<BackendArgs> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend API backend configuration.
         * 
         * @return builder
         * 
         */
        public Builder backend(BackendArgs backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param billing Billing configuration.
         * 
         * @return builder
         * 
         */
        public Builder billing(@Nullable Output<BillingArgs> billing) {
            $.billing = billing;
            return this;
        }

        /**
         * @param billing Billing configuration.
         * 
         * @return builder
         * 
         */
        public Builder billing(BillingArgs billing) {
            return billing(Output.of(billing));
        }

        /**
         * @param configVersion Obsolete. Do not use. This field has no semantic meaning. The service config compiler always sets this field to `3`.
         * 
         * @return builder
         * 
         */
        public Builder configVersion(@Nullable Output<Integer> configVersion) {
            $.configVersion = configVersion;
            return this;
        }

        /**
         * @param configVersion Obsolete. Do not use. This field has no semantic meaning. The service config compiler always sets this field to `3`.
         * 
         * @return builder
         * 
         */
        public Builder configVersion(Integer configVersion) {
            return configVersion(Output.of(configVersion));
        }

        /**
         * @param context Context configuration.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<ContextArgs> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context Context configuration.
         * 
         * @return builder
         * 
         */
        public Builder context(ContextArgs context) {
            return context(Output.of(context));
        }

        /**
         * @param control Configuration for the service control plane.
         * 
         * @return builder
         * 
         */
        public Builder control(@Nullable Output<ControlArgs> control) {
            $.control = control;
            return this;
        }

        /**
         * @param control Configuration for the service control plane.
         * 
         * @return builder
         * 
         */
        public Builder control(ControlArgs control) {
            return control(Output.of(control));
        }

        /**
         * @param customError Custom error configuration.
         * 
         * @return builder
         * 
         */
        public Builder customError(@Nullable Output<CustomErrorArgs> customError) {
            $.customError = customError;
            return this;
        }

        /**
         * @param customError Custom error configuration.
         * 
         * @return builder
         * 
         */
        public Builder customError(CustomErrorArgs customError) {
            return customError(Output.of(customError));
        }

        /**
         * @param documentation Additional API documentation.
         * 
         * @return builder
         * 
         */
        public Builder documentation(@Nullable Output<DocumentationArgs> documentation) {
            $.documentation = documentation;
            return this;
        }

        /**
         * @param documentation Additional API documentation.
         * 
         * @return builder
         * 
         */
        public Builder documentation(DocumentationArgs documentation) {
            return documentation(Output.of(documentation));
        }

        /**
         * @param endpoints Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<List<EndpointArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(List<EndpointArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpoints Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(EndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param enums A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be included should be listed here by name by the configuration author. Example: enums: - name: google.someapi.v1.SomeEnum
         * 
         * @return builder
         * 
         */
        public Builder enums(@Nullable Output<List<EnumArgs>> enums) {
            $.enums = enums;
            return this;
        }

        /**
         * @param enums A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be included should be listed here by name by the configuration author. Example: enums: - name: google.someapi.v1.SomeEnum
         * 
         * @return builder
         * 
         */
        public Builder enums(List<EnumArgs> enums) {
            return enums(Output.of(enums));
        }

        /**
         * @param enums A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be included should be listed here by name by the configuration author. Example: enums: - name: google.someapi.v1.SomeEnum
         * 
         * @return builder
         * 
         */
        public Builder enums(EnumArgs... enums) {
            return enums(List.of(enums));
        }

        /**
         * @param http HTTP configuration.
         * 
         * @return builder
         * 
         */
        public Builder http(@Nullable Output<HttpArgs> http) {
            $.http = http;
            return this;
        }

        /**
         * @param http HTTP configuration.
         * 
         * @return builder
         * 
         */
        public Builder http(HttpArgs http) {
            return http(Output.of(http));
        }

        /**
         * @param id A unique ID for a specific instance of this message, typically assigned by the client for tracking purpose. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If empty, the server may choose to generate one instead.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id A unique ID for a specific instance of this message, typically assigned by the client for tracking purpose. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If empty, the server may choose to generate one instead.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param logging Logging configuration.
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<LoggingArgs> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging Logging configuration.
         * 
         * @return builder
         * 
         */
        public Builder logging(LoggingArgs logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param logs Defines the logs used by this service.
         * 
         * @return builder
         * 
         */
        public Builder logs(@Nullable Output<List<LogDescriptorArgs>> logs) {
            $.logs = logs;
            return this;
        }

        /**
         * @param logs Defines the logs used by this service.
         * 
         * @return builder
         * 
         */
        public Builder logs(List<LogDescriptorArgs> logs) {
            return logs(Output.of(logs));
        }

        /**
         * @param logs Defines the logs used by this service.
         * 
         * @return builder
         * 
         */
        public Builder logs(LogDescriptorArgs... logs) {
            return logs(List.of(logs));
        }

        /**
         * @param metrics Defines the metrics used by this service.
         * 
         * @return builder
         * 
         */
        public Builder metrics(@Nullable Output<List<MetricDescriptorArgs>> metrics) {
            $.metrics = metrics;
            return this;
        }

        /**
         * @param metrics Defines the metrics used by this service.
         * 
         * @return builder
         * 
         */
        public Builder metrics(List<MetricDescriptorArgs> metrics) {
            return metrics(Output.of(metrics));
        }

        /**
         * @param metrics Defines the metrics used by this service.
         * 
         * @return builder
         * 
         */
        public Builder metrics(MetricDescriptorArgs... metrics) {
            return metrics(List.of(metrics));
        }

        /**
         * @param monitoredResources Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResources(@Nullable Output<List<MonitoredResourceDescriptorArgs>> monitoredResources) {
            $.monitoredResources = monitoredResources;
            return this;
        }

        /**
         * @param monitoredResources Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResources(List<MonitoredResourceDescriptorArgs> monitoredResources) {
            return monitoredResources(Output.of(monitoredResources));
        }

        /**
         * @param monitoredResources Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResources(MonitoredResourceDescriptorArgs... monitoredResources) {
            return monitoredResources(List.of(monitoredResources));
        }

        /**
         * @param monitoring Monitoring configuration.
         * 
         * @return builder
         * 
         */
        public Builder monitoring(@Nullable Output<MonitoringArgs> monitoring) {
            $.monitoring = monitoring;
            return this;
        }

        /**
         * @param monitoring Monitoring configuration.
         * 
         * @return builder
         * 
         */
        public Builder monitoring(MonitoringArgs monitoring) {
            return monitoring(Output.of(monitoring));
        }

        /**
         * @param name The service name, which is a DNS-like logical identifier for the service, such as `calendar.googleapis.com`. The service name typically goes through DNS verification to make sure the owner of the service also owns the DNS name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The service name, which is a DNS-like logical identifier for the service, such as `calendar.googleapis.com`. The service name typically goes through DNS verification to make sure the owner of the service also owns the DNS name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param producerProjectId The Google project that owns this service.
         * 
         * @return builder
         * 
         */
        public Builder producerProjectId(@Nullable Output<String> producerProjectId) {
            $.producerProjectId = producerProjectId;
            return this;
        }

        /**
         * @param producerProjectId The Google project that owns this service.
         * 
         * @return builder
         * 
         */
        public Builder producerProjectId(String producerProjectId) {
            return producerProjectId(Output.of(producerProjectId));
        }

        /**
         * @param quota Quota configuration.
         * 
         * @return builder
         * 
         */
        public Builder quota(@Nullable Output<QuotaArgs> quota) {
            $.quota = quota;
            return this;
        }

        /**
         * @param quota Quota configuration.
         * 
         * @return builder
         * 
         */
        public Builder quota(QuotaArgs quota) {
            return quota(Output.of(quota));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param systemParameters System parameter configuration.
         * 
         * @return builder
         * 
         */
        public Builder systemParameters(@Nullable Output<SystemParametersArgs> systemParameters) {
            $.systemParameters = systemParameters;
            return this;
        }

        /**
         * @param systemParameters System parameter configuration.
         * 
         * @return builder
         * 
         */
        public Builder systemParameters(SystemParametersArgs systemParameters) {
            return systemParameters(Output.of(systemParameters));
        }

        /**
         * @param systemTypes A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs. Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
         * 
         * @return builder
         * 
         */
        public Builder systemTypes(@Nullable Output<List<TypeArgs>> systemTypes) {
            $.systemTypes = systemTypes;
            return this;
        }

        /**
         * @param systemTypes A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs. Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
         * 
         * @return builder
         * 
         */
        public Builder systemTypes(List<TypeArgs> systemTypes) {
            return systemTypes(Output.of(systemTypes));
        }

        /**
         * @param systemTypes A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs. Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
         * 
         * @return builder
         * 
         */
        public Builder systemTypes(TypeArgs... systemTypes) {
            return systemTypes(List.of(systemTypes));
        }

        /**
         * @param title The product title for this service, it is the name displayed in Google Cloud Console.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The product title for this service, it is the name displayed in Google Cloud Console.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param types A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name by the configuration author. Example: types: - name: google.protobuf.Int32
         * 
         * @return builder
         * 
         */
        public Builder types(@Nullable Output<List<TypeArgs>> types) {
            $.types = types;
            return this;
        }

        /**
         * @param types A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name by the configuration author. Example: types: - name: google.protobuf.Int32
         * 
         * @return builder
         * 
         */
        public Builder types(List<TypeArgs> types) {
            return types(Output.of(types));
        }

        /**
         * @param types A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name by the configuration author. Example: types: - name: google.protobuf.Int32
         * 
         * @return builder
         * 
         */
        public Builder types(TypeArgs... types) {
            return types(List.of(types));
        }

        /**
         * @param usage Configuration controlling usage of this service.
         * 
         * @return builder
         * 
         */
        public Builder usage(@Nullable Output<UsageArgs> usage) {
            $.usage = usage;
            return this;
        }

        /**
         * @param usage Configuration controlling usage of this service.
         * 
         * @return builder
         * 
         */
        public Builder usage(UsageArgs usage) {
            return usage(Output.of(usage));
        }

        public ConfigArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
