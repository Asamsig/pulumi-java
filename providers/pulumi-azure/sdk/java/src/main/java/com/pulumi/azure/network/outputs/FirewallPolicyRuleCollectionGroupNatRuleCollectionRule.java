// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyRuleCollectionGroupNatRuleCollectionRule {
    /**
     * @return The destination IP address (including CIDR).
     * 
     */
    private final @Nullable String destinationAddress;
    /**
     * @return Specifies a list of destination ports.
     * 
     */
    private final @Nullable List<String> destinationPorts;
    /**
     * @return The name which should be used for this rule.
     * 
     */
    private final String name;
    /**
     * @return Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
     * 
     */
    private final List<String> protocols;
    /**
     * @return Specifies a list of source IP addresses (including CIDR and `*`).
     * 
     */
    private final @Nullable List<String> sourceAddresses;
    /**
     * @return Specifies a list of source IP groups.
     * 
     */
    private final @Nullable List<String> sourceIpGroups;
    /**
     * @return Specifies the translated address.
     * 
     */
    private final @Nullable String translatedAddress;
    /**
     * @return Specifies the translated FQDN.
     * 
     */
    private final @Nullable String translatedFqdn;
    /**
     * @return Specifies the translated port.
     * 
     */
    private final Integer translatedPort;

    @CustomType.Constructor
    private FirewallPolicyRuleCollectionGroupNatRuleCollectionRule(
        @CustomType.Parameter("destinationAddress") @Nullable String destinationAddress,
        @CustomType.Parameter("destinationPorts") @Nullable List<String> destinationPorts,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protocols") List<String> protocols,
        @CustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @CustomType.Parameter("sourceIpGroups") @Nullable List<String> sourceIpGroups,
        @CustomType.Parameter("translatedAddress") @Nullable String translatedAddress,
        @CustomType.Parameter("translatedFqdn") @Nullable String translatedFqdn,
        @CustomType.Parameter("translatedPort") Integer translatedPort) {
        this.destinationAddress = destinationAddress;
        this.destinationPorts = destinationPorts;
        this.name = name;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.translatedAddress = translatedAddress;
        this.translatedFqdn = translatedFqdn;
        this.translatedPort = translatedPort;
    }

    /**
     * @return The destination IP address (including CIDR).
     * 
     */
    public Optional<String> destinationAddress() {
        return Optional.ofNullable(this.destinationAddress);
    }
    /**
     * @return Specifies a list of destination ports.
     * 
     */
    public List<String> destinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    /**
     * @return The name which should be used for this rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
     * 
     */
    public List<String> protocols() {
        return this.protocols;
    }
    /**
     * @return Specifies a list of source IP addresses (including CIDR and `*`).
     * 
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    /**
     * @return Specifies a list of source IP groups.
     * 
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }
    /**
     * @return Specifies the translated address.
     * 
     */
    public Optional<String> translatedAddress() {
        return Optional.ofNullable(this.translatedAddress);
    }
    /**
     * @return Specifies the translated FQDN.
     * 
     */
    public Optional<String> translatedFqdn() {
        return Optional.ofNullable(this.translatedFqdn);
    }
    /**
     * @return Specifies the translated port.
     * 
     */
    public Integer translatedPort() {
        return this.translatedPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleCollectionGroupNatRuleCollectionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destinationAddress;
        private @Nullable List<String> destinationPorts;
        private String name;
        private List<String> protocols;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;
        private @Nullable String translatedAddress;
        private @Nullable String translatedFqdn;
        private Integer translatedPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleCollectionGroupNatRuleCollectionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAddress = defaults.destinationAddress;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.translatedAddress = defaults.translatedAddress;
    	      this.translatedFqdn = defaults.translatedFqdn;
    	      this.translatedPort = defaults.translatedPort;
        }

        public Builder destinationAddress(@Nullable String destinationAddress) {
            this.destinationAddress = destinationAddress;
            return this;
        }
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protocols(List<String> protocols) {
            this.protocols = Objects.requireNonNull(protocols);
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }
        public Builder translatedAddress(@Nullable String translatedAddress) {
            this.translatedAddress = translatedAddress;
            return this;
        }
        public Builder translatedFqdn(@Nullable String translatedFqdn) {
            this.translatedFqdn = translatedFqdn;
            return this;
        }
        public Builder translatedPort(Integer translatedPort) {
            this.translatedPort = Objects.requireNonNull(translatedPort);
            return this;
        }        public FirewallPolicyRuleCollectionGroupNatRuleCollectionRule build() {
            return new FirewallPolicyRuleCollectionGroupNatRuleCollectionRule(destinationAddress, destinationPorts, name, protocols, sourceAddresses, sourceIpGroups, translatedAddress, translatedFqdn, translatedPort);
        }
    }
}
