// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A floating point interval.
 * 
 */
public final class GoogleCloudRetailV2betaIntervalArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaIntervalArgs Empty = new GoogleCloudRetailV2betaIntervalArgs();

    /**
     * Exclusive upper bound.
     * 
     */
    @Import(name="exclusiveMaximum")
    private @Nullable Output<Double> exclusiveMaximum;

    /**
     * @return Exclusive upper bound.
     * 
     */
    public Optional<Output<Double>> exclusiveMaximum() {
        return Optional.ofNullable(this.exclusiveMaximum);
    }

    /**
     * Exclusive lower bound.
     * 
     */
    @Import(name="exclusiveMinimum")
    private @Nullable Output<Double> exclusiveMinimum;

    /**
     * @return Exclusive lower bound.
     * 
     */
    public Optional<Output<Double>> exclusiveMinimum() {
        return Optional.ofNullable(this.exclusiveMinimum);
    }

    /**
     * Inclusive upper bound.
     * 
     */
    @Import(name="maximum")
    private @Nullable Output<Double> maximum;

    /**
     * @return Inclusive upper bound.
     * 
     */
    public Optional<Output<Double>> maximum() {
        return Optional.ofNullable(this.maximum);
    }

    /**
     * Inclusive lower bound.
     * 
     */
    @Import(name="minimum")
    private @Nullable Output<Double> minimum;

    /**
     * @return Inclusive lower bound.
     * 
     */
    public Optional<Output<Double>> minimum() {
        return Optional.ofNullable(this.minimum);
    }

    private GoogleCloudRetailV2betaIntervalArgs() {}

    private GoogleCloudRetailV2betaIntervalArgs(GoogleCloudRetailV2betaIntervalArgs $) {
        this.exclusiveMaximum = $.exclusiveMaximum;
        this.exclusiveMinimum = $.exclusiveMinimum;
        this.maximum = $.maximum;
        this.minimum = $.minimum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaIntervalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaIntervalArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaIntervalArgs();
        }

        public Builder(GoogleCloudRetailV2betaIntervalArgs defaults) {
            $ = new GoogleCloudRetailV2betaIntervalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exclusiveMaximum Exclusive upper bound.
         * 
         * @return builder
         * 
         */
        public Builder exclusiveMaximum(@Nullable Output<Double> exclusiveMaximum) {
            $.exclusiveMaximum = exclusiveMaximum;
            return this;
        }

        /**
         * @param exclusiveMaximum Exclusive upper bound.
         * 
         * @return builder
         * 
         */
        public Builder exclusiveMaximum(Double exclusiveMaximum) {
            return exclusiveMaximum(Output.of(exclusiveMaximum));
        }

        /**
         * @param exclusiveMinimum Exclusive lower bound.
         * 
         * @return builder
         * 
         */
        public Builder exclusiveMinimum(@Nullable Output<Double> exclusiveMinimum) {
            $.exclusiveMinimum = exclusiveMinimum;
            return this;
        }

        /**
         * @param exclusiveMinimum Exclusive lower bound.
         * 
         * @return builder
         * 
         */
        public Builder exclusiveMinimum(Double exclusiveMinimum) {
            return exclusiveMinimum(Output.of(exclusiveMinimum));
        }

        /**
         * @param maximum Inclusive upper bound.
         * 
         * @return builder
         * 
         */
        public Builder maximum(@Nullable Output<Double> maximum) {
            $.maximum = maximum;
            return this;
        }

        /**
         * @param maximum Inclusive upper bound.
         * 
         * @return builder
         * 
         */
        public Builder maximum(Double maximum) {
            return maximum(Output.of(maximum));
        }

        /**
         * @param minimum Inclusive lower bound.
         * 
         * @return builder
         * 
         */
        public Builder minimum(@Nullable Output<Double> minimum) {
            $.minimum = minimum;
            return this;
        }

        /**
         * @param minimum Inclusive lower bound.
         * 
         * @return builder
         * 
         */
        public Builder minimum(Double minimum) {
            return minimum(Output.of(minimum));
        }

        public GoogleCloudRetailV2betaIntervalArgs build() {
            return $;
        }
    }

}
