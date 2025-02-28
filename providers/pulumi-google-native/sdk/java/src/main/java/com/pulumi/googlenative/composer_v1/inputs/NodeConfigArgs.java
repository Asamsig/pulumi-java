// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.composer_v1.inputs.IPAllocationPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration information for the Kubernetes Engine nodes running the Apache Airflow software.
 * 
 */
public final class NodeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeConfigArgs Empty = new NodeConfigArgs();

    /**
     * Optional. The disk size in GB used for node VMs. Minimum size is 30GB. If unspecified, defaults to 100GB. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return Optional. The disk size in GB used for node VMs. Minimum size is 30GB. If unspecified, defaults to 100GB. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Optional. The configuration for controlling how IPs are allocated in the GKE cluster.
     * 
     */
    @Import(name="ipAllocationPolicy")
    private @Nullable Output<IPAllocationPolicyArgs> ipAllocationPolicy;

    /**
     * @return Optional. The configuration for controlling how IPs are allocated in the GKE cluster.
     * 
     */
    public Optional<Output<IPAllocationPolicyArgs>> ipAllocationPolicy() {
        return Optional.ofNullable(this.ipAllocationPolicy);
    }

    /**
     * Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs used to run the Apache Airflow software, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}&#34;. This `location` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this `location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If only one field (`location` or `nodeConfig.machineType`) is specified, the location information from the specified field will be propagated to the unspecified field. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs used to run the Apache Airflow software, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}&#34;. This `location` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this `location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If only one field (`location` or `nodeConfig.machineType`) is specified, the location information from the specified field will be propagated to the unspecified field. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster instances, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}&#34;. The `machineType` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.location` are specified, this `machineType` must belong to the `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If exactly one of this field and `nodeConfig.location` is specified, the location information from the specified field will be propagated to the unspecified field. The `machineTypeId` must not be a [shared-core machine type](/compute/docs/machine-types#sharedcore). If this field is unspecified, the `machineTypeId` defaults to &#34;n1-standard-1&#34;. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster instances, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}&#34;. The `machineType` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.location` are specified, this `machineType` must belong to the `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If exactly one of this field and `nodeConfig.location` is specified, the location information from the specified field will be propagated to the unspecified field. The `machineTypeId` must not be a [shared-core machine type](/compute/docs/machine-types#sharedcore). If this field is unspecified, the `machineTypeId` defaults to &#34;n1-standard-1&#34;. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * Optional. The Compute Engine network to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/global/networks/{networkId}&#34;. If unspecified, the &#34;default&#34; network ID in the environment&#39;s project is used. If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see `nodeConfig.subnetwork`.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Optional. The Compute Engine network to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/global/networks/{networkId}&#34;. If unspecified, the &#34;default&#34; network ID in the environment&#39;s project is used. If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see `nodeConfig.subnetwork`.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Optional. The set of Google API scopes to be made available on all node VMs. If `oauth_scopes` is empty, defaults to [&#34;https://www.googleapis.com/auth/cloud-platform&#34;]. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="oauthScopes")
    private @Nullable Output<List<String>> oauthScopes;

    /**
     * @return Optional. The set of Google API scopes to be made available on all node VMs. If `oauth_scopes` is empty, defaults to [&#34;https://www.googleapis.com/auth/cloud-platform&#34;]. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Optional<Output<List<String>>> oauthScopes() {
        return Optional.ofNullable(this.oauthScopes);
    }

    /**
     * Optional. The Google Cloud Platform Service Account to be used by the node VMs. If a service account is not specified, the &#34;default&#34; Compute Engine service account is used. Cannot be updated.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return Optional. The Google Cloud Platform Service Account to be used by the node VMs. If a service account is not specified, the &#34;default&#34; Compute Engine service account is used. Cannot be updated.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}&#34; If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork must belong to the enclosing environment&#39;s project and location.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return Optional. The Compute Engine subnetwork to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}&#34; If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork must belong to the enclosing environment&#39;s project and location.
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid sources or targets for network firewalls. Each tag within the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid sources or targets for network firewalls. Each tag within the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NodeConfigArgs() {}

    private NodeConfigArgs(NodeConfigArgs $) {
        this.diskSizeGb = $.diskSizeGb;
        this.ipAllocationPolicy = $.ipAllocationPolicy;
        this.location = $.location;
        this.machineType = $.machineType;
        this.network = $.network;
        this.oauthScopes = $.oauthScopes;
        this.serviceAccount = $.serviceAccount;
        this.subnetwork = $.subnetwork;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeConfigArgs $;

        public Builder() {
            $ = new NodeConfigArgs();
        }

        public Builder(NodeConfigArgs defaults) {
            $ = new NodeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskSizeGb Optional. The disk size in GB used for node VMs. Minimum size is 30GB. If unspecified, defaults to 100GB. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Optional. The disk size in GB used for node VMs. Minimum size is 30GB. If unspecified, defaults to 100GB. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param ipAllocationPolicy Optional. The configuration for controlling how IPs are allocated in the GKE cluster.
         * 
         * @return builder
         * 
         */
        public Builder ipAllocationPolicy(@Nullable Output<IPAllocationPolicyArgs> ipAllocationPolicy) {
            $.ipAllocationPolicy = ipAllocationPolicy;
            return this;
        }

        /**
         * @param ipAllocationPolicy Optional. The configuration for controlling how IPs are allocated in the GKE cluster.
         * 
         * @return builder
         * 
         */
        public Builder ipAllocationPolicy(IPAllocationPolicyArgs ipAllocationPolicy) {
            return ipAllocationPolicy(Output.of(ipAllocationPolicy));
        }

        /**
         * @param location Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs used to run the Apache Airflow software, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}&#34;. This `location` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this `location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If only one field (`location` or `nodeConfig.machineType`) is specified, the location information from the specified field will be propagated to the unspecified field. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs used to run the Apache Airflow software, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}&#34;. This `location` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this `location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If only one field (`location` or `nodeConfig.machineType`) is specified, the location information from the specified field will be propagated to the unspecified field. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param machineType Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster instances, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}&#34;. The `machineType` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.location` are specified, this `machineType` must belong to the `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If exactly one of this field and `nodeConfig.location` is specified, the location information from the specified field will be propagated to the unspecified field. The `machineTypeId` must not be a [shared-core machine type](/compute/docs/machine-types#sharedcore). If this field is unspecified, the `machineTypeId` defaults to &#34;n1-standard-1&#34;. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster instances, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}&#34;. The `machineType` must belong to the enclosing environment&#39;s project and location. If both this field and `nodeConfig.location` are specified, this `machineType` must belong to the `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If exactly one of this field and `nodeConfig.location` is specified, the location information from the specified field will be propagated to the unspecified field. The `machineTypeId` must not be a [shared-core machine type](/compute/docs/machine-types#sharedcore). If this field is unspecified, the `machineTypeId` defaults to &#34;n1-standard-1&#34;. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param network Optional. The Compute Engine network to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/global/networks/{networkId}&#34;. If unspecified, the &#34;default&#34; network ID in the environment&#39;s project is used. If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see `nodeConfig.subnetwork`.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Optional. The Compute Engine network to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/global/networks/{networkId}&#34;. If unspecified, the &#34;default&#34; network ID in the environment&#39;s project is used. If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see `nodeConfig.subnetwork`.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param oauthScopes Optional. The set of Google API scopes to be made available on all node VMs. If `oauth_scopes` is empty, defaults to [&#34;https://www.googleapis.com/auth/cloud-platform&#34;]. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            $.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * @param oauthScopes Optional. The set of Google API scopes to be made available on all node VMs. If `oauth_scopes` is empty, defaults to [&#34;https://www.googleapis.com/auth/cloud-platform&#34;]. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(List<String> oauthScopes) {
            return oauthScopes(Output.of(oauthScopes));
        }

        /**
         * @param oauthScopes Optional. The set of Google API scopes to be made available on all node VMs. If `oauth_scopes` is empty, defaults to [&#34;https://www.googleapis.com/auth/cloud-platform&#34;]. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }

        /**
         * @param serviceAccount Optional. The Google Cloud Platform Service Account to be used by the node VMs. If a service account is not specified, the &#34;default&#34; Compute Engine service account is used. Cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Optional. The Google Cloud Platform Service Account to be used by the node VMs. If a service account is not specified, the &#34;default&#34; Compute Engine service account is used. Cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param subnetwork Optional. The Compute Engine subnetwork to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}&#34; If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork must belong to the enclosing environment&#39;s project and location.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork Optional. The Compute Engine subnetwork to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: &#34;projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}&#34; If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork must belong to the enclosing environment&#39;s project and location.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param tags Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid sources or targets for network firewalls. Each tag within the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid sources or targets for network firewalls. Each tag within the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid sources or targets for network firewalls. Each tag within the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public NodeConfigArgs build() {
            return $;
        }
    }

}
