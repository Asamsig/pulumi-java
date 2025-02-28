// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.sql.DatabaseInstanceArgs;
import com.pulumi.gcp.sql.inputs.DatabaseInstanceState;
import com.pulumi.gcp.sql.outputs.DatabaseInstanceClone;
import com.pulumi.gcp.sql.outputs.DatabaseInstanceIpAddress;
import com.pulumi.gcp.sql.outputs.DatabaseInstanceReplicaConfiguration;
import com.pulumi.gcp.sql.outputs.DatabaseInstanceRestoreBackupContext;
import com.pulumi.gcp.sql.outputs.DatabaseInstanceServerCaCert;
import com.pulumi.gcp.sql.outputs.DatabaseInstanceSettings;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Google SQL Database Instance. For more information, see the [official documentation](https://cloud.google.com/sql/),
 * or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/instances).
 * 
 * &gt; **NOTE on `gcp.sql.DatabaseInstance`:** - Second-generation instances include a
 * default &#39;root&#39;@&#39;%&#39; user with no password. This user will be deleted by the provider on
 * instance creation. You should use `gcp.sql.User` to define a custom user with
 * a restricted host and strong password.
 * 
 * &gt; **Note**: On newer versions of the provider, you must explicitly set `deletion_protection=false`
 * (and run `pulumi update` to write the field to state) in order to destroy an instance.
 * It is recommended to not set this field (or set it to true) until you&#39;re ready to destroy the instance and its databases.
 * 
 * ## Example Usage
 * ### SQL Second Generation Instance
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
 *         var main = new DatabaseInstance(&#34;main&#34;, DatabaseInstanceArgs.builder()        
 *             .databaseVersion(&#34;POSTGRES_11&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .settings(DatabaseInstanceSettings.builder()
 *                 .tier(&#34;db-f1-micro&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Private IP Instance
 * &gt; **NOTE:** For private IP instance setup, note that the `gcp.sql.DatabaseInstance` does not actually interpolate values from `gcp.servicenetworking.Connection`. You must explicitly add a `depends_on`reference as shown below.
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
 *         var privateNetwork = new Network(&#34;privateNetwork&#34;);
 * 
 *         var privateIpAddress = new GlobalAddress(&#34;privateIpAddress&#34;, GlobalAddressArgs.builder()        
 *             .purpose(&#34;VPC_PEERING&#34;)
 *             .addressType(&#34;INTERNAL&#34;)
 *             .prefixLength(16)
 *             .network(privateNetwork.getId())
 *             .build());
 * 
 *         var privateVpcConnection = new Connection(&#34;privateVpcConnection&#34;, ConnectionArgs.builder()        
 *             .network(privateNetwork.getId())
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .reservedPeeringRanges(privateIpAddress.getName())
 *             .build());
 * 
 *         var dbNameSuffix = new RandomId(&#34;dbNameSuffix&#34;, RandomIdArgs.builder()        
 *             .byteLength(4)
 *             .build());
 * 
 *         var instance = new DatabaseInstance(&#34;instance&#34;, DatabaseInstanceArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .databaseVersion(&#34;MYSQL_5_7&#34;)
 *             .settings(DatabaseInstanceSettings.builder()
 *                 .tier(&#34;db-f1-micro&#34;)
 *                 .ipConfiguration(DatabaseInstanceSettingsIpConfiguration.builder()
 *                     .ipv4Enabled(false)
 *                     .privateNetwork(privateNetwork.getId())
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
 * Database instances can be imported using one of any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:sql/databaseInstance:DatabaseInstance main projects/{{project}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sql/databaseInstance:DatabaseInstance main {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sql/databaseInstance:DatabaseInstance main {{name}}
 * ```
 * 
 *  config and set on the server. When importing, double-check that your config has all the fields set that you expect- just seeing no diff isn&#39;t sufficient to know that your config could reproduce the imported resource.
 * 
 */
@ResourceType(type="gcp:sql/databaseInstance:DatabaseInstance")
public class DatabaseInstance extends com.pulumi.resources.CustomResource {
    /**
     * The context needed to create this instance as a clone of another instance. When this field is set during
     * resource creation, this provider will attempt to clone another instance as indicated in the context. The
     * configuration is detailed below.
     * 
     */
    @Export(name="clone", type=DatabaseInstanceClone.class, parameters={})
    private Output</* @Nullable */ DatabaseInstanceClone> clone;

    /**
     * @return The context needed to create this instance as a clone of another instance. When this field is set during
     * resource creation, this provider will attempt to clone another instance as indicated in the context. The
     * configuration is detailed below.
     * 
     */
    public Output<Optional<DatabaseInstanceClone>> clone_() {
        return Codegen.optional(this.clone);
    }
    /**
     * The connection name of the instance to be used in
     * connection strings. For example, when connecting with [Cloud SQL Proxy](https://cloud.google.com/sql/docs/mysql/connect-admin-proxy).
     * 
     */
    @Export(name="connectionName", type=String.class, parameters={})
    private Output<String> connectionName;

    /**
     * @return The connection name of the instance to be used in
     * connection strings. For example, when connecting with [Cloud SQL Proxy](https://cloud.google.com/sql/docs/mysql/connect-admin-proxy).
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }
    /**
     * The MySQL, PostgreSQL or
     * SQL Server version to use. Supported values include `MYSQL_5_6`,
     * `MYSQL_5_7`, `MYSQL_8_0`, `POSTGRES_9_6`,`POSTGRES_10`, `POSTGRES_11`,
     * `POSTGRES_12`, `POSTGRES_13`, `SQLSERVER_2017_STANDARD`,
     * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`.
     * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`,
     * `SQLSERVER_2019_WEB`.
     * [Database Version Policies](https://cloud.google.com/sql/docs/db-versions)
     * includes an up-to-date reference of supported versions.
     * 
     */
    @Export(name="databaseVersion", type=String.class, parameters={})
    private Output<String> databaseVersion;

    /**
     * @return The MySQL, PostgreSQL or
     * SQL Server version to use. Supported values include `MYSQL_5_6`,
     * `MYSQL_5_7`, `MYSQL_8_0`, `POSTGRES_9_6`,`POSTGRES_10`, `POSTGRES_11`,
     * `POSTGRES_12`, `POSTGRES_13`, `SQLSERVER_2017_STANDARD`,
     * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`.
     * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`,
     * `SQLSERVER_2019_WEB`.
     * [Database Version Policies](https://cloud.google.com/sql/docs/db-versions)
     * includes an up-to-date reference of supported versions.
     * 
     */
    public Output<String> databaseVersion() {
        return this.databaseVersion;
    }
    /**
     * Whether or not to allow he provider to destroy the instance. Unless this field is set to false
     * in state, a `destroy` or `update` command that deletes the instance will fail.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return Whether or not to allow he provider to destroy the instance. Unless this field is set to false
     * in state, a `destroy` or `update` command that deletes the instance will fail.
     * 
     */
    public Output<Optional<Boolean>> deletionProtection() {
        return Codegen.optional(this.deletionProtection);
    }
    /**
     * The full path to the encryption key used for the CMEK disk encryption.  Setting
     * up disk encryption currently requires manual steps outside of this provider.
     * The provided key must be in the same region as the SQL instance.  In order
     * to use this feature, a special kind of service account must be created and
     * granted permission on this key.  This step can currently only be done
     * manually, please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#service-account).
     * That service account needs the `Cloud KMS &gt; Cloud KMS CryptoKey Encrypter/Decrypter` role on your
     * key - please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#grantkey).
     * 
     */
    @Export(name="encryptionKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionKeyName;

    /**
     * @return The full path to the encryption key used for the CMEK disk encryption.  Setting
     * up disk encryption currently requires manual steps outside of this provider.
     * The provided key must be in the same region as the SQL instance.  In order
     * to use this feature, a special kind of service account must be created and
     * granted permission on this key.  This step can currently only be done
     * manually, please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#service-account).
     * That service account needs the `Cloud KMS &gt; Cloud KMS CryptoKey Encrypter/Decrypter` role on your
     * key - please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#grantkey).
     * 
     */
    public Output<Optional<String>> encryptionKeyName() {
        return Codegen.optional(this.encryptionKeyName);
    }
    /**
     * The first IPv4 address of any type assigned.
     * 
     */
    @Export(name="firstIpAddress", type=String.class, parameters={})
    private Output<String> firstIpAddress;

    /**
     * @return The first IPv4 address of any type assigned.
     * 
     */
    public Output<String> firstIpAddress() {
        return this.firstIpAddress;
    }
    @Export(name="ipAddresses", type=List.class, parameters={DatabaseInstanceIpAddress.class})
    private Output<List<DatabaseInstanceIpAddress>> ipAddresses;

    public Output<List<DatabaseInstanceIpAddress>> ipAddresses() {
        return this.ipAddresses;
    }
    /**
     * The name of the existing instance that will
     * act as the master in the replication setup. Note, this requires the master to
     * have `binary_log_enabled` set, as well as existing backups.
     * 
     */
    @Export(name="masterInstanceName", type=String.class, parameters={})
    private Output<String> masterInstanceName;

    /**
     * @return The name of the existing instance that will
     * act as the master in the replication setup. Note, this requires the master to
     * have `binary_log_enabled` set, as well as existing backups.
     * 
     */
    public Output<String> masterInstanceName() {
        return this.masterInstanceName;
    }
    /**
     * A name for this whitelist entry.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for this whitelist entry.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The first private (`PRIVATE`) IPv4 address assigned.
     * 
     */
    @Export(name="privateIpAddress", type=String.class, parameters={})
    private Output<String> privateIpAddress;

    /**
     * @return The first private (`PRIVATE`) IPv4 address assigned.
     * 
     */
    public Output<String> privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * The full project ID of the source instance.`
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The full project ID of the source instance.`
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The first public (`PRIMARY`) IPv4 address assigned.
     * 
     */
    @Export(name="publicIpAddress", type=String.class, parameters={})
    private Output<String> publicIpAddress;

    /**
     * @return The first public (`PRIMARY`) IPv4 address assigned.
     * 
     */
    public Output<String> publicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * The region the instance will sit in. If a region is not provided in the resource definition,
     * the provider region will be used instead.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region the instance will sit in. If a region is not provided in the resource definition,
     * the provider region will be used instead.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The configuration for replication. The
     * configuration is detailed below. Valid only for MySQL instances.
     * 
     */
    @Export(name="replicaConfiguration", type=DatabaseInstanceReplicaConfiguration.class, parameters={})
    private Output<DatabaseInstanceReplicaConfiguration> replicaConfiguration;

    /**
     * @return The configuration for replication. The
     * configuration is detailed below. Valid only for MySQL instances.
     * 
     */
    public Output<DatabaseInstanceReplicaConfiguration> replicaConfiguration() {
        return this.replicaConfiguration;
    }
    /**
     * The context needed to restore the database to a backup run. This field will
     * cause the provider to trigger the database to restore from the backup run indicated. The configuration is detailed below.
     * **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     * block during resource creation/update will trigger the restore action after the resource is created/updated.
     * 
     */
    @Export(name="restoreBackupContext", type=DatabaseInstanceRestoreBackupContext.class, parameters={})
    private Output</* @Nullable */ DatabaseInstanceRestoreBackupContext> restoreBackupContext;

    /**
     * @return The context needed to restore the database to a backup run. This field will
     * cause the provider to trigger the database to restore from the backup run indicated. The configuration is detailed below.
     * **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     * block during resource creation/update will trigger the restore action after the resource is created/updated.
     * 
     */
    public Output<Optional<DatabaseInstanceRestoreBackupContext>> restoreBackupContext() {
        return Codegen.optional(this.restoreBackupContext);
    }
    /**
     * Initial root password. Required for MS SQL Server, ignored by MySQL and PostgreSQL.
     * 
     */
    @Export(name="rootPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> rootPassword;

    /**
     * @return Initial root password. Required for MS SQL Server, ignored by MySQL and PostgreSQL.
     * 
     */
    public Output<Optional<String>> rootPassword() {
        return Codegen.optional(this.rootPassword);
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
    @Export(name="serverCaCerts", type=List.class, parameters={DatabaseInstanceServerCaCert.class})
    private Output<List<DatabaseInstanceServerCaCert>> serverCaCerts;

    public Output<List<DatabaseInstanceServerCaCert>> serverCaCerts() {
        return this.serverCaCerts;
    }
    /**
     * The service account email address assigned to the
     * instance.
     * 
     */
    @Export(name="serviceAccountEmailAddress", type=String.class, parameters={})
    private Output<String> serviceAccountEmailAddress;

    /**
     * @return The service account email address assigned to the
     * instance.
     * 
     */
    public Output<String> serviceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }
    /**
     * The settings to use for the database. The
     * configuration is detailed below. Required if `clone` is not set.
     * 
     */
    @Export(name="settings", type=DatabaseInstanceSettings.class, parameters={})
    private Output<DatabaseInstanceSettings> settings;

    /**
     * @return The settings to use for the database. The
     * configuration is detailed below. Required if `clone` is not set.
     * 
     */
    public Output<DatabaseInstanceSettings> settings() {
        return this.settings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseInstance(String name) {
        this(name, DatabaseInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseInstance(String name, DatabaseInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseInstance(String name, DatabaseInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sql/databaseInstance:DatabaseInstance", name, args == null ? DatabaseInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseInstance(String name, Output<String> id, @Nullable DatabaseInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sql/databaseInstance:DatabaseInstance", name, state, makeResourceOptions(options, id));
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
    public static DatabaseInstance get(String name, Output<String> id, @Nullable DatabaseInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseInstance(name, id, state, options);
    }
}
