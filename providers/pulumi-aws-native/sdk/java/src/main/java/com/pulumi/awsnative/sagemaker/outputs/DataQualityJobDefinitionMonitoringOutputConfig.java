// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionMonitoringOutput;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataQualityJobDefinitionMonitoringOutputConfig {
    /**
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * @return Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * 
     */
    private final List<DataQualityJobDefinitionMonitoringOutput> monitoringOutputs;

    @CustomType.Constructor
    private DataQualityJobDefinitionMonitoringOutputConfig(
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("monitoringOutputs") List<DataQualityJobDefinitionMonitoringOutput> monitoringOutputs) {
        this.kmsKeyId = kmsKeyId;
        this.monitoringOutputs = monitoringOutputs;
    }

    /**
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
     * 
     */
    public List<DataQualityJobDefinitionMonitoringOutput> monitoringOutputs() {
        return this.monitoringOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionMonitoringOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private List<DataQualityJobDefinitionMonitoringOutput> monitoringOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionMonitoringOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.monitoringOutputs = defaults.monitoringOutputs;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder monitoringOutputs(List<DataQualityJobDefinitionMonitoringOutput> monitoringOutputs) {
            this.monitoringOutputs = Objects.requireNonNull(monitoringOutputs);
            return this;
        }
        public Builder monitoringOutputs(DataQualityJobDefinitionMonitoringOutput... monitoringOutputs) {
            return monitoringOutputs(List.of(monitoringOutputs));
        }        public DataQualityJobDefinitionMonitoringOutputConfig build() {
            return new DataQualityJobDefinitionMonitoringOutputConfig(kmsKeyId, monitoringOutputs);
        }
    }
}
