// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.MetastoreConfigArgs;
import com.pulumi.googlenative.dataproc_v1.inputs.SparkHistoryServerConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Auxiliary services configuration for a Cluster.
 * 
 */
public final class AuxiliaryServicesConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuxiliaryServicesConfigArgs Empty = new AuxiliaryServicesConfigArgs();

    /**
     * Optional. The Hive Metastore configuration for this workload.
     * 
     */
    @Import(name="metastoreConfig")
    private @Nullable Output<MetastoreConfigArgs> metastoreConfig;

    /**
     * @return Optional. The Hive Metastore configuration for this workload.
     * 
     */
    public Optional<Output<MetastoreConfigArgs>> metastoreConfig() {
        return Optional.ofNullable(this.metastoreConfig);
    }

    /**
     * Optional. The Spark History Server configuration for the workload.
     * 
     */
    @Import(name="sparkHistoryServerConfig")
    private @Nullable Output<SparkHistoryServerConfigArgs> sparkHistoryServerConfig;

    /**
     * @return Optional. The Spark History Server configuration for the workload.
     * 
     */
    public Optional<Output<SparkHistoryServerConfigArgs>> sparkHistoryServerConfig() {
        return Optional.ofNullable(this.sparkHistoryServerConfig);
    }

    private AuxiliaryServicesConfigArgs() {}

    private AuxiliaryServicesConfigArgs(AuxiliaryServicesConfigArgs $) {
        this.metastoreConfig = $.metastoreConfig;
        this.sparkHistoryServerConfig = $.sparkHistoryServerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuxiliaryServicesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuxiliaryServicesConfigArgs $;

        public Builder() {
            $ = new AuxiliaryServicesConfigArgs();
        }

        public Builder(AuxiliaryServicesConfigArgs defaults) {
            $ = new AuxiliaryServicesConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metastoreConfig Optional. The Hive Metastore configuration for this workload.
         * 
         * @return builder
         * 
         */
        public Builder metastoreConfig(@Nullable Output<MetastoreConfigArgs> metastoreConfig) {
            $.metastoreConfig = metastoreConfig;
            return this;
        }

        /**
         * @param metastoreConfig Optional. The Hive Metastore configuration for this workload.
         * 
         * @return builder
         * 
         */
        public Builder metastoreConfig(MetastoreConfigArgs metastoreConfig) {
            return metastoreConfig(Output.of(metastoreConfig));
        }

        /**
         * @param sparkHistoryServerConfig Optional. The Spark History Server configuration for the workload.
         * 
         * @return builder
         * 
         */
        public Builder sparkHistoryServerConfig(@Nullable Output<SparkHistoryServerConfigArgs> sparkHistoryServerConfig) {
            $.sparkHistoryServerConfig = sparkHistoryServerConfig;
            return this;
        }

        /**
         * @param sparkHistoryServerConfig Optional. The Spark History Server configuration for the workload.
         * 
         * @return builder
         * 
         */
        public Builder sparkHistoryServerConfig(SparkHistoryServerConfigArgs sparkHistoryServerConfig) {
            return sparkHistoryServerConfig(Output.of(sparkHistoryServerConfig));
        }

        public AuxiliaryServicesConfigArgs build() {
            return $;
        }
    }

}
