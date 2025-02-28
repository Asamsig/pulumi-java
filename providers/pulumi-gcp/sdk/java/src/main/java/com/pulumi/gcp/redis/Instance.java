// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.redis.InstanceArgs;
import com.pulumi.gcp.redis.inputs.InstanceState;
import com.pulumi.gcp.redis.outputs.InstanceMaintenancePolicy;
import com.pulumi.gcp.redis.outputs.InstanceMaintenanceSchedule;
import com.pulumi.gcp.redis.outputs.InstanceNode;
import com.pulumi.gcp.redis.outputs.InstanceServerCaCert;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Google Cloud Redis instance.
 * 
 * To get more information about Instance, see:
 * 
 * * [API documentation](https://cloud.google.com/memorystore/docs/redis/reference/rest/v1/projects.locations.instances)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/memorystore/docs/redis/)
 * 
 * ## Example Usage
 * ### Redis Instance Basic
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
 *         var cache = new Instance(&#34;cache&#34;, InstanceArgs.builder()        
 *             .memorySizeGb(1)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Redis Instance Full
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
 *         final var redis-network = Output.of(ComputeFunctions.getNetwork(GetNetworkArgs.builder()
 *             .name(&#34;redis-test-network&#34;)
 *             .build()));
 * 
 *         var cache = new Instance(&#34;cache&#34;, InstanceArgs.builder()        
 *             .tier(&#34;STANDARD_HA&#34;)
 *             .memorySizeGb(1)
 *             .locationId(&#34;us-central1-a&#34;)
 *             .alternativeLocationId(&#34;us-central1-f&#34;)
 *             .authorizedNetwork(redis_network.getId())
 *             .redisVersion(&#34;REDIS_4_0&#34;)
 *             .displayName(&#34;Test Instance&#34;)
 *             .reservedIpRange(&#34;192.168.0.0/29&#34;)
 *             .labels(Map.ofEntries(
 *                 Map.entry(&#34;my_key&#34;, &#34;my_val&#34;),
 *                 Map.entry(&#34;other_key&#34;, &#34;other_val&#34;)
 *             ))
 *             .maintenancePolicy(InstanceMaintenancePolicy.builder()
 *                 .weeklyMaintenanceWindows(InstanceMaintenancePolicyWeeklyMaintenanceWindow.builder()
 *                     .day(&#34;TUESDAY&#34;)
 *                     .startTime(InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime.builder()
 *                         .hours(0)
 *                         .minutes(30)
 *                         .seconds(0)
 *                         .nanos(0)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Redis Instance Private Service
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
 *         final var redis-network = Output.of(ComputeFunctions.getNetwork(GetNetworkArgs.builder()
 *             .name(&#34;redis-test-network&#34;)
 *             .build()));
 * 
 *         var serviceRange = new GlobalAddress(&#34;serviceRange&#34;, GlobalAddressArgs.builder()        
 *             .purpose(&#34;VPC_PEERING&#34;)
 *             .addressType(&#34;INTERNAL&#34;)
 *             .prefixLength(16)
 *             .network(redis_network.getId())
 *             .build());
 * 
 *         var privateServiceConnection = new Connection(&#34;privateServiceConnection&#34;, ConnectionArgs.builder()        
 *             .network(redis_network.getId())
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .reservedPeeringRanges(serviceRange.getName())
 *             .build());
 * 
 *         var cache = new Instance(&#34;cache&#34;, InstanceArgs.builder()        
 *             .tier(&#34;STANDARD_HA&#34;)
 *             .memorySizeGb(1)
 *             .locationId(&#34;us-central1-a&#34;)
 *             .alternativeLocationId(&#34;us-central1-f&#34;)
 *             .authorizedNetwork(redis_network.getId())
 *             .connectMode(&#34;PRIVATE_SERVICE_ACCESS&#34;)
 *             .redisVersion(&#34;REDIS_4_0&#34;)
 *             .displayName(&#34;Test Instance&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Redis Instance Mrr
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
 *         final var redis-network = Output.of(ComputeFunctions.getNetwork(GetNetworkArgs.builder()
 *             .name(&#34;redis-test-network&#34;)
 *             .build()));
 * 
 *         var cache = new Instance(&#34;cache&#34;, InstanceArgs.builder()        
 *             .tier(&#34;STANDARD_HA&#34;)
 *             .memorySizeGb(5)
 *             .locationId(&#34;us-central1-a&#34;)
 *             .alternativeLocationId(&#34;us-central1-f&#34;)
 *             .authorizedNetwork(redis_network.getId())
 *             .redisVersion(&#34;REDIS_6_X&#34;)
 *             .displayName(&#34;Terraform Test Instance&#34;)
 *             .reservedIpRange(&#34;192.168.0.0/28&#34;)
 *             .replicaCount(5)
 *             .readReplicasMode(&#34;READ_REPLICAS_ENABLED&#34;)
 *             .labels(Map.ofEntries(
 *                 Map.entry(&#34;my_key&#34;, &#34;my_val&#34;),
 *                 Map.entry(&#34;other_key&#34;, &#34;other_val&#34;)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Instance can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:redis/instance:Instance default projects/{{project}}/locations/{{region}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:redis/instance:Instance default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:redis/instance:Instance default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:redis/instance:Instance default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:redis/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Only applicable to STANDARD_HA tier which protects the instance
     * against zonal failures by provisioning it across two zones.
     * If provided, it must be a different zone from the one provided in
     * [locationId].
     * 
     */
    @Export(name="alternativeLocationId", type=String.class, parameters={})
    private Output<String> alternativeLocationId;

    /**
     * @return Only applicable to STANDARD_HA tier which protects the instance
     * against zonal failures by provisioning it across two zones.
     * If provided, it must be a different zone from the one provided in
     * [locationId].
     * 
     */
    public Output<String> alternativeLocationId() {
        return this.alternativeLocationId;
    }
    /**
     * Optional. Indicates whether OSS Redis AUTH is enabled for the
     * instance. If set to &#34;true&#34; AUTH is enabled on the instance.
     * Default value is &#34;false&#34; meaning AUTH is disabled.
     * 
     */
    @Export(name="authEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> authEnabled;

    /**
     * @return Optional. Indicates whether OSS Redis AUTH is enabled for the
     * instance. If set to &#34;true&#34; AUTH is enabled on the instance.
     * Default value is &#34;false&#34; meaning AUTH is disabled.
     * 
     */
    public Output<Optional<Boolean>> authEnabled() {
        return Codegen.optional(this.authEnabled);
    }
    /**
     * AUTH String set on the instance. This field will only be populated if auth_enabled is true.
     * 
     */
    @Export(name="authString", type=String.class, parameters={})
    private Output<String> authString;

    /**
     * @return AUTH String set on the instance. This field will only be populated if auth_enabled is true.
     * 
     */
    public Output<String> authString() {
        return this.authString;
    }
    /**
     * The full name of the Google Compute Engine network to which the
     * instance is connected. If left unspecified, the default network
     * will be used.
     * 
     */
    @Export(name="authorizedNetwork", type=String.class, parameters={})
    private Output<String> authorizedNetwork;

    /**
     * @return The full name of the Google Compute Engine network to which the
     * instance is connected. If left unspecified, the default network
     * will be used.
     * 
     */
    public Output<String> authorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * The connection mode of the Redis instance.
     * Default value is `DIRECT_PEERING`.
     * Possible values are `DIRECT_PEERING` and `PRIVATE_SERVICE_ACCESS`.
     * 
     */
    @Export(name="connectMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectMode;

    /**
     * @return The connection mode of the Redis instance.
     * Default value is `DIRECT_PEERING`.
     * Possible values are `DIRECT_PEERING` and `PRIVATE_SERVICE_ACCESS`.
     * 
     */
    public Output<Optional<String>> connectMode() {
        return Codegen.optional(this.connectMode);
    }
    /**
     * - 
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return -
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The current zone where the Redis endpoint is placed. For Basic Tier instances, this will always be the same as the
     * [locationId] provided by the user at creation time. For Standard Tier instances, this can be either [locationId] or
     * [alternativeLocationId] and can change after a failover event.
     * 
     */
    @Export(name="currentLocationId", type=String.class, parameters={})
    private Output<String> currentLocationId;

    /**
     * @return The current zone where the Redis endpoint is placed. For Basic Tier instances, this will always be the same as the
     * [locationId] provided by the user at creation time. For Standard Tier instances, this can be either [locationId] or
     * [alternativeLocationId] and can change after a failover event.
     * 
     */
    public Output<String> currentLocationId() {
        return this.currentLocationId;
    }
    /**
     * An arbitrary and optional user-provided name for the instance.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return An arbitrary and optional user-provided name for the instance.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Hostname or IP address of the exposed Redis endpoint used by clients to connect to the service.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return Hostname or IP address of the exposed Redis endpoint used by clients to connect to the service.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The zone where the instance will be provisioned. If not provided,
     * the service will choose a zone for the instance. For STANDARD_HA tier,
     * instances will be created across two zones for protection against
     * zonal failures. If [alternativeLocationId] is also provided, it must
     * be different from [locationId].
     * 
     */
    @Export(name="locationId", type=String.class, parameters={})
    private Output<String> locationId;

    /**
     * @return The zone where the instance will be provisioned. If not provided,
     * the service will choose a zone for the instance. For STANDARD_HA tier,
     * instances will be created across two zones for protection against
     * zonal failures. If [alternativeLocationId] is also provided, it must
     * be different from [locationId].
     * 
     */
    public Output<String> locationId() {
        return this.locationId;
    }
    /**
     * Maintenance policy for an instance.
     * Structure is documented below.
     * 
     */
    @Export(name="maintenancePolicy", type=InstanceMaintenancePolicy.class, parameters={})
    private Output</* @Nullable */ InstanceMaintenancePolicy> maintenancePolicy;

    /**
     * @return Maintenance policy for an instance.
     * Structure is documented below.
     * 
     */
    public Output<Optional<InstanceMaintenancePolicy>> maintenancePolicy() {
        return Codegen.optional(this.maintenancePolicy);
    }
    /**
     * Upcoming maintenance schedule.
     * Structure is documented below.
     * 
     */
    @Export(name="maintenanceSchedule", type=InstanceMaintenanceSchedule.class, parameters={})
    private Output</* @Nullable */ InstanceMaintenanceSchedule> maintenanceSchedule;

    /**
     * @return Upcoming maintenance schedule.
     * Structure is documented below.
     * 
     */
    public Output<Optional<InstanceMaintenanceSchedule>> maintenanceSchedule() {
        return Codegen.optional(this.maintenanceSchedule);
    }
    /**
     * Redis memory size in GiB.
     * 
     */
    @Export(name="memorySizeGb", type=Integer.class, parameters={})
    private Output<Integer> memorySizeGb;

    /**
     * @return Redis memory size in GiB.
     * 
     */
    public Output<Integer> memorySizeGb() {
        return this.memorySizeGb;
    }
    /**
     * The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Output only. Info per node.
     * 
     */
    @Export(name="nodes", type=List.class, parameters={InstanceNode.class})
    private Output<List<InstanceNode>> nodes;

    /**
     * @return Output only. Info per node.
     * 
     */
    public Output<List<InstanceNode>> nodes() {
        return this.nodes;
    }
    /**
     * Output only. Cloud IAM identity used by import / export operations to transfer data to/from Cloud Storage. Format is
     * &#34;serviceAccount:&#34;. The value may change over time for a given instance so should be checked before each import/export
     * operation.
     * 
     */
    @Export(name="persistenceIamIdentity", type=String.class, parameters={})
    private Output<String> persistenceIamIdentity;

    /**
     * @return Output only. Cloud IAM identity used by import / export operations to transfer data to/from Cloud Storage. Format is
     * &#34;serviceAccount:&#34;. The value may change over time for a given instance so should be checked before each import/export
     * operation.
     * 
     */
    public Output<String> persistenceIamIdentity() {
        return this.persistenceIamIdentity;
    }
    /**
     * The port number of the exposed Redis endpoint.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port number of the exposed Redis endpoint.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Output only. Hostname or IP address of the exposed readonly Redis endpoint. Standard tier only. Targets all healthy
     * replica nodes in instance. Replication is asynchronous and replica nodes will exhibit some lag behind the primary. Write
     * requests must target &#39;host&#39;.
     * 
     */
    @Export(name="readEndpoint", type=String.class, parameters={})
    private Output<String> readEndpoint;

    /**
     * @return Output only. Hostname or IP address of the exposed readonly Redis endpoint. Standard tier only. Targets all healthy
     * replica nodes in instance. Replication is asynchronous and replica nodes will exhibit some lag behind the primary. Write
     * requests must target &#39;host&#39;.
     * 
     */
    public Output<String> readEndpoint() {
        return this.readEndpoint;
    }
    /**
     * Output only. The port number of the exposed readonly redis endpoint. Standard tier only. Write requests should target
     * &#39;port&#39;.
     * 
     */
    @Export(name="readEndpointPort", type=Integer.class, parameters={})
    private Output<Integer> readEndpointPort;

    /**
     * @return Output only. The port number of the exposed readonly redis endpoint. Standard tier only. Write requests should target
     * &#39;port&#39;.
     * 
     */
    public Output<Integer> readEndpointPort() {
        return this.readEndpointPort;
    }
    /**
     * Optional. Read replica mode. Can only be specified when trying to create the instance.
     * If not set, Memorystore Redis backend will default to READ_REPLICAS_DISABLED.
     * - READ_REPLICAS_DISABLED: If disabled, read endpoint will not be provided and the
     *   instance cannot scale up or down the number of replicas.
     * - READ_REPLICAS_ENABLED: If enabled, read endpoint will be provided and the instance
     *   can scale up and down the number of replicas.
     *   Possible values are `READ_REPLICAS_DISABLED` and `READ_REPLICAS_ENABLED`.
     * 
     */
    @Export(name="readReplicasMode", type=String.class, parameters={})
    private Output<String> readReplicasMode;

    /**
     * @return Optional. Read replica mode. Can only be specified when trying to create the instance.
     * If not set, Memorystore Redis backend will default to READ_REPLICAS_DISABLED.
     * - READ_REPLICAS_DISABLED: If disabled, read endpoint will not be provided and the
     *   instance cannot scale up or down the number of replicas.
     * - READ_REPLICAS_ENABLED: If enabled, read endpoint will be provided and the instance
     *   can scale up and down the number of replicas.
     *   Possible values are `READ_REPLICAS_DISABLED` and `READ_REPLICAS_ENABLED`.
     * 
     */
    public Output<String> readReplicasMode() {
        return this.readReplicasMode;
    }
    /**
     * Redis configuration parameters, according to http://redis.io/topics/config.
     * Please check Memorystore documentation for the list of supported parameters:
     * https://cloud.google.com/memorystore/docs/redis/reference/rest/v1/projects.locations.instances#Instance.FIELDS.redis_configs
     * 
     */
    @Export(name="redisConfigs", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> redisConfigs;

    /**
     * @return Redis configuration parameters, according to http://redis.io/topics/config.
     * Please check Memorystore documentation for the list of supported parameters:
     * https://cloud.google.com/memorystore/docs/redis/reference/rest/v1/projects.locations.instances#Instance.FIELDS.redis_configs
     * 
     */
    public Output<Optional<Map<String,String>>> redisConfigs() {
        return Codegen.optional(this.redisConfigs);
    }
    /**
     * The version of Redis software. If not provided, latest supported
     * version will be used. Please check the API documentation linked
     * at the top for the latest valid values.
     * 
     */
    @Export(name="redisVersion", type=String.class, parameters={})
    private Output<String> redisVersion;

    /**
     * @return The version of Redis software. If not provided, latest supported
     * version will be used. Please check the API documentation linked
     * at the top for the latest valid values.
     * 
     */
    public Output<String> redisVersion() {
        return this.redisVersion;
    }
    /**
     * The name of the Redis region of the instance.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The name of the Redis region of the instance.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Optional. The number of replica nodes. The valid range for the Standard Tier with
     * read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled
     * for a Standard Tier instance, the only valid value is 1 and the default is 1.
     * The valid value for basic tier is 0 and the default is also 0.
     * 
     */
    @Export(name="replicaCount", type=Integer.class, parameters={})
    private Output<Integer> replicaCount;

    /**
     * @return Optional. The number of replica nodes. The valid range for the Standard Tier with
     * read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled
     * for a Standard Tier instance, the only valid value is 1 and the default is 1.
     * The valid value for basic tier is 0 and the default is also 0.
     * 
     */
    public Output<Integer> replicaCount() {
        return this.replicaCount;
    }
    /**
     * The CIDR range of internal addresses that are reserved for this
     * instance. If not provided, the service will choose an unused /29
     * block, for example, 10.0.0.0/29 or 192.168.0.0/29. Ranges must be
     * unique and non-overlapping with existing subnets in an authorized
     * network.
     * 
     */
    @Export(name="reservedIpRange", type=String.class, parameters={})
    private Output<String> reservedIpRange;

    /**
     * @return The CIDR range of internal addresses that are reserved for this
     * instance. If not provided, the service will choose an unused /29
     * block, for example, 10.0.0.0/29 or 192.168.0.0/29. Ranges must be
     * unique and non-overlapping with existing subnets in an authorized
     * network.
     * 
     */
    public Output<String> reservedIpRange() {
        return this.reservedIpRange;
    }
    /**
     * Optional. Additional IP range for node placement. Required when enabling read replicas on
     * an existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or
     * &#34;auto&#34;. For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address
     * range associated with the private service access connection, or &#34;auto&#34;.
     * 
     */
    @Export(name="secondaryIpRange", type=String.class, parameters={})
    private Output<String> secondaryIpRange;

    /**
     * @return Optional. Additional IP range for node placement. Required when enabling read replicas on
     * an existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or
     * &#34;auto&#34;. For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address
     * range associated with the private service access connection, or &#34;auto&#34;.
     * 
     */
    public Output<String> secondaryIpRange() {
        return this.secondaryIpRange;
    }
    /**
     * List of server CA certificates for the instance.
     * 
     */
    @Export(name="serverCaCerts", type=List.class, parameters={InstanceServerCaCert.class})
    private Output<List<InstanceServerCaCert>> serverCaCerts;

    /**
     * @return List of server CA certificates for the instance.
     * 
     */
    public Output<List<InstanceServerCaCert>> serverCaCerts() {
        return this.serverCaCerts;
    }
    /**
     * The service tier of the instance. Must be one of these values:
     * - BASIC: standalone instance
     * - STANDARD_HA: highly available primary/replica instances
     *   Default value is `BASIC`.
     *   Possible values are `BASIC` and `STANDARD_HA`.
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output</* @Nullable */ String> tier;

    /**
     * @return The service tier of the instance. Must be one of these values:
     * - BASIC: standalone instance
     * - STANDARD_HA: highly available primary/replica instances
     *   Default value is `BASIC`.
     *   Possible values are `BASIC` and `STANDARD_HA`.
     * 
     */
    public Output<Optional<String>> tier() {
        return Codegen.optional(this.tier);
    }
    /**
     * The TLS mode of the Redis instance, If not provided, TLS is disabled for the instance.
     * - SERVER_AUTHENTICATION: Client to Server traffic encryption enabled with server authentication
     *   Default value is `DISABLED`.
     *   Possible values are `SERVER_AUTHENTICATION` and `DISABLED`.
     * 
     */
    @Export(name="transitEncryptionMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitEncryptionMode;

    /**
     * @return The TLS mode of the Redis instance, If not provided, TLS is disabled for the instance.
     * - SERVER_AUTHENTICATION: Client to Server traffic encryption enabled with server authentication
     *   Default value is `DISABLED`.
     *   Possible values are `SERVER_AUTHENTICATION` and `DISABLED`.
     * 
     */
    public Output<Optional<String>> transitEncryptionMode() {
        return Codegen.optional(this.transitEncryptionMode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:redis/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:redis/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
