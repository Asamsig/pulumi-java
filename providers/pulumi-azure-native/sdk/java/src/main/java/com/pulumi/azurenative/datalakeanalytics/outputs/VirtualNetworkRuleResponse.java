// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNetworkRuleResponse {
    /**
     * @return The resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The resource name.
     * 
     */
    private final String name;
    /**
     * @return The resource identifier for the subnet
     * 
     */
    private final String subnetId;
    /**
     * @return The resource type.
     * 
     */
    private final String type;
    /**
     * @return The current state of the VirtualNetwork Rule
     * 
     */
    private final String virtualNetworkRuleState;

    @CustomType.Constructor
    private VirtualNetworkRuleResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualNetworkRuleState") String virtualNetworkRuleState) {
        this.id = id;
        this.name = name;
        this.subnetId = subnetId;
        this.type = type;
        this.virtualNetworkRuleState = virtualNetworkRuleState;
    }

    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource identifier for the subnet
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The current state of the VirtualNetwork Rule
     * 
     */
    public String virtualNetworkRuleState() {
        return this.virtualNetworkRuleState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String subnetId;
        private String type;
        private String virtualNetworkRuleState;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.subnetId = defaults.subnetId;
    	      this.type = defaults.type;
    	      this.virtualNetworkRuleState = defaults.virtualNetworkRuleState;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualNetworkRuleState(String virtualNetworkRuleState) {
            this.virtualNetworkRuleState = Objects.requireNonNull(virtualNetworkRuleState);
            return this;
        }        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(id, name, subnetId, type, virtualNetworkRuleState);
        }
    }
}
