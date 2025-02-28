// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.awsnative.iotanalytics.inputs.DatastoreSchemaDefinitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreParquetConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastoreParquetConfigurationArgs Empty = new DatastoreParquetConfigurationArgs();

    @Import(name="schemaDefinition")
    private @Nullable Output<DatastoreSchemaDefinitionArgs> schemaDefinition;

    public Optional<Output<DatastoreSchemaDefinitionArgs>> schemaDefinition() {
        return Optional.ofNullable(this.schemaDefinition);
    }

    private DatastoreParquetConfigurationArgs() {}

    private DatastoreParquetConfigurationArgs(DatastoreParquetConfigurationArgs $) {
        this.schemaDefinition = $.schemaDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastoreParquetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastoreParquetConfigurationArgs $;

        public Builder() {
            $ = new DatastoreParquetConfigurationArgs();
        }

        public Builder(DatastoreParquetConfigurationArgs defaults) {
            $ = new DatastoreParquetConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder schemaDefinition(@Nullable Output<DatastoreSchemaDefinitionArgs> schemaDefinition) {
            $.schemaDefinition = schemaDefinition;
            return this;
        }

        public Builder schemaDefinition(DatastoreSchemaDefinitionArgs schemaDefinition) {
            return schemaDefinition(Output.of(schemaDefinition));
        }

        public DatastoreParquetConfigurationArgs build() {
            return $;
        }
    }

}
