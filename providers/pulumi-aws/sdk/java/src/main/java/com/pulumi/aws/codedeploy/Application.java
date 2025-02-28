// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codedeploy.ApplicationArgs;
import com.pulumi.aws.codedeploy.inputs.ApplicationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CodeDeploy application to be used as a basis for deployments
 * 
 * ## Example Usage
 * ### ECS Application
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
 *         var example = new Application(&#34;example&#34;, ApplicationArgs.builder()        
 *             .computePlatform(&#34;ECS&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Lambda Application
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
 *         var example = new Application(&#34;example&#34;, ApplicationArgs.builder()        
 *             .computePlatform(&#34;Lambda&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Server Application
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
 *         var example = new Application(&#34;example&#34;, ApplicationArgs.builder()        
 *             .computePlatform(&#34;Server&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * CodeDeploy Applications can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codedeploy/application:Application example my-application
 * ```
 * 
 */
@ResourceType(type="aws:codedeploy/application:Application")
public class Application extends com.pulumi.resources.CustomResource {
    /**
     * The application ID.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * The ARN of the CodeDeploy application.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the CodeDeploy application.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
     * 
     */
    @Export(name="computePlatform", type=String.class, parameters={})
    private Output</* @Nullable */ String> computePlatform;

    /**
     * @return The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
     * 
     */
    public Output<Optional<String>> computePlatform() {
        return Codegen.optional(this.computePlatform);
    }
    /**
     * The name for a connection to a GitHub account.
     * 
     */
    @Export(name="githubAccountName", type=String.class, parameters={})
    private Output<String> githubAccountName;

    /**
     * @return The name for a connection to a GitHub account.
     * 
     */
    public Output<String> githubAccountName() {
        return this.githubAccountName;
    }
    /**
     * Whether the user has authenticated with GitHub for the specified application.
     * 
     */
    @Export(name="linkedToGithub", type=Boolean.class, parameters={})
    private Output<Boolean> linkedToGithub;

    /**
     * @return Whether the user has authenticated with GitHub for the specified application.
     * 
     */
    public Output<Boolean> linkedToGithub() {
        return this.linkedToGithub;
    }
    /**
     * The name of the application.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the application.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
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
    public Application(String name, @Nullable ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, @Nullable ApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codedeploy/application:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codedeploy/application:Application", name, state, makeResourceOptions(options, id));
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
