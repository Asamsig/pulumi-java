// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediastore;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.mediastore.ContainerPolicyArgs;
import com.pulumi.aws.mediastore.inputs.ContainerPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a MediaStore Container Policy.
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
 *         final var currentRegion = Output.of(AwsFunctions.getRegion());
 * 
 *         final var currentCallerIdentity = Output.of(AwsFunctions.getCallerIdentity());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;);
 * 
 *         var exampleContainerPolicy = new ContainerPolicy(&#34;exampleContainerPolicy&#34;, ContainerPolicyArgs.builder()        
 *             .containerName(exampleContainer.getName())
 *             .policy(exampleContainer.getName().apply(name -&gt; &#34;&#34;&#34;
 * {
 * 	&#34;Version&#34;: &#34;2012-10-17&#34;,
 * 	&#34;Statement&#34;: [{
 * 		&#34;Sid&#34;: &#34;MediaStoreFullAccess&#34;,
 * 		&#34;Action&#34;: [ &#34;mediastore:*&#34; ],
 * 		&#34;Principal&#34;: {&#34;AWS&#34; : &#34;arn:aws:iam::%s:root&#34;},
 * 		&#34;Effect&#34;: &#34;Allow&#34;,
 * 		&#34;Resource&#34;: &#34;arn:aws:mediastore:%s:%s:container/%s/*&#34;,
 * 		&#34;Condition&#34;: {
 * 			&#34;Bool&#34;: { &#34;aws:SecureTransport&#34;: &#34;true&#34; }
 * 		}
 * 	}]
 * }
 * &#34;, currentCallerIdentity.apply(getCallerIdentityResult -&gt; getCallerIdentityResult.getAccountId()),currentRegion.apply(getRegionResult -&gt; getRegionResult.getName()),currentCallerIdentity.apply(getCallerIdentityResult -&gt; getCallerIdentityResult.getAccountId()),name)))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * MediaStore Container Policy can be imported using the MediaStore Container Name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:mediastore/containerPolicy:ContainerPolicy example example
 * ```
 * 
 */
@ResourceType(type="aws:mediastore/containerPolicy:ContainerPolicy")
public class ContainerPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the container.
     * 
     */
    @Export(name="containerName", type=String.class, parameters={})
    private Output<String> containerName;

    /**
     * @return The name of the container.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }
    /**
     * The contents of the policy.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The contents of the policy.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerPolicy(String name) {
        this(name, ContainerPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerPolicy(String name, ContainerPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerPolicy(String name, ContainerPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mediastore/containerPolicy:ContainerPolicy", name, args == null ? ContainerPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerPolicy(String name, Output<String> id, @Nullable ContainerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mediastore/containerPolicy:ContainerPolicy", name, state, makeResourceOptions(options, id));
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
    public static ContainerPolicy get(String name, Output<String> id, @Nullable ContainerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerPolicy(name, id, state, options);
    }
}
