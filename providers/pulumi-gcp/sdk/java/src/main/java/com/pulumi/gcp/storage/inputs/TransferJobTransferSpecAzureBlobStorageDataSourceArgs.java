// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecAzureBlobStorageDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecAzureBlobStorageDataSourceArgs Empty = new TransferJobTransferSpecAzureBlobStorageDataSourceArgs();

    /**
     * Credentials used to authenticate API requests to Azure block.
     * 
     */
    @Import(name="azureCredentials", required=true)
    private Output<TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs> azureCredentials;

    /**
     * @return Credentials used to authenticate API requests to Azure block.
     * 
     */
    public Output<TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs> azureCredentials() {
        return this.azureCredentials;
    }

    /**
     * The container to transfer from the Azure Storage account.`
     * 
     */
    @Import(name="container", required=true)
    private Output<String> container;

    /**
     * @return The container to transfer from the Azure Storage account.`
     * 
     */
    public Output<String> container() {
        return this.container;
    }

    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The name of the Azure Storage account.
     * 
     */
    @Import(name="storageAccount", required=true)
    private Output<String> storageAccount;

    /**
     * @return The name of the Azure Storage account.
     * 
     */
    public Output<String> storageAccount() {
        return this.storageAccount;
    }

    private TransferJobTransferSpecAzureBlobStorageDataSourceArgs() {}

    private TransferJobTransferSpecAzureBlobStorageDataSourceArgs(TransferJobTransferSpecAzureBlobStorageDataSourceArgs $) {
        this.azureCredentials = $.azureCredentials;
        this.container = $.container;
        this.path = $.path;
        this.storageAccount = $.storageAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferJobTransferSpecAzureBlobStorageDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferJobTransferSpecAzureBlobStorageDataSourceArgs $;

        public Builder() {
            $ = new TransferJobTransferSpecAzureBlobStorageDataSourceArgs();
        }

        public Builder(TransferJobTransferSpecAzureBlobStorageDataSourceArgs defaults) {
            $ = new TransferJobTransferSpecAzureBlobStorageDataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureCredentials Credentials used to authenticate API requests to Azure block.
         * 
         * @return builder
         * 
         */
        public Builder azureCredentials(Output<TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs> azureCredentials) {
            $.azureCredentials = azureCredentials;
            return this;
        }

        /**
         * @param azureCredentials Credentials used to authenticate API requests to Azure block.
         * 
         * @return builder
         * 
         */
        public Builder azureCredentials(TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs azureCredentials) {
            return azureCredentials(Output.of(azureCredentials));
        }

        /**
         * @param container The container to transfer from the Azure Storage account.`
         * 
         * @return builder
         * 
         */
        public Builder container(Output<String> container) {
            $.container = container;
            return this;
        }

        /**
         * @param container The container to transfer from the Azure Storage account.`
         * 
         * @return builder
         * 
         */
        public Builder container(String container) {
            return container(Output.of(container));
        }

        /**
         * @param path Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param storageAccount The name of the Azure Storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccount(Output<String> storageAccount) {
            $.storageAccount = storageAccount;
            return this;
        }

        /**
         * @param storageAccount The name of the Azure Storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccount(String storageAccount) {
            return storageAccount(Output.of(storageAccount));
        }

        public TransferJobTransferSpecAzureBlobStorageDataSourceArgs build() {
            $.azureCredentials = Objects.requireNonNull($.azureCredentials, "expected parameter 'azureCredentials' to be non-null");
            $.container = Objects.requireNonNull($.container, "expected parameter 'container' to be non-null");
            $.storageAccount = Objects.requireNonNull($.storageAccount, "expected parameter 'storageAccount' to be non-null");
            return $;
        }
    }

}
