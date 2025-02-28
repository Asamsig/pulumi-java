// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.IpFirewallRuleArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * IP firewall rule
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * ### Create an IP firewall rule
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
 *         var ipFirewallRule = new IpFirewallRule(&#34;ipFirewallRule&#34;, IpFirewallRuleArgs.builder()        
 *             .endIpAddress(&#34;10.0.0.254&#34;)
 *             .resourceGroupName(&#34;ExampleResourceGroup&#34;)
 *             .ruleName(&#34;ExampleIpFirewallRule&#34;)
 *             .startIpAddress(&#34;10.0.0.0&#34;)
 *             .workspaceName(&#34;ExampleWorkspace&#34;)
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
 * $ pulumi import azure-native:synapse:IpFirewallRule ExampleIpFirewallRule /subscriptions/01234567-89ab-4def-0123-456789abcdef/resourceGroups/ExampleResourceGroup/providers/Microsoft.Synapse/workspaces/ExampleWorkspace/firewallRules/ExampleIpFirewallRule 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:IpFirewallRule")
public class IpFirewallRule extends com.pulumi.resources.CustomResource {
    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress
     * 
     */
    @Export(name="endIpAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> endIpAddress;

    /**
     * @return The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress
     * 
     */
    public Output<Optional<String>> endIpAddress() {
        return Codegen.optional(this.endIpAddress);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource provisioning state
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Resource provisioning state
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The start IP address of the firewall rule. Must be IPv4 format
     * 
     */
    @Export(name="startIpAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> startIpAddress;

    /**
     * @return The start IP address of the firewall rule. Must be IPv4 format
     * 
     */
    public Output<Optional<String>> startIpAddress() {
        return Codegen.optional(this.startIpAddress);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpFirewallRule(String name) {
        this(name, IpFirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpFirewallRule(String name, IpFirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpFirewallRule(String name, IpFirewallRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IpFirewallRule", name, args == null ? IpFirewallRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IpFirewallRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IpFirewallRule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20190601preview:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20201201:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210301:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210501:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601:IpFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:IpFirewallRule").build())
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
    public static IpFirewallRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpFirewallRule(name, id, options);
    }
}
