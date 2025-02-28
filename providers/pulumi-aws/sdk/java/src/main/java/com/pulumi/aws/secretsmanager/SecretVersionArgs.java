// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretVersionArgs Empty = new SecretVersionArgs();

    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    @Import(name="secretBinary")
    private @Nullable Output<String> secretBinary;

    /**
     * @return Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    public Optional<Output<String>> secretBinary() {
        return Optional.ofNullable(this.secretBinary);
    }

    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    @Import(name="secretId", required=true)
    private Output<String> secretId;

    /**
     * @return Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }

    /**
     * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    @Import(name="secretString")
    private @Nullable Output<String> secretString;

    /**
     * @return Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    public Optional<Output<String>> secretString() {
        return Optional.ofNullable(this.secretString);
    }

    /**
     * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     */
    @Import(name="versionStages")
    private @Nullable Output<List<String>> versionStages;

    /**
     * @return Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     */
    public Optional<Output<List<String>>> versionStages() {
        return Optional.ofNullable(this.versionStages);
    }

    private SecretVersionArgs() {}

    private SecretVersionArgs(SecretVersionArgs $) {
        this.secretBinary = $.secretBinary;
        this.secretId = $.secretId;
        this.secretString = $.secretString;
        this.versionStages = $.versionStages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretVersionArgs $;

        public Builder() {
            $ = new SecretVersionArgs();
        }

        public Builder(SecretVersionArgs defaults) {
            $ = new SecretVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretBinary Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
         * 
         * @return builder
         * 
         */
        public Builder secretBinary(@Nullable Output<String> secretBinary) {
            $.secretBinary = secretBinary;
            return this;
        }

        /**
         * @param secretBinary Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
         * 
         * @return builder
         * 
         */
        public Builder secretBinary(String secretBinary) {
            return secretBinary(Output.of(secretBinary));
        }

        /**
         * @param secretId Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
         * 
         * @return builder
         * 
         */
        public Builder secretId(Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        /**
         * @param secretString Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
         * 
         * @return builder
         * 
         */
        public Builder secretString(@Nullable Output<String> secretString) {
            $.secretString = secretString;
            return this;
        }

        /**
         * @param secretString Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
         * 
         * @return builder
         * 
         */
        public Builder secretString(String secretString) {
            return secretString(Output.of(secretString));
        }

        /**
         * @param versionStages Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
         * 
         * @return builder
         * 
         */
        public Builder versionStages(@Nullable Output<List<String>> versionStages) {
            $.versionStages = versionStages;
            return this;
        }

        /**
         * @param versionStages Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
         * 
         * @return builder
         * 
         */
        public Builder versionStages(List<String> versionStages) {
            return versionStages(Output.of(versionStages));
        }

        /**
         * @param versionStages Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
         * 
         * @return builder
         * 
         */
        public Builder versionStages(String... versionStages) {
            return versionStages(List.of(versionStages));
        }

        public SecretVersionArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}
