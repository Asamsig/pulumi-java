// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.outputs;

import com.pulumi.azurenative.storagesync.outputs.ServerEndpointFilesNotSyncingErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServerEndpointSyncSessionStatusResponse {
    /**
     * @return Array of per-item errors coming from the last sync session.
     * 
     */
    private final List<ServerEndpointFilesNotSyncingErrorResponse> filesNotSyncingErrors;
    /**
     * @return Sync mode
     * 
     */
    private final String lastSyncMode;
    /**
     * @return Last sync per item error count.
     * 
     */
    private final Double lastSyncPerItemErrorCount;
    /**
     * @return Last sync result (HResult)
     * 
     */
    private final Integer lastSyncResult;
    /**
     * @return Last sync success timestamp
     * 
     */
    private final String lastSyncSuccessTimestamp;
    /**
     * @return Last sync timestamp
     * 
     */
    private final String lastSyncTimestamp;
    /**
     * @return Count of persistent files not syncing.
     * 
     */
    private final Double persistentFilesNotSyncingCount;
    /**
     * @return Count of transient files not syncing.
     * 
     */
    private final Double transientFilesNotSyncingCount;

    @CustomType.Constructor
    private ServerEndpointSyncSessionStatusResponse(
        @CustomType.Parameter("filesNotSyncingErrors") List<ServerEndpointFilesNotSyncingErrorResponse> filesNotSyncingErrors,
        @CustomType.Parameter("lastSyncMode") String lastSyncMode,
        @CustomType.Parameter("lastSyncPerItemErrorCount") Double lastSyncPerItemErrorCount,
        @CustomType.Parameter("lastSyncResult") Integer lastSyncResult,
        @CustomType.Parameter("lastSyncSuccessTimestamp") String lastSyncSuccessTimestamp,
        @CustomType.Parameter("lastSyncTimestamp") String lastSyncTimestamp,
        @CustomType.Parameter("persistentFilesNotSyncingCount") Double persistentFilesNotSyncingCount,
        @CustomType.Parameter("transientFilesNotSyncingCount") Double transientFilesNotSyncingCount) {
        this.filesNotSyncingErrors = filesNotSyncingErrors;
        this.lastSyncMode = lastSyncMode;
        this.lastSyncPerItemErrorCount = lastSyncPerItemErrorCount;
        this.lastSyncResult = lastSyncResult;
        this.lastSyncSuccessTimestamp = lastSyncSuccessTimestamp;
        this.lastSyncTimestamp = lastSyncTimestamp;
        this.persistentFilesNotSyncingCount = persistentFilesNotSyncingCount;
        this.transientFilesNotSyncingCount = transientFilesNotSyncingCount;
    }

    /**
     * @return Array of per-item errors coming from the last sync session.
     * 
     */
    public List<ServerEndpointFilesNotSyncingErrorResponse> filesNotSyncingErrors() {
        return this.filesNotSyncingErrors;
    }
    /**
     * @return Sync mode
     * 
     */
    public String lastSyncMode() {
        return this.lastSyncMode;
    }
    /**
     * @return Last sync per item error count.
     * 
     */
    public Double lastSyncPerItemErrorCount() {
        return this.lastSyncPerItemErrorCount;
    }
    /**
     * @return Last sync result (HResult)
     * 
     */
    public Integer lastSyncResult() {
        return this.lastSyncResult;
    }
    /**
     * @return Last sync success timestamp
     * 
     */
    public String lastSyncSuccessTimestamp() {
        return this.lastSyncSuccessTimestamp;
    }
    /**
     * @return Last sync timestamp
     * 
     */
    public String lastSyncTimestamp() {
        return this.lastSyncTimestamp;
    }
    /**
     * @return Count of persistent files not syncing.
     * 
     */
    public Double persistentFilesNotSyncingCount() {
        return this.persistentFilesNotSyncingCount;
    }
    /**
     * @return Count of transient files not syncing.
     * 
     */
    public Double transientFilesNotSyncingCount() {
        return this.transientFilesNotSyncingCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointSyncSessionStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ServerEndpointFilesNotSyncingErrorResponse> filesNotSyncingErrors;
        private String lastSyncMode;
        private Double lastSyncPerItemErrorCount;
        private Integer lastSyncResult;
        private String lastSyncSuccessTimestamp;
        private String lastSyncTimestamp;
        private Double persistentFilesNotSyncingCount;
        private Double transientFilesNotSyncingCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointSyncSessionStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesNotSyncingErrors = defaults.filesNotSyncingErrors;
    	      this.lastSyncMode = defaults.lastSyncMode;
    	      this.lastSyncPerItemErrorCount = defaults.lastSyncPerItemErrorCount;
    	      this.lastSyncResult = defaults.lastSyncResult;
    	      this.lastSyncSuccessTimestamp = defaults.lastSyncSuccessTimestamp;
    	      this.lastSyncTimestamp = defaults.lastSyncTimestamp;
    	      this.persistentFilesNotSyncingCount = defaults.persistentFilesNotSyncingCount;
    	      this.transientFilesNotSyncingCount = defaults.transientFilesNotSyncingCount;
        }

        public Builder filesNotSyncingErrors(List<ServerEndpointFilesNotSyncingErrorResponse> filesNotSyncingErrors) {
            this.filesNotSyncingErrors = Objects.requireNonNull(filesNotSyncingErrors);
            return this;
        }
        public Builder filesNotSyncingErrors(ServerEndpointFilesNotSyncingErrorResponse... filesNotSyncingErrors) {
            return filesNotSyncingErrors(List.of(filesNotSyncingErrors));
        }
        public Builder lastSyncMode(String lastSyncMode) {
            this.lastSyncMode = Objects.requireNonNull(lastSyncMode);
            return this;
        }
        public Builder lastSyncPerItemErrorCount(Double lastSyncPerItemErrorCount) {
            this.lastSyncPerItemErrorCount = Objects.requireNonNull(lastSyncPerItemErrorCount);
            return this;
        }
        public Builder lastSyncResult(Integer lastSyncResult) {
            this.lastSyncResult = Objects.requireNonNull(lastSyncResult);
            return this;
        }
        public Builder lastSyncSuccessTimestamp(String lastSyncSuccessTimestamp) {
            this.lastSyncSuccessTimestamp = Objects.requireNonNull(lastSyncSuccessTimestamp);
            return this;
        }
        public Builder lastSyncTimestamp(String lastSyncTimestamp) {
            this.lastSyncTimestamp = Objects.requireNonNull(lastSyncTimestamp);
            return this;
        }
        public Builder persistentFilesNotSyncingCount(Double persistentFilesNotSyncingCount) {
            this.persistentFilesNotSyncingCount = Objects.requireNonNull(persistentFilesNotSyncingCount);
            return this;
        }
        public Builder transientFilesNotSyncingCount(Double transientFilesNotSyncingCount) {
            this.transientFilesNotSyncingCount = Objects.requireNonNull(transientFilesNotSyncingCount);
            return this;
        }        public ServerEndpointSyncSessionStatusResponse build() {
            return new ServerEndpointSyncSessionStatusResponse(filesNotSyncingErrors, lastSyncMode, lastSyncPerItemErrorCount, lastSyncResult, lastSyncSuccessTimestamp, lastSyncTimestamp, persistentFilesNotSyncingCount, transientFilesNotSyncingCount);
        }
    }
}
