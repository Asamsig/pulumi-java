// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.azurenative.network.outputs.VpnServerConfigurationPolicyGroupMemberResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConfigurationPolicyGroupResult {
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Shows if this is a Default VpnServerConfigurationPolicyGroup or not.
     * 
     */
    private final @Nullable Boolean isDefault;
    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * @return List of references to P2SConnectionConfigurations.
     * 
     */
    private final List<SubResourceResponse> p2SConnectionConfigurations;
    /**
     * @return Multiple PolicyMembers for VpnServerConfigurationPolicyGroup.
     * 
     */
    private final @Nullable List<VpnServerConfigurationPolicyGroupMemberResponse> policyMembers;
    /**
     * @return Priority for VpnServerConfigurationPolicyGroup.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * @return The provisioning state of the VpnServerConfigurationPolicyGroup resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetConfigurationPolicyGroupResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("isDefault") @Nullable Boolean isDefault,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("p2SConnectionConfigurations") List<SubResourceResponse> p2SConnectionConfigurations,
        @CustomType.Parameter("policyMembers") @Nullable List<VpnServerConfigurationPolicyGroupMemberResponse> policyMembers,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.isDefault = isDefault;
        this.name = name;
        this.p2SConnectionConfigurations = p2SConnectionConfigurations;
        this.policyMembers = policyMembers;
        this.priority = priority;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Shows if this is a Default VpnServerConfigurationPolicyGroup or not.
     * 
     */
    public Optional<Boolean> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }
    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return List of references to P2SConnectionConfigurations.
     * 
     */
    public List<SubResourceResponse> p2SConnectionConfigurations() {
        return this.p2SConnectionConfigurations;
    }
    /**
     * @return Multiple PolicyMembers for VpnServerConfigurationPolicyGroup.
     * 
     */
    public List<VpnServerConfigurationPolicyGroupMemberResponse> policyMembers() {
        return this.policyMembers == null ? List.of() : this.policyMembers;
    }
    /**
     * @return Priority for VpnServerConfigurationPolicyGroup.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The provisioning state of the VpnServerConfigurationPolicyGroup resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationPolicyGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable Boolean isDefault;
        private @Nullable String name;
        private List<SubResourceResponse> p2SConnectionConfigurations;
        private @Nullable List<VpnServerConfigurationPolicyGroupMemberResponse> policyMembers;
        private @Nullable Integer priority;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationPolicyGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.isDefault = defaults.isDefault;
    	      this.name = defaults.name;
    	      this.p2SConnectionConfigurations = defaults.p2SConnectionConfigurations;
    	      this.policyMembers = defaults.policyMembers;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder p2SConnectionConfigurations(List<SubResourceResponse> p2SConnectionConfigurations) {
            this.p2SConnectionConfigurations = Objects.requireNonNull(p2SConnectionConfigurations);
            return this;
        }
        public Builder p2SConnectionConfigurations(SubResourceResponse... p2SConnectionConfigurations) {
            return p2SConnectionConfigurations(List.of(p2SConnectionConfigurations));
        }
        public Builder policyMembers(@Nullable List<VpnServerConfigurationPolicyGroupMemberResponse> policyMembers) {
            this.policyMembers = policyMembers;
            return this;
        }
        public Builder policyMembers(VpnServerConfigurationPolicyGroupMemberResponse... policyMembers) {
            return policyMembers(List.of(policyMembers));
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetConfigurationPolicyGroupResult build() {
            return new GetConfigurationPolicyGroupResult(etag, id, isDefault, name, p2SConnectionConfigurations, policyMembers, priority, provisioningState, type);
        }
    }
}
