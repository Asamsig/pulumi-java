// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.PatchBaselineArgs;
import com.pulumi.aws.ssm.inputs.PatchBaselineState;
import com.pulumi.aws.ssm.outputs.PatchBaselineApprovalRule;
import com.pulumi.aws.ssm.outputs.PatchBaselineGlobalFilter;
import com.pulumi.aws.ssm.outputs.PatchBaselineSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an SSM Patch Baseline resource
 * 
 * &gt; **NOTE on Patch Baselines:** The `approved_patches` and `approval_rule` are
 * both marked as optional fields, but the Patch Baseline requires that at least one
 * of them is specified.
 * 
 * ## Example Usage
 * 
 * Basic usage using `approved_patches` only
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
 *         var production = new PatchBaseline(&#34;production&#34;, PatchBaselineArgs.builder()        
 *             .approvedPatches(&#34;KB123456&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * Advanced usage, specifying patch filters
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
 *         var production = new PatchBaseline(&#34;production&#34;, PatchBaselineArgs.builder()        
 *             .approvalRules(            
 *                 PatchBaselineApprovalRule.builder()
 *                     .approveAfterDays(7)
 *                     .complianceLevel(&#34;HIGH&#34;)
 *                     .patchFilters(                    
 *                         PatchBaselineApprovalRulePatchFilter.builder()
 *                             .key(&#34;PRODUCT&#34;)
 *                             .values(&#34;WindowsServer2016&#34;)
 *                             .build(),
 *                         PatchBaselineApprovalRulePatchFilter.builder()
 *                             .key(&#34;CLASSIFICATION&#34;)
 *                             .values(                            
 *                                 &#34;CriticalUpdates&#34;,
 *                                 &#34;SecurityUpdates&#34;,
 *                                 &#34;Updates&#34;)
 *                             .build(),
 *                         PatchBaselineApprovalRulePatchFilter.builder()
 *                             .key(&#34;MSRC_SEVERITY&#34;)
 *                             .values(                            
 *                                 &#34;Critical&#34;,
 *                                 &#34;Important&#34;,
 *                                 &#34;Moderate&#34;)
 *                             .build())
 *                     .build(),
 *                 PatchBaselineApprovalRule.builder()
 *                     .approveAfterDays(7)
 *                     .patchFilters(PatchBaselineApprovalRulePatchFilter.builder()
 *                         .key(&#34;PRODUCT&#34;)
 *                         .values(&#34;WindowsServer2012&#34;)
 *                         .build())
 *                     .build())
 *             .approvedPatches(            
 *                 &#34;KB123456&#34;,
 *                 &#34;KB456789&#34;)
 *             .description(&#34;Patch Baseline Description&#34;)
 *             .globalFilters(            
 *                 PatchBaselineGlobalFilter.builder()
 *                     .key(&#34;PRODUCT&#34;)
 *                     .values(&#34;WindowsServer2008&#34;)
 *                     .build(),
 *                 PatchBaselineGlobalFilter.builder()
 *                     .key(&#34;CLASSIFICATION&#34;)
 *                     .values(&#34;ServicePacks&#34;)
 *                     .build(),
 *                 PatchBaselineGlobalFilter.builder()
 *                     .key(&#34;MSRC_SEVERITY&#34;)
 *                     .values(&#34;Low&#34;)
 *                     .build())
 *             .rejectedPatches(&#34;KB987654&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * Advanced usage, specifying Microsoft application and Windows patch rules
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
 *         var windowsOsApps = new PatchBaseline(&#34;windowsOsApps&#34;, PatchBaselineArgs.builder()        
 *             .approvalRules(            
 *                 PatchBaselineApprovalRule.builder()
 *                     .approveAfterDays(7)
 *                     .patchFilters(                    
 *                         PatchBaselineApprovalRulePatchFilter.builder()
 *                             .key(&#34;CLASSIFICATION&#34;)
 *                             .values(                            
 *                                 &#34;CriticalUpdates&#34;,
 *                                 &#34;SecurityUpdates&#34;)
 *                             .build(),
 *                         PatchBaselineApprovalRulePatchFilter.builder()
 *                             .key(&#34;MSRC_SEVERITY&#34;)
 *                             .values(                            
 *                                 &#34;Critical&#34;,
 *                                 &#34;Important&#34;)
 *                             .build())
 *                     .build(),
 *                 PatchBaselineApprovalRule.builder()
 *                     .approveAfterDays(7)
 *                     .patchFilters(                    
 *                         PatchBaselineApprovalRulePatchFilter.builder()
 *                             .key(&#34;PATCH_SET&#34;)
 *                             .values(&#34;APPLICATION&#34;)
 *                             .build(),
 *                         PatchBaselineApprovalRulePatchFilter.builder()
 *                             .key(&#34;PRODUCT&#34;)
 *                             .values(                            
 *                                 &#34;Office 2013&#34;,
 *                                 &#34;Office 2016&#34;)
 *                             .build())
 *                     .build())
 *             .description(&#34;Patch both Windows and Microsoft apps&#34;)
 *             .operatingSystem(&#34;WINDOWS&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * Advanced usage, specifying alternate patch source repository
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
 *         var al201709 = new PatchBaseline(&#34;al201709&#34;, PatchBaselineArgs.builder()        
 *             .approvalRules()
 *             .description(&#34;My patch repository for Amazon Linux 2017.09&#34;)
 *             .operatingSystem(&#34;AMAZON_LINUX&#34;)
 *             .sources(PatchBaselineSource.builder()
 *                 .configuration(&#34;&#34;&#34;
 * [amzn-main]
 * name=amzn-main-Base
 * mirrorlist=http://repo./$awsregion./$awsdomain//$releasever/main/mirror.list
 * mirrorlist_expire=300
 * metadata_expire=300
 * priority=10
 * failovermethod=priority
 * fastestmirror_enabled=0
 * gpgcheck=1
 * gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-amazon-ga
 * enabled=1
 * retries=3
 * timeout=5
 * report_instanceid=yes
 * 
 *                 &#34;&#34;&#34;)
 *                 .name(&#34;My-AL2017.09&#34;)
 *                 .products(&#34;AmazonLinux2017.09&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * SSM Patch Baselines can be imported by their baseline ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssm/patchBaseline:PatchBaseline example pb-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ssm/patchBaseline:PatchBaseline")
public class PatchBaseline extends com.pulumi.resources.CustomResource {
    /**
     * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approval_rule block requires the fields documented below.
     * 
     */
    @Export(name="approvalRules", type=List.class, parameters={PatchBaselineApprovalRule.class})
    private Output</* @Nullable */ List<PatchBaselineApprovalRule>> approvalRules;

    /**
     * @return A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approval_rule block requires the fields documented below.
     * 
     */
    public Output<Optional<List<PatchBaselineApprovalRule>>> approvalRules() {
        return Codegen.optional(this.approvalRules);
    }
    /**
     * A list of explicitly approved patches for the baseline.
     * 
     */
    @Export(name="approvedPatches", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> approvedPatches;

    /**
     * @return A list of explicitly approved patches for the baseline.
     * 
     */
    public Output<Optional<List<String>>> approvedPatches() {
        return Codegen.optional(this.approvedPatches);
    }
    /**
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    @Export(name="approvedPatchesComplianceLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> approvedPatchesComplianceLevel;

    /**
     * @return Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    public Output<Optional<String>> approvedPatchesComplianceLevel() {
        return Codegen.optional(this.approvedPatchesComplianceLevel);
    }
    /**
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. Applies to Linux instances only.
     * 
     */
    @Export(name="approvedPatchesEnableNonSecurity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> approvedPatchesEnableNonSecurity;

    /**
     * @return Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. Applies to Linux instances only.
     * 
     */
    public Output<Optional<Boolean>> approvedPatchesEnableNonSecurity() {
        return Codegen.optional(this.approvedPatchesEnableNonSecurity);
    }
    /**
     * The ARN of the patch baseline.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the patch baseline.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the patch baseline.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the patch baseline.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
     * 
     */
    @Export(name="globalFilters", type=List.class, parameters={PatchBaselineGlobalFilter.class})
    private Output</* @Nullable */ List<PatchBaselineGlobalFilter>> globalFilters;

    /**
     * @return A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
     * 
     */
    public Output<Optional<List<PatchBaselineGlobalFilter>>> globalFilters() {
        return Codegen.optional(this.globalFilters);
    }
    /**
     * The name specified to identify the patch source.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name specified to identify the patch source.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
     * 
     */
    @Export(name="operatingSystem", type=String.class, parameters={})
    private Output</* @Nullable */ String> operatingSystem;

    /**
     * @return Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
     * 
     */
    public Output<Optional<String>> operatingSystem() {
        return Codegen.optional(this.operatingSystem);
    }
    /**
     * A list of rejected patches.
     * 
     */
    @Export(name="rejectedPatches", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> rejectedPatches;

    /**
     * @return A list of rejected patches.
     * 
     */
    public Output<Optional<List<String>>> rejectedPatches() {
        return Codegen.optional(this.rejectedPatches);
    }
    /**
     * The action for Patch Manager to take on patches included in the `rejected_patches` list. Allow values are `ALLOW_AS_DEPENDENCY` and `BLOCK`.
     * 
     */
    @Export(name="rejectedPatchesAction", type=String.class, parameters={})
    private Output<String> rejectedPatchesAction;

    /**
     * @return The action for Patch Manager to take on patches included in the `rejected_patches` list. Allow values are `ALLOW_AS_DEPENDENCY` and `BLOCK`.
     * 
     */
    public Output<String> rejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }
    /**
     * Configuration block(s) with alternate sources for patches. Applies to Linux instances only. Documented below.
     * 
     */
    @Export(name="sources", type=List.class, parameters={PatchBaselineSource.class})
    private Output</* @Nullable */ List<PatchBaselineSource>> sources;

    /**
     * @return Configuration block(s) with alternate sources for patches. Applies to Linux instances only. Documented below.
     * 
     */
    public Output<Optional<List<PatchBaselineSource>>> sources() {
        return Codegen.optional(this.sources);
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PatchBaseline(String name) {
        this(name, PatchBaselineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PatchBaseline(String name, @Nullable PatchBaselineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PatchBaseline(String name, @Nullable PatchBaselineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/patchBaseline:PatchBaseline", name, args == null ? PatchBaselineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PatchBaseline(String name, Output<String> id, @Nullable PatchBaselineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/patchBaseline:PatchBaseline", name, state, makeResourceOptions(options, id));
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
    public static PatchBaseline get(String name, Output<String> id, @Nullable PatchBaselineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PatchBaseline(name, id, state, options);
    }
}
