// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2transitgateway.ConnectPeerArgs;
import com.pulumi.aws.ec2transitgateway.inputs.ConnectPeerState;
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
 * Manages an EC2 Transit Gateway Connect Peer.
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
 *         var exampleConnect = new Connect(&#34;exampleConnect&#34;, ConnectArgs.builder()        
 *             .transportAttachmentId(aws_ec2_transit_gateway_vpc_attachment.getExample().getId())
 *             .transitGatewayId(aws_ec2_transit_gateway.getExample().getId())
 *             .build());
 * 
 *         var exampleConnectPeer = new ConnectPeer(&#34;exampleConnectPeer&#34;, ConnectPeerArgs.builder()        
 *             .peerAddress(&#34;10.1.2.3&#34;)
 *             .insideCidrBlocks(&#34;169.254.100.0/29&#34;)
 *             .transitGatewayAttachmentId(exampleConnect.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_ec2_transit_gateway_connect_peer` can be imported by using the EC2 Transit Gateway Connect Peer identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/connectPeer:ConnectPeer example tgw-connect-peer-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/connectPeer:ConnectPeer")
public class ConnectPeer extends com.pulumi.resources.CustomResource {
    /**
     * EC2 Transit Gateway Connect Peer ARN
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return EC2 Transit Gateway Connect Peer ARN
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The BGP ASN number assigned customer device. If not provided, it will use the same BGP ASN as is associated with Transit Gateway.
     * 
     */
    @Export(name="bgpAsn", type=String.class, parameters={})
    private Output<String> bgpAsn;

    /**
     * @return The BGP ASN number assigned customer device. If not provided, it will use the same BGP ASN as is associated with Transit Gateway.
     * 
     */
    public Output<String> bgpAsn() {
        return this.bgpAsn;
    }
    /**
     * The CIDR block that will be used for addressing within the tunnel. It must contain exactly one IPv4 CIDR block and up to one IPv6 CIDR block. The IPv4 CIDR block must be /29 size and must be within 169.254.0.0/16 range, with exception of: 169.254.0.0/29, 169.254.1.0/29, 169.254.2.0/29, 169.254.3.0/29, 169.254.4.0/29, 169.254.5.0/29, 169.254.169.248/29. The IPv6 CIDR block must be /125 size and must be within fd00::/8. The first IP from each CIDR block is assigned for customer gateway, the second and third is for Transit Gateway (An example: from range 169.254.100.0/29, .1 is assigned to customer gateway and .2 and .3 are assigned to Transit Gateway)
     * 
     */
    @Export(name="insideCidrBlocks", type=List.class, parameters={String.class})
    private Output<List<String>> insideCidrBlocks;

    /**
     * @return The CIDR block that will be used for addressing within the tunnel. It must contain exactly one IPv4 CIDR block and up to one IPv6 CIDR block. The IPv4 CIDR block must be /29 size and must be within 169.254.0.0/16 range, with exception of: 169.254.0.0/29, 169.254.1.0/29, 169.254.2.0/29, 169.254.3.0/29, 169.254.4.0/29, 169.254.5.0/29, 169.254.169.248/29. The IPv6 CIDR block must be /125 size and must be within fd00::/8. The first IP from each CIDR block is assigned for customer gateway, the second and third is for Transit Gateway (An example: from range 169.254.100.0/29, .1 is assigned to customer gateway and .2 and .3 are assigned to Transit Gateway)
     * 
     */
    public Output<List<String>> insideCidrBlocks() {
        return this.insideCidrBlocks;
    }
    /**
     * The IP addressed assigned to customer device, which will be used as tunnel endpoint. It can be IPv4 or IPv6 address, but must be the same address family as `transit_gateway_address`
     * 
     */
    @Export(name="peerAddress", type=String.class, parameters={})
    private Output<String> peerAddress;

    /**
     * @return The IP addressed assigned to customer device, which will be used as tunnel endpoint. It can be IPv4 or IPv6 address, but must be the same address family as `transit_gateway_address`
     * 
     */
    public Output<String> peerAddress() {
        return this.peerAddress;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The IP address assigned to Transit Gateway, which will be used as tunnel endpoint. This address must be from associated Transit Gateway CIDR block. The address must be from the same address family as `peer_address`. If not set explicitly, it will be selected from associated Transit Gateway CIDR blocks
     * 
     */
    @Export(name="transitGatewayAddress", type=String.class, parameters={})
    private Output<String> transitGatewayAddress;

    /**
     * @return The IP address assigned to Transit Gateway, which will be used as tunnel endpoint. This address must be from associated Transit Gateway CIDR block. The address must be from the same address family as `peer_address`. If not set explicitly, it will be selected from associated Transit Gateway CIDR blocks
     * 
     */
    public Output<String> transitGatewayAddress() {
        return this.transitGatewayAddress;
    }
    /**
     * The Transit Gateway Connect
     * 
     */
    @Export(name="transitGatewayAttachmentId", type=String.class, parameters={})
    private Output<String> transitGatewayAttachmentId;

    /**
     * @return The Transit Gateway Connect
     * 
     */
    public Output<String> transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectPeer(String name) {
        this(name, ConnectPeerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectPeer(String name, ConnectPeerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectPeer(String name, ConnectPeerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/connectPeer:ConnectPeer", name, args == null ? ConnectPeerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectPeer(String name, Output<String> id, @Nullable ConnectPeerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/connectPeer:ConnectPeer", name, state, makeResourceOptions(options, id));
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
    public static ConnectPeer get(String name, Output<String> id, @Nullable ConnectPeerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectPeer(name, id, state, options);
    }
}
