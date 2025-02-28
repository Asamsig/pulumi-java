// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.analysisservices.inputs;

import com.pulumi.azurenative.analysisservices.inputs.IPv4FirewallRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An array of firewall rules.
 * 
 */
public final class IPv4FirewallSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPv4FirewallSettingsArgs Empty = new IPv4FirewallSettingsArgs();

    /**
     * The indicator of enabling PBI service.
     * 
     */
    @Import(name="enablePowerBIService")
    private @Nullable Output<Boolean> enablePowerBIService;

    /**
     * @return The indicator of enabling PBI service.
     * 
     */
    public Optional<Output<Boolean>> enablePowerBIService() {
        return Optional.ofNullable(this.enablePowerBIService);
    }

    /**
     * An array of firewall rules.
     * 
     */
    @Import(name="firewallRules")
    private @Nullable Output<List<IPv4FirewallRuleArgs>> firewallRules;

    /**
     * @return An array of firewall rules.
     * 
     */
    public Optional<Output<List<IPv4FirewallRuleArgs>>> firewallRules() {
        return Optional.ofNullable(this.firewallRules);
    }

    private IPv4FirewallSettingsArgs() {}

    private IPv4FirewallSettingsArgs(IPv4FirewallSettingsArgs $) {
        this.enablePowerBIService = $.enablePowerBIService;
        this.firewallRules = $.firewallRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPv4FirewallSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPv4FirewallSettingsArgs $;

        public Builder() {
            $ = new IPv4FirewallSettingsArgs();
        }

        public Builder(IPv4FirewallSettingsArgs defaults) {
            $ = new IPv4FirewallSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enablePowerBIService The indicator of enabling PBI service.
         * 
         * @return builder
         * 
         */
        public Builder enablePowerBIService(@Nullable Output<Boolean> enablePowerBIService) {
            $.enablePowerBIService = enablePowerBIService;
            return this;
        }

        /**
         * @param enablePowerBIService The indicator of enabling PBI service.
         * 
         * @return builder
         * 
         */
        public Builder enablePowerBIService(Boolean enablePowerBIService) {
            return enablePowerBIService(Output.of(enablePowerBIService));
        }

        /**
         * @param firewallRules An array of firewall rules.
         * 
         * @return builder
         * 
         */
        public Builder firewallRules(@Nullable Output<List<IPv4FirewallRuleArgs>> firewallRules) {
            $.firewallRules = firewallRules;
            return this;
        }

        /**
         * @param firewallRules An array of firewall rules.
         * 
         * @return builder
         * 
         */
        public Builder firewallRules(List<IPv4FirewallRuleArgs> firewallRules) {
            return firewallRules(Output.of(firewallRules));
        }

        /**
         * @param firewallRules An array of firewall rules.
         * 
         * @return builder
         * 
         */
        public Builder firewallRules(IPv4FirewallRuleArgs... firewallRules) {
            return firewallRules(List.of(firewallRules));
        }

        public IPv4FirewallSettingsArgs build() {
            return $;
        }
    }

}
