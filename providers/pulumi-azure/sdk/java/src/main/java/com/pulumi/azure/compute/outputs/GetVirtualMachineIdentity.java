// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualMachineIdentity {
    /**
     * @return The list of User Managed Identity ID&#39;s which are assigned to the Virtual Machine.
     * 
     */
    private final List<String> identityIds;
    /**
     * @return The ID of the System Managed Service Principal assigned to the Virtual Machine.
     * 
     */
    private final String principalId;
    /**
     * @return The ID of the Tenant of the System Managed Service Principal assigned to the Virtual Machine.
     * 
     */
    private final String tenantId;
    /**
     * @return The identity type of the Managed Identity assigned to the Virtual Machine.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetVirtualMachineIdentity(
        @CustomType.Parameter("identityIds") List<String> identityIds,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.identityIds = identityIds;
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return The list of User Managed Identity ID&#39;s which are assigned to the Virtual Machine.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds;
    }
    /**
     * @return The ID of the System Managed Service Principal assigned to the Virtual Machine.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The ID of the Tenant of the System Managed Service Principal assigned to the Virtual Machine.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The identity type of the Managed Identity assigned to the Virtual Machine.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> identityIds;
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder identityIds(List<String> identityIds) {
            this.identityIds = Objects.requireNonNull(identityIds);
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetVirtualMachineIdentity build() {
            return new GetVirtualMachineIdentity(identityIds, principalId, tenantId, type);
        }
    }
}
