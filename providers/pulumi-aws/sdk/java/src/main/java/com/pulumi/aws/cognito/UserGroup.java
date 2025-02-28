// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cognito.UserGroupArgs;
import com.pulumi.aws.cognito.inputs.UserGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cognito User Group resource.
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
 *         var mainUserPool = new UserPool(&#34;mainUserPool&#34;);
 * 
 *         var groupRole = new Role(&#34;groupRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Sid&#34;: &#34;&#34;,
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Federated&#34;: &#34;cognito-identity.amazonaws.com&#34;
 *       },
 *       &#34;Action&#34;: &#34;sts:AssumeRoleWithWebIdentity&#34;,
 *       &#34;Condition&#34;: {
 *         &#34;StringEquals&#34;: {
 *           &#34;cognito-identity.amazonaws.com:aud&#34;: &#34;us-east-1:12345678-dead-beef-cafe-123456790ab&#34;
 *         },
 *         &#34;ForAnyValue:StringLike&#34;: {
 *           &#34;cognito-identity.amazonaws.com:amr&#34;: &#34;authenticated&#34;
 *         }
 *       }
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var mainUserGroup = new UserGroup(&#34;mainUserGroup&#34;, UserGroupArgs.builder()        
 *             .userPoolId(mainUserPool.getId())
 *             .description(&#34;Managed by Pulumi&#34;)
 *             .precedence(42)
 *             .roleArn(groupRole.getArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cognito User Groups can be imported using the `user_pool_id`/`name` attributes concatenated, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cognito/userGroup:UserGroup group us-east-1_vG78M4goG/user-group
 * ```
 * 
 */
@ResourceType(type="aws:cognito/userGroup:UserGroup")
public class UserGroup extends com.pulumi.resources.CustomResource {
    /**
     * The description of the user group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the user group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the user group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the user group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The precedence of the user group.
     * 
     */
    @Export(name="precedence", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> precedence;

    /**
     * @return The precedence of the user group.
     * 
     */
    public Output<Optional<Integer>> precedence() {
        return Codegen.optional(this.precedence);
    }
    /**
     * The ARN of the IAM role to be associated with the user group.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return The ARN of the IAM role to be associated with the user group.
     * 
     */
    public Output<Optional<String>> roleArn() {
        return Codegen.optional(this.roleArn);
    }
    /**
     * The user pool ID.
     * 
     */
    @Export(name="userPoolId", type=String.class, parameters={})
    private Output<String> userPoolId;

    /**
     * @return The user pool ID.
     * 
     */
    public Output<String> userPoolId() {
        return this.userPoolId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserGroup(String name) {
        this(name, UserGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserGroup(String name, UserGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserGroup(String name, UserGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userGroup:UserGroup", name, args == null ? UserGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGroup(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userGroup:UserGroup", name, state, makeResourceOptions(options, id));
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
    public static UserGroup get(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserGroup(name, id, state, options);
    }
}
