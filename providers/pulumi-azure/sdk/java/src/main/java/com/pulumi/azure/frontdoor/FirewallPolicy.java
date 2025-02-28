// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.frontdoor.FirewallPolicyArgs;
import com.pulumi.azure.frontdoor.inputs.FirewallPolicyState;
import com.pulumi.azure.frontdoor.outputs.FirewallPolicyCustomRule;
import com.pulumi.azure.frontdoor.outputs.FirewallPolicyManagedRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 *         var exampleFirewallPolicy = new FirewallPolicy(&#34;exampleFirewallPolicy&#34;, FirewallPolicyArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .enabled(true)
 *             .mode(&#34;Prevention&#34;)
 *             .redirectUrl(&#34;https://www.contoso.com&#34;)
 *             .customBlockResponseStatusCode(403)
 *             .customBlockResponseBody(&#34;PGh0bWw+CjxoZWFkZXI+PHRpdGxlPkhlbGxvPC90aXRsZT48L2hlYWRlcj4KPGJvZHk+CkhlbGxvIHdvcmxkCjwvYm9keT4KPC9odG1sPg==&#34;)
 *             .customRules(            
 *                 FirewallPolicyCustomRule.builder()
 *                     .name(&#34;Rule1&#34;)
 *                     .enabled(true)
 *                     .priority(1)
 *                     .rateLimitDurationInMinutes(1)
 *                     .rateLimitThreshold(10)
 *                     .type(&#34;MatchRule&#34;)
 *                     .action(&#34;Block&#34;)
 *                     .matchConditions(FirewallPolicyCustomRuleMatchCondition.builder()
 *                         .matchVariable(&#34;RemoteAddr&#34;)
 *                         .operator(&#34;IPMatch&#34;)
 *                         .negationCondition(false)
 *                         .matchValues(                        
 *                             &#34;192.168.1.0/24&#34;,
 *                             &#34;10.0.0.0/24&#34;)
 *                         .build())
 *                     .build(),
 *                 FirewallPolicyCustomRule.builder()
 *                     .name(&#34;Rule2&#34;)
 *                     .enabled(true)
 *                     .priority(2)
 *                     .rateLimitDurationInMinutes(1)
 *                     .rateLimitThreshold(10)
 *                     .type(&#34;MatchRule&#34;)
 *                     .action(&#34;Block&#34;)
 *                     .matchConditions(                    
 *                         FirewallPolicyCustomRuleMatchCondition.builder()
 *                             .matchVariable(&#34;RemoteAddr&#34;)
 *                             .operator(&#34;IPMatch&#34;)
 *                             .negationCondition(false)
 *                             .matchValues(&#34;192.168.1.0/24&#34;)
 *                             .build(),
 *                         FirewallPolicyCustomRuleMatchCondition.builder()
 *                             .matchVariable(&#34;RequestHeader&#34;)
 *                             .selector(&#34;UserAgent&#34;)
 *                             .operator(&#34;Contains&#34;)
 *                             .negationCondition(false)
 *                             .matchValues(&#34;windows&#34;)
 *                             .transforms(                            
 *                                 &#34;Lowercase&#34;,
 *                                 &#34;Trim&#34;)
 *                             .build())
 *                     .build())
 *             .managedRules(            
 *                 FirewallPolicyManagedRule.builder()
 *                     .type(&#34;DefaultRuleSet&#34;)
 *                     .version(&#34;1.0&#34;)
 *                     .exclusions(FirewallPolicyManagedRuleExclusion.builder()
 *                         .matchVariable(&#34;QueryStringArgNames&#34;)
 *                         .operator(&#34;Equals&#34;)
 *                         .selector(&#34;not_suspicious&#34;)
 *                         .build())
 *                     .overrides(                    
 *                         FirewallPolicyManagedRuleOverride.builder()
 *                             .ruleGroupName(&#34;PHP&#34;)
 *                             .rules(FirewallPolicyManagedRuleOverrideRule.builder()
 *                                 .ruleId(&#34;933100&#34;)
 *                                 .enabled(false)
 *                                 .action(&#34;Block&#34;)
 *                                 .build())
 *                             .build(),
 *                         FirewallPolicyManagedRuleOverride.builder()
 *                             .ruleGroupName(&#34;SQLI&#34;)
 *                             .exclusions(FirewallPolicyManagedRuleOverrideExclusion.builder()
 *                                 .matchVariable(&#34;QueryStringArgNames&#34;)
 *                                 .operator(&#34;Equals&#34;)
 *                                 .selector(&#34;really_not_suspicious&#34;)
 *                                 .build())
 *                             .rules(FirewallPolicyManagedRuleOverrideRule.builder()
 *                                 .ruleId(&#34;942200&#34;)
 *                                 .action(&#34;Block&#34;)
 *                                 .exclusions(FirewallPolicyManagedRuleOverrideRuleExclusion.builder()
 *                                     .matchVariable(&#34;QueryStringArgNames&#34;)
 *                                     .operator(&#34;Equals&#34;)
 *                                     .selector(&#34;innocent&#34;)
 *                                     .build())
 *                                 .build())
 *                             .build())
 *                     .build(),
 *                 FirewallPolicyManagedRule.builder()
 *                     .type(&#34;Microsoft_BotManagerRuleSet&#34;)
 *                     .version(&#34;1.0&#34;)
 *                     .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * FrontDoor Web Application Firewall Policy can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:frontdoor/firewallPolicy:FirewallPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-rg/providers/Microsoft.Network/frontDoorWebApplicationFirewallPolicies/examplefdwafpolicy
 * ```
 * 
 */
@ResourceType(type="azure:frontdoor/firewallPolicy:FirewallPolicy")
public class FirewallPolicy extends com.pulumi.resources.CustomResource {
    /**
     * If a `custom_rule` block&#39;s action type is `block`, this is the response body. The body must be specified in base64 encoding.
     * 
     */
    @Export(name="customBlockResponseBody", type=String.class, parameters={})
    private Output</* @Nullable */ String> customBlockResponseBody;

    /**
     * @return If a `custom_rule` block&#39;s action type is `block`, this is the response body. The body must be specified in base64 encoding.
     * 
     */
    public Output<Optional<String>> customBlockResponseBody() {
        return Codegen.optional(this.customBlockResponseBody);
    }
    /**
     * If a `custom_rule` block&#39;s action type is `block`, this is the response status code. Possible values are `200`, `403`, `405`, `406`, or `429`.
     * 
     */
    @Export(name="customBlockResponseStatusCode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> customBlockResponseStatusCode;

    /**
     * @return If a `custom_rule` block&#39;s action type is `block`, this is the response status code. Possible values are `200`, `403`, `405`, `406`, or `429`.
     * 
     */
    public Output<Optional<Integer>> customBlockResponseStatusCode() {
        return Codegen.optional(this.customBlockResponseStatusCode);
    }
    /**
     * One or more `custom_rule` blocks as defined below.
     * 
     */
    @Export(name="customRules", type=List.class, parameters={FirewallPolicyCustomRule.class})
    private Output</* @Nullable */ List<FirewallPolicyCustomRule>> customRules;

    /**
     * @return One or more `custom_rule` blocks as defined below.
     * 
     */
    public Output<Optional<List<FirewallPolicyCustomRule>>> customRules() {
        return Codegen.optional(this.customRules);
    }
    /**
     * Is the policy a enabled state or disabled state. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Is the policy a enabled state or disabled state. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The Frontend Endpoints associated with this Front Door Web Application Firewall policy.
     * 
     */
    @Export(name="frontendEndpointIds", type=List.class, parameters={String.class})
    private Output<List<String>> frontendEndpointIds;

    /**
     * @return The Frontend Endpoints associated with this Front Door Web Application Firewall policy.
     * 
     */
    public Output<List<String>> frontendEndpointIds() {
        return this.frontendEndpointIds;
    }
    /**
     * The Azure Region where this FrontDoor Firewall Policy exists.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where this FrontDoor Firewall Policy exists.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * One or more `managed_rule` blocks as defined below.
     * 
     */
    @Export(name="managedRules", type=List.class, parameters={FirewallPolicyManagedRule.class})
    private Output</* @Nullable */ List<FirewallPolicyManagedRule>> managedRules;

    /**
     * @return One or more `managed_rule` blocks as defined below.
     * 
     */
    public Output<Optional<List<FirewallPolicyManagedRule>>> managedRules() {
        return Codegen.optional(this.managedRules);
    }
    /**
     * The firewall policy mode. Possible values are `Detection`, `Prevention` and defaults to `Prevention`.
     * 
     */
    @Export(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return The firewall policy mode. Possible values are `Detection`, `Prevention` and defaults to `Prevention`.
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The name of the policy. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * If action type is redirect, this field represents redirect URL for the client.
     * 
     */
    @Export(name="redirectUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> redirectUrl;

    /**
     * @return If action type is redirect, this field represents redirect URL for the client.
     * 
     */
    public Output<Optional<String>> redirectUrl() {
        return Codegen.optional(this.redirectUrl);
    }
    /**
     * The name of the resource group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the Web Application Firewall Policy.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Web Application Firewall Policy.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallPolicy(String name) {
        this(name, FirewallPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallPolicy(String name, FirewallPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallPolicy(String name, FirewallPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:frontdoor/firewallPolicy:FirewallPolicy", name, args == null ? FirewallPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallPolicy(String name, Output<String> id, @Nullable FirewallPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:frontdoor/firewallPolicy:FirewallPolicy", name, state, makeResourceOptions(options, id));
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
    public static FirewallPolicy get(String name, Output<String> id, @Nullable FirewallPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallPolicy(name, id, state, options);
    }
}
