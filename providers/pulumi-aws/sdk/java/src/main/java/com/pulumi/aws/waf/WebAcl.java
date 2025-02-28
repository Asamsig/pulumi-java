// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.waf.WebAclArgs;
import com.pulumi.aws.waf.inputs.WebAclState;
import com.pulumi.aws.waf.outputs.WebAclDefaultAction;
import com.pulumi.aws.waf.outputs.WebAclLoggingConfiguration;
import com.pulumi.aws.waf.outputs.WebAclRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a WAF Web ACL Resource
 * 
 * ## Example Usage
 * 
 * This example blocks requests coming from `192.0.7.0/24` and allows everything else.
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
 *         var ipset = new IpSet(&#34;ipset&#34;, IpSetArgs.builder()        
 *             .ipSetDescriptors(IpSetIpSetDescriptor.builder()
 *                 .type(&#34;IPV4&#34;)
 *                 .value(&#34;192.0.7.0/24&#34;)
 *                 .build())
 *             .build());
 * 
 *         var wafrule = new Rule(&#34;wafrule&#34;, RuleArgs.builder()        
 *             .metricName(&#34;tfWAFRule&#34;)
 *             .predicates(RulePredicate.builder()
 *                 .dataId(ipset.getId())
 *                 .negated(false)
 *                 .type(&#34;IPMatch&#34;)
 *                 .build())
 *             .build());
 * 
 *         var wafAcl = new WebAcl(&#34;wafAcl&#34;, WebAclArgs.builder()        
 *             .metricName(&#34;tfWebACL&#34;)
 *             .defaultAction(WebAclDefaultAction.builder()
 *                 .type(&#34;ALLOW&#34;)
 *                 .build())
 *             .rules(WebAclRule.builder()
 *                 .action(WebAclRuleAction.builder()
 *                     .type(&#34;BLOCK&#34;)
 *                     .build())
 *                 .priority(1)
 *                 .ruleId(wafrule.getId())
 *                 .type(&#34;REGULAR&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Logging
 * 
 * &gt; *NOTE:* The Kinesis Firehose Delivery Stream name must begin with `aws-waf-logs-` and be located in `us-east-1` region. See the [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/logging.html) for more information about enabling WAF logging.
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
 *         var example = new WebAcl(&#34;example&#34;, WebAclArgs.builder()        
 *             .loggingConfiguration(WebAclLoggingConfiguration.builder()
 *                 .logDestination(aws_kinesis_firehose_delivery_stream.getExample().getArn())
 *                 .redactedFields(WebAclLoggingConfigurationRedactedFields.builder()
 *                     .fieldToMatches(                    
 *                         WebAclLoggingConfigurationRedactedFieldsFieldToMatch.builder()
 *                             .type(&#34;URI&#34;)
 *                             .build(),
 *                         WebAclLoggingConfigurationRedactedFieldsFieldToMatch.builder()
 *                             .data(&#34;referer&#34;)
 *                             .type(&#34;HEADER&#34;)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * WAF Web ACL can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/webAcl:WebAcl main 0c8e583e-18f3-4c13-9e2a-67c4805d2f94
 * ```
 * 
 */
@ResourceType(type="aws:waf/webAcl:WebAcl")
public class WebAcl extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the WAF WebACL.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the WAF WebACL.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration block with action that you want AWS WAF to take when a request doesn&#39;t match the criteria in any of the rules that are associated with the web ACL. Detailed below.
     * 
     */
    @Export(name="defaultAction", type=WebAclDefaultAction.class, parameters={})
    private Output<WebAclDefaultAction> defaultAction;

    /**
     * @return Configuration block with action that you want AWS WAF to take when a request doesn&#39;t match the criteria in any of the rules that are associated with the web ACL. Detailed below.
     * 
     */
    public Output<WebAclDefaultAction> defaultAction() {
        return this.defaultAction;
    }
    /**
     * Configuration block to enable WAF logging. Detailed below.
     * 
     */
    @Export(name="loggingConfiguration", type=WebAclLoggingConfiguration.class, parameters={})
    private Output</* @Nullable */ WebAclLoggingConfiguration> loggingConfiguration;

    /**
     * @return Configuration block to enable WAF logging. Detailed below.
     * 
     */
    public Output<Optional<WebAclLoggingConfiguration>> loggingConfiguration() {
        return Codegen.optional(this.loggingConfiguration);
    }
    /**
     * The name or description for the Amazon CloudWatch metric of this web ACL.
     * 
     */
    @Export(name="metricName", type=String.class, parameters={})
    private Output<String> metricName;

    /**
     * @return The name or description for the Amazon CloudWatch metric of this web ACL.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }
    /**
     * The name or description of the web ACL.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the web ACL.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
     * 
     */
    @Export(name="rules", type=List.class, parameters={WebAclRule.class})
    private Output</* @Nullable */ List<WebAclRule>> rules;

    /**
     * @return Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
     * 
     */
    public Output<Optional<List<WebAclRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAcl(String name) {
        this(name, WebAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAcl(String name, WebAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAcl(String name, WebAclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/webAcl:WebAcl", name, args == null ? WebAclArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAcl(String name, Output<String> id, @Nullable WebAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/webAcl:WebAcl", name, state, makeResourceOptions(options, id));
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
    public static WebAcl get(String name, Output<String> id, @Nullable WebAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAcl(name, id, state, options);
    }
}
