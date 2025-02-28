// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HelmOperatorPropertiesResponse {
    /**
     * @return Values override for the operator Helm chart.
     * 
     */
    private final @Nullable String chartValues;
    /**
     * @return Version of the operator Helm chart.
     * 
     */
    private final @Nullable String chartVersion;

    @CustomType.Constructor
    private HelmOperatorPropertiesResponse(
        @CustomType.Parameter("chartValues") @Nullable String chartValues,
        @CustomType.Parameter("chartVersion") @Nullable String chartVersion) {
        this.chartValues = chartValues;
        this.chartVersion = chartVersion;
    }

    /**
     * @return Values override for the operator Helm chart.
     * 
     */
    public Optional<String> chartValues() {
        return Optional.ofNullable(this.chartValues);
    }
    /**
     * @return Version of the operator Helm chart.
     * 
     */
    public Optional<String> chartVersion() {
        return Optional.ofNullable(this.chartVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HelmOperatorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String chartValues;
        private @Nullable String chartVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(HelmOperatorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chartValues = defaults.chartValues;
    	      this.chartVersion = defaults.chartVersion;
        }

        public Builder chartValues(@Nullable String chartValues) {
            this.chartValues = chartValues;
            return this;
        }
        public Builder chartVersion(@Nullable String chartVersion) {
            this.chartVersion = chartVersion;
            return this;
        }        public HelmOperatorPropertiesResponse build() {
            return new HelmOperatorPropertiesResponse(chartValues, chartVersion);
        }
    }
}
