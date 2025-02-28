// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.privatedns.CnameRecordArgs;
import com.pulumi.azure.privatedns.inputs.CnameRecordState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Enables you to manage DNS CNAME Records within Azure Private DNS.
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
 *         var exampleZone = new Zone(&#34;exampleZone&#34;, ZoneArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleCnameRecord = new CnameRecord(&#34;exampleCnameRecord&#34;, CnameRecordArgs.builder()        
 *             .zoneName(exampleZone.getName())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .ttl(300)
 *             .record(&#34;contoso.com&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Private DNS CName Records can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:privatedns/cnameRecord:CnameRecord example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/privateDnsZones/zone1/CNAME/myrecord1
 * ```
 * 
 */
@ResourceType(type="azure:privatedns/cnameRecord:CnameRecord")
public class CnameRecord extends com.pulumi.resources.CustomResource {
    /**
     * The FQDN of the DNS CNAME Record.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return The FQDN of the DNS CNAME Record.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * The name of the DNS CNAME Record.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the DNS CNAME Record.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The target of the CNAME.
     * 
     */
    @Export(name="record", type=String.class, parameters={})
    private Output<String> record;

    /**
     * @return The target of the CNAME.
     * 
     */
    public Output<String> record() {
        return this.record;
    }
    /**
     * Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output<Integer> ttl;

    /**
     * @return The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="zoneName", type=String.class, parameters={})
    private Output<String> zoneName;

    /**
     * @return Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CnameRecord(String name) {
        this(name, CnameRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CnameRecord(String name, CnameRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CnameRecord(String name, CnameRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/cnameRecord:CnameRecord", name, args == null ? CnameRecordArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CnameRecord(String name, Output<String> id, @Nullable CnameRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/cnameRecord:CnameRecord", name, state, makeResourceOptions(options, id));
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
    public static CnameRecord get(String name, Output<String> id, @Nullable CnameRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CnameRecord(name, id, state, options);
    }
}
