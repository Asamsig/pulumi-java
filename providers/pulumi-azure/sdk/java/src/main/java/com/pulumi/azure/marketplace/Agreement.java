// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.marketplace;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.marketplace.AgreementArgs;
import com.pulumi.azure.marketplace.inputs.AgreementState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows accepting the Legal Terms for a Marketplace Image.
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
 *         var barracuda = new Agreement(&#34;barracuda&#34;, AgreementArgs.builder()        
 *             .offer(&#34;waf&#34;)
 *             .plan(&#34;hourly&#34;)
 *             .publisher(&#34;barracudanetworks&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Marketplace Agreement can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:marketplace/agreement:Agreement example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.MarketplaceOrdering/agreements/publisher1/offers/offer1/plans/plan1
 * ```
 * 
 */
@ResourceType(type="azure:marketplace/agreement:Agreement")
public class Agreement extends com.pulumi.resources.CustomResource {
    @Export(name="licenseTextLink", type=String.class, parameters={})
    private Output<String> licenseTextLink;

    public Output<String> licenseTextLink() {
        return this.licenseTextLink;
    }
    /**
     * The Offer of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="offer", type=String.class, parameters={})
    private Output<String> offer;

    /**
     * @return The Offer of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> offer() {
        return this.offer;
    }
    /**
     * The Plan of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="plan", type=String.class, parameters={})
    private Output<String> plan;

    /**
     * @return The Plan of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }
    @Export(name="privacyPolicyLink", type=String.class, parameters={})
    private Output<String> privacyPolicyLink;

    public Output<String> privacyPolicyLink() {
        return this.privacyPolicyLink;
    }
    /**
     * The Publisher of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="publisher", type=String.class, parameters={})
    private Output<String> publisher;

    /**
     * @return The Publisher of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Agreement(String name) {
        this(name, AgreementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Agreement(String name, AgreementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Agreement(String name, AgreementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:marketplace/agreement:Agreement", name, args == null ? AgreementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Agreement(String name, Output<String> id, @Nullable AgreementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:marketplace/agreement:Agreement", name, state, makeResourceOptions(options, id));
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
    public static Agreement get(String name, Output<String> id, @Nullable AgreementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Agreement(name, id, state, options);
    }
}
