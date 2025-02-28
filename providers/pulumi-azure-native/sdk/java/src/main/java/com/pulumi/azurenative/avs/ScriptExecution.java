// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.avs.ScriptExecutionArgs;
import com.pulumi.azurenative.avs.outputs.PSCredentialExecutionParameterResponse;
import com.pulumi.azurenative.avs.outputs.ScriptSecureStringExecutionParameterResponse;
import com.pulumi.azurenative.avs.outputs.ScriptStringExecutionParameterResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An instance of a script executed by a user - custom or AVS
 * API Version: 2021-06-01.
 * 
 * ## Example Usage
 * ### ScriptExecutions_CreateOrUpdate
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
 *         var scriptExecution = new ScriptExecution(&#34;scriptExecution&#34;, ScriptExecutionArgs.builder()        
 *             .hiddenParameters(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;Password&#34;),
 *                 Map.entry(&#34;secureValue&#34;, &#34;PlaceholderPassword&#34;),
 *                 Map.entry(&#34;type&#34;, &#34;SecureValue&#34;)
 *             ))
 *             .parameters(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;DomainName&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Value&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;placeholderDomain.local&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;BaseUserDN&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Value&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;DC=placeholder, DC=placeholder&#34;)
 *                 ))
 *             .privateCloudName(&#34;cloud1&#34;)
 *             .resourceGroupName(&#34;group1&#34;)
 *             .retention(&#34;P0Y0M60DT0H60M60S&#34;)
 *             .scriptCmdletId(&#34;/subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/scriptPackages/AVS.PowerCommands@1.0.0/scriptCmdlets/New-SsoExternalIdentitySource&#34;)
 *             .scriptExecutionName(&#34;addSsoServer&#34;)
 *             .timeout(&#34;P0Y0M0DT0H60M60S&#34;)
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
 * $ pulumi import azure-native:avs:ScriptExecution addSsoServer /subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/scriptExecutions/addSsoServer 
 * ```
 * 
 */
@ResourceType(type="azure-native:avs:ScriptExecution")
public class ScriptExecution extends com.pulumi.resources.CustomResource {
    /**
     * Standard error output stream from the powershell execution
     * 
     */
    @Export(name="errors", type=List.class, parameters={String.class})
    private Output<List<String>> errors;

    /**
     * @return Standard error output stream from the powershell execution
     * 
     */
    public Output<List<String>> errors() {
        return this.errors;
    }
    /**
     * Error message if the script was able to run, but if the script itself had errors or powershell threw an exception
     * 
     */
    @Export(name="failureReason", type=String.class, parameters={})
    private Output</* @Nullable */ String> failureReason;

    /**
     * @return Error message if the script was able to run, but if the script itself had errors or powershell threw an exception
     * 
     */
    public Output<Optional<String>> failureReason() {
        return Codegen.optional(this.failureReason);
    }
    /**
     * Time the script execution was finished
     * 
     */
    @Export(name="finishedAt", type=String.class, parameters={})
    private Output<String> finishedAt;

    /**
     * @return Time the script execution was finished
     * 
     */
    public Output<String> finishedAt() {
        return this.finishedAt;
    }
    /**
     * Parameters that will be hidden/not visible to ARM, such as passwords and credentials
     * 
     */
    @Export(name="hiddenParameters", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> hiddenParameters;

    /**
     * @return Parameters that will be hidden/not visible to ARM, such as passwords and credentials
     * 
     */
    public Output<Optional<List<Object>>> hiddenParameters() {
        return Codegen.optional(this.hiddenParameters);
    }
    /**
     * Standard information out stream from the powershell execution
     * 
     */
    @Export(name="information", type=List.class, parameters={String.class})
    private Output<List<String>> information;

    /**
     * @return Standard information out stream from the powershell execution
     * 
     */
    public Output<List<String>> information() {
        return this.information;
    }
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
     * User-defined dictionary.
     * 
     */
    @Export(name="namedOutputs", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> namedOutputs;

    /**
     * @return User-defined dictionary.
     * 
     */
    public Output<Optional<Map<String,Object>>> namedOutputs() {
        return Codegen.optional(this.namedOutputs);
    }
    /**
     * Standard output stream from the powershell execution
     * 
     */
    @Export(name="output", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> output;

    /**
     * @return Standard output stream from the powershell execution
     * 
     */
    public Output<Optional<List<String>>> output() {
        return Codegen.optional(this.output);
    }
    /**
     * Parameters the script will accept
     * 
     */
    @Export(name="parameters", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> parameters;

    /**
     * @return Parameters the script will accept
     * 
     */
    public Output<Optional<List<Object>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The state of the script execution resource
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The state of the script execution resource
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Time to live for the resource. If not provided, will be available for 60 days
     * 
     */
    @Export(name="retention", type=String.class, parameters={})
    private Output</* @Nullable */ String> retention;

    /**
     * @return Time to live for the resource. If not provided, will be available for 60 days
     * 
     */
    public Output<Optional<String>> retention() {
        return Codegen.optional(this.retention);
    }
    /**
     * A reference to the script cmdlet resource if user is running a AVS script
     * 
     */
    @Export(name="scriptCmdletId", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptCmdletId;

    /**
     * @return A reference to the script cmdlet resource if user is running a AVS script
     * 
     */
    public Output<Optional<String>> scriptCmdletId() {
        return Codegen.optional(this.scriptCmdletId);
    }
    /**
     * Time the script execution was started
     * 
     */
    @Export(name="startedAt", type=String.class, parameters={})
    private Output<String> startedAt;

    /**
     * @return Time the script execution was started
     * 
     */
    public Output<String> startedAt() {
        return this.startedAt;
    }
    /**
     * Time the script execution was submitted
     * 
     */
    @Export(name="submittedAt", type=String.class, parameters={})
    private Output<String> submittedAt;

    /**
     * @return Time the script execution was submitted
     * 
     */
    public Output<String> submittedAt() {
        return this.submittedAt;
    }
    /**
     * Time limit for execution
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return Time limit for execution
     * 
     */
    public Output<String> timeout() {
        return this.timeout;
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
     * Standard warning out stream from the powershell execution
     * 
     */
    @Export(name="warnings", type=List.class, parameters={String.class})
    private Output<List<String>> warnings;

    /**
     * @return Standard warning out stream from the powershell execution
     * 
     */
    public Output<List<String>> warnings() {
        return this.warnings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScriptExecution(String name) {
        this(name, ScriptExecutionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScriptExecution(String name, ScriptExecutionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScriptExecution(String name, ScriptExecutionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:ScriptExecution", name, args == null ? ScriptExecutionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScriptExecution(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:ScriptExecution", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:avs/v20210601:ScriptExecution").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20211201:ScriptExecution").build())
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
    public static ScriptExecution get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScriptExecution(name, id, options);
    }
}
