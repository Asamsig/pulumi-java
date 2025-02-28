// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamS3DestinationConfigurationCompressionFormat;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamBufferingHintsArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptionsArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamEncryptionConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamS3DestinationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamS3DestinationConfigurationArgs Empty = new DeliveryStreamS3DestinationConfigurationArgs();

    @Import(name="bucketARN", required=true)
    private Output<String> bucketARN;

    public Output<String> bucketARN() {
        return this.bucketARN;
    }

    @Import(name="bufferingHints")
    private @Nullable Output<DeliveryStreamBufferingHintsArgs> bufferingHints;

    public Optional<Output<DeliveryStreamBufferingHintsArgs>> bufferingHints() {
        return Optional.ofNullable(this.bufferingHints);
    }

    @Import(name="cloudWatchLoggingOptions")
    private @Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;

    public Optional<Output<DeliveryStreamCloudWatchLoggingOptionsArgs>> cloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }

    @Import(name="compressionFormat")
    private @Nullable Output<DeliveryStreamS3DestinationConfigurationCompressionFormat> compressionFormat;

    public Optional<Output<DeliveryStreamS3DestinationConfigurationCompressionFormat>> compressionFormat() {
        return Optional.ofNullable(this.compressionFormat);
    }

    @Import(name="encryptionConfiguration")
    private @Nullable Output<DeliveryStreamEncryptionConfigurationArgs> encryptionConfiguration;

    public Optional<Output<DeliveryStreamEncryptionConfigurationArgs>> encryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }

    @Import(name="errorOutputPrefix")
    private @Nullable Output<String> errorOutputPrefix;

    public Optional<Output<String>> errorOutputPrefix() {
        return Optional.ofNullable(this.errorOutputPrefix);
    }

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    @Import(name="roleARN", required=true)
    private Output<String> roleARN;

    public Output<String> roleARN() {
        return this.roleARN;
    }

    private DeliveryStreamS3DestinationConfigurationArgs() {}

    private DeliveryStreamS3DestinationConfigurationArgs(DeliveryStreamS3DestinationConfigurationArgs $) {
        this.bucketARN = $.bucketARN;
        this.bufferingHints = $.bufferingHints;
        this.cloudWatchLoggingOptions = $.cloudWatchLoggingOptions;
        this.compressionFormat = $.compressionFormat;
        this.encryptionConfiguration = $.encryptionConfiguration;
        this.errorOutputPrefix = $.errorOutputPrefix;
        this.prefix = $.prefix;
        this.roleARN = $.roleARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamS3DestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamS3DestinationConfigurationArgs $;

        public Builder() {
            $ = new DeliveryStreamS3DestinationConfigurationArgs();
        }

        public Builder(DeliveryStreamS3DestinationConfigurationArgs defaults) {
            $ = new DeliveryStreamS3DestinationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketARN(Output<String> bucketARN) {
            $.bucketARN = bucketARN;
            return this;
        }

        public Builder bucketARN(String bucketARN) {
            return bucketARN(Output.of(bucketARN));
        }

        public Builder bufferingHints(@Nullable Output<DeliveryStreamBufferingHintsArgs> bufferingHints) {
            $.bufferingHints = bufferingHints;
            return this;
        }

        public Builder bufferingHints(DeliveryStreamBufferingHintsArgs bufferingHints) {
            return bufferingHints(Output.of(bufferingHints));
        }

        public Builder cloudWatchLoggingOptions(@Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions) {
            $.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder cloudWatchLoggingOptions(DeliveryStreamCloudWatchLoggingOptionsArgs cloudWatchLoggingOptions) {
            return cloudWatchLoggingOptions(Output.of(cloudWatchLoggingOptions));
        }

        public Builder compressionFormat(@Nullable Output<DeliveryStreamS3DestinationConfigurationCompressionFormat> compressionFormat) {
            $.compressionFormat = compressionFormat;
            return this;
        }

        public Builder compressionFormat(DeliveryStreamS3DestinationConfigurationCompressionFormat compressionFormat) {
            return compressionFormat(Output.of(compressionFormat));
        }

        public Builder encryptionConfiguration(@Nullable Output<DeliveryStreamEncryptionConfigurationArgs> encryptionConfiguration) {
            $.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder encryptionConfiguration(DeliveryStreamEncryptionConfigurationArgs encryptionConfiguration) {
            return encryptionConfiguration(Output.of(encryptionConfiguration));
        }

        public Builder errorOutputPrefix(@Nullable Output<String> errorOutputPrefix) {
            $.errorOutputPrefix = errorOutputPrefix;
            return this;
        }

        public Builder errorOutputPrefix(String errorOutputPrefix) {
            return errorOutputPrefix(Output.of(errorOutputPrefix));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder roleARN(Output<String> roleARN) {
            $.roleARN = roleARN;
            return this;
        }

        public Builder roleARN(String roleARN) {
            return roleARN(Output.of(roleARN));
        }

        public DeliveryStreamS3DestinationConfigurationArgs build() {
            $.bucketARN = Objects.requireNonNull($.bucketARN, "expected parameter 'bucketARN' to be non-null");
            $.roleARN = Objects.requireNonNull($.roleARN, "expected parameter 'roleARN' to be non-null");
            return $;
        }
    }

}
