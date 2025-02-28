// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoredResourceResponse {
    /**
     * @return The ARM id of the resource.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Reason for why the resource is sending logs (or why it is not sending).
     * 
     */
    private final @Nullable String reasonForLogsStatus;
    /**
     * @return Reason for why the resource is sending metrics (or why it is not sending).
     * 
     */
    private final @Nullable String reasonForMetricsStatus;
    /**
     * @return Flag indicating if resource is sending logs to Datadog.
     * 
     */
    private final @Nullable Boolean sendingLogs;
    /**
     * @return Flag indicating if resource is sending metrics to Datadog.
     * 
     */
    private final @Nullable Boolean sendingMetrics;

    @CustomType.Constructor
    private MonitoredResourceResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("reasonForLogsStatus") @Nullable String reasonForLogsStatus,
        @CustomType.Parameter("reasonForMetricsStatus") @Nullable String reasonForMetricsStatus,
        @CustomType.Parameter("sendingLogs") @Nullable Boolean sendingLogs,
        @CustomType.Parameter("sendingMetrics") @Nullable Boolean sendingMetrics) {
        this.id = id;
        this.reasonForLogsStatus = reasonForLogsStatus;
        this.reasonForMetricsStatus = reasonForMetricsStatus;
        this.sendingLogs = sendingLogs;
        this.sendingMetrics = sendingMetrics;
    }

    /**
     * @return The ARM id of the resource.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Reason for why the resource is sending logs (or why it is not sending).
     * 
     */
    public Optional<String> reasonForLogsStatus() {
        return Optional.ofNullable(this.reasonForLogsStatus);
    }
    /**
     * @return Reason for why the resource is sending metrics (or why it is not sending).
     * 
     */
    public Optional<String> reasonForMetricsStatus() {
        return Optional.ofNullable(this.reasonForMetricsStatus);
    }
    /**
     * @return Flag indicating if resource is sending logs to Datadog.
     * 
     */
    public Optional<Boolean> sendingLogs() {
        return Optional.ofNullable(this.sendingLogs);
    }
    /**
     * @return Flag indicating if resource is sending metrics to Datadog.
     * 
     */
    public Optional<Boolean> sendingMetrics() {
        return Optional.ofNullable(this.sendingMetrics);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoredResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String reasonForLogsStatus;
        private @Nullable String reasonForMetricsStatus;
        private @Nullable Boolean sendingLogs;
        private @Nullable Boolean sendingMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoredResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.reasonForLogsStatus = defaults.reasonForLogsStatus;
    	      this.reasonForMetricsStatus = defaults.reasonForMetricsStatus;
    	      this.sendingLogs = defaults.sendingLogs;
    	      this.sendingMetrics = defaults.sendingMetrics;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder reasonForLogsStatus(@Nullable String reasonForLogsStatus) {
            this.reasonForLogsStatus = reasonForLogsStatus;
            return this;
        }
        public Builder reasonForMetricsStatus(@Nullable String reasonForMetricsStatus) {
            this.reasonForMetricsStatus = reasonForMetricsStatus;
            return this;
        }
        public Builder sendingLogs(@Nullable Boolean sendingLogs) {
            this.sendingLogs = sendingLogs;
            return this;
        }
        public Builder sendingMetrics(@Nullable Boolean sendingMetrics) {
            this.sendingMetrics = sendingMetrics;
            return this;
        }        public MonitoredResourceResponse build() {
            return new MonitoredResourceResponse(id, reasonForLogsStatus, reasonForMetricsStatus, sendingLogs, sendingMetrics);
        }
    }
}
