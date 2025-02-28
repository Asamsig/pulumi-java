// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamElasticsearchConfiguration {
    /**
     * @return Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
     * 
     */
    private final @Nullable Integer bufferingInterval;
    /**
     * @return Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
     * 
     */
    private final @Nullable Integer bufferingSize;
    /**
     * @return The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    private final @Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * @return The endpoint to use when communicating with the cluster. Conflicts with `domain_arn`.
     * 
     */
    private final @Nullable String clusterEndpoint;
    /**
     * @return The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`. Conflicts with `cluster_endpoint`.
     * 
     */
    private final @Nullable String domainArn;
    /**
     * @return The Elasticsearch index name.
     * 
     */
    private final String indexName;
    /**
     * @return The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
     * 
     */
    private final @Nullable String indexRotationPeriod;
    /**
     * @return The data processing configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration processingConfiguration;
    /**
     * @return After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
     */
    private final @Nullable Integer retryDuration;
    /**
     * @return The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing documents.  The pattern needs to be `arn:.*`.
     * 
     */
    private final String roleArn;
    /**
     * @return Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDocumentsOnly` and `AllDocuments`.  Default value is `FailedDocumentsOnly`.
     * 
     */
    private final @Nullable String s3BackupMode;
    /**
     * @return The Elasticsearch type name with maximum length of 100 characters.
     * 
     */
    private final @Nullable String typeName;
    /**
     * @return The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. More details are given below
     * 
     */
    private final @Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig vpcConfig;

    @CustomType.Constructor
    private FirehoseDeliveryStreamElasticsearchConfiguration(
        @CustomType.Parameter("bufferingInterval") @Nullable Integer bufferingInterval,
        @CustomType.Parameter("bufferingSize") @Nullable Integer bufferingSize,
        @CustomType.Parameter("cloudwatchLoggingOptions") @Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        @CustomType.Parameter("clusterEndpoint") @Nullable String clusterEndpoint,
        @CustomType.Parameter("domainArn") @Nullable String domainArn,
        @CustomType.Parameter("indexName") String indexName,
        @CustomType.Parameter("indexRotationPeriod") @Nullable String indexRotationPeriod,
        @CustomType.Parameter("processingConfiguration") @Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration processingConfiguration,
        @CustomType.Parameter("retryDuration") @Nullable Integer retryDuration,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("s3BackupMode") @Nullable String s3BackupMode,
        @CustomType.Parameter("typeName") @Nullable String typeName,
        @CustomType.Parameter("vpcConfig") @Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig vpcConfig) {
        this.bufferingInterval = bufferingInterval;
        this.bufferingSize = bufferingSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.clusterEndpoint = clusterEndpoint;
        this.domainArn = domainArn;
        this.indexName = indexName;
        this.indexRotationPeriod = indexRotationPeriod;
        this.processingConfiguration = processingConfiguration;
        this.retryDuration = retryDuration;
        this.roleArn = roleArn;
        this.s3BackupMode = s3BackupMode;
        this.typeName = typeName;
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
     * 
     */
    public Optional<Integer> bufferingInterval() {
        return Optional.ofNullable(this.bufferingInterval);
    }
    /**
     * @return Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
     * 
     */
    public Optional<Integer> bufferingSize() {
        return Optional.ofNullable(this.bufferingSize);
    }
    /**
     * @return The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    public Optional<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }
    /**
     * @return The endpoint to use when communicating with the cluster. Conflicts with `domain_arn`.
     * 
     */
    public Optional<String> clusterEndpoint() {
        return Optional.ofNullable(this.clusterEndpoint);
    }
    /**
     * @return The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`. Conflicts with `cluster_endpoint`.
     * 
     */
    public Optional<String> domainArn() {
        return Optional.ofNullable(this.domainArn);
    }
    /**
     * @return The Elasticsearch index name.
     * 
     */
    public String indexName() {
        return this.indexName;
    }
    /**
     * @return The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
     * 
     */
    public Optional<String> indexRotationPeriod() {
        return Optional.ofNullable(this.indexRotationPeriod);
    }
    /**
     * @return The data processing configuration.  More details are given below.
     * 
     */
    public Optional<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration> processingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    /**
     * @return After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
     */
    public Optional<Integer> retryDuration() {
        return Optional.ofNullable(this.retryDuration);
    }
    /**
     * @return The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing documents.  The pattern needs to be `arn:.*`.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDocumentsOnly` and `AllDocuments`.  Default value is `FailedDocumentsOnly`.
     * 
     */
    public Optional<String> s3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }
    /**
     * @return The Elasticsearch type name with maximum length of 100 characters.
     * 
     */
    public Optional<String> typeName() {
        return Optional.ofNullable(this.typeName);
    }
    /**
     * @return The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. More details are given below
     * 
     */
    public Optional<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bufferingInterval;
        private @Nullable Integer bufferingSize;
        private @Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private @Nullable String clusterEndpoint;
        private @Nullable String domainArn;
        private String indexName;
        private @Nullable String indexRotationPeriod;
        private @Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration processingConfiguration;
        private @Nullable Integer retryDuration;
        private String roleArn;
        private @Nullable String s3BackupMode;
        private @Nullable String typeName;
        private @Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bufferingInterval = defaults.bufferingInterval;
    	      this.bufferingSize = defaults.bufferingSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.domainArn = defaults.domainArn;
    	      this.indexName = defaults.indexName;
    	      this.indexRotationPeriod = defaults.indexRotationPeriod;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.typeName = defaults.typeName;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder bufferingInterval(@Nullable Integer bufferingInterval) {
            this.bufferingInterval = bufferingInterval;
            return this;
        }
        public Builder bufferingSize(@Nullable Integer bufferingSize) {
            this.bufferingSize = bufferingSize;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder clusterEndpoint(@Nullable String clusterEndpoint) {
            this.clusterEndpoint = clusterEndpoint;
            return this;
        }
        public Builder domainArn(@Nullable String domainArn) {
            this.domainArn = domainArn;
            return this;
        }
        public Builder indexName(String indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }
        public Builder indexRotationPeriod(@Nullable String indexRotationPeriod) {
            this.indexRotationPeriod = indexRotationPeriod;
            return this;
        }
        public Builder processingConfiguration(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }
        public Builder retryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder s3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }
        public Builder typeName(@Nullable String typeName) {
            this.typeName = typeName;
            return this;
        }
        public Builder vpcConfig(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }        public FirehoseDeliveryStreamElasticsearchConfiguration build() {
            return new FirehoseDeliveryStreamElasticsearchConfiguration(bufferingInterval, bufferingSize, cloudwatchLoggingOptions, clusterEndpoint, domainArn, indexName, indexRotationPeriod, processingConfiguration, retryDuration, roleArn, s3BackupMode, typeName, vpcConfig);
        }
    }
}
