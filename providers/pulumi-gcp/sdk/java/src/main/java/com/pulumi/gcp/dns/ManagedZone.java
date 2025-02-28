// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dns.ManagedZoneArgs;
import com.pulumi.gcp.dns.inputs.ManagedZoneState;
import com.pulumi.gcp.dns.outputs.ManagedZoneDnssecConfig;
import com.pulumi.gcp.dns.outputs.ManagedZoneForwardingConfig;
import com.pulumi.gcp.dns.outputs.ManagedZonePeeringConfig;
import com.pulumi.gcp.dns.outputs.ManagedZonePrivateVisibilityConfig;
import com.pulumi.gcp.dns.outputs.ManagedZoneServiceDirectoryConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A zone is a subtree of the DNS namespace under one administrative
 * responsibility. A ManagedZone is a resource that represents a DNS zone
 * hosted by the Cloud DNS service.
 * 
 * To get more information about ManagedZone, see:
 * 
 * * [API documentation](https://cloud.google.com/dns/api/v1/managedZones)
 * * How-to Guides
 *   * [Managing Zones](https://cloud.google.com/dns/zones/)
 * 
 * ## Example Usage
 * ### Dns Managed Zone Basic
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
 *         var example_zone = new ManagedZone(&#34;example-zone&#34;, ManagedZoneArgs.builder()        
 *             .description(&#34;Example DNS zone&#34;)
 *             .dnsName(&#34;my-domain.com.&#34;)
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Dns Managed Zone Private
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
 *         var network_1 = new Network(&#34;network-1&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var network_2 = new Network(&#34;network-2&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var private_zone = new ManagedZone(&#34;private-zone&#34;, ManagedZoneArgs.builder()        
 *             .dnsName(&#34;private.example.com.&#34;)
 *             .description(&#34;Example private DNS zone&#34;)
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .visibility(&#34;private&#34;)
 *             .privateVisibilityConfig(ManagedZonePrivateVisibilityConfig.builder()
 *                 .networks(                
 *                     ManagedZonePrivateVisibilityConfigNetwork.builder()
 *                         .networkUrl(network_1.getId())
 *                         .build(),
 *                     ManagedZonePrivateVisibilityConfigNetwork.builder()
 *                         .networkUrl(network_2.getId())
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Dns Managed Zone Private Forwarding
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
 *         var network_1 = new Network(&#34;network-1&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var network_2 = new Network(&#34;network-2&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var private_zone = new ManagedZone(&#34;private-zone&#34;, ManagedZoneArgs.builder()        
 *             .dnsName(&#34;private.example.com.&#34;)
 *             .description(&#34;Example private DNS zone&#34;)
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .visibility(&#34;private&#34;)
 *             .privateVisibilityConfig(ManagedZonePrivateVisibilityConfig.builder()
 *                 .networks(                
 *                     ManagedZonePrivateVisibilityConfigNetwork.builder()
 *                         .networkUrl(network_1.getId())
 *                         .build(),
 *                     ManagedZonePrivateVisibilityConfigNetwork.builder()
 *                         .networkUrl(network_2.getId())
 *                         .build())
 *                 .build())
 *             .forwardingConfig(ManagedZoneForwardingConfig.builder()
 *                 .targetNameServers(                
 *                     ManagedZoneForwardingConfigTargetNameServer.builder()
 *                         .ipv4Address(&#34;172.16.1.10&#34;)
 *                         .build(),
 *                     ManagedZoneForwardingConfigTargetNameServer.builder()
 *                         .ipv4Address(&#34;172.16.1.20&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Dns Managed Zone Private Peering
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
 *         var network_source = new Network(&#34;network-source&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var network_target = new Network(&#34;network-target&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var peering_zone = new ManagedZone(&#34;peering-zone&#34;, ManagedZoneArgs.builder()        
 *             .dnsName(&#34;peering.example.com.&#34;)
 *             .description(&#34;Example private DNS peering zone&#34;)
 *             .visibility(&#34;private&#34;)
 *             .privateVisibilityConfig(ManagedZonePrivateVisibilityConfig.builder()
 *                 .networks(ManagedZonePrivateVisibilityConfigNetwork.builder()
 *                     .networkUrl(network_source.getId())
 *                     .build())
 *                 .build())
 *             .peeringConfig(ManagedZonePeeringConfig.builder()
 *                 .targetNetwork(ManagedZonePeeringConfigTargetNetwork.builder()
 *                     .networkUrl(network_target.getId())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Dns Managed Zone Service Directory
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
 *         var example = new Namespace(&#34;example&#34;, NamespaceArgs.builder()        
 *             .namespaceId(&#34;example&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .build());
 * 
 *         var sd_zone = new ManagedZone(&#34;sd-zone&#34;, ManagedZoneArgs.builder()        
 *             .dnsName(&#34;services.example.com.&#34;)
 *             .description(&#34;Example private DNS Service Directory zone&#34;)
 *             .visibility(&#34;private&#34;)
 *             .serviceDirectoryConfig(ManagedZoneServiceDirectoryConfig.builder()
 *                 .namespace(ManagedZoneServiceDirectoryConfigNamespace.builder()
 *                     .namespaceUrl(example.getId())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var network = new Network(&#34;network&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * ManagedZone can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dns/managedZone:ManagedZone default projects/{{project}}/managedZones/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dns/managedZone:ManagedZone default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dns/managedZone:ManagedZone default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:dns/managedZone:ManagedZone")
public class ManagedZone extends com.pulumi.resources.CustomResource {
    /**
     * A textual description field. Defaults to &#39;Managed by Pulumi&#39;.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A textual description field. Defaults to &#39;Managed by Pulumi&#39;.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The DNS name of this managed zone, for instance &#34;example.com.&#34;.
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name of this managed zone, for instance &#34;example.com.&#34;.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * DNSSEC configuration
     * Structure is documented below.
     * 
     */
    @Export(name="dnssecConfig", type=ManagedZoneDnssecConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZoneDnssecConfig> dnssecConfig;

    /**
     * @return DNSSEC configuration
     * Structure is documented below.
     * 
     */
    public Output<Optional<ManagedZoneDnssecConfig>> dnssecConfig() {
        return Codegen.optional(this.dnssecConfig);
    }
    /**
     * Set this true to delete all records in the zone.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Set this true to delete all records in the zone.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * The presence for this field indicates that outbound forwarding is enabled
     * for this zone. The value of this field contains the set of destinations
     * to forward to.
     * Structure is documented below.
     * 
     */
    @Export(name="forwardingConfig", type=ManagedZoneForwardingConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZoneForwardingConfig> forwardingConfig;

    /**
     * @return The presence for this field indicates that outbound forwarding is enabled
     * for this zone. The value of this field contains the set of destinations
     * to forward to.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ManagedZoneForwardingConfig>> forwardingConfig() {
        return Codegen.optional(this.forwardingConfig);
    }
    /**
     * A set of key/value label pairs to assign to this ManagedZone.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this ManagedZone.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * User assigned name for this resource.
     * Must be unique within the project.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User assigned name for this resource.
     * Must be unique within the project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server
     * 
     */
    @Export(name="nameServers", type=List.class, parameters={String.class})
    private Output<List<String>> nameServers;

    /**
     * @return Delegate your managed_zone to these virtual name servers; defined by the server
     * 
     */
    public Output<List<String>> nameServers() {
        return this.nameServers;
    }
    /**
     * The presence of this field indicates that DNS Peering is enabled for this
     * zone. The value of this field contains the network to peer with.
     * Structure is documented below.
     * 
     */
    @Export(name="peeringConfig", type=ManagedZonePeeringConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZonePeeringConfig> peeringConfig;

    /**
     * @return The presence of this field indicates that DNS Peering is enabled for this
     * zone. The value of this field contains the network to peer with.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ManagedZonePeeringConfig>> peeringConfig() {
        return Codegen.optional(this.peeringConfig);
    }
    /**
     * For privately visible zones, the set of Virtual Private Cloud
     * resources that the zone is visible from.
     * Structure is documented below.
     * 
     */
    @Export(name="privateVisibilityConfig", type=ManagedZonePrivateVisibilityConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZonePrivateVisibilityConfig> privateVisibilityConfig;

    /**
     * @return For privately visible zones, the set of Virtual Private Cloud
     * resources that the zone is visible from.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ManagedZonePrivateVisibilityConfig>> privateVisibilityConfig() {
        return Codegen.optional(this.privateVisibilityConfig);
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Specifies if this is a managed reverse lookup zone. If true, Cloud DNS will resolve reverse
     * lookup queries using automatically configured records for VPC resources. This only applies
     * to networks listed under `private_visibility_config`.
     * 
     */
    @Export(name="reverseLookup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> reverseLookup;

    /**
     * @return Specifies if this is a managed reverse lookup zone. If true, Cloud DNS will resolve reverse
     * lookup queries using automatically configured records for VPC resources. This only applies
     * to networks listed under `private_visibility_config`.
     * 
     */
    public Output<Optional<Boolean>> reverseLookup() {
        return Codegen.optional(this.reverseLookup);
    }
    /**
     * The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    @Export(name="serviceDirectoryConfig", type=ManagedZoneServiceDirectoryConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZoneServiceDirectoryConfig> serviceDirectoryConfig;

    /**
     * @return The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ManagedZoneServiceDirectoryConfig>> serviceDirectoryConfig() {
        return Codegen.optional(this.serviceDirectoryConfig);
    }
    /**
     * The zone&#39;s visibility: public zones are exposed to the Internet,
     * while private zones are visible only to Virtual Private Cloud resources.
     * Default value is `public`.
     * Possible values are `private` and `public`.
     * 
     */
    @Export(name="visibility", type=String.class, parameters={})
    private Output</* @Nullable */ String> visibility;

    /**
     * @return The zone&#39;s visibility: public zones are exposed to the Internet,
     * while private zones are visible only to Virtual Private Cloud resources.
     * Default value is `public`.
     * Possible values are `private` and `public`.
     * 
     */
    public Output<Optional<String>> visibility() {
        return Codegen.optional(this.visibility);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedZone(String name) {
        this(name, ManagedZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedZone(String name, ManagedZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedZone(String name, ManagedZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/managedZone:ManagedZone", name, args == null ? ManagedZoneArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedZone(String name, Output<String> id, @Nullable ManagedZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/managedZone:ManagedZone", name, state, makeResourceOptions(options, id));
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
    public static ManagedZone get(String name, Output<String> id, @Nullable ManagedZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedZone(name, id, state, options);
    }
}
