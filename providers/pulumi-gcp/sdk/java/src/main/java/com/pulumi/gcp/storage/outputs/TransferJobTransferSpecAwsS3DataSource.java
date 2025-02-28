// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.storage.outputs.TransferJobTransferSpecAwsS3DataSourceAwsAccessKey;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransferJobTransferSpecAwsS3DataSource {
    /**
     * @return AWS credentials block.
     * 
     */
    private final @Nullable TransferJobTransferSpecAwsS3DataSourceAwsAccessKey awsAccessKey;
    /**
     * @return S3 Bucket name.
     * 
     */
    private final String bucketName;
    /**
     * @return The Amazon Resource Name (ARN) of the role to support temporary credentials via &#39;AssumeRoleWithWebIdentity&#39;. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a &#39;AssumeRoleWithWebIdentity&#39; call for the provided role using the [GoogleServiceAccount][] for this project.
     * 
     */
    private final @Nullable String roleArn;

    @CustomType.Constructor
    private TransferJobTransferSpecAwsS3DataSource(
        @CustomType.Parameter("awsAccessKey") @Nullable TransferJobTransferSpecAwsS3DataSourceAwsAccessKey awsAccessKey,
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("roleArn") @Nullable String roleArn) {
        this.awsAccessKey = awsAccessKey;
        this.bucketName = bucketName;
        this.roleArn = roleArn;
    }

    /**
     * @return AWS credentials block.
     * 
     */
    public Optional<TransferJobTransferSpecAwsS3DataSourceAwsAccessKey> awsAccessKey() {
        return Optional.ofNullable(this.awsAccessKey);
    }
    /**
     * @return S3 Bucket name.
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the role to support temporary credentials via &#39;AssumeRoleWithWebIdentity&#39;. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a &#39;AssumeRoleWithWebIdentity&#39; call for the provided role using the [GoogleServiceAccount][] for this project.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecAwsS3DataSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TransferJobTransferSpecAwsS3DataSourceAwsAccessKey awsAccessKey;
        private String bucketName;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecAwsS3DataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccessKey = defaults.awsAccessKey;
    	      this.bucketName = defaults.bucketName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder awsAccessKey(@Nullable TransferJobTransferSpecAwsS3DataSourceAwsAccessKey awsAccessKey) {
            this.awsAccessKey = awsAccessKey;
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }        public TransferJobTransferSpecAwsS3DataSource build() {
            return new TransferJobTransferSpecAwsS3DataSource(awsAccessKey, bucketName, roleArn);
        }
    }
}
