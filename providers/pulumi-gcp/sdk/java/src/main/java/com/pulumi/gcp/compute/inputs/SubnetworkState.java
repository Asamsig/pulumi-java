// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.SubnetworkLogConfigArgs;
import com.pulumi.gcp.compute.inputs.SubnetworkSecondaryIpRangeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetworkState extends com.pulumi.resources.ResourceArgs {

    public static final SubnetworkState Empty = new SubnetworkState();

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
     * An optional description of this resource. Provide this property when
     * you create the resource. This field can be set only at resource
     * creation time.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource. This field can be set only at resource
     * creation time.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    @Import(name="externalIpv6Prefix")
    private @Nullable Output<String> externalIpv6Prefix;

    /**
     * @return The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    public Optional<Output<String>> externalIpv6Prefix() {
        return Optional.ofNullable(this.externalIpv6Prefix);
    }

    /**
     * Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     * @deprecated
     * This field is not useful for users, and has been removed as an output.
     * 
     */
    @Deprecated /* This field is not useful for users, and has been removed as an output. */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     * @deprecated
     * This field is not useful for users, and has been removed as an output.
     * 
     */
    @Deprecated /* This field is not useful for users, and has been removed as an output. */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    @Import(name="gatewayAddress")
    private @Nullable Output<String> gatewayAddress;

    /**
     * @return The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    public Optional<Output<String>> gatewayAddress() {
        return Optional.ofNullable(this.gatewayAddress);
    }

    /**
     * The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * 
     */
    @Import(name="ipCidrRange")
    private @Nullable Output<String> ipCidrRange;

    /**
     * @return The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * 
     */
    public Optional<Output<String>> ipCidrRange() {
        return Optional.ofNullable(this.ipCidrRange);
    }

    /**
     * The access type of IPv6 address this subnet holds. It&#39;s immutable and can only be specified during creation
     * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
     * cannot enable direct path.
     * Possible values are `EXTERNAL`.
     * 
     */
    @Import(name="ipv6AccessType")
    private @Nullable Output<String> ipv6AccessType;

    /**
     * @return The access type of IPv6 address this subnet holds. It&#39;s immutable and can only be specified during creation
     * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
     * cannot enable direct path.
     * Possible values are `EXTERNAL`.
     * 
     */
    public Optional<Output<String>> ipv6AccessType() {
        return Optional.ofNullable(this.ipv6AccessType);
    }

    /**
     * The range of internal IPv6 addresses that are owned by this subnetwork.
     * 
     */
    @Import(name="ipv6CidrRange")
    private @Nullable Output<String> ipv6CidrRange;

    /**
     * @return The range of internal IPv6 addresses that are owned by this subnetwork.
     * 
     */
    public Optional<Output<String>> ipv6CidrRange() {
        return Optional.ofNullable(this.ipv6CidrRange);
    }

    /**
     * Denotes the logging options for the subnetwork flow logs. If logging is enabled
     * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
     * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
     * Structure is documented below.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<SubnetworkLogConfigArgs> logConfig;

    /**
     * @return Denotes the logging options for the subnetwork flow logs. If logging is enabled
     * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
     * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
     * Structure is documented below.
     * 
     */
    public Optional<Output<SubnetworkLogConfigArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    /**
     * The name of the resource, provided by the client when initially
     * creating the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially
     * creating the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network this subnet belongs to.
     * Only networks that are in the distributed mode can have subnetworks.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The network this subnet belongs to.
     * Only networks that are in the distributed mode can have subnetworks.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * When enabled, VMs in this subnetwork without external IP addresses can
     * access Google APIs and services by using Private Google Access.
     * 
     */
    @Import(name="privateIpGoogleAccess")
    private @Nullable Output<Boolean> privateIpGoogleAccess;

    /**
     * @return When enabled, VMs in this subnetwork without external IP addresses can
     * access Google APIs and services by using Private Google Access.
     * 
     */
    public Optional<Output<Boolean>> privateIpGoogleAccess() {
        return Optional.ofNullable(this.privateIpGoogleAccess);
    }

    /**
     * The private IPv6 google access type for the VMs in this subnet.
     * 
     */
    @Import(name="privateIpv6GoogleAccess")
    private @Nullable Output<String> privateIpv6GoogleAccess;

    /**
     * @return The private IPv6 google access type for the VMs in this subnet.
     * 
     */
    public Optional<Output<String>> privateIpv6GoogleAccess() {
        return Optional.ofNullable(this.privateIpv6GoogleAccess);
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
     * The purpose of the resource. A subnetwork with purpose set to
     * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
     * reserved for Internal HTTP(S) Load Balancing.
     * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
     * 
     */
    @Import(name="purpose")
    private @Nullable Output<String> purpose;

    /**
     * @return The purpose of the resource. A subnetwork with purpose set to
     * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
     * reserved for Internal HTTP(S) Load Balancing.
     * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
     * 
     */
    public Optional<Output<String>> purpose() {
        return Optional.ofNullable(this.purpose);
    }

    /**
     * The GCP region for this subnetwork.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The GCP region for this subnetwork.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The role of subnetwork. Currently, this field is only used when
     * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
     * or BACKUP. An ACTIVE subnetwork is one that is currently being used
     * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
     * is ready to be promoted to ACTIVE or is currently draining.
     * Possible values are `ACTIVE` and `BACKUP`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role of subnetwork. Currently, this field is only used when
     * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
     * or BACKUP. An ACTIVE subnetwork is one that is currently being used
     * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
     * is ready to be promoted to ACTIVE or is currently draining.
     * Possible values are `ACTIVE` and `BACKUP`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * 
     */
    @Import(name="secondaryIpRanges")
    private @Nullable Output<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges;

    /**
     * @return An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<SubnetworkSecondaryIpRangeArgs>>> secondaryIpRanges() {
        return Optional.ofNullable(this.secondaryIpRanges);
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
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
     * If not specified IPV4_ONLY will be used.
     * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
     * 
     */
    @Import(name="stackType")
    private @Nullable Output<String> stackType;

    /**
     * @return The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
     * If not specified IPV4_ONLY will be used.
     * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
     * 
     */
    public Optional<Output<String>> stackType() {
        return Optional.ofNullable(this.stackType);
    }

    private SubnetworkState() {}

    private SubnetworkState(SubnetworkState $) {
        this.creationTimestamp = $.creationTimestamp;
        this.description = $.description;
        this.externalIpv6Prefix = $.externalIpv6Prefix;
        this.fingerprint = $.fingerprint;
        this.gatewayAddress = $.gatewayAddress;
        this.ipCidrRange = $.ipCidrRange;
        this.ipv6AccessType = $.ipv6AccessType;
        this.ipv6CidrRange = $.ipv6CidrRange;
        this.logConfig = $.logConfig;
        this.name = $.name;
        this.network = $.network;
        this.privateIpGoogleAccess = $.privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = $.privateIpv6GoogleAccess;
        this.project = $.project;
        this.purpose = $.purpose;
        this.region = $.region;
        this.role = $.role;
        this.secondaryIpRanges = $.secondaryIpRanges;
        this.selfLink = $.selfLink;
        this.stackType = $.stackType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetworkState $;

        public Builder() {
            $ = new SubnetworkState();
        }

        public Builder(SubnetworkState defaults) {
            $ = new SubnetworkState(Objects.requireNonNull(defaults));
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
         * @param description An optional description of this resource. Provide this property when
         * you create the resource. This field can be set only at resource
         * creation time.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when
         * you create the resource. This field can be set only at resource
         * creation time.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param externalIpv6Prefix The range of external IPv6 addresses that are owned by this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder externalIpv6Prefix(@Nullable Output<String> externalIpv6Prefix) {
            $.externalIpv6Prefix = externalIpv6Prefix;
            return this;
        }

        /**
         * @param externalIpv6Prefix The range of external IPv6 addresses that are owned by this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder externalIpv6Prefix(String externalIpv6Prefix) {
            return externalIpv6Prefix(Output.of(externalIpv6Prefix));
        }

        /**
         * @param fingerprint Fingerprint of this resource. This field is used internally during updates of this resource.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is not useful for users, and has been removed as an output.
         * 
         */
        @Deprecated /* This field is not useful for users, and has been removed as an output. */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint Fingerprint of this resource. This field is used internally during updates of this resource.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is not useful for users, and has been removed as an output.
         * 
         */
        @Deprecated /* This field is not useful for users, and has been removed as an output. */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param gatewayAddress The gateway address for default routes to reach destination addresses outside this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder gatewayAddress(@Nullable Output<String> gatewayAddress) {
            $.gatewayAddress = gatewayAddress;
            return this;
        }

        /**
         * @param gatewayAddress The gateway address for default routes to reach destination addresses outside this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder gatewayAddress(String gatewayAddress) {
            return gatewayAddress(Output.of(gatewayAddress));
        }

        /**
         * @param ipCidrRange The range of IP addresses belonging to this subnetwork secondary
         * range. Provide this property when you create the subnetwork.
         * Ranges must be unique and non-overlapping with all primary and
         * secondary IP ranges within a network. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        /**
         * @param ipCidrRange The range of IP addresses belonging to this subnetwork secondary
         * range. Provide this property when you create the subnetwork.
         * Ranges must be unique and non-overlapping with all primary and
         * secondary IP ranges within a network. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        /**
         * @param ipv6AccessType The access type of IPv6 address this subnet holds. It&#39;s immutable and can only be specified during creation
         * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
         * cannot enable direct path.
         * Possible values are `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessType(@Nullable Output<String> ipv6AccessType) {
            $.ipv6AccessType = ipv6AccessType;
            return this;
        }

        /**
         * @param ipv6AccessType The access type of IPv6 address this subnet holds. It&#39;s immutable and can only be specified during creation
         * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
         * cannot enable direct path.
         * Possible values are `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessType(String ipv6AccessType) {
            return ipv6AccessType(Output.of(ipv6AccessType));
        }

        /**
         * @param ipv6CidrRange The range of internal IPv6 addresses that are owned by this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrRange(@Nullable Output<String> ipv6CidrRange) {
            $.ipv6CidrRange = ipv6CidrRange;
            return this;
        }

        /**
         * @param ipv6CidrRange The range of internal IPv6 addresses that are owned by this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrRange(String ipv6CidrRange) {
            return ipv6CidrRange(Output.of(ipv6CidrRange));
        }

        /**
         * @param logConfig Denotes the logging options for the subnetwork flow logs. If logging is enabled
         * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
         * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(@Nullable Output<SubnetworkLogConfigArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        /**
         * @param logConfig Denotes the logging options for the subnetwork flow logs. If logging is enabled
         * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
         * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(SubnetworkLogConfigArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        /**
         * @param name The name of the resource, provided by the client when initially
         * creating the resource. The name must be 1-63 characters long, and
         * comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?` which
         * means the first character must be a lowercase letter, and all
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
         * @param name The name of the resource, provided by the client when initially
         * creating the resource. The name must be 1-63 characters long, and
         * comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?` which
         * means the first character must be a lowercase letter, and all
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
         * @param network The network this subnet belongs to.
         * Only networks that are in the distributed mode can have subnetworks.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The network this subnet belongs to.
         * Only networks that are in the distributed mode can have subnetworks.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param privateIpGoogleAccess When enabled, VMs in this subnetwork without external IP addresses can
         * access Google APIs and services by using Private Google Access.
         * 
         * @return builder
         * 
         */
        public Builder privateIpGoogleAccess(@Nullable Output<Boolean> privateIpGoogleAccess) {
            $.privateIpGoogleAccess = privateIpGoogleAccess;
            return this;
        }

        /**
         * @param privateIpGoogleAccess When enabled, VMs in this subnetwork without external IP addresses can
         * access Google APIs and services by using Private Google Access.
         * 
         * @return builder
         * 
         */
        public Builder privateIpGoogleAccess(Boolean privateIpGoogleAccess) {
            return privateIpGoogleAccess(Output.of(privateIpGoogleAccess));
        }

        /**
         * @param privateIpv6GoogleAccess The private IPv6 google access type for the VMs in this subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateIpv6GoogleAccess(@Nullable Output<String> privateIpv6GoogleAccess) {
            $.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        /**
         * @param privateIpv6GoogleAccess The private IPv6 google access type for the VMs in this subnet.
         * 
         * @return builder
         * 
         */
        public Builder privateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            return privateIpv6GoogleAccess(Output.of(privateIpv6GoogleAccess));
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
         * @param purpose The purpose of the resource. A subnetwork with purpose set to
         * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
         * reserved for Internal HTTP(S) Load Balancing.
         * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
         * 
         * @return builder
         * 
         */
        public Builder purpose(@Nullable Output<String> purpose) {
            $.purpose = purpose;
            return this;
        }

        /**
         * @param purpose The purpose of the resource. A subnetwork with purpose set to
         * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
         * reserved for Internal HTTP(S) Load Balancing.
         * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
         * 
         * @return builder
         * 
         */
        public Builder purpose(String purpose) {
            return purpose(Output.of(purpose));
        }

        /**
         * @param region The GCP region for this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The GCP region for this subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param role The role of subnetwork. Currently, this field is only used when
         * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
         * or BACKUP. An ACTIVE subnetwork is one that is currently being used
         * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
         * is ready to be promoted to ACTIVE or is currently draining.
         * Possible values are `ACTIVE` and `BACKUP`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role of subnetwork. Currently, this field is only used when
         * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
         * or BACKUP. An ACTIVE subnetwork is one that is currently being used
         * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
         * is ready to be promoted to ACTIVE or is currently draining.
         * Possible values are `ACTIVE` and `BACKUP`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param secondaryIpRanges An array of configurations for secondary IP ranges for VM instances
         * contained in this subnetwork. The primary IP of such VM must belong
         * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
         * to either primary or secondary ranges.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpRanges(@Nullable Output<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges) {
            $.secondaryIpRanges = secondaryIpRanges;
            return this;
        }

        /**
         * @param secondaryIpRanges An array of configurations for secondary IP ranges for VM instances
         * contained in this subnetwork. The primary IP of such VM must belong
         * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
         * to either primary or secondary ranges.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpRanges(List<SubnetworkSecondaryIpRangeArgs> secondaryIpRanges) {
            return secondaryIpRanges(Output.of(secondaryIpRanges));
        }

        /**
         * @param secondaryIpRanges An array of configurations for secondary IP ranges for VM instances
         * contained in this subnetwork. The primary IP of such VM must belong
         * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
         * to either primary or secondary ranges.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpRanges(SubnetworkSecondaryIpRangeArgs... secondaryIpRanges) {
            return secondaryIpRanges(List.of(secondaryIpRanges));
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
         * @param stackType The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
         * If not specified IPV4_ONLY will be used.
         * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
         * 
         * @return builder
         * 
         */
        public Builder stackType(@Nullable Output<String> stackType) {
            $.stackType = stackType;
            return this;
        }

        /**
         * @param stackType The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
         * If not specified IPV4_ONLY will be used.
         * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
         * 
         * @return builder
         * 
         */
        public Builder stackType(String stackType) {
            return stackType(Output.of(stackType));
        }

        public SubnetworkState build() {
            return $;
        }
    }

}
