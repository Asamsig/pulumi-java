// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetFunctionAppSiteConfigScmIpRestrictionHeaders;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionAppSiteConfigScmIpRestriction {
    /**
     * @return Allow or Deny access for this IP range. Defaults to Allow.
     * 
     */
    private final String action;
    private final GetFunctionAppSiteConfigScmIpRestrictionHeaders headers;
    /**
     * @return The IP Address used for this IP Restriction in CIDR notation.
     * 
     */
    private final String ipAddress;
    /**
     * @return The name of the Function App resource.
     * 
     */
    private final String name;
    /**
     * @return The priority for this IP Restriction.
     * 
     */
    private final Integer priority;
    /**
     * @return The Service Tag used for this IP Restriction.
     * 
     */
    private final String serviceTag;
    /**
     * @return The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    private final String virtualNetworkSubnetId;

    @CustomType.Constructor
    private GetFunctionAppSiteConfigScmIpRestriction(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("headers") GetFunctionAppSiteConfigScmIpRestrictionHeaders headers,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("serviceTag") String serviceTag,
        @CustomType.Parameter("virtualNetworkSubnetId") String virtualNetworkSubnetId) {
        this.action = action;
        this.headers = headers;
        this.ipAddress = ipAddress;
        this.name = name;
        this.priority = priority;
        this.serviceTag = serviceTag;
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    /**
     * @return Allow or Deny access for this IP range. Defaults to Allow.
     * 
     */
    public String action() {
        return this.action;
    }
    public GetFunctionAppSiteConfigScmIpRestrictionHeaders headers() {
        return this.headers;
    }
    /**
     * @return The IP Address used for this IP Restriction in CIDR notation.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The name of the Function App resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The priority for this IP Restriction.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return The Service Tag used for this IP Restriction.
     * 
     */
    public String serviceTag() {
        return this.serviceTag;
    }
    /**
     * @return The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionAppSiteConfigScmIpRestriction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private GetFunctionAppSiteConfigScmIpRestrictionHeaders headers;
        private String ipAddress;
        private String name;
        private Integer priority;
        private String serviceTag;
        private String virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionAppSiteConfigScmIpRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.headers = defaults.headers;
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.serviceTag = defaults.serviceTag;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder headers(GetFunctionAppSiteConfigScmIpRestrictionHeaders headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder serviceTag(String serviceTag) {
            this.serviceTag = Objects.requireNonNull(serviceTag);
            return this;
        }
        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Objects.requireNonNull(virtualNetworkSubnetId);
            return this;
        }        public GetFunctionAppSiteConfigScmIpRestriction build() {
            return new GetFunctionAppSiteConfigScmIpRestriction(action, headers, ipAddress, name, priority, serviceTag, virtualNetworkSubnetId);
        }
    }
}
