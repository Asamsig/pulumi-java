// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.AccountAzureFilesAuthenticationActiveDirectoryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountAzureFilesAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountAzureFilesAuthenticationArgs Empty = new AccountAzureFilesAuthenticationArgs();

    /**
     * A `active_directory` block as defined below. Required when `directory_type` is `AD`.
     * 
     */
    @Import(name="activeDirectory")
    private @Nullable Output<AccountAzureFilesAuthenticationActiveDirectoryArgs> activeDirectory;

    /**
     * @return A `active_directory` block as defined below. Required when `directory_type` is `AD`.
     * 
     */
    public Optional<Output<AccountAzureFilesAuthenticationActiveDirectoryArgs>> activeDirectory() {
        return Optional.ofNullable(this.activeDirectory);
    }

    /**
     * Specifies the directory service used. Possible values are `AADDS` and `AD`.
     * 
     */
    @Import(name="directoryType", required=true)
    private Output<String> directoryType;

    /**
     * @return Specifies the directory service used. Possible values are `AADDS` and `AD`.
     * 
     */
    public Output<String> directoryType() {
        return this.directoryType;
    }

    private AccountAzureFilesAuthenticationArgs() {}

    private AccountAzureFilesAuthenticationArgs(AccountAzureFilesAuthenticationArgs $) {
        this.activeDirectory = $.activeDirectory;
        this.directoryType = $.directoryType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountAzureFilesAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountAzureFilesAuthenticationArgs $;

        public Builder() {
            $ = new AccountAzureFilesAuthenticationArgs();
        }

        public Builder(AccountAzureFilesAuthenticationArgs defaults) {
            $ = new AccountAzureFilesAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectory A `active_directory` block as defined below. Required when `directory_type` is `AD`.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(@Nullable Output<AccountAzureFilesAuthenticationActiveDirectoryArgs> activeDirectory) {
            $.activeDirectory = activeDirectory;
            return this;
        }

        /**
         * @param activeDirectory A `active_directory` block as defined below. Required when `directory_type` is `AD`.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(AccountAzureFilesAuthenticationActiveDirectoryArgs activeDirectory) {
            return activeDirectory(Output.of(activeDirectory));
        }

        /**
         * @param directoryType Specifies the directory service used. Possible values are `AADDS` and `AD`.
         * 
         * @return builder
         * 
         */
        public Builder directoryType(Output<String> directoryType) {
            $.directoryType = directoryType;
            return this;
        }

        /**
         * @param directoryType Specifies the directory service used. Possible values are `AADDS` and `AD`.
         * 
         * @return builder
         * 
         */
        public Builder directoryType(String directoryType) {
            return directoryType(Output.of(directoryType));
        }

        public AccountAzureFilesAuthenticationArgs build() {
            $.directoryType = Objects.requireNonNull($.directoryType, "expected parameter 'directoryType' to be non-null");
            return $;
        }
    }

}
