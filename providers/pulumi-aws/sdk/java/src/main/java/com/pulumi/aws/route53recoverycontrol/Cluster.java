// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoverycontrol;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53recoverycontrol.ClusterArgs;
import com.pulumi.aws.route53recoverycontrol.inputs.ClusterState;
import com.pulumi.aws.route53recoverycontrol.outputs.ClusterClusterEndpoint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an AWS Route 53 Recovery Control Config Cluster.
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
 *         var example = new Cluster(&#34;example&#34;);
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Route53 Recovery Control Config cluster can be imported via the cluster ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53recoverycontrol/cluster:Cluster mycluster arn:aws:route53-recovery-control::313517334327:cluster/f9ae13be-a11e-4ec7-8522-94a70468e6ea
 * ```
 * 
 */
@ResourceType(type="aws:route53recoverycontrol/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the cluster
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the cluster
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * List of 5 endpoints in 5 regions that can be used to talk to the cluster. See below.
     * 
     */
    @Export(name="clusterEndpoints", type=List.class, parameters={ClusterClusterEndpoint.class})
    private Output<List<ClusterClusterEndpoint>> clusterEndpoints;

    /**
     * @return List of 5 endpoints in 5 regions that can be used to talk to the cluster. See below.
     * 
     */
    public Output<List<ClusterClusterEndpoint>> clusterEndpoints() {
        return this.clusterEndpoints;
    }
    /**
     * Unique name describing the cluster.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name describing the cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Status of cluster. `PENDING` when it is being created, `PENDING_DELETION` when it is being deleted and `DEPLOYED` otherwise.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of cluster. `PENDING` when it is being created, `PENDING_DELETION` when it is being deleted and `DEPLOYED` otherwise.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, @Nullable ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoverycontrol/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoverycontrol/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
