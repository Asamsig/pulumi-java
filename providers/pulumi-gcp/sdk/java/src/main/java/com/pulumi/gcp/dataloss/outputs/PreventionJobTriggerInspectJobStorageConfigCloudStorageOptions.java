// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions {
    /**
     * @return Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value
     * then the rest of the bytes are omitted.
     * 
     */
    private final @Nullable Integer bytesLimitPerFile;
    /**
     * @return Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    private final @Nullable Integer bytesLimitPerFilePercent;
    /**
     * @return Set of files to scan.
     * Structure is documented below.
     * 
     */
    private final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet fileSet;
    /**
     * @return List of file type groups to include in the scan. If empty, all files are scanned and available data
     * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
     * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
     * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
     * 
     */
    private final @Nullable List<String> fileTypes;
    /**
     * @return Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    private final @Nullable Integer filesLimitPercent;
    /**
     * @return How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
     * If not specified, scanning would start from the top.
     * Possible values are `TOP` and `RANDOM_START`.
     * 
     */
    private final @Nullable String sampleMethod;

    @CustomType.Constructor
    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions(
        @CustomType.Parameter("bytesLimitPerFile") @Nullable Integer bytesLimitPerFile,
        @CustomType.Parameter("bytesLimitPerFilePercent") @Nullable Integer bytesLimitPerFilePercent,
        @CustomType.Parameter("fileSet") PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet fileSet,
        @CustomType.Parameter("fileTypes") @Nullable List<String> fileTypes,
        @CustomType.Parameter("filesLimitPercent") @Nullable Integer filesLimitPercent,
        @CustomType.Parameter("sampleMethod") @Nullable String sampleMethod) {
        this.bytesLimitPerFile = bytesLimitPerFile;
        this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
        this.fileSet = fileSet;
        this.fileTypes = fileTypes;
        this.filesLimitPercent = filesLimitPercent;
        this.sampleMethod = sampleMethod;
    }

    /**
     * @return Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value
     * then the rest of the bytes are omitted.
     * 
     */
    public Optional<Integer> bytesLimitPerFile() {
        return Optional.ofNullable(this.bytesLimitPerFile);
    }
    /**
     * @return Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    public Optional<Integer> bytesLimitPerFilePercent() {
        return Optional.ofNullable(this.bytesLimitPerFilePercent);
    }
    /**
     * @return Set of files to scan.
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet fileSet() {
        return this.fileSet;
    }
    /**
     * @return List of file type groups to include in the scan. If empty, all files are scanned and available data
     * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
     * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
     * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
     * 
     */
    public List<String> fileTypes() {
        return this.fileTypes == null ? List.of() : this.fileTypes;
    }
    /**
     * @return Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    public Optional<Integer> filesLimitPercent() {
        return Optional.ofNullable(this.filesLimitPercent);
    }
    /**
     * @return How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
     * If not specified, scanning would start from the top.
     * Possible values are `TOP` and `RANDOM_START`.
     * 
     */
    public Optional<String> sampleMethod() {
        return Optional.ofNullable(this.sampleMethod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bytesLimitPerFile;
        private @Nullable Integer bytesLimitPerFilePercent;
        private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet fileSet;
        private @Nullable List<String> fileTypes;
        private @Nullable Integer filesLimitPercent;
        private @Nullable String sampleMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesLimitPerFile = defaults.bytesLimitPerFile;
    	      this.bytesLimitPerFilePercent = defaults.bytesLimitPerFilePercent;
    	      this.fileSet = defaults.fileSet;
    	      this.fileTypes = defaults.fileTypes;
    	      this.filesLimitPercent = defaults.filesLimitPercent;
    	      this.sampleMethod = defaults.sampleMethod;
        }

        public Builder bytesLimitPerFile(@Nullable Integer bytesLimitPerFile) {
            this.bytesLimitPerFile = bytesLimitPerFile;
            return this;
        }
        public Builder bytesLimitPerFilePercent(@Nullable Integer bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
            return this;
        }
        public Builder fileSet(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet fileSet) {
            this.fileSet = Objects.requireNonNull(fileSet);
            return this;
        }
        public Builder fileTypes(@Nullable List<String> fileTypes) {
            this.fileTypes = fileTypes;
            return this;
        }
        public Builder fileTypes(String... fileTypes) {
            return fileTypes(List.of(fileTypes));
        }
        public Builder filesLimitPercent(@Nullable Integer filesLimitPercent) {
            this.filesLimitPercent = filesLimitPercent;
            return this;
        }
        public Builder sampleMethod(@Nullable String sampleMethod) {
            this.sampleMethod = sampleMethod;
            return this;
        }        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions build() {
            return new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions(bytesLimitPerFile, bytesLimitPerFilePercent, fileSet, fileTypes, filesLimitPercent, sampleMethod);
        }
    }
}
