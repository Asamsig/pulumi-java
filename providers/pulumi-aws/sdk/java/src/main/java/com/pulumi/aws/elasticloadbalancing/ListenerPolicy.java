// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticloadbalancing.ListenerPolicyArgs;
import com.pulumi.aws.elasticloadbalancing.inputs.ListenerPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Attaches a load balancer policy to an ELB Listener.
 * 
 * ## Example Usage
 * ### Custom Policy
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
 *         var wu_tang = new LoadBalancer(&#34;wu-tang&#34;, LoadBalancerArgs.builder()        
 *             .availabilityZones(&#34;us-east-1a&#34;)
 *             .listeners(LoadBalancerListener.builder()
 *                 .instancePort(443)
 *                 .instanceProtocol(&#34;http&#34;)
 *                 .lbPort(443)
 *                 .lbProtocol(&#34;https&#34;)
 *                 .sslCertificateId(&#34;arn:aws:iam::000000000000:server-certificate/wu-tang.net&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;Name&#34;, &#34;wu-tang&#34;))
 *             .build());
 * 
 *         var wu_tang_ssl = new LoadBalancerPolicy(&#34;wu-tang-ssl&#34;, LoadBalancerPolicyArgs.builder()        
 *             .loadBalancerName(wu_tang.getName())
 *             .policyName(&#34;wu-tang-ssl&#34;)
 *             .policyTypeName(&#34;SSLNegotiationPolicyType&#34;)
 *             .policyAttributes(            
 *                 LoadBalancerPolicyPolicyAttribute.builder()
 *                     .name(&#34;ECDHE-ECDSA-AES128-GCM-SHA256&#34;)
 *                     .value(&#34;true&#34;)
 *                     .build(),
 *                 LoadBalancerPolicyPolicyAttribute.builder()
 *                     .name(&#34;Protocol-TLSv1.2&#34;)
 *                     .value(&#34;true&#34;)
 *                     .build())
 *             .build());
 * 
 *         var wu_tang_listener_policies_443 = new ListenerPolicy(&#34;wu-tang-listener-policies-443&#34;, ListenerPolicyArgs.builder()        
 *             .loadBalancerName(wu_tang.getName())
 *             .loadBalancerPort(443)
 *             .policyNames(wu_tang_ssl.getPolicyName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * This example shows how to customize the TLS settings of an HTTPS listener.
 * ### AWS Predefined Security Policy
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
 *         var wu_tang = new LoadBalancer(&#34;wu-tang&#34;, LoadBalancerArgs.builder()        
 *             .availabilityZones(&#34;us-east-1a&#34;)
 *             .listeners(LoadBalancerListener.builder()
 *                 .instancePort(443)
 *                 .instanceProtocol(&#34;http&#34;)
 *                 .lbPort(443)
 *                 .lbProtocol(&#34;https&#34;)
 *                 .sslCertificateId(&#34;arn:aws:iam::000000000000:server-certificate/wu-tang.net&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;Name&#34;, &#34;wu-tang&#34;))
 *             .build());
 * 
 *         var wu_tang_ssl_tls_1_1 = new LoadBalancerPolicy(&#34;wu-tang-ssl-tls-1-1&#34;, LoadBalancerPolicyArgs.builder()        
 *             .loadBalancerName(wu_tang.getName())
 *             .policyName(&#34;wu-tang-ssl&#34;)
 *             .policyTypeName(&#34;SSLNegotiationPolicyType&#34;)
 *             .policyAttributes(LoadBalancerPolicyPolicyAttribute.builder()
 *                 .name(&#34;Reference-Security-Policy&#34;)
 *                 .value(&#34;ELBSecurityPolicy-TLS-1-1-2017-01&#34;)
 *                 .build())
 *             .build());
 * 
 *         var wu_tang_listener_policies_443 = new ListenerPolicy(&#34;wu-tang-listener-policies-443&#34;, ListenerPolicyArgs.builder()        
 *             .loadBalancerName(wu_tang.getName())
 *             .loadBalancerPort(443)
 *             .policyNames(wu_tang_ssl_tls_1_1.getPolicyName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * This example shows how to add a [Predefined Security Policy for ELBs](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-security-policy-table.html)
 * 
 * @deprecated
 * aws.elasticloadbalancing.ListenerPolicy has been deprecated in favor of aws.elb.ListenerPolicy
 * 
 */
@Deprecated /* aws.elasticloadbalancing.ListenerPolicy has been deprecated in favor of aws.elb.ListenerPolicy */
@ResourceType(type="aws:elasticloadbalancing/listenerPolicy:ListenerPolicy")
public class ListenerPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The load balancer to attach the policy to.
     * 
     */
    @Export(name="loadBalancerName", type=String.class, parameters={})
    private Output<String> loadBalancerName;

    /**
     * @return The load balancer to attach the policy to.
     * 
     */
    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }
    /**
     * The load balancer listener port to apply the policy to.
     * 
     */
    @Export(name="loadBalancerPort", type=Integer.class, parameters={})
    private Output<Integer> loadBalancerPort;

    /**
     * @return The load balancer listener port to apply the policy to.
     * 
     */
    public Output<Integer> loadBalancerPort() {
        return this.loadBalancerPort;
    }
    /**
     * List of Policy Names to apply to the backend server.
     * 
     */
    @Export(name="policyNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> policyNames;

    /**
     * @return List of Policy Names to apply to the backend server.
     * 
     */
    public Output<Optional<List<String>>> policyNames() {
        return Codegen.optional(this.policyNames);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListenerPolicy(String name) {
        this(name, ListenerPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListenerPolicy(String name, ListenerPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListenerPolicy(String name, ListenerPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticloadbalancing/listenerPolicy:ListenerPolicy", name, args == null ? ListenerPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ListenerPolicy(String name, Output<String> id, @Nullable ListenerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticloadbalancing/listenerPolicy:ListenerPolicy", name, state, makeResourceOptions(options, id));
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
    public static ListenerPolicy get(String name, Output<String> id, @Nullable ListenerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ListenerPolicy(name, id, state, options);
    }
}
