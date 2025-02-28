// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancingRuleResponse {
    /**
     * @return A reference to a pool of DIPs. Inbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    private final @Nullable SubResourceResponse backendAddressPool;
    /**
     * @return The port used for internal connections on the endpoint. Acceptable values are between 0 and 65535. Note that value 0 enables &#34;Any Port&#34;.
     * 
     */
    private final @Nullable Integer backendPort;
    /**
     * @return Configures SNAT for the VMs in the backend pool to use the publicIP address specified in the frontend of the load balancing rule.
     * 
     */
    private final @Nullable Boolean disableOutboundSnat;
    /**
     * @return Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
     * 
     */
    private final @Nullable Boolean enableFloatingIP;
    /**
     * @return Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    private final @Nullable Boolean enableTcpReset;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return A reference to frontend IP addresses.
     * 
     */
    private final @Nullable SubResourceResponse frontendIPConfiguration;
    /**
     * @return The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables &#34;Any Port&#34;.
     * 
     */
    private final Integer frontendPort;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    private final @Nullable Integer idleTimeoutInMinutes;
    /**
     * @return The load distribution policy for this rule.
     * 
     */
    private final @Nullable String loadDistribution;
    /**
     * @return The name of the resource that is unique within the set of load balancing rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The reference to the load balancer probe used by the load balancing rule.
     * 
     */
    private final @Nullable SubResourceResponse probe;
    /**
     * @return The reference to the transport protocol used by the load balancing rule.
     * 
     */
    private final String protocol;
    /**
     * @return The provisioning state of the load balancing rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private LoadBalancingRuleResponse(
        @CustomType.Parameter("backendAddressPool") @Nullable SubResourceResponse backendAddressPool,
        @CustomType.Parameter("backendPort") @Nullable Integer backendPort,
        @CustomType.Parameter("disableOutboundSnat") @Nullable Boolean disableOutboundSnat,
        @CustomType.Parameter("enableFloatingIP") @Nullable Boolean enableFloatingIP,
        @CustomType.Parameter("enableTcpReset") @Nullable Boolean enableTcpReset,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("frontendIPConfiguration") @Nullable SubResourceResponse frontendIPConfiguration,
        @CustomType.Parameter("frontendPort") Integer frontendPort,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("idleTimeoutInMinutes") @Nullable Integer idleTimeoutInMinutes,
        @CustomType.Parameter("loadDistribution") @Nullable String loadDistribution,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("probe") @Nullable SubResourceResponse probe,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.backendAddressPool = backendAddressPool;
        this.backendPort = backendPort;
        this.disableOutboundSnat = disableOutboundSnat;
        this.enableFloatingIP = enableFloatingIP;
        this.enableTcpReset = enableTcpReset;
        this.etag = etag;
        this.frontendIPConfiguration = frontendIPConfiguration;
        this.frontendPort = frontendPort;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.loadDistribution = loadDistribution;
        this.name = name;
        this.probe = probe;
        this.protocol = protocol;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return A reference to a pool of DIPs. Inbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    public Optional<SubResourceResponse> backendAddressPool() {
        return Optional.ofNullable(this.backendAddressPool);
    }
    /**
     * @return The port used for internal connections on the endpoint. Acceptable values are between 0 and 65535. Note that value 0 enables &#34;Any Port&#34;.
     * 
     */
    public Optional<Integer> backendPort() {
        return Optional.ofNullable(this.backendPort);
    }
    /**
     * @return Configures SNAT for the VMs in the backend pool to use the publicIP address specified in the frontend of the load balancing rule.
     * 
     */
    public Optional<Boolean> disableOutboundSnat() {
        return Optional.ofNullable(this.disableOutboundSnat);
    }
    /**
     * @return Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
     * 
     */
    public Optional<Boolean> enableFloatingIP() {
        return Optional.ofNullable(this.enableFloatingIP);
    }
    /**
     * @return Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    public Optional<Boolean> enableTcpReset() {
        return Optional.ofNullable(this.enableTcpReset);
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return A reference to frontend IP addresses.
     * 
     */
    public Optional<SubResourceResponse> frontendIPConfiguration() {
        return Optional.ofNullable(this.frontendIPConfiguration);
    }
    /**
     * @return The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables &#34;Any Port&#34;.
     * 
     */
    public Integer frontendPort() {
        return this.frontendPort;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * @return The load distribution policy for this rule.
     * 
     */
    public Optional<String> loadDistribution() {
        return Optional.ofNullable(this.loadDistribution);
    }
    /**
     * @return The name of the resource that is unique within the set of load balancing rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The reference to the load balancer probe used by the load balancing rule.
     * 
     */
    public Optional<SubResourceResponse> probe() {
        return Optional.ofNullable(this.probe);
    }
    /**
     * @return The reference to the transport protocol used by the load balancing rule.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The provisioning state of the load balancing rule resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse backendAddressPool;
        private @Nullable Integer backendPort;
        private @Nullable Boolean disableOutboundSnat;
        private @Nullable Boolean enableFloatingIP;
        private @Nullable Boolean enableTcpReset;
        private String etag;
        private @Nullable SubResourceResponse frontendIPConfiguration;
        private Integer frontendPort;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String loadDistribution;
        private @Nullable String name;
        private @Nullable SubResourceResponse probe;
        private String protocol;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendPort = defaults.backendPort;
    	      this.disableOutboundSnat = defaults.disableOutboundSnat;
    	      this.enableFloatingIP = defaults.enableFloatingIP;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.etag = defaults.etag;
    	      this.frontendIPConfiguration = defaults.frontendIPConfiguration;
    	      this.frontendPort = defaults.frontendPort;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.loadDistribution = defaults.loadDistribution;
    	      this.name = defaults.name;
    	      this.probe = defaults.probe;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder backendAddressPool(@Nullable SubResourceResponse backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }
        public Builder backendPort(@Nullable Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Builder disableOutboundSnat(@Nullable Boolean disableOutboundSnat) {
            this.disableOutboundSnat = disableOutboundSnat;
            return this;
        }
        public Builder enableFloatingIP(@Nullable Boolean enableFloatingIP) {
            this.enableFloatingIP = enableFloatingIP;
            return this;
        }
        public Builder enableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder frontendIPConfiguration(@Nullable SubResourceResponse frontendIPConfiguration) {
            this.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }
        public Builder frontendPort(Integer frontendPort) {
            this.frontendPort = Objects.requireNonNull(frontendPort);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        public Builder loadDistribution(@Nullable String loadDistribution) {
            this.loadDistribution = loadDistribution;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder probe(@Nullable SubResourceResponse probe) {
            this.probe = probe;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public LoadBalancingRuleResponse build() {
            return new LoadBalancingRuleResponse(backendAddressPool, backendPort, disableOutboundSnat, enableFloatingIP, enableTcpReset, etag, frontendIPConfiguration, frontendPort, id, idleTimeoutInMinutes, loadDistribution, name, probe, protocol, provisioningState, type);
        }
    }
}
