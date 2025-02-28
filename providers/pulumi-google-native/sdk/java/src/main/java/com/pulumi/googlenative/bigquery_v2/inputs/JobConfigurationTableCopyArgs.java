// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.EncryptionConfigurationArgs;
import com.pulumi.googlenative.bigquery_v2.inputs.TableReferenceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobConfigurationTableCopyArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobConfigurationTableCopyArgs Empty = new JobConfigurationTableCopyArgs();

    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a &#39;notFound&#39; error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="createDisposition")
    private @Nullable Output<String> createDisposition;

    /**
     * @return [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a &#39;notFound&#39; error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    public Optional<Output<String>> createDisposition() {
        return Optional.ofNullable(this.createDisposition);
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    @Import(name="destinationEncryptionConfiguration")
    private @Nullable Output<EncryptionConfigurationArgs> destinationEncryptionConfiguration;

    /**
     * @return Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    public Optional<Output<EncryptionConfigurationArgs>> destinationEncryptionConfiguration() {
        return Optional.ofNullable(this.destinationEncryptionConfiguration);
    }

    /**
     * [Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed.
     * 
     */
    @Import(name="destinationExpirationTime")
    private @Nullable Output<Object> destinationExpirationTime;

    /**
     * @return [Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed.
     * 
     */
    public Optional<Output<Object>> destinationExpirationTime() {
        return Optional.ofNullable(this.destinationExpirationTime);
    }

    /**
     * [Required] The destination table
     * 
     */
    @Import(name="destinationTable")
    private @Nullable Output<TableReferenceArgs> destinationTable;

    /**
     * @return [Required] The destination table
     * 
     */
    public Optional<Output<TableReferenceArgs>> destinationTable() {
        return Optional.ofNullable(this.destinationTable);
    }

    /**
     * [Optional] Supported operation types in table copy job.
     * 
     */
    @Import(name="operationType")
    private @Nullable Output<String> operationType;

    /**
     * @return [Optional] Supported operation types in table copy job.
     * 
     */
    public Optional<Output<String>> operationType() {
        return Optional.ofNullable(this.operationType);
    }

    /**
     * [Pick one] Source table to copy.
     * 
     */
    @Import(name="sourceTable")
    private @Nullable Output<TableReferenceArgs> sourceTable;

    /**
     * @return [Pick one] Source table to copy.
     * 
     */
    public Optional<Output<TableReferenceArgs>> sourceTable() {
        return Optional.ofNullable(this.sourceTable);
    }

    /**
     * [Pick one] Source tables to copy.
     * 
     */
    @Import(name="sourceTables")
    private @Nullable Output<List<TableReferenceArgs>> sourceTables;

    /**
     * @return [Pick one] Source tables to copy.
     * 
     */
    public Optional<Output<List<TableReferenceArgs>>> sourceTables() {
        return Optional.ofNullable(this.sourceTables);
    }

    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a &#39;duplicate&#39; error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @Import(name="writeDisposition")
    private @Nullable Output<String> writeDisposition;

    /**
     * @return [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a &#39;duplicate&#39; error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    public Optional<Output<String>> writeDisposition() {
        return Optional.ofNullable(this.writeDisposition);
    }

    private JobConfigurationTableCopyArgs() {}

    private JobConfigurationTableCopyArgs(JobConfigurationTableCopyArgs $) {
        this.createDisposition = $.createDisposition;
        this.destinationEncryptionConfiguration = $.destinationEncryptionConfiguration;
        this.destinationExpirationTime = $.destinationExpirationTime;
        this.destinationTable = $.destinationTable;
        this.operationType = $.operationType;
        this.sourceTable = $.sourceTable;
        this.sourceTables = $.sourceTables;
        this.writeDisposition = $.writeDisposition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobConfigurationTableCopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigurationTableCopyArgs $;

        public Builder() {
            $ = new JobConfigurationTableCopyArgs();
        }

        public Builder(JobConfigurationTableCopyArgs defaults) {
            $ = new JobConfigurationTableCopyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createDisposition [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a &#39;notFound&#39; error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
         * 
         * @return builder
         * 
         */
        public Builder createDisposition(@Nullable Output<String> createDisposition) {
            $.createDisposition = createDisposition;
            return this;
        }

        /**
         * @param createDisposition [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a &#39;notFound&#39; error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
         * 
         * @return builder
         * 
         */
        public Builder createDisposition(String createDisposition) {
            return createDisposition(Output.of(createDisposition));
        }

        /**
         * @param destinationEncryptionConfiguration Custom encryption configuration (e.g., Cloud KMS keys).
         * 
         * @return builder
         * 
         */
        public Builder destinationEncryptionConfiguration(@Nullable Output<EncryptionConfigurationArgs> destinationEncryptionConfiguration) {
            $.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }

        /**
         * @param destinationEncryptionConfiguration Custom encryption configuration (e.g., Cloud KMS keys).
         * 
         * @return builder
         * 
         */
        public Builder destinationEncryptionConfiguration(EncryptionConfigurationArgs destinationEncryptionConfiguration) {
            return destinationEncryptionConfiguration(Output.of(destinationEncryptionConfiguration));
        }

        /**
         * @param destinationExpirationTime [Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed.
         * 
         * @return builder
         * 
         */
        public Builder destinationExpirationTime(@Nullable Output<Object> destinationExpirationTime) {
            $.destinationExpirationTime = destinationExpirationTime;
            return this;
        }

        /**
         * @param destinationExpirationTime [Optional] The time when the destination table expires. Expired tables will be deleted and their storage reclaimed.
         * 
         * @return builder
         * 
         */
        public Builder destinationExpirationTime(Object destinationExpirationTime) {
            return destinationExpirationTime(Output.of(destinationExpirationTime));
        }

        /**
         * @param destinationTable [Required] The destination table
         * 
         * @return builder
         * 
         */
        public Builder destinationTable(@Nullable Output<TableReferenceArgs> destinationTable) {
            $.destinationTable = destinationTable;
            return this;
        }

        /**
         * @param destinationTable [Required] The destination table
         * 
         * @return builder
         * 
         */
        public Builder destinationTable(TableReferenceArgs destinationTable) {
            return destinationTable(Output.of(destinationTable));
        }

        /**
         * @param operationType [Optional] Supported operation types in table copy job.
         * 
         * @return builder
         * 
         */
        public Builder operationType(@Nullable Output<String> operationType) {
            $.operationType = operationType;
            return this;
        }

        /**
         * @param operationType [Optional] Supported operation types in table copy job.
         * 
         * @return builder
         * 
         */
        public Builder operationType(String operationType) {
            return operationType(Output.of(operationType));
        }

        /**
         * @param sourceTable [Pick one] Source table to copy.
         * 
         * @return builder
         * 
         */
        public Builder sourceTable(@Nullable Output<TableReferenceArgs> sourceTable) {
            $.sourceTable = sourceTable;
            return this;
        }

        /**
         * @param sourceTable [Pick one] Source table to copy.
         * 
         * @return builder
         * 
         */
        public Builder sourceTable(TableReferenceArgs sourceTable) {
            return sourceTable(Output.of(sourceTable));
        }

        /**
         * @param sourceTables [Pick one] Source tables to copy.
         * 
         * @return builder
         * 
         */
        public Builder sourceTables(@Nullable Output<List<TableReferenceArgs>> sourceTables) {
            $.sourceTables = sourceTables;
            return this;
        }

        /**
         * @param sourceTables [Pick one] Source tables to copy.
         * 
         * @return builder
         * 
         */
        public Builder sourceTables(List<TableReferenceArgs> sourceTables) {
            return sourceTables(Output.of(sourceTables));
        }

        /**
         * @param sourceTables [Pick one] Source tables to copy.
         * 
         * @return builder
         * 
         */
        public Builder sourceTables(TableReferenceArgs... sourceTables) {
            return sourceTables(List.of(sourceTables));
        }

        /**
         * @param writeDisposition [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a &#39;duplicate&#39; error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
         * 
         * @return builder
         * 
         */
        public Builder writeDisposition(@Nullable Output<String> writeDisposition) {
            $.writeDisposition = writeDisposition;
            return this;
        }

        /**
         * @param writeDisposition [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a &#39;duplicate&#39; error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
         * 
         * @return builder
         * 
         */
        public Builder writeDisposition(String writeDisposition) {
            return writeDisposition(Output.of(writeDisposition));
        }

        public JobConfigurationTableCopyArgs build() {
            return $;
        }
    }

}
