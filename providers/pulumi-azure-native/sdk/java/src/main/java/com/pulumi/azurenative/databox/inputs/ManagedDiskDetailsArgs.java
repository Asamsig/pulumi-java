// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the managed disks.
 * 
 */
public final class ManagedDiskDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDiskDetailsArgs Empty = new ManagedDiskDetailsArgs();

    /**
     * Account Type of the data to be transferred.
     * Expected value is &#39;ManagedDisk&#39;.
     * 
     */
    @Import(name="dataAccountType", required=true)
    private Output<String> dataAccountType;

    /**
     * @return Account Type of the data to be transferred.
     * Expected value is &#39;ManagedDisk&#39;.
     * 
     */
    public Output<String> dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Resource Group Id of the compute disks.
     * 
     */
    @Import(name="resourceGroupId", required=true)
    private Output<String> resourceGroupId;

    /**
     * @return Resource Group Id of the compute disks.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * Password for all the shares to be created on the device. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    @Import(name="sharePassword")
    private @Nullable Output<String> sharePassword;

    /**
     * @return Password for all the shares to be created on the device. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    public Optional<Output<String>> sharePassword() {
        return Optional.ofNullable(this.sharePassword);
    }

    /**
     * Resource Id of the storage account that can be used to copy the vhd for staging.
     * 
     */
    @Import(name="stagingStorageAccountId", required=true)
    private Output<String> stagingStorageAccountId;

    /**
     * @return Resource Id of the storage account that can be used to copy the vhd for staging.
     * 
     */
    public Output<String> stagingStorageAccountId() {
        return this.stagingStorageAccountId;
    }

    private ManagedDiskDetailsArgs() {}

    private ManagedDiskDetailsArgs(ManagedDiskDetailsArgs $) {
        this.dataAccountType = $.dataAccountType;
        this.resourceGroupId = $.resourceGroupId;
        this.sharePassword = $.sharePassword;
        this.stagingStorageAccountId = $.stagingStorageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDiskDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDiskDetailsArgs $;

        public Builder() {
            $ = new ManagedDiskDetailsArgs();
        }

        public Builder(ManagedDiskDetailsArgs defaults) {
            $ = new ManagedDiskDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataAccountType Account Type of the data to be transferred.
         * Expected value is &#39;ManagedDisk&#39;.
         * 
         * @return builder
         * 
         */
        public Builder dataAccountType(Output<String> dataAccountType) {
            $.dataAccountType = dataAccountType;
            return this;
        }

        /**
         * @param dataAccountType Account Type of the data to be transferred.
         * Expected value is &#39;ManagedDisk&#39;.
         * 
         * @return builder
         * 
         */
        public Builder dataAccountType(String dataAccountType) {
            return dataAccountType(Output.of(dataAccountType));
        }

        /**
         * @param resourceGroupId Resource Group Id of the compute disks.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId Resource Group Id of the compute disks.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param sharePassword Password for all the shares to be created on the device. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
         * 
         * @return builder
         * 
         */
        public Builder sharePassword(@Nullable Output<String> sharePassword) {
            $.sharePassword = sharePassword;
            return this;
        }

        /**
         * @param sharePassword Password for all the shares to be created on the device. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
         * 
         * @return builder
         * 
         */
        public Builder sharePassword(String sharePassword) {
            return sharePassword(Output.of(sharePassword));
        }

        /**
         * @param stagingStorageAccountId Resource Id of the storage account that can be used to copy the vhd for staging.
         * 
         * @return builder
         * 
         */
        public Builder stagingStorageAccountId(Output<String> stagingStorageAccountId) {
            $.stagingStorageAccountId = stagingStorageAccountId;
            return this;
        }

        /**
         * @param stagingStorageAccountId Resource Id of the storage account that can be used to copy the vhd for staging.
         * 
         * @return builder
         * 
         */
        public Builder stagingStorageAccountId(String stagingStorageAccountId) {
            return stagingStorageAccountId(Output.of(stagingStorageAccountId));
        }

        public ManagedDiskDetailsArgs build() {
            $.dataAccountType = Codegen.stringProp("dataAccountType").output().arg($.dataAccountType).def("StorageAccount").require();
            $.resourceGroupId = Objects.requireNonNull($.resourceGroupId, "expected parameter 'resourceGroupId' to be non-null");
            $.stagingStorageAccountId = Objects.requireNonNull($.stagingStorageAccountId, "expected parameter 'stagingStorageAccountId' to be non-null");
            return $;
        }
    }

}
