// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.OutboundFirewallRuleArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Azure SQL DB Server Outbound Firewall Rule.
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * ### Approve or reject a outbound firewall rule with a given name.
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
 *         var outboundFirewallRule = new OutboundFirewallRule(&#34;outboundFirewallRule&#34;, OutboundFirewallRuleArgs.builder()        
 *             .outboundRuleFqdn(&#34;server.database.windows.net&#34;)
 *             .resourceGroupName(&#34;sqlcrudtest-7398&#34;)
 *             .serverName(&#34;sqlcrudtest-4645&#34;)
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
 * $ pulumi import azure-native:sql:OutboundFirewallRule server.database.windows.net /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-7398/providers/Microsoft.Sql/servers/sqlcrudtest-4645/outboundFirewallRules/server.datbase.windows.net 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:OutboundFirewallRule")
public class OutboundFirewallRule extends com.pulumi.resources.CustomResource {
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The state of the outbound rule.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The state of the outbound rule.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OutboundFirewallRule(String name) {
        this(name, OutboundFirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OutboundFirewallRule(String name, OutboundFirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OutboundFirewallRule(String name, OutboundFirewallRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:OutboundFirewallRule", name, args == null ? OutboundFirewallRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OutboundFirewallRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:OutboundFirewallRule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:OutboundFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:OutboundFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:OutboundFirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:OutboundFirewallRule").build())
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
    public static OutboundFirewallRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OutboundFirewallRule(name, id, options);
    }
}
