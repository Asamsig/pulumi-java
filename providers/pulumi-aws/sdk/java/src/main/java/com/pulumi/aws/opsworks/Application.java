// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opsworks.ApplicationArgs;
import com.pulumi.aws.opsworks.inputs.ApplicationState;
import com.pulumi.aws.opsworks.outputs.ApplicationAppSource;
import com.pulumi.aws.opsworks.outputs.ApplicationEnvironment;
import com.pulumi.aws.opsworks.outputs.ApplicationSslConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an OpsWorks application resource.
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
 *         var foo_app = new Application(&#34;foo-app&#34;, ApplicationArgs.builder()        
 *             .shortName(&#34;foobar&#34;)
 *             .stackId(aws_opsworks_stack.getMain().getId())
 *             .type(&#34;rails&#34;)
 *             .description(&#34;This is a Rails application&#34;)
 *             .domains(            
 *                 &#34;example.com&#34;,
 *                 &#34;sub.example.com&#34;)
 *             .environments(ApplicationEnvironment.builder()
 *                 .key(&#34;key&#34;)
 *                 .value(&#34;value&#34;)
 *                 .secure(false)
 *                 .build())
 *             .appSources(ApplicationAppSource.builder()
 *                 .type(&#34;git&#34;)
 *                 .revision(&#34;master&#34;)
 *                 .url(&#34;https://github.com/example.git&#34;)
 *                 .build())
 *             .enableSsl(true)
 *             .sslConfigurations(ApplicationSslConfiguration.builder()
 *                 .privateKey(Files.readString(&#34;./foobar.key&#34;))
 *                 .certificate(Files.readString(&#34;./foobar.crt&#34;))
 *                 .build())
 *             .documentRoot(&#34;public&#34;)
 *             .autoBundleOnDeploy(true)
 *             .railsEnv(&#34;staging&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Opsworks Application can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:opsworks/application:Application test &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="aws:opsworks/application:Application")
public class Application extends com.pulumi.resources.CustomResource {
    /**
     * SCM configuration of the app as described below.
     * 
     */
    @Export(name="appSources", type=List.class, parameters={ApplicationAppSource.class})
    private Output<List<ApplicationAppSource>> appSources;

    /**
     * @return SCM configuration of the app as described below.
     * 
     */
    public Output<List<ApplicationAppSource>> appSources() {
        return this.appSources;
    }
    /**
     * Run bundle install when deploying for application of type `rails`.
     * 
     */
    @Export(name="autoBundleOnDeploy", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoBundleOnDeploy;

    /**
     * @return Run bundle install when deploying for application of type `rails`.
     * 
     */
    public Output<Optional<String>> autoBundleOnDeploy() {
        return Codegen.optional(this.autoBundleOnDeploy);
    }
    /**
     * Specify activity and workflow workers for your app using the aws-flow gem.
     * 
     */
    @Export(name="awsFlowRubySettings", type=String.class, parameters={})
    private Output</* @Nullable */ String> awsFlowRubySettings;

    /**
     * @return Specify activity and workflow workers for your app using the aws-flow gem.
     * 
     */
    public Output<Optional<String>> awsFlowRubySettings() {
        return Codegen.optional(this.awsFlowRubySettings);
    }
    /**
     * The data source&#39;s ARN.
     * 
     */
    @Export(name="dataSourceArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataSourceArn;

    /**
     * @return The data source&#39;s ARN.
     * 
     */
    public Output<Optional<String>> dataSourceArn() {
        return Codegen.optional(this.dataSourceArn);
    }
    /**
     * The database name.
     * 
     */
    @Export(name="dataSourceDatabaseName", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataSourceDatabaseName;

    /**
     * @return The database name.
     * 
     */
    public Output<Optional<String>> dataSourceDatabaseName() {
        return Codegen.optional(this.dataSourceDatabaseName);
    }
    /**
     * The data source&#39;s type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
     * 
     */
    @Export(name="dataSourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataSourceType;

    /**
     * @return The data source&#39;s type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
     * 
     */
    public Output<Optional<String>> dataSourceType() {
        return Codegen.optional(this.dataSourceType);
    }
    /**
     * A description of the app.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the app.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Subfolder for the document root for application of type `rails`.
     * 
     */
    @Export(name="documentRoot", type=String.class, parameters={})
    private Output</* @Nullable */ String> documentRoot;

    /**
     * @return Subfolder for the document root for application of type `rails`.
     * 
     */
    public Output<Optional<String>> documentRoot() {
        return Codegen.optional(this.documentRoot);
    }
    /**
     * A list of virtual host alias.
     * 
     */
    @Export(name="domains", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> domains;

    /**
     * @return A list of virtual host alias.
     * 
     */
    public Output<Optional<List<String>>> domains() {
        return Codegen.optional(this.domains);
    }
    /**
     * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
     * 
     */
    @Export(name="enableSsl", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableSsl;

    /**
     * @return Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
     * 
     */
    public Output<Optional<Boolean>> enableSsl() {
        return Codegen.optional(this.enableSsl);
    }
    /**
     * Object to define environment variables.  Object is described below.
     * 
     */
    @Export(name="environments", type=List.class, parameters={ApplicationEnvironment.class})
    private Output</* @Nullable */ List<ApplicationEnvironment>> environments;

    /**
     * @return Object to define environment variables.  Object is described below.
     * 
     */
    public Output<Optional<List<ApplicationEnvironment>>> environments() {
        return Codegen.optional(this.environments);
    }
    /**
     * A human-readable name for the application.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A human-readable name for the application.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Rails environment for application of type `rails`.
     * 
     */
    @Export(name="railsEnv", type=String.class, parameters={})
    private Output</* @Nullable */ String> railsEnv;

    /**
     * @return The name of the Rails environment for application of type `rails`.
     * 
     */
    public Output<Optional<String>> railsEnv() {
        return Codegen.optional(this.railsEnv);
    }
    /**
     * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }
    /**
     * The SSL configuration of the app. Object is described below.
     * 
     */
    @Export(name="sslConfigurations", type=List.class, parameters={ApplicationSslConfiguration.class})
    private Output</* @Nullable */ List<ApplicationSslConfiguration>> sslConfigurations;

    /**
     * @return The SSL configuration of the app. Object is described below.
     * 
     */
    public Output<Optional<List<ApplicationSslConfiguration>>> sslConfigurations() {
        return Codegen.optional(this.sslConfigurations);
    }
    /**
     * The id of the stack the application will belong to.
     * 
     */
    @Export(name="stackId", type=String.class, parameters={})
    private Output<String> stackId;

    /**
     * @return The id of the stack the application will belong to.
     * 
     */
    public Output<String> stackId() {
        return this.stackId;
    }
    /**
     * Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/application:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/application:Application", name, state, makeResourceOptions(options, id));
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
    public static Application get(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, state, options);
    }
}
