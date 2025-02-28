// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.EgressPolicyArgs;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.IngressPolicyArgs;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.VpcAccessibleServicesArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * `ServicePerimeterConfig` specifies a set of Google Cloud resources that describe specific Service Perimeter configuration.
 * 
 */
public final class ServicePerimeterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterConfigArgs Empty = new ServicePerimeterConfigArgs();

    /**
     * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `&#34;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&#34;`. For Service Perimeter Bridge, must be empty.
     * 
     */
    @Import(name="accessLevels")
    private @Nullable Output<List<String>> accessLevels;

    /**
     * @return A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `&#34;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&#34;`. For Service Perimeter Bridge, must be empty.
     * 
     */
    public Optional<Output<List<String>>> accessLevels() {
        return Optional.ofNullable(this.accessLevels);
    }

    /**
     * List of EgressPolicies to apply to the perimeter. A perimeter may have multiple EgressPolicies, each of which is evaluated separately. Access is granted if any EgressPolicy grants it. Must be empty for a perimeter bridge.
     * 
     */
    @Import(name="egressPolicies")
    private @Nullable Output<List<EgressPolicyArgs>> egressPolicies;

    /**
     * @return List of EgressPolicies to apply to the perimeter. A perimeter may have multiple EgressPolicies, each of which is evaluated separately. Access is granted if any EgressPolicy grants it. Must be empty for a perimeter bridge.
     * 
     */
    public Optional<Output<List<EgressPolicyArgs>>> egressPolicies() {
        return Optional.ofNullable(this.egressPolicies);
    }

    /**
     * List of IngressPolicies to apply to the perimeter. A perimeter may have multiple IngressPolicies, each of which is evaluated separately. Access is granted if any Ingress Policy grants it. Must be empty for a perimeter bridge.
     * 
     */
    @Import(name="ingressPolicies")
    private @Nullable Output<List<IngressPolicyArgs>> ingressPolicies;

    /**
     * @return List of IngressPolicies to apply to the perimeter. A perimeter may have multiple IngressPolicies, each of which is evaluated separately. Access is granted if any Ingress Policy grants it. Must be empty for a perimeter bridge.
     * 
     */
    public Optional<Output<List<IngressPolicyArgs>>> ingressPolicies() {
        return Optional.ofNullable(this.ingressPolicies);
    }

    /**
     * A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}`
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}`
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * Google Cloud services that are subject to the Service Perimeter restrictions. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter&#39;s access restrictions.
     * 
     */
    @Import(name="restrictedServices")
    private @Nullable Output<List<String>> restrictedServices;

    /**
     * @return Google Cloud services that are subject to the Service Perimeter restrictions. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter&#39;s access restrictions.
     * 
     */
    public Optional<Output<List<String>>> restrictedServices() {
        return Optional.ofNullable(this.restrictedServices);
    }

    /**
     * Configuration for APIs allowed within Perimeter.
     * 
     */
    @Import(name="vpcAccessibleServices")
    private @Nullable Output<VpcAccessibleServicesArgs> vpcAccessibleServices;

    /**
     * @return Configuration for APIs allowed within Perimeter.
     * 
     */
    public Optional<Output<VpcAccessibleServicesArgs>> vpcAccessibleServices() {
        return Optional.ofNullable(this.vpcAccessibleServices);
    }

    private ServicePerimeterConfigArgs() {}

    private ServicePerimeterConfigArgs(ServicePerimeterConfigArgs $) {
        this.accessLevels = $.accessLevels;
        this.egressPolicies = $.egressPolicies;
        this.ingressPolicies = $.ingressPolicies;
        this.resources = $.resources;
        this.restrictedServices = $.restrictedServices;
        this.vpcAccessibleServices = $.vpcAccessibleServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterConfigArgs $;

        public Builder() {
            $ = new ServicePerimeterConfigArgs();
        }

        public Builder(ServicePerimeterConfigArgs defaults) {
            $ = new ServicePerimeterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevels A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `&#34;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&#34;`. For Service Perimeter Bridge, must be empty.
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(@Nullable Output<List<String>> accessLevels) {
            $.accessLevels = accessLevels;
            return this;
        }

        /**
         * @param accessLevels A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `&#34;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&#34;`. For Service Perimeter Bridge, must be empty.
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(List<String> accessLevels) {
            return accessLevels(Output.of(accessLevels));
        }

        /**
         * @param accessLevels A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `&#34;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&#34;`. For Service Perimeter Bridge, must be empty.
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(String... accessLevels) {
            return accessLevels(List.of(accessLevels));
        }

        /**
         * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may have multiple EgressPolicies, each of which is evaluated separately. Access is granted if any EgressPolicy grants it. Must be empty for a perimeter bridge.
         * 
         * @return builder
         * 
         */
        public Builder egressPolicies(@Nullable Output<List<EgressPolicyArgs>> egressPolicies) {
            $.egressPolicies = egressPolicies;
            return this;
        }

        /**
         * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may have multiple EgressPolicies, each of which is evaluated separately. Access is granted if any EgressPolicy grants it. Must be empty for a perimeter bridge.
         * 
         * @return builder
         * 
         */
        public Builder egressPolicies(List<EgressPolicyArgs> egressPolicies) {
            return egressPolicies(Output.of(egressPolicies));
        }

        /**
         * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may have multiple EgressPolicies, each of which is evaluated separately. Access is granted if any EgressPolicy grants it. Must be empty for a perimeter bridge.
         * 
         * @return builder
         * 
         */
        public Builder egressPolicies(EgressPolicyArgs... egressPolicies) {
            return egressPolicies(List.of(egressPolicies));
        }

        /**
         * @param ingressPolicies List of IngressPolicies to apply to the perimeter. A perimeter may have multiple IngressPolicies, each of which is evaluated separately. Access is granted if any Ingress Policy grants it. Must be empty for a perimeter bridge.
         * 
         * @return builder
         * 
         */
        public Builder ingressPolicies(@Nullable Output<List<IngressPolicyArgs>> ingressPolicies) {
            $.ingressPolicies = ingressPolicies;
            return this;
        }

        /**
         * @param ingressPolicies List of IngressPolicies to apply to the perimeter. A perimeter may have multiple IngressPolicies, each of which is evaluated separately. Access is granted if any Ingress Policy grants it. Must be empty for a perimeter bridge.
         * 
         * @return builder
         * 
         */
        public Builder ingressPolicies(List<IngressPolicyArgs> ingressPolicies) {
            return ingressPolicies(Output.of(ingressPolicies));
        }

        /**
         * @param ingressPolicies List of IngressPolicies to apply to the perimeter. A perimeter may have multiple IngressPolicies, each of which is evaluated separately. Access is granted if any Ingress Policy grants it. Must be empty for a perimeter bridge.
         * 
         * @return builder
         * 
         */
        public Builder ingressPolicies(IngressPolicyArgs... ingressPolicies) {
            return ingressPolicies(List.of(ingressPolicies));
        }

        /**
         * @param resources A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}`
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}`
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}`
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param restrictedServices Google Cloud services that are subject to the Service Perimeter restrictions. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter&#39;s access restrictions.
         * 
         * @return builder
         * 
         */
        public Builder restrictedServices(@Nullable Output<List<String>> restrictedServices) {
            $.restrictedServices = restrictedServices;
            return this;
        }

        /**
         * @param restrictedServices Google Cloud services that are subject to the Service Perimeter restrictions. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter&#39;s access restrictions.
         * 
         * @return builder
         * 
         */
        public Builder restrictedServices(List<String> restrictedServices) {
            return restrictedServices(Output.of(restrictedServices));
        }

        /**
         * @param restrictedServices Google Cloud services that are subject to the Service Perimeter restrictions. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter&#39;s access restrictions.
         * 
         * @return builder
         * 
         */
        public Builder restrictedServices(String... restrictedServices) {
            return restrictedServices(List.of(restrictedServices));
        }

        /**
         * @param vpcAccessibleServices Configuration for APIs allowed within Perimeter.
         * 
         * @return builder
         * 
         */
        public Builder vpcAccessibleServices(@Nullable Output<VpcAccessibleServicesArgs> vpcAccessibleServices) {
            $.vpcAccessibleServices = vpcAccessibleServices;
            return this;
        }

        /**
         * @param vpcAccessibleServices Configuration for APIs allowed within Perimeter.
         * 
         * @return builder
         * 
         */
        public Builder vpcAccessibleServices(VpcAccessibleServicesArgs vpcAccessibleServices) {
            return vpcAccessibleServices(Output.of(vpcAccessibleServices));
        }

        public ServicePerimeterConfigArgs build() {
            return $;
        }
    }

}
