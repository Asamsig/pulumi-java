// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflows_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.workflows_v1.WorkflowArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new workflow. If a workflow with the specified name already exists in the specified project and location, the long running operation will return ALREADY_EXISTS error.
 * 
 */
@ResourceType(type="google-native:workflows/v1:Workflow")
public class Workflow extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp of when the workflow was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp of when the workflow was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource name of the workflow. Format: projects/{project}/locations/{location}/workflows/{workflow}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the workflow. Format: projects/{project}/locations/{location}/workflows/{workflow}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The timestamp that the latest revision of the workflow was created.
     * 
     */
    @Export(name="revisionCreateTime", type=String.class, parameters={})
    private Output<String> revisionCreateTime;

    /**
     * @return The timestamp that the latest revision of the workflow was created.
     * 
     */
    public Output<String> revisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * The revision of the workflow. A new revision of a workflow is created as a result of updating the following properties of a workflow: - Service account - Workflow code to be executed The format is &#34;000001-a4d&#34;, where the first 6 characters define the zero-padded revision ordinal number. They are followed by a hyphen and 3 hexadecimal random characters.
     * 
     */
    @Export(name="revisionId", type=String.class, parameters={})
    private Output<String> revisionId;

    /**
     * @return The revision of the workflow. A new revision of a workflow is created as a result of updating the following properties of a workflow: - Service account - Workflow code to be executed The format is &#34;000001-a4d&#34;, where the first 6 characters define the zero-padded revision ordinal number. They are followed by a hyphen and 3 hexadecimal random characters.
     * 
     */
    public Output<String> revisionId() {
        return this.revisionId;
    }
    /**
     * The service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow has. Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for the `{project}` or not providing one at all will infer the project from the account. The `{account}` value can be the `email` address or the `unique_id` of the service account. If not provided, workflow will use the project&#39;s default service account. Modifying this field for an existing workflow results in a new workflow revision.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow has. Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for the `{project}` or not providing one at all will infer the project from the account. The `{account}` value can be the `email` address or the `unique_id` of the service account. If not provided, workflow will use the project&#39;s default service account. Modifying this field for an existing workflow results in a new workflow revision.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * Workflow code to be executed. The size limit is 128KB.
     * 
     */
    @Export(name="sourceContents", type=String.class, parameters={})
    private Output<String> sourceContents;

    /**
     * @return Workflow code to be executed. The size limit is 128KB.
     * 
     */
    public Output<String> sourceContents() {
        return this.sourceContents;
    }
    /**
     * State of the workflow deployment.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the workflow deployment.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The last update timestamp of the workflow.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of the workflow.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workflow(String name) {
        this(name, WorkflowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workflow(String name, WorkflowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workflow(String name, WorkflowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:workflows/v1:Workflow", name, args == null ? WorkflowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workflow(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:workflows/v1:Workflow", name, null, makeResourceOptions(options, id));
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
    public static Workflow get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workflow(name, id, options);
    }
}
