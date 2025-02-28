// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service Endpoint policy definitions.
 * 
 */
public final class ServiceEndpointPolicyDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointPolicyDefinitionArgs Empty = new ServiceEndpointPolicyDefinitionArgs();

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for this rule. Restricted to 140 chars.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Service endpoint name.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Service endpoint name.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * A list of service resources.
     * 
     */
    @Import(name="serviceResources")
    private @Nullable Output<List<String>> serviceResources;

    /**
     * @return A list of service resources.
     * 
     */
    public Optional<Output<List<String>>> serviceResources() {
        return Optional.ofNullable(this.serviceResources);
    }

    private ServiceEndpointPolicyDefinitionArgs() {}

    private ServiceEndpointPolicyDefinitionArgs(ServiceEndpointPolicyDefinitionArgs $) {
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.service = $.service;
        this.serviceResources = $.serviceResources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEndpointPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEndpointPolicyDefinitionArgs $;

        public Builder() {
            $ = new ServiceEndpointPolicyDefinitionArgs();
        }

        public Builder(ServiceEndpointPolicyDefinitionArgs defaults) {
            $ = new ServiceEndpointPolicyDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description for this rule. Restricted to 140 chars.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for this rule. Restricted to 140 chars.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param service Service endpoint name.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Service endpoint name.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param serviceResources A list of service resources.
         * 
         * @return builder
         * 
         */
        public Builder serviceResources(@Nullable Output<List<String>> serviceResources) {
            $.serviceResources = serviceResources;
            return this;
        }

        /**
         * @param serviceResources A list of service resources.
         * 
         * @return builder
         * 
         */
        public Builder serviceResources(List<String> serviceResources) {
            return serviceResources(Output.of(serviceResources));
        }

        /**
         * @param serviceResources A list of service resources.
         * 
         * @return builder
         * 
         */
        public Builder serviceResources(String... serviceResources) {
            return serviceResources(List.of(serviceResources));
        }

        public ServiceEndpointPolicyDefinitionArgs build() {
            return $;
        }
    }

}
