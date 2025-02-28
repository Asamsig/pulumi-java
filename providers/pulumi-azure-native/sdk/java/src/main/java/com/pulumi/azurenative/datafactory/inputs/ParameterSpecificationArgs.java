// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.ParameterType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of a single parameter for an entity.
 * 
 */
public final class ParameterSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParameterSpecificationArgs Empty = new ParameterSpecificationArgs();

    /**
     * Default value of parameter.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<Object> defaultValue;

    /**
     * @return Default value of parameter.
     * 
     */
    public Optional<Output<Object>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Parameter type.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ParameterType>> type;

    /**
     * @return Parameter type.
     * 
     */
    public Output<Either<String,ParameterType>> type() {
        return this.type;
    }

    private ParameterSpecificationArgs() {}

    private ParameterSpecificationArgs(ParameterSpecificationArgs $) {
        this.defaultValue = $.defaultValue;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParameterSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParameterSpecificationArgs $;

        public Builder() {
            $ = new ParameterSpecificationArgs();
        }

        public Builder(ParameterSpecificationArgs defaults) {
            $ = new ParameterSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValue Default value of parameter.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<Object> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue Default value of parameter.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(Object defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        /**
         * @param type Parameter type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,ParameterType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Parameter type.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ParameterType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Parameter type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Parameter type.
         * 
         * @return builder
         * 
         */
        public Builder type(ParameterType type) {
            return type(Either.ofRight(type));
        }

        public ParameterSpecificationArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
