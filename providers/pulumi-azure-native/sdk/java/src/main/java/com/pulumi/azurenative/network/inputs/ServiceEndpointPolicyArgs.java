// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ServiceEndpointPolicyDefinitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service End point policy resource.
 * 
 */
public final class ServiceEndpointPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointPolicyArgs Empty = new ServiceEndpointPolicyArgs();

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
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A collection of service endpoint policy definitions of the service endpoint policy.
     * 
     */
    @Import(name="serviceEndpointPolicyDefinitions")
    private @Nullable Output<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions;

    /**
     * @return A collection of service endpoint policy definitions of the service endpoint policy.
     * 
     */
    public Optional<Output<List<ServiceEndpointPolicyDefinitionArgs>>> serviceEndpointPolicyDefinitions() {
        return Optional.ofNullable(this.serviceEndpointPolicyDefinitions);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ServiceEndpointPolicyArgs() {}

    private ServiceEndpointPolicyArgs(ServiceEndpointPolicyArgs $) {
        this.id = $.id;
        this.location = $.location;
        this.serviceEndpointPolicyDefinitions = $.serviceEndpointPolicyDefinitions;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEndpointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEndpointPolicyArgs $;

        public Builder() {
            $ = new ServiceEndpointPolicyArgs();
        }

        public Builder(ServiceEndpointPolicyArgs defaults) {
            $ = new ServiceEndpointPolicyArgs(Objects.requireNonNull(defaults));
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
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param serviceEndpointPolicyDefinitions A collection of service endpoint policy definitions of the service endpoint policy.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicyDefinitions(@Nullable Output<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions) {
            $.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
            return this;
        }

        /**
         * @param serviceEndpointPolicyDefinitions A collection of service endpoint policy definitions of the service endpoint policy.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicyDefinitions(List<ServiceEndpointPolicyDefinitionArgs> serviceEndpointPolicyDefinitions) {
            return serviceEndpointPolicyDefinitions(Output.of(serviceEndpointPolicyDefinitions));
        }

        /**
         * @param serviceEndpointPolicyDefinitions A collection of service endpoint policy definitions of the service endpoint policy.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicyDefinitions(ServiceEndpointPolicyDefinitionArgs... serviceEndpointPolicyDefinitions) {
            return serviceEndpointPolicyDefinitions(List.of(serviceEndpointPolicyDefinitions));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ServiceEndpointPolicyArgs build() {
            return $;
        }
    }

}
