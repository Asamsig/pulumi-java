// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.aws.backup.inputs.ReportPlanReportDeliveryChannelArgs;
import com.pulumi.aws.backup.inputs.ReportPlanReportSettingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReportPlanState extends com.pulumi.resources.ResourceArgs {

    public static final ReportPlanState Empty = new ReportPlanState();

    /**
     * The ARN of the backup report plan.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the backup report plan.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC).
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<String> creationTime;

    /**
     * @return The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC).
     * 
     */
    public Optional<Output<String>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * The deployment status of a report plan. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED`.
     * 
     */
    @Import(name="deploymentStatus")
    private @Nullable Output<String> deploymentStatus;

    /**
     * @return The deployment status of a report plan. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED`.
     * 
     */
    public Optional<Output<String>> deploymentStatus() {
        return Optional.ofNullable(this.deploymentStatus);
    }

    /**
     * The description of the report plan with a maximum of 1,024 characters
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the report plan with a maximum of 1,024 characters
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters, numbers, and underscores.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters, numbers, and underscores.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
     * 
     */
    @Import(name="reportDeliveryChannel")
    private @Nullable Output<ReportPlanReportDeliveryChannelArgs> reportDeliveryChannel;

    /**
     * @return An object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
     * 
     */
    public Optional<Output<ReportPlanReportDeliveryChannelArgs>> reportDeliveryChannel() {
        return Optional.ofNullable(this.reportDeliveryChannel);
    }

    /**
     * An object that identifies the report template for the report. Reports are built using a report template. Detailed below.
     * 
     */
    @Import(name="reportSetting")
    private @Nullable Output<ReportPlanReportSettingArgs> reportSetting;

    /**
     * @return An object that identifies the report template for the report. Reports are built using a report template. Detailed below.
     * 
     */
    public Optional<Output<ReportPlanReportSettingArgs>> reportSetting() {
        return Optional.ofNullable(this.reportSetting);
    }

    /**
     * Metadata that you can assign to help organize the report plans you create. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Metadata that you can assign to help organize the report plans you create. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ReportPlanState() {}

    private ReportPlanState(ReportPlanState $) {
        this.arn = $.arn;
        this.creationTime = $.creationTime;
        this.deploymentStatus = $.deploymentStatus;
        this.description = $.description;
        this.name = $.name;
        this.reportDeliveryChannel = $.reportDeliveryChannel;
        this.reportSetting = $.reportSetting;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportPlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportPlanState $;

        public Builder() {
            $ = new ReportPlanState();
        }

        public Builder(ReportPlanState defaults) {
            $ = new ReportPlanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the backup report plan.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the backup report plan.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param creationTime The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC).
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<String> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC).
         * 
         * @return builder
         * 
         */
        public Builder creationTime(String creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param deploymentStatus The deployment status of a report plan. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED`.
         * 
         * @return builder
         * 
         */
        public Builder deploymentStatus(@Nullable Output<String> deploymentStatus) {
            $.deploymentStatus = deploymentStatus;
            return this;
        }

        /**
         * @param deploymentStatus The deployment status of a report plan. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED`.
         * 
         * @return builder
         * 
         */
        public Builder deploymentStatus(String deploymentStatus) {
            return deploymentStatus(Output.of(deploymentStatus));
        }

        /**
         * @param description The description of the report plan with a maximum of 1,024 characters
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the report plan with a maximum of 1,024 characters
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters, numbers, and underscores.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters, numbers, and underscores.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param reportDeliveryChannel An object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder reportDeliveryChannel(@Nullable Output<ReportPlanReportDeliveryChannelArgs> reportDeliveryChannel) {
            $.reportDeliveryChannel = reportDeliveryChannel;
            return this;
        }

        /**
         * @param reportDeliveryChannel An object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder reportDeliveryChannel(ReportPlanReportDeliveryChannelArgs reportDeliveryChannel) {
            return reportDeliveryChannel(Output.of(reportDeliveryChannel));
        }

        /**
         * @param reportSetting An object that identifies the report template for the report. Reports are built using a report template. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder reportSetting(@Nullable Output<ReportPlanReportSettingArgs> reportSetting) {
            $.reportSetting = reportSetting;
            return this;
        }

        /**
         * @param reportSetting An object that identifies the report template for the report. Reports are built using a report template. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder reportSetting(ReportPlanReportSettingArgs reportSetting) {
            return reportSetting(Output.of(reportSetting));
        }

        /**
         * @param tags Metadata that you can assign to help organize the report plans you create. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Metadata that you can assign to help organize the report plans you create. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ReportPlanState build() {
            return $;
        }
    }

}
