// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Databricks Delta Lake export command settings.
 * 
 */
public final class AzureDatabricksDeltaLakeExportCommandArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureDatabricksDeltaLakeExportCommandArgs Empty = new AzureDatabricksDeltaLakeExportCommandArgs();

    /**
     * Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="dateFormat")
    private @Nullable Output<Object> dateFormat;

    /**
     * @return Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }

    /**
     * Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="timestampFormat")
    private @Nullable Output<Object> timestampFormat;

    /**
     * @return Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }

    /**
     * The export setting type.
     * Expected value is &#39;AzureDatabricksDeltaLakeExportCommand&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The export setting type.
     * Expected value is &#39;AzureDatabricksDeltaLakeExportCommand&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AzureDatabricksDeltaLakeExportCommandArgs() {}

    private AzureDatabricksDeltaLakeExportCommandArgs(AzureDatabricksDeltaLakeExportCommandArgs $) {
        this.dateFormat = $.dateFormat;
        this.timestampFormat = $.timestampFormat;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureDatabricksDeltaLakeExportCommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureDatabricksDeltaLakeExportCommandArgs $;

        public Builder() {
            $ = new AzureDatabricksDeltaLakeExportCommandArgs();
        }

        public Builder(AzureDatabricksDeltaLakeExportCommandArgs defaults) {
            $ = new AzureDatabricksDeltaLakeExportCommandArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dateFormat Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(@Nullable Output<Object> dateFormat) {
            $.dateFormat = dateFormat;
            return this;
        }

        /**
         * @param dateFormat Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(Object dateFormat) {
            return dateFormat(Output.of(dateFormat));
        }

        /**
         * @param timestampFormat Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(@Nullable Output<Object> timestampFormat) {
            $.timestampFormat = timestampFormat;
            return this;
        }

        /**
         * @param timestampFormat Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(Object timestampFormat) {
            return timestampFormat(Output.of(timestampFormat));
        }

        /**
         * @param type The export setting type.
         * Expected value is &#39;AzureDatabricksDeltaLakeExportCommand&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The export setting type.
         * Expected value is &#39;AzureDatabricksDeltaLakeExportCommand&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureDatabricksDeltaLakeExportCommandArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
