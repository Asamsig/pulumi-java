// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs;
import com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeState;
import com.pulumi.gcp.vertex.outputs.AiFeatureStoreEntityTypeMonitoringConfig;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Vertex Ai Featurestore Entitytype
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
 *         var featurestore = new AiFeatureStore(&#34;featurestore&#34;, AiFeatureStoreArgs.builder()        
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .region(&#34;us-central1&#34;)
 *             .onlineServingConfig(AiFeatureStoreOnlineServingConfig.builder()
 *                 .fixedNodeCount(2)
 *                 .build())
 *             .build());
 * 
 *         var entity = new AiFeatureStoreEntityType(&#34;entity&#34;, AiFeatureStoreEntityTypeArgs.builder()        
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .featurestore(featurestore.getId())
 *             .monitoringConfig(AiFeatureStoreEntityTypeMonitoringConfig.builder()
 *                 .snapshotAnalysis(AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis.builder()
 *                     .disabled(false)
 *                     .monitoringInterval(&#34;86400s&#34;)
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
 * FeaturestoreEntitytype can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiFeatureStoreEntityType:AiFeatureStoreEntityType default {{featurestore}}/entityTypes/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vertex/aiFeatureStoreEntityType:AiFeatureStoreEntityType")
public class AiFeatureStoreEntityType extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp of when the featurestore was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp of when the featurestore was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Used to perform consistent read-modify-write updates.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Used to perform consistent read-modify-write updates.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}.
     * 
     */
    @Export(name="featurestore", type=String.class, parameters={})
    private Output<String> featurestore;

    /**
     * @return The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}.
     * 
     */
    public Output<String> featurestore() {
        return this.featurestore;
    }
    /**
     * A set of key/value label pairs to assign to this EntityType.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this EntityType.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The default monitoring configuration for all Features under this EntityType.
     * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     * Structure is documented below.
     * 
     */
    @Export(name="monitoringConfig", type=AiFeatureStoreEntityTypeMonitoringConfig.class, parameters={})
    private Output</* @Nullable */ AiFeatureStoreEntityTypeMonitoringConfig> monitoringConfig;

    /**
     * @return The default monitoring configuration for all Features under this EntityType.
     * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AiFeatureStoreEntityTypeMonitoringConfig>> monitoringConfig() {
        return Codegen.optional(this.monitoringConfig);
    }
    /**
     * The name of the EntityType. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the EntityType. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The timestamp of when the featurestore was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
     * to nine fractional digits.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp of when the featurestore was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up
     * to nine fractional digits.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AiFeatureStoreEntityType(String name) {
        this(name, AiFeatureStoreEntityTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AiFeatureStoreEntityType(String name, AiFeatureStoreEntityTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AiFeatureStoreEntityType(String name, AiFeatureStoreEntityTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiFeatureStoreEntityType:AiFeatureStoreEntityType", name, args == null ? AiFeatureStoreEntityTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AiFeatureStoreEntityType(String name, Output<String> id, @Nullable AiFeatureStoreEntityTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiFeatureStoreEntityType:AiFeatureStoreEntityType", name, state, makeResourceOptions(options, id));
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
    public static AiFeatureStoreEntityType get(String name, Output<String> id, @Nullable AiFeatureStoreEntityTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AiFeatureStoreEntityType(name, id, state, options);
    }
}
