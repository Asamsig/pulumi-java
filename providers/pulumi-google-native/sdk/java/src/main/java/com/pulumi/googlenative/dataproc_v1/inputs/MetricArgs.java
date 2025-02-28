// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.enums.MetricMetricSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metric source to enable along with any optional metrics for this source that override the dataproc defaults
 * 
 */
public final class MetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricArgs Empty = new MetricArgs();

    /**
     * Optional. Optional Metrics to override the dataproc default metrics configured for the metric source
     * 
     */
    @Import(name="metricOverrides")
    private @Nullable Output<List<String>> metricOverrides;

    /**
     * @return Optional. Optional Metrics to override the dataproc default metrics configured for the metric source
     * 
     */
    public Optional<Output<List<String>>> metricOverrides() {
        return Optional.ofNullable(this.metricOverrides);
    }

    /**
     * MetricSource that should be enabled
     * 
     */
    @Import(name="metricSource", required=true)
    private Output<MetricMetricSource> metricSource;

    /**
     * @return MetricSource that should be enabled
     * 
     */
    public Output<MetricMetricSource> metricSource() {
        return this.metricSource;
    }

    private MetricArgs() {}

    private MetricArgs(MetricArgs $) {
        this.metricOverrides = $.metricOverrides;
        this.metricSource = $.metricSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricArgs $;

        public Builder() {
            $ = new MetricArgs();
        }

        public Builder(MetricArgs defaults) {
            $ = new MetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricOverrides Optional. Optional Metrics to override the dataproc default metrics configured for the metric source
         * 
         * @return builder
         * 
         */
        public Builder metricOverrides(@Nullable Output<List<String>> metricOverrides) {
            $.metricOverrides = metricOverrides;
            return this;
        }

        /**
         * @param metricOverrides Optional. Optional Metrics to override the dataproc default metrics configured for the metric source
         * 
         * @return builder
         * 
         */
        public Builder metricOverrides(List<String> metricOverrides) {
            return metricOverrides(Output.of(metricOverrides));
        }

        /**
         * @param metricOverrides Optional. Optional Metrics to override the dataproc default metrics configured for the metric source
         * 
         * @return builder
         * 
         */
        public Builder metricOverrides(String... metricOverrides) {
            return metricOverrides(List.of(metricOverrides));
        }

        /**
         * @param metricSource MetricSource that should be enabled
         * 
         * @return builder
         * 
         */
        public Builder metricSource(Output<MetricMetricSource> metricSource) {
            $.metricSource = metricSource;
            return this;
        }

        /**
         * @param metricSource MetricSource that should be enabled
         * 
         * @return builder
         * 
         */
        public Builder metricSource(MetricMetricSource metricSource) {
            return metricSource(Output.of(metricSource));
        }

        public MetricArgs build() {
            $.metricSource = Objects.requireNonNull($.metricSource, "expected parameter 'metricSource' to be non-null");
            return $;
        }
    }

}
