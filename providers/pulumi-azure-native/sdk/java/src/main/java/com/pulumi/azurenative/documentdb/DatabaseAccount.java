// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.documentdb.DatabaseAccountArgs;
import com.pulumi.azurenative.documentdb.outputs.ApiPropertiesResponse;
import com.pulumi.azurenative.documentdb.outputs.CapabilityResponse;
import com.pulumi.azurenative.documentdb.outputs.ConsistencyPolicyResponse;
import com.pulumi.azurenative.documentdb.outputs.ContinuousModeBackupPolicyResponse;
import com.pulumi.azurenative.documentdb.outputs.CorsPolicyResponse;
import com.pulumi.azurenative.documentdb.outputs.FailoverPolicyResponse;
import com.pulumi.azurenative.documentdb.outputs.IpAddressOrRangeResponse;
import com.pulumi.azurenative.documentdb.outputs.LocationResponse;
import com.pulumi.azurenative.documentdb.outputs.ManagedServiceIdentityResponse;
import com.pulumi.azurenative.documentdb.outputs.PeriodicModeBackupPolicyResponse;
import com.pulumi.azurenative.documentdb.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.documentdb.outputs.VirtualNetworkRuleResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB database account.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * ### CosmosDBDatabaseAccountCreateMax
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var databaseAccount = new DatabaseAccount(&#34;databaseAccount&#34;, DatabaseAccountArgs.builder()        
 *             .accountName(&#34;ddb1&#34;)
 *             .apiProperties(Map.of(&#34;serverVersion&#34;, &#34;3.2&#34;))
 *             .backupPolicy(Map.ofEntries(
 *                 Map.entry(&#34;periodicModeProperties&#34;, Map.ofEntries(
 *                     Map.entry(&#34;backupIntervalInMinutes&#34;, 240),
 *                     Map.entry(&#34;backupRetentionIntervalInHours&#34;, 8)
 *                 )),
 *                 Map.entry(&#34;type&#34;, &#34;Periodic&#34;)
 *             ))
 *             .consistencyPolicy(Map.ofEntries(
 *                 Map.entry(&#34;defaultConsistencyLevel&#34;, &#34;BoundedStaleness&#34;),
 *                 Map.entry(&#34;maxIntervalInSeconds&#34;, 10),
 *                 Map.entry(&#34;maxStalenessPrefix&#34;, 200)
 *             ))
 *             .cors(Map.of(&#34;allowedOrigins&#34;, &#34;https://test&#34;))
 *             .databaseAccountOfferType(&#34;Standard&#34;)
 *             .defaultIdentity(&#34;FirstPartyIdentity&#34;)
 *             .enableAnalyticalStorage(true)
 *             .enableFreeTier(false)
 *             .identity(Map.ofEntries(
 *                 Map.entry(&#34;type&#34;, &#34;SystemAssigned,UserAssigned&#34;),
 *                 Map.entry(&#34;userAssignedIdentities&#34;, Map.of(&#34;/subscriptions/fa5fc227-a624-475e-b696-cdd604c735bc/resourceGroups/eu2cgroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1&#34;, ))
 *             ))
 *             .ipRules(            
 *                 Map.of(&#34;ipAddressOrRange&#34;, &#34;23.43.230.120&#34;),
 *                 Map.of(&#34;ipAddressOrRange&#34;, &#34;110.12.240.0/12&#34;))
 *             .isVirtualNetworkFilterEnabled(true)
 *             .keyVaultKeyUri(&#34;https://myKeyVault.vault.azure.net&#34;)
 *             .kind(&#34;MongoDB&#34;)
 *             .location(&#34;westus&#34;)
 *             .locations(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;failoverPriority&#34;, 0),
 *                     Map.entry(&#34;isZoneRedundant&#34;, false),
 *                     Map.entry(&#34;locationName&#34;, &#34;southcentralus&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;failoverPriority&#34;, 1),
 *                     Map.entry(&#34;isZoneRedundant&#34;, false),
 *                     Map.entry(&#34;locationName&#34;, &#34;eastus&#34;)
 *                 ))
 *             .networkAclBypass(&#34;AzureServices&#34;)
 *             .networkAclBypassResourceIds(&#34;/subscriptions/subId/resourcegroups/rgName/providers/Microsoft.Synapse/workspaces/workspaceName&#34;)
 *             .publicNetworkAccess(&#34;Enabled&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .tags()
 *             .virtualNetworkRules(Map.ofEntries(
 *                 Map.entry(&#34;id&#34;, &#34;/subscriptions/subId/resourceGroups/rg/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/subnet1&#34;),
 *                 Map.entry(&#34;ignoreMissingVNetServiceEndpoint&#34;, false)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### CosmosDBDatabaseAccountCreateMin
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var databaseAccount = new DatabaseAccount(&#34;databaseAccount&#34;, DatabaseAccountArgs.builder()        
 *             .accountName(&#34;ddb1&#34;)
 *             .databaseAccountOfferType(&#34;Standard&#34;)
 *             .location(&#34;westus&#34;)
 *             .locations(Map.ofEntries(
 *                 Map.entry(&#34;failoverPriority&#34;, 0),
 *                 Map.entry(&#34;isZoneRedundant&#34;, false),
 *                 Map.entry(&#34;locationName&#34;, &#34;southcentralus&#34;)
 *             ))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:DatabaseAccount ddb1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:DatabaseAccount")
public class DatabaseAccount extends com.pulumi.resources.CustomResource {
    /**
     * API specific properties.
     * 
     */
    @Export(name="apiProperties", type=ApiPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ ApiPropertiesResponse> apiProperties;

    /**
     * @return API specific properties.
     * 
     */
    public Output<Optional<ApiPropertiesResponse>> apiProperties() {
        return Codegen.optional(this.apiProperties);
    }
    /**
     * The object representing the policy for taking backups on an account.
     * 
     */
    @Export(name="backupPolicy", type=Either.class, parameters={ContinuousModeBackupPolicyResponse.class, PeriodicModeBackupPolicyResponse.class})
    private Output</* @Nullable */ Either<ContinuousModeBackupPolicyResponse,PeriodicModeBackupPolicyResponse>> backupPolicy;

    /**
     * @return The object representing the policy for taking backups on an account.
     * 
     */
    public Output<Optional<Either<ContinuousModeBackupPolicyResponse,PeriodicModeBackupPolicyResponse>>> backupPolicy() {
        return Codegen.optional(this.backupPolicy);
    }
    /**
     * List of Cosmos DB capabilities for the account
     * 
     */
    @Export(name="capabilities", type=List.class, parameters={CapabilityResponse.class})
    private Output</* @Nullable */ List<CapabilityResponse>> capabilities;

    /**
     * @return List of Cosmos DB capabilities for the account
     * 
     */
    public Output<Optional<List<CapabilityResponse>>> capabilities() {
        return Codegen.optional(this.capabilities);
    }
    /**
     * The cassandra connector offer type for the Cosmos DB database C* account.
     * 
     */
    @Export(name="connectorOffer", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectorOffer;

    /**
     * @return The cassandra connector offer type for the Cosmos DB database C* account.
     * 
     */
    public Output<Optional<String>> connectorOffer() {
        return Codegen.optional(this.connectorOffer);
    }
    /**
     * The consistency policy for the Cosmos DB database account.
     * 
     */
    @Export(name="consistencyPolicy", type=ConsistencyPolicyResponse.class, parameters={})
    private Output</* @Nullable */ ConsistencyPolicyResponse> consistencyPolicy;

    /**
     * @return The consistency policy for the Cosmos DB database account.
     * 
     */
    public Output<Optional<ConsistencyPolicyResponse>> consistencyPolicy() {
        return Codegen.optional(this.consistencyPolicy);
    }
    /**
     * The CORS policy for the Cosmos DB database account.
     * 
     */
    @Export(name="cors", type=List.class, parameters={CorsPolicyResponse.class})
    private Output</* @Nullable */ List<CorsPolicyResponse>> cors;

    /**
     * @return The CORS policy for the Cosmos DB database account.
     * 
     */
    public Output<Optional<List<CorsPolicyResponse>>> cors() {
        return Codegen.optional(this.cors);
    }
    /**
     * The offer type for the Cosmos DB database account. Default value: Standard.
     * 
     */
    @Export(name="databaseAccountOfferType", type=String.class, parameters={})
    private Output<String> databaseAccountOfferType;

    /**
     * @return The offer type for the Cosmos DB database account. Default value: Standard.
     * 
     */
    public Output<String> databaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }
    /**
     * The default identity for accessing key vault used in features like customer managed keys. The default identity needs to be explicitly set by the users. It can be &#34;FirstPartyIdentity&#34;, &#34;SystemAssignedIdentity&#34; and more.
     * 
     */
    @Export(name="defaultIdentity", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultIdentity;

    /**
     * @return The default identity for accessing key vault used in features like customer managed keys. The default identity needs to be explicitly set by the users. It can be &#34;FirstPartyIdentity&#34;, &#34;SystemAssignedIdentity&#34; and more.
     * 
     */
    public Output<Optional<String>> defaultIdentity() {
        return Codegen.optional(this.defaultIdentity);
    }
    /**
     * Disable write operations on metadata resources (databases, containers, throughput) via account keys
     * 
     */
    @Export(name="disableKeyBasedMetadataWriteAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableKeyBasedMetadataWriteAccess;

    /**
     * @return Disable write operations on metadata resources (databases, containers, throughput) via account keys
     * 
     */
    public Output<Optional<Boolean>> disableKeyBasedMetadataWriteAccess() {
        return Codegen.optional(this.disableKeyBasedMetadataWriteAccess);
    }
    /**
     * The connection endpoint for the Cosmos DB database account.
     * 
     */
    @Export(name="documentEndpoint", type=String.class, parameters={})
    private Output<String> documentEndpoint;

    /**
     * @return The connection endpoint for the Cosmos DB database account.
     * 
     */
    public Output<String> documentEndpoint() {
        return this.documentEndpoint;
    }
    /**
     * Flag to indicate whether to enable storage analytics.
     * 
     */
    @Export(name="enableAnalyticalStorage", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAnalyticalStorage;

    /**
     * @return Flag to indicate whether to enable storage analytics.
     * 
     */
    public Output<Optional<Boolean>> enableAnalyticalStorage() {
        return Codegen.optional(this.enableAnalyticalStorage);
    }
    /**
     * Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     * 
     */
    @Export(name="enableAutomaticFailover", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutomaticFailover;

    /**
     * @return Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     * 
     */
    public Output<Optional<Boolean>> enableAutomaticFailover() {
        return Codegen.optional(this.enableAutomaticFailover);
    }
    /**
     * Enables the cassandra connector on the Cosmos DB C* account
     * 
     */
    @Export(name="enableCassandraConnector", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableCassandraConnector;

    /**
     * @return Enables the cassandra connector on the Cosmos DB C* account
     * 
     */
    public Output<Optional<Boolean>> enableCassandraConnector() {
        return Codegen.optional(this.enableCassandraConnector);
    }
    /**
     * Flag to indicate whether Free Tier is enabled.
     * 
     */
    @Export(name="enableFreeTier", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableFreeTier;

    /**
     * @return Flag to indicate whether Free Tier is enabled.
     * 
     */
    public Output<Optional<Boolean>> enableFreeTier() {
        return Codegen.optional(this.enableFreeTier);
    }
    /**
     * Enables the account to write in multiple locations
     * 
     */
    @Export(name="enableMultipleWriteLocations", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableMultipleWriteLocations;

    /**
     * @return Enables the account to write in multiple locations
     * 
     */
    public Output<Optional<Boolean>> enableMultipleWriteLocations() {
        return Codegen.optional(this.enableMultipleWriteLocations);
    }
    /**
     * An array that contains the regions ordered by their failover priorities.
     * 
     */
    @Export(name="failoverPolicies", type=List.class, parameters={FailoverPolicyResponse.class})
    private Output<List<FailoverPolicyResponse>> failoverPolicies;

    /**
     * @return An array that contains the regions ordered by their failover priorities.
     * 
     */
    public Output<List<FailoverPolicyResponse>> failoverPolicies() {
        return this.failoverPolicies;
    }
    /**
     * Identity for the resource.
     * 
     */
    @Export(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output<Optional<ManagedServiceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * List of IpRules.
     * 
     */
    @Export(name="ipRules", type=List.class, parameters={IpAddressOrRangeResponse.class})
    private Output</* @Nullable */ List<IpAddressOrRangeResponse>> ipRules;

    /**
     * @return List of IpRules.
     * 
     */
    public Output<Optional<List<IpAddressOrRangeResponse>>> ipRules() {
        return Codegen.optional(this.ipRules);
    }
    /**
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     * 
     */
    @Export(name="isVirtualNetworkFilterEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isVirtualNetworkFilterEnabled;

    /**
     * @return Flag to indicate whether to enable/disable Virtual Network ACL rules.
     * 
     */
    public Output<Optional<Boolean>> isVirtualNetworkFilterEnabled() {
        return Codegen.optional(this.isVirtualNetworkFilterEnabled);
    }
    /**
     * The URI of the key vault
     * 
     */
    @Export(name="keyVaultKeyUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultKeyUri;

    /**
     * @return The URI of the key vault
     * 
     */
    public Output<Optional<String>> keyVaultKeyUri() {
        return Codegen.optional(this.keyVaultKeyUri);
    }
    /**
     * Indicates the type of database account. This can only be set at database account creation.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Indicates the type of database account. This can only be set at database account creation.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * An array that contains all of the locations enabled for the Cosmos DB account.
     * 
     */
    @Export(name="locations", type=List.class, parameters={LocationResponse.class})
    private Output<List<LocationResponse>> locations;

    /**
     * @return An array that contains all of the locations enabled for the Cosmos DB account.
     * 
     */
    public Output<List<LocationResponse>> locations() {
        return this.locations;
    }
    /**
     * The name of the ARM resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ARM resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Indicates what services are allowed to bypass firewall checks.
     * 
     */
    @Export(name="networkAclBypass", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkAclBypass;

    /**
     * @return Indicates what services are allowed to bypass firewall checks.
     * 
     */
    public Output<Optional<String>> networkAclBypass() {
        return Codegen.optional(this.networkAclBypass);
    }
    /**
     * An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     * 
     */
    @Export(name="networkAclBypassResourceIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> networkAclBypassResourceIds;

    /**
     * @return An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     * 
     */
    public Output<Optional<List<String>>> networkAclBypassResourceIds() {
        return Codegen.optional(this.networkAclBypassResourceIds);
    }
    /**
     * List of Private Endpoint Connections configured for the Cosmos DB account.
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of Private Endpoint Connections configured for the Cosmos DB account.
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * The status of the Cosmos DB account at the time the operation was called. The status can be one of following. &#39;Creating&#39; – the Cosmos DB account is being created. When an account is in Creating state, only properties that are specified as input for the Create Cosmos DB account operation are returned. &#39;Succeeded&#39; – the Cosmos DB account is active for use. &#39;Updating&#39; – the Cosmos DB account is being updated. &#39;Deleting&#39; – the Cosmos DB account is being deleted. &#39;Failed&#39; – the Cosmos DB account failed creation. &#39;DeletionFailed&#39; – the Cosmos DB account deletion failed.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The status of the Cosmos DB account at the time the operation was called. The status can be one of following. &#39;Creating&#39; – the Cosmos DB account is being created. When an account is in Creating state, only properties that are specified as input for the Create Cosmos DB account operation are returned. &#39;Succeeded&#39; – the Cosmos DB account is active for use. &#39;Updating&#39; – the Cosmos DB account is being updated. &#39;Deleting&#39; – the Cosmos DB account is being deleted. &#39;Failed&#39; – the Cosmos DB account failed creation. &#39;DeletionFailed&#39; – the Cosmos DB account deletion failed.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether requests from Public Network are allowed
     * 
     */
    @Export(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether requests from Public Network are allowed
     * 
     */
    public Output<Optional<String>> publicNetworkAccess() {
        return Codegen.optional(this.publicNetworkAccess);
    }
    /**
     * An array that contains of the read locations enabled for the Cosmos DB account.
     * 
     */
    @Export(name="readLocations", type=List.class, parameters={LocationResponse.class})
    private Output<List<LocationResponse>> readLocations;

    /**
     * @return An array that contains of the read locations enabled for the Cosmos DB account.
     * 
     */
    public Output<List<LocationResponse>> readLocations() {
        return this.readLocations;
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of Azure resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
     */
    @Export(name="virtualNetworkRules", type=List.class, parameters={VirtualNetworkRuleResponse.class})
    private Output</* @Nullable */ List<VirtualNetworkRuleResponse>> virtualNetworkRules;

    /**
     * @return List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
     */
    public Output<Optional<List<VirtualNetworkRuleResponse>>> virtualNetworkRules() {
        return Codegen.optional(this.virtualNetworkRules);
    }
    /**
     * An array that contains the write location for the Cosmos DB account.
     * 
     */
    @Export(name="writeLocations", type=List.class, parameters={LocationResponse.class})
    private Output<List<LocationResponse>> writeLocations;

    /**
     * @return An array that contains the write location for the Cosmos DB account.
     * 
     */
    public Output<List<LocationResponse>> writeLocations() {
        return this.writeLocations;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseAccount(String name) {
        this(name, DatabaseAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseAccount(String name, DatabaseAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseAccount(String name, DatabaseAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:DatabaseAccount", name, args == null ? DatabaseAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseAccount(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:DatabaseAccount", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20150401:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20150408:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20151106:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160319:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160331:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20190801:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20191212:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200301:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200401:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200601preview:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200901:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210115:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210315:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210415:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210515:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210615:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211115preview:DatabaseAccount").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20220215preview:DatabaseAccount").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DatabaseAccount get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseAccount(name, id, options);
    }
}
