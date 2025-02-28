// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetInstanceNetworkInterfaceAccessConfig;
import com.pulumi.gcp.compute.outputs.GetInstanceNetworkInterfaceAliasIpRange;
import com.pulumi.gcp.compute.outputs.GetInstanceNetworkInterfaceIpv6AccessConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceNetworkInterface {
    /**
     * @return Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Structure documented below.
     * 
     */
    private final List<GetInstanceNetworkInterfaceAccessConfig> accessConfigs;
    /**
     * @return An array of alias IP ranges for this network interface. Structure documented below.
     * 
     */
    private final List<GetInstanceNetworkInterfaceAliasIpRange> aliasIpRanges;
    private final List<GetInstanceNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs;
    private final String ipv6AccessType;
    /**
     * @return The name of the instance. One of `name` or `self_link` must be provided.
     * 
     */
    private final String name;
    /**
     * @return The name or self_link of the network attached to this interface.
     * 
     */
    private final String network;
    /**
     * @return The private IP address assigned to the instance.
     * 
     */
    private final String networkIp;
    private final String nicType;
    private final Integer queueCount;
    private final String stackType;
    /**
     * @return The name or self_link of the subnetwork attached to this interface.
     * 
     */
    private final String subnetwork;
    /**
     * @return The project in which the subnetwork belongs.
     * 
     */
    private final String subnetworkProject;

    @CustomType.Constructor
    private GetInstanceNetworkInterface(
        @CustomType.Parameter("accessConfigs") List<GetInstanceNetworkInterfaceAccessConfig> accessConfigs,
        @CustomType.Parameter("aliasIpRanges") List<GetInstanceNetworkInterfaceAliasIpRange> aliasIpRanges,
        @CustomType.Parameter("ipv6AccessConfigs") List<GetInstanceNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs,
        @CustomType.Parameter("ipv6AccessType") String ipv6AccessType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("networkIp") String networkIp,
        @CustomType.Parameter("nicType") String nicType,
        @CustomType.Parameter("queueCount") Integer queueCount,
        @CustomType.Parameter("stackType") String stackType,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("subnetworkProject") String subnetworkProject) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6AccessType = ipv6AccessType;
        this.name = name;
        this.network = network;
        this.networkIp = networkIp;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subnetwork = subnetwork;
        this.subnetworkProject = subnetworkProject;
    }

    /**
     * @return Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Structure documented below.
     * 
     */
    public List<GetInstanceNetworkInterfaceAccessConfig> accessConfigs() {
        return this.accessConfigs;
    }
    /**
     * @return An array of alias IP ranges for this network interface. Structure documented below.
     * 
     */
    public List<GetInstanceNetworkInterfaceAliasIpRange> aliasIpRanges() {
        return this.aliasIpRanges;
    }
    public List<GetInstanceNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs() {
        return this.ipv6AccessConfigs;
    }
    public String ipv6AccessType() {
        return this.ipv6AccessType;
    }
    /**
     * @return The name of the instance. One of `name` or `self_link` must be provided.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name or self_link of the network attached to this interface.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return The private IP address assigned to the instance.
     * 
     */
    public String networkIp() {
        return this.networkIp;
    }
    public String nicType() {
        return this.nicType;
    }
    public Integer queueCount() {
        return this.queueCount;
    }
    public String stackType() {
        return this.stackType;
    }
    /**
     * @return The name or self_link of the subnetwork attached to this interface.
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }
    /**
     * @return The project in which the subnetwork belongs.
     * 
     */
    public String subnetworkProject() {
        return this.subnetworkProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInstanceNetworkInterfaceAccessConfig> accessConfigs;
        private List<GetInstanceNetworkInterfaceAliasIpRange> aliasIpRanges;
        private List<GetInstanceNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs;
        private String ipv6AccessType;
        private String name;
        private String network;
        private String networkIp;
        private String nicType;
        private Integer queueCount;
        private String stackType;
        private String subnetwork;
        private String subnetworkProject;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIp = defaults.networkIp;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subnetwork = defaults.subnetwork;
    	      this.subnetworkProject = defaults.subnetworkProject;
        }

        public Builder accessConfigs(List<GetInstanceNetworkInterfaceAccessConfig> accessConfigs) {
            this.accessConfigs = Objects.requireNonNull(accessConfigs);
            return this;
        }
        public Builder accessConfigs(GetInstanceNetworkInterfaceAccessConfig... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }
        public Builder aliasIpRanges(List<GetInstanceNetworkInterfaceAliasIpRange> aliasIpRanges) {
            this.aliasIpRanges = Objects.requireNonNull(aliasIpRanges);
            return this;
        }
        public Builder aliasIpRanges(GetInstanceNetworkInterfaceAliasIpRange... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }
        public Builder ipv6AccessConfigs(List<GetInstanceNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Objects.requireNonNull(ipv6AccessConfigs);
            return this;
        }
        public Builder ipv6AccessConfigs(GetInstanceNetworkInterfaceIpv6AccessConfig... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }
        public Builder ipv6AccessType(String ipv6AccessType) {
            this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkIp(String networkIp) {
            this.networkIp = Objects.requireNonNull(networkIp);
            return this;
        }
        public Builder nicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }
        public Builder queueCount(Integer queueCount) {
            this.queueCount = Objects.requireNonNull(queueCount);
            return this;
        }
        public Builder stackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder subnetworkProject(String subnetworkProject) {
            this.subnetworkProject = Objects.requireNonNull(subnetworkProject);
            return this;
        }        public GetInstanceNetworkInterface build() {
            return new GetInstanceNetworkInterface(accessConfigs, aliasIpRanges, ipv6AccessConfigs, ipv6AccessType, name, network, networkIp, nicType, queueCount, stackType, subnetwork, subnetworkProject);
        }
    }
}
