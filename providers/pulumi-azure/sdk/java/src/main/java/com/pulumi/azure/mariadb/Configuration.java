// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mariadb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mariadb.ConfigurationArgs;
import com.pulumi.azure.mariadb.inputs.ConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Sets a MariaDB Configuration value on a MariaDB Server.
 * 
 * ## Example Usage
 * 
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleServer = new Server(&#34;exampleServer&#34;, ServerArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .skuName(&#34;B_Gen5_2&#34;)
 *             .storageProfile(Map.ofEntries(
 *                 Map.entry(&#34;storageMb&#34;, 5120),
 *                 Map.entry(&#34;backupRetentionDays&#34;, 7),
 *                 Map.entry(&#34;geoRedundantBackup&#34;, &#34;Disabled&#34;)
 *             ))
 *             .administratorLogin(&#34;mariadbadmin&#34;)
 *             .administratorLoginPassword(&#34;H@Sh1CoR3!&#34;)
 *             .version(&#34;10.2&#34;)
 *             .sslEnforcement(&#34;Enabled&#34;)
 *             .build());
 * 
 *         var exampleConfiguration = new Configuration(&#34;exampleConfiguration&#34;, ConfigurationArgs.builder()        
 *             .name(&#34;interactive_timeout&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .serverName(exampleServer.getName())
 *             .value(&#34;600&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * MariaDB Configurations can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mariadb/configuration:Configuration interactive_timeout /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforMariaDB/servers/server1/configurations/interactive_timeout
 * ```
 * 
 */
@ResourceType(type="azure:mariadb/configuration:Configuration")
public class Configuration extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of the MariaDB Configuration, which needs [to be a valid MariaDB configuration name](https://mariadb.com/kb/en/library/server-system-variables/). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the MariaDB Configuration, which needs [to be a valid MariaDB configuration name](https://mariadb.com/kb/en/library/server-system-variables/). Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the MariaDB Server exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the MariaDB Server exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies the name of the MariaDB Server. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serverName", type=String.class, parameters={})
    private Output<String> serverName;

    /**
     * @return Specifies the name of the MariaDB Server. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }
    /**
     * Specifies the value of the MariaDB Configuration. See the MariaDB documentation for valid values.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Specifies the value of the MariaDB Configuration. See the MariaDB documentation for valid values.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Configuration(String name) {
        this(name, ConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Configuration(String name, ConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Configuration(String name, ConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mariadb/configuration:Configuration", name, args == null ? ConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Configuration(String name, Output<String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mariadb/configuration:Configuration", name, state, makeResourceOptions(options, id));
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
    public static Configuration get(String name, Output<String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Configuration(name, id, state, options);
    }
}
