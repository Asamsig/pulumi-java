// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileLoadBalancerProfileArgs;
import com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileNatGatewayProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterNetworkProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterNetworkProfileArgs Empty = new KubernetesClusterNetworkProfileArgs();

    /**
     * IP address within the Kubernetes service address range that will be used by cluster service discovery (kube-dns). Changing this forces a new resource to be created.
     * 
     */
    @Import(name="dnsServiceIp")
    private @Nullable Output<String> dnsServiceIp;

    /**
     * @return IP address within the Kubernetes service address range that will be used by cluster service discovery (kube-dns). Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> dnsServiceIp() {
        return Optional.ofNullable(this.dnsServiceIp);
    }

    /**
     * IP address (in CIDR notation) used as the Docker bridge IP address on nodes. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="dockerBridgeCidr")
    private @Nullable Output<String> dockerBridgeCidr;

    /**
     * @return IP address (in CIDR notation) used as the Docker bridge IP address on nodes. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> dockerBridgeCidr() {
        return Optional.ofNullable(this.dockerBridgeCidr);
    }

    /**
     * Specifies a list of IP versions the Kubernetes Cluster will use to assign IP addresses to its nodes and pods. Possible values are `IPv4` and/or `IPv6`. `IPv4` must always be specified. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="ipVersions")
    private @Nullable Output<List<String>> ipVersions;

    /**
     * @return Specifies a list of IP versions the Kubernetes Cluster will use to assign IP addresses to its nodes and pods. Possible values are `IPv4` and/or `IPv6`. `IPv4` must always be specified. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> ipVersions() {
        return Optional.ofNullable(this.ipVersions);
    }

    /**
     * A `load_balancer_profile` block. This can only be specified when `load_balancer_sku` is set to `standard`.
     * 
     */
    @Import(name="loadBalancerProfile")
    private @Nullable Output<KubernetesClusterNetworkProfileLoadBalancerProfileArgs> loadBalancerProfile;

    /**
     * @return A `load_balancer_profile` block. This can only be specified when `load_balancer_sku` is set to `standard`.
     * 
     */
    public Optional<Output<KubernetesClusterNetworkProfileLoadBalancerProfileArgs>> loadBalancerProfile() {
        return Optional.ofNullable(this.loadBalancerProfile);
    }

    /**
     * Specifies the SKU of the Load Balancer used for this Kubernetes Cluster. Possible values are `basic` and `standard`. Defaults to `standard`.
     * 
     */
    @Import(name="loadBalancerSku")
    private @Nullable Output<String> loadBalancerSku;

    /**
     * @return Specifies the SKU of the Load Balancer used for this Kubernetes Cluster. Possible values are `basic` and `standard`. Defaults to `standard`.
     * 
     */
    public Optional<Output<String>> loadBalancerSku() {
        return Optional.ofNullable(this.loadBalancerSku);
    }

    /**
     * A `nat_gateway_profile` block. This can only be specified when `load_balancer_sku` is set to `standard` and `outbound_type` is set to `managedNATGateway` or `userAssignedNATGateway`.
     * 
     */
    @Import(name="natGatewayProfile")
    private @Nullable Output<KubernetesClusterNetworkProfileNatGatewayProfileArgs> natGatewayProfile;

    /**
     * @return A `nat_gateway_profile` block. This can only be specified when `load_balancer_sku` is set to `standard` and `outbound_type` is set to `managedNATGateway` or `userAssignedNATGateway`.
     * 
     */
    public Optional<Output<KubernetesClusterNetworkProfileNatGatewayProfileArgs>> natGatewayProfile() {
        return Optional.ofNullable(this.natGatewayProfile);
    }

    /**
     * Network mode to be used with Azure CNI. Possible values are `bridge` and `transparent`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="networkMode")
    private @Nullable Output<String> networkMode;

    /**
     * @return Network mode to be used with Azure CNI. Possible values are `bridge` and `transparent`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> networkMode() {
        return Optional.ofNullable(this.networkMode);
    }

    /**
     * Network plugin to use for networking. Currently supported values are `azure` and `kubenet`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="networkPlugin", required=true)
    private Output<String> networkPlugin;

    /**
     * @return Network plugin to use for networking. Currently supported values are `azure` and `kubenet`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> networkPlugin() {
        return this.networkPlugin;
    }

    /**
     * Sets up network policy to be used with Azure CNI. [Network policy allows us to control the traffic flow between pods](https://docs.microsoft.com/en-us/azure/aks/use-network-policies). Currently supported values are `calico` and `azure`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="networkPolicy")
    private @Nullable Output<String> networkPolicy;

    /**
     * @return Sets up network policy to be used with Azure CNI. [Network policy allows us to control the traffic flow between pods](https://docs.microsoft.com/en-us/azure/aks/use-network-policies). Currently supported values are `calico` and `azure`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> networkPolicy() {
        return Optional.ofNullable(this.networkPolicy);
    }

    /**
     * The outbound (egress) routing method which should be used for this Kubernetes Cluster. Possible values are `loadBalancer`, `userDefinedRouting`, `managedNATGateway` and `userAssignedNATGateway`. Defaults to `loadBalancer`.
     * 
     */
    @Import(name="outboundType")
    private @Nullable Output<String> outboundType;

    /**
     * @return The outbound (egress) routing method which should be used for this Kubernetes Cluster. Possible values are `loadBalancer`, `userDefinedRouting`, `managedNATGateway` and `userAssignedNATGateway`. Defaults to `loadBalancer`.
     * 
     */
    public Optional<Output<String>> outboundType() {
        return Optional.ofNullable(this.outboundType);
    }

    /**
     * The CIDR to use for pod IP addresses. This field can only be set when `network_plugin` is set to `kubenet`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="podCidr")
    private @Nullable Output<String> podCidr;

    /**
     * @return The CIDR to use for pod IP addresses. This field can only be set when `network_plugin` is set to `kubenet`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> podCidr() {
        return Optional.ofNullable(this.podCidr);
    }

    /**
     * The Network Range used by the Kubernetes service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serviceCidr")
    private @Nullable Output<String> serviceCidr;

    /**
     * @return The Network Range used by the Kubernetes service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> serviceCidr() {
        return Optional.ofNullable(this.serviceCidr);
    }

    private KubernetesClusterNetworkProfileArgs() {}

    private KubernetesClusterNetworkProfileArgs(KubernetesClusterNetworkProfileArgs $) {
        this.dnsServiceIp = $.dnsServiceIp;
        this.dockerBridgeCidr = $.dockerBridgeCidr;
        this.ipVersions = $.ipVersions;
        this.loadBalancerProfile = $.loadBalancerProfile;
        this.loadBalancerSku = $.loadBalancerSku;
        this.natGatewayProfile = $.natGatewayProfile;
        this.networkMode = $.networkMode;
        this.networkPlugin = $.networkPlugin;
        this.networkPolicy = $.networkPolicy;
        this.outboundType = $.outboundType;
        this.podCidr = $.podCidr;
        this.serviceCidr = $.serviceCidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterNetworkProfileArgs $;

        public Builder() {
            $ = new KubernetesClusterNetworkProfileArgs();
        }

        public Builder(KubernetesClusterNetworkProfileArgs defaults) {
            $ = new KubernetesClusterNetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsServiceIp IP address within the Kubernetes service address range that will be used by cluster service discovery (kube-dns). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dnsServiceIp(@Nullable Output<String> dnsServiceIp) {
            $.dnsServiceIp = dnsServiceIp;
            return this;
        }

        /**
         * @param dnsServiceIp IP address within the Kubernetes service address range that will be used by cluster service discovery (kube-dns). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dnsServiceIp(String dnsServiceIp) {
            return dnsServiceIp(Output.of(dnsServiceIp));
        }

        /**
         * @param dockerBridgeCidr IP address (in CIDR notation) used as the Docker bridge IP address on nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dockerBridgeCidr(@Nullable Output<String> dockerBridgeCidr) {
            $.dockerBridgeCidr = dockerBridgeCidr;
            return this;
        }

        /**
         * @param dockerBridgeCidr IP address (in CIDR notation) used as the Docker bridge IP address on nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dockerBridgeCidr(String dockerBridgeCidr) {
            return dockerBridgeCidr(Output.of(dockerBridgeCidr));
        }

        /**
         * @param ipVersions Specifies a list of IP versions the Kubernetes Cluster will use to assign IP addresses to its nodes and pods. Possible values are `IPv4` and/or `IPv6`. `IPv4` must always be specified. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipVersions(@Nullable Output<List<String>> ipVersions) {
            $.ipVersions = ipVersions;
            return this;
        }

        /**
         * @param ipVersions Specifies a list of IP versions the Kubernetes Cluster will use to assign IP addresses to its nodes and pods. Possible values are `IPv4` and/or `IPv6`. `IPv4` must always be specified. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipVersions(List<String> ipVersions) {
            return ipVersions(Output.of(ipVersions));
        }

        /**
         * @param ipVersions Specifies a list of IP versions the Kubernetes Cluster will use to assign IP addresses to its nodes and pods. Possible values are `IPv4` and/or `IPv6`. `IPv4` must always be specified. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipVersions(String... ipVersions) {
            return ipVersions(List.of(ipVersions));
        }

        /**
         * @param loadBalancerProfile A `load_balancer_profile` block. This can only be specified when `load_balancer_sku` is set to `standard`.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerProfile(@Nullable Output<KubernetesClusterNetworkProfileLoadBalancerProfileArgs> loadBalancerProfile) {
            $.loadBalancerProfile = loadBalancerProfile;
            return this;
        }

        /**
         * @param loadBalancerProfile A `load_balancer_profile` block. This can only be specified when `load_balancer_sku` is set to `standard`.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerProfile(KubernetesClusterNetworkProfileLoadBalancerProfileArgs loadBalancerProfile) {
            return loadBalancerProfile(Output.of(loadBalancerProfile));
        }

        /**
         * @param loadBalancerSku Specifies the SKU of the Load Balancer used for this Kubernetes Cluster. Possible values are `basic` and `standard`. Defaults to `standard`.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerSku(@Nullable Output<String> loadBalancerSku) {
            $.loadBalancerSku = loadBalancerSku;
            return this;
        }

        /**
         * @param loadBalancerSku Specifies the SKU of the Load Balancer used for this Kubernetes Cluster. Possible values are `basic` and `standard`. Defaults to `standard`.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerSku(String loadBalancerSku) {
            return loadBalancerSku(Output.of(loadBalancerSku));
        }

        /**
         * @param natGatewayProfile A `nat_gateway_profile` block. This can only be specified when `load_balancer_sku` is set to `standard` and `outbound_type` is set to `managedNATGateway` or `userAssignedNATGateway`.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayProfile(@Nullable Output<KubernetesClusterNetworkProfileNatGatewayProfileArgs> natGatewayProfile) {
            $.natGatewayProfile = natGatewayProfile;
            return this;
        }

        /**
         * @param natGatewayProfile A `nat_gateway_profile` block. This can only be specified when `load_balancer_sku` is set to `standard` and `outbound_type` is set to `managedNATGateway` or `userAssignedNATGateway`.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayProfile(KubernetesClusterNetworkProfileNatGatewayProfileArgs natGatewayProfile) {
            return natGatewayProfile(Output.of(natGatewayProfile));
        }

        /**
         * @param networkMode Network mode to be used with Azure CNI. Possible values are `bridge` and `transparent`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkMode(@Nullable Output<String> networkMode) {
            $.networkMode = networkMode;
            return this;
        }

        /**
         * @param networkMode Network mode to be used with Azure CNI. Possible values are `bridge` and `transparent`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkMode(String networkMode) {
            return networkMode(Output.of(networkMode));
        }

        /**
         * @param networkPlugin Network plugin to use for networking. Currently supported values are `azure` and `kubenet`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkPlugin(Output<String> networkPlugin) {
            $.networkPlugin = networkPlugin;
            return this;
        }

        /**
         * @param networkPlugin Network plugin to use for networking. Currently supported values are `azure` and `kubenet`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkPlugin(String networkPlugin) {
            return networkPlugin(Output.of(networkPlugin));
        }

        /**
         * @param networkPolicy Sets up network policy to be used with Azure CNI. [Network policy allows us to control the traffic flow between pods](https://docs.microsoft.com/en-us/azure/aks/use-network-policies). Currently supported values are `calico` and `azure`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicy(@Nullable Output<String> networkPolicy) {
            $.networkPolicy = networkPolicy;
            return this;
        }

        /**
         * @param networkPolicy Sets up network policy to be used with Azure CNI. [Network policy allows us to control the traffic flow between pods](https://docs.microsoft.com/en-us/azure/aks/use-network-policies). Currently supported values are `calico` and `azure`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicy(String networkPolicy) {
            return networkPolicy(Output.of(networkPolicy));
        }

        /**
         * @param outboundType The outbound (egress) routing method which should be used for this Kubernetes Cluster. Possible values are `loadBalancer`, `userDefinedRouting`, `managedNATGateway` and `userAssignedNATGateway`. Defaults to `loadBalancer`.
         * 
         * @return builder
         * 
         */
        public Builder outboundType(@Nullable Output<String> outboundType) {
            $.outboundType = outboundType;
            return this;
        }

        /**
         * @param outboundType The outbound (egress) routing method which should be used for this Kubernetes Cluster. Possible values are `loadBalancer`, `userDefinedRouting`, `managedNATGateway` and `userAssignedNATGateway`. Defaults to `loadBalancer`.
         * 
         * @return builder
         * 
         */
        public Builder outboundType(String outboundType) {
            return outboundType(Output.of(outboundType));
        }

        /**
         * @param podCidr The CIDR to use for pod IP addresses. This field can only be set when `network_plugin` is set to `kubenet`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder podCidr(@Nullable Output<String> podCidr) {
            $.podCidr = podCidr;
            return this;
        }

        /**
         * @param podCidr The CIDR to use for pod IP addresses. This field can only be set when `network_plugin` is set to `kubenet`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder podCidr(String podCidr) {
            return podCidr(Output.of(podCidr));
        }

        /**
         * @param serviceCidr The Network Range used by the Kubernetes service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serviceCidr(@Nullable Output<String> serviceCidr) {
            $.serviceCidr = serviceCidr;
            return this;
        }

        /**
         * @param serviceCidr The Network Range used by the Kubernetes service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serviceCidr(String serviceCidr) {
            return serviceCidr(Output.of(serviceCidr));
        }

        public KubernetesClusterNetworkProfileArgs build() {
            $.networkPlugin = Objects.requireNonNull($.networkPlugin, "expected parameter 'networkPlugin' to be non-null");
            return $;
        }
    }

}
