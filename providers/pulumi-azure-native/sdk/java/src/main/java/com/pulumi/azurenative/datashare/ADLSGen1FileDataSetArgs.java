// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ADLSGen1FileDataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ADLSGen1FileDataSetArgs Empty = new ADLSGen1FileDataSetArgs();

    /**
     * The ADLS account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The ADLS account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName")
    private @Nullable Output<String> dataSetName;

    /**
     * @return The name of the dataSet.
     * 
     */
    public Optional<Output<String>> dataSetName() {
        return Optional.ofNullable(this.dataSetName);
    }

    /**
     * The file name in the ADLS account.
     * 
     */
    @Import(name="fileName", required=true)
    private Output<String> fileName;

    /**
     * @return The file name in the ADLS account.
     * 
     */
    public Output<String> fileName() {
        return this.fileName;
    }

    /**
     * The folder path within the ADLS account.
     * 
     */
    @Import(name="folderPath", required=true)
    private Output<String> folderPath;

    /**
     * @return The folder path within the ADLS account.
     * 
     */
    public Output<String> folderPath() {
        return this.folderPath;
    }

    /**
     * Kind of data set.
     * Expected value is &#39;AdlsGen1File&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is &#39;AdlsGen1File&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource group of ADLS account.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private Output<String> resourceGroup;

    /**
     * @return Resource group of ADLS account.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share to add the data set to.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    /**
     * @return The name of the share to add the data set to.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     * Subscription id of ADLS account.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of ADLS account.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private ADLSGen1FileDataSetArgs() {}

    private ADLSGen1FileDataSetArgs(ADLSGen1FileDataSetArgs $) {
        this.accountName = $.accountName;
        this.dataSetName = $.dataSetName;
        this.fileName = $.fileName;
        this.folderPath = $.folderPath;
        this.kind = $.kind;
        this.resourceGroup = $.resourceGroup;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ADLSGen1FileDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ADLSGen1FileDataSetArgs $;

        public Builder() {
            $ = new ADLSGen1FileDataSetArgs();
        }

        public Builder(ADLSGen1FileDataSetArgs defaults) {
            $ = new ADLSGen1FileDataSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The ADLS account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The ADLS account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param dataSetName The name of the dataSet.
         * 
         * @return builder
         * 
         */
        public Builder dataSetName(@Nullable Output<String> dataSetName) {
            $.dataSetName = dataSetName;
            return this;
        }

        /**
         * @param dataSetName The name of the dataSet.
         * 
         * @return builder
         * 
         */
        public Builder dataSetName(String dataSetName) {
            return dataSetName(Output.of(dataSetName));
        }

        /**
         * @param fileName The file name in the ADLS account.
         * 
         * @return builder
         * 
         */
        public Builder fileName(Output<String> fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param fileName The file name in the ADLS account.
         * 
         * @return builder
         * 
         */
        public Builder fileName(String fileName) {
            return fileName(Output.of(fileName));
        }

        /**
         * @param folderPath The folder path within the ADLS account.
         * 
         * @return builder
         * 
         */
        public Builder folderPath(Output<String> folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        /**
         * @param folderPath The folder path within the ADLS account.
         * 
         * @return builder
         * 
         */
        public Builder folderPath(String folderPath) {
            return folderPath(Output.of(folderPath));
        }

        /**
         * @param kind Kind of data set.
         * Expected value is &#39;AdlsGen1File&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of data set.
         * Expected value is &#39;AdlsGen1File&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param resourceGroup Resource group of ADLS account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup Resource group of ADLS account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shareName The name of the share to add the data set to.
         * 
         * @return builder
         * 
         */
        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName The name of the share to add the data set to.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        /**
         * @param subscriptionId Subscription id of ADLS account.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subscription id of ADLS account.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public ADLSGen1FileDataSetArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.fileName = Objects.requireNonNull($.fileName, "expected parameter 'fileName' to be non-null");
            $.folderPath = Objects.requireNonNull($.folderPath, "expected parameter 'folderPath' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
