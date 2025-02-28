// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureBlobStorageLocationResponse {
    /**
     * @return Specify the container of azure blob. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object container;
    /**
     * @return Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileName;
    /**
     * @return Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object folderPath;
    /**
     * @return Type of dataset storage location.
     * Expected value is &#39;AzureBlobStorageLocation&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureBlobStorageLocationResponse(
        @CustomType.Parameter("container") @Nullable Object container,
        @CustomType.Parameter("fileName") @Nullable Object fileName,
        @CustomType.Parameter("folderPath") @Nullable Object folderPath,
        @CustomType.Parameter("type") String type) {
        this.container = container;
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = type;
    }

    /**
     * @return Specify the container of azure blob. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> container() {
        return Optional.ofNullable(this.container);
    }
    /**
     * @return Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> fileName() {
        return Optional.ofNullable(this.fileName);
    }
    /**
     * @return Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Object> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * @return Type of dataset storage location.
     * Expected value is &#39;AzureBlobStorageLocation&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object container;
        private @Nullable Object fileName;
        private @Nullable Object folderPath;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder container(@Nullable Object container) {
            this.container = container;
            return this;
        }
        public Builder fileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureBlobStorageLocationResponse build() {
            return new AzureBlobStorageLocationResponse(container, fileName, folderPath, type);
        }
    }
}
