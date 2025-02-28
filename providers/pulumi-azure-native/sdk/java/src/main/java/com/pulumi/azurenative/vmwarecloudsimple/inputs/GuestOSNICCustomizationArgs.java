// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Guest OS nic customization
 * 
 */
public final class GuestOSNICCustomizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestOSNICCustomizationArgs Empty = new GuestOSNICCustomizationArgs();

    /**
     * IP address allocation method
     * 
     */
    @Import(name="allocation")
    private @Nullable Output<String> allocation;

    /**
     * @return IP address allocation method
     * 
     */
    public Optional<Output<String>> allocation() {
        return Optional.ofNullable(this.allocation);
    }

    /**
     * List of dns servers to use
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    /**
     * @return List of dns servers to use
     * 
     */
    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * Gateway addresses assigned to nic
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<List<String>> gateway;

    /**
     * @return Gateway addresses assigned to nic
     * 
     */
    public Optional<Output<List<String>>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * Static ip address for nic
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return Static ip address for nic
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Network mask for nic
     * 
     */
    @Import(name="mask")
    private @Nullable Output<String> mask;

    /**
     * @return Network mask for nic
     * 
     */
    public Optional<Output<String>> mask() {
        return Optional.ofNullable(this.mask);
    }

    /**
     * primary WINS server for Windows
     * 
     */
    @Import(name="primaryWinsServer")
    private @Nullable Output<String> primaryWinsServer;

    /**
     * @return primary WINS server for Windows
     * 
     */
    public Optional<Output<String>> primaryWinsServer() {
        return Optional.ofNullable(this.primaryWinsServer);
    }

    /**
     * secondary WINS server for Windows
     * 
     */
    @Import(name="secondaryWinsServer")
    private @Nullable Output<String> secondaryWinsServer;

    /**
     * @return secondary WINS server for Windows
     * 
     */
    public Optional<Output<String>> secondaryWinsServer() {
        return Optional.ofNullable(this.secondaryWinsServer);
    }

    private GuestOSNICCustomizationArgs() {}

    private GuestOSNICCustomizationArgs(GuestOSNICCustomizationArgs $) {
        this.allocation = $.allocation;
        this.dnsServers = $.dnsServers;
        this.gateway = $.gateway;
        this.ipAddress = $.ipAddress;
        this.mask = $.mask;
        this.primaryWinsServer = $.primaryWinsServer;
        this.secondaryWinsServer = $.secondaryWinsServer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestOSNICCustomizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestOSNICCustomizationArgs $;

        public Builder() {
            $ = new GuestOSNICCustomizationArgs();
        }

        public Builder(GuestOSNICCustomizationArgs defaults) {
            $ = new GuestOSNICCustomizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocation IP address allocation method
         * 
         * @return builder
         * 
         */
        public Builder allocation(@Nullable Output<String> allocation) {
            $.allocation = allocation;
            return this;
        }

        /**
         * @param allocation IP address allocation method
         * 
         * @return builder
         * 
         */
        public Builder allocation(String allocation) {
            return allocation(Output.of(allocation));
        }

        /**
         * @param dnsServers List of dns servers to use
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        /**
         * @param dnsServers List of dns servers to use
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        /**
         * @param dnsServers List of dns servers to use
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        /**
         * @param gateway Gateway addresses assigned to nic
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<List<String>> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway Gateway addresses assigned to nic
         * 
         * @return builder
         * 
         */
        public Builder gateway(List<String> gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param gateway Gateway addresses assigned to nic
         * 
         * @return builder
         * 
         */
        public Builder gateway(String... gateway) {
            return gateway(List.of(gateway));
        }

        /**
         * @param ipAddress Static ip address for nic
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress Static ip address for nic
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param mask Network mask for nic
         * 
         * @return builder
         * 
         */
        public Builder mask(@Nullable Output<String> mask) {
            $.mask = mask;
            return this;
        }

        /**
         * @param mask Network mask for nic
         * 
         * @return builder
         * 
         */
        public Builder mask(String mask) {
            return mask(Output.of(mask));
        }

        /**
         * @param primaryWinsServer primary WINS server for Windows
         * 
         * @return builder
         * 
         */
        public Builder primaryWinsServer(@Nullable Output<String> primaryWinsServer) {
            $.primaryWinsServer = primaryWinsServer;
            return this;
        }

        /**
         * @param primaryWinsServer primary WINS server for Windows
         * 
         * @return builder
         * 
         */
        public Builder primaryWinsServer(String primaryWinsServer) {
            return primaryWinsServer(Output.of(primaryWinsServer));
        }

        /**
         * @param secondaryWinsServer secondary WINS server for Windows
         * 
         * @return builder
         * 
         */
        public Builder secondaryWinsServer(@Nullable Output<String> secondaryWinsServer) {
            $.secondaryWinsServer = secondaryWinsServer;
            return this;
        }

        /**
         * @param secondaryWinsServer secondary WINS server for Windows
         * 
         * @return builder
         * 
         */
        public Builder secondaryWinsServer(String secondaryWinsServer) {
            return secondaryWinsServer(Output.of(secondaryWinsServer));
        }

        public GuestOSNICCustomizationArgs build() {
            return $;
        }
    }

}
