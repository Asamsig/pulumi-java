// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.JobCredentialArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A stored credential that can be used by a job to connect to target databases.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * ### Create or update a credential
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
 *         var jobCredential = new JobCredential(&#34;jobCredential&#34;, JobCredentialArgs.builder()        
 *             .credentialName(&#34;cred1&#34;)
 *             .jobAgentName(&#34;agent1&#34;)
 *             .password(&#34;&lt;password&gt;&#34;)
 *             .resourceGroupName(&#34;group1&#34;)
 *             .serverName(&#34;server1&#34;)
 *             .username(&#34;myuser&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:JobCredential cred1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1/credentials/cred1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:JobCredential")
public class JobCredential extends com.pulumi.resources.CustomResource {
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The credential user name.
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output<String> username;

    /**
     * @return The credential user name.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobCredential(String name) {
        this(name, JobCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobCredential(String name, JobCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobCredential(String name, JobCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobCredential", name, args == null ? JobCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobCredential(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobCredential", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20170301preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:JobCredential").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:JobCredential").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static JobCredential get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JobCredential(name, id, options);
    }
}
