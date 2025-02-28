// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyVaultNetworkAclsArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyVaultNetworkAclsArgs Empty = new KeyVaultNetworkAclsArgs();

    /**
     * Specifies which traffic can bypass the network rules. Possible values are `AzureServices` and `None`.
     * 
     */
    @Import(name="bypass", required=true)
    private Output<String> bypass;

    /**
     * @return Specifies which traffic can bypass the network rules. Possible values are `AzureServices` and `None`.
     * 
     */
    public Output<String> bypass() {
        return this.bypass;
    }

    /**
     * The Default Action to use when no rules match from `ip_rules` / `virtual_network_subnet_ids`. Possible values are `Allow` and `Deny`.
     * 
     */
    @Import(name="defaultAction", required=true)
    private Output<String> defaultAction;

    /**
     * @return The Default Action to use when no rules match from `ip_rules` / `virtual_network_subnet_ids`. Possible values are `Allow` and `Deny`.
     * 
     */
    public Output<String> defaultAction() {
        return this.defaultAction;
    }

    /**
     * One or more IP Addresses, or CIDR Blocks which should be able to access the Key Vault.
     * 
     */
    @Import(name="ipRules")
    private @Nullable Output<List<String>> ipRules;

    /**
     * @return One or more IP Addresses, or CIDR Blocks which should be able to access the Key Vault.
     * 
     */
    public Optional<Output<List<String>>> ipRules() {
        return Optional.ofNullable(this.ipRules);
    }

    /**
     * One or more Subnet ID&#39;s which should be able to access this Key Vault.
     * 
     */
    @Import(name="virtualNetworkSubnetIds")
    private @Nullable Output<List<String>> virtualNetworkSubnetIds;

    /**
     * @return One or more Subnet ID&#39;s which should be able to access this Key Vault.
     * 
     */
    public Optional<Output<List<String>>> virtualNetworkSubnetIds() {
        return Optional.ofNullable(this.virtualNetworkSubnetIds);
    }

    private KeyVaultNetworkAclsArgs() {}

    private KeyVaultNetworkAclsArgs(KeyVaultNetworkAclsArgs $) {
        this.bypass = $.bypass;
        this.defaultAction = $.defaultAction;
        this.ipRules = $.ipRules;
        this.virtualNetworkSubnetIds = $.virtualNetworkSubnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultNetworkAclsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultNetworkAclsArgs $;

        public Builder() {
            $ = new KeyVaultNetworkAclsArgs();
        }

        public Builder(KeyVaultNetworkAclsArgs defaults) {
            $ = new KeyVaultNetworkAclsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bypass Specifies which traffic can bypass the network rules. Possible values are `AzureServices` and `None`.
         * 
         * @return builder
         * 
         */
        public Builder bypass(Output<String> bypass) {
            $.bypass = bypass;
            return this;
        }

        /**
         * @param bypass Specifies which traffic can bypass the network rules. Possible values are `AzureServices` and `None`.
         * 
         * @return builder
         * 
         */
        public Builder bypass(String bypass) {
            return bypass(Output.of(bypass));
        }

        /**
         * @param defaultAction The Default Action to use when no rules match from `ip_rules` / `virtual_network_subnet_ids`. Possible values are `Allow` and `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(Output<String> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        /**
         * @param defaultAction The Default Action to use when no rules match from `ip_rules` / `virtual_network_subnet_ids`. Possible values are `Allow` and `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(String defaultAction) {
            return defaultAction(Output.of(defaultAction));
        }

        /**
         * @param ipRules One or more IP Addresses, or CIDR Blocks which should be able to access the Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(@Nullable Output<List<String>> ipRules) {
            $.ipRules = ipRules;
            return this;
        }

        /**
         * @param ipRules One or more IP Addresses, or CIDR Blocks which should be able to access the Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(List<String> ipRules) {
            return ipRules(Output.of(ipRules));
        }

        /**
         * @param ipRules One or more IP Addresses, or CIDR Blocks which should be able to access the Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(String... ipRules) {
            return ipRules(List.of(ipRules));
        }

        /**
         * @param virtualNetworkSubnetIds One or more Subnet ID&#39;s which should be able to access this Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetIds(@Nullable Output<List<String>> virtualNetworkSubnetIds) {
            $.virtualNetworkSubnetIds = virtualNetworkSubnetIds;
            return this;
        }

        /**
         * @param virtualNetworkSubnetIds One or more Subnet ID&#39;s which should be able to access this Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetIds(List<String> virtualNetworkSubnetIds) {
            return virtualNetworkSubnetIds(Output.of(virtualNetworkSubnetIds));
        }

        /**
         * @param virtualNetworkSubnetIds One or more Subnet ID&#39;s which should be able to access this Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetIds(String... virtualNetworkSubnetIds) {
            return virtualNetworkSubnetIds(List.of(virtualNetworkSubnetIds));
        }

        public KeyVaultNetworkAclsArgs build() {
            $.bypass = Objects.requireNonNull($.bypass, "expected parameter 'bypass' to be non-null");
            $.defaultAction = Objects.requireNonNull($.defaultAction, "expected parameter 'defaultAction' to be non-null");
            return $;
        }
    }

}
