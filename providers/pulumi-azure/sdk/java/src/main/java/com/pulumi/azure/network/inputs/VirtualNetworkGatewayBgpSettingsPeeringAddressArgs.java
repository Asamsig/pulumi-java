// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayBgpSettingsPeeringAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayBgpSettingsPeeringAddressArgs Empty = new VirtualNetworkGatewayBgpSettingsPeeringAddressArgs();

    /**
     * A list of Azure custom APIPA addresses assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    @Import(name="apipaAddresses")
    private @Nullable Output<List<String>> apipaAddresses;

    /**
     * @return A list of Azure custom APIPA addresses assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    public Optional<Output<List<String>>> apipaAddresses() {
        return Optional.ofNullable(this.apipaAddresses);
    }

    /**
     * A list of peering address assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    @Import(name="defaultAddresses")
    private @Nullable Output<List<String>> defaultAddresses;

    /**
     * @return A list of peering address assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    public Optional<Output<List<String>>> defaultAddresses() {
        return Optional.ofNullable(this.defaultAddresses);
    }

    /**
     * The name of the IP configuration of this Virtual Network Gateway. In case there are multiple `ip_configuration` blocks defined, this property is **required** to specify.
     * 
     */
    @Import(name="ipConfigurationName")
    private @Nullable Output<String> ipConfigurationName;

    /**
     * @return The name of the IP configuration of this Virtual Network Gateway. In case there are multiple `ip_configuration` blocks defined, this property is **required** to specify.
     * 
     */
    public Optional<Output<String>> ipConfigurationName() {
        return Optional.ofNullable(this.ipConfigurationName);
    }

    /**
     * A list of tunnel IP addresses assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    @Import(name="tunnelIpAddresses")
    private @Nullable Output<List<String>> tunnelIpAddresses;

    /**
     * @return A list of tunnel IP addresses assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    public Optional<Output<List<String>>> tunnelIpAddresses() {
        return Optional.ofNullable(this.tunnelIpAddresses);
    }

    private VirtualNetworkGatewayBgpSettingsPeeringAddressArgs() {}

    private VirtualNetworkGatewayBgpSettingsPeeringAddressArgs(VirtualNetworkGatewayBgpSettingsPeeringAddressArgs $) {
        this.apipaAddresses = $.apipaAddresses;
        this.defaultAddresses = $.defaultAddresses;
        this.ipConfigurationName = $.ipConfigurationName;
        this.tunnelIpAddresses = $.tunnelIpAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayBgpSettingsPeeringAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayBgpSettingsPeeringAddressArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayBgpSettingsPeeringAddressArgs();
        }

        public Builder(VirtualNetworkGatewayBgpSettingsPeeringAddressArgs defaults) {
            $ = new VirtualNetworkGatewayBgpSettingsPeeringAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apipaAddresses A list of Azure custom APIPA addresses assigned to the BGP peer of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder apipaAddresses(@Nullable Output<List<String>> apipaAddresses) {
            $.apipaAddresses = apipaAddresses;
            return this;
        }

        /**
         * @param apipaAddresses A list of Azure custom APIPA addresses assigned to the BGP peer of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder apipaAddresses(List<String> apipaAddresses) {
            return apipaAddresses(Output.of(apipaAddresses));
        }

        /**
         * @param apipaAddresses A list of Azure custom APIPA addresses assigned to the BGP peer of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder apipaAddresses(String... apipaAddresses) {
            return apipaAddresses(List.of(apipaAddresses));
        }

        /**
         * @param defaultAddresses A list of peering address assigned to the BGP peer of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder defaultAddresses(@Nullable Output<List<String>> defaultAddresses) {
            $.defaultAddresses = defaultAddresses;
            return this;
        }

        /**
         * @param defaultAddresses A list of peering address assigned to the BGP peer of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder defaultAddresses(List<String> defaultAddresses) {
            return defaultAddresses(Output.of(defaultAddresses));
        }

        /**
         * @param defaultAddresses A list of peering address assigned to the BGP peer of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder defaultAddresses(String... defaultAddresses) {
            return defaultAddresses(List.of(defaultAddresses));
        }

        /**
         * @param ipConfigurationName The name of the IP configuration of this Virtual Network Gateway. In case there are multiple `ip_configuration` blocks defined, this property is **required** to specify.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationName(@Nullable Output<String> ipConfigurationName) {
            $.ipConfigurationName = ipConfigurationName;
            return this;
        }

        /**
         * @param ipConfigurationName The name of the IP configuration of this Virtual Network Gateway. In case there are multiple `ip_configuration` blocks defined, this property is **required** to specify.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationName(String ipConfigurationName) {
            return ipConfigurationName(Output.of(ipConfigurationName));
        }

        /**
         * @param tunnelIpAddresses A list of tunnel IP addresses assigned to the BGP peer of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIpAddresses(@Nullable Output<List<String>> tunnelIpAddresses) {
            $.tunnelIpAddresses = tunnelIpAddresses;
            return this;
        }

        /**
         * @param tunnelIpAddresses A list of tunnel IP addresses assigned to the BGP peer of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIpAddresses(List<String> tunnelIpAddresses) {
            return tunnelIpAddresses(Output.of(tunnelIpAddresses));
        }

        /**
         * @param tunnelIpAddresses A list of tunnel IP addresses assigned to the BGP peer of the Virtual Network Gateway.
         * 
         * @return builder
         * 
         */
        public Builder tunnelIpAddresses(String... tunnelIpAddresses) {
            return tunnelIpAddresses(List.of(tunnelIpAddresses));
        }

        public VirtualNetworkGatewayBgpSettingsPeeringAddressArgs build() {
            return $;
        }
    }

}
