// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamRedshiftDestinationConfigurationS3BackupMode;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptionsArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCopyCommandArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfigurationArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamRedshiftRetryOptionsArgs;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamRedshiftDestinationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamRedshiftDestinationConfigurationArgs Empty = new DeliveryStreamRedshiftDestinationConfigurationArgs();

    @Import(name="cloudWatchLoggingOptions")
    private @Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;

    public Optional<Output<DeliveryStreamCloudWatchLoggingOptionsArgs>> cloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }

    @Import(name="clusterJDBCURL", required=true)
    private Output<String> clusterJDBCURL;

    public Output<String> clusterJDBCURL() {
        return this.clusterJDBCURL;
    }

    @Import(name="copyCommand", required=true)
    private Output<DeliveryStreamCopyCommandArgs> copyCommand;

    public Output<DeliveryStreamCopyCommandArgs> copyCommand() {
        return this.copyCommand;
    }

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    @Import(name="processingConfiguration")
    private @Nullable Output<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;

    public Optional<Output<DeliveryStreamProcessingConfigurationArgs>> processingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }

    @Import(name="retryOptions")
    private @Nullable Output<DeliveryStreamRedshiftRetryOptionsArgs> retryOptions;

    public Optional<Output<DeliveryStreamRedshiftRetryOptionsArgs>> retryOptions() {
        return Optional.ofNullable(this.retryOptions);
    }

    @Import(name="roleARN", required=true)
    private Output<String> roleARN;

    public Output<String> roleARN() {
        return this.roleARN;
    }

    @Import(name="s3BackupConfiguration")
    private @Nullable Output<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration;

    public Optional<Output<DeliveryStreamS3DestinationConfigurationArgs>> s3BackupConfiguration() {
        return Optional.ofNullable(this.s3BackupConfiguration);
    }

    @Import(name="s3BackupMode")
    private @Nullable Output<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode> s3BackupMode;

    public Optional<Output<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode>> s3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }

    @Import(name="s3Configuration", required=true)
    private Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration;

    public Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration() {
        return this.s3Configuration;
    }

    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private DeliveryStreamRedshiftDestinationConfigurationArgs() {}

    private DeliveryStreamRedshiftDestinationConfigurationArgs(DeliveryStreamRedshiftDestinationConfigurationArgs $) {
        this.cloudWatchLoggingOptions = $.cloudWatchLoggingOptions;
        this.clusterJDBCURL = $.clusterJDBCURL;
        this.copyCommand = $.copyCommand;
        this.password = $.password;
        this.processingConfiguration = $.processingConfiguration;
        this.retryOptions = $.retryOptions;
        this.roleARN = $.roleARN;
        this.s3BackupConfiguration = $.s3BackupConfiguration;
        this.s3BackupMode = $.s3BackupMode;
        this.s3Configuration = $.s3Configuration;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamRedshiftDestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamRedshiftDestinationConfigurationArgs $;

        public Builder() {
            $ = new DeliveryStreamRedshiftDestinationConfigurationArgs();
        }

        public Builder(DeliveryStreamRedshiftDestinationConfigurationArgs defaults) {
            $ = new DeliveryStreamRedshiftDestinationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudWatchLoggingOptions(@Nullable Output<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions) {
            $.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder cloudWatchLoggingOptions(DeliveryStreamCloudWatchLoggingOptionsArgs cloudWatchLoggingOptions) {
            return cloudWatchLoggingOptions(Output.of(cloudWatchLoggingOptions));
        }

        public Builder clusterJDBCURL(Output<String> clusterJDBCURL) {
            $.clusterJDBCURL = clusterJDBCURL;
            return this;
        }

        public Builder clusterJDBCURL(String clusterJDBCURL) {
            return clusterJDBCURL(Output.of(clusterJDBCURL));
        }

        public Builder copyCommand(Output<DeliveryStreamCopyCommandArgs> copyCommand) {
            $.copyCommand = copyCommand;
            return this;
        }

        public Builder copyCommand(DeliveryStreamCopyCommandArgs copyCommand) {
            return copyCommand(Output.of(copyCommand));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder processingConfiguration(@Nullable Output<DeliveryStreamProcessingConfigurationArgs> processingConfiguration) {
            $.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder processingConfiguration(DeliveryStreamProcessingConfigurationArgs processingConfiguration) {
            return processingConfiguration(Output.of(processingConfiguration));
        }

        public Builder retryOptions(@Nullable Output<DeliveryStreamRedshiftRetryOptionsArgs> retryOptions) {
            $.retryOptions = retryOptions;
            return this;
        }

        public Builder retryOptions(DeliveryStreamRedshiftRetryOptionsArgs retryOptions) {
            return retryOptions(Output.of(retryOptions));
        }

        public Builder roleARN(Output<String> roleARN) {
            $.roleARN = roleARN;
            return this;
        }

        public Builder roleARN(String roleARN) {
            return roleARN(Output.of(roleARN));
        }

        public Builder s3BackupConfiguration(@Nullable Output<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration) {
            $.s3BackupConfiguration = s3BackupConfiguration;
            return this;
        }

        public Builder s3BackupConfiguration(DeliveryStreamS3DestinationConfigurationArgs s3BackupConfiguration) {
            return s3BackupConfiguration(Output.of(s3BackupConfiguration));
        }

        public Builder s3BackupMode(@Nullable Output<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode> s3BackupMode) {
            $.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder s3BackupMode(DeliveryStreamRedshiftDestinationConfigurationS3BackupMode s3BackupMode) {
            return s3BackupMode(Output.of(s3BackupMode));
        }

        public Builder s3Configuration(Output<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration) {
            $.s3Configuration = s3Configuration;
            return this;
        }

        public Builder s3Configuration(DeliveryStreamS3DestinationConfigurationArgs s3Configuration) {
            return s3Configuration(Output.of(s3Configuration));
        }

        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public DeliveryStreamRedshiftDestinationConfigurationArgs build() {
            $.clusterJDBCURL = Objects.requireNonNull($.clusterJDBCURL, "expected parameter 'clusterJDBCURL' to be non-null");
            $.copyCommand = Objects.requireNonNull($.copyCommand, "expected parameter 'copyCommand' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.roleARN = Objects.requireNonNull($.roleARN, "expected parameter 'roleARN' to be non-null");
            $.s3Configuration = Objects.requireNonNull($.s3Configuration, "expected parameter 's3Configuration' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
