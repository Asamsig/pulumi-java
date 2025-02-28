// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.azurenative.cognitiveservices.enums.DeploymentScaleType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account deployment model.
 * 
 */
public final class DeploymentScaleSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentScaleSettingsArgs Empty = new DeploymentScaleSettingsArgs();

    /**
     * Deployment capacity.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return Deployment capacity.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Deployment scale type.
     * 
     */
    @Import(name="scaleType")
    private @Nullable Output<Either<String,DeploymentScaleType>> scaleType;

    /**
     * @return Deployment scale type.
     * 
     */
    public Optional<Output<Either<String,DeploymentScaleType>>> scaleType() {
        return Optional.ofNullable(this.scaleType);
    }

    private DeploymentScaleSettingsArgs() {}

    private DeploymentScaleSettingsArgs(DeploymentScaleSettingsArgs $) {
        this.capacity = $.capacity;
        this.scaleType = $.scaleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentScaleSettingsArgs $;

        public Builder() {
            $ = new DeploymentScaleSettingsArgs();
        }

        public Builder(DeploymentScaleSettingsArgs defaults) {
            $ = new DeploymentScaleSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity Deployment capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity Deployment capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param scaleType Deployment scale type.
         * 
         * @return builder
         * 
         */
        public Builder scaleType(@Nullable Output<Either<String,DeploymentScaleType>> scaleType) {
            $.scaleType = scaleType;
            return this;
        }

        /**
         * @param scaleType Deployment scale type.
         * 
         * @return builder
         * 
         */
        public Builder scaleType(Either<String,DeploymentScaleType> scaleType) {
            return scaleType(Output.of(scaleType));
        }

        /**
         * @param scaleType Deployment scale type.
         * 
         * @return builder
         * 
         */
        public Builder scaleType(String scaleType) {
            return scaleType(Either.ofLeft(scaleType));
        }

        /**
         * @param scaleType Deployment scale type.
         * 
         * @return builder
         * 
         */
        public Builder scaleType(DeploymentScaleType scaleType) {
            return scaleType(Either.ofRight(scaleType));
        }

        public DeploymentScaleSettingsArgs build() {
            return $;
        }
    }

}
