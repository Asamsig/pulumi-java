// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.awsnative.iotanalytics.inputs.DatastoreColumnArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastoreSchemaDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastoreSchemaDefinitionArgs Empty = new DatastoreSchemaDefinitionArgs();

    @Import(name="columns")
    private @Nullable Output<List<DatastoreColumnArgs>> columns;

    public Optional<Output<List<DatastoreColumnArgs>>> columns() {
        return Optional.ofNullable(this.columns);
    }

    private DatastoreSchemaDefinitionArgs() {}

    private DatastoreSchemaDefinitionArgs(DatastoreSchemaDefinitionArgs $) {
        this.columns = $.columns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastoreSchemaDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastoreSchemaDefinitionArgs $;

        public Builder() {
            $ = new DatastoreSchemaDefinitionArgs();
        }

        public Builder(DatastoreSchemaDefinitionArgs defaults) {
            $ = new DatastoreSchemaDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder columns(@Nullable Output<List<DatastoreColumnArgs>> columns) {
            $.columns = columns;
            return this;
        }

        public Builder columns(List<DatastoreColumnArgs> columns) {
            return columns(Output.of(columns));
        }

        public Builder columns(DatastoreColumnArgs... columns) {
            return columns(List.of(columns));
        }

        public DatastoreSchemaDefinitionArgs build() {
            return $;
        }
    }

}
