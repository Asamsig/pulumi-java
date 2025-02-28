// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identifies the report template for the report. Reports are built using a report template.
 * 
 */
public final class ReportSettingPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportSettingPropertiesArgs Empty = new ReportSettingPropertiesArgs();

    /**
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * 
     */
    @Import(name="frameworkArns")
    private @Nullable Output<List<String>> frameworkArns;

    /**
     * @return The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * 
     */
    public Optional<Output<List<String>>> frameworkArns() {
        return Optional.ofNullable(this.frameworkArns);
    }

    /**
     * Identifies the report template for the report. Reports are built using a report template. The report templates are: `BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT`
     * 
     */
    @Import(name="reportTemplate", required=true)
    private Output<String> reportTemplate;

    /**
     * @return Identifies the report template for the report. Reports are built using a report template. The report templates are: `BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT`
     * 
     */
    public Output<String> reportTemplate() {
        return this.reportTemplate;
    }

    private ReportSettingPropertiesArgs() {}

    private ReportSettingPropertiesArgs(ReportSettingPropertiesArgs $) {
        this.frameworkArns = $.frameworkArns;
        this.reportTemplate = $.reportTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportSettingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportSettingPropertiesArgs $;

        public Builder() {
            $ = new ReportSettingPropertiesArgs();
        }

        public Builder(ReportSettingPropertiesArgs defaults) {
            $ = new ReportSettingPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frameworkArns The Amazon Resource Names (ARNs) of the frameworks a report covers.
         * 
         * @return builder
         * 
         */
        public Builder frameworkArns(@Nullable Output<List<String>> frameworkArns) {
            $.frameworkArns = frameworkArns;
            return this;
        }

        /**
         * @param frameworkArns The Amazon Resource Names (ARNs) of the frameworks a report covers.
         * 
         * @return builder
         * 
         */
        public Builder frameworkArns(List<String> frameworkArns) {
            return frameworkArns(Output.of(frameworkArns));
        }

        /**
         * @param frameworkArns The Amazon Resource Names (ARNs) of the frameworks a report covers.
         * 
         * @return builder
         * 
         */
        public Builder frameworkArns(String... frameworkArns) {
            return frameworkArns(List.of(frameworkArns));
        }

        /**
         * @param reportTemplate Identifies the report template for the report. Reports are built using a report template. The report templates are: `BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT`
         * 
         * @return builder
         * 
         */
        public Builder reportTemplate(Output<String> reportTemplate) {
            $.reportTemplate = reportTemplate;
            return this;
        }

        /**
         * @param reportTemplate Identifies the report template for the report. Reports are built using a report template. The report templates are: `BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT`
         * 
         * @return builder
         * 
         */
        public Builder reportTemplate(String reportTemplate) {
            return reportTemplate(Output.of(reportTemplate));
        }

        public ReportSettingPropertiesArgs build() {
            $.reportTemplate = Objects.requireNonNull($.reportTemplate, "expected parameter 'reportTemplate' to be non-null");
            return $;
        }
    }

}
