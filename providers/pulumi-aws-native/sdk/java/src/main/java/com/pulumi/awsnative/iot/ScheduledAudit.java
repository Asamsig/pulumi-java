// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iot.ScheduledAuditArgs;
import com.pulumi.awsnative.iot.enums.ScheduledAuditDayOfWeek;
import com.pulumi.awsnative.iot.enums.ScheduledAuditFrequency;
import com.pulumi.awsnative.iot.outputs.ScheduledAuditTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Scheduled audits can be used to specify the checks you want to perform during an audit and how often the audit should be run.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iot:ScheduledAudit")
public class ScheduledAudit extends com.pulumi.resources.CustomResource {
    /**
     * The day of the month on which the scheduled audit takes place. Can be 1 through 31 or LAST. This field is required if the frequency parameter is set to MONTHLY.
     * 
     */
    @Export(name="dayOfMonth", type=String.class, parameters={})
    private Output</* @Nullable */ String> dayOfMonth;

    /**
     * @return The day of the month on which the scheduled audit takes place. Can be 1 through 31 or LAST. This field is required if the frequency parameter is set to MONTHLY.
     * 
     */
    public Output<Optional<String>> dayOfMonth() {
        return Codegen.optional(this.dayOfMonth);
    }
    /**
     * The day of the week on which the scheduled audit takes place. Can be one of SUN, MON, TUE,WED, THU, FRI, or SAT. This field is required if the frequency parameter is set to WEEKLY or BIWEEKLY.
     * 
     */
    @Export(name="dayOfWeek", type=ScheduledAuditDayOfWeek.class, parameters={})
    private Output</* @Nullable */ ScheduledAuditDayOfWeek> dayOfWeek;

    /**
     * @return The day of the week on which the scheduled audit takes place. Can be one of SUN, MON, TUE,WED, THU, FRI, or SAT. This field is required if the frequency parameter is set to WEEKLY or BIWEEKLY.
     * 
     */
    public Output<Optional<ScheduledAuditDayOfWeek>> dayOfWeek() {
        return Codegen.optional(this.dayOfWeek);
    }
    /**
     * How often the scheduled audit takes place. Can be one of DAILY, WEEKLY, BIWEEKLY, or MONTHLY.
     * 
     */
    @Export(name="frequency", type=ScheduledAuditFrequency.class, parameters={})
    private Output<ScheduledAuditFrequency> frequency;

    /**
     * @return How often the scheduled audit takes place. Can be one of DAILY, WEEKLY, BIWEEKLY, or MONTHLY.
     * 
     */
    public Output<ScheduledAuditFrequency> frequency() {
        return this.frequency;
    }
    /**
     * The ARN (Amazon resource name) of the scheduled audit.
     * 
     */
    @Export(name="scheduledAuditArn", type=String.class, parameters={})
    private Output<String> scheduledAuditArn;

    /**
     * @return The ARN (Amazon resource name) of the scheduled audit.
     * 
     */
    public Output<String> scheduledAuditArn() {
        return this.scheduledAuditArn;
    }
    /**
     * The name you want to give to the scheduled audit.
     * 
     */
    @Export(name="scheduledAuditName", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheduledAuditName;

    /**
     * @return The name you want to give to the scheduled audit.
     * 
     */
    public Output<Optional<String>> scheduledAuditName() {
        return Codegen.optional(this.scheduledAuditName);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ScheduledAuditTag.class})
    private Output</* @Nullable */ List<ScheduledAuditTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<ScheduledAuditTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account.
     * 
     */
    @Export(name="targetCheckNames", type=List.class, parameters={String.class})
    private Output<List<String>> targetCheckNames;

    /**
     * @return Which checks are performed during the scheduled audit. Checks must be enabled for your account.
     * 
     */
    public Output<List<String>> targetCheckNames() {
        return this.targetCheckNames;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledAudit(String name) {
        this(name, ScheduledAuditArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledAudit(String name, ScheduledAuditArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledAudit(String name, ScheduledAuditArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:ScheduledAudit", name, args == null ? ScheduledAuditArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScheduledAudit(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:ScheduledAudit", name, null, makeResourceOptions(options, id));
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
    public static ScheduledAudit get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledAudit(name, id, options);
    }
}
