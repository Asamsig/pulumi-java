// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.runtimeconfig;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.runtimeconfig.VariableArgs;
import com.pulumi.gcp.runtimeconfig.inputs.VariableState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Example creating a RuntimeConfig variable.
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
 *         var my_runtime_config = new Config(&#34;my-runtime-config&#34;, ConfigArgs.builder()        
 *             .description(&#34;Runtime configuration values for my service&#34;)
 *             .build());
 * 
 *         var environment = new Variable(&#34;environment&#34;, VariableArgs.builder()        
 *             .parent(my_runtime_config.getName())
 *             .text(&#34;example.com&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * You can also encode binary content using the `value` argument instead. The
 * value must be base64 encoded.
 * 
 * Example of using the `value` argument.
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
 *         var my_runtime_config = new Config(&#34;my-runtime-config&#34;, ConfigArgs.builder()        
 *             .description(&#34;Runtime configuration values for my service&#34;)
 *             .build());
 * 
 *         var my_secret = new Variable(&#34;my-secret&#34;, VariableArgs.builder()        
 *             .parent(my_runtime_config.getName())
 *             .value(Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(&#34;my-encrypted-secret.dat&#34;))))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Runtime Config Variables can be imported using the `name` or full variable name, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:runtimeconfig/variable:Variable myvariable myconfig/myvariable
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:runtimeconfig/variable:Variable myvariable projects/my-gcp-project/configs/myconfig/variables/myvariable
 * ```
 * 
 *  When importing using only the name, the provider project must be set.
 * 
 */
@ResourceType(type="gcp:runtimeconfig/variable:Variable")
public class Variable extends com.pulumi.resources.CustomResource {
    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. &#34;prod-variables/hostname&#34;).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. &#34;prod-variables/hostname&#34;).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The name of the RuntimeConfig resource containing this
     * variable.
     * 
     */
    public Output<String> parent() {
        return this.parent;
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
     * or `value` - (Required) The content to associate with the variable.
     * Exactly one of `text` or `variable` must be specified. If `text` is specified,
     * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
     * is specified, it must be base64 encoded and less than 4096 bytes in length.
     * 
     */
    @Export(name="text", type=String.class, parameters={})
    private Output</* @Nullable */ String> text;

    /**
     * @return or `value` - (Required) The content to associate with the variable.
     * Exactly one of `text` or `variable` must be specified. If `text` is specified,
     * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
     * is specified, it must be base64 encoded and less than 4096 bytes in length.
     * 
     */
    public Output<Optional<String>> text() {
        return Codegen.optional(this.text);
    }
    /**
     * (Computed) The timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * accurate to nanoseconds, representing when the variable was last updated.
     * Example: &#34;2016-10-09T12:33:37.578138407Z&#34;.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return (Computed) The timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * accurate to nanoseconds, representing when the variable was last updated.
     * Example: &#34;2016-10-09T12:33:37.578138407Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Variable(String name) {
        this(name, VariableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Variable(String name, VariableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Variable(String name, VariableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:runtimeconfig/variable:Variable", name, args == null ? VariableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Variable(String name, Output<String> id, @Nullable VariableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:runtimeconfig/variable:Variable", name, state, makeResourceOptions(options, id));
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
    public static Variable get(String name, Output<String> id, @Nullable VariableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Variable(name, id, state, options);
    }
}
