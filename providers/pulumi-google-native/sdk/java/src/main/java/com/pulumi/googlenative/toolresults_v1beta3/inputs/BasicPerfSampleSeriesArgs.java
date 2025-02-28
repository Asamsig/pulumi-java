// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults_v1beta3.enums.BasicPerfSampleSeriesPerfMetricType;
import com.pulumi.googlenative.toolresults_v1beta3.enums.BasicPerfSampleSeriesPerfUnit;
import com.pulumi.googlenative.toolresults_v1beta3.enums.BasicPerfSampleSeriesSampleSeriesLabel;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encapsulates the metadata for basic sample series represented by a line chart
 * 
 */
public final class BasicPerfSampleSeriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasicPerfSampleSeriesArgs Empty = new BasicPerfSampleSeriesArgs();

    @Import(name="perfMetricType")
    private @Nullable Output<BasicPerfSampleSeriesPerfMetricType> perfMetricType;

    public Optional<Output<BasicPerfSampleSeriesPerfMetricType>> perfMetricType() {
        return Optional.ofNullable(this.perfMetricType);
    }

    @Import(name="perfUnit")
    private @Nullable Output<BasicPerfSampleSeriesPerfUnit> perfUnit;

    public Optional<Output<BasicPerfSampleSeriesPerfUnit>> perfUnit() {
        return Optional.ofNullable(this.perfUnit);
    }

    @Import(name="sampleSeriesLabel")
    private @Nullable Output<BasicPerfSampleSeriesSampleSeriesLabel> sampleSeriesLabel;

    public Optional<Output<BasicPerfSampleSeriesSampleSeriesLabel>> sampleSeriesLabel() {
        return Optional.ofNullable(this.sampleSeriesLabel);
    }

    private BasicPerfSampleSeriesArgs() {}

    private BasicPerfSampleSeriesArgs(BasicPerfSampleSeriesArgs $) {
        this.perfMetricType = $.perfMetricType;
        this.perfUnit = $.perfUnit;
        this.sampleSeriesLabel = $.sampleSeriesLabel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicPerfSampleSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicPerfSampleSeriesArgs $;

        public Builder() {
            $ = new BasicPerfSampleSeriesArgs();
        }

        public Builder(BasicPerfSampleSeriesArgs defaults) {
            $ = new BasicPerfSampleSeriesArgs(Objects.requireNonNull(defaults));
        }

        public Builder perfMetricType(@Nullable Output<BasicPerfSampleSeriesPerfMetricType> perfMetricType) {
            $.perfMetricType = perfMetricType;
            return this;
        }

        public Builder perfMetricType(BasicPerfSampleSeriesPerfMetricType perfMetricType) {
            return perfMetricType(Output.of(perfMetricType));
        }

        public Builder perfUnit(@Nullable Output<BasicPerfSampleSeriesPerfUnit> perfUnit) {
            $.perfUnit = perfUnit;
            return this;
        }

        public Builder perfUnit(BasicPerfSampleSeriesPerfUnit perfUnit) {
            return perfUnit(Output.of(perfUnit));
        }

        public Builder sampleSeriesLabel(@Nullable Output<BasicPerfSampleSeriesSampleSeriesLabel> sampleSeriesLabel) {
            $.sampleSeriesLabel = sampleSeriesLabel;
            return this;
        }

        public Builder sampleSeriesLabel(BasicPerfSampleSeriesSampleSeriesLabel sampleSeriesLabel) {
            return sampleSeriesLabel(Output.of(sampleSeriesLabel));
        }

        public BasicPerfSampleSeriesArgs build() {
            return $;
        }
    }

}
