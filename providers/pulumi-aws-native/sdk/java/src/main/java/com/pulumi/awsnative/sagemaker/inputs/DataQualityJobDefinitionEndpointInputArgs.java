// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.DataQualityJobDefinitionEndpointInputS3DataDistributionType;
import com.pulumi.awsnative.sagemaker.enums.DataQualityJobDefinitionEndpointInputS3InputMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The endpoint for a monitoring job.
 * 
 */
public final class DataQualityJobDefinitionEndpointInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionEndpointInputArgs Empty = new DataQualityJobDefinitionEndpointInputArgs();

    @Import(name="endpointName", required=true)
    private Output<String> endpointName;

    public Output<String> endpointName() {
        return this.endpointName;
    }

    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    @Import(name="localPath", required=true)
    private Output<String> localPath;

    /**
     * @return Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    public Output<String> localPath() {
        return this.localPath;
    }

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    @Import(name="s3DataDistributionType")
    private @Nullable Output<DataQualityJobDefinitionEndpointInputS3DataDistributionType> s3DataDistributionType;

    /**
     * @return Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    public Optional<Output<DataQualityJobDefinitionEndpointInputS3DataDistributionType>> s3DataDistributionType() {
        return Optional.ofNullable(this.s3DataDistributionType);
    }

    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    @Import(name="s3InputMode")
    private @Nullable Output<DataQualityJobDefinitionEndpointInputS3InputMode> s3InputMode;

    /**
     * @return Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    public Optional<Output<DataQualityJobDefinitionEndpointInputS3InputMode>> s3InputMode() {
        return Optional.ofNullable(this.s3InputMode);
    }

    private DataQualityJobDefinitionEndpointInputArgs() {}

    private DataQualityJobDefinitionEndpointInputArgs(DataQualityJobDefinitionEndpointInputArgs $) {
        this.endpointName = $.endpointName;
        this.localPath = $.localPath;
        this.s3DataDistributionType = $.s3DataDistributionType;
        this.s3InputMode = $.s3InputMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataQualityJobDefinitionEndpointInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityJobDefinitionEndpointInputArgs $;

        public Builder() {
            $ = new DataQualityJobDefinitionEndpointInputArgs();
        }

        public Builder(DataQualityJobDefinitionEndpointInputArgs defaults) {
            $ = new DataQualityJobDefinitionEndpointInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointName(Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param localPath Path to the filesystem where the endpoint data is available to the container.
         * 
         * @return builder
         * 
         */
        public Builder localPath(Output<String> localPath) {
            $.localPath = localPath;
            return this;
        }

        /**
         * @param localPath Path to the filesystem where the endpoint data is available to the container.
         * 
         * @return builder
         * 
         */
        public Builder localPath(String localPath) {
            return localPath(Output.of(localPath));
        }

        /**
         * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
         * 
         * @return builder
         * 
         */
        public Builder s3DataDistributionType(@Nullable Output<DataQualityJobDefinitionEndpointInputS3DataDistributionType> s3DataDistributionType) {
            $.s3DataDistributionType = s3DataDistributionType;
            return this;
        }

        /**
         * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
         * 
         * @return builder
         * 
         */
        public Builder s3DataDistributionType(DataQualityJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType) {
            return s3DataDistributionType(Output.of(s3DataDistributionType));
        }

        /**
         * @param s3InputMode Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
         * 
         * @return builder
         * 
         */
        public Builder s3InputMode(@Nullable Output<DataQualityJobDefinitionEndpointInputS3InputMode> s3InputMode) {
            $.s3InputMode = s3InputMode;
            return this;
        }

        /**
         * @param s3InputMode Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
         * 
         * @return builder
         * 
         */
        public Builder s3InputMode(DataQualityJobDefinitionEndpointInputS3InputMode s3InputMode) {
            return s3InputMode(Output.of(s3InputMode));
        }

        public DataQualityJobDefinitionEndpointInputArgs build() {
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.localPath = Objects.requireNonNull($.localPath, "expected parameter 'localPath' to be non-null");
            return $;
        }
    }

}
