// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is used to express the source of an input schema mapping for a single target field
 * in the Event Grid Event schema. This is currently used in the mappings for the &#39;subject&#39;,
 * &#39;eventtype&#39; and &#39;dataversion&#39; properties. This represents a field in the input event schema
 * along with a default value to be used, and at least one of these two properties should be provided.
 * 
 */
public final class JsonFieldWithDefaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final JsonFieldWithDefaultArgs Empty = new JsonFieldWithDefaultArgs();

    /**
     * The default value to be used for mapping when a SourceField is not provided or if there&#39;s no property with the specified name in the published JSON event payload.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    /**
     * @return The default value to be used for mapping when a SourceField is not provided or if there&#39;s no property with the specified name in the published JSON event payload.
     * 
     */
    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Name of a field in the input event schema that&#39;s to be used as the source of a mapping.
     * 
     */
    @Import(name="sourceField")
    private @Nullable Output<String> sourceField;

    /**
     * @return Name of a field in the input event schema that&#39;s to be used as the source of a mapping.
     * 
     */
    public Optional<Output<String>> sourceField() {
        return Optional.ofNullable(this.sourceField);
    }

    private JsonFieldWithDefaultArgs() {}

    private JsonFieldWithDefaultArgs(JsonFieldWithDefaultArgs $) {
        this.defaultValue = $.defaultValue;
        this.sourceField = $.sourceField;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JsonFieldWithDefaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JsonFieldWithDefaultArgs $;

        public Builder() {
            $ = new JsonFieldWithDefaultArgs();
        }

        public Builder(JsonFieldWithDefaultArgs defaults) {
            $ = new JsonFieldWithDefaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValue The default value to be used for mapping when a SourceField is not provided or if there&#39;s no property with the specified name in the published JSON event payload.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue The default value to be used for mapping when a SourceField is not provided or if there&#39;s no property with the specified name in the published JSON event payload.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        /**
         * @param sourceField Name of a field in the input event schema that&#39;s to be used as the source of a mapping.
         * 
         * @return builder
         * 
         */
        public Builder sourceField(@Nullable Output<String> sourceField) {
            $.sourceField = sourceField;
            return this;
        }

        /**
         * @param sourceField Name of a field in the input event schema that&#39;s to be used as the source of a mapping.
         * 
         * @return builder
         * 
         */
        public Builder sourceField(String sourceField) {
            return sourceField(Output.of(sourceField));
        }

        public JsonFieldWithDefaultArgs build() {
            return $;
        }
    }

}
