// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod;
import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptionsArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamElasticsearchBufferingHintsArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamElasticsearchRetryOptionsArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfigurationArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfigurationArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamVpcConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamElasticsearchDestinationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamElasticsearchDestinationConfigurationArgs Empty = new DeliveryStreamElasticsearchDestinationConfigurationArgs();

    @Import(name="bufferingHints")
    private @Nullable Output<DeliveryStreamElasticsearchBufferingHintsArgs> bufferingHints;

    public Optional<Output<DeliveryStreamElasticsearchBufferingHintsArgs>> bufferingHints() {
        return Optional.ofNullable(this.bufferingHints);
    }

    @Import(name="cloudWatchLoggingOptions")
    private @Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;

    public Optional<Output<DeliveryStreamCloudWatchLoggingOptionsArgs>> cloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }

    @Import(name="clusterEndpoint")
    private @Nullable Output<String> clusterEndpoint;

    public Optional<Output<String>> clusterEndpoint() {
        return Optional.ofNullable(this.clusterEndpoint);
    }

    @Import(name="domainARN")
    private @Nullable Output<String> domainARN;

    public Optional<Output<String>> domainARN() {
        return Optional.ofNullable(this.domainARN);
    }

    @Import(name="indexName", required=true)
    private Output<String> indexName;

    public Output<String> indexName() {
        return this.indexName;
    }

    @Import(name="indexRotationPeriod")
    private @Nullable Output<DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod> indexRotationPeriod;

    public Optional<Output<DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod>> indexRotationPeriod() {
        return Optional.ofNullable(this.indexRotationPeriod);
    }

    @Import(name="processingConfiguration")
    private @Nullable Output<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;

    public Optional<Output<DeliveryStreamProcessingConfigurationArgs>> processingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }

    @Import(name="retryOptions")
    private @Nullable Output<DeliveryStreamElasticsearchRetryOptionsArgs> retryOptions;

    public Optional<Output<DeliveryStreamElasticsearchRetryOptionsArgs>> retryOptions() {
        return Optional.ofNullable(this.retryOptions);
    }

    @Import(name="roleARN", required=true)
    private Output<String> roleARN;

    public Output<String> roleARN() {
        return this.roleARN;
    }

    @Import(name="s3BackupMode")
    private @Nullable Output<DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode> s3BackupMode;

    public Optional<Output<DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode>> s3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }

    @Import(name="s3Configuration", required=true)
    private Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration;

    public Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration() {
        return this.s3Configuration;
    }

    @Import(name="typeName")
    private @Nullable Output<String> typeName;

    public Optional<Output<String>> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    @Import(name="vpcConfiguration")
    private @Nullable Output<DeliveryStreamVpcConfigurationArgs> vpcConfiguration;

    public Optional<Output<DeliveryStreamVpcConfigurationArgs>> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    private DeliveryStreamElasticsearchDestinationConfigurationArgs() {}

    private DeliveryStreamElasticsearchDestinationConfigurationArgs(DeliveryStreamElasticsearchDestinationConfigurationArgs $) {
        this.bufferingHints = $.bufferingHints;
        this.cloudWatchLoggingOptions = $.cloudWatchLoggingOptions;
        this.clusterEndpoint = $.clusterEndpoint;
        this.domainARN = $.domainARN;
        this.indexName = $.indexName;
        this.indexRotationPeriod = $.indexRotationPeriod;
        this.processingConfiguration = $.processingConfiguration;
        this.retryOptions = $.retryOptions;
        this.roleARN = $.roleARN;
        this.s3BackupMode = $.s3BackupMode;
        this.s3Configuration = $.s3Configuration;
        this.typeName = $.typeName;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamElasticsearchDestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamElasticsearchDestinationConfigurationArgs $;

        public Builder() {
            $ = new DeliveryStreamElasticsearchDestinationConfigurationArgs();
        }

        public Builder(DeliveryStreamElasticsearchDestinationConfigurationArgs defaults) {
            $ = new DeliveryStreamElasticsearchDestinationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bufferingHints(@Nullable Output<DeliveryStreamElasticsearchBufferingHintsArgs> bufferingHints) {
            $.bufferingHints = bufferingHints;
            return this;
        }

        public Builder bufferingHints(DeliveryStreamElasticsearchBufferingHintsArgs bufferingHints) {
            return bufferingHints(Output.of(bufferingHints));
        }

        public Builder cloudWatchLoggingOptions(@Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions) {
            $.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder cloudWatchLoggingOptions(DeliveryStreamCloudWatchLoggingOptionsArgs cloudWatchLoggingOptions) {
            return cloudWatchLoggingOptions(Output.of(cloudWatchLoggingOptions));
        }

        public Builder clusterEndpoint(@Nullable Output<String> clusterEndpoint) {
            $.clusterEndpoint = clusterEndpoint;
            return this;
        }

        public Builder clusterEndpoint(String clusterEndpoint) {
            return clusterEndpoint(Output.of(clusterEndpoint));
        }

        public Builder domainARN(@Nullable Output<String> domainARN) {
            $.domainARN = domainARN;
            return this;
        }

        public Builder domainARN(String domainARN) {
            return domainARN(Output.of(domainARN));
        }

        public Builder indexName(Output<String> indexName) {
            $.indexName = indexName;
            return this;
        }

        public Builder indexName(String indexName) {
            return indexName(Output.of(indexName));
        }

        public Builder indexRotationPeriod(@Nullable Output<DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod> indexRotationPeriod) {
            $.indexRotationPeriod = indexRotationPeriod;
            return this;
        }

        public Builder indexRotationPeriod(DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod indexRotationPeriod) {
            return indexRotationPeriod(Output.of(indexRotationPeriod));
        }

        public Builder processingConfiguration(@Nullable Output<DeliveryStreamProcessingConfigurationArgs> processingConfiguration) {
            $.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder processingConfiguration(DeliveryStreamProcessingConfigurationArgs processingConfiguration) {
            return processingConfiguration(Output.of(processingConfiguration));
        }

        public Builder retryOptions(@Nullable Output<DeliveryStreamElasticsearchRetryOptionsArgs> retryOptions) {
            $.retryOptions = retryOptions;
            return this;
        }

        public Builder retryOptions(DeliveryStreamElasticsearchRetryOptionsArgs retryOptions) {
            return retryOptions(Output.of(retryOptions));
        }

        public Builder roleARN(Output<String> roleARN) {
            $.roleARN = roleARN;
            return this;
        }

        public Builder roleARN(String roleARN) {
            return roleARN(Output.of(roleARN));
        }

        public Builder s3BackupMode(@Nullable Output<DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode> s3BackupMode) {
            $.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder s3BackupMode(DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode s3BackupMode) {
            return s3BackupMode(Output.of(s3BackupMode));
        }

        public Builder s3Configuration(Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration) {
            $.s3Configuration = s3Configuration;
            return this;
        }

        public Builder s3Configuration(DeliveryStreamS3DestinationConfigurationArgs s3Configuration) {
            return s3Configuration(Output.of(s3Configuration));
        }

        public Builder typeName(@Nullable Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        public Builder vpcConfiguration(@Nullable Output<DeliveryStreamVpcConfigurationArgs> vpcConfiguration) {
            $.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder vpcConfiguration(DeliveryStreamVpcConfigurationArgs vpcConfiguration) {
            return vpcConfiguration(Output.of(vpcConfiguration));
        }

        public DeliveryStreamElasticsearchDestinationConfigurationArgs build() {
            $.indexName = Objects.requireNonNull($.indexName, "expected parameter 'indexName' to be non-null");
            $.roleARN = Objects.requireNonNull($.roleARN, "expected parameter 'roleARN' to be non-null");
            $.s3Configuration = Objects.requireNonNull($.s3Configuration, "expected parameter 's3Configuration' to be non-null");
            return $;
        }
    }

}
