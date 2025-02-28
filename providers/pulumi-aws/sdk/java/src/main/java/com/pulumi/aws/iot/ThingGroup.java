// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iot.ThingGroupArgs;
import com.pulumi.aws.iot.inputs.ThingGroupState;
import com.pulumi.aws.iot.outputs.ThingGroupMetadata;
import com.pulumi.aws.iot.outputs.ThingGroupProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an AWS IoT Thing Group.
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
 *         var parent = new ThingGroup(&#34;parent&#34;);
 * 
 *         var example = new ThingGroup(&#34;example&#34;, ThingGroupArgs.builder()        
 *             .parentGroupName(parent.getName())
 *             .properties(ThingGroupProperties.builder()
 *                 .attributePayload(ThingGroupPropertiesAttributePayload.builder()
 *                     .attributes(Map.ofEntries(
 *                         Map.entry(&#34;One&#34;, &#34;11111&#34;),
 *                         Map.entry(&#34;Two&#34;, &#34;TwoTwo&#34;)
 *                     ))
 *                     .build())
 *                 .description(&#34;This is my thing group&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;terraform&#34;, &#34;true&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * IoT Things Groups can be imported using the name, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:iot/thingGroup:ThingGroup example example
 * ```
 * 
 */
@ResourceType(type="aws:iot/thingGroup:ThingGroup")
public class ThingGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Thing Group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Thing Group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="metadatas", type=List.class, parameters={ThingGroupMetadata.class})
    private Output<List<ThingGroupMetadata>> metadatas;

    public Output<List<ThingGroupMetadata>> metadatas() {
        return this.metadatas;
    }
    /**
     * The name of the Thing Group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Thing Group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the parent Thing Group.
     * 
     */
    @Export(name="parentGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> parentGroupName;

    /**
     * @return The name of the parent Thing Group.
     * 
     */
    public Output<Optional<String>> parentGroupName() {
        return Codegen.optional(this.parentGroupName);
    }
    /**
     * The Thing Group properties. Defined below.
     * 
     */
    @Export(name="properties", type=ThingGroupProperties.class, parameters={})
    private Output</* @Nullable */ ThingGroupProperties> properties;

    /**
     * @return The Thing Group properties. Defined below.
     * 
     */
    public Output<Optional<ThingGroupProperties>> properties() {
        return Codegen.optional(this.properties);
    }
    /**
     * Key-value mapping of resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The current version of the Thing Group record in the registry.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return The current version of the Thing Group record in the registry.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ThingGroup(String name) {
        this(name, ThingGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ThingGroup(String name, @Nullable ThingGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ThingGroup(String name, @Nullable ThingGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/thingGroup:ThingGroup", name, args == null ? ThingGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ThingGroup(String name, Output<String> id, @Nullable ThingGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/thingGroup:ThingGroup", name, state, makeResourceOptions(options, id));
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
    public static ThingGroup get(String name, Output<String> id, @Nullable ThingGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ThingGroup(name, id, state, options);
    }
}
