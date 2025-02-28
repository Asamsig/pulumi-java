// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.AzureFirewallNetworkRuleProtocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a NAT rule.
 * 
 */
public final class AzureFirewallNatRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFirewallNatRuleArgs Empty = new AzureFirewallNatRuleArgs();

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable Output<List<String>> destinationAddresses;

    /**
     * @return List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
     * 
     */
    public Optional<Output<List<String>>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * List of destination ports.
     * 
     */
    @Import(name="destinationPorts")
    private @Nullable Output<List<String>> destinationPorts;

    /**
     * @return List of destination ports.
     * 
     */
    public Optional<Output<List<String>>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    /**
     * Name of the NAT rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the NAT rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<Either<String,AzureFirewallNetworkRuleProtocol>>> protocols;

    /**
     * @return Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     * 
     */
    public Optional<Output<List<Either<String,AzureFirewallNetworkRuleProtocol>>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable Output<List<String>> sourceAddresses;

    /**
     * @return List of source IP addresses for this rule.
     * 
     */
    public Optional<Output<List<String>>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
    private @Nullable Output<List<String>> sourceIpGroups;

    /**
     * @return List of source IpGroups for this rule.
     * 
     */
    public Optional<Output<List<String>>> sourceIpGroups() {
        return Optional.ofNullable(this.sourceIpGroups);
    }

    /**
     * The translated address for this NAT rule.
     * 
     */
    @Import(name="translatedAddress")
    private @Nullable Output<String> translatedAddress;

    /**
     * @return The translated address for this NAT rule.
     * 
     */
    public Optional<Output<String>> translatedAddress() {
        return Optional.ofNullable(this.translatedAddress);
    }

    /**
     * The translated FQDN for this NAT rule.
     * 
     */
    @Import(name="translatedFqdn")
    private @Nullable Output<String> translatedFqdn;

    /**
     * @return The translated FQDN for this NAT rule.
     * 
     */
    public Optional<Output<String>> translatedFqdn() {
        return Optional.ofNullable(this.translatedFqdn);
    }

    /**
     * The translated port for this NAT rule.
     * 
     */
    @Import(name="translatedPort")
    private @Nullable Output<String> translatedPort;

    /**
     * @return The translated port for this NAT rule.
     * 
     */
    public Optional<Output<String>> translatedPort() {
        return Optional.ofNullable(this.translatedPort);
    }

    private AzureFirewallNatRuleArgs() {}

    private AzureFirewallNatRuleArgs(AzureFirewallNatRuleArgs $) {
        this.description = $.description;
        this.destinationAddresses = $.destinationAddresses;
        this.destinationPorts = $.destinationPorts;
        this.name = $.name;
        this.protocols = $.protocols;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
        this.translatedAddress = $.translatedAddress;
        this.translatedFqdn = $.translatedFqdn;
        this.translatedPort = $.translatedPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallNatRuleArgs $;

        public Builder() {
            $ = new AzureFirewallNatRuleArgs();
        }

        public Builder(AzureFirewallNatRuleArgs defaults) {
            $ = new AzureFirewallNatRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationAddresses List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        /**
         * @param destinationAddresses List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(List<String> destinationAddresses) {
            return destinationAddresses(Output.of(destinationAddresses));
        }

        /**
         * @param destinationAddresses List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }

        /**
         * @param destinationPorts List of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(@Nullable Output<List<String>> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        /**
         * @param destinationPorts List of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(List<String> destinationPorts) {
            return destinationPorts(Output.of(destinationPorts));
        }

        /**
         * @param destinationPorts List of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }

        /**
         * @param name Name of the NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocols Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable Output<List<Either<String,AzureFirewallNetworkRuleProtocol>>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<Either<String,AzureFirewallNetworkRuleProtocol>> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder protocols(Either<String,AzureFirewallNetworkRuleProtocol>... protocols) {
            return protocols(List.of(protocols));
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(List<String> sourceAddresses) {
            return sourceAddresses(Output.of(sourceAddresses));
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }

        /**
         * @param sourceIpGroups List of source IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            $.sourceIpGroups = sourceIpGroups;
            return this;
        }

        /**
         * @param sourceIpGroups List of source IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(List<String> sourceIpGroups) {
            return sourceIpGroups(Output.of(sourceIpGroups));
        }

        /**
         * @param sourceIpGroups List of source IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }

        /**
         * @param translatedAddress The translated address for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedAddress(@Nullable Output<String> translatedAddress) {
            $.translatedAddress = translatedAddress;
            return this;
        }

        /**
         * @param translatedAddress The translated address for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedAddress(String translatedAddress) {
            return translatedAddress(Output.of(translatedAddress));
        }

        /**
         * @param translatedFqdn The translated FQDN for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedFqdn(@Nullable Output<String> translatedFqdn) {
            $.translatedFqdn = translatedFqdn;
            return this;
        }

        /**
         * @param translatedFqdn The translated FQDN for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedFqdn(String translatedFqdn) {
            return translatedFqdn(Output.of(translatedFqdn));
        }

        /**
         * @param translatedPort The translated port for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedPort(@Nullable Output<String> translatedPort) {
            $.translatedPort = translatedPort;
            return this;
        }

        /**
         * @param translatedPort The translated port for this NAT rule.
         * 
         * @return builder
         * 
         */
        public Builder translatedPort(String translatedPort) {
            return translatedPort(Output.of(translatedPort));
        }

        public AzureFirewallNatRuleArgs build() {
            return $;
        }
    }

}
