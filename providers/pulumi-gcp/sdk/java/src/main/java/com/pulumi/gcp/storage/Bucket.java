// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.storage.BucketArgs;
import com.pulumi.gcp.storage.inputs.BucketState;
import com.pulumi.gcp.storage.outputs.BucketCor;
import com.pulumi.gcp.storage.outputs.BucketEncryption;
import com.pulumi.gcp.storage.outputs.BucketLifecycleRule;
import com.pulumi.gcp.storage.outputs.BucketLogging;
import com.pulumi.gcp.storage.outputs.BucketRetentionPolicy;
import com.pulumi.gcp.storage.outputs.BucketVersioning;
import com.pulumi.gcp.storage.outputs.BucketWebsite;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new bucket in Google cloud storage service (GCS).
 * Once a bucket has been created, its location can&#39;t be changed.
 * 
 * For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/overview)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
 * 
 * **Note**: If the project id is not set on the resource or in the provider block it will be dynamically
 * determined which will require enabling the compute api.
 * 
 * ## Example Usage
 * ### Creating A Private Bucket In Standard Storage, In The EU Region. Bucket Configured As Static Website And CORS Configurations
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
 *         var static_site = new Bucket(&#34;static-site&#34;, BucketArgs.builder()        
 *             .cors(BucketCor.builder()
 *                 .maxAgeSeconds(3600)
 *                 .methods(                
 *                     &#34;GET&#34;,
 *                     &#34;HEAD&#34;,
 *                     &#34;PUT&#34;,
 *                     &#34;POST&#34;,
 *                     &#34;DELETE&#34;)
 *                 .origins(&#34;http://image-store.com&#34;)
 *                 .responseHeaders(&#34;*&#34;)
 *                 .build())
 *             .forceDestroy(true)
 *             .location(&#34;EU&#34;)
 *             .uniformBucketLevelAccess(true)
 *             .website(BucketWebsite.builder()
 *                 .mainPageSuffix(&#34;index.html&#34;)
 *                 .notFoundPage(&#34;404.html&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Life Cycle Settings For Storage Bucket Objects
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
 *         var auto_expire = new Bucket(&#34;auto-expire&#34;, BucketArgs.builder()        
 *             .forceDestroy(true)
 *             .lifecycleRules(BucketLifecycleRule.builder()
 *                 .action(BucketLifecycleRuleAction.builder()
 *                     .type(&#34;Delete&#34;)
 *                     .build())
 *                 .condition(BucketLifecycleRuleCondition.builder()
 *                     .age(3)
 *                     .build())
 *                 .build())
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Storage buckets can be imported using the `name` or
 * 
 * `project/name`. If the project is not passed to the import command it will be inferred from the provider block or environment variables. If it cannot be inferred it will be queried from the Compute API (this will fail if the API is not enabled). e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:storage/bucket:Bucket image-store image-store-bucket
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:storage/bucket:Bucket image-store tf-test-project/image-store-bucket
 * ```
 * 
 *  `false` in state. If you&#39;ve set it to `true` in config, run `terraform apply` to update the value set in state. If you delete this resource before updating the value, objects in the bucket will not be destroyed.
 * 
 */
@ResourceType(type="gcp:storage/bucket:Bucket")
public class Bucket extends com.pulumi.resources.CustomResource {
    /**
     * The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @Export(name="cors", type=List.class, parameters={BucketCor.class})
    private Output</* @Nullable */ List<BucketCor>> cors;

    /**
     * @return The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    public Output<Optional<List<BucketCor>>> cors() {
        return Codegen.optional(this.cors);
    }
    /**
     * Whether or not to automatically apply an eventBasedHold to new objects added to the bucket.
     * 
     */
    @Export(name="defaultEventBasedHold", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> defaultEventBasedHold;

    /**
     * @return Whether or not to automatically apply an eventBasedHold to new objects added to the bucket.
     * 
     */
    public Output<Optional<Boolean>> defaultEventBasedHold() {
        return Codegen.optional(this.defaultEventBasedHold);
    }
    /**
     * The bucket&#39;s encryption configuration. Structure is documented below.
     * 
     */
    @Export(name="encryption", type=BucketEncryption.class, parameters={})
    private Output</* @Nullable */ BucketEncryption> encryption;

    /**
     * @return The bucket&#39;s encryption configuration. Structure is documented below.
     * 
     */
    public Output<Optional<BucketEncryption>> encryption() {
        return Codegen.optional(this.encryption);
    }
    /**
     * When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * A map of key/value label pairs to assign to the bucket.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A map of key/value label pairs to assign to the bucket.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @Export(name="lifecycleRules", type=List.class, parameters={BucketLifecycleRule.class})
    private Output</* @Nullable */ List<BucketLifecycleRule>> lifecycleRules;

    /**
     * @return The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    public Output<Optional<List<BucketLifecycleRule>>> lifecycleRules() {
        return Codegen.optional(this.lifecycleRules);
    }
    /**
     * The [GCS location](https://cloud.google.com/storage/docs/bucket-locations)
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The [GCS location](https://cloud.google.com/storage/docs/bucket-locations)
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * 
     */
    @Export(name="logging", type=BucketLogging.class, parameters={})
    private Output</* @Nullable */ BucketLogging> logging;

    /**
     * @return The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * 
     */
    public Output<Optional<BucketLogging>> logging() {
        return Codegen.optional(this.logging);
    }
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Prevents public access to a bucket.
     * 
     */
    @Export(name="publicAccessPrevention", type=String.class, parameters={})
    private Output<String> publicAccessPrevention;

    /**
     * @return Prevents public access to a bucket.
     * 
     */
    public Output<String> publicAccessPrevention() {
        return this.publicAccessPrevention;
    }
    /**
     * Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    @Export(name="requesterPays", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requesterPays;

    /**
     * @return Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    public Output<Optional<Boolean>> requesterPays() {
        return Codegen.optional(this.requesterPays);
    }
    /**
     * Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    @Export(name="retentionPolicy", type=BucketRetentionPolicy.class, parameters={})
    private Output</* @Nullable */ BucketRetentionPolicy> retentionPolicy;

    /**
     * @return Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    public Output<Optional<BucketRetentionPolicy>> retentionPolicy() {
        return Codegen.optional(this.retentionPolicy);
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The target [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects affected by this Lifecycle Rule. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    @Export(name="storageClass", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageClass;

    /**
     * @return The target [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects affected by this Lifecycle Rule. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    public Output<Optional<String>> storageClass() {
        return Codegen.optional(this.storageClass);
    }
    /**
     * Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    @Export(name="uniformBucketLevelAccess", type=Boolean.class, parameters={})
    private Output<Boolean> uniformBucketLevelAccess;

    /**
     * @return Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    public Output<Boolean> uniformBucketLevelAccess() {
        return this.uniformBucketLevelAccess;
    }
    /**
     * The base URL of the bucket, in the format `gs://&lt;bucket-name&gt;`.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The base URL of the bucket, in the format `gs://&lt;bucket-name&gt;`.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    @Export(name="versioning", type=BucketVersioning.class, parameters={})
    private Output</* @Nullable */ BucketVersioning> versioning;

    /**
     * @return The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    public Output<Optional<BucketVersioning>> versioning() {
        return Codegen.optional(this.versioning);
    }
    /**
     * Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    @Export(name="website", type=BucketWebsite.class, parameters={})
    private Output</* @Nullable */ BucketWebsite> website;

    /**
     * @return Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    public Output<Optional<BucketWebsite>> website() {
        return Codegen.optional(this.website);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bucket(String name) {
        this(name, BucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bucket(String name, BucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bucket(String name, BucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucket:Bucket", name, args == null ? BucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Bucket(String name, Output<String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucket:Bucket", name, state, makeResourceOptions(options, id));
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
    public static Bucket get(String name, Output<String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Bucket(name, id, state, options);
    }
}
