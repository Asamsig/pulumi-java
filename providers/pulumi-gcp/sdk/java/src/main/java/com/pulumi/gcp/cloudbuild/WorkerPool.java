// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.cloudbuild.WorkerPoolArgs;
import com.pulumi.gcp.cloudbuild.inputs.WorkerPoolState;
import com.pulumi.gcp.cloudbuild.outputs.WorkerPoolNetworkConfig;
import com.pulumi.gcp.cloudbuild.outputs.WorkerPoolWorkerConfig;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Definition of custom Cloud Build WorkerPools for running jobs with custom configuration and custom networking.
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
 *         var pool = new WorkerPool(&#34;pool&#34;, WorkerPoolArgs.builder()        
 *             .location(&#34;europe-west1&#34;)
 *             .workerConfig(WorkerPoolWorkerConfig.builder()
 *                 .diskSizeGb(100)
 *                 .machineType(&#34;e2-standard-4&#34;)
 *                 .noExternalIp(false)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Network Config
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
 *         var servicenetworking = new Service(&#34;servicenetworking&#34;, ServiceArgs.builder()        
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .disableOnDestroy(false)
 *             .build());
 * 
 *         var network = new Network(&#34;network&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var workerRange = new GlobalAddress(&#34;workerRange&#34;, GlobalAddressArgs.builder()        
 *             .purpose(&#34;VPC_PEERING&#34;)
 *             .addressType(&#34;INTERNAL&#34;)
 *             .prefixLength(16)
 *             .network(network.getId())
 *             .build());
 * 
 *         var workerPoolConn = new Connection(&#34;workerPoolConn&#34;, ConnectionArgs.builder()        
 *             .network(network.getId())
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .reservedPeeringRanges(workerRange.getName())
 *             .build());
 * 
 *         var pool = new WorkerPool(&#34;pool&#34;, WorkerPoolArgs.builder()        
 *             .location(&#34;europe-west1&#34;)
 *             .workerConfig(WorkerPoolWorkerConfig.builder()
 *                 .diskSizeGb(100)
 *                 .machineType(&#34;e2-standard-4&#34;)
 *                 .noExternalIp(false)
 *                 .build())
 *             .networkConfig(WorkerPoolNetworkConfig.builder()
 *                 .peeredNetwork(network.getId())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * WorkerPool can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:cloudbuild/workerPool:WorkerPool default projects/{{project}}/locations/{{location}}/workerPools/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudbuild/workerPool:WorkerPool default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudbuild/workerPool:WorkerPool default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:cloudbuild/workerPool:WorkerPool")
public class WorkerPool extends com.pulumi.resources.CustomResource {
    /**
     * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
     * limitations.
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> annotations;

    /**
     * @return User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
     * limitations.
     * 
     */
    public Output<Optional<Map<String,String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * Output only. Time at which the request to create the `WorkerPool` was received.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. Time at which the request to create the `WorkerPool` was received.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Output only. Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return Output only. Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The location for the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * User-defined name of the `WorkerPool`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User-defined name of the `WorkerPool`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network configuration for the `WorkerPool`. Structure is documented below.
     * 
     */
    @Export(name="networkConfig", type=WorkerPoolNetworkConfig.class, parameters={})
    private Output</* @Nullable */ WorkerPoolNetworkConfig> networkConfig;

    /**
     * @return Network configuration for the `WorkerPool`. Structure is documented below.
     * 
     */
    public Output<Optional<WorkerPoolNetworkConfig>> networkConfig() {
        return Codegen.optional(this.networkConfig);
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Output only. `WorkerPool` state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Output only. `WorkerPool` state. Possible values: STATE_UNSPECIFIED, PENDING, APPROVED, REJECTED, CANCELLED
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Output only. A unique identifier for the `WorkerPool`.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Output only. A unique identifier for the `WorkerPool`.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Output only. Time at which the request to update the `WorkerPool` was received.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. Time at which the request to update the `WorkerPool` was received.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
     * 
     */
    @Export(name="workerConfig", type=WorkerPoolWorkerConfig.class, parameters={})
    private Output<WorkerPoolWorkerConfig> workerConfig;

    /**
     * @return Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
     * 
     */
    public Output<WorkerPoolWorkerConfig> workerConfig() {
        return this.workerConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerPool(String name) {
        this(name, WorkerPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerPool(String name, WorkerPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerPool(String name, WorkerPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudbuild/workerPool:WorkerPool", name, args == null ? WorkerPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkerPool(String name, Output<String> id, @Nullable WorkerPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudbuild/workerPool:WorkerPool", name, state, makeResourceOptions(options, id));
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
    public static WorkerPool get(String name, Output<String> id, @Nullable WorkerPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkerPool(name, id, state, options);
    }
}
