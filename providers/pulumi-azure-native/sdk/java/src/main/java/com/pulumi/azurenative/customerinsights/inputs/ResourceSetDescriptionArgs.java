// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The resource set description.
 * 
 */
public final class ResourceSetDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceSetDescriptionArgs Empty = new ResourceSetDescriptionArgs();

    /**
     * The elements included in the set.
     * 
     */
    @Import(name="elements")
    private @Nullable Output<List<String>> elements;

    /**
     * @return The elements included in the set.
     * 
     */
    public Optional<Output<List<String>>> elements() {
        return Optional.ofNullable(this.elements);
    }

    /**
     * The elements that are not included in the set, in case elements contains &#39;*&#39; indicating &#39;all&#39;.
     * 
     */
    @Import(name="exceptions")
    private @Nullable Output<List<String>> exceptions;

    /**
     * @return The elements that are not included in the set, in case elements contains &#39;*&#39; indicating &#39;all&#39;.
     * 
     */
    public Optional<Output<List<String>>> exceptions() {
        return Optional.ofNullable(this.exceptions);
    }

    private ResourceSetDescriptionArgs() {}

    private ResourceSetDescriptionArgs(ResourceSetDescriptionArgs $) {
        this.elements = $.elements;
        this.exceptions = $.exceptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSetDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSetDescriptionArgs $;

        public Builder() {
            $ = new ResourceSetDescriptionArgs();
        }

        public Builder(ResourceSetDescriptionArgs defaults) {
            $ = new ResourceSetDescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param elements The elements included in the set.
         * 
         * @return builder
         * 
         */
        public Builder elements(@Nullable Output<List<String>> elements) {
            $.elements = elements;
            return this;
        }

        /**
         * @param elements The elements included in the set.
         * 
         * @return builder
         * 
         */
        public Builder elements(List<String> elements) {
            return elements(Output.of(elements));
        }

        /**
         * @param elements The elements included in the set.
         * 
         * @return builder
         * 
         */
        public Builder elements(String... elements) {
            return elements(List.of(elements));
        }

        /**
         * @param exceptions The elements that are not included in the set, in case elements contains &#39;*&#39; indicating &#39;all&#39;.
         * 
         * @return builder
         * 
         */
        public Builder exceptions(@Nullable Output<List<String>> exceptions) {
            $.exceptions = exceptions;
            return this;
        }

        /**
         * @param exceptions The elements that are not included in the set, in case elements contains &#39;*&#39; indicating &#39;all&#39;.
         * 
         * @return builder
         * 
         */
        public Builder exceptions(List<String> exceptions) {
            return exceptions(Output.of(exceptions));
        }

        /**
         * @param exceptions The elements that are not included in the set, in case elements contains &#39;*&#39; indicating &#39;all&#39;.
         * 
         * @return builder
         * 
         */
        public Builder exceptions(String... exceptions) {
            return exceptions(List.of(exceptions));
        }

        public ResourceSetDescriptionArgs build() {
            return $;
        }
    }

}
