// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceFileResponse {
    /**
     * @return The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified.
     * 
     */
    private final @Nullable String autoStorageContainerName;
    /**
     * @return The property is valid only when autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     * 
     */
    private final @Nullable String blobPrefix;
    /**
     * @return This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a resourceFile which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
     * 
     */
    private final @Nullable String fileMode;
    /**
     * @return If the httpUrl property is specified, the filePath is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or storageContainerUrl property is specified, filePath is optional and is the directory to download the files to. In the case where filePath is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task&#39;s working directory (for example by using &#39;..&#39;).
     * 
     */
    private final @Nullable String filePath;
    /**
     * @return The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    private final @Nullable String httpUrl;
    /**
     * @return The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    private final @Nullable String storageContainerUrl;

    @CustomType.Constructor
    private ResourceFileResponse(
        @CustomType.Parameter("autoStorageContainerName") @Nullable String autoStorageContainerName,
        @CustomType.Parameter("blobPrefix") @Nullable String blobPrefix,
        @CustomType.Parameter("fileMode") @Nullable String fileMode,
        @CustomType.Parameter("filePath") @Nullable String filePath,
        @CustomType.Parameter("httpUrl") @Nullable String httpUrl,
        @CustomType.Parameter("storageContainerUrl") @Nullable String storageContainerUrl) {
        this.autoStorageContainerName = autoStorageContainerName;
        this.blobPrefix = blobPrefix;
        this.fileMode = fileMode;
        this.filePath = filePath;
        this.httpUrl = httpUrl;
        this.storageContainerUrl = storageContainerUrl;
    }

    /**
     * @return The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified.
     * 
     */
    public Optional<String> autoStorageContainerName() {
        return Optional.ofNullable(this.autoStorageContainerName);
    }
    /**
     * @return The property is valid only when autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     * 
     */
    public Optional<String> blobPrefix() {
        return Optional.ofNullable(this.blobPrefix);
    }
    /**
     * @return This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a resourceFile which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
     * 
     */
    public Optional<String> fileMode() {
        return Optional.ofNullable(this.fileMode);
    }
    /**
     * @return If the httpUrl property is specified, the filePath is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or storageContainerUrl property is specified, filePath is optional and is the directory to download the files to. In the case where filePath is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task&#39;s working directory (for example by using &#39;..&#39;).
     * 
     */
    public Optional<String> filePath() {
        return Optional.ofNullable(this.filePath);
    }
    /**
     * @return The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    public Optional<String> httpUrl() {
        return Optional.ofNullable(this.httpUrl);
    }
    /**
     * @return The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    public Optional<String> storageContainerUrl() {
        return Optional.ofNullable(this.storageContainerUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoStorageContainerName;
        private @Nullable String blobPrefix;
        private @Nullable String fileMode;
        private @Nullable String filePath;
        private @Nullable String httpUrl;
        private @Nullable String storageContainerUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoStorageContainerName = defaults.autoStorageContainerName;
    	      this.blobPrefix = defaults.blobPrefix;
    	      this.fileMode = defaults.fileMode;
    	      this.filePath = defaults.filePath;
    	      this.httpUrl = defaults.httpUrl;
    	      this.storageContainerUrl = defaults.storageContainerUrl;
        }

        public Builder autoStorageContainerName(@Nullable String autoStorageContainerName) {
            this.autoStorageContainerName = autoStorageContainerName;
            return this;
        }
        public Builder blobPrefix(@Nullable String blobPrefix) {
            this.blobPrefix = blobPrefix;
            return this;
        }
        public Builder fileMode(@Nullable String fileMode) {
            this.fileMode = fileMode;
            return this;
        }
        public Builder filePath(@Nullable String filePath) {
            this.filePath = filePath;
            return this;
        }
        public Builder httpUrl(@Nullable String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public Builder storageContainerUrl(@Nullable String storageContainerUrl) {
            this.storageContainerUrl = storageContainerUrl;
            return this;
        }        public ResourceFileResponse build() {
            return new ResourceFileResponse(autoStorageContainerName, blobPrefix, fileMode, filePath, httpUrl, storageContainerUrl);
        }
    }
}
