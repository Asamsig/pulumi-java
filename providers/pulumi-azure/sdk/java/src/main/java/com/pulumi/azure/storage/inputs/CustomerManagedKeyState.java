// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerManagedKeyState extends com.pulumi.resources.ResourceArgs {

    public static final CustomerManagedKeyState Empty = new CustomerManagedKeyState();

    /**
     * The name of Key Vault Key.
     * 
     */
    @Import(name="keyName")
    private @Nullable Output<String> keyName;

    /**
     * @return The name of Key Vault Key.
     * 
     */
    public Optional<Output<String>> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    /**
     * The ID of the Key Vault. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="keyVaultId")
    private @Nullable Output<String> keyVaultId;

    /**
     * @return The ID of the Key Vault. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }

    /**
     * The version of Key Vault Key. Remove or omit this argument to enable Automatic Key Rotation.
     * 
     */
    @Import(name="keyVersion")
    private @Nullable Output<String> keyVersion;

    /**
     * @return The version of Key Vault Key. Remove or omit this argument to enable Automatic Key Rotation.
     * 
     */
    public Optional<Output<String>> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    /**
     * The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    /**
     * The ID of a user assigned identity.
     * 
     */
    @Import(name="userAssignedIdentityId")
    private @Nullable Output<String> userAssignedIdentityId;

    /**
     * @return The ID of a user assigned identity.
     * 
     */
    public Optional<Output<String>> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    private CustomerManagedKeyState() {}

    private CustomerManagedKeyState(CustomerManagedKeyState $) {
        this.keyName = $.keyName;
        this.keyVaultId = $.keyVaultId;
        this.keyVersion = $.keyVersion;
        this.storageAccountId = $.storageAccountId;
        this.userAssignedIdentityId = $.userAssignedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerManagedKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerManagedKeyState $;

        public Builder() {
            $ = new CustomerManagedKeyState();
        }

        public Builder(CustomerManagedKeyState defaults) {
            $ = new CustomerManagedKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName The name of Key Vault Key.
         * 
         * @return builder
         * 
         */
        public Builder keyName(@Nullable Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName The name of Key Vault Key.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        /**
         * @param keyVaultId The ID of the Key Vault. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of the Key Vault. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param keyVersion The version of Key Vault Key. Remove or omit this argument to enable Automatic Key Rotation.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        /**
         * @param keyVersion The version of Key Vault Key. Remove or omit this argument to enable Automatic Key Rotation.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(String keyVersion) {
            return keyVersion(Output.of(keyVersion));
        }

        /**
         * @param storageAccountId The ID of the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The ID of the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        /**
         * @param userAssignedIdentityId The ID of a user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(@Nullable Output<String> userAssignedIdentityId) {
            $.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }

        /**
         * @param userAssignedIdentityId The ID of a user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(String userAssignedIdentityId) {
            return userAssignedIdentityId(Output.of(userAssignedIdentityId));
        }

        public CustomerManagedKeyState build() {
            return $;
        }
    }

}
