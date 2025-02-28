// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.WindowsWebAppArgs;
import com.pulumi.azure.appservice.inputs.WindowsWebAppState;
import com.pulumi.azure.appservice.outputs.WindowsWebAppAuthSettings;
import com.pulumi.azure.appservice.outputs.WindowsWebAppBackup;
import com.pulumi.azure.appservice.outputs.WindowsWebAppConnectionString;
import com.pulumi.azure.appservice.outputs.WindowsWebAppIdentity;
import com.pulumi.azure.appservice.outputs.WindowsWebAppLogs;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSiteConfig;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSiteCredential;
import com.pulumi.azure.appservice.outputs.WindowsWebAppStickySettings;
import com.pulumi.azure.appservice.outputs.WindowsWebAppStorageAccount;
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
 * Manages a Windows Web App.
 * 
 * ## Example Usage
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleServicePlan = new ServicePlan(&#34;exampleServicePlan&#34;, ServicePlanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(&#34;West Europe&#34;)
 *             .skuName(&#34;P1v2&#34;)
 *             .build());
 * 
 *         var exampleWindowsWebApp = new WindowsWebApp(&#34;exampleWindowsWebApp&#34;, WindowsWebAppArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleServicePlan.getLocation())
 *             .servicePlanId(exampleServicePlan.getId())
 *             .siteConfig()
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Windows Web Apps can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/windowsWebApp:WindowsWebApp example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1
 * ```
 * 
 */
@ResourceType(type="azure:appservice/windowsWebApp:WindowsWebApp")
public class WindowsWebApp extends com.pulumi.resources.CustomResource {
    /**
     * A map of key-value pairs of App Settings.
     * 
     */
    @Export(name="appSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> appSettings;

    /**
     * @return A map of key-value pairs of App Settings.
     * 
     */
    public Output<Optional<Map<String,String>>> appSettings() {
        return Codegen.optional(this.appSettings);
    }
    /**
     * An `auth_settings` block as defined below.
     * 
     */
    @Export(name="authSettings", type=WindowsWebAppAuthSettings.class, parameters={})
    private Output<WindowsWebAppAuthSettings> authSettings;

    /**
     * @return An `auth_settings` block as defined below.
     * 
     */
    public Output<WindowsWebAppAuthSettings> authSettings() {
        return this.authSettings;
    }
    /**
     * A `backup` block as defined below.
     * 
     */
    @Export(name="backup", type=WindowsWebAppBackup.class, parameters={})
    private Output</* @Nullable */ WindowsWebAppBackup> backup;

    /**
     * @return A `backup` block as defined below.
     * 
     */
    public Output<Optional<WindowsWebAppBackup>> backup() {
        return Codegen.optional(this.backup);
    }
    /**
     * Should Client Affinity be enabled?
     * 
     */
    @Export(name="clientAffinityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> clientAffinityEnabled;

    /**
     * @return Should Client Affinity be enabled?
     * 
     */
    public Output<Optional<Boolean>> clientAffinityEnabled() {
        return Codegen.optional(this.clientAffinityEnabled);
    }
    /**
     * Should Client Certificates be enabled?
     * 
     */
    @Export(name="clientCertificateEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> clientCertificateEnabled;

    /**
     * @return Should Client Certificates be enabled?
     * 
     */
    public Output<Optional<Boolean>> clientCertificateEnabled() {
        return Codegen.optional(this.clientCertificateEnabled);
    }
    /**
     * The Client Certificate mode. Possible values include `Optional` and `Required`. This property has no effect when `client_cert_enabled` is `false`
     * 
     */
    @Export(name="clientCertificateMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCertificateMode;

    /**
     * @return The Client Certificate mode. Possible values include `Optional` and `Required`. This property has no effect when `client_cert_enabled` is `false`
     * 
     */
    public Output<Optional<String>> clientCertificateMode() {
        return Codegen.optional(this.clientCertificateMode);
    }
    /**
     * One or more `connection_string` blocks as defined below.
     * 
     */
    @Export(name="connectionStrings", type=List.class, parameters={WindowsWebAppConnectionString.class})
    private Output</* @Nullable */ List<WindowsWebAppConnectionString>> connectionStrings;

    /**
     * @return One or more `connection_string` blocks as defined below.
     * 
     */
    public Output<Optional<List<WindowsWebAppConnectionString>>> connectionStrings() {
        return Codegen.optional(this.connectionStrings);
    }
    /**
     * The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    @Export(name="customDomainVerificationId", type=String.class, parameters={})
    private Output<String> customDomainVerificationId;

    /**
     * @return The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    public Output<String> customDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    /**
     * The default hostname of the Windows Web App.
     * 
     */
    @Export(name="defaultHostname", type=String.class, parameters={})
    private Output<String> defaultHostname;

    /**
     * @return The default hostname of the Windows Web App.
     * 
     */
    public Output<String> defaultHostname() {
        return this.defaultHostname;
    }
    /**
     * Should the Windows Web App be enabled? Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Should the Windows Web App be enabled? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Should the Windows Web App require HTTPS connections.
     * 
     */
    @Export(name="httpsOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> httpsOnly;

    /**
     * @return Should the Windows Web App require HTTPS connections.
     * 
     */
    public Output<Optional<Boolean>> httpsOnly() {
        return Codegen.optional(this.httpsOnly);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=WindowsWebAppIdentity.class, parameters={})
    private Output</* @Nullable */ WindowsWebAppIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<WindowsWebAppIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
     * 
     */
    @Export(name="keyVaultReferenceIdentityId", type=String.class, parameters={})
    private Output<String> keyVaultReferenceIdentityId;

    /**
     * @return The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
     * 
     */
    public Output<String> keyVaultReferenceIdentityId() {
        return this.keyVaultReferenceIdentityId;
    }
    /**
     * The Kind value for this Windows Web App.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The Kind value for this Windows Web App.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The Azure Region where the Windows Web App should exist. Changing this forces a new Windows Web App to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Windows Web App should exist. Changing this forces a new Windows Web App to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A `logs` block as defined below.
     * 
     */
    @Export(name="logs", type=WindowsWebAppLogs.class, parameters={})
    private Output</* @Nullable */ WindowsWebAppLogs> logs;

    /**
     * @return A `logs` block as defined below.
     * 
     */
    public Output<Optional<WindowsWebAppLogs>> logs() {
        return Codegen.optional(this.logs);
    }
    /**
     * The name which should be used for this Windows Web App. Changing this forces a new Windows Web App to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Windows Web App. Changing this forces a new Windows Web App to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    @Export(name="outboundIpAddressLists", type=List.class, parameters={String.class})
    private Output<List<String>> outboundIpAddressLists;

    /**
     * @return A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    public Output<List<String>> outboundIpAddressLists() {
        return this.outboundIpAddressLists;
    }
    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
     * 
     */
    @Export(name="outboundIpAddresses", type=String.class, parameters={})
    private Output<String> outboundIpAddresses;

    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
     * 
     */
    public Output<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    /**
     * A `possible_outbound_ip_address_list` block as defined below.
     * 
     */
    @Export(name="possibleOutboundIpAddressLists", type=List.class, parameters={String.class})
    private Output<List<String>> possibleOutboundIpAddressLists;

    /**
     * @return A `possible_outbound_ip_address_list` block as defined below.
     * 
     */
    public Output<List<String>> possibleOutboundIpAddressLists() {
        return this.possibleOutboundIpAddressLists;
    }
    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    @Export(name="possibleOutboundIpAddresses", type=String.class, parameters={})
    private Output<String> possibleOutboundIpAddresses;

    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    public Output<String> possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }
    /**
     * The name of the Resource Group where the Windows Web App should exist. Changing this forces a new Windows Web App to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Windows Web App should exist. Changing this forces a new Windows Web App to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ID of the Service Plan that this Windows App Service will be created in.
     * 
     */
    @Export(name="servicePlanId", type=String.class, parameters={})
    private Output<String> servicePlanId;

    /**
     * @return The ID of the Service Plan that this Windows App Service will be created in.
     * 
     */
    public Output<String> servicePlanId() {
        return this.servicePlanId;
    }
    /**
     * A `site_config` block as defined below.
     * 
     */
    @Export(name="siteConfig", type=WindowsWebAppSiteConfig.class, parameters={})
    private Output<WindowsWebAppSiteConfig> siteConfig;

    /**
     * @return A `site_config` block as defined below.
     * 
     */
    public Output<WindowsWebAppSiteConfig> siteConfig() {
        return this.siteConfig;
    }
    /**
     * A `site_credential` block as defined below.
     * 
     */
    @Export(name="siteCredentials", type=List.class, parameters={WindowsWebAppSiteCredential.class})
    private Output<List<WindowsWebAppSiteCredential>> siteCredentials;

    /**
     * @return A `site_credential` block as defined below.
     * 
     */
    public Output<List<WindowsWebAppSiteCredential>> siteCredentials() {
        return this.siteCredentials;
    }
    /**
     * A `sticky_settings` block as defined below.
     * 
     */
    @Export(name="stickySettings", type=WindowsWebAppStickySettings.class, parameters={})
    private Output</* @Nullable */ WindowsWebAppStickySettings> stickySettings;

    /**
     * @return A `sticky_settings` block as defined below.
     * 
     */
    public Output<Optional<WindowsWebAppStickySettings>> stickySettings() {
        return Codegen.optional(this.stickySettings);
    }
    /**
     * One or more `storage_account` blocks as defined below.
     * 
     */
    @Export(name="storageAccounts", type=List.class, parameters={WindowsWebAppStorageAccount.class})
    private Output</* @Nullable */ List<WindowsWebAppStorageAccount>> storageAccounts;

    /**
     * @return One or more `storage_account` blocks as defined below.
     * 
     */
    public Output<Optional<List<WindowsWebAppStorageAccount>>> storageAccounts() {
        return Codegen.optional(this.storageAccounts);
    }
    /**
     * A mapping of tags which should be assigned to the Windows Web App.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Windows Web App.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WindowsWebApp(String name) {
        this(name, WindowsWebAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WindowsWebApp(String name, WindowsWebAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WindowsWebApp(String name, WindowsWebAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/windowsWebApp:WindowsWebApp", name, args == null ? WindowsWebAppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WindowsWebApp(String name, Output<String> id, @Nullable WindowsWebAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/windowsWebApp:WindowsWebApp", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WindowsWebApp get(String name, Output<String> id, @Nullable WindowsWebAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WindowsWebApp(name, id, state, options);
    }
}
