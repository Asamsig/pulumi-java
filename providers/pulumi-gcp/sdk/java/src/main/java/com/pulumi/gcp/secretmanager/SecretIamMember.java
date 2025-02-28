// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
import com.pulumi.gcp.secretmanager.inputs.SecretIamMemberState;
import com.pulumi.gcp.secretmanager.outputs.SecretIamMemberCondition;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Secret Manager Secret. Each of these resources serves a different use case:
 * 
 * * `gcp.secretmanager.SecretIamPolicy`: Authoritative. Sets the IAM policy for the secret and replaces any existing policy already attached.
 * * `gcp.secretmanager.SecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the secret are preserved.
 * * `gcp.secretmanager.SecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the secret are preserved.
 * 
 * &gt; **Note:** `gcp.secretmanager.SecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.SecretIamBinding` and `gcp.secretmanager.SecretIamMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.secretmanager.SecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.SecretIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_secret\_manager\_secret\_iam\_policy
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
 *         final var admin = Output.of(OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBinding.builder()
 *                 .role(&#34;roles/secretmanager.secretAccessor&#34;)
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .build())
 *             .build()));
 * 
 *         var policy = new SecretIamPolicy(&#34;policy&#34;, SecretIamPolicyArgs.builder()        
 *             .project(google_secret_manager_secret.getSecret-basic().getProject())
 *             .secretId(google_secret_manager_secret.getSecret-basic().getSecret_id())
 *             .policyData(admin.apply(getIAMPolicyResult -&gt; getIAMPolicyResult.getPolicyData()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## google\_secret\_manager\_secret\_iam\_binding
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
 *         var binding = new SecretIamBinding(&#34;binding&#34;, SecretIamBindingArgs.builder()        
 *             .project(google_secret_manager_secret.getSecret-basic().getProject())
 *             .secretId(google_secret_manager_secret.getSecret-basic().getSecret_id())
 *             .role(&#34;roles/secretmanager.secretAccessor&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## google\_secret\_manager\_secret\_iam\_member
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
 *         var member = new SecretIamMember(&#34;member&#34;, SecretIamMemberArgs.builder()        
 *             .project(google_secret_manager_secret.getSecret-basic().getProject())
 *             .secretId(google_secret_manager_secret.getSecret-basic().getSecret_id())
 *             .role(&#34;roles/secretmanager.secretAccessor&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms* projects/{{project}}/secrets/{{secret_id}} * {{project}}/{{secret_id}} * {{secret_id}} Any variables not passed in the import command will be taken from the provider configuration. Secret Manager secret IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:secretmanager/secretIamMember:SecretIamMember editor &#34;projects/{{project}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor user:jane@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:secretmanager/secretIamMember:SecretIamMember editor &#34;projects/{{project}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:secretmanager/secretIamMember:SecretIamMember editor projects/{{project}}/secrets/{{secret_id}}
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:secretmanager/secretIamMember:SecretIamMember")
public class SecretIamMember extends com.pulumi.resources.CustomResource {
    @Export(name="condition", type=SecretIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ SecretIamMemberCondition> condition;

    public Output<Optional<SecretIamMemberCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.secretmanager.SecretIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.secretmanager.SecretIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    @Export(name="secretId", type=String.class, parameters={})
    private Output<String> secretId;

    public Output<String> secretId() {
        return this.secretId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretIamMember(String name) {
        this(name, SecretIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretIamMember(String name, SecretIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretIamMember(String name, SecretIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretIamMember:SecretIamMember", name, args == null ? SecretIamMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretIamMember(String name, Output<String> id, @Nullable SecretIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretIamMember:SecretIamMember", name, state, makeResourceOptions(options, id));
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
    public static SecretIamMember get(String name, Output<String> id, @Nullable SecretIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretIamMember(name, id, state, options);
    }
}
