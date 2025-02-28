// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1ExperimentResultResponse {
    /**
     * @return The last time the experiment&#39;s stats data was updated. Will have default value if stats have never been computed for this experiment.
     * 
     */
    private final String lastUpdateTime;
    /**
     * @return Version variants and metrics.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> versionMetrics;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1ExperimentResultResponse(
        @CustomType.Parameter("lastUpdateTime") String lastUpdateTime,
        @CustomType.Parameter("versionMetrics") List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> versionMetrics) {
        this.lastUpdateTime = lastUpdateTime;
        this.versionMetrics = versionMetrics;
    }

    /**
     * @return The last time the experiment&#39;s stats data was updated. Will have default value if stats have never been computed for this experiment.
     * 
     */
    public String lastUpdateTime() {
        return this.lastUpdateTime;
    }
    /**
     * @return Version variants and metrics.
     * 
     */
    public List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> versionMetrics() {
        return this.versionMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ExperimentResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastUpdateTime;
        private List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> versionMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ExperimentResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.versionMetrics = defaults.versionMetrics;
        }

        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = Objects.requireNonNull(lastUpdateTime);
            return this;
        }
        public Builder versionMetrics(List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> versionMetrics) {
            this.versionMetrics = Objects.requireNonNull(versionMetrics);
            return this;
        }
        public Builder versionMetrics(GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse... versionMetrics) {
            return versionMetrics(List.of(versionMetrics));
        }        public GoogleCloudDialogflowCxV3beta1ExperimentResultResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ExperimentResultResponse(lastUpdateTime, versionMetrics);
        }
    }
}
