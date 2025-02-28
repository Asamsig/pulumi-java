// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddressState extends com.pulumi.resources.ResourceArgs {

    public static final AddressState Empty = new AddressState();

    /**
     * The static external IP address represented by this resource. Only
     * IPv4 is supported. An address may only be specified for INTERNAL
     * address types. The IP address must be inside the specified subnetwork,
     * if any. Set by the API if undefined.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The static external IP address represented by this resource. Only
     * IPv4 is supported. An address may only be specified for INTERNAL
     * address types. The IP address must be inside the specified subnetwork,
     * if any. Set by the API if undefined.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The type of address to reserve.
     * Default value is `EXTERNAL`.
     * Possible values are `INTERNAL` and `EXTERNAL`.
     * 
     */
    @Import(name="addressType")
    private @Nullable Output<String> addressType;

    /**
     * @return The type of address to reserve.
     * Default value is `EXTERNAL`.
     * Possible values are `INTERNAL` and `EXTERNAL`.
     * 
     */
    public Optional<Output<String>> addressType() {
        return Optional.ofNullable(this.addressType);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
    private @Nullable Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @Import(name="labelFingerprint")
    private @Nullable Output<String> labelFingerprint;

    /**
     * @return The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    public Optional<Output<String>> labelFingerprint() {
        return Optional.ofNullable(this.labelFingerprint);
    }

    /**
     * Labels to apply to this address.  A list of key-&gt;value pairs.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this address.  A list of key-&gt;value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL of the network in which to reserve the address. This field
     * can only be used with INTERNAL type with the VPC_PEERING and
     * IPSEC_INTERCONNECT purposes.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The URL of the network in which to reserve the address. This field
     * can only be used with INTERNAL type with the VPC_PEERING and
     * IPSEC_INTERCONNECT purposes.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The networking tier used for configuring this address. If this field is not
     * specified, it is assumed to be PREMIUM.
     * Possible values are `PREMIUM` and `STANDARD`.
     * 
     */
    @Import(name="networkTier")
    private @Nullable Output<String> networkTier;

    /**
     * @return The networking tier used for configuring this address. If this field is not
     * specified, it is assumed to be PREMIUM.
     * Possible values are `PREMIUM` and `STANDARD`.
     * 
     */
    public Optional<Output<String>> networkTier() {
        return Optional.ofNullable(this.networkTier);
    }

    /**
     * The prefix length if the resource represents an IP range.
     * 
     */
    @Import(name="prefixLength")
    private @Nullable Output<Integer> prefixLength;

    /**
     * @return The prefix length if the resource represents an IP range.
     * 
     */
    public Optional<Output<Integer>> prefixLength() {
        return Optional.ofNullable(this.prefixLength);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The purpose of this resource, which can be one of the following values:
     * * GCE_ENDPOINT for addresses that are used by VM instances, alias IP
     *   ranges, internal load balancers, and similar resources.
     * * SHARED_LOADBALANCER_VIP for an address that can be used by multiple
     *   internal load balancers.
     * * VPC_PEERING for addresses that are reserved for VPC peer networks.
     * * IPSEC_INTERCONNECT for addresses created from a private IP range
     *   that are reserved for a VLAN attachment in an IPsec-encrypted Cloud
     *   Interconnect configuration. These addresses are regional resources.
     * * PRIVATE_SERVICE_CONNECT for a private network address that is used
     *   to configure Private Service Connect. Only global internal addresses
     *   can use this purpose.
     *   This should only be set when using an Internal address.
     * 
     */
    @Import(name="purpose")
    private @Nullable Output<String> purpose;

    /**
     * @return The purpose of this resource, which can be one of the following values:
     * * GCE_ENDPOINT for addresses that are used by VM instances, alias IP
     *   ranges, internal load balancers, and similar resources.
     * * SHARED_LOADBALANCER_VIP for an address that can be used by multiple
     *   internal load balancers.
     * * VPC_PEERING for addresses that are reserved for VPC peer networks.
     * * IPSEC_INTERCONNECT for addresses created from a private IP range
     *   that are reserved for a VLAN attachment in an IPsec-encrypted Cloud
     *   Interconnect configuration. These addresses are regional resources.
     * * PRIVATE_SERVICE_CONNECT for a private network address that is used
     *   to configure Private Service Connect. Only global internal addresses
     *   can use this purpose.
     *   This should only be set when using an Internal address.
     * 
     */
    public Optional<Output<String>> purpose() {
        return Optional.ofNullable(this.purpose);
    }

    /**
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The URL of the subnetwork in which to reserve the address. If an IP
     * address is specified, it must be within the subnetwork&#39;s IP range.
     * This field can only be used with INTERNAL type with
     * GCE_ENDPOINT/DNS_RESOLVER purposes.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return The URL of the subnetwork in which to reserve the address. If an IP
     * address is specified, it must be within the subnetwork&#39;s IP range.
     * This field can only be used with INTERNAL type with
     * GCE_ENDPOINT/DNS_RESOLVER purposes.
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * The URLs of the resources that are using this address.
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<String>> users;

    /**
     * @return The URLs of the resources that are using this address.
     * 
     */
    public Optional<Output<List<String>>> users() {
        return Optional.ofNullable(this.users);
    }

    private AddressState() {}

    private AddressState(AddressState $) {
        this.address = $.address;
        this.addressType = $.addressType;
        this.creationTimestamp = $.creationTimestamp;
        this.description = $.description;
        this.labelFingerprint = $.labelFingerprint;
        this.labels = $.labels;
        this.name = $.name;
        this.network = $.network;
        this.networkTier = $.networkTier;
        this.prefixLength = $.prefixLength;
        this.project = $.project;
        this.purpose = $.purpose;
        this.region = $.region;
        this.selfLink = $.selfLink;
        this.subnetwork = $.subnetwork;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddressState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressState $;

        public Builder() {
            $ = new AddressState();
        }

        public Builder(AddressState defaults) {
            $ = new AddressState(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The static external IP address represented by this resource. Only
         * IPv4 is supported. An address may only be specified for INTERNAL
         * address types. The IP address must be inside the specified subnetwork,
         * if any. Set by the API if undefined.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The static external IP address represented by this resource. Only
         * IPv4 is supported. An address may only be specified for INTERNAL
         * address types. The IP address must be inside the specified subnetwork,
         * if any. Set by the API if undefined.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param addressType The type of address to reserve.
         * Default value is `EXTERNAL`.
         * Possible values are `INTERNAL` and `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder addressType(@Nullable Output<String> addressType) {
            $.addressType = addressType;
            return this;
        }

        /**
         * @param addressType The type of address to reserve.
         * Default value is `EXTERNAL`.
         * Possible values are `INTERNAL` and `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder addressType(String addressType) {
            return addressType(Output.of(addressType));
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(String creationTimestamp) {
            return creationTimestamp(Output.of(creationTimestamp));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labelFingerprint The fingerprint used for optimistic locking of this resource. Used internally during updates.
         * 
         * @return builder
         * 
         */
        public Builder labelFingerprint(@Nullable Output<String> labelFingerprint) {
            $.labelFingerprint = labelFingerprint;
            return this;
        }

        /**
         * @param labelFingerprint The fingerprint used for optimistic locking of this resource. Used internally during updates.
         * 
         * @return builder
         * 
         */
        public Builder labelFingerprint(String labelFingerprint) {
            return labelFingerprint(Output.of(labelFingerprint));
        }

        /**
         * @param labels Labels to apply to this address.  A list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to apply to this address.  A list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the resource. The name must be 1-63 characters long, and
         * comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?`
         * which means the first character must be a lowercase letter, and all
         * following characters must be a dash, lowercase letter, or digit,
         * except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. The name must be 1-63 characters long, and
         * comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?`
         * which means the first character must be a lowercase letter, and all
         * following characters must be a dash, lowercase letter, or digit,
         * except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The URL of the network in which to reserve the address. This field
         * can only be used with INTERNAL type with the VPC_PEERING and
         * IPSEC_INTERCONNECT purposes.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The URL of the network in which to reserve the address. This field
         * can only be used with INTERNAL type with the VPC_PEERING and
         * IPSEC_INTERCONNECT purposes.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param networkTier The networking tier used for configuring this address. If this field is not
         * specified, it is assumed to be PREMIUM.
         * Possible values are `PREMIUM` and `STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder networkTier(@Nullable Output<String> networkTier) {
            $.networkTier = networkTier;
            return this;
        }

        /**
         * @param networkTier The networking tier used for configuring this address. If this field is not
         * specified, it is assumed to be PREMIUM.
         * Possible values are `PREMIUM` and `STANDARD`.
         * 
         * @return builder
         * 
         */
        public Builder networkTier(String networkTier) {
            return networkTier(Output.of(networkTier));
        }

        /**
         * @param prefixLength The prefix length if the resource represents an IP range.
         * 
         * @return builder
         * 
         */
        public Builder prefixLength(@Nullable Output<Integer> prefixLength) {
            $.prefixLength = prefixLength;
            return this;
        }

        /**
         * @param prefixLength The prefix length if the resource represents an IP range.
         * 
         * @return builder
         * 
         */
        public Builder prefixLength(Integer prefixLength) {
            return prefixLength(Output.of(prefixLength));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param purpose The purpose of this resource, which can be one of the following values:
         * * GCE_ENDPOINT for addresses that are used by VM instances, alias IP
         *   ranges, internal load balancers, and similar resources.
         * * SHARED_LOADBALANCER_VIP for an address that can be used by multiple
         *   internal load balancers.
         * * VPC_PEERING for addresses that are reserved for VPC peer networks.
         * * IPSEC_INTERCONNECT for addresses created from a private IP range
         *   that are reserved for a VLAN attachment in an IPsec-encrypted Cloud
         *   Interconnect configuration. These addresses are regional resources.
         * * PRIVATE_SERVICE_CONNECT for a private network address that is used
         *   to configure Private Service Connect. Only global internal addresses
         *   can use this purpose.
         *   This should only be set when using an Internal address.
         * 
         * @return builder
         * 
         */
        public Builder purpose(@Nullable Output<String> purpose) {
            $.purpose = purpose;
            return this;
        }

        /**
         * @param purpose The purpose of this resource, which can be one of the following values:
         * * GCE_ENDPOINT for addresses that are used by VM instances, alias IP
         *   ranges, internal load balancers, and similar resources.
         * * SHARED_LOADBALANCER_VIP for an address that can be used by multiple
         *   internal load balancers.
         * * VPC_PEERING for addresses that are reserved for VPC peer networks.
         * * IPSEC_INTERCONNECT for addresses created from a private IP range
         *   that are reserved for a VLAN attachment in an IPsec-encrypted Cloud
         *   Interconnect configuration. These addresses are regional resources.
         * * PRIVATE_SERVICE_CONNECT for a private network address that is used
         *   to configure Private Service Connect. Only global internal addresses
         *   can use this purpose.
         *   This should only be set when using an Internal address.
         * 
         * @return builder
         * 
         */
        public Builder purpose(String purpose) {
            return purpose(Output.of(purpose));
        }

        /**
         * @param region The Region in which the created address should reside.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The Region in which the created address should reside.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param subnetwork The URL of the subnetwork in which to reserve the address. If an IP
         * address is specified, it must be within the subnetwork&#39;s IP range.
         * This field can only be used with INTERNAL type with
         * GCE_ENDPOINT/DNS_RESOLVER purposes.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork The URL of the subnetwork in which to reserve the address. If an IP
         * address is specified, it must be within the subnetwork&#39;s IP range.
         * This field can only be used with INTERNAL type with
         * GCE_ENDPOINT/DNS_RESOLVER purposes.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param users The URLs of the resources that are using this address.
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<String>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users The URLs of the resources that are using this address.
         * 
         * @return builder
         * 
         */
        public Builder users(List<String> users) {
            return users(Output.of(users));
        }

        /**
         * @param users The URLs of the resources that are using this address.
         * 
         * @return builder
         * 
         */
        public Builder users(String... users) {
            return users(List.of(users));
        }

        public AddressState build() {
            return $;
        }
    }

}
