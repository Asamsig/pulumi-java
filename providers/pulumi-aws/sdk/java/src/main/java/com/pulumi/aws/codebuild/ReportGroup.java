// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codebuild.ReportGroupArgs;
import com.pulumi.aws.codebuild.inputs.ReportGroupState;
import com.pulumi.aws.codebuild.outputs.ReportGroupExportConfig;
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
 * Provides a CodeBuild Report Groups Resource.
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
 *         var exampleKey = new Key(&#34;exampleKey&#34;, KeyArgs.builder()        
 *             .description(&#34;my test kms key&#34;)
 *             .deletionWindowInDays(7)
 *             .policy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Id&#34;: &#34;kms-tf-1&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Sid&#34;: &#34;Enable IAM User Permissions&#34;,
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;AWS&#34;: &#34;*&#34;
 *       },
 *       &#34;Action&#34;: &#34;kms:*&#34;,
 *       &#34;Resource&#34;: &#34;*&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleReportGroup = new ReportGroup(&#34;exampleReportGroup&#34;, ReportGroupArgs.builder()        
 *             .type(&#34;TEST&#34;)
 *             .exportConfig(ReportGroupExportConfig.builder()
 *                 .type(&#34;S3&#34;)
 *                 .s3Destination(ReportGroupExportConfigS3Destination.builder()
 *                     .bucket(exampleBucketV2.getId())
 *                     .encryptionDisabled(false)
 *                     .encryptionKey(exampleKey.getArn())
 *                     .packaging(&#34;NONE&#34;)
 *                     .path(&#34;/some&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * CodeBuild Report Group can be imported using the CodeBuild Report Group arn, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codebuild/reportGroup:ReportGroup example arn:aws:codebuild:us-west-2:123456789:report-group/report-group-name
 * ```
 * 
 */
@ResourceType(type="aws:codebuild/reportGroup:ReportGroup")
public class ReportGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of Report Group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of Report Group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date and time this Report Group was created.
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The date and time this Report Group was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
     * 
     */
    @Export(name="deleteReports", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteReports;

    /**
     * @return If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> deleteReports() {
        return Codegen.optional(this.deleteReports);
    }
    /**
     * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
     * 
     */
    @Export(name="exportConfig", type=ReportGroupExportConfig.class, parameters={})
    private Output<ReportGroupExportConfig> exportConfig;

    /**
     * @return Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
     * 
     */
    public Output<ReportGroupExportConfig> exportConfig() {
        return this.exportConfig;
    }
    /**
     * The name of a Report Group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of a Report Group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The export configuration type. Valid values are `S3` and `NO_EXPORT`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReportGroup(String name) {
        this(name, ReportGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReportGroup(String name, ReportGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReportGroup(String name, ReportGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/reportGroup:ReportGroup", name, args == null ? ReportGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReportGroup(String name, Output<String> id, @Nullable ReportGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/reportGroup:ReportGroup", name, state, makeResourceOptions(options, id));
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
    public static ReportGroup get(String name, Output<String> id, @Nullable ReportGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReportGroup(name, id, state, options);
    }
}
