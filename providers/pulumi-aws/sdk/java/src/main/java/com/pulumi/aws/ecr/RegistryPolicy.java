// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecr.RegistryPolicyArgs;
import com.pulumi.aws.ecr.inputs.RegistryPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Container Registry Policy.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var currentCallerIdentity = Output.of(AwsFunctions.getCallerIdentity());
 * 
 *         final var currentRegion = Output.of(AwsFunctions.getRegion());
 * 
 *         final var currentPartition = Output.of(AwsFunctions.getPartition());
 * 
 *         var example = new RegistryPolicy(&#34;example&#34;, RegistryPolicyArgs.builder()        
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Sid&#34;, &#34;testpolicy&#34;),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Principal&#34;, jsonObject(
 *                             jsonProperty(&#34;AWS&#34;, String.format(&#34;arn:%s:iam::%s:root&#34;, currentPartition.apply(getPartitionResult -&gt; getPartitionResult.getPartition()),currentCallerIdentity.apply(getCallerIdentityResult -&gt; getCallerIdentityResult.getAccountId())))
 *                         )),
 *                         jsonProperty(&#34;Action&#34;, jsonArray(&#34;ecr:ReplicateImage&#34;)),
 *                         jsonProperty(&#34;Resource&#34;, jsonArray(String.format(&#34;arn:%s:ecr:%s:%s:repository/*&#34;, currentPartition.apply(getPartitionResult -&gt; getPartitionResult.getPartition()),currentRegion.apply(getRegionResult -&gt; getRegionResult.getName()),currentCallerIdentity.apply(getCallerIdentityResult -&gt; getCallerIdentityResult.getAccountId()))))
 *                     )))
 *                 )))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECR Registry Policy can be imported using the registry id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecr/registryPolicy:RegistryPolicy example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:ecr/registryPolicy:RegistryPolicy")
public class RegistryPolicy extends com.pulumi.resources.CustomResource {
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The registry ID where the registry was created.
     * 
     */
    @Export(name="registryId", type=String.class, parameters={})
    private Output<String> registryId;

    /**
     * @return The registry ID where the registry was created.
     * 
     */
    public Output<String> registryId() {
        return this.registryId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryPolicy(String name) {
        this(name, RegistryPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryPolicy(String name, RegistryPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryPolicy(String name, RegistryPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/registryPolicy:RegistryPolicy", name, args == null ? RegistryPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegistryPolicy(String name, Output<String> id, @Nullable RegistryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/registryPolicy:RegistryPolicy", name, state, makeResourceOptions(options, id));
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
    public static RegistryPolicy get(String name, Output<String> id, @Nullable RegistryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryPolicy(name, id, state, options);
    }
}
