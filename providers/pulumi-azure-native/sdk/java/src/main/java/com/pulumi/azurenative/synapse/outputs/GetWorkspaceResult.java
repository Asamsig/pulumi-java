// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.DataLakeStorageAccountDetailsResponse;
import com.pulumi.azurenative.synapse.outputs.EncryptionDetailsResponse;
import com.pulumi.azurenative.synapse.outputs.ManagedIdentityResponse;
import com.pulumi.azurenative.synapse.outputs.ManagedVirtualNetworkSettingsResponse;
import com.pulumi.azurenative.synapse.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.synapse.outputs.PurviewConfigurationResponse;
import com.pulumi.azurenative.synapse.outputs.VirtualNetworkProfileResponse;
import com.pulumi.azurenative.synapse.outputs.WorkspaceRepositoryConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkspaceResult {
    /**
     * @return The ADLA resource ID.
     * 
     */
    private final String adlaResourceId;
    /**
     * @return Connectivity endpoints
     * 
     */
    private final @Nullable Map<String,String> connectivityEndpoints;
    /**
     * @return Workspace default data lake storage account details
     * 
     */
    private final @Nullable DataLakeStorageAccountDetailsResponse defaultDataLakeStorage;
    /**
     * @return The encryption details of the workspace
     * 
     */
    private final @Nullable EncryptionDetailsResponse encryption;
    /**
     * @return Workspace level configs and feature flags
     * 
     */
    private final Map<String,Object> extraProperties;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return Identity of the workspace
     * 
     */
    private final @Nullable ManagedIdentityResponse identity;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return Workspace managed resource group. The resource group name uniquely identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90 characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and &#39;-&#39;, &#39;_&#39;, &#39;(&#39;, &#39;)&#39; and&#39;.&#39;. Note that the name cannot end with &#39;.&#39;
     * 
     */
    private final @Nullable String managedResourceGroupName;
    /**
     * @return Setting this to &#39;default&#39; will ensure that all compute for this workspace is in a virtual network managed on behalf of the user.
     * 
     */
    private final @Nullable String managedVirtualNetwork;
    /**
     * @return Managed Virtual Network Settings
     * 
     */
    private final @Nullable ManagedVirtualNetworkSettingsResponse managedVirtualNetworkSettings;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Private endpoint connections to the workspace
     * 
     */
    private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * @return Resource provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * @return Enable or Disable public network access to workspace
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * @return Purview Configuration
     * 
     */
    private final @Nullable PurviewConfigurationResponse purviewConfiguration;
    /**
     * @return Login for workspace SQL active directory administrator
     * 
     */
    private final @Nullable String sqlAdministratorLogin;
    /**
     * @return SQL administrator login password
     * 
     */
    private final @Nullable String sqlAdministratorLoginPassword;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return Virtual Network profile
     * 
     */
    private final @Nullable VirtualNetworkProfileResponse virtualNetworkProfile;
    /**
     * @return Git integration settings
     * 
     */
    private final @Nullable WorkspaceRepositoryConfigurationResponse workspaceRepositoryConfiguration;
    /**
     * @return The workspace unique identifier
     * 
     */
    private final String workspaceUID;

    @CustomType.Constructor
    private GetWorkspaceResult(
        @CustomType.Parameter("adlaResourceId") String adlaResourceId,
        @CustomType.Parameter("connectivityEndpoints") @Nullable Map<String,String> connectivityEndpoints,
        @CustomType.Parameter("defaultDataLakeStorage") @Nullable DataLakeStorageAccountDetailsResponse defaultDataLakeStorage,
        @CustomType.Parameter("encryption") @Nullable EncryptionDetailsResponse encryption,
        @CustomType.Parameter("extraProperties") Map<String,Object> extraProperties,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ManagedIdentityResponse identity,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("managedResourceGroupName") @Nullable String managedResourceGroupName,
        @CustomType.Parameter("managedVirtualNetwork") @Nullable String managedVirtualNetwork,
        @CustomType.Parameter("managedVirtualNetworkSettings") @Nullable ManagedVirtualNetworkSettingsResponse managedVirtualNetworkSettings,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpointConnections") @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @CustomType.Parameter("purviewConfiguration") @Nullable PurviewConfigurationResponse purviewConfiguration,
        @CustomType.Parameter("sqlAdministratorLogin") @Nullable String sqlAdministratorLogin,
        @CustomType.Parameter("sqlAdministratorLoginPassword") @Nullable String sqlAdministratorLoginPassword,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualNetworkProfile") @Nullable VirtualNetworkProfileResponse virtualNetworkProfile,
        @CustomType.Parameter("workspaceRepositoryConfiguration") @Nullable WorkspaceRepositoryConfigurationResponse workspaceRepositoryConfiguration,
        @CustomType.Parameter("workspaceUID") String workspaceUID) {
        this.adlaResourceId = adlaResourceId;
        this.connectivityEndpoints = connectivityEndpoints;
        this.defaultDataLakeStorage = defaultDataLakeStorage;
        this.encryption = encryption;
        this.extraProperties = extraProperties;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.managedResourceGroupName = managedResourceGroupName;
        this.managedVirtualNetwork = managedVirtualNetwork;
        this.managedVirtualNetworkSettings = managedVirtualNetworkSettings;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.purviewConfiguration = purviewConfiguration;
        this.sqlAdministratorLogin = sqlAdministratorLogin;
        this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
        this.tags = tags;
        this.type = type;
        this.virtualNetworkProfile = virtualNetworkProfile;
        this.workspaceRepositoryConfiguration = workspaceRepositoryConfiguration;
        this.workspaceUID = workspaceUID;
    }

    /**
     * @return The ADLA resource ID.
     * 
     */
    public String adlaResourceId() {
        return this.adlaResourceId;
    }
    /**
     * @return Connectivity endpoints
     * 
     */
    public Map<String,String> connectivityEndpoints() {
        return this.connectivityEndpoints == null ? Map.of() : this.connectivityEndpoints;
    }
    /**
     * @return Workspace default data lake storage account details
     * 
     */
    public Optional<DataLakeStorageAccountDetailsResponse> defaultDataLakeStorage() {
        return Optional.ofNullable(this.defaultDataLakeStorage);
    }
    /**
     * @return The encryption details of the workspace
     * 
     */
    public Optional<EncryptionDetailsResponse> encryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * @return Workspace level configs and feature flags
     * 
     */
    public Map<String,Object> extraProperties() {
        return this.extraProperties;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identity of the workspace
     * 
     */
    public Optional<ManagedIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Workspace managed resource group. The resource group name uniquely identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90 characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and &#39;-&#39;, &#39;_&#39;, &#39;(&#39;, &#39;)&#39; and&#39;.&#39;. Note that the name cannot end with &#39;.&#39;
     * 
     */
    public Optional<String> managedResourceGroupName() {
        return Optional.ofNullable(this.managedResourceGroupName);
    }
    /**
     * @return Setting this to &#39;default&#39; will ensure that all compute for this workspace is in a virtual network managed on behalf of the user.
     * 
     */
    public Optional<String> managedVirtualNetwork() {
        return Optional.ofNullable(this.managedVirtualNetwork);
    }
    /**
     * @return Managed Virtual Network Settings
     * 
     */
    public Optional<ManagedVirtualNetworkSettingsResponse> managedVirtualNetworkSettings() {
        return Optional.ofNullable(this.managedVirtualNetworkSettings);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Private endpoint connections to the workspace
     * 
     */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }
    /**
     * @return Resource provisioning state
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Enable or Disable public network access to workspace
     * 
     */
    public Optional<String> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * @return Purview Configuration
     * 
     */
    public Optional<PurviewConfigurationResponse> purviewConfiguration() {
        return Optional.ofNullable(this.purviewConfiguration);
    }
    /**
     * @return Login for workspace SQL active directory administrator
     * 
     */
    public Optional<String> sqlAdministratorLogin() {
        return Optional.ofNullable(this.sqlAdministratorLogin);
    }
    /**
     * @return SQL administrator login password
     * 
     */
    public Optional<String> sqlAdministratorLoginPassword() {
        return Optional.ofNullable(this.sqlAdministratorLoginPassword);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Virtual Network profile
     * 
     */
    public Optional<VirtualNetworkProfileResponse> virtualNetworkProfile() {
        return Optional.ofNullable(this.virtualNetworkProfile);
    }
    /**
     * @return Git integration settings
     * 
     */
    public Optional<WorkspaceRepositoryConfigurationResponse> workspaceRepositoryConfiguration() {
        return Optional.ofNullable(this.workspaceRepositoryConfiguration);
    }
    /**
     * @return The workspace unique identifier
     * 
     */
    public String workspaceUID() {
        return this.workspaceUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adlaResourceId;
        private @Nullable Map<String,String> connectivityEndpoints;
        private @Nullable DataLakeStorageAccountDetailsResponse defaultDataLakeStorage;
        private @Nullable EncryptionDetailsResponse encryption;
        private Map<String,Object> extraProperties;
        private String id;
        private @Nullable ManagedIdentityResponse identity;
        private String location;
        private @Nullable String managedResourceGroupName;
        private @Nullable String managedVirtualNetwork;
        private @Nullable ManagedVirtualNetworkSettingsResponse managedVirtualNetworkSettings;
        private String name;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private @Nullable PurviewConfigurationResponse purviewConfiguration;
        private @Nullable String sqlAdministratorLogin;
        private @Nullable String sqlAdministratorLoginPassword;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable VirtualNetworkProfileResponse virtualNetworkProfile;
        private @Nullable WorkspaceRepositoryConfigurationResponse workspaceRepositoryConfiguration;
        private String workspaceUID;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adlaResourceId = defaults.adlaResourceId;
    	      this.connectivityEndpoints = defaults.connectivityEndpoints;
    	      this.defaultDataLakeStorage = defaults.defaultDataLakeStorage;
    	      this.encryption = defaults.encryption;
    	      this.extraProperties = defaults.extraProperties;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.managedResourceGroupName = defaults.managedResourceGroupName;
    	      this.managedVirtualNetwork = defaults.managedVirtualNetwork;
    	      this.managedVirtualNetworkSettings = defaults.managedVirtualNetworkSettings;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.purviewConfiguration = defaults.purviewConfiguration;
    	      this.sqlAdministratorLogin = defaults.sqlAdministratorLogin;
    	      this.sqlAdministratorLoginPassword = defaults.sqlAdministratorLoginPassword;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualNetworkProfile = defaults.virtualNetworkProfile;
    	      this.workspaceRepositoryConfiguration = defaults.workspaceRepositoryConfiguration;
    	      this.workspaceUID = defaults.workspaceUID;
        }

        public Builder adlaResourceId(String adlaResourceId) {
            this.adlaResourceId = Objects.requireNonNull(adlaResourceId);
            return this;
        }
        public Builder connectivityEndpoints(@Nullable Map<String,String> connectivityEndpoints) {
            this.connectivityEndpoints = connectivityEndpoints;
            return this;
        }
        public Builder defaultDataLakeStorage(@Nullable DataLakeStorageAccountDetailsResponse defaultDataLakeStorage) {
            this.defaultDataLakeStorage = defaultDataLakeStorage;
            return this;
        }
        public Builder encryption(@Nullable EncryptionDetailsResponse encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder extraProperties(Map<String,Object> extraProperties) {
            this.extraProperties = Objects.requireNonNull(extraProperties);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ManagedIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder managedResourceGroupName(@Nullable String managedResourceGroupName) {
            this.managedResourceGroupName = managedResourceGroupName;
            return this;
        }
        public Builder managedVirtualNetwork(@Nullable String managedVirtualNetwork) {
            this.managedVirtualNetwork = managedVirtualNetwork;
            return this;
        }
        public Builder managedVirtualNetworkSettings(@Nullable ManagedVirtualNetworkSettingsResponse managedVirtualNetworkSettings) {
            this.managedVirtualNetworkSettings = managedVirtualNetworkSettings;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder purviewConfiguration(@Nullable PurviewConfigurationResponse purviewConfiguration) {
            this.purviewConfiguration = purviewConfiguration;
            return this;
        }
        public Builder sqlAdministratorLogin(@Nullable String sqlAdministratorLogin) {
            this.sqlAdministratorLogin = sqlAdministratorLogin;
            return this;
        }
        public Builder sqlAdministratorLoginPassword(@Nullable String sqlAdministratorLoginPassword) {
            this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualNetworkProfile(@Nullable VirtualNetworkProfileResponse virtualNetworkProfile) {
            this.virtualNetworkProfile = virtualNetworkProfile;
            return this;
        }
        public Builder workspaceRepositoryConfiguration(@Nullable WorkspaceRepositoryConfigurationResponse workspaceRepositoryConfiguration) {
            this.workspaceRepositoryConfiguration = workspaceRepositoryConfiguration;
            return this;
        }
        public Builder workspaceUID(String workspaceUID) {
            this.workspaceUID = Objects.requireNonNull(workspaceUID);
            return this;
        }        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(adlaResourceId, connectivityEndpoints, defaultDataLakeStorage, encryption, extraProperties, id, identity, location, managedResourceGroupName, managedVirtualNetwork, managedVirtualNetworkSettings, name, privateEndpointConnections, provisioningState, publicNetworkAccess, purviewConfiguration, sqlAdministratorLogin, sqlAdministratorLoginPassword, tags, type, virtualNetworkProfile, workspaceRepositoryConfiguration, workspaceUID);
        }
    }
}
