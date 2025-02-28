// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.peering.PeerAsnArgs;
import com.pulumi.azurenative.peering.outputs.ContactDetailResponse;
import com.pulumi.core.Alias;
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
 * The essential information related to the peer&#39;s ASN.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * ### Create a peer ASN
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
 *         var peerAsn = new PeerAsn(&#34;peerAsn&#34;, PeerAsnArgs.builder()        
 *             .peerAsn(65000)
 *             .peerAsnName(&#34;peerAsnName&#34;)
 *             .peerContactDetail(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;email&#34;, &#34;noc@contoso.com&#34;),
 *                     Map.entry(&#34;phone&#34;, &#34;+1 (234) 567-8999&#34;),
 *                     Map.entry(&#34;role&#34;, &#34;Noc&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;email&#34;, &#34;abc@contoso.com&#34;),
 *                     Map.entry(&#34;phone&#34;, &#34;+1 (234) 567-8900&#34;),
 *                     Map.entry(&#34;role&#34;, &#34;Policy&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;email&#34;, &#34;xyz@contoso.com&#34;),
 *                     Map.entry(&#34;phone&#34;, &#34;+1 (234) 567-8900&#34;),
 *                     Map.entry(&#34;role&#34;, &#34;Technical&#34;)
 *                 ))
 *             .peerName(&#34;Contoso&#34;)
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
 * $ pulumi import azure-native:peering:PeerAsn peerAsnName /subscriptions/subId/providers/Microsoft.Peering/peerAsns/peerAsnName 
 * ```
 * 
 */
@ResourceType(type="azure-native:peering:PeerAsn")
public class PeerAsn extends com.pulumi.resources.CustomResource {
    /**
     * The error message for the validation state
     * 
     */
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return The error message for the validation state
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Autonomous System Number (ASN) of the peer.
     * 
     */
    @Export(name="peerAsn", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> peerAsn;

    /**
     * @return The Autonomous System Number (ASN) of the peer.
     * 
     */
    public Output<Optional<Integer>> peerAsn() {
        return Codegen.optional(this.peerAsn);
    }
    /**
     * The contact details of the peer.
     * 
     */
    @Export(name="peerContactDetail", type=List.class, parameters={ContactDetailResponse.class})
    private Output</* @Nullable */ List<ContactDetailResponse>> peerContactDetail;

    /**
     * @return The contact details of the peer.
     * 
     */
    public Output<Optional<List<ContactDetailResponse>>> peerContactDetail() {
        return Codegen.optional(this.peerContactDetail);
    }
    /**
     * The name of the peer.
     * 
     */
    @Export(name="peerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerName;

    /**
     * @return The name of the peer.
     * 
     */
    public Output<Optional<String>> peerName() {
        return Codegen.optional(this.peerName);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The validation state of the ASN associated with the peer.
     * 
     */
    @Export(name="validationState", type=String.class, parameters={})
    private Output</* @Nullable */ String> validationState;

    /**
     * @return The validation state of the ASN associated with the peer.
     * 
     */
    public Output<Optional<String>> validationState() {
        return Codegen.optional(this.validationState);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PeerAsn(String name) {
        this(name, PeerAsnArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PeerAsn(String name, @Nullable PeerAsnArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PeerAsn(String name, @Nullable PeerAsnArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:PeerAsn", name, args == null ? PeerAsnArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PeerAsn(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:PeerAsn", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:peering/v20190801preview:PeerAsn").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20190901preview:PeerAsn").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20200101preview:PeerAsn").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20200401:PeerAsn").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20201001:PeerAsn").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20210101:PeerAsn").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20210601:PeerAsn").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20220101:PeerAsn").build())
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
    public static PeerAsn get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PeerAsn(name, id, options);
    }
}
