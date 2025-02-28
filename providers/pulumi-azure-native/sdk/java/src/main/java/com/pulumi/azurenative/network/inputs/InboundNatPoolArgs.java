// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.TransportProtocol;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inbound NAT pool of the load balancer.
 * 
 */
public final class InboundNatPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final InboundNatPoolArgs Empty = new InboundNatPoolArgs();

    /**
     * The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     * 
     */
    @Import(name="backendPort", required=true)
    private Output<Integer> backendPort;

    /**
     * @return The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     * 
     */
    public Output<Integer> backendPort() {
        return this.backendPort;
    }

    /**
     * Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
     * 
     */
    @Import(name="enableFloatingIP")
    private @Nullable Output<Boolean> enableFloatingIP;

    /**
     * @return Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
     * 
     */
    public Optional<Output<Boolean>> enableFloatingIP() {
        return Optional.ofNullable(this.enableFloatingIP);
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
    private @Nullable Output<Boolean> enableTcpReset;

    /**
     * @return Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    public Optional<Output<Boolean>> enableTcpReset() {
        return Optional.ofNullable(this.enableTcpReset);
    }

    /**
     * A reference to frontend IP addresses.
     * 
     */
    @Import(name="frontendIPConfiguration")
    private @Nullable Output<SubResourceArgs> frontendIPConfiguration;

    /**
     * @return A reference to frontend IP addresses.
     * 
     */
    public Optional<Output<SubResourceArgs>> frontendIPConfiguration() {
        return Optional.ofNullable(this.frontendIPConfiguration);
    }

    /**
     * The last port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     * 
     */
    @Import(name="frontendPortRangeEnd", required=true)
    private Output<Integer> frontendPortRangeEnd;

    /**
     * @return The last port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     * 
     */
    public Output<Integer> frontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * The first port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     * 
     */
    @Import(name="frontendPortRangeStart", required=true)
    private Output<Integer> frontendPortRangeStart;

    /**
     * @return The first port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     * 
     */
    public Output<Integer> frontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    /**
     * @return The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The name of the resource that is unique within the set of inbound NAT pools used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within the set of inbound NAT pools used by the load balancer. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The reference to the transport protocol used by the inbound NAT pool.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<Either<String,TransportProtocol>> protocol;

    /**
     * @return The reference to the transport protocol used by the inbound NAT pool.
     * 
     */
    public Output<Either<String,TransportProtocol>> protocol() {
        return this.protocol;
    }

    private InboundNatPoolArgs() {}

    private InboundNatPoolArgs(InboundNatPoolArgs $) {
        this.backendPort = $.backendPort;
        this.enableFloatingIP = $.enableFloatingIP;
        this.enableTcpReset = $.enableTcpReset;
        this.frontendIPConfiguration = $.frontendIPConfiguration;
        this.frontendPortRangeEnd = $.frontendPortRangeEnd;
        this.frontendPortRangeStart = $.frontendPortRangeStart;
        this.id = $.id;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.name = $.name;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InboundNatPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InboundNatPoolArgs $;

        public Builder() {
            $ = new InboundNatPoolArgs();
        }

        public Builder(InboundNatPoolArgs defaults) {
            $ = new InboundNatPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendPort The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Output<Integer> backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        /**
         * @param backendPort The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Integer backendPort) {
            return backendPort(Output.of(backendPort));
        }

        /**
         * @param enableFloatingIP Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder enableFloatingIP(@Nullable Output<Boolean> enableFloatingIP) {
            $.enableFloatingIP = enableFloatingIP;
            return this;
        }

        /**
         * @param enableFloatingIP Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder enableFloatingIP(Boolean enableFloatingIP) {
            return enableFloatingIP(Output.of(enableFloatingIP));
        }

        /**
         * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder enableTcpReset(@Nullable Output<Boolean> enableTcpReset) {
            $.enableTcpReset = enableTcpReset;
            return this;
        }

        /**
         * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder enableTcpReset(Boolean enableTcpReset) {
            return enableTcpReset(Output.of(enableTcpReset));
        }

        /**
         * @param frontendIPConfiguration A reference to frontend IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder frontendIPConfiguration(@Nullable Output<SubResourceArgs> frontendIPConfiguration) {
            $.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }

        /**
         * @param frontendIPConfiguration A reference to frontend IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder frontendIPConfiguration(SubResourceArgs frontendIPConfiguration) {
            return frontendIPConfiguration(Output.of(frontendIPConfiguration));
        }

        /**
         * @param frontendPortRangeEnd The last port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortRangeEnd(Output<Integer> frontendPortRangeEnd) {
            $.frontendPortRangeEnd = frontendPortRangeEnd;
            return this;
        }

        /**
         * @param frontendPortRangeEnd The last port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortRangeEnd(Integer frontendPortRangeEnd) {
            return frontendPortRangeEnd(Output.of(frontendPortRangeEnd));
        }

        /**
         * @param frontendPortRangeStart The first port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortRangeStart(Output<Integer> frontendPortRangeStart) {
            $.frontendPortRangeStart = frontendPortRangeStart;
            return this;
        }

        /**
         * @param frontendPortRangeStart The first port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortRangeStart(Integer frontendPortRangeStart) {
            return frontendPortRangeStart(Output.of(frontendPortRangeStart));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param idleTimeoutInMinutes The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        /**
         * @param idleTimeoutInMinutes The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        /**
         * @param name The name of the resource that is unique within the set of inbound NAT pools used by the load balancer. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within the set of inbound NAT pools used by the load balancer. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocol The reference to the transport protocol used by the inbound NAT pool.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<Either<String,TransportProtocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The reference to the transport protocol used by the inbound NAT pool.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Either<String,TransportProtocol> protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param protocol The reference to the transport protocol used by the inbound NAT pool.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        /**
         * @param protocol The reference to the transport protocol used by the inbound NAT pool.
         * 
         * @return builder
         * 
         */
        public Builder protocol(TransportProtocol protocol) {
            return protocol(Either.ofRight(protocol));
        }

        public InboundNatPoolArgs build() {
            $.backendPort = Objects.requireNonNull($.backendPort, "expected parameter 'backendPort' to be non-null");
            $.frontendPortRangeEnd = Objects.requireNonNull($.frontendPortRangeEnd, "expected parameter 'frontendPortRangeEnd' to be non-null");
            $.frontendPortRangeStart = Objects.requireNonNull($.frontendPortRangeStart, "expected parameter 'frontendPortRangeStart' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
