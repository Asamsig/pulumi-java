// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3LocationArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import com.pulumi.azurenative.datafactory.inputs.FileServerLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.FtpServerLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.HdfsLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.HttpServerLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.OracleCloudStorageLocationArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SftpLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Excel dataset.
 * 
 */
public final class ExcelDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExcelDatasetArgs Empty = new ExcelDatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the Dataset.
     * 
     */
    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The data compression method used for the json dataset.
     * 
     */
    @Import(name="compression")
    private @Nullable Output<DatasetCompressionArgs> compression;

    /**
     * @return The data compression method used for the json dataset.
     * 
     */
    public Optional<Output<DatasetCompressionArgs>> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Dataset description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="firstRowAsHeader")
    private @Nullable Output<Object> firstRowAsHeader;

    /**
     * @return When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> firstRowAsHeader() {
        return Optional.ofNullable(this.firstRowAsHeader);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<DatasetFolderArgs> folder;

    /**
     * @return The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    public Optional<Output<DatasetFolderArgs>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return Linked service reference.
     * 
     */
    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The location of the excel storage.
     * 
     */
    @Import(name="location", required=true)
    private Output<Object> location;

    /**
     * @return The location of the excel storage.
     * 
     */
    public Output<Object> location() {
        return this.location;
    }

    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="nullValue")
    private @Nullable Output<Object> nullValue;

    /**
     * @return The null value string. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> nullValue() {
        return Optional.ofNullable(this.nullValue);
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    /**
     * @return Parameters for dataset.
     * 
     */
    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The partial data of one sheet. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="range")
    private @Nullable Output<Object> range;

    /**
     * @return The partial data of one sheet. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<Object> schema;

    /**
     * @return Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    public Optional<Output<Object>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * The sheet index of excel file and default value is 0. Type: integer (or Expression with resultType integer)
     * 
     */
    @Import(name="sheetIndex")
    private @Nullable Output<Object> sheetIndex;

    /**
     * @return The sheet index of excel file and default value is 0. Type: integer (or Expression with resultType integer)
     * 
     */
    public Optional<Output<Object>> sheetIndex() {
        return Optional.ofNullable(this.sheetIndex);
    }

    /**
     * The sheet name of excel file. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sheetName")
    private @Nullable Output<Object> sheetName;

    /**
     * @return The sheet name of excel file. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sheetName() {
        return Optional.ofNullable(this.sheetName);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
    private @Nullable Output<Object> structure;

    /**
     * @return Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    public Optional<Output<Object>> structure() {
        return Optional.ofNullable(this.structure);
    }

    /**
     * Type of dataset.
     * Expected value is &#39;Excel&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of dataset.
     * Expected value is &#39;Excel&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ExcelDatasetArgs() {}

    private ExcelDatasetArgs(ExcelDatasetArgs $) {
        this.annotations = $.annotations;
        this.compression = $.compression;
        this.description = $.description;
        this.firstRowAsHeader = $.firstRowAsHeader;
        this.folder = $.folder;
        this.linkedServiceName = $.linkedServiceName;
        this.location = $.location;
        this.nullValue = $.nullValue;
        this.parameters = $.parameters;
        this.range = $.range;
        this.schema = $.schema;
        this.sheetIndex = $.sheetIndex;
        this.sheetName = $.sheetName;
        this.structure = $.structure;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExcelDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExcelDatasetArgs $;

        public Builder() {
            $ = new ExcelDatasetArgs();
        }

        public Builder(ExcelDatasetArgs defaults) {
            $ = new ExcelDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations List of tags that can be used for describing the Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param compression The data compression method used for the json dataset.
         * 
         * @return builder
         * 
         */
        public Builder compression(@Nullable Output<DatasetCompressionArgs> compression) {
            $.compression = compression;
            return this;
        }

        /**
         * @param compression The data compression method used for the json dataset.
         * 
         * @return builder
         * 
         */
        public Builder compression(DatasetCompressionArgs compression) {
            return compression(Output.of(compression));
        }

        /**
         * @param description Dataset description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Dataset description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param firstRowAsHeader When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder firstRowAsHeader(@Nullable Output<Object> firstRowAsHeader) {
            $.firstRowAsHeader = firstRowAsHeader;
            return this;
        }

        /**
         * @param firstRowAsHeader When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder firstRowAsHeader(Object firstRowAsHeader) {
            return firstRowAsHeader(Output.of(firstRowAsHeader));
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<DatasetFolderArgs> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(DatasetFolderArgs folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param location The location of the excel storage.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<Object> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the excel storage.
         * 
         * @return builder
         * 
         */
        public Builder location(Object location) {
            return location(Output.of(location));
        }

        /**
         * @param nullValue The null value string. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder nullValue(@Nullable Output<Object> nullValue) {
            $.nullValue = nullValue;
            return this;
        }

        /**
         * @param nullValue The null value string. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder nullValue(Object nullValue) {
            return nullValue(Output.of(nullValue));
        }

        /**
         * @param parameters Parameters for dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param range The partial data of one sheet. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder range(@Nullable Output<Object> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range The partial data of one sheet. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder range(Object range) {
            return range(Output.of(range));
        }

        /**
         * @param schema Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<Object> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
         * 
         * @return builder
         * 
         */
        public Builder schema(Object schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param sheetIndex The sheet index of excel file and default value is 0. Type: integer (or Expression with resultType integer)
         * 
         * @return builder
         * 
         */
        public Builder sheetIndex(@Nullable Output<Object> sheetIndex) {
            $.sheetIndex = sheetIndex;
            return this;
        }

        /**
         * @param sheetIndex The sheet index of excel file and default value is 0. Type: integer (or Expression with resultType integer)
         * 
         * @return builder
         * 
         */
        public Builder sheetIndex(Object sheetIndex) {
            return sheetIndex(Output.of(sheetIndex));
        }

        /**
         * @param sheetName The sheet name of excel file. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sheetName(@Nullable Output<Object> sheetName) {
            $.sheetName = sheetName;
            return this;
        }

        /**
         * @param sheetName The sheet name of excel file. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sheetName(Object sheetName) {
            return sheetName(Output.of(sheetName));
        }

        /**
         * @param structure Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
         * 
         * @return builder
         * 
         */
        public Builder structure(@Nullable Output<Object> structure) {
            $.structure = structure;
            return this;
        }

        /**
         * @param structure Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
         * 
         * @return builder
         * 
         */
        public Builder structure(Object structure) {
            return structure(Output.of(structure));
        }

        /**
         * @param type Type of dataset.
         * Expected value is &#39;Excel&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of dataset.
         * Expected value is &#39;Excel&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ExcelDatasetArgs build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
