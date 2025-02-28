// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1DateRangeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExportArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExportArgs Empty = new ExportArgs();

    /**
     * Optional. Delimiter used in the CSV file, if `outputFormat` is set to `csv`. Defaults to the `,` (comma) character. Supported delimiter characters include comma (`,`), pipe (`|`), and tab (`\t`).
     * 
     */
    @Import(name="csvDelimiter")
    private @Nullable Output<String> csvDelimiter;

    /**
     * @return Optional. Delimiter used in the CSV file, if `outputFormat` is set to `csv`. Defaults to the `,` (comma) character. Supported delimiter characters include comma (`,`), pipe (`|`), and tab (`\t`).
     * 
     */
    public Optional<Output<String>> csvDelimiter() {
        return Optional.ofNullable(this.csvDelimiter);
    }

    /**
     * Name of the preconfigured datastore.
     * 
     */
    @Import(name="datastoreName", required=true)
    private Output<String> datastoreName;

    /**
     * @return Name of the preconfigured datastore.
     * 
     */
    public Output<String> datastoreName() {
        return this.datastoreName;
    }

    /**
     * Date range of the data to export.
     * 
     */
    @Import(name="dateRange", required=true)
    private Output<GoogleCloudApigeeV1DateRangeArgs> dateRange;

    /**
     * @return Date range of the data to export.
     * 
     */
    public Output<GoogleCloudApigeeV1DateRangeArgs> dateRange() {
        return this.dateRange;
    }

    /**
     * Optional. Description of the export job.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the export job.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * Display name of the export job.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Display name of the export job.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * Optional. Output format of the export. Valid values include: `csv` or `json`. Defaults to `json`. Note: Configure the delimiter for CSV output using the `csvDelimiter` property.
     * 
     */
    @Import(name="outputFormat")
    private @Nullable Output<String> outputFormat;

    /**
     * @return Optional. Output format of the export. Valid values include: `csv` or `json`. Defaults to `json`. Note: Configure the delimiter for CSV output using the `csvDelimiter` property.
     * 
     */
    public Optional<Output<String>> outputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }

    private ExportArgs() {}

    private ExportArgs(ExportArgs $) {
        this.csvDelimiter = $.csvDelimiter;
        this.datastoreName = $.datastoreName;
        this.dateRange = $.dateRange;
        this.description = $.description;
        this.environmentId = $.environmentId;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.outputFormat = $.outputFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExportArgs $;

        public Builder() {
            $ = new ExportArgs();
        }

        public Builder(ExportArgs defaults) {
            $ = new ExportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param csvDelimiter Optional. Delimiter used in the CSV file, if `outputFormat` is set to `csv`. Defaults to the `,` (comma) character. Supported delimiter characters include comma (`,`), pipe (`|`), and tab (`\t`).
         * 
         * @return builder
         * 
         */
        public Builder csvDelimiter(@Nullable Output<String> csvDelimiter) {
            $.csvDelimiter = csvDelimiter;
            return this;
        }

        /**
         * @param csvDelimiter Optional. Delimiter used in the CSV file, if `outputFormat` is set to `csv`. Defaults to the `,` (comma) character. Supported delimiter characters include comma (`,`), pipe (`|`), and tab (`\t`).
         * 
         * @return builder
         * 
         */
        public Builder csvDelimiter(String csvDelimiter) {
            return csvDelimiter(Output.of(csvDelimiter));
        }

        /**
         * @param datastoreName Name of the preconfigured datastore.
         * 
         * @return builder
         * 
         */
        public Builder datastoreName(Output<String> datastoreName) {
            $.datastoreName = datastoreName;
            return this;
        }

        /**
         * @param datastoreName Name of the preconfigured datastore.
         * 
         * @return builder
         * 
         */
        public Builder datastoreName(String datastoreName) {
            return datastoreName(Output.of(datastoreName));
        }

        /**
         * @param dateRange Date range of the data to export.
         * 
         * @return builder
         * 
         */
        public Builder dateRange(Output<GoogleCloudApigeeV1DateRangeArgs> dateRange) {
            $.dateRange = dateRange;
            return this;
        }

        /**
         * @param dateRange Date range of the data to export.
         * 
         * @return builder
         * 
         */
        public Builder dateRange(GoogleCloudApigeeV1DateRangeArgs dateRange) {
            return dateRange(Output.of(dateRange));
        }

        /**
         * @param description Optional. Description of the export job.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the export job.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param name Display name of the export job.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Display name of the export job.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param outputFormat Optional. Output format of the export. Valid values include: `csv` or `json`. Defaults to `json`. Note: Configure the delimiter for CSV output using the `csvDelimiter` property.
         * 
         * @return builder
         * 
         */
        public Builder outputFormat(@Nullable Output<String> outputFormat) {
            $.outputFormat = outputFormat;
            return this;
        }

        /**
         * @param outputFormat Optional. Output format of the export. Valid values include: `csv` or `json`. Defaults to `json`. Note: Configure the delimiter for CSV output using the `csvDelimiter` property.
         * 
         * @return builder
         * 
         */
        public Builder outputFormat(String outputFormat) {
            return outputFormat(Output.of(outputFormat));
        }

        public ExportArgs build() {
            $.datastoreName = Objects.requireNonNull($.datastoreName, "expected parameter 'datastoreName' to be non-null");
            $.dateRange = Objects.requireNonNull($.dateRange, "expected parameter 'dateRange' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
