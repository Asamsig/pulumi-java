// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.folder.IAMPolicyArgs;
import com.pulumi.gcp.folder.inputs.IAMPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Four different resources help you manage your IAM policy for a folder. Each of these resources serves a different use case:
 * 
 * * `gcp.folder.IAMPolicy`: Authoritative. Sets the IAM policy for the folder and replaces any existing policy already attached.
 * * `gcp.folder.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the folder are preserved.
 * * `gcp.folder.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the folder are preserved.
 * * `gcp.folder.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
 * 
 * &gt; **Note:** `gcp.folder.IAMPolicy` **cannot** be used in conjunction with `gcp.folder.IAMBinding`, `gcp.folder.IAMMember`, or `gcp.folder.IamAuditConfig` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.folder.IAMBinding` resources **can be** used in conjunction with `gcp.folder.IAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * &gt; **Note:** The underlying API method `projects.setIamPolicy` has constraints which are documented [here](https://cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
 *    IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning a 400 error code so please review these if you encounter errors with this resource.
 * 
 * ## google\_folder\_iam\_policy
 * 
 * !&gt; **Be careful!** You can accidentally lock yourself out of your folder
 *    using this resource. Deleting a `gcp.folder.IAMPolicy` removes access
 *    from anyone without permissions on its parent folder/organization. Proceed with caution.
 *    It&#39;s not recommended to use `gcp.folder.IAMPolicy` with your provider folder
 *    to avoid locking yourself out, and it should generally only be used with folders
 *    fully managed by this provider. If you do use this resource, it is recommended to **import** the policy before
 *    applying the change.
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
 *                 .role(&#34;roles/editor&#34;)
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .build())
 *             .build()));
 * 
 *         var folder = new IAMPolicy(&#34;folder&#34;, IAMPolicyArgs.builder()        
 *             .folder(&#34;folders/1234567&#34;)
 *             .policyData(admin.apply(getIAMPolicyResult -&gt; getIAMPolicyResult.getPolicyData()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * With IAM Conditions:
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
 *                 .condition(GetIAMPolicyBindingCondition.builder()
 *                     .description(&#34;Expiring at midnight of 2019-12-31&#34;)
 *                     .expression(&#34;request.time &lt; timestamp(\&#34;2020-01-01T00:00:00Z\&#34;)&#34;)
 *                     .title(&#34;expires_after_2019_12_31&#34;)
 *                     .build())
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .role(&#34;roles/compute.admin&#34;)
 *                 .build())
 *             .build()));
 * 
 *         var folder = new IAMPolicy(&#34;folder&#34;, IAMPolicyArgs.builder()        
 *             .folder(&#34;folders/1234567&#34;)
 *             .policyData(admin.apply(getIAMPolicyResult -&gt; getIAMPolicyResult.getPolicyData()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## google\_folder\_iam\_binding
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
 *         var folder = new IAMBinding(&#34;folder&#34;, IAMBindingArgs.builder()        
 *             .folder(&#34;folders/1234567&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * With IAM Conditions:
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
 *         var folder = new IAMBinding(&#34;folder&#34;, IAMBindingArgs.builder()        
 *             .condition(IAMBindingCondition.builder()
 *                 .description(&#34;Expiring at midnight of 2019-12-31&#34;)
 *                 .expression(&#34;request.time &lt; timestamp(\&#34;2020-01-01T00:00:00Z\&#34;)&#34;)
 *                 .title(&#34;expires_after_2019_12_31&#34;)
 *                 .build())
 *             .folder(&#34;folders/1234567&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/container.admin&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## google\_folder\_iam\_member
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
 *         var folder = new IAMMember(&#34;folder&#34;, IAMMemberArgs.builder()        
 *             .folder(&#34;folders/1234567&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * With IAM Conditions:
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
 *         var folder = new IAMMember(&#34;folder&#34;, IAMMemberArgs.builder()        
 *             .condition(IAMMemberCondition.builder()
 *                 .description(&#34;Expiring at midnight of 2019-12-31&#34;)
 *                 .expression(&#34;request.time &lt; timestamp(\&#34;2020-01-01T00:00:00Z\&#34;)&#34;)
 *                 .title(&#34;expires_after_2019_12_31&#34;)
 *                 .build())
 *             .folder(&#34;folders/1234567&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/firebase.admin&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## google\_folder\_iam\_audit\_config
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
 *         var folder = new IamAuditConfig(&#34;folder&#34;, IamAuditConfigArgs.builder()        
 *             .auditLogConfigs(            
 *                 IamAuditConfigAuditLogConfig.builder()
 *                     .logType(&#34;ADMIN_READ&#34;)
 *                     .build(),
 *                 IamAuditConfigAuditLogConfig.builder()
 *                     .exemptedMembers(&#34;user:joebloggs@hashicorp.com&#34;)
 *                     .logType(&#34;DATA_READ&#34;)
 *                     .build())
 *             .folder(&#34;folders/1234567&#34;)
 *             .service(&#34;allServices&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 * 
 * This member resource can be imported using the `folder`, role, and member e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:folder/iAMPolicy:IAMPolicy my_folder &#34;folder roles/viewer user:foo@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role.
 * 
 * This binding resource can be imported using the `folder` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:folder/iAMPolicy:IAMPolicy my_folder &#34;folder roles/viewer&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question.
 * 
 * This policy resource can be imported using the `folder`.
 * 
 * ```sh
 *  $ pulumi import gcp:folder/iAMPolicy:IAMPolicy my_folder folder
 * ```
 * 
 *  IAM audit config imports use the identifier of the resource in question and the service, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:folder/iAMPolicy:IAMPolicy my_folder &#34;folder foo.googleapis.com&#34;
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `organizations/{{org_id}}/roles/{{role_id}}`.
 * 
 */
@ResourceType(type="gcp:folder/iAMPolicy:IAMPolicy")
public class IAMPolicy extends com.pulumi.resources.CustomResource {
    /**
     * (Computed) The etag of the folder&#39;s IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the folder&#39;s IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     * 
     */
    @Export(name="folder", type=String.class, parameters={})
    private Output<String> folder;

    /**
     * @return The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     * 
     */
    public Output<String> folder() {
        return this.folder;
    }
    /**
     * The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the folder. The policy will be
     * merged with any existing policy applied to the folder.
     * 
     */
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the folder. The policy will be
     * merged with any existing policy applied to the folder.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMPolicy(String name) {
        this(name, IAMPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMPolicy(String name, IAMPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMPolicy(String name, IAMPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:folder/iAMPolicy:IAMPolicy", name, args == null ? IAMPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IAMPolicy(String name, Output<String> id, @Nullable IAMPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:folder/iAMPolicy:IAMPolicy", name, state, makeResourceOptions(options, id));
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
    public static IAMPolicy get(String name, Output<String> id, @Nullable IAMPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IAMPolicy(name, id, state, options);
    }
}
