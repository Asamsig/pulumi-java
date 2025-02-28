// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.outputs;

import com.pulumi.awsnative.iotanalytics.outputs.DatasetContentVersionValue;
import com.pulumi.awsnative.iotanalytics.outputs.DatasetOutputFileUriValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetVariable {
    private final @Nullable DatasetContentVersionValue datasetContentVersionValue;
    private final @Nullable Double doubleValue;
    private final @Nullable DatasetOutputFileUriValue outputFileUriValue;
    private final @Nullable String stringValue;
    private final String variableName;

    @CustomType.Constructor
    private DatasetVariable(
        @CustomType.Parameter("datasetContentVersionValue") @Nullable DatasetContentVersionValue datasetContentVersionValue,
        @CustomType.Parameter("doubleValue") @Nullable Double doubleValue,
        @CustomType.Parameter("outputFileUriValue") @Nullable DatasetOutputFileUriValue outputFileUriValue,
        @CustomType.Parameter("stringValue") @Nullable String stringValue,
        @CustomType.Parameter("variableName") String variableName) {
        this.datasetContentVersionValue = datasetContentVersionValue;
        this.doubleValue = doubleValue;
        this.outputFileUriValue = outputFileUriValue;
        this.stringValue = stringValue;
        this.variableName = variableName;
    }

    public Optional<DatasetContentVersionValue> datasetContentVersionValue() {
        return Optional.ofNullable(this.datasetContentVersionValue);
    }
    public Optional<Double> doubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }
    public Optional<DatasetOutputFileUriValue> outputFileUriValue() {
        return Optional.ofNullable(this.outputFileUriValue);
    }
    public Optional<String> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }
    public String variableName() {
        return this.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetContentVersionValue datasetContentVersionValue;
        private @Nullable Double doubleValue;
        private @Nullable DatasetOutputFileUriValue outputFileUriValue;
        private @Nullable String stringValue;
        private String variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetContentVersionValue = defaults.datasetContentVersionValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.outputFileUriValue = defaults.outputFileUriValue;
    	      this.stringValue = defaults.stringValue;
    	      this.variableName = defaults.variableName;
        }

        public Builder datasetContentVersionValue(@Nullable DatasetContentVersionValue datasetContentVersionValue) {
            this.datasetContentVersionValue = datasetContentVersionValue;
            return this;
        }
        public Builder doubleValue(@Nullable Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }
        public Builder outputFileUriValue(@Nullable DatasetOutputFileUriValue outputFileUriValue) {
            this.outputFileUriValue = outputFileUriValue;
            return this;
        }
        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public Builder variableName(String variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }        public DatasetVariable build() {
            return new DatasetVariable(datasetContentVersionValue, doubleValue, outputFileUriValue, stringValue, variableName);
        }
    }
}
