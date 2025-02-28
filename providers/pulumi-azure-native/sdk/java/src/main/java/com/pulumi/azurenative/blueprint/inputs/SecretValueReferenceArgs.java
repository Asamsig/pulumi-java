// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.azurenative.blueprint.inputs.KeyVaultReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reference to a Key Vault secret.
 * 
 */
public final class SecretValueReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretValueReferenceArgs Empty = new SecretValueReferenceArgs();

    /**
     * Specifies the reference to a given Azure Key Vault.
     * 
     */
    @Import(name="keyVault", required=true)
    private Output<KeyVaultReferenceArgs> keyVault;

    /**
     * @return Specifies the reference to a given Azure Key Vault.
     * 
     */
    public Output<KeyVaultReferenceArgs> keyVault() {
        return this.keyVault;
    }

    /**
     * Name of the secret.
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return Name of the secret.
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    /**
     * The version of the secret to use. If left blank, the latest version of the secret is used.
     * 
     */
    @Import(name="secretVersion")
    private @Nullable Output<String> secretVersion;

    /**
     * @return The version of the secret to use. If left blank, the latest version of the secret is used.
     * 
     */
    public Optional<Output<String>> secretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }

    private SecretValueReferenceArgs() {}

    private SecretValueReferenceArgs(SecretValueReferenceArgs $) {
        this.keyVault = $.keyVault;
        this.secretName = $.secretName;
        this.secretVersion = $.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretValueReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretValueReferenceArgs $;

        public Builder() {
            $ = new SecretValueReferenceArgs();
        }

        public Builder(SecretValueReferenceArgs defaults) {
            $ = new SecretValueReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyVault Specifies the reference to a given Azure Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVault(Output<KeyVaultReferenceArgs> keyVault) {
            $.keyVault = keyVault;
            return this;
        }

        /**
         * @param keyVault Specifies the reference to a given Azure Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVault(KeyVaultReferenceArgs keyVault) {
            return keyVault(Output.of(keyVault));
        }

        /**
         * @param secretName Name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName Name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param secretVersion The version of the secret to use. If left blank, the latest version of the secret is used.
         * 
         * @return builder
         * 
         */
        public Builder secretVersion(@Nullable Output<String> secretVersion) {
            $.secretVersion = secretVersion;
            return this;
        }

        /**
         * @param secretVersion The version of the secret to use. If left blank, the latest version of the secret is used.
         * 
         * @return builder
         * 
         */
        public Builder secretVersion(String secretVersion) {
            return secretVersion(Output.of(secretVersion));
        }

        public SecretValueReferenceArgs build() {
            $.keyVault = Objects.requireNonNull($.keyVault, "expected parameter 'keyVault' to be non-null");
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            return $;
        }
    }

}
