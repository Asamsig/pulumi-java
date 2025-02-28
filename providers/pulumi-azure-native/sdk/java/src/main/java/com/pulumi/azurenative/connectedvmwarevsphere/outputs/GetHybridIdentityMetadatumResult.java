// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.outputs;

import com.pulumi.azurenative.connectedvmwarevsphere.outputs.IdentityResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHybridIdentityMetadatumResult {
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The identity of the resource.
     * 
     */
    private final IdentityResponse identity;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return Gets or sets the Public Key.
     * 
     */
    private final @Nullable String publicKey;
    /**
     * @return The system data.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return Gets or sets the Vm Id.
     * 
     */
    private final @Nullable String vmId;

    @CustomType.Constructor
    private GetHybridIdentityMetadatumResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") IdentityResponse identity,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicKey") @Nullable String publicKey,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vmId") @Nullable String vmId) {
        this.id = id;
        this.identity = identity;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publicKey = publicKey;
        this.systemData = systemData;
        this.type = type;
        this.vmId = vmId;
    }

    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity of the resource.
     * 
     */
    public IdentityResponse identity() {
        return this.identity;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Gets or sets the Public Key.
     * 
     */
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * @return The system data.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Gets or sets the Vm Id.
     * 
     */
    public Optional<String> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridIdentityMetadatumResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private IdentityResponse identity;
        private String name;
        private String provisioningState;
        private @Nullable String publicKey;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable String vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridIdentityMetadatumResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicKey = defaults.publicKey;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.vmId = defaults.vmId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(IdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder vmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }        public GetHybridIdentityMetadatumResult build() {
            return new GetHybridIdentityMetadatumResult(id, identity, name, provisioningState, publicKey, systemData, type, vmId);
        }
    }
}
