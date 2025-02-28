// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks.inputs;

import com.pulumi.awsnative.eks.enums.ClusterKubernetesNetworkConfigIpFamily;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Kubernetes network configuration for the cluster.
 * 
 */
public final class ClusterKubernetesNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterKubernetesNetworkConfigArgs Empty = new ClusterKubernetesNetworkConfigArgs();

    /**
     * Ipv4 or Ipv6. You can only specify ipv6 for 1.21 and later clusters that use version 1.10.1 or later of the Amazon VPC CNI add-on
     * 
     */
    @Import(name="ipFamily")
    private @Nullable Output<ClusterKubernetesNetworkConfigIpFamily> ipFamily;

    /**
     * @return Ipv4 or Ipv6. You can only specify ipv6 for 1.21 and later clusters that use version 1.10.1 or later of the Amazon VPC CNI add-on
     * 
     */
    public Optional<Output<ClusterKubernetesNetworkConfigIpFamily>> ipFamily() {
        return Optional.ofNullable(this.ipFamily);
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from. If you don&#39;t specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC.
     * 
     */
    @Import(name="serviceIpv4Cidr")
    private @Nullable Output<String> serviceIpv4Cidr;

    /**
     * @return The CIDR block to assign Kubernetes service IP addresses from. If you don&#39;t specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC.
     * 
     */
    public Optional<Output<String>> serviceIpv4Cidr() {
        return Optional.ofNullable(this.serviceIpv4Cidr);
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     * 
     */
    @Import(name="serviceIpv6Cidr")
    private @Nullable Output<String> serviceIpv6Cidr;

    /**
     * @return The CIDR block to assign Kubernetes service IP addresses from.
     * 
     */
    public Optional<Output<String>> serviceIpv6Cidr() {
        return Optional.ofNullable(this.serviceIpv6Cidr);
    }

    private ClusterKubernetesNetworkConfigArgs() {}

    private ClusterKubernetesNetworkConfigArgs(ClusterKubernetesNetworkConfigArgs $) {
        this.ipFamily = $.ipFamily;
        this.serviceIpv4Cidr = $.serviceIpv4Cidr;
        this.serviceIpv6Cidr = $.serviceIpv6Cidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterKubernetesNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterKubernetesNetworkConfigArgs $;

        public Builder() {
            $ = new ClusterKubernetesNetworkConfigArgs();
        }

        public Builder(ClusterKubernetesNetworkConfigArgs defaults) {
            $ = new ClusterKubernetesNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipFamily Ipv4 or Ipv6. You can only specify ipv6 for 1.21 and later clusters that use version 1.10.1 or later of the Amazon VPC CNI add-on
         * 
         * @return builder
         * 
         */
        public Builder ipFamily(@Nullable Output<ClusterKubernetesNetworkConfigIpFamily> ipFamily) {
            $.ipFamily = ipFamily;
            return this;
        }

        /**
         * @param ipFamily Ipv4 or Ipv6. You can only specify ipv6 for 1.21 and later clusters that use version 1.10.1 or later of the Amazon VPC CNI add-on
         * 
         * @return builder
         * 
         */
        public Builder ipFamily(ClusterKubernetesNetworkConfigIpFamily ipFamily) {
            return ipFamily(Output.of(ipFamily));
        }

        /**
         * @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from. If you don&#39;t specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC.
         * 
         * @return builder
         * 
         */
        public Builder serviceIpv4Cidr(@Nullable Output<String> serviceIpv4Cidr) {
            $.serviceIpv4Cidr = serviceIpv4Cidr;
            return this;
        }

        /**
         * @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from. If you don&#39;t specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC.
         * 
         * @return builder
         * 
         */
        public Builder serviceIpv4Cidr(String serviceIpv4Cidr) {
            return serviceIpv4Cidr(Output.of(serviceIpv4Cidr));
        }

        /**
         * @param serviceIpv6Cidr The CIDR block to assign Kubernetes service IP addresses from.
         * 
         * @return builder
         * 
         */
        public Builder serviceIpv6Cidr(@Nullable Output<String> serviceIpv6Cidr) {
            $.serviceIpv6Cidr = serviceIpv6Cidr;
            return this;
        }

        /**
         * @param serviceIpv6Cidr The CIDR block to assign Kubernetes service IP addresses from.
         * 
         * @return builder
         * 
         */
        public Builder serviceIpv6Cidr(String serviceIpv6Cidr) {
            return serviceIpv6Cidr(Output.of(serviceIpv6Cidr));
        }

        public ClusterKubernetesNetworkConfigArgs build() {
            return $;
        }
    }

}
