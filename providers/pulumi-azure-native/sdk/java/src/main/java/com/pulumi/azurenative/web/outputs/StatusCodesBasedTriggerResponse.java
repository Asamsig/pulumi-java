// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatusCodesBasedTriggerResponse {
    /**
     * @return Request Count.
     * 
     */
    private final @Nullable Integer count;
    /**
     * @return Request Path
     * 
     */
    private final @Nullable String path;
    /**
     * @return HTTP status code.
     * 
     */
    private final @Nullable Integer status;
    /**
     * @return Request Sub Status.
     * 
     */
    private final @Nullable Integer subStatus;
    /**
     * @return Time interval.
     * 
     */
    private final @Nullable String timeInterval;
    /**
     * @return Win32 error code.
     * 
     */
    private final @Nullable Integer win32Status;

    @CustomType.Constructor
    private StatusCodesBasedTriggerResponse(
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("status") @Nullable Integer status,
        @CustomType.Parameter("subStatus") @Nullable Integer subStatus,
        @CustomType.Parameter("timeInterval") @Nullable String timeInterval,
        @CustomType.Parameter("win32Status") @Nullable Integer win32Status) {
        this.count = count;
        this.path = path;
        this.status = status;
        this.subStatus = subStatus;
        this.timeInterval = timeInterval;
        this.win32Status = win32Status;
    }

    /**
     * @return Request Count.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return Request Path
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return HTTP status code.
     * 
     */
    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Request Sub Status.
     * 
     */
    public Optional<Integer> subStatus() {
        return Optional.ofNullable(this.subStatus);
    }
    /**
     * @return Time interval.
     * 
     */
    public Optional<String> timeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }
    /**
     * @return Win32 error code.
     * 
     */
    public Optional<Integer> win32Status() {
        return Optional.ofNullable(this.win32Status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCodesBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String path;
        private @Nullable Integer status;
        private @Nullable Integer subStatus;
        private @Nullable String timeInterval;
        private @Nullable Integer win32Status;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCodesBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.status = defaults.status;
    	      this.subStatus = defaults.subStatus;
    	      this.timeInterval = defaults.timeInterval;
    	      this.win32Status = defaults.win32Status;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder status(@Nullable Integer status) {
            this.status = status;
            return this;
        }
        public Builder subStatus(@Nullable Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public Builder timeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Builder win32Status(@Nullable Integer win32Status) {
            this.win32Status = win32Status;
            return this;
        }        public StatusCodesBasedTriggerResponse build() {
            return new StatusCodesBasedTriggerResponse(count, path, status, subStatus, timeInterval, win32Status);
        }
    }
}
