// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ssmincidents.ResponsePlanArgs;
import com.pulumi.awsnative.ssmincidents.outputs.ResponsePlanAction;
import com.pulumi.awsnative.ssmincidents.outputs.ResponsePlanChatChannel;
import com.pulumi.awsnative.ssmincidents.outputs.ResponsePlanIncidentTemplate;
import com.pulumi.awsnative.ssmincidents.outputs.ResponsePlanTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource type definition for AWS::SSMIncidents::ResponsePlan
 * 
 */
@ResourceType(type="aws-native:ssmincidents:ResponsePlan")
public class ResponsePlan extends com.pulumi.resources.CustomResource {
    /**
     * The list of actions.
     * 
     */
    @Export(name="actions", type=List.class, parameters={ResponsePlanAction.class})
    private Output</* @Nullable */ List<ResponsePlanAction>> actions;

    /**
     * @return The list of actions.
     * 
     */
    public Output<Optional<List<ResponsePlanAction>>> actions() {
        return Codegen.optional(this.actions);
    }
    /**
     * The ARN of the response plan.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the response plan.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="chatChannel", type=ResponsePlanChatChannel.class, parameters={})
    private Output</* @Nullable */ ResponsePlanChatChannel> chatChannel;

    public Output<Optional<ResponsePlanChatChannel>> chatChannel() {
        return Codegen.optional(this.chatChannel);
    }
    /**
     * The display name of the response plan.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name of the response plan.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The list of engagements to use.
     * 
     */
    @Export(name="engagements", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> engagements;

    /**
     * @return The list of engagements to use.
     * 
     */
    public Output<Optional<List<String>>> engagements() {
        return Codegen.optional(this.engagements);
    }
    @Export(name="incidentTemplate", type=ResponsePlanIncidentTemplate.class, parameters={})
    private Output<ResponsePlanIncidentTemplate> incidentTemplate;

    public Output<ResponsePlanIncidentTemplate> incidentTemplate() {
        return this.incidentTemplate;
    }
    /**
     * The name of the response plan.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the response plan.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The tags to apply to the response plan.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ResponsePlanTag.class})
    private Output</* @Nullable */ List<ResponsePlanTag>> tags;

    /**
     * @return The tags to apply to the response plan.
     * 
     */
    public Output<Optional<List<ResponsePlanTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResponsePlan(String name) {
        this(name, ResponsePlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResponsePlan(String name, ResponsePlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResponsePlan(String name, ResponsePlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmincidents:ResponsePlan", name, args == null ? ResponsePlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResponsePlan(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssmincidents:ResponsePlan", name, null, makeResourceOptions(options, id));
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
    public static ResponsePlan get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResponsePlan(name, id, options);
    }
}
