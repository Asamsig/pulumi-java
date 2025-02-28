// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.serviceAccount.IAMPolicyArgs;
import com.pulumi.gcp.serviceAccount.inputs.IAMPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * When managing IAM roles, you can treat a service account either as a resource or as an identity. This resource is to add iam policy bindings to a service account resource, such as allowing the members to run operations as or modify the service account. To configure permissions for a service account on other GCP resources, use the google_project_iam set of resources.
 * 
 * Three different resources help you manage your IAM policy for a service account. Each of these resources serves a different use case:
 * 
 * * `gcp.serviceAccount.IAMPolicy`: Authoritative. Sets the IAM policy for the service account and replaces any existing policy already attached.
 * * `gcp.serviceAccount.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service account are preserved.
 * * `gcp.serviceAccount.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service account are preserved.
 * 
 * &gt; **Note:** `gcp.serviceAccount.IAMPolicy` **cannot** be used in conjunction with `gcp.serviceAccount.IAMBinding` and `gcp.serviceAccount.IAMMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.serviceAccount.IAMBinding` resources **can be** used in conjunction with `gcp.serviceAccount.IAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_service\_account\_iam\_policy
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
 *                 .role(&#34;roles/iam.serviceAccountUser&#34;)
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .build())
 *             .build()));
 * 
 *         var sa = new Account(&#34;sa&#34;, AccountArgs.builder()        
 *             .accountId(&#34;my-service-account&#34;)
 *             .displayName(&#34;A service account that only Jane can interact with&#34;)
 *             .build());
 * 
 *         var admin_account_iam = new IAMPolicy(&#34;admin-account-iam&#34;, IAMPolicyArgs.builder()        
 *             .serviceAccountId(sa.getName())
 *             .policyData(admin.apply(getIAMPolicyResult -&gt; getIAMPolicyResult.getPolicyData()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## google\_service\_account\_iam\_binding
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
 *         var sa = new Account(&#34;sa&#34;, AccountArgs.builder()        
 *             .accountId(&#34;my-service-account&#34;)
 *             .displayName(&#34;A service account that only Jane can use&#34;)
 *             .build());
 * 
 *         var admin_account_iam = new IAMBinding(&#34;admin-account-iam&#34;, IAMBindingArgs.builder()        
 *             .serviceAccountId(sa.getName())
 *             .role(&#34;roles/iam.serviceAccountUser&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
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
 *         var sa = new Account(&#34;sa&#34;, AccountArgs.builder()        
 *             .accountId(&#34;my-service-account&#34;)
 *             .displayName(&#34;A service account that only Jane can use&#34;)
 *             .build());
 * 
 *         var admin_account_iam = new IAMBinding(&#34;admin-account-iam&#34;, IAMBindingArgs.builder()        
 *             .serviceAccountId(sa.getName())
 *             .role(&#34;roles/iam.serviceAccountUser&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .condition(IAMBindingCondition.builder()
 *                 .title(&#34;expires_after_2019_12_31&#34;)
 *                 .description(&#34;Expiring at midnight of 2019-12-31&#34;)
 *                 .expression(&#34;request.time &lt; timestamp(\&#34;2020-01-01T00:00:00Z\&#34;)&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## google\_service\_account\_iam\_member
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
 *         final var default = Output.of(ComputeFunctions.getDefaultServiceAccount());
 * 
 *         var sa = new Account(&#34;sa&#34;, AccountArgs.builder()        
 *             .accountId(&#34;my-service-account&#34;)
 *             .displayName(&#34;A service account that Jane can use&#34;)
 *             .build());
 * 
 *         var admin_account_iam = new IAMMember(&#34;admin-account-iam&#34;, IAMMemberArgs.builder()        
 *             .serviceAccountId(sa.getName())
 *             .role(&#34;roles/iam.serviceAccountUser&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .build());
 * 
 *         var gce_default_account_iam = new IAMMember(&#34;gce-default-account-iam&#34;, IAMMemberArgs.builder()        
 *             .serviceAccountId(default_.getName())
 *             .role(&#34;roles/iam.serviceAccountUser&#34;)
 *             .member(sa.getEmail().apply(email -&gt; String.format(&#34;serviceAccount:%s&#34;, email)))
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
 *         var sa = new Account(&#34;sa&#34;, AccountArgs.builder()        
 *             .accountId(&#34;my-service-account&#34;)
 *             .displayName(&#34;A service account that Jane can use&#34;)
 *             .build());
 * 
 *         var admin_account_iam = new IAMMember(&#34;admin-account-iam&#34;, IAMMemberArgs.builder()        
 *             .serviceAccountId(sa.getName())
 *             .role(&#34;roles/iam.serviceAccountUser&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .condition(IAMMemberCondition.builder()
 *                 .title(&#34;expires_after_2019_12_31&#34;)
 *                 .description(&#34;Expiring at midnight of 2019-12-31&#34;)
 *                 .expression(&#34;request.time &lt; timestamp(\&#34;2020-01-01T00:00:00Z\&#34;)&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service account IAM resources can be imported using the project, service account email, role, member identity, and condition (beta).
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMPolicy:IAMPolicy admin-account-iam projects/{your-project-id}/serviceAccounts/{your-service-account-email}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMPolicy:IAMPolicy admin-account-iam &#34;projects/{your-project-id}/serviceAccounts/{your-service-account-email} roles/iam.serviceAccountUser&#34;
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMPolicy:IAMPolicy admin-account-iam &#34;projects/{your-project-id}/serviceAccounts/{your-service-account-email} roles/editor user:foo@example.com&#34;
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`. With conditions
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMPolicy:IAMPolicy admin-account-iam &#34;projects/{your-project-id}/serviceAccounts/{your-service-account-email} roles/iam.serviceAccountUser expires_after_2019_12_31&#34;
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:serviceAccount/iAMPolicy:IAMPolicy admin-account-iam &#34;projects/{your-project-id}/serviceAccounts/{your-service-account-email} roles/iam.serviceAccountUser user:foo@example.com expires_after_2019_12_31&#34;
 * ```
 * 
 */
@ResourceType(type="gcp:serviceAccount/iAMPolicy:IAMPolicy")
public class IAMPolicy extends com.pulumi.resources.CustomResource {
    /**
     * (Computed) The etag of the service account IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the service account IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }
    /**
     * The fully-qualified name of the service account to apply policy to.
     * 
     */
    @Export(name="serviceAccountId", type=String.class, parameters={})
    private Output<String> serviceAccountId;

    /**
     * @return The fully-qualified name of the service account to apply policy to.
     * 
     */
    public Output<String> serviceAccountId() {
        return this.serviceAccountId;
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
        super("gcp:serviceAccount/iAMPolicy:IAMPolicy", name, args == null ? IAMPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IAMPolicy(String name, Output<String> id, @Nullable IAMPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceAccount/iAMPolicy:IAMPolicy", name, state, makeResourceOptions(options, id));
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
