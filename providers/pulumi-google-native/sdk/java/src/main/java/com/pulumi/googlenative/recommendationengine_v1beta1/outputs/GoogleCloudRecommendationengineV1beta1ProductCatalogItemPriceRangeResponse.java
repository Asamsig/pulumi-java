// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse {
    /**
     * @return The maximum product price.
     * 
     */
    private final Double max;
    /**
     * @return The minimum product price.
     * 
     */
    private final Double min;

    @CustomType.Constructor
    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse(
        @CustomType.Parameter("max") Double max,
        @CustomType.Parameter("min") Double min) {
        this.max = max;
        this.min = min;
    }

    /**
     * @return The maximum product price.
     * 
     */
    public Double max() {
        return this.max;
    }
    /**
     * @return The minimum product price.
     * 
     */
    public Double min() {
        return this.min;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double max;
        private Double min;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(Double max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }
        public Builder min(Double min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse build() {
            return new GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse(max, min);
        }
    }
}
