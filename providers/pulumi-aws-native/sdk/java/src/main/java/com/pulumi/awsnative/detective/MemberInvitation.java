// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.detective;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.detective.MemberInvitationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Detective::MemberInvitation
 * 
 */
@ResourceType(type="aws-native:detective:MemberInvitation")
public class MemberInvitation extends com.pulumi.resources.CustomResource {
    /**
     * When set to true, invitation emails are not sent to the member accounts. Member accounts must still accept the invitation before they are added to the behavior graph. Updating this field has no effect.
     * 
     */
    @Export(name="disableEmailNotification", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableEmailNotification;

    /**
     * @return When set to true, invitation emails are not sent to the member accounts. Member accounts must still accept the invitation before they are added to the behavior graph. Updating this field has no effect.
     * 
     */
    public Output<Optional<Boolean>> disableEmailNotification() {
        return Codegen.optional(this.disableEmailNotification);
    }
    /**
     * The ARN of the graph to which the member account will be invited
     * 
     */
    @Export(name="graphArn", type=String.class, parameters={})
    private Output<String> graphArn;

    /**
     * @return The ARN of the graph to which the member account will be invited
     * 
     */
    public Output<String> graphArn() {
        return this.graphArn;
    }
    /**
     * The root email address for the account to be invited, for validation. Updating this field has no effect.
     * 
     */
    @Export(name="memberEmailAddress", type=String.class, parameters={})
    private Output<String> memberEmailAddress;

    /**
     * @return The root email address for the account to be invited, for validation. Updating this field has no effect.
     * 
     */
    public Output<String> memberEmailAddress() {
        return this.memberEmailAddress;
    }
    /**
     * The AWS account ID to be invited to join the graph as a member
     * 
     */
    @Export(name="memberId", type=String.class, parameters={})
    private Output<String> memberId;

    /**
     * @return The AWS account ID to be invited to join the graph as a member
     * 
     */
    public Output<String> memberId() {
        return this.memberId;
    }
    /**
     * A message to be included in the email invitation sent to the invited account. Updating this field has no effect.
     * 
     */
    @Export(name="message", type=String.class, parameters={})
    private Output</* @Nullable */ String> message;

    /**
     * @return A message to be included in the email invitation sent to the invited account. Updating this field has no effect.
     * 
     */
    public Output<Optional<String>> message() {
        return Codegen.optional(this.message);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MemberInvitation(String name) {
        this(name, MemberInvitationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MemberInvitation(String name, MemberInvitationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MemberInvitation(String name, MemberInvitationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:detective:MemberInvitation", name, args == null ? MemberInvitationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MemberInvitation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:detective:MemberInvitation", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MemberInvitation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MemberInvitation(name, id, options);
    }
}
