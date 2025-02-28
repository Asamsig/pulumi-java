// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.CMKIdentityDefinitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of CMK for the factory.
 * 
 */
public final class EncryptionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigurationArgs Empty = new EncryptionConfigurationArgs();

    /**
     * User assigned identity to use to authenticate to customer&#39;s key vault. If not provided Managed Service Identity will be used.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<CMKIdentityDefinitionArgs> identity;

    /**
     * @return User assigned identity to use to authenticate to customer&#39;s key vault. If not provided Managed Service Identity will be used.
     * 
     */
    public Optional<Output<CMKIdentityDefinitionArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The name of the key in Azure Key Vault to use as Customer Managed Key.
     * 
     */
    @Import(name="keyName", required=true)
    private Output<String> keyName;

    /**
     * @return The name of the key in Azure Key Vault to use as Customer Managed Key.
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
    }

    /**
     * The version of the key used for CMK. If not provided, latest version will be used.
     * 
     */
    @Import(name="keyVersion")
    private @Nullable Output<String> keyVersion;

    /**
     * @return The version of the key used for CMK. If not provided, latest version will be used.
     * 
     */
    public Optional<Output<String>> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    /**
     * The url of the Azure Key Vault used for CMK.
     * 
     */
    @Import(name="vaultBaseUrl", required=true)
    private Output<String> vaultBaseUrl;

    /**
     * @return The url of the Azure Key Vault used for CMK.
     * 
     */
    public Output<String> vaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    private EncryptionConfigurationArgs() {}

    private EncryptionConfigurationArgs(EncryptionConfigurationArgs $) {
        this.identity = $.identity;
        this.keyName = $.keyName;
        this.keyVersion = $.keyVersion;
        this.vaultBaseUrl = $.vaultBaseUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionConfigurationArgs $;

        public Builder() {
            $ = new EncryptionConfigurationArgs();
        }

        public Builder(EncryptionConfigurationArgs defaults) {
            $ = new EncryptionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identity User assigned identity to use to authenticate to customer&#39;s key vault. If not provided Managed Service Identity will be used.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<CMKIdentityDefinitionArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity User assigned identity to use to authenticate to customer&#39;s key vault. If not provided Managed Service Identity will be used.
         * 
         * @return builder
         * 
         */
        public Builder identity(CMKIdentityDefinitionArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param keyName The name of the key in Azure Key Vault to use as Customer Managed Key.
         * 
         * @return builder
         * 
         */
        public Builder keyName(Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName The name of the key in Azure Key Vault to use as Customer Managed Key.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        /**
         * @param keyVersion The version of the key used for CMK. If not provided, latest version will be used.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        /**
         * @param keyVersion The version of the key used for CMK. If not provided, latest version will be used.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(String keyVersion) {
            return keyVersion(Output.of(keyVersion));
        }

        /**
         * @param vaultBaseUrl The url of the Azure Key Vault used for CMK.
         * 
         * @return builder
         * 
         */
        public Builder vaultBaseUrl(Output<String> vaultBaseUrl) {
            $.vaultBaseUrl = vaultBaseUrl;
            return this;
        }

        /**
         * @param vaultBaseUrl The url of the Azure Key Vault used for CMK.
         * 
         * @return builder
         * 
         */
        public Builder vaultBaseUrl(String vaultBaseUrl) {
            return vaultBaseUrl(Output.of(vaultBaseUrl));
        }

        public EncryptionConfigurationArgs build() {
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            $.vaultBaseUrl = Objects.requireNonNull($.vaultBaseUrl, "expected parameter 'vaultBaseUrl' to be non-null");
            return $;
        }
    }

}
