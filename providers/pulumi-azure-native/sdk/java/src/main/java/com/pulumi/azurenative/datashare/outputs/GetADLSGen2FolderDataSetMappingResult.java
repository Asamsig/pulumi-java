// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.outputs;

import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetADLSGen2FolderDataSetMappingResult {
    /**
     * @return The id of the source data set.
     * 
     */
    private final String dataSetId;
    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    private final String dataSetMappingStatus;
    /**
     * @return File system to which the folder belongs.
     * 
     */
    private final String fileSystem;
    /**
     * @return Folder path within the file system.
     * 
     */
    private final String folderPath;
    /**
     * @return The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;AdlsGen2Folder&#39;.
     * 
     */
    private final String kind;
    /**
     * @return Name of the azure resource
     * 
     */
    private final String name;
    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource group of storage account.
     * 
     */
    private final String resourceGroup;
    /**
     * @return Storage account name of the source data set.
     * 
     */
    private final String storageAccountName;
    /**
     * @return Subscription id of storage account.
     * 
     */
    private final String subscriptionId;
    /**
     * @return System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Type of the azure resource
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetADLSGen2FolderDataSetMappingResult(
        @CustomType.Parameter("dataSetId") String dataSetId,
        @CustomType.Parameter("dataSetMappingStatus") String dataSetMappingStatus,
        @CustomType.Parameter("fileSystem") String fileSystem,
        @CustomType.Parameter("folderPath") String folderPath,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGroup") String resourceGroup,
        @CustomType.Parameter("storageAccountName") String storageAccountName,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.dataSetId = dataSetId;
        this.dataSetMappingStatus = dataSetMappingStatus;
        this.fileSystem = fileSystem;
        this.folderPath = folderPath;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceGroup = resourceGroup;
        this.storageAccountName = storageAccountName;
        this.subscriptionId = subscriptionId;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return The id of the source data set.
     * 
     */
    public String dataSetId() {
        return this.dataSetId;
    }
    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    public String dataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * @return File system to which the folder belongs.
     * 
     */
    public String fileSystem() {
        return this.fileSystem;
    }
    /**
     * @return Folder path within the file system.
     * 
     */
    public String folderPath() {
        return this.folderPath;
    }
    /**
     * @return The resource id of the azure resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;AdlsGen2Folder&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the azure resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource group of storage account.
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * @return Storage account name of the source data set.
     * 
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * @return Subscription id of storage account.
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * @return System Data of the Azure resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Type of the azure resource
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetADLSGen2FolderDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String dataSetMappingStatus;
        private String fileSystem;
        private String folderPath;
        private String id;
        private String kind;
        private String name;
        private String provisioningState;
        private String resourceGroup;
        private String storageAccountName;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetADLSGen2FolderDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.fileSystem = defaults.fileSystem;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }
        public Builder dataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }
        public Builder fileSystem(String fileSystem) {
            this.fileSystem = Objects.requireNonNull(fileSystem);
            return this;
        }
        public Builder folderPath(String folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetADLSGen2FolderDataSetMappingResult build() {
            return new GetADLSGen2FolderDataSetMappingResult(dataSetId, dataSetMappingStatus, fileSystem, folderPath, id, kind, name, provisioningState, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
